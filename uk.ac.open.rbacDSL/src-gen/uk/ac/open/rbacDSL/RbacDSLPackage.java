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
   * The feature id for the '<em><b>Policy Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC__POLICY_ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Scenario Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC__SCENARIO_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Rbac</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.PolicyElementImpl <em>Policy Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.PolicyElementImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPolicyElement()
   * @generated
   */
  int POLICY_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Policy Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.ScenarioElementImpl <em>Scenario Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.ScenarioElementImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getScenarioElement()
   * @generated
   */
  int SCENARIO_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Scenario Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_ELEMENT_FEATURE_COUNT = 1;

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
  int USER__NAME = POLICY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__ROLES = POLICY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 1;

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
  int ROLE__NAME = POLICY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__PARENT = POLICY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ssod</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__SSOD = POLICY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dsod</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__DSOD = POLICY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ASSIGNMENTS = POLICY_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.AssignmentImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 5;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.PermissionImpl <em>Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.PermissionImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPermission()
   * @generated
   */
  int PERMISSION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__NAME = POLICY_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.RBACObjectImpl <em>RBAC Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.RBACObjectImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getRBACObject()
   * @generated
   */
  int RBAC_OBJECT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC_OBJECT__NAME = POLICY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC_OBJECT__PERMISSIONS = POLICY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RBAC Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC_OBJECT_FEATURE_COUNT = POLICY_ELEMENT_FEATURE_COUNT + 1;

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
  int GRANTED_SCENARIO__NAME = SCENARIO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__USER = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__ROLES = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO__OBJECT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Granted Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANTED_SCENARIO_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 3;

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
  int FORBIDDEN_SCENARIO__NAME = SCENARIO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__USER = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__ROLES = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO__OBJECT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Forbidden Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORBIDDEN_SCENARIO_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 3;

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
  int USER_ROLE_SCENARIO__NAME = SCENARIO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_SCENARIO__ROLES = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Role Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_SCENARIO_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.ObjectRoleScenarioImpl <em>Object Role Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.ObjectRoleScenarioImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getObjectRoleScenario()
   * @generated
   */
  int OBJECT_ROLE_SCENARIO = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ROLE_SCENARIO__NAME = SCENARIO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ROLE_SCENARIO__ROLE = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ROLE_SCENARIO__ASSIGNMENT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Role Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ROLE_SCENARIO_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbacDSL.impl.ObjectScenarioImpl <em>Object Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbacDSL.impl.ObjectScenarioImpl
   * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getObjectScenario()
   * @generated
   */
  int OBJECT_SCENARIO = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SCENARIO__NAME = SCENARIO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SCENARIO__ASSIGNMENT = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SCENARIO_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Rbac#getPolicyElements <em>Policy Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Policy Elements</em>'.
   * @see uk.ac.open.rbacDSL.Rbac#getPolicyElements()
   * @see #getRbac()
   * @generated
   */
  EReference getRbac_PolicyElements();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Rbac#getScenarioElements <em>Scenario Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenario Elements</em>'.
   * @see uk.ac.open.rbacDSL.Rbac#getScenarioElements()
   * @see #getRbac()
   * @generated
   */
  EReference getRbac_ScenarioElements();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.PolicyElement <em>Policy Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy Element</em>'.
   * @see uk.ac.open.rbacDSL.PolicyElement
   * @generated
   */
  EClass getPolicyElement();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.PolicyElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.PolicyElement#getName()
   * @see #getPolicyElement()
   * @generated
   */
  EAttribute getPolicyElement_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.ScenarioElement <em>Scenario Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario Element</em>'.
   * @see uk.ac.open.rbacDSL.ScenarioElement
   * @generated
   */
  EClass getScenarioElement();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.ScenarioElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.ScenarioElement#getName()
   * @see #getScenarioElement()
   * @generated
   */
  EAttribute getScenarioElement_Name();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.Role#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see uk.ac.open.rbacDSL.Role#getAssignments()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Assignments();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see uk.ac.open.rbacDSL.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbacDSL.Assignment#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see uk.ac.open.rbacDSL.Assignment#getObject()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Object();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.Assignment#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see uk.ac.open.rbacDSL.Assignment#getActions()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Actions();

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
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.RBACObject <em>RBAC Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RBAC Object</em>'.
   * @see uk.ac.open.rbacDSL.RBACObject
   * @generated
   */
  EClass getRBACObject();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.RBACObject#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Permissions</em>'.
   * @see uk.ac.open.rbacDSL.RBACObject#getPermissions()
   * @see #getRBACObject()
   * @generated
   */
  EReference getRBACObject_Permissions();

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
   * Returns the meta object for the reference '{@link uk.ac.open.rbacDSL.GrantedScenario#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see uk.ac.open.rbacDSL.GrantedScenario#getUser()
   * @see #getGrantedScenario()
   * @generated
   */
  EReference getGrantedScenario_User();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.GrantedScenario#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbacDSL.GrantedScenario#getRoles()
   * @see #getGrantedScenario()
   * @generated
   */
  EReference getGrantedScenario_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.GrantedScenario#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object</em>'.
   * @see uk.ac.open.rbacDSL.GrantedScenario#getObject()
   * @see #getGrantedScenario()
   * @generated
   */
  EReference getGrantedScenario_Object();

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
   * Returns the meta object for the reference '{@link uk.ac.open.rbacDSL.ForbiddenScenario#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see uk.ac.open.rbacDSL.ForbiddenScenario#getUser()
   * @see #getForbiddenScenario()
   * @generated
   */
  EReference getForbiddenScenario_User();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.ForbiddenScenario#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbacDSL.ForbiddenScenario#getRoles()
   * @see #getForbiddenScenario()
   * @generated
   */
  EReference getForbiddenScenario_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.ForbiddenScenario#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object</em>'.
   * @see uk.ac.open.rbacDSL.ForbiddenScenario#getObject()
   * @see #getForbiddenScenario()
   * @generated
   */
  EReference getForbiddenScenario_Object();

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
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.ObjectRoleScenario <em>Object Role Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Role Scenario</em>'.
   * @see uk.ac.open.rbacDSL.ObjectRoleScenario
   * @generated
   */
  EClass getObjectRoleScenario();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.rbacDSL.ObjectRoleScenario#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Role</em>'.
   * @see uk.ac.open.rbacDSL.ObjectRoleScenario#getRole()
   * @see #getObjectRoleScenario()
   * @generated
   */
  EReference getObjectRoleScenario_Role();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.ObjectRoleScenario#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignment</em>'.
   * @see uk.ac.open.rbacDSL.ObjectRoleScenario#getAssignment()
   * @see #getObjectRoleScenario()
   * @generated
   */
  EReference getObjectRoleScenario_Assignment();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbacDSL.ObjectScenario <em>Object Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Scenario</em>'.
   * @see uk.ac.open.rbacDSL.ObjectScenario
   * @generated
   */
  EClass getObjectScenario();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbacDSL.ObjectScenario#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignment</em>'.
   * @see uk.ac.open.rbacDSL.ObjectScenario#getAssignment()
   * @see #getObjectScenario()
   * @generated
   */
  EReference getObjectScenario_Assignment();

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
     * The meta object literal for the '<em><b>Policy Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RBAC__POLICY_ELEMENTS = eINSTANCE.getRbac_PolicyElements();

    /**
     * The meta object literal for the '<em><b>Scenario Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RBAC__SCENARIO_ELEMENTS = eINSTANCE.getRbac_ScenarioElements();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.PolicyElementImpl <em>Policy Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.PolicyElementImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getPolicyElement()
     * @generated
     */
    EClass POLICY_ELEMENT = eINSTANCE.getPolicyElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY_ELEMENT__NAME = eINSTANCE.getPolicyElement_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.ScenarioElementImpl <em>Scenario Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.ScenarioElementImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getScenarioElement()
     * @generated
     */
    EClass SCENARIO_ELEMENT = eINSTANCE.getScenarioElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO_ELEMENT__NAME = eINSTANCE.getScenarioElement_Name();

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
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__ASSIGNMENTS = eINSTANCE.getRole_Assignments();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.AssignmentImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__OBJECT = eINSTANCE.getAssignment_Object();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__ACTIONS = eINSTANCE.getAssignment_Actions();

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
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.RBACObjectImpl <em>RBAC Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.RBACObjectImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getRBACObject()
     * @generated
     */
    EClass RBAC_OBJECT = eINSTANCE.getRBACObject();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RBAC_OBJECT__PERMISSIONS = eINSTANCE.getRBACObject_Permissions();

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
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRANTED_SCENARIO__USER = eINSTANCE.getGrantedScenario_User();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRANTED_SCENARIO__ROLES = eINSTANCE.getGrantedScenario_Roles();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRANTED_SCENARIO__OBJECT = eINSTANCE.getGrantedScenario_Object();

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
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORBIDDEN_SCENARIO__USER = eINSTANCE.getForbiddenScenario_User();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORBIDDEN_SCENARIO__ROLES = eINSTANCE.getForbiddenScenario_Roles();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORBIDDEN_SCENARIO__OBJECT = eINSTANCE.getForbiddenScenario_Object();

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
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_ROLE_SCENARIO__ROLES = eINSTANCE.getUserRoleScenario_Roles();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.ObjectRoleScenarioImpl <em>Object Role Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.ObjectRoleScenarioImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getObjectRoleScenario()
     * @generated
     */
    EClass OBJECT_ROLE_SCENARIO = eINSTANCE.getObjectRoleScenario();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ROLE_SCENARIO__ROLE = eINSTANCE.getObjectRoleScenario_Role();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ROLE_SCENARIO__ASSIGNMENT = eINSTANCE.getObjectRoleScenario_Assignment();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbacDSL.impl.ObjectScenarioImpl <em>Object Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbacDSL.impl.ObjectScenarioImpl
     * @see uk.ac.open.rbacDSL.impl.RbacDSLPackageImpl#getObjectScenario()
     * @generated
     */
    EClass OBJECT_SCENARIO = eINSTANCE.getObjectScenario();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_SCENARIO__ASSIGNMENT = eINSTANCE.getObjectScenario_Assignment();

  }

} //RbacDSLPackage
