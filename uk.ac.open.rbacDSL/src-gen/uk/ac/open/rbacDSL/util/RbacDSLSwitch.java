/**
 */
package uk.ac.open.rbacDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.open.rbacDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.open.rbacDSL.RbacDSLPackage
 * @generated
 */
public class RbacDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RbacDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RbacDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RbacDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RbacDSLPackage.RBAC:
      {
        Rbac rbac = (Rbac)theEObject;
        T result = caseRbac(rbac);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.POLICY_ELEMENT:
      {
        PolicyElement policyElement = (PolicyElement)theEObject;
        T result = casePolicyElement(policyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.SCENARIO_ELEMENT:
      {
        ScenarioElement scenarioElement = (ScenarioElement)theEObject;
        T result = caseScenarioElement(scenarioElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.USER:
      {
        User user = (User)theEObject;
        T result = caseUser(user);
        if (result == null) result = casePolicyElement(user);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = casePolicyElement(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.PERMISSION:
      {
        Permission permission = (Permission)theEObject;
        T result = casePermission(permission);
        if (result == null) result = casePolicyElement(permission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.RBAC_OBJECT:
      {
        RBACObject rbacObject = (RBACObject)theEObject;
        T result = caseRBACObject(rbacObject);
        if (result == null) result = casePolicyElement(rbacObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.GRANTED_SCENARIO:
      {
        GrantedScenario grantedScenario = (GrantedScenario)theEObject;
        T result = caseGrantedScenario(grantedScenario);
        if (result == null) result = caseScenarioElement(grantedScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.FORBIDDEN_SCENARIO:
      {
        ForbiddenScenario forbiddenScenario = (ForbiddenScenario)theEObject;
        T result = caseForbiddenScenario(forbiddenScenario);
        if (result == null) result = caseScenarioElement(forbiddenScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.USER_ROLE_SCENARIO:
      {
        UserRoleScenario userRoleScenario = (UserRoleScenario)theEObject;
        T result = caseUserRoleScenario(userRoleScenario);
        if (result == null) result = caseScenarioElement(userRoleScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.OBJECT_ROLE_SCENARIO:
      {
        ObjectRoleScenario objectRoleScenario = (ObjectRoleScenario)theEObject;
        T result = caseObjectRoleScenario(objectRoleScenario);
        if (result == null) result = caseScenarioElement(objectRoleScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RbacDSLPackage.OBJECT_SCENARIO:
      {
        ObjectScenario objectScenario = (ObjectScenario)theEObject;
        T result = caseObjectScenario(objectScenario);
        if (result == null) result = caseScenarioElement(objectScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rbac</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rbac</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRbac(Rbac object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Policy Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Policy Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolicyElement(PolicyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioElement(ScenarioElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUser(User object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermission(Permission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RBAC Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RBAC Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRBACObject(RBACObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Granted Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Granted Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrantedScenario(GrantedScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forbidden Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forbidden Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForbiddenScenario(ForbiddenScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Role Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Role Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserRoleScenario(UserRoleScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Role Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Role Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectRoleScenario(ObjectRoleScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectScenario(ObjectScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RbacDSLSwitch
