/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AddressBook.impl;

import AddressBook.AddressBookPackage;
import AddressBook.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AddressBook.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getPhoneNr <em>Phone Nr</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getMobileNr <em>Mobile Nr</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getImage <em>Image</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getCity <em>City</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getApartNr <em>Apart Nr</em>}</li>
 *   <li>{@link AddressBook.impl.PersonImpl#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected String dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNr() <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNr()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNr() <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNr()
	 * @generated
	 * @ordered
	 */
	protected String phoneNr = PHONE_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobileNr() <em>Mobile Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileNr()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobileNr() <em>Mobile Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileNr()
	 * @generated
	 * @ordered
	 */
	protected String mobileNr = MOBILE_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final int FAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected int fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getApartNr() <em>Apart Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApartNr()
	 * @generated
	 * @ordered
	 */
	protected static final String APART_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApartNr() <em>Apart Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApartNr()
	 * @generated
	 * @ordered
	 */
	protected String apartNr = APART_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressBookPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(String newDateOfBirth) {
		String oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNr() {
		return phoneNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNr(String newPhoneNr) {
		String oldPhoneNr = phoneNr;
		phoneNr = newPhoneNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__PHONE_NR, oldPhoneNr, phoneNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMobileNr() {
		return mobileNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobileNr(String newMobileNr) {
		String oldMobileNr = mobileNr;
		mobileNr = newMobileNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__MOBILE_NR, oldMobileNr, mobileNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(int newFax) {
		int oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApartNr() {
		return apartNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApartNr(String newApartNr) {
		String oldApartNr = apartNr;
		apartNr = newApartNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__APART_NR, oldApartNr, apartNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressBookPackage.PERSON__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AddressBookPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case AddressBookPackage.PERSON__LAST_NAME:
				return getLastName();
			case AddressBookPackage.PERSON__DATE_OF_BIRTH:
				return getDateOfBirth();
			case AddressBookPackage.PERSON__PHONE_NR:
				return getPhoneNr();
			case AddressBookPackage.PERSON__MOBILE_NR:
				return getMobileNr();
			case AddressBookPackage.PERSON__FAX:
				return getFax();
			case AddressBookPackage.PERSON__EMAIL:
				return getEmail();
			case AddressBookPackage.PERSON__IMAGE:
				return getImage();
			case AddressBookPackage.PERSON__COUNTRY:
				return getCountry();
			case AddressBookPackage.PERSON__CITY:
				return getCity();
			case AddressBookPackage.PERSON__APART_NR:
				return getApartNr();
			case AddressBookPackage.PERSON__POSTAL_CODE:
				return getPostalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AddressBookPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case AddressBookPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case AddressBookPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth((String)newValue);
				return;
			case AddressBookPackage.PERSON__PHONE_NR:
				setPhoneNr((String)newValue);
				return;
			case AddressBookPackage.PERSON__MOBILE_NR:
				setMobileNr((String)newValue);
				return;
			case AddressBookPackage.PERSON__FAX:
				setFax((Integer)newValue);
				return;
			case AddressBookPackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case AddressBookPackage.PERSON__IMAGE:
				setImage((String)newValue);
				return;
			case AddressBookPackage.PERSON__COUNTRY:
				setCountry((String)newValue);
				return;
			case AddressBookPackage.PERSON__CITY:
				setCity((String)newValue);
				return;
			case AddressBookPackage.PERSON__APART_NR:
				setApartNr((String)newValue);
				return;
			case AddressBookPackage.PERSON__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AddressBookPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__PHONE_NR:
				setPhoneNr(PHONE_NR_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__MOBILE_NR:
				setMobileNr(MOBILE_NR_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__APART_NR:
				setApartNr(APART_NR_EDEFAULT);
				return;
			case AddressBookPackage.PERSON__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AddressBookPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case AddressBookPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case AddressBookPackage.PERSON__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case AddressBookPackage.PERSON__PHONE_NR:
				return PHONE_NR_EDEFAULT == null ? phoneNr != null : !PHONE_NR_EDEFAULT.equals(phoneNr);
			case AddressBookPackage.PERSON__MOBILE_NR:
				return MOBILE_NR_EDEFAULT == null ? mobileNr != null : !MOBILE_NR_EDEFAULT.equals(mobileNr);
			case AddressBookPackage.PERSON__FAX:
				return fax != FAX_EDEFAULT;
			case AddressBookPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case AddressBookPackage.PERSON__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case AddressBookPackage.PERSON__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case AddressBookPackage.PERSON__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case AddressBookPackage.PERSON__APART_NR:
				return APART_NR_EDEFAULT == null ? apartNr != null : !APART_NR_EDEFAULT.equals(apartNr);
			case AddressBookPackage.PERSON__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", dateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", phoneNr: ");
		result.append(phoneNr);
		result.append(", mobileNr: ");
		result.append(mobileNr);
		result.append(", fax: ");
		result.append(fax);
		result.append(", email: ");
		result.append(email);
		result.append(", image: ");
		result.append(image);
		result.append(", country: ");
		result.append(country);
		result.append(", city: ");
		result.append(city);
		result.append(", apartNr: ");
		result.append(apartNr);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
