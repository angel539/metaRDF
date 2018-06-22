/**
 */
package semanticmanager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Based Search</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see semanticmanager.SemanticmanagerPackage#getPredicateBasedSearch()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="semanticmanager.JavaObject" inpsMany="true"
	 * @generated
	 */
	Object getOptionValueKey(String key, EList<SearchParamValue> inps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputsMany="true"
	 * @generated
	 */
	void init(EList<SearchParamValue> inputs);

} // PredicateBasedSearch
