/**
 */
package uam.extremo.core;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uam.extremo.core.Service#getId <em>Id</em>}</li>
 *   <li>{@link uam.extremo.core.Service#getName <em>Name</em>}</li>
 *   <li>{@link uam.extremo.core.Service#getFilterBy <em>Filter By</em>}</li>
 * </ul>
 *
 * @see uam.extremo.core.SemanticmanagerPackage#getService()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Service extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see uam.extremo.core.SemanticmanagerPackage#getService_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Service#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uam.extremo.core.SemanticmanagerPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Filter By</b></em>' attribute.
	 * The literals are from the enumeration {@link uam.extremo.core.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter By</em>' attribute.
	 * @see uam.extremo.core.Type
	 * @see #setFilterBy(Type)
	 * @see uam.extremo.core.SemanticmanagerPackage#getService_FilterBy()
	 * @model
	 * @generated
	 */
	Type getFilterBy();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Service#getFilterBy <em>Filter By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter By</em>' attribute.
	 * @see uam.extremo.core.Type
	 * @see #getFilterBy()
	 * @generated
	 */
	void setFilterBy(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionRequired="true" valueRequired="true"
	 * @generated
	 */
	boolean matches(String expression, String value);

} // Service