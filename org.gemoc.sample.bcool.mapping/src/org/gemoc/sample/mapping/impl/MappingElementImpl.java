/**
 */
package org.gemoc.sample.mapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sample.mapping.MappingElement;
import org.gemoc.sample.mapping.MappingPackage;

import org.gemoc.sample.sigpml.Agent;

import org.gemoc.sample.tfsm.FSMEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.sample.mapping.impl.MappingElementImpl#getLinkedFSMEvent <em>Linked FSM Event</em>}</li>
 *   <li>{@link org.gemoc.sample.mapping.impl.MappingElementImpl#getLinkedAgent <em>Linked Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingElementImpl extends NamedElementImpl implements MappingElement {
	/**
	 * The cached value of the '{@link #getLinkedFSMEvent() <em>Linked FSM Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedFSMEvent()
	 * @generated
	 * @ordered
	 */
	protected FSMEvent linkedFSMEvent;

	/**
	 * The cached value of the '{@link #getLinkedAgent() <em>Linked Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent linkedAgent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMEvent getLinkedFSMEvent() {
		if (linkedFSMEvent != null && linkedFSMEvent.eIsProxy()) {
			InternalEObject oldLinkedFSMEvent = (InternalEObject)linkedFSMEvent;
			linkedFSMEvent = (FSMEvent)eResolveProxy(oldLinkedFSMEvent);
			if (linkedFSMEvent != oldLinkedFSMEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAPPING_ELEMENT__LINKED_FSM_EVENT, oldLinkedFSMEvent, linkedFSMEvent));
			}
		}
		return linkedFSMEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMEvent basicGetLinkedFSMEvent() {
		return linkedFSMEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedFSMEvent(FSMEvent newLinkedFSMEvent) {
		FSMEvent oldLinkedFSMEvent = linkedFSMEvent;
		linkedFSMEvent = newLinkedFSMEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_ELEMENT__LINKED_FSM_EVENT, oldLinkedFSMEvent, linkedFSMEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getLinkedAgent() {
		if (linkedAgent != null && linkedAgent.eIsProxy()) {
			InternalEObject oldLinkedAgent = (InternalEObject)linkedAgent;
			linkedAgent = (Agent)eResolveProxy(oldLinkedAgent);
			if (linkedAgent != oldLinkedAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAPPING_ELEMENT__LINKED_AGENT, oldLinkedAgent, linkedAgent));
			}
		}
		return linkedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetLinkedAgent() {
		return linkedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedAgent(Agent newLinkedAgent) {
		Agent oldLinkedAgent = linkedAgent;
		linkedAgent = newLinkedAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_ELEMENT__LINKED_AGENT, oldLinkedAgent, linkedAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAPPING_ELEMENT__LINKED_FSM_EVENT:
				if (resolve) return getLinkedFSMEvent();
				return basicGetLinkedFSMEvent();
			case MappingPackage.MAPPING_ELEMENT__LINKED_AGENT:
				if (resolve) return getLinkedAgent();
				return basicGetLinkedAgent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.MAPPING_ELEMENT__LINKED_FSM_EVENT:
				setLinkedFSMEvent((FSMEvent)newValue);
				return;
			case MappingPackage.MAPPING_ELEMENT__LINKED_AGENT:
				setLinkedAgent((Agent)newValue);
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
			case MappingPackage.MAPPING_ELEMENT__LINKED_FSM_EVENT:
				setLinkedFSMEvent((FSMEvent)null);
				return;
			case MappingPackage.MAPPING_ELEMENT__LINKED_AGENT:
				setLinkedAgent((Agent)null);
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
			case MappingPackage.MAPPING_ELEMENT__LINKED_FSM_EVENT:
				return linkedFSMEvent != null;
			case MappingPackage.MAPPING_ELEMENT__LINKED_AGENT:
				return linkedAgent != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingElementImpl
