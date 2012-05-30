package Helper;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.AESCipherImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Controller.LoginController;

public class FactoryImpl extends XMIResourceFactoryImpl {
	
	
	@Override
	public Resource createResource(URI uri) {
		
		XMIResourceFactoryImpl resFactory = new XMIResourceFactoryImpl();
		XMIResource resource = (XMIResource) resFactory.createResource(uri);
		try {
			resource.getDefaultLoadOptions().put(Resource.OPTION_CIPHER,
					new AESCipherImpl(LoginController.getKey()));
			resource.getDefaultSaveOptions().put(Resource.OPTION_CIPHER,
					new AESCipherImpl(LoginController.getKey()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}
}
