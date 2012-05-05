/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package default_.package_.tests;

import default_.package_.AddressBookControler;
import default_.package_.PackageFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Address Book Controler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressBookControlerTest extends TestCase {

	/**
	 * The fixture for this Address Book Controler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBookControler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddressBookControlerTest.class);
	}

	/**
	 * Constructs a new Address Book Controler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBookControlerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Address Book Controler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AddressBookControler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Address Book Controler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBookControler getFixture() {
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
		setFixture(PackageFactory.eINSTANCE.createAddressBookControler());
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

} //AddressBookControlerTest
