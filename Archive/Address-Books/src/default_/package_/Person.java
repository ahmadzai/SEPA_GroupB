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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link default_.package_.Person#getFirst_Name <em>First Name</em>}</li>
 *   <li>{@link default_.package_.Person#getLast_Name <em>Last Name</em>}</li>
 *   <li>{@link default_.package_.Person#getPhone <em>Phone</em>}</li>
 *   <li>{@link default_.package_.Person#getFax <em>Fax</em>}</li>
 *   <li>{@link default_.package_.Person#getMobile <em>Mobile</em>}</li>
 *   <li>{@link default_.package_.Person#getMail <em>Mail</em>}</li>
 *   <li>{@link default_.package_.Person#getAdditional_Information <em>Additional Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see default_.package_.PackagePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' containment reference.
	 * @see #setFirst_Name(default_.String)
	 * @see default_.package_.PackagePackage#getPerson_First_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getFirst_Name();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getFirst_Name <em>First Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' containment reference.
	 * @see #getFirst_Name()
	 * @generated
	 */
	void setFirst_Name(default_.String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' containment reference.
	 * @see #setLast_Name(default_.String)
	 * @see default_.package_.PackagePackage#getPerson_Last_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getLast_Name();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getLast_Name <em>Last Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' containment reference.
	 * @see #getLast_Name()
	 * @generated
	 */
	void setLast_Name(default_.String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(Int)
	 * @see default_.package_.PackagePackage#getPerson_Phone()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getPhone();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(Int value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' containment reference.
	 * @see #setFax(Int)
	 * @see default_.package_.PackagePackage#getPerson_Fax()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getFax();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getFax <em>Fax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' containment reference.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(Int value);

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile</em>' containment reference.
	 * @see #setMobile(Int)
	 * @see default_.package_.PackagePackage#getPerson_Mobile()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getMobile();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getMobile <em>Mobile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile</em>' containment reference.
	 * @see #getMobile()
	 * @generated
	 */
	void setMobile(Int value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' containment reference.
	 * @see #setMail(default_.String)
	 * @see default_.package_.PackagePackage#getPerson_Mail()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getMail();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getMail <em>Mail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' containment reference.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(default_.String value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference.
	 * @see #setAdditional_Information(default_.String)
	 * @see default_.package_.PackagePackage#getPerson_Additional_Information()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getAdditional_Information();

	/**
	 * Sets the value of the '{@link default_.package_.Person#getAdditional_Information <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' containment reference.
	 * @see #getAdditional_Information()
	 * @generated
	 */
	void setAdditional_Information(default_.String value);

} // Person
