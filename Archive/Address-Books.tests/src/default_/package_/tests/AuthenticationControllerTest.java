/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_.tests;

import default_.package_.AuthenticationController;
import default_.package_.PackageFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Authentication Controller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthenticationControllerTest extends TestCase {

	/**
	 * The fixture for this Authentication Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationController fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthenticationControllerTest.class);
	}

	/**
	 * Constructs a new Authentication Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationControllerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Authentication Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AuthenticationController fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Authentication Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationController getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PackageFactory.eINSTANCE.createAuthenticationController());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AuthenticationControllerTest
