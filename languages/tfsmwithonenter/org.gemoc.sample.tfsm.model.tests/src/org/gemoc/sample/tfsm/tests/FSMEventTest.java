/**
 */
package org.gemoc.sample.tfsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.tfsm.FSMEvent;
import org.gemoc.sample.tfsm.TfsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FSM Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.gemoc.sample.tfsm.FSMEvent#occurs() <em>Occurs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FSMEventTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FSMEventTest.class);
	}

	/**
	 * Constructs a new FSM Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FSM Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FSMEvent getFixture() {
		return (FSMEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createFSMEvent());
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
	 * Tests the '{@link org.gemoc.sample.tfsm.FSMEvent#occurs() <em>Occurs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.tfsm.FSMEvent#occurs()
	 * @generated
	 */
	public void testOccurs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //FSMEventTest
