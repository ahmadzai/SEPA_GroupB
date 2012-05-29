package Controller;


import java.awt.Image;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.swing.ImageIcon;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



import AddressBook.AddressBookFactory;
import AddressBook.AddressBookPackage;
import AddressBook.ContactCollection;
import AddressBook.Person;
import AddressBook.impl.AddressBookPackageImpl;

import GUI.AddEditContactForm;
import GUI.AddressBookMain;
import Helper.ContactDataModel;
import Helper.ContactListModel;
import Helper.FactoryImpl;
import Helper.Printing;


public class MainController {
	private ContactCollection contactCollection;
	private  ContactDataModel contactTableModel;
	private String modelfile = "AddressBook.persons";
	private ContactListModel contactlst;
	
	public MainController() {
		contactCollection = load();
		contactTableModel = new ContactDataModel(contactCollection.getPersons());
	
	}

	private ResourceSet getRecourceSet() {
		// Initialize the model
		AddressBookPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .students extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("persons", new FactoryImpl());

		// Obtain a new resource set
		return new ResourceSetImpl();
	} 
	
	public void save() {
		AddressBookPackageImpl.init();
		AddressBookFactory fact=AddressBookFactory.eINSTANCE;
		ResourceSet resSet = getRecourceSet();
		

		// Create a resource
		Resource resource = resSet.createResource(URI
				.createURI(modelfile));
	
		// add the root node to the resource
		if(resource.getContents().add(contactCollection)) {
			//System.out.println("collection added to the file size; " + contactCollection.getPersons().size());
		}
		else 
			System.out.println("collection doesn't add to the file");

		// Now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ContactCollection load() {
		AddressBookPackageImpl.init();
		ResourceSet resSet = getRecourceSet();

		// Get the resource
		ContactCollection contactCollection = null;
		try {
			Resource resource = resSet.getResource(URI
					.createURI(modelfile), true);
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			contactCollection = (ContactCollection) resource.getContents().get(0);
		} catch (Exception e) {
			contactCollection = AddressBookFactory.eINSTANCE.createContactCollection();
		}
		return contactCollection;
	}

	/**
	 * Create a new student
	 * 
	 * @param name
	 * @param lastName
	 */
	public void createPerson(String firstname, String lastName,String fax,String email,String mobileNr,String aprtNr,String phoneNr,String country,String city,String street,String dateOfBirth,String postalCode,String imgPath,String group,String comments) {
		Person person = AddressBookFactory.eINSTANCE.createPerson();
		person.setFirstName(firstname);
		person.setLastName(lastName);
		person.setApartNr(aprtNr);
		person.setCountry(country);
		person.setCity(city);
		person.setEmail(email);
		person.setPhoneNr(phoneNr);
		person.setFax(fax);
		person.setImage(imgPath);
		person.setGroup(group);
		person.setMobileNr(mobileNr);
		person.setStreet(street);
		person.setDateOfBirth(dateOfBirth);
		person.setComents(comments);
		person.setPostalCode(postalCode);
		contactCollection.getPersons().add(person);
		int index = contactCollection.getPersons().indexOf(person);
		contactTableModel.personAdded(index);
	}

	/**
	 * Edit an existing student
	 * 
	 * @param index
	 * @param name
	 * @param lastName
	 */
	public void editPerson(int index,String firstname, String lastName,String fax,String email,String mobileNr,String aprtNr,String phoneNr,String country,String city,String street,String dateOfBirth,String postalCode,String imgPath,String group,String comments) {
		if(index != -1) {
			Person person = getPerson(index);
			person.setFirstName(firstname);
			person.setLastName(lastName);
			person.setApartNr(aprtNr);
			person.setCountry(country);
			person.setCity(city);
			person.setEmail(email);
			person.setPhoneNr(phoneNr);
			person.setFax(fax);
			person.setImage(imgPath);
			person.setGroup(group);
			person.setMobileNr(mobileNr);
			person.setStreet(street);
			person.setDateOfBirth(dateOfBirth);
			person.setComents(comments);
			person.setPostalCode(postalCode);
			contactTableModel.personChanged(index);
		}
	}

	/**
	 * Delete the person at the specified index
	 * 
	 * @param index
	 */
	public void deletePerson(int index) {
		
		contactCollection.getPersons().remove(index);
		contactTableModel.personDeleted(index);
		
		save();
	}

	/**
	 * Get the student at the given index
	 * 
	 * @param index
	 * @return
	 */
	public Person getPerson(int index) {
		
		
		return contactCollection.getPersons().get(index);
	}
	
	/**
	 * Load all students from the given file
	 * 
	 * @param modelFile
	 */
	public void loadFromFile(String modelFile) {
		this.setModelfile(modelFile);
		contactCollection = load();
		contactTableModel.setPersons(contactCollection.getPersons());
		
	}
	
	/**
	 * @return the modelfile
	 */
	public String getModelfile() {
		return modelfile;
	}

	private void setModelfile(String modelfile) {
		this.modelfile = modelfile;
	}

	/**
	 * Get a Listmodel containing all students
	 * 
	 * @return
	 */
	public ContactDataModel getTableModel() {
		return contactTableModel;
	}
	
	public void editContact(int index){
		if(index>-1){
			String[] args = {"Edit Contact", Integer.toString(index)};
			Person person = null;
			if(contactCollection.getPersons().equals(contactTableModel.getPersonAt(index))) {
				index = contactCollection.getPersons().indexOf(contactTableModel.getPersonAt(index));
				person = contactCollection.getPersons().get(index);
			}
			person = contactTableModel.getPersonAt(index);
			AddEditContactForm form = new AddEditContactForm(this, person, index, "Edit Person");
			form.openNow();
		}
		
	}
	public void createEditPerson(Person person, int ind, String firstname, String lastName,String fax,
			 String email,String mobileNr,String aprtNr,
			 String phoneNr,String country,String city,
			 String street,String dateOfBirth,String postalCode,
			 String imgPath,String group, String comments) {
if(person == null)
{
person = AddressBookFactory.eINSTANCE.createPerson();
//System.out.println("We are here in newClassCreation");
}
person.setFirstName(firstname);
person.setLastName(lastName);
person.setDateOfBirth(dateOfBirth);

person.setMobileNr(mobileNr);
person.setPhoneNr(phoneNr);
person.setFax(fax);
person.setEmail(email);

person.setCountry(country);
person.setCity(city);

person.setStreet(street);
person.setApartNr(aprtNr);
person.setPostalCode(postalCode);

person.setComents(comments);
person.setImage(imgPath);
person.setGroup(group);

if(ind == -1) {
contactCollection.getPersons().add(person);
int index = contactCollection.getPersons().indexOf(person);
//contactTableModel.getRowCount();
contactTableModel.personAdded(index);
//contactTableModel.getRowCount();
}
if(ind != -1) {
//contactCollection.getPersons()
contactTableModel.personChanged(ind);
//System.out.println("We are here in edit saving");
}

}
	public void showDetails(int index){
		Person person=getPerson(index);
		//AddEditContactForm details=new AddEditContactForm(person,-1);
	}
	public void AddContact(){
		AddEditContactForm addForm = new AddEditContactForm(this, "Add Contact");
		addForm.openNow();
	}
	
	
	public void PrintPerson(Person person){
		Printing printpage = new Printing();
		//printpage.print();
		
		// Printing class will initialize here
		printpage.setlblFirstName("First Name:");
		//printpage.setFirstName(txtFirstName.getText());
		printpage.setFirstName(person.getFirstName());
		printpage.setlblLastName("Last Name:");
		//printpage.setLastName(txtLastName.getText());
		printpage.setLastName(person.getLastName());
		printpage.setlblDate("Date Of Birth:");
		printpage.setDate(person.getDateOfBirth());
		printpage.setlblMobileNr("Mobile No:");
		printpage.setMobileNr(person.getMobileNr());
		
		printpage.setlblPhoneNr("Phone No:");
		printpage.setPhoneNr(person.getPhoneNr());
		
		printpage.setlblFaxNr("Fax:");
		printpage.setFaxNr(person.getFax());
		
		printpage.setlblEmailAdd("Email:");
		printpage.setEmailAdd(person.getEmail());
		
		printpage.setlblCountry("Country:");
		printpage.setCountry(person.getCountry());
		
		printpage.setlblCity("City:");
		printpage.setCity(person.getCity());
		
		printpage.setlblStreet("Street:");
		printpage.setStreet(person.getStreet());
		
		printpage.setlblApNr("Apartement NO:");
		printpage.setApNr(person.getApartNr());
		
		printpage.setlblZipCode("Zip Code:");
		printpage.setZipCode(person.getPostalCode());
		
		printpage.setlblGroup("Group:");
		printpage.setGroup(person.getGroup());
		
		printpage.setlblComents("Comments:");
		printpage.setComents(person.getComents());
		Image image = new ImageIcon(person.getImage()).getImage();
		printpage.setImage(image);
		printpage.print();
	}
}

