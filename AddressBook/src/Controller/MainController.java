package Controller;

import AddressBook.ContactCollection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MainController {
	
	private ContactCollection contactCollection;
	
	private String dataFile = "canctacts.cont";
	
	public MainController() {
		
		contactCollection = this.load();
		
		
	}
	
	private ResourceSet getResouce() {
		return null;
		
	}
	private ContactCollection load() {
		return null;
	}

}
