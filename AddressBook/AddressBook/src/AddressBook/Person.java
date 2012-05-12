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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AddressBook.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link AddressBook.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link AddressBook.Person#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link AddressBook.Person#getPhoneNr <em>Phone Nr</em>}</li>
 *   <li>{@link AddressBook.Person#getMobileNr <em>Mobile Nr</em>}</li>
 *   <li>{@link AddressBook.Person#getFax <em>Fax</em>}</li>
 *   <li>{@link AddressBook.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link AddressBook.Person#getImage <em>Image</em>}</li>
 *   <li>{@link AddressBook.Person#getContry <em>Contry</em>}</li>
 *   <li>{@link AddressBook.Person#getCity <em>City</em>}</li>
 *   <li>{@link AddressBook.Person#getStreet <em>Street</em>}</li>
 *   <li>{@link AddressBook.Person#getApartNo <em>Apart No</em>}</li>
 *   <li>{@link AddressBook.Person#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see AddressBook.AddressBookPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see AddressBook.AddressBookPackage#getPerson_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see AddressBook.AddressBookPackage#getPerson_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(String)
	 * @see AddressBook.AddressBookPackage#getPerson_DateOfBirth()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDateOfBirth();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(String value);

	/**
	 * Returns the value of the '<em><b>Phone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Nr</em>' attribute.
	 * @see #setPhoneNr(String)
	 * @see AddressBook.AddressBookPackage#getPerson_PhoneNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPhoneNr();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getPhoneNr <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Nr</em>' attribute.
	 * @see #getPhoneNr()
	 * @generated
	 */
	void setPhoneNr(String value);

	/**
	 * Returns the value of the '<em><b>Mobile Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Nr</em>' attribute.
	 * @see #setMobileNr(String)
	 * @see AddressBook.AddressBookPackage#getPerson_MobileNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMobileNr();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getMobileNr <em>Mobile Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Nr</em>' attribute.
	 * @see #getMobileNr()
	 * @generated
	 */
	void setMobileNr(String value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(int)
	 * @see AddressBook.AddressBookPackage#getPerson_Fax()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getFax();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see AddressBook.AddressBookPackage#getPerson_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see AddressBook.AddressBookPackage#getPerson_Image()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Contry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contry</em>' attribute.
	 * @see #setContry(String)
	 * @see AddressBook.AddressBookPackage#getPerson_Contry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContry();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getContry <em>Contry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contry</em>' attribute.
	 * @see #getContry()
	 * @generated
	 */
	void setContry(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see AddressBook.AddressBookPackage#getPerson_City()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see AddressBook.AddressBookPackage#getPerson_Street()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Apart No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apart No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apart No</em>' attribute.
	 * @see #setApartNo(int)
	 * @see AddressBook.AddressBookPackage#getPerson_ApartNo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getApartNo();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getApartNo <em>Apart No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apart No</em>' attribute.
	 * @see #getApartNo()
	 * @generated
	 */
	void setApartNo(int value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(int)
	 * @see AddressBook.AddressBookPackage#getPerson_PostalCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPostalCode();

	/**
	 * Sets the value of the '{@link AddressBook.Person#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(int value);

} // Person
