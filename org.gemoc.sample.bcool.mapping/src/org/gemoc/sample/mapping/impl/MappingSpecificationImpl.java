/**
 */
package org.gemoc.sample.mapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.sample.mapping.MappingElement;
import org.gemoc.sample.mapping.MappingPackage;
import org.gemoc.sample.mapping.MappingSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.sample.mapping.impl.MappingSpecificationImpl#getMappingElements <em>Mapping Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingSpecificationImpl extends NamedElementImpl implements MappingSpecification {
	/**
	 * The cached value of the '{@link #getMappingElements() <em>Mapping Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingElement> mappingElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingElement> getMappingElements() {
		if (mappingElements == null) {
			mappingElements = new EObjectContainmentEList<MappingElement>(MappingElement.class, this, MappingPackage.MAPPING_SPECIFICATION__MAPPING_ELEMENTS);
		}
		return mappingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING_SPECIFICATION__MAPPING_ELEMENTS:
				return ((InternalEList<?>)getMappingElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAPPING_SPECIFICATION__MAPPING_ELEMENTS:
				return getMappingElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.MAPPING_SPECIFICATION__MAPPING_ELEMENTS:
				getMappingElements().clear();
				getMappingElements().addAll((Collection<? extends MappingElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingPackage.MAPPING_SPECIFICATION__MAPPING_ELEMENTS:
				getMappingElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.MAPPING_SPECIFICATION__MAPPING_ELEMENTS:
				return mappingElements != null && !mappingElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingSpecificationImpl
