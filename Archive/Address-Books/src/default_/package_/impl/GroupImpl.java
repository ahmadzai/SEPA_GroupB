/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_.impl;

import default_.Int;

import default_.package_.Group;
import default_.package_.PackagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link default_.package_.impl.GroupImpl#getGroup_ID <em>Group ID</em>}</li>
 *   <li>{@link default_.package_.impl.GroupImpl#getGroup_Name <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends EObjectImpl implements Group {
	/**
	 * The cached value of the '{@link #getGroup_ID() <em>Group ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup_ID()
	 * @generated
	 * @ordered
	 */
	protected Int group_ID;

	/**
	 * The cached value of the '{@link #getGroup_Name() <em>Group Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup_Name()
	 * @generated
	 * @ordered
	 */
	protected default_.String group_Name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagePackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getGroup_ID() {
		return group_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup_ID(Int newGroup_ID, NotificationChain msgs) {
		Int oldGroup_ID = group_ID;
		group_ID = newGroup_ID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.GROUP__GROUP_ID, oldGroup_ID, newGroup_ID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup_ID(Int newGroup_ID) {
		if (newGroup_ID != group_ID) {
			NotificationChain msgs = null;
			if (group_ID != null)
				msgs = ((InternalEObject)group_ID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.GROUP__GROUP_ID, null, msgs);
			if (newGroup_ID != null)
				msgs = ((InternalEObject)newGroup_ID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.GROUP__GROUP_ID, null, msgs);
			msgs = basicSetGroup_ID(newGroup_ID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.GROUP__GROUP_ID, newGroup_ID, newGroup_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public default_.String getGroup_Name() {
		return group_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup_Name(default_.String newGroup_Name, NotificationChain msgs) {
		default_.String oldGroup_Name = group_Name;
		group_Name = newGroup_Name;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.GROUP__GROUP_NAME, oldGroup_Name, newGroup_Name);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup_Name(default_.String newGroup_Name) {
		if (newGroup_Name != group_Name) {
			NotificationChain msgs = null;
			if (group_Name != null)
				msgs = ((InternalEObject)group_Name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.GROUP__GROUP_NAME, null, msgs);
			if (newGroup_Name != null)
				msgs = ((InternalEObject)newGroup_Name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.GROUP__GROUP_NAME, null, msgs);
			msgs = basicSetGroup_Name(newGroup_Name, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.GROUP__GROUP_NAME, newGroup_Name, newGroup_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.GROUP__GROUP_ID:
				return basicSetGroup_ID(null, msgs);
			case PackagePackage.GROUP__GROUP_NAME:
				return basicSetGroup_Name(null, msgs);
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
			case PackagePackage.GROUP__GROUP_ID:
				return getGroup_ID();
			case PackagePackage.GROUP__GROUP_NAME:
				return getGroup_Name();
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
			case PackagePackage.GROUP__GROUP_ID:
				setGroup_ID((Int)newValue);
				return;
			case PackagePackage.GROUP__GROUP_NAME:
				setGroup_Name((default_.String)newValue);
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
			case PackagePackage.GROUP__GROUP_ID:
				setGroup_ID((Int)null);
				return;
			case PackagePackage.GROUP__GROUP_NAME:
				setGroup_Name((default_.String)null);
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
			case PackagePackage.GROUP__GROUP_ID:
				return group_ID != null;
			case PackagePackage.GROUP__GROUP_NAME:
				return group_Name != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
