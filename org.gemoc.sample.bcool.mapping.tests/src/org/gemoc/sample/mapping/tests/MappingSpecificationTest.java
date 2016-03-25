/**
 */
package org.gemoc.sample.mapping.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.mapping.MappingFactory;
import org.gemoc.sample.mapping.MappingSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingSpecificationTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingSpecificationTest.class);
	}

	/**
	 * Constructs a new Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MappingSpecification getFixture() {
		return (MappingSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createMappingSpecification());
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

} //MappingSpecificationTest
