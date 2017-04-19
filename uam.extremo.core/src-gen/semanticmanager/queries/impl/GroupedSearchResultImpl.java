/**
 */
package semanticmanager.queries.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import semanticmanager.dataModel.DataProperty;
import semanticmanager.dataModel.NamedElement;
import semanticmanager.dataModel.ObjectProperty;
import semanticmanager.dataModel.Resource;
import semanticmanager.dataModel.SemanticNode;

import semanticmanager.queries.GroupedSearchResult;
import semanticmanager.queries.QueriesPackage;
import semanticmanager.queries.SemanticGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouped Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticmanager.queries.impl.GroupedSearchResultImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GroupedSearchResultImpl extends SearchResultImpl implements GroupedSearchResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupedSearchResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueriesPackage.Literals.GROUPED_SEARCH_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SemanticGroup> getGroups() {
		return (EList<SemanticGroup>)eGet(QueriesPackage.Literals.GROUPED_SEARCH_RESULT__GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticGroup createSemanticGroup(String name, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSemanticNodeToSemanticGroup(SemanticGroup semanticGroup, SemanticNode semanticNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDataPropertyToSemanticGroup(SemanticGroup semanticGroup, DataProperty dataProperty) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addObjectPropertyToSemanticGroup(SemanticGroup semanticGroup, ObjectProperty objectProperty) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOptionValue(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addNamedElementToSemanticGroup(SemanticGroup semanticGroup, NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addResourceToSemanticGroup(SemanticGroup semanticGroup, Resource resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QueriesPackage.GROUPED_SEARCH_RESULT___CREATE_SEMANTIC_GROUP__STRING_STRING:
				return createSemanticGroup((String)arguments.get(0), (String)arguments.get(1));
			case QueriesPackage.GROUPED_SEARCH_RESULT___ADD_SEMANTIC_NODE_TO_SEMANTIC_GROUP__SEMANTICGROUP_SEMANTICNODE:
				addSemanticNodeToSemanticGroup((SemanticGroup)arguments.get(0), (SemanticNode)arguments.get(1));
				return null;
			case QueriesPackage.GROUPED_SEARCH_RESULT___ADD_DATA_PROPERTY_TO_SEMANTIC_GROUP__SEMANTICGROUP_DATAPROPERTY:
				addDataPropertyToSemanticGroup((SemanticGroup)arguments.get(0), (DataProperty)arguments.get(1));
				return null;
			case QueriesPackage.GROUPED_SEARCH_RESULT___ADD_OBJECT_PROPERTY_TO_SEMANTIC_GROUP__SEMANTICGROUP_OBJECTPROPERTY:
				addObjectPropertyToSemanticGroup((SemanticGroup)arguments.get(0), (ObjectProperty)arguments.get(1));
				return null;
			case QueriesPackage.GROUPED_SEARCH_RESULT___GET_OPTION_VALUE__STRING:
				return getOptionValue((String)arguments.get(0));
			case QueriesPackage.GROUPED_SEARCH_RESULT___ADD_NAMED_ELEMENT_TO_SEMANTIC_GROUP__SEMANTICGROUP_NAMEDELEMENT:
				addNamedElementToSemanticGroup((SemanticGroup)arguments.get(0), (NamedElement)arguments.get(1));
				return null;
			case QueriesPackage.GROUPED_SEARCH_RESULT___ADD_RESOURCE_TO_SEMANTIC_GROUP__SEMANTICGROUP_RESOURCE:
				addResourceToSemanticGroup((SemanticGroup)arguments.get(0), (Resource)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GroupedSearchResultImpl
