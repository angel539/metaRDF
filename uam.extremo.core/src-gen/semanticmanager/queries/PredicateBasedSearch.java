/**
 */
package semanticmanager.queries;

import semanticmanager.dataModel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Based Search</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see semanticmanager.queries.QueriesPackage#getPredicateBasedSearch()
 * @model
 * @generated
 */
public interface PredicateBasedSearch extends SimpleSearchConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model namedElementRequired="true"
	 * @generated
	 */
	boolean matches(NamedElement namedElement);

} // PredicateBasedSearch
