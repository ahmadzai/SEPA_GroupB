/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AddressBook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AddressBook.ContactCollection#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see AddressBook.AddressBookPackage#getContactCollection()
 * @model
 * @generated
 */
public interface ContactCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link AddressBook.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see AddressBook.AddressBookPackage#getContactCollection_Persons()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model personRequired="true" personOrdered="false"
	 * @generated
	 */
	void addContact(Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	boolean deleteContact(Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	boolean saveContact(Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" searchByRequired="true" searchByOrdered="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	EList<Person> searchContact(String searchBy, String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model personRequired="true" personOrdered="false"
	 * @generated
	 */
	void printContact(Person person);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false"
	 * @generated
	 */
	Person editContact(Person person);

} // ContactCollection
