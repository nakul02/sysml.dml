/**
 * generated by Xtext 2.9.0
 */
package sysml.dml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPKV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysml.dml.SPKV#getK <em>K</em>}</li>
 *   <li>{@link sysml.dml.SPKV#getV <em>V</em>}</li>
 * </ul>
 *
 * @see sysml.dml.DmlPackage#getSPKV()
 * @model
 * @generated
 */
public interface SPKV extends EObject
{
  /**
   * Returns the value of the '<em><b>K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>K</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>K</em>' containment reference.
   * @see #setK(ID)
   * @see sysml.dml.DmlPackage#getSPKV_K()
   * @model containment="true"
   * @generated
   */
  ID getK();

  /**
   * Sets the value of the '{@link sysml.dml.SPKV#getK <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>K</em>' containment reference.
   * @see #getK()
   * @generated
   */
  void setK(ID value);

  /**
   * Returns the value of the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' attribute.
   * @see #setV(String)
   * @see sysml.dml.DmlPackage#getSPKV_V()
   * @model
   * @generated
   */
  String getV();

  /**
   * Sets the value of the '{@link sysml.dml.SPKV#getV <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' attribute.
   * @see #getV()
   * @generated
   */
  void setV(String value);

} // SPKV
