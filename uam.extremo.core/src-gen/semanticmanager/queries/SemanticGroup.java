/**
 */
package semanticmanager.queries;

import org.eclipse.emf.common.util.EList;

import semanticmanager.dataModel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semanticmanager.queries.SemanticGroup#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see semanticmanager.queries.QueriesPackage#getSemanticGroup()
 * @model
 * @generated
 */
public interface SemanticGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link semanticmanager.dataModel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see semanticmanager.queries.QueriesPackage#getSemanticGroup_Elements()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getElements();

} // SemanticGroup
