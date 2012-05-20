package Controller;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import AddressBook.ContactCollection;
import Helper.ContactDataModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MainController {
	
	private ContactCollection contactCollection;
	private ContactDataModel dataModel;
	private String dataFile = "canctacts.cont";
	
	public MainController() {
		
		contactCollection = this.load();
		dataModel = new ContactDataModel(contactCollection.getPersons());
		
		
	}
	
	private ResourceSet getResouce() {
		return null;
		
	}
	private ContactCollection load() {
		return null;
	}
	
	public TableModel getTableModel() {
		return this.dataModel;
		
	}

}
