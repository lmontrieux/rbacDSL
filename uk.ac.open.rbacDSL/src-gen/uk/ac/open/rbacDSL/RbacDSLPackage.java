/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC__NAME = 0;

  /**
   * The number of structural features of the '<em>Rbac</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RBAC_FEATURE_COUNT = 1;


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
   * Returns the meta object for the attribute '{@link uk.ac.open.rbacDSL.Rbac#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbacDSL.Rbac#getName()
   * @see #getRbac()
   * @generated
   */
  EAttribute getRbac_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RBAC__NAME = eINSTANCE.getRbac_Name();

  }

} //RbacDSLPackage
