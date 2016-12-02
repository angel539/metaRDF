/**
 */
package semanticmanager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semanticmanager.SemanticNode#getSupers <em>Supers</em>}</li>
 *   <li>{@link semanticmanager.SemanticNode#getSubs <em>Subs</em>}</li>
 *   <li>{@link semanticmanager.SemanticNode#getProperties <em>Properties</em>}</li>
 *   <li>{@link semanticmanager.SemanticNode#isInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link semanticmanager.SemanticNode#getInstanceOfNode <em>Instance Of Node</em>}</li>
 *   <li>{@link semanticmanager.SemanticNode#getResourceFrom <em>Resource From</em>}</li>
 * </ul>
 *
 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode()
 * @model
 * @generated
 */
public interface SemanticNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Supers</b></em>' reference list.
	 * The list contents are of type {@link semanticmanager.SemanticNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supers</em>' reference list.
	 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode_Supers()
	 * @model
	 * @generated
	 */
	EList<SemanticNode> getSupers();

	/**
	 * Returns the value of the '<em><b>Subs</b></em>' reference list.
	 * The list contents are of type {@link semanticmanager.SemanticNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subs</em>' reference list.
	 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode_Subs()
	 * @model
	 * @generated
	 */
	EList<SemanticNode> getSubs();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link semanticmanager.Property}.
	 * It is bidirectional and its opposite is '{@link semanticmanager.Property#getSemanticNodeFrom <em>Semantic Node From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode_Properties()
	 * @see semanticmanager.Property#getSemanticNodeFrom
	 * @model opposite="semanticNodeFrom" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' attribute.
	 * @see #setInstanceOf(boolean)
	 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode_InstanceOf()
	 * @model
	 * @generated
	 */
	boolean isInstanceOf();

	/**
	 * Sets the value of the '{@link semanticmanager.SemanticNode#isInstanceOf <em>Instance Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' attribute.
	 * @see #isInstanceOf()
	 * @generated
	 */
	void setInstanceOf(boolean value);

	/**
	 * Returns the value of the '<em><b>Instance Of Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Node</em>' reference.
	 * @see #setInstanceOfNode(SemanticNode)
	 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode_InstanceOfNode()
	 * @model
	 * @generated
	 */
	SemanticNode getInstanceOfNode();

	/**
	 * Sets the value of the '{@link semanticmanager.SemanticNode#getInstanceOfNode <em>Instance Of Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Node</em>' reference.
	 * @see #getInstanceOfNode()
	 * @generated
	 */
	void setInstanceOfNode(SemanticNode value);

	/**
	 * Returns the value of the '<em><b>Resource From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link semanticmanager.Resource#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource From</em>' container reference.
	 * @see #setResourceFrom(Resource)
	 * @see semanticmanager.SemanticmanagerPackage#getSemanticNode_ResourceFrom()
	 * @see semanticmanager.Resource#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	Resource getResourceFrom();

	/**
	 * Sets the value of the '{@link semanticmanager.SemanticNode#getResourceFrom <em>Resource From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource From</em>' container reference.
	 * @see #getResourceFrom()
	 * @generated
	 */
	void setResourceFrom(Resource value);

} // SemanticNode
