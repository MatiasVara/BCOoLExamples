/**
 */
package org.gemoc.sample.tfsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.tfsm.TfsmFactory;
import org.gemoc.sample.tfsm.TimedSystem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.TimedSystem#init() <em>Init</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimedSystemTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimedSystemTest.class);
	}

	/**
	 * Constructs a new Timed System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timed System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimedSystem getFixture() {
		return (TimedSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createTimedSystem());
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

	/**
	 * Tests the '{@link org.gemoc.sample.tfsm.TimedSystem#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.TimedSystem#init()
	 * @generated
	 */
	public void testInit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TimedSystemTest
