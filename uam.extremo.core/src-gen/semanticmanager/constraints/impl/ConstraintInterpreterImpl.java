/**
 */
package semanticmanager.constraints.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import semanticmanager.constraints.Constraint;
import semanticmanager.constraints.ConstraintInterpreter;
import semanticmanager.constraints.ConstraintResult;
import semanticmanager.constraints.ConstraintsPackage;

import semanticmanager.dataModel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Interpreter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticmanager.constraints.impl.ConstraintInterpreterImpl#getId <em>Id</em>}</li>
 *   <li>{@link semanticmanager.constraints.impl.ConstraintInterpreterImpl#getName <em>Name</em>}</li>
 *   <li>{@link semanticmanager.constraints.impl.ConstraintInterpreterImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link semanticmanager.constraints.impl.ConstraintInterpreterImpl#getEvals <em>Evals</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConstraintInterpreterImpl extends MinimalEObjectImpl.Container implements ConstraintInterpreter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintInterpreterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Constraint> getConstraints() {
		return (EList<Constraint>)eGet(ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER__CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConstraintResult> getEvals() {
		return (EList<ConstraintResult>)eGet(ConstraintsPackage.Literals.CONSTRAINT_INTERPRETER__EVALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eval(Constraint constraint, NamedElement namedElement) {
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
			case ConstraintsPackage.CONSTRAINT_INTERPRETER___EVAL__CONSTRAINT_NAMEDELEMENT:
				return eval((Constraint)arguments.get(0), (NamedElement)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstraintInterpreterImpl
