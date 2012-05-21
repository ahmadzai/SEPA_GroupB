package Controller;





import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.swing.ListModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import AddressBook.AddressBookFactory;
import AddressBook.AddressBookPackage;
import AddressBook.ContactCollection;
import AddressBook.Person;
import GUI.PersonListModel;


public class MainController {
	private ContactCollection personCollection;
	private PersonListModel personListModel;
	private String modelfile = "AddressBook.persons";
	
	public MainController() {
		personCollection = load();
		personListModel = new PersonListModel(personCollection.getPersons());
	}

	private ResourceSet getRecourceSet() {
		// Initialize the model
		AddressBookPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .students extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("persons", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		return new ResourceSetImpl();
	} 
	
	public void save() {
		ResourceSet resSet = getRecourceSet();

		// Create a resource
		Resource resource = resSet.createResource(URI
				.createURI(modelfile));
	
		// add the root node to the resource
		resource.getContents().add(personCollection);

		// Now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ContactCollection load() {
		ResourceSet resSet = getRecourceSet();

		// Get the resource
		ContactCollection personCollection = null;
		try {
			Resource resource = resSet.getResource(URI
					.createURI(modelfile), true);
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			personCollection = (ContactCollection) resource.getContents().get(0);
		} catch (Exception e) {
			personCollection = AddressBookFactory.eINSTANCE.createContactCollection();
		}
		return personCollection;
	}

	/**
	 * Create a new student
	 * 
	 * @param name
	 * @param lastName
	 */
	public void createStudent(String firstName, String lastName,String dob,String phonNr,String mobileNr,String email,int faxt,String country,String city,String apartNr,String postalCode,String imgPath) {
		Person person = AddressBookFactory.eINSTANCE.createPerson();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setPhoneNr(phonNr);
		person.setMobileNr(mobileNr);
		person.setEmail(email);
		person.setFax(faxt);
		person.setCountry(country);
		person.setCity(city);
		person.setPostalCode(postalCode);
		person.setDateOfBirth(dob);
		person.setApartNr(apartNr);
		person.setImage(imgPath);
		
		
		personCollection.getPersons().add(person);
		int index = personCollection.getPersons().indexOf(person);
		personListModel.PersonAdded(index);
	}

	/**
	 * Edit an existing student
	 * 
	 * @param index
	 * @param name
	 * @param lastName
	 */
	public void editStudent(int index,String firstName, String lastName,String dob,String phonNr,String mobileNr,String email,int faxt,String country,String city,String apartNr,String postalCode,String imgPath){
		if(index != -1) {
			Person person = getPerson(index);
			person.setFirstName(firstName);
			person.setLastName(lastName);
			person.setPhoneNr(phonNr);
			person.setMobileNr(mobileNr);
			person.setEmail(email);
			person.setFax(faxt);
			person.setCountry(country);
			person.setCity(city);
			person.setPostalCode(postalCode);
			person.setDateOfBirth(dob);
			person.setApartNr(apartNr);
			person.setImage(imgPath);
			personListModel.PersonAdded(index);
		}
	}

	/**
	 * Delete the student at the specified index
	 * 
	 * @param index
	 */
	public void deletePerson(int index) {
		personCollection.getPersons().remove(index);
		personListModel.PersonDeleted(index);
	}

	/**
	 * Get the student at the given index
	 * 
	 * @param index
	 * @return
	 */
	public Person getPerson(int index) {
		return personCollection.getPersons().get(index);
	}

	/**
	 * Load all students from the given file
	 * 
	 * @param modelFile
	 */
	public void loadFromFile(String modelFile) {
		this.setModelfile(modelFile);
		personCollection = load();
		personListModel.setPersons(personCollection.getPersons());
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
	public ListModel getPersonModel() {
		return personListModel;
	}
}
