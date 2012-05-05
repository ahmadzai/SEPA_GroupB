/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see default_.package_.PackageFactory
 * @model kind="package"
 * @generated
 */
public interface PackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "package";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///default/package.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "default.package";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagePackage eINSTANCE = default_.package_.impl.PackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link default_.package_.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see default_.package_.impl.PersonImpl
	 * @see default_.package_.impl.PackagePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE = 2;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FAX = 3;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MOBILE = 4;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MAIL = 5;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDITIONAL_INFORMATION = 6;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link default_.package_.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see default_.package_.impl.AddressImpl
	 * @see default_.package_.impl.PackagePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Street No</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_NO = 1;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ZIP_CODE = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDITIONAL_INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link default_.package_.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see default_.package_.impl.GroupImpl
	 * @see default_.package_.impl.PackagePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_NAME = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link default_.package_.impl.AddressBookImpl <em>Address Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see default_.package_.impl.AddressBookImpl
	 * @see default_.package_.impl.PackagePackageImpl#getAddressBook()
	 * @generated
	 */
	int ADDRESS_BOOK = 3;

	/**
	 * The number of structural features of the '<em>Address Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link default_.package_.impl.AddressBookControlerImpl <em>Address Book Controler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see default_.package_.impl.AddressBookControlerImpl
	 * @see default_.package_.impl.PackagePackageImpl#getAddressBookControler()
	 * @generated
	 */
	int ADDRESS_BOOK_CONTROLER = 4;

	/**
	 * The number of structural features of the '<em>Address Book Controler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_CONTROLER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link default_.package_.impl.AuthenticationControllerImpl <em>Authentication Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see default_.package_.impl.AuthenticationControllerImpl
	 * @see default_.package_.impl.PackagePackageImpl#getAuthenticationController()
	 * @generated
	 */
	int AUTHENTICATION_CONTROLLER = 5;

	/**
	 * The number of structural features of the '<em>Authentication Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_CONTROLLER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link default_.package_.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see default_.package_.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getFirst_Name <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Name</em>'.
	 * @see default_.package_.Person#getFirst_Name()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_First_Name();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getLast_Name <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Name</em>'.
	 * @see default_.package_.Person#getLast_Name()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Last_Name();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone</em>'.
	 * @see default_.package_.Person#getPhone()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Phone();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fax</em>'.
	 * @see default_.package_.Person#getFax()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Fax();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getMobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mobile</em>'.
	 * @see default_.package_.Person#getMobile()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Mobile();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail</em>'.
	 * @see default_.package_.Person#getMail()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Mail();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Person#getAdditional_Information <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Information</em>'.
	 * @see default_.package_.Person#getAdditional_Information()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Additional_Information();

	/**
	 * Returns the meta object for class '{@link default_.package_.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see default_.package_.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Address#getStreet_Name <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Street Name</em>'.
	 * @see default_.package_.Address#getStreet_Name()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Street_Name();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Address#getStreet_No <em>Street No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Street No</em>'.
	 * @see default_.package_.Address#getStreet_No()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Street_No();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Address#getZip_Code <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zip Code</em>'.
	 * @see default_.package_.Address#getZip_Code()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Zip_Code();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City</em>'.
	 * @see default_.package_.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see default_.package_.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Address#getAdditional_Information <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Information</em>'.
	 * @see default_.package_.Address#getAdditional_Information()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Additional_Information();

	/**
	 * Returns the meta object for class '{@link default_.package_.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see default_.package_.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Group#getGroup_ID <em>Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group ID</em>'.
	 * @see default_.package_.Group#getGroup_ID()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Group_ID();

	/**
	 * Returns the meta object for the containment reference '{@link default_.package_.Group#getGroup_Name <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Name</em>'.
	 * @see default_.package_.Group#getGroup_Name()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Group_Name();

	/**
	 * Returns the meta object for class '{@link default_.package_.AddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Book</em>'.
	 * @see default_.package_.AddressBook
	 * @generated
	 */
	EClass getAddressBook();

	/**
	 * Returns the meta object for class '{@link default_.package_.AddressBookControler <em>Address Book Controler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Book Controler</em>'.
	 * @see default_.package_.AddressBookControler
	 * @generated
	 */
	EClass getAddressBookControler();

	/**
	 * Returns the meta object for class '{@link default_.package_.AuthenticationController <em>Authentication Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Controller</em>'.
	 * @see default_.package_.AuthenticationController
	 * @generated
	 */
	EClass getAuthenticationController();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageFactory getPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link default_.package_.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see default_.package_.impl.PersonImpl
		 * @see default_.package_.impl.PackagePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__FIRST_NAME = eINSTANCE.getPerson_First_Name();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LAST_NAME = eINSTANCE.getPerson_Last_Name();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PHONE = eINSTANCE.getPerson_Phone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__FAX = eINSTANCE.getPerson_Fax();

		/**
		 * The meta object literal for the '<em><b>Mobile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MOBILE = eINSTANCE.getPerson_Mobile();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MAIL = eINSTANCE.getPerson_Mail();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDITIONAL_INFORMATION = eINSTANCE.getPerson_Additional_Information();

		/**
		 * The meta object literal for the '{@link default_.package_.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see default_.package_.impl.AddressImpl
		 * @see default_.package_.impl.PackagePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STREET_NAME = eINSTANCE.getAddress_Street_Name();

		/**
		 * The meta object literal for the '<em><b>Street No</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STREET_NO = eINSTANCE.getAddress_Street_No();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__ZIP_CODE = eINSTANCE.getAddress_Zip_Code();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__ADDITIONAL_INFORMATION = eINSTANCE.getAddress_Additional_Information();

		/**
		 * The meta object literal for the '{@link default_.package_.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see default_.package_.impl.GroupImpl
		 * @see default_.package_.impl.PackagePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Group ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP_ID = eINSTANCE.getGroup_Group_ID();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP_NAME = eINSTANCE.getGroup_Group_Name();

		/**
		 * The meta object literal for the '{@link default_.package_.impl.AddressBookImpl <em>Address Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see default_.package_.impl.AddressBookImpl
		 * @see default_.package_.impl.PackagePackageImpl#getAddressBook()
		 * @generated
		 */
		EClass ADDRESS_BOOK = eINSTANCE.getAddressBook();

		/**
		 * The meta object literal for the '{@link default_.package_.impl.AddressBookControlerImpl <em>Address Book Controler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see default_.package_.impl.AddressBookControlerImpl
		 * @see default_.package_.impl.PackagePackageImpl#getAddressBookControler()
		 * @generated
		 */
		EClass ADDRESS_BOOK_CONTROLER = eINSTANCE.getAddressBookControler();

		/**
		 * The meta object literal for the '{@link default_.package_.impl.AuthenticationControllerImpl <em>Authentication Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see default_.package_.impl.AuthenticationControllerImpl
		 * @see default_.package_.impl.PackagePackageImpl#getAuthenticationController()
		 * @generated
		 */
		EClass AUTHENTICATION_CONTROLLER = eINSTANCE.getAuthenticationController();

	}

} //PackagePackage
