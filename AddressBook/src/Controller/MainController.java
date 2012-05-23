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

import Helper.ContactListModel;


public class MainController {
	private ContactCollection contactCollection;
	private  ContactListModel contactListModel;
	private String modelfile = "AddressBook.persons";
	
	public MainController() {
		contactCollection = load();
		contactListModel = new ContactListModel(contactCollection.getPersons());
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
		if(resource.getContents().add(contactCollection)) {
			System.out.println("collection added to the file size; " + contactCollection.getPersons().size());
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
	public void createPerson(String firstname, String lastName,String fax,String email,String mobileNr,String aprtNr,String phoneNr,String country,String city,String street,String dateOfBirth,String postalCode,String imgPath,String group) {
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
	
		contactCollection.getPersons().add(person);
		int index = contactCollection.getPersons().indexOf(person);
		contactListModel.PersonAdded(index);
	}

	/**
	 * Edit an existing student
	 * 
	 * @param index
	 * @param name
	 * @param lastName
	 *
	public void editStudent(int index, String name, String lastName) {
		if(index != -1) {
			Student student = getStudent(index);
			student.setName(name);
			student.setLastName(lastName);
			contactDataModel.studentChanged(index);
		}
	}

	/**
	 * Delete the student at the specified index
	 * 
	 * @param index
	 *
	public void deleteStudent(int index) {
		contactCollection.getStudents().remove(index);
		contactDataModel.studentDeleted(index);
	}

	/**
	 * Get the student at the given index
	 * 
	 * @param index
	 * @return
	 *
	public Student getStudent(int index) {
		return contactCollection.getStudents().get(index);
	}
	
	/**
	 * Load all students from the given file
	 * 
	 * @param modelFile
	 */
	public void loadFromFile(String modelFile) {
		this.setModelfile(modelFile);
		contactCollection = load();
		contactListModel.setPerson(contactCollection.getPersons());
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
	public ContactListModel getTableModel() {
		return contactListModel;
	}
}

