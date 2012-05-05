/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_.impl;

import default_.Int;

import default_.package_.Address;
import default_.package_.PackagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link default_.package_.impl.AddressImpl#getStreet_Name <em>Street Name</em>}</li>
 *   <li>{@link default_.package_.impl.AddressImpl#getStreet_No <em>Street No</em>}</li>
 *   <li>{@link default_.package_.impl.AddressImpl#getZip_Code <em>Zip Code</em>}</li>
 *   <li>{@link default_.package_.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link default_.package_.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link default_.package_.impl.AddressImpl#getAdditional_Information <em>Additional Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address {
	/**
	 * The cached value of the '{@link #getStreet_Name() <em>Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet_Name()
	 * @generated
	 * @ordered
	 */
	protected default_.String street_Name;

	/**
	 * The cached value of the '{@link #getStreet_No() <em>Street No</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet_No()
	 * @generated
	 * @ordered
	 */
	protected Int street_No;

	/**
	 * The cached value of the '{@link #getZip_Code() <em>Zip Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip_Code()
	 * @generated
	 * @ordered
	 */
	protected Int zip_Code;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected default_.String city;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected default_.String country;

	/**
	 * The cached value of the '{@link #getAdditional_Information() <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional_Information()
	 * @generated
	 * @ordered
	 */
	protected default_.String additional_Information;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagePackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getStreet_Name() {
		return street_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreet_Name(default_.String newStreet_Name, NotificationChain msgs) {
		default_.String oldStreet_Name = street_Name;
		street_Name = newStreet_Name;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__STREET_NAME, oldStreet_Name, newStreet_Name);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet_Name(default_.String newStreet_Name) {
		if (newStreet_Name != street_Name) {
			NotificationChain msgs = null;
			if (street_Name != null)
				msgs = ((InternalEObject)street_Name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__STREET_NAME, null, msgs);
			if (newStreet_Name != null)
				msgs = ((InternalEObject)newStreet_Name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__STREET_NAME, null, msgs);
			msgs = basicSetStreet_Name(newStreet_Name, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__STREET_NAME, newStreet_Name, newStreet_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getStreet_No() {
		return street_No;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreet_No(Int newStreet_No, NotificationChain msgs) {
		Int oldStreet_No = street_No;
		street_No = newStreet_No;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__STREET_NO, oldStreet_No, newStreet_No);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet_No(Int newStreet_No) {
		if (newStreet_No != street_No) {
			NotificationChain msgs = null;
			if (street_No != null)
				msgs = ((InternalEObject)street_No).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__STREET_NO, null, msgs);
			if (newStreet_No != null)
				msgs = ((InternalEObject)newStreet_No).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__STREET_NO, null, msgs);
			msgs = basicSetStreet_No(newStreet_No, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__STREET_NO, newStreet_No, newStreet_No));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getZip_Code() {
		return zip_Code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZip_Code(Int newZip_Code, NotificationChain msgs) {
		Int oldZip_Code = zip_Code;
		zip_Code = newZip_Code;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__ZIP_CODE, oldZip_Code, newZip_Code);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZip_Code(Int newZip_Code) {
		if (newZip_Code != zip_Code) {
			NotificationChain msgs = null;
			if (zip_Code != null)
				msgs = ((InternalEObject)zip_Code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__ZIP_CODE, null, msgs);
			if (newZip_Code != null)
				msgs = ((InternalEObject)newZip_Code).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__ZIP_CODE, null, msgs);
			msgs = basicSetZip_Code(newZip_Code, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__ZIP_CODE, newZip_Code, newZip_Code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(default_.String newCity, NotificationChain msgs) {
		default_.String oldCity = city;
		city = newCity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__CITY, oldCity, newCity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(default_.String newCity) {
		if (newCity != city) {
			NotificationChain msgs = null;
			if (city != null)
				msgs = ((InternalEObject)city).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__CITY, null, msgs);
			if (newCity != null)
				msgs = ((InternalEObject)newCity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__CITY, null, msgs);
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__CITY, newCity, newCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(default_.String newCountry, NotificationChain msgs) {
		default_.String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(default_.String newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getAdditional_Information() {
		return additional_Information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditional_Information(default_.String newAdditional_Information, NotificationChain msgs) {
		default_.String oldAdditional_Information = additional_Information;
		additional_Information = newAdditional_Information;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__ADDITIONAL_INFORMATION, oldAdditional_Information, newAdditional_Information);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditional_Information(default_.String newAdditional_Information) {
		if (newAdditional_Information != additional_Information) {
			NotificationChain msgs = null;
			if (additional_Information != null)
				msgs = ((InternalEObject)additional_Information).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__ADDITIONAL_INFORMATION, null, msgs);
			if (newAdditional_Information != null)
				msgs = ((InternalEObject)newAdditional_Information).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.ADDRESS__ADDITIONAL_INFORMATION, null, msgs);
			msgs = basicSetAdditional_Information(newAdditional_Information, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.ADDRESS__ADDITIONAL_INFORMATION, newAdditional_Information, newAdditional_Information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.ADDRESS__STREET_NAME:
				return basicSetStreet_Name(null, msgs);
			case PackagePackage.ADDRESS__STREET_NO:
				return basicSetStreet_No(null, msgs);
			case PackagePackage.ADDRESS__ZIP_CODE:
				return basicSetZip_Code(null, msgs);
			case PackagePackage.ADDRESS__CITY:
				return basicSetCity(null, msgs);
			case PackagePackage.ADDRESS__COUNTRY:
				return basicSetCountry(null, msgs);
			case PackagePackage.ADDRESS__ADDITIONAL_INFORMATION:
				return basicSetAdditional_Information(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagePackage.ADDRESS__STREET_NAME:
				return getStreet_Name();
			case PackagePackage.ADDRESS__STREET_NO:
				return getStreet_No();
			case PackagePackage.ADDRESS__ZIP_CODE:
				return getZip_Code();
			case PackagePackage.ADDRESS__CITY:
				return getCity();
			case PackagePackage.ADDRESS__COUNTRY:
				return getCountry();
			case PackagePackage.ADDRESS__ADDITIONAL_INFORMATION:
				return getAdditional_Information();
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
			case PackagePackage.ADDRESS__STREET_NAME:
				setStreet_Name((default_.String)newValue);
				return;
			case PackagePackage.ADDRESS__STREET_NO:
				setStreet_No((Int)newValue);
				return;
			case PackagePackage.ADDRESS__ZIP_CODE:
				setZip_Code((Int)newValue);
				return;
			case PackagePackage.ADDRESS__CITY:
				setCity((default_.String)newValue);
				return;
			case PackagePackage.ADDRESS__COUNTRY:
				setCountry((default_.String)newValue);
				return;
			case PackagePackage.ADDRESS__ADDITIONAL_INFORMATION:
				setAdditional_Information((default_.String)newValue);
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
			case PackagePackage.ADDRESS__STREET_NAME:
				setStreet_Name((default_.String)null);
				return;
			case PackagePackage.ADDRESS__STREET_NO:
				setStreet_No((Int)null);
				return;
			case PackagePackage.ADDRESS__ZIP_CODE:
				setZip_Code((Int)null);
				return;
			case PackagePackage.ADDRESS__CITY:
				setCity((default_.String)null);
				return;
			case PackagePackage.ADDRESS__COUNTRY:
				setCountry((default_.String)null);
				return;
			case PackagePackage.ADDRESS__ADDITIONAL_INFORMATION:
				setAdditional_Information((default_.String)null);
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
			case PackagePackage.ADDRESS__STREET_NAME:
				return street_Name != null;
			case PackagePackage.ADDRESS__STREET_NO:
				return street_No != null;
			case PackagePackage.ADDRESS__ZIP_CODE:
				return zip_Code != null;
			case PackagePackage.ADDRESS__CITY:
				return city != null;
			case PackagePackage.ADDRESS__COUNTRY:
				return country != null;
			case PackagePackage.ADDRESS__ADDITIONAL_INFORMATION:
				return additional_Information != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressImpl
