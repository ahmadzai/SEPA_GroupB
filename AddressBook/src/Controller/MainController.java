package Controller;


import java.io.IOException;
import java.util.Collections;
import java.util.Map;

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


public class MainController {
	private ContactCollection contactCollection;
	private  ContactDataModel contactListModel;
	private String modelfile = "AddressBook.persons";
	private ContactListModel contactlst;
	
	public MainController() {
		contactCollection = load();
		contactListModel = new ContactDataModel(contactCollection.getPersons());
	
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
		contactListModel.personAdded(index);
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
			contactListModel.personChanged(index);
		}
	}

	/**
	 * Delete the person at the specified index
	 * 
	 * @param index
	 */
	public void deletePerson(int index) {
		
		contactCollection.getPersons().remove(index);
		contactListModel.DeletePerson(index);
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
		contactListModel.setData(contactCollection.getPersons());
		
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
		return contactListModel;
	}
	
	public void editContact(int index){
		if(index>-1){
			AddEditContactForm aded=new AddEditContactForm(getPerson(index), index);
		}
		
	}
}

