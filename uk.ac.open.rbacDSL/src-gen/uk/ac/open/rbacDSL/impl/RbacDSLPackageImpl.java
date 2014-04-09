/**
 */
package uk.ac.open.rbacDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.open.rbacDSL.Assignment;
import uk.ac.open.rbacDSL.ForbiddenScenario;
import uk.ac.open.rbacDSL.GrantedScenario;
import uk.ac.open.rbacDSL.ObjectRoleScenario;
import uk.ac.open.rbacDSL.ObjectScenario;
import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.PolicyElement;
import uk.ac.open.rbacDSL.RBACObject;
import uk.ac.open.rbacDSL.Rbac;
import uk.ac.open.rbacDSL.RbacDSLFactory;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.rbacDSL.ScenarioElement;
import uk.ac.open.rbacDSL.User;
import uk.ac.open.rbacDSL.UserRoleScenario;

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
  private EClass policyElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioElementEClass = null;

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
  private EClass assignmentEClass = null;

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
  private EClass rbacObjectEClass = null;

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
  private EClass objectRoleScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectScenarioEClass = null;

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
  public EReference getRbac_PolicyElements()
  {
    return (EReference)rbacEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRbac_ScenarioElements()
  {
    return (EReference)rbacEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolicyElement()
  {
    return policyElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicyElement_Name()
  {
    return (EAttribute)policyElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenarioElement()
  {
    return scenarioElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenarioElement_Name()
  {
    return (EAttribute)scenarioElementEClass.getEStructuralFeatures().get(0);
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
  public EReference getUser_Roles()
  {
    return (EReference)userEClass.getEStructuralFeatures().get(0);
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
  public EReference getRole_Parent()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Ssod()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Dsod()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Assignments()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Object()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Actions()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
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
  public EClass getRBACObject()
  {
    return rbacObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRBACObject_Permissions()
  {
    return (EReference)rbacObjectEClass.getEStructuralFeatures().get(0);
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
  public EReference getGrantedScenario_User()
  {
    return (EReference)grantedScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrantedScenario_Roles()
  {
    return (EReference)grantedScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrantedScenario_Object()
  {
    return (EReference)grantedScenarioEClass.getEStructuralFeatures().get(2);
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
  public EReference getForbiddenScenario_User()
  {
    return (EReference)forbiddenScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForbiddenScenario_Roles()
  {
    return (EReference)forbiddenScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForbiddenScenario_Object()
  {
    return (EReference)forbiddenScenarioEClass.getEStructuralFeatures().get(2);
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
  public EReference getUserRoleScenario_Roles()
  {
    return (EReference)userRoleScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectRoleScenario()
  {
    return objectRoleScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectRoleScenario_Role()
  {
    return (EReference)objectRoleScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectRoleScenario_Assignment()
  {
    return (EReference)objectRoleScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectScenario()
  {
    return objectScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectScenario_Assignment()
  {
    return (EReference)objectScenarioEClass.getEStructuralFeatures().get(0);
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
    createEReference(rbacEClass, RBAC__POLICY_ELEMENTS);
    createEReference(rbacEClass, RBAC__SCENARIO_ELEMENTS);

    policyElementEClass = createEClass(POLICY_ELEMENT);
    createEAttribute(policyElementEClass, POLICY_ELEMENT__NAME);

    scenarioElementEClass = createEClass(SCENARIO_ELEMENT);
    createEAttribute(scenarioElementEClass, SCENARIO_ELEMENT__NAME);

    userEClass = createEClass(USER);
    createEReference(userEClass, USER__ROLES);

    roleEClass = createEClass(ROLE);
    createEReference(roleEClass, ROLE__PARENT);
    createEReference(roleEClass, ROLE__SSOD);
    createEReference(roleEClass, ROLE__DSOD);
    createEReference(roleEClass, ROLE__ASSIGNMENTS);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__OBJECT);
    createEReference(assignmentEClass, ASSIGNMENT__ACTIONS);

    permissionEClass = createEClass(PERMISSION);

    rbacObjectEClass = createEClass(RBAC_OBJECT);
    createEReference(rbacObjectEClass, RBAC_OBJECT__PERMISSIONS);

    grantedScenarioEClass = createEClass(GRANTED_SCENARIO);
    createEReference(grantedScenarioEClass, GRANTED_SCENARIO__USER);
    createEReference(grantedScenarioEClass, GRANTED_SCENARIO__ROLES);
    createEReference(grantedScenarioEClass, GRANTED_SCENARIO__OBJECT);

    forbiddenScenarioEClass = createEClass(FORBIDDEN_SCENARIO);
    createEReference(forbiddenScenarioEClass, FORBIDDEN_SCENARIO__USER);
    createEReference(forbiddenScenarioEClass, FORBIDDEN_SCENARIO__ROLES);
    createEReference(forbiddenScenarioEClass, FORBIDDEN_SCENARIO__OBJECT);

    userRoleScenarioEClass = createEClass(USER_ROLE_SCENARIO);
    createEReference(userRoleScenarioEClass, USER_ROLE_SCENARIO__ROLES);

    objectRoleScenarioEClass = createEClass(OBJECT_ROLE_SCENARIO);
    createEReference(objectRoleScenarioEClass, OBJECT_ROLE_SCENARIO__ROLE);
    createEReference(objectRoleScenarioEClass, OBJECT_ROLE_SCENARIO__ASSIGNMENT);

    objectScenarioEClass = createEClass(OBJECT_SCENARIO);
    createEReference(objectScenarioEClass, OBJECT_SCENARIO__ASSIGNMENT);
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
    userEClass.getESuperTypes().add(this.getPolicyElement());
    roleEClass.getESuperTypes().add(this.getPolicyElement());
    permissionEClass.getESuperTypes().add(this.getPolicyElement());
    rbacObjectEClass.getESuperTypes().add(this.getPolicyElement());
    grantedScenarioEClass.getESuperTypes().add(this.getScenarioElement());
    forbiddenScenarioEClass.getESuperTypes().add(this.getScenarioElement());
    userRoleScenarioEClass.getESuperTypes().add(this.getScenarioElement());
    objectRoleScenarioEClass.getESuperTypes().add(this.getScenarioElement());
    objectScenarioEClass.getESuperTypes().add(this.getScenarioElement());

    // Initialize classes and features; add operations and parameters
    initEClass(rbacEClass, Rbac.class, "Rbac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRbac_PolicyElements(), this.getPolicyElement(), null, "policyElements", null, 0, -1, Rbac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRbac_ScenarioElements(), this.getScenarioElement(), null, "scenarioElements", null, 0, -1, Rbac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(policyElementEClass, PolicyElement.class, "PolicyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolicyElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PolicyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scenarioElementEClass, ScenarioElement.class, "ScenarioElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScenarioElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScenarioElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUser_Roles(), this.getRole(), null, "roles", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRole_Parent(), this.getRole(), null, "parent", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Ssod(), this.getRole(), null, "ssod", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Dsod(), this.getRole(), null, "dsod", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Object(), this.getRBACObject(), null, "object", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Actions(), this.getPermission(), null, "actions", null, 0, -1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rbacObjectEClass, RBACObject.class, "RBACObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRBACObject_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, RBACObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grantedScenarioEClass, GrantedScenario.class, "GrantedScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrantedScenario_User(), this.getUser(), null, "user", null, 0, 1, GrantedScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrantedScenario_Roles(), this.getRole(), null, "roles", null, 0, -1, GrantedScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrantedScenario_Object(), this.getAssignment(), null, "object", null, 0, -1, GrantedScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forbiddenScenarioEClass, ForbiddenScenario.class, "ForbiddenScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForbiddenScenario_User(), this.getUser(), null, "user", null, 0, 1, ForbiddenScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForbiddenScenario_Roles(), this.getRole(), null, "roles", null, 0, -1, ForbiddenScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForbiddenScenario_Object(), this.getAssignment(), null, "object", null, 0, -1, ForbiddenScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userRoleScenarioEClass, UserRoleScenario.class, "UserRoleScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserRoleScenario_Roles(), this.getRole(), null, "roles", null, 0, -1, UserRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectRoleScenarioEClass, ObjectRoleScenario.class, "ObjectRoleScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectRoleScenario_Role(), this.getRole(), null, "role", null, 0, -1, ObjectRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectRoleScenario_Assignment(), this.getAssignment(), null, "assignment", null, 0, -1, ObjectRoleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectScenarioEClass, ObjectScenario.class, "ObjectScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectScenario_Assignment(), this.getAssignment(), null, "assignment", null, 0, -1, ObjectScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RbacDSLPackageImpl
