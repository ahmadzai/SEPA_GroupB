/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_;

import default_.Int;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link default_.package_.Group#getGroup_ID <em>Group ID</em>}</li>
 *   <li>{@link default_.package_.Group#getGroup_Name <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see default_.package_.PackagePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group ID</em>' containment reference.
	 * @see #setGroup_ID(Int)
	 * @see default_.package_.PackagePackage#getGroup_Group_ID()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getGroup_ID();

	/**
	 * Sets the value of the '{@link default_.package_.Group#getGroup_ID <em>Group ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' containment reference.
	 * @see #getGroup_ID()
	 * @generated
	 */
	void setGroup_ID(Int value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' containment reference.
	 * @see #setGroup_Name(default_.String)
	 * @see default_.package_.PackagePackage#getGroup_Group_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getGroup_Name();

	/**
	 * Sets the value of the '{@link default_.package_.Group#getGroup_Name <em>Group Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' containment reference.
	 * @see #getGroup_Name()
	 * @generated
	 */
	void setGroup_Name(default_.String value);

} // Group
