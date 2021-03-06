/**
 * generated by Xtext 2.9.0
 */
package sysml.dml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysml.dml.IS#getE1 <em>E1</em>}</li>
 *   <li>{@link sysml.dml.IS#getE2 <em>E2</em>}</li>
 * </ul>
 *
 * @see sysml.dml.DmlPackage#getIS()
 * @model
 * @generated
 */
public interface IS extends EObject
{
  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(E)
   * @see sysml.dml.DmlPackage#getIS_E1()
   * @model containment="true"
   * @generated
   */
  E getE1();

  /**
   * Sets the value of the '{@link sysml.dml.IS#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(E value);

  /**
   * Returns the value of the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' containment reference.
   * @see #setE2(E)
   * @see sysml.dml.DmlPackage#getIS_E2()
   * @model containment="true"
   * @generated
   */
  E getE2();

  /**
   * Sets the value of the '{@link sysml.dml.IS#getE2 <em>E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E2</em>' containment reference.
   * @see #getE2()
   * @generated
   */
  void setE2(E value);

} // IS
