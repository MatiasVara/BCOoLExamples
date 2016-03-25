/**
 */
package org.gemoc.sample.mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.sample.mapping.MappingSpecification#getMappingElements <em>Mapping Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.sample.mapping.MappingPackage#getMappingSpecification()
 * @model
 * @generated
 */
public interface MappingSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mapping Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.sample.mapping.MappingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Elements</em>' containment reference list.
	 * @see org.gemoc.sample.mapping.MappingPackage#getMappingSpecification_MappingElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingElement> getMappingElements();

} // MappingSpecification
