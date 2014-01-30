/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.open.rbacDSL.RbacDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RbacDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rbacDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/open/RbacDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rbacDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RbacDSLPackage eINSTANCE = uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.RbacImpl <em>Rbac</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.RbacImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getRbac()
   * @generated
   */
  int RBAC = 0;

  /**
   * The feature id for the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC__POLICY = 0;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC__SCENARIOS = 1;

  /**
   * The number of structural features of the '<em>Rbac</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.PolicyImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPolicy()
   * @generated
   */
  int POLICY = 1;

  /**
   * The feature id for the '<em><b>Users</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__USERS = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__ROLES = 1;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PERMISSIONS = 2;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RESOURCES = 3;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.ScenariosImpl <em>Scenarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.ScenariosImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getScenarios()
   * @generated
   */
  int SCENARIOS = 2;

  /**
   * The feature id for the '<em><b>User Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS__USER_SCENARIOS = 0;

  /**
   * The feature id for the '<em><b>User Role Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS__USER_ROLE_SCENARIOS = 1;

  /**
   * The number of structural features of the '<em>Scenarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.UserImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getUser()
   * @generated
   */
  int USER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__ROLES = 1;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.RoleImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getRole()
   * @generated
   */
  int ROLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__PARENT = 1;

  /**
   * The feature id for the '<em><b>Ssod</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__SSOD = 2;

  /**
   * The feature id for the '<em><b>Dsod</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__DSOD = 3;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__PERMISSIONS = 4;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.PermissionImpl <em>Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.PermissionImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPermission()
   * @generated
   */
  int PERMISSION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__NAME = 0;

  /**
   * The number of structural features of the '<em>Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.ResourceImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__PERMISSIONS = 1;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.UserScenarioImpl <em>User Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.UserScenarioImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getUserScenario()
   * @generated
   */
  int USER_SCENARIO = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_SCENARIO__USER = 1;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_SCENARIO__ROLES = 2;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_SCENARIO__RESOURCES = 3;

  /**
   * The number of structural features of the '<em>User Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_SCENARIO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.GrantedScenarioImpl <em>Granted Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.GrantedScenarioImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getGrantedScenario()
   * @generated
   */
  int GRANTED_SCENARIO = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__NAME = USER_SCENARIO__NAME;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__USER = USER_SCENARIO__USER;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__ROLES = USER_SCENARIO__ROLES;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__RESOURCES = USER_SCENARIO__RESOURCES;

  /**
   * The number of structural features of the '<em>Granted Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO_FEATURE_COUNT = USER_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl <em>Forbidden Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getForbiddenScenario()
   * @generated
   */
  int FORBIDDEN_SCENARIO = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__NAME = USER_SCENARIO__NAME;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__USER = USER_SCENARIO__USER;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__ROLES = USER_SCENARIO__ROLES;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__RESOURCES = USER_SCENARIO__RESOURCES;

  /**
   * The number of structural features of the '<em>Forbidden Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO_FEATURE_COUNT = USER_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.UserRoleScenarioImpl <em>User Role Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.UserRoleScenarioImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getUserRoleScenario()
   * @generated
   */
  int USER_ROLE_SCENARIO = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_SCENARIO__ROLES = 1;

  /**
   * The number of structural features of the '<em>User Role Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_SCENARIO_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Rbac <em>Rbac</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rbac</em>'.
   * @see uk.ac.open.rbacDSL.Rbac
   * @generated
   */
  EClass getRbac();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.rbacDSL.Rbac#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Policy</em>'.
   * @see uk.ac.open.rbacDSL.Rbac#getPolicy()
   * @see #getRbac()
   * @generated
   */
  EReference getRbac_Policy();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.rbacDSL.Rbac#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scenarios</em>'.
   * @see uk.ac.open.rbacDSL.Rbac#getScenarios()
   * @see #getRbac()
   * @generated
   */
  EReference getRbac_Scenarios();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see uk.ac.open.rbacDSL.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Policy#getUsers <em>Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Users</em>'.
   * @see uk.ac.open.rbacDSL.Policy#getUsers()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Users();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Policy#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbacDSL.Policy#getRoles()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Policy#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Permissions</em>'.
   * @see uk.ac.open.rbacDSL.Policy#getPermissions()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Permissions();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Policy#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see uk.ac.open.rbacDSL.Policy#getResources()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Resources();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Scenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenarios</em>'.
   * @see uk.ac.open.rbacDSL.Scenarios
   * @generated
   */
  EClass getScenarios();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Scenarios#getUserScenarios <em>User Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>User Scenarios</em>'.
   * @see uk.ac.open.rbacDSL.Scenarios#getUserScenarios()
   * @see #getScenarios()
   * @generated
   */
  EReference getScenarios_UserScenarios();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Scenarios#getUserRoleScenarios <em>User Role Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>User Role Scenarios</em>'.
   * @see uk.ac.open.rbacDSL.Scenarios#getUserRoleScenarios()
   * @see #getScenarios()
   * @generated
   */
  EReference getScenarios_UserRoleScenarios();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see uk.ac.open.rbacDSL.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.User#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.User#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.User#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbacDSL.User#getRoles()
   * @see #getUser()
   * @generated
   */
  EReference getUser_Roles();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see uk.ac.open.rbacDSL.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.Role#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parent</em>'.
   * @see uk.ac.open.rbacDSL.Role#getParent()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Parent();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.Role#getSsod <em>Ssod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ssod</em>'.
   * @see uk.ac.open.rbacDSL.Role#getSsod()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Ssod();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.Role#getDsod <em>Dsod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dsod</em>'.
   * @see uk.ac.open.rbacDSL.Role#getDsod()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Dsod();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.Role#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Permissions</em>'.
   * @see uk.ac.open.rbacDSL.Role#getPermissions()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Permissions();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Permission</em>'.
   * @see uk.ac.open.rbacDSL.Permission
   * @generated
   */
  EClass getPermission();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.Permission#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.Permission#getName()
   * @see #getPermission()
   * @generated
   */
  EAttribute getPermission_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see uk.ac.open.rbacDSL.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.Resource#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Permissions</em>'.
   * @see uk.ac.open.rbacDSL.Resource#getPermissions()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Permissions();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.UserScenario <em>User Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Scenario</em>'.
   * @see uk.ac.open.rbacDSL.UserScenario
   * @generated
   */
  EClass getUserScenario();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.UserScenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.UserScenario#getName()
   * @see #getUserScenario()
   * @generated
   */
  EAttribute getUserScenario_Name();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbacDSL.UserScenario#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see uk.ac.open.rbacDSL.UserScenario#getUser()
   * @see #getUserScenario()
   * @generated
   */
  EReference getUserScenario_User();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.UserScenario#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbacDSL.UserScenario#getRoles()
   * @see #getUserScenario()
   * @generated
   */
  EReference getUserScenario_Roles();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.UserScenario#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see uk.ac.open.rbacDSL.UserScenario#getResources()
   * @see #getUserScenario()
   * @generated
   */
  EReference getUserScenario_Resources();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.GrantedScenario <em>Granted Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Granted Scenario</em>'.
   * @see uk.ac.open.rbacDSL.GrantedScenario
   * @generated
   */
  EClass getGrantedScenario();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.ForbiddenScenario <em>Forbidden Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forbidden Scenario</em>'.
   * @see uk.ac.open.rbacDSL.ForbiddenScenario
   * @generated
   */
  EClass getForbiddenScenario();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.UserRoleScenario <em>User Role Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Role Scenario</em>'.
   * @see uk.ac.open.rbacDSL.UserRoleScenario
   * @generated
   */
  EClass getUserRoleScenario();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.UserRoleScenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.UserRoleScenario#getName()
   * @see #getUserRoleScenario()
   * @generated
   */
  EAttribute getUserRoleScenario_Name();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.UserRoleScenario#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbacDSL.UserRoleScenario#getRoles()
   * @see #getUserRoleScenario()
   * @generated
   */
  EReference getUserRoleScenario_Roles();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RbacDSLFactory getRbacDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.RbacImpl <em>Rbac</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.RbacImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getRbac()
     * @generated
     */
    EClass RBAC = eINSTANCE.getRbac();

    /**
     * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RBAC__POLICY = eINSTANCE.getRbac_Policy();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RBAC__SCENARIOS = eINSTANCE.getRbac_Scenarios();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.PolicyImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPolicy()
     * @generated
     */
    EClass POLICY = eINSTANCE.getPolicy();

    /**
     * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__USERS = eINSTANCE.getPolicy_Users();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__ROLES = eINSTANCE.getPolicy_Roles();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__PERMISSIONS = eINSTANCE.getPolicy_Permissions();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__RESOURCES = eINSTANCE.getPolicy_Resources();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.ScenariosImpl <em>Scenarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.ScenariosImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getScenarios()
     * @generated
     */
    EClass SCENARIOS = eINSTANCE.getScenarios();

    /**
     * The meta object literal for the '<em><b>User Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIOS__USER_SCENARIOS = eINSTANCE.getScenarios_UserScenarios();

    /**
     * The meta object literal for the '<em><b>User Role Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIOS__USER_ROLE_SCENARIOS = eINSTANCE.getScenarios_UserRoleScenarios();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.UserImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__NAME = eINSTANCE.getUser_Name();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__ROLES = eINSTANCE.getUser_Roles();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.RoleImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__PARENT = eINSTANCE.getRole_Parent();

    /**
     * The meta object literal for the '<em><b>Ssod</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__SSOD = eINSTANCE.getRole_Ssod();

    /**
     * The meta object literal for the '<em><b>Dsod</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__DSOD = eINSTANCE.getRole_Dsod();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.PermissionImpl <em>Permission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.PermissionImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPermission()
     * @generated
     */
    EClass PERMISSION = eINSTANCE.getPermission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.ResourceImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__PERMISSIONS = eINSTANCE.getResource_Permissions();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.UserScenarioImpl <em>User Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.UserScenarioImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getUserScenario()
     * @generated
     */
    EClass USER_SCENARIO = eINSTANCE.getUserScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_SCENARIO__NAME = eINSTANCE.getUserScenario_Name();

    /**
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_SCENARIO__USER = eINSTANCE.getUserScenario_User();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_SCENARIO__ROLES = eINSTANCE.getUserScenario_Roles();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_SCENARIO__RESOURCES = eINSTANCE.getUserScenario_Resources();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.GrantedScenarioImpl <em>Granted Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.GrantedScenarioImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getGrantedScenario()
     * @generated
     */
    EClass GRANTED_SCENARIO = eINSTANCE.getGrantedScenario();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl <em>Forbidden Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getForbiddenScenario()
     * @generated
     */
    EClass FORBIDDEN_SCENARIO = eINSTANCE.getForbiddenScenario();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.UserRoleScenarioImpl <em>User Role Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.UserRoleScenarioImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getUserRoleScenario()
     * @generated
     */
    EClass USER_ROLE_SCENARIO = eINSTANCE.getUserRoleScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_ROLE_SCENARIO__NAME = eINSTANCE.getUserRoleScenario_Name();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_ROLE_SCENARIO__ROLES = eINSTANCE.getUserRoleScenario_Roles();

  }

} //RbacDSLPackage
