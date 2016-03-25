/**
 */
package org.gemoc.sample.mapping;

import org.gemoc.sample.sigpml.Agent;

import org.gemoc.sample.tfsm.FSMEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.sample.mapping.MappingElement#getLinkedFSMEvent <em>Linked FSM Event</em>}</li>
 *   <li>{@link org.gemoc.sample.mapping.MappingElement#getLinkedAgent <em>Linked Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.sample.mapping.MappingPackage#getMappingElement()
 * @model
 * @generated
 */
public interface MappingElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Linked FSM Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked FSM Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked FSM Event</em>' reference.
	 * @see #setLinkedFSMEvent(FSMEvent)
	 * @see org.gemoc.sample.mapping.MappingPackage#getMappingElement_LinkedFSMEvent()
	 * @model required="true"
	 * @generated
	 */
	FSMEvent getLinkedFSMEvent();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.mapping.MappingElement#getLinkedFSMEvent <em>Linked FSM Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked FSM Event</em>' reference.
	 * @see #getLinkedFSMEvent()
	 * @generated
	 */
	void setLinkedFSMEvent(FSMEvent value);

	/**
	 * Returns the value of the '<em><b>Linked Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Agent</em>' reference.
	 * @see #setLinkedAgent(Agent)
	 * @see org.gemoc.sample.mapping.MappingPackage#getMappingElement_LinkedAgent()
	 * @model required="true"
	 * @generated
	 */
	Agent getLinkedAgent();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.mapping.MappingElement#getLinkedAgent <em>Linked Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Agent</em>' reference.
	 * @see #getLinkedAgent()
	 * @generated
	 */
	void setLinkedAgent(Agent value);

} // MappingElement
