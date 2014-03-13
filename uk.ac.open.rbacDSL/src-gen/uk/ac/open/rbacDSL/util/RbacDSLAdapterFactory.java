/**
 */
package uk.ac.open.rbacDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.open.rbacDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.open.rbacDSL.RbacDSLPackage
 * @generated
 */
public class RbacDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RbacDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RbacDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RbacDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RbacDSLSwitch<Adapter> modelSwitch =
    new RbacDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseRbac(Rbac object)
      {
        return createRbacAdapter();
      }
      @Override
      public Adapter casePolicy(Policy object)
      {
        return createPolicyAdapter();
      }
      @Override
      public Adapter caseScenarios(Scenarios object)
      {
        return createScenariosAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter casePermission(Permission object)
      {
        return createPermissionAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseUserScenario(UserScenario object)
      {
        return createUserScenarioAdapter();
      }
      @Override
      public Adapter caseGrantedScenario(GrantedScenario object)
      {
        return createGrantedScenarioAdapter();
      }
      @Override
      public Adapter caseForbiddenScenario(ForbiddenScenario object)
      {
        return createForbiddenScenarioAdapter();
      }
      @Override
      public Adapter caseUserRoleScenario(UserRoleScenario object)
      {
        return createUserRoleScenarioAdapter();
      }
      @Override
      public Adapter caseResourceRoleScenario(ResourceRoleScenario object)
      {
        return createResourceRoleScenarioAdapter();
      }
      @Override
      public Adapter caseResourceScenario(ResourceScenario object)
      {
        return createResourceScenarioAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.Rbac <em>Rbac</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.Rbac
   * @generated
   */
  public Adapter createRbacAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.Policy
   * @generated
   */
  public Adapter createPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.Scenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.Scenarios
   * @generated
   */
  public Adapter createScenariosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.Permission
   * @generated
   */
  public Adapter createPermissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.UserScenario <em>User Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.UserScenario
   * @generated
   */
  public Adapter createUserScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.GrantedScenario <em>Granted Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.GrantedScenario
   * @generated
   */
  public Adapter createGrantedScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.ForbiddenScenario <em>Forbidden Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.ForbiddenScenario
   * @generated
   */
  public Adapter createForbiddenScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.UserRoleScenario <em>User Role Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.UserRoleScenario
   * @generated
   */
  public Adapter createUserRoleScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.ResourceRoleScenario <em>Resource Role Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.ResourceRoleScenario
   * @generated
   */
  public Adapter createResourceRoleScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.rbacDSL.ResourceScenario <em>Resource Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.rbacDSL.ResourceScenario
   * @generated
   */
  public Adapter createResourceScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RbacDSLAdapterFactory
