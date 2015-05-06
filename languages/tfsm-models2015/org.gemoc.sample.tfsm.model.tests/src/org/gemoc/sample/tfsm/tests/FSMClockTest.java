/**
 */
package org.gemoc.sample.tfsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.tfsm.FSMClock;
import org.gemoc.sample.tfsm.TfsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FSM Clock</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMClockTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FSMClockTest.class);
	}

	/**
	 * Constructs a new FSM Clock test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMClockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FSM Clock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FSMClock getFixture() {
		return (FSMClock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createFSMClock());
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

} //FSMClockTest
