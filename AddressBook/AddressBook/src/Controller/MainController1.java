package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import AddressBook.ContactCollection;
import AddressBook.AddressBookFactory;
import AddressBook.AddressBookPackage;
import AddressBook.Person;
//import DataModel.DataModelPackage;
import Helper.ContactDataModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MainController1 {
	
	private ContactCollection contactCollection;
	private ContactDataModel dataModel;
	private String dataFile = "conctacts.afg";
	
	public MainController1() {
		
		contactCollection = this.loadData();
		dataModel = new ContactDataModel(contactCollection.getPersons());
		
		
	}
	
	private ResourceSet getRecourceSet() {
		// Initialize the model
		AddressBookPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .students extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("afg", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		return new ResourceSetImpl();
	} 
	
	public void saveContacts() {
		ResourceSet resSet = getRecourceSet();
		//System.out.println("resource/set collection error: "+ resSet.toString());
		Resource resource = resSet.createResource(URI.createURI(dataFile));
		System.out.println("resource collection error: "+ resource.toString());
		
		// add the root node to the resource
		resource.getContents().add(contactCollection);

		// Now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private ContactCollection loadData() {
		ResourceSet resSet = getRecourceSet();

		// Get the resource
		ContactCollection contactsCol = null;
		try {
			Resource resource = resSet.getResource(URI
					.createURI(dataFile), true);
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			contactsCol = (ContactCollection) resource.getContents().get(0);
		} catch (Exception e) {
			contactsCol = AddressBookFactory.eINSTANCE.createContactCollection();
		}
		//System.out.println("contact collection error: "+ contactsCol.toString());
		return contactsCol;
	}
	
	public void loadFromFile(String modelFile) {
		this.setDataFile(modelFile);
		contactCollection = loadData();
		//contactCollection.get;
		dataModel.setData(contactCollection.getPersons());
	}
	
	/***
	 * @author wazir
	 * @param dataFile
	 * Setter function for setting dataFile
	 */
	private void setDataFile(String dataFile) {
		// TODO Auto-generated method stub
		this.dataFile = dataFile;
		
	}
	/***
	 * @author wazir
	 * @return Name of Data file
	 * Getter function of datafile
	 */
	public String getDataFile() {
		return dataFile;
	}

	public ContactDataModel getTableModel() {
		return this.dataModel;
		
	}
	
	public void createPerson(Person person) {
		
		contactCollection.getPersons().add(person);
		int index = contactCollection.getPersons().indexOf(person);
		dataModel.personAdded(index);
		// this.dataModel.fireTableDataChanged();
		System.out.println("testing the size of collection" + contactCollection.getPersons().size());
		//dataModel.setData(contactCollection.getPersons());
	}

}
