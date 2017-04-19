/**
 */
package semanticmanager.dataModel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import semanticmanager.dataModel.DataModelPackage;
import semanticmanager.dataModel.Property;
import semanticmanager.dataModel.Resource;
import semanticmanager.dataModel.SemanticNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticmanager.dataModel.impl.SemanticNodeImpl#getSupers <em>Supers</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.SemanticNodeImpl#getSubs <em>Subs</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.SemanticNodeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.SemanticNodeImpl#getResourceFrom <em>Resource From</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.SemanticNodeImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticNodeImpl extends NamedElementImpl implements SemanticNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelPackage.Literals.SEMANTIC_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SemanticNode> getSupers() {
		return (EList<SemanticNode>)eGet(DataModelPackage.Literals.SEMANTIC_NODE__SUPERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SemanticNode> getSubs() {
		return (EList<SemanticNode>)eGet(DataModelPackage.Literals.SEMANTIC_NODE__SUBS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>)eGet(DataModelPackage.Literals.SEMANTIC_NODE__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResourceFrom() {
		return (Resource)eGet(DataModelPackage.Literals.SEMANTIC_NODE__RESOURCE_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceFrom(Resource newResourceFrom) {
		eSet(DataModelPackage.Literals.SEMANTIC_NODE__RESOURCE_FROM, newResourceFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eGet(DataModelPackage.Literals.SEMANTIC_NODE__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eSet(DataModelPackage.Literals.SEMANTIC_NODE__ABSTRACT, newAbstract);
	}

} //SemanticNodeImpl
