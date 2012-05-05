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
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link default_.package_.Address#getStreet_Name <em>Street Name</em>}</li>
 *   <li>{@link default_.package_.Address#getStreet_No <em>Street No</em>}</li>
 *   <li>{@link default_.package_.Address#getZip_Code <em>Zip Code</em>}</li>
 *   <li>{@link default_.package_.Address#getCity <em>City</em>}</li>
 *   <li>{@link default_.package_.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link default_.package_.Address#getAdditional_Information <em>Additional Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see default_.package_.PackagePackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name</em>' containment reference.
	 * @see #setStreet_Name(default_.String)
	 * @see default_.package_.PackagePackage#getAddress_Street_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getStreet_Name();

	/**
	 * Sets the value of the '{@link default_.package_.Address#getStreet_Name <em>Street Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' containment reference.
	 * @see #getStreet_Name()
	 * @generated
	 */
	void setStreet_Name(default_.String value);

	/**
	 * Returns the value of the '<em><b>Street No</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street No</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street No</em>' containment reference.
	 * @see #setStreet_No(Int)
	 * @see default_.package_.PackagePackage#getAddress_Street_No()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getStreet_No();

	/**
	 * Sets the value of the '{@link default_.package_.Address#getStreet_No <em>Street No</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street No</em>' containment reference.
	 * @see #getStreet_No()
	 * @generated
	 */
	void setStreet_No(Int value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' containment reference.
	 * @see #setZip_Code(Int)
	 * @see default_.package_.PackagePackage#getAddress_Zip_Code()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getZip_Code();

	/**
	 * Sets the value of the '{@link default_.package_.Address#getZip_Code <em>Zip Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' containment reference.
	 * @see #getZip_Code()
	 * @generated
	 */
	void setZip_Code(Int value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(default_.String)
	 * @see default_.package_.PackagePackage#getAddress_City()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getCity();

	/**
	 * Sets the value of the '{@link default_.package_.Address#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(default_.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(default_.String)
	 * @see default_.package_.PackagePackage#getAddress_Country()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getCountry();

	/**
	 * Sets the value of the '{@link default_.package_.Address#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(default_.String value);

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
	 * @see default_.package_.PackagePackage#getAddress_Additional_Information()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	default_.String getAdditional_Information();

	/**
	 * Sets the value of the '{@link default_.package_.Address#getAdditional_Information <em>Additional Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' containment reference.
	 * @see #getAdditional_Information()
	 * @generated
	 */
	void setAdditional_Information(default_.String value);

} // Address
