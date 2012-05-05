/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_.impl;

import default_.Int;

import default_.package_.PackagePackage;
import default_.package_.Person;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link default_.package_.impl.PersonImpl#getFirst_Name <em>First Name</em>}</li>
 *   <li>{@link default_.package_.impl.PersonImpl#getLast_Name <em>Last Name</em>}</li>
 *   <li>{@link default_.package_.impl.PersonImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link default_.package_.impl.PersonImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link default_.package_.impl.PersonImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link default_.package_.impl.PersonImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link default_.package_.impl.PersonImpl#getAdditional_Information <em>Additional Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The cached value of the '{@link #getFirst_Name() <em>First Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_Name()
	 * @generated
	 * @ordered
	 */
	protected default_.String first_Name;

	/**
	 * The cached value of the '{@link #getLast_Name() <em>Last Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_Name()
	 * @generated
	 * @ordered
	 */
	protected default_.String last_Name;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected Int phone;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected Int fax;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected Int mobile;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected default_.String mail;

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
		return PackagePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getFirst_Name() {
		return first_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst_Name(default_.String newFirst_Name, NotificationChain msgs) {
		default_.String oldFirst_Name = first_Name;
		first_Name = newFirst_Name;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__FIRST_NAME, oldFirst_Name, newFirst_Name);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_Name(default_.String newFirst_Name) {
		if (newFirst_Name != first_Name) {
			NotificationChain msgs = null;
			if (first_Name != null)
				msgs = ((InternalEObject)first_Name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__FIRST_NAME, null, msgs);
			if (newFirst_Name != null)
				msgs = ((InternalEObject)newFirst_Name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__FIRST_NAME, null, msgs);
			msgs = basicSetFirst_Name(newFirst_Name, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__FIRST_NAME, newFirst_Name, newFirst_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getLast_Name() {
		return last_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLast_Name(default_.String newLast_Name, NotificationChain msgs) {
		default_.String oldLast_Name = last_Name;
		last_Name = newLast_Name;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__LAST_NAME, oldLast_Name, newLast_Name);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_Name(default_.String newLast_Name) {
		if (newLast_Name != last_Name) {
			NotificationChain msgs = null;
			if (last_Name != null)
				msgs = ((InternalEObject)last_Name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__LAST_NAME, null, msgs);
			if (newLast_Name != null)
				msgs = ((InternalEObject)newLast_Name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__LAST_NAME, null, msgs);
			msgs = basicSetLast_Name(newLast_Name, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__LAST_NAME, newLast_Name, newLast_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(Int newPhone, NotificationChain msgs) {
		Int oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__PHONE, oldPhone, newPhone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(Int newPhone) {
		if (newPhone != phone) {
			NotificationChain msgs = null;
			if (phone != null)
				msgs = ((InternalEObject)phone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__PHONE, null, msgs);
			if (newPhone != null)
				msgs = ((InternalEObject)newPhone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__PHONE, null, msgs);
			msgs = basicSetPhone(newPhone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__PHONE, newPhone, newPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFax(Int newFax, NotificationChain msgs) {
		Int oldFax = fax;
		fax = newFax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__FAX, oldFax, newFax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(Int newFax) {
		if (newFax != fax) {
			NotificationChain msgs = null;
			if (fax != null)
				msgs = ((InternalEObject)fax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__FAX, null, msgs);
			if (newFax != null)
				msgs = ((InternalEObject)newFax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__FAX, null, msgs);
			msgs = basicSetFax(newFax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__FAX, newFax, newFax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMobile(Int newMobile, NotificationChain msgs) {
		Int oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__MOBILE, oldMobile, newMobile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile(Int newMobile) {
		if (newMobile != mobile) {
			NotificationChain msgs = null;
			if (mobile != null)
				msgs = ((InternalEObject)mobile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__MOBILE, null, msgs);
			if (newMobile != null)
				msgs = ((InternalEObject)newMobile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__MOBILE, null, msgs);
			msgs = basicSetMobile(newMobile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__MOBILE, newMobile, newMobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMail(default_.String newMail, NotificationChain msgs) {
		default_.String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__MAIL, oldMail, newMail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(default_.String newMail) {
		if (newMail != mail) {
			NotificationChain msgs = null;
			if (mail != null)
				msgs = ((InternalEObject)mail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__MAIL, null, msgs);
			if (newMail != null)
				msgs = ((InternalEObject)newMail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__MAIL, null, msgs);
			msgs = basicSetMail(newMail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__MAIL, newMail, newMail));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__ADDITIONAL_INFORMATION, oldAdditional_Information, newAdditional_Information);
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
				msgs = ((InternalEObject)additional_Information).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__ADDITIONAL_INFORMATION, null, msgs);
			if (newAdditional_Information != null)
				msgs = ((InternalEObject)newAdditional_Information).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PERSON__ADDITIONAL_INFORMATION, null, msgs);
			msgs = basicSetAdditional_Information(newAdditional_Information, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PERSON__ADDITIONAL_INFORMATION, newAdditional_Information, newAdditional_Information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.PERSON__FIRST_NAME:
				return basicSetFirst_Name(null, msgs);
			case PackagePackage.PERSON__LAST_NAME:
				return basicSetLast_Name(null, msgs);
			case PackagePackage.PERSON__PHONE:
				return basicSetPhone(null, msgs);
			case PackagePackage.PERSON__FAX:
				return basicSetFax(null, msgs);
			case PackagePackage.PERSON__MOBILE:
				return basicSetMobile(null, msgs);
			case PackagePackage.PERSON__MAIL:
				return basicSetMail(null, msgs);
			case PackagePackage.PERSON__ADDITIONAL_INFORMATION:
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
			case PackagePackage.PERSON__FIRST_NAME:
				return getFirst_Name();
			case PackagePackage.PERSON__LAST_NAME:
				return getLast_Name();
			case PackagePackage.PERSON__PHONE:
				return getPhone();
			case PackagePackage.PERSON__FAX:
				return getFax();
			case PackagePackage.PERSON__MOBILE:
				return getMobile();
			case PackagePackage.PERSON__MAIL:
				return getMail();
			case PackagePackage.PERSON__ADDITIONAL_INFORMATION:
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
			case PackagePackage.PERSON__FIRST_NAME:
				setFirst_Name((default_.String)newValue);
				return;
			case PackagePackage.PERSON__LAST_NAME:
				setLast_Name((default_.String)newValue);
				return;
			case PackagePackage.PERSON__PHONE:
				setPhone((Int)newValue);
				return;
			case PackagePackage.PERSON__FAX:
				setFax((Int)newValue);
				return;
			case PackagePackage.PERSON__MOBILE:
				setMobile((Int)newValue);
				return;
			case PackagePackage.PERSON__MAIL:
				setMail((default_.String)newValue);
				return;
			case PackagePackage.PERSON__ADDITIONAL_INFORMATION:
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
			case PackagePackage.PERSON__FIRST_NAME:
				setFirst_Name((default_.String)null);
				return;
			case PackagePackage.PERSON__LAST_NAME:
				setLast_Name((default_.String)null);
				return;
			case PackagePackage.PERSON__PHONE:
				setPhone((Int)null);
				return;
			case PackagePackage.PERSON__FAX:
				setFax((Int)null);
				return;
			case PackagePackage.PERSON__MOBILE:
				setMobile((Int)null);
				return;
			case PackagePackage.PERSON__MAIL:
				setMail((default_.String)null);
				return;
			case PackagePackage.PERSON__ADDITIONAL_INFORMATION:
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
			case PackagePackage.PERSON__FIRST_NAME:
				return first_Name != null;
			case PackagePackage.PERSON__LAST_NAME:
				return last_Name != null;
			case PackagePackage.PERSON__PHONE:
				return phone != null;
			case PackagePackage.PERSON__FAX:
				return fax != null;
			case PackagePackage.PERSON__MOBILE:
				return mobile != null;
			case PackagePackage.PERSON__MAIL:
				return mail != null;
			case PackagePackage.PERSON__ADDITIONAL_INFORMATION:
				return additional_Information != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
