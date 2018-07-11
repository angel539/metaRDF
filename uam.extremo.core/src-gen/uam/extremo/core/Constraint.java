/**
 */
package uam.extremo.core;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uam.extremo.core.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link uam.extremo.core.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link uam.extremo.core.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link uam.extremo.core.Constraint#getAppliedTo <em>Applied To</em>}</li>
 *   <li>{@link uam.extremo.core.Constraint#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link uam.extremo.core.Constraint#getInterpreter <em>Interpreter</em>}</li>
 * </ul>
 *
 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Constraint extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Constraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Constraint#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Applied To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uam.extremo.core.NamedElement#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied To</em>' container reference.
	 * @see #setAppliedTo(NamedElement)
	 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint_AppliedTo()
	 * @see uam.extremo.core.NamedElement#getConstraints
	 * @model opposite="constraints" transient="false"
	 * @generated
	 */
	NamedElement getAppliedTo();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Constraint#getAppliedTo <em>Applied To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied To</em>' container reference.
	 * @see #getAppliedTo()
	 * @generated
	 */
	void setAppliedTo(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Evaluations</b></em>' reference list.
	 * The list contents are of type {@link uam.extremo.core.ConstraintResult}.
	 * It is bidirectional and its opposite is '{@link uam.extremo.core.ConstraintResult#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluations</em>' reference list.
	 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint_Evaluations()
	 * @see uam.extremo.core.ConstraintResult#getConstraint
	 * @model opposite="constraint"
	 * @generated
	 */
	EList<ConstraintResult> getEvaluations();

	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uam.extremo.core.ConstraintInterpreter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpreter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpreter</em>' reference.
	 * @see #setInterpreter(ConstraintInterpreter)
	 * @see uam.extremo.core.SemanticmanagerPackage#getConstraint_Interpreter()
	 * @see uam.extremo.core.ConstraintInterpreter#getConstraints
	 * @model opposite="constraints"
	 * @generated
	 */
	ConstraintInterpreter getInterpreter();

	/**
	 * Sets the value of the '{@link uam.extremo.core.Constraint#getInterpreter <em>Interpreter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpreter</em>' reference.
	 * @see #getInterpreter()
	 * @generated
	 */
	void setInterpreter(ConstraintInterpreter value);

} // Constraint