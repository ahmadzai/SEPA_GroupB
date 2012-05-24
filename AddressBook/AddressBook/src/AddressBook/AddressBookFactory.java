/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AddressBook;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AddressBook.AddressBookPackage
 * @generated
 */
public interface AddressBookFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressBookFactory eINSTANCE = AddressBook.impl.AddressBookFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contact Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Collection</em>'.
	 * @generated
	 */
	ContactCollection createContactCollection();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AddressBookPackage getAddressBookPackage();

} //AddressBookFactory
