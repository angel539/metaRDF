/**
 */
package semanticmanager.dataModel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import semanticmanager.dataModel.DataModelPackage;
import semanticmanager.dataModel.Repository;
import semanticmanager.dataModel.Resource;
import semanticmanager.dataModel.SemanticNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticmanager.dataModel.impl.ResourceImpl#isActive <em>Active</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.ResourceImpl#isAlive <em>Alive</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.ResourceImpl#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.ResourceImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.ResourceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link semanticmanager.dataModel.impl.ResourceImpl#getRepositoryFrom <em>Repository From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends NamedElementImpl implements Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (Boolean)eGet(DataModelPackage.Literals.RESOURCE__ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		eSet(DataModelPackage.Literals.RESOURCE__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlive() {
		return (Boolean)eGet(DataModelPackage.Literals.RESOURCE__ALIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlive(boolean newAlive) {
		eSet(DataModelPackage.Literals.RESOURCE__ALIVE, newAlive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssistant() {
		return (String)eGet(DataModelPackage.Literals.RESOURCE__ASSISTANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssistant(String newAssistant) {
		eSet(DataModelPackage.Literals.RESOURCE__ASSISTANT, newAssistant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SemanticNode> getNodes() {
		return (EList<SemanticNode>)eGet(DataModelPackage.Literals.RESOURCE__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return (String)eGet(DataModelPackage.Literals.RESOURCE__URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		eSet(DataModelPackage.Literals.RESOURCE__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepositoryFrom() {
		return (Repository)eGet(DataModelPackage.Literals.RESOURCE__REPOSITORY_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryFrom(Repository newRepositoryFrom) {
		eSet(DataModelPackage.Literals.RESOURCE__REPOSITORY_FROM, newRepositoryFrom);
	}

} //ResourceImpl
