/**
 */
package uk.ac.open.rbacDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.open.rbacDSL.ForbiddenScenario;
import uk.ac.open.rbacDSL.GrantedScenario;
import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.Policy;
import uk.ac.open.rbacDSL.Rbac;
import uk.ac.open.rbacDSL.RbacDSLFactory;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Resource;
import uk.ac.open.rbacDSL.ResourceRoleScenario;
import uk.ac.open.rbacDSL.ResourceScenario;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.rbacDSL.Scenarios;
import uk.ac.open.rbacDSL.User;
import uk.ac.open.rbacDSL.UserRoleScenario;
import uk.ac.open.rbacDSL.UserScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RbacDSLPackageImpl extends EPackageImpl implements RbacDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rbacEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass policyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenariosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass permissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grantedScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forbiddenScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userRoleScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceRoleScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceScenarioEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RbacDSLPackageImpl()
  {
    super(eNS_URI, RbacDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RbacDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RbacDSLPackage init()
  {
    if (isInited) return (RbacDSLPackage)EPackage.Registry.INSTANCE.getEPackage(RbacDSLPackage.eNS_URI);

    // Obtain or create and register package
    RbacDSLPackageImpl theRbacDSLPackage = (RbacDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RbacDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RbacDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRbacDSLPackage.createPackageContents();

    // Initialize created meta-data
    theRbacDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRbacDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RbacDSLPackage.eNS_URI, theRbacDSLPackage);
    return theRbacDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRbac()
  {
    return rbacEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRbac_Policy()
  {
    return (EReference)rbacEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRbac_Scenarios()
  {
    return (EReference)rbacEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolicy()
  {
    return policyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Users()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Roles()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Permissions()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Resources()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenarios()
  {
    return scenariosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarios_UserScenarios()
  {
    return (EReference)scenariosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarios_UserRoleScenarios()
  {
    return (EReference)scenariosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarios_ResourceRoleScenarios()
  {
    return (EReference)scenariosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarios_RoleScenarios()
  {
    return (EReference)scenariosEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Name()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_Roles()
  {
    return (EReference)userEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Parent()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Ssod()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Dsod()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Permissions()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPermission()
  {
    return permissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPermission_Name()
  {
    return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_Permissions()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserScenario()
  {
    return userScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUserScenario_Name()
  {
    return (EAttribute)userScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserScenario_User()
  {
    return (EReference)userScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserScenario_Roles()
  {
    return (EReference)userScenarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserScenario_Resources()
  {
    return (EReference)userScenarioEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrantedScenario()
  {
    return grantedScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForbiddenScenario()
  {
    return forbiddenScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserRoleScenario()
  {
    return userRoleScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUserRoleScenario_Name()
  {
    return (EAttribute)userRoleScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserRoleScenario_Roles()
  {
    return (EReference)userRoleScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceRoleScenario()
  {
    return resourceRoleScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceRoleScenario_Name()
  {
    return (EAttribute)resourceRoleScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceRoleScenario_Role()
  {
    return (EReference)resourceRoleScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceRoleScenario_Resources()
  {
    return (EReference)resourceRoleScenarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceScenario()
  {
    return resourceScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceScenario_Name()
  {
    return (EAttribute)resourceScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceScenario_Resources()
  {
    return (EReference)resourceScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RbacDSLFactory getRbacDSLFactory()
  {
    return (RbacDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rbacEClass = createEClass(RBAC);
    createEReference(rbacEClass, RBAC__POLICY);
    createEReference(rbacEClass, RBAC__SCENARIOS);

    policyEClass = createEClass(POLICY);
    createEReference(policyEClass, POLICY__USERS);
    createEReference(policyEClass, POLICY__ROLES);
    createEReference(policyEClass, POLICY__PERMISSIONS);
    createEReference(policyEClass, POLICY__RESOURCES);

    scenariosEClass = createEClass(SCENARIOS);
    createEReference(scenariosEClass, SCENARIOS__USER_SCENARIOS);
    createEReference(scenariosEClass, SCENARIOS__USER_ROLE_SCENARIOS);
    createEReference(scenariosEClass, SCENARIOS__RESOURCE_ROLE_SCENARIOS);
    createEReference(scenariosEClass, SCENARIOS__ROLE_SCENARIOS);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__NAME);
    createEReference(userEClass, USER__ROLES);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);
    createEReference(roleEClass, ROLE__PARENT);
    createEReference(roleEClass, ROLE__SSOD);
    createEReference(roleEClass, ROLE__DSOD);
    createEReference(roleEClass, ROLE__PERMISSIONS);

    permissionEClass = createEClass(PERMISSION);
    createEAttribute(permissionEClass, PERMISSION__NAME);

    resourceEClass = createEClass(RESOURCE);
    createEAttribute(resourceEClass, RESOURCE__NAME);
    createEReference(resourceEClass, RESOURCE__PERMISSIONS);

    userScenarioEClass = createEClass(USER_SCENARIO);
    createEAttribute(userScenarioEClass, USER_SCENARIO__NAME);
    createEReference(userScenarioEClass, USER_SCENARIO__USER);
    createEReference(userScenarioEClass, USER_SCENARIO__ROLES);
    createEReference(userScenarioEClass, USER_SCENARIO__RESOURCES);

    grantedScenarioEClass = createEClass(GRANTED_SCENARIO);

    forbiddenScenarioEClass = createEClass(FORBIDDEN_SCENARIO);

    userRoleScenarioEClass = createEClass(USER_ROLE_SCENARIO);
    createEAttribute(userRoleScenarioEClass, USER_ROLE_SCENARIO__NAME);
    createEReference(userRoleScenarioEClass, USER_ROLE_SCENARIO__ROLES);

    resourceRoleScenarioEClass = createEClass(RESOURCE_ROLE_SCENARIO);
    createEAttribute(resourceRoleScenarioEClass, RESOURCE_ROLE_SCENARIO__NAME);
    createEReference(resourceRoleScenarioEClass, RESOURCE_ROLE_SCENARIO__ROLE);
    createEReference(resourceRoleScenarioEClass, RESOURCE_ROLE_SCENARIO__RESOURCES);

    resourceScenarioEClass = createEClass(RESOURCE_SCENARIO);
    createEAttribute(resourceScenarioEClass, RESOURCE_SCENARIO__NAME);
    createEReference(resourceScenarioEClass, RESOURCE_SCENARIO__RESOURCES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    grantedScenarioEClass.getESuperTypes().add(this.getUserScenario());
    forbiddenScenarioEClass.getESuperTypes().add(this.getUserScenario());

    // Initialize classes and features; add operations and parameters
    initEClass(rbacEClass, Rbac.class, "Rbac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRbac_Policy(), this.getPolicy(), null, "policy", null, 0, 1, Rbac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRbac_Scenarios(), this.getScenarios(), null, "scenarios", null, 0, 1, Rbac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPolicy_Users(), this.getUser(), null, "users", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Roles(), this.getRole(), null, "roles", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Resources(), this.getResource(), null, "resources", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scenariosEClass, Scenarios.class, "Scenarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScenarios_UserScenarios(), this.getUserScenario(), null, "userScenarios", null, 0, -1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenarios_UserRoleScenarios(), this.getUserRoleScenario(), null, "userRoleScenarios", null, 0, -1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenarios_ResourceRoleScenarios(), this.getResourceRoleScenario(), null, "resourceRoleScenarios", null, 0, -1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenarios_RoleScenarios(), this.getResourceScenario(), null, "roleScenarios", null, 0, -1, Scenarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_Roles(), this.getRole(), null, "roles", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Parent(), this.getRole(), null, "parent", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Ssod(), this.getRole(), null, "ssod", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Dsod(), this.getRole(), null, "dsod", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResource_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userScenarioEClass, UserScenario.class, "UserScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUserScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserScenario_User(), this.getUser(), null, "user", null, 0, 1, UserScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserScenario_Roles(), this.getRole(), null, "roles", null, 0, -1, UserScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserScenario_Resources(), this.getResource(), null, "resources", null, 0, -1, UserScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grantedScenarioEClass, GrantedScenario.class, "GrantedScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forbiddenScenarioEClass, ForbiddenScenario.class, "ForbiddenScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(userRoleScenarioEClass, UserRoleScenario.class, "UserRoleScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUserRoleScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserRoleScenario_Roles(), this.getRole(), null, "roles", null, 0, -1, UserRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceRoleScenarioEClass, ResourceRoleScenario.class, "ResourceRoleScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceRoleScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceRoleScenario_Role(), this.getRole(), null, "role", null, 0, -1, ResourceRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceRoleScenario_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourceRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceScenarioEClass, ResourceScenario.class, "ResourceScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceScenario_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourceScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RbacDSLPackageImpl
