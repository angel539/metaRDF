/**
 */
package semanticmanager.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import semanticmanager.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticmanagerFactoryImpl extends EFactoryImpl implements SemanticmanagerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticmanagerFactory init() {
		try {
			SemanticmanagerFactory theSemanticmanagerFactory = (SemanticmanagerFactory)EPackage.Registry.INSTANCE.getEFactory(SemanticmanagerPackage.eNS_URI);
			if (theSemanticmanagerFactory != null) {
				return theSemanticmanagerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticmanagerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticmanagerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SemanticmanagerPackage.REPOSITORY_MANAGER: return createRepositoryManager();
			case SemanticmanagerPackage.REPOSITORY: return createRepository();
			case SemanticmanagerPackage.RESOURCE: return createResource();
			case SemanticmanagerPackage.SEMANTIC_NODE: return createSemanticNode();
			case SemanticmanagerPackage.OBJECT_PROPERTY: return createObjectProperty();
			case SemanticmanagerPackage.DATA_PROPERTY: return createDataProperty();
			case SemanticmanagerPackage.SEMANTIC_GROUP: return createSemanticGroup();
			case SemanticmanagerPackage.SEARCH_OPTION: return createSearchOption();
			case SemanticmanagerPackage.SEARCH_RESULT: return createSearchResult();
			case SemanticmanagerPackage.SEARCH_RESULT_OPTION_STRING_VALUE: return createSearchResultOptionStringValue();
			case SemanticmanagerPackage.SEARCH_RESULT_OPTION_NAMED_ELEMENT_LIST_VALUE: return createSearchResultOptionNamedElementListValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SemanticmanagerPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SemanticmanagerPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryManager createRepositoryManager() {
		RepositoryManagerImpl repositoryManager = new RepositoryManagerImpl();
		return repositoryManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticNode createSemanticNode() {
		SemanticNodeImpl semanticNode = new SemanticNodeImpl();
		return semanticNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticGroup createSemanticGroup() {
		SemanticGroupImpl semanticGroup = new SemanticGroupImpl();
		return semanticGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchOption createSearchOption() {
		SearchOptionImpl searchOption = new SearchOptionImpl();
		return searchOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResult createSearchResult() {
		SearchResultImpl searchResult = new SearchResultImpl();
		return searchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResultOptionStringValue createSearchResultOptionStringValue() {
		SearchResultOptionStringValueImpl searchResultOptionStringValue = new SearchResultOptionStringValueImpl();
		return searchResultOptionStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResultOptionNamedElementListValue createSearchResultOptionNamedElementListValue() {
		SearchResultOptionNamedElementListValueImpl searchResultOptionNamedElementListValue = new SearchResultOptionNamedElementListValueImpl();
		return searchResultOptionNamedElementListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticmanagerPackage getSemanticmanagerPackage() {
		return (SemanticmanagerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticmanagerPackage getPackage() {
		return SemanticmanagerPackage.eINSTANCE;
	}

} //SemanticmanagerFactoryImpl
