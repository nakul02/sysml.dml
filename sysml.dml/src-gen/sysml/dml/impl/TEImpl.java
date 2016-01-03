/**
 * generated by Xtext 2.9.0
 */
package sysml.dml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sysml.dml.DI;
import sysml.dml.DmlPackage;
import sysml.dml.E;
import sysml.dml.FC;
import sysml.dml.TE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysml.dml.impl.TEImpl#getE <em>E</em>}</li>
 *   <li>{@link sysml.dml.impl.TEImpl#getI <em>I</em>}</li>
 *   <li>{@link sysml.dml.impl.TEImpl#getD <em>D</em>}</li>
 *   <li>{@link sysml.dml.impl.TEImpl#getS <em>S</em>}</li>
 *   <li>{@link sysml.dml.impl.TEImpl#getB <em>B</em>}</li>
 *   <li>{@link sysml.dml.impl.TEImpl#getF <em>F</em>}</li>
 *   <li>{@link sysml.dml.impl.TEImpl#getDi <em>Di</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEImpl extends MinimalEObjectImpl.Container implements TE
{
  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected E e;

  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final int I_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected int i = I_EDEFAULT;

  /**
   * The default value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected static final double D_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected double d = D_EDEFAULT;

  /**
   * The default value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected static final String S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected String s = S_EDEFAULT;

  /**
   * The default value of the '{@link #getB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected static final String B_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected String b = B_EDEFAULT;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected FC f;

  /**
   * The cached value of the '{@link #getDi() <em>Di</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDi()
   * @generated
   * @ordered
   */
  protected DI di;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DmlPackage.Literals.TE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(E newE, NotificationChain msgs)
  {
    E oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmlPackage.TE__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(E newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmlPackage.TE__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmlPackage.TE__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(int newI)
  {
    int oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(double newD)
  {
    double oldD = d;
    d = newD;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__D, oldD, d));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(String newS)
  {
    String oldS = s;
    s = newS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__S, oldS, s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(String newB)
  {
    String oldB = b;
    b = newB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__B, oldB, b));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FC getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(FC newF, NotificationChain msgs)
  {
    FC oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmlPackage.TE__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(FC newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmlPackage.TE__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmlPackage.TE__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DI getDi()
  {
    return di;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDi(DI newDi, NotificationChain msgs)
  {
    DI oldDi = di;
    di = newDi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmlPackage.TE__DI, oldDi, newDi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDi(DI newDi)
  {
    if (newDi != di)
    {
      NotificationChain msgs = null;
      if (di != null)
        msgs = ((InternalEObject)di).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmlPackage.TE__DI, null, msgs);
      if (newDi != null)
        msgs = ((InternalEObject)newDi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmlPackage.TE__DI, null, msgs);
      msgs = basicSetDi(newDi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmlPackage.TE__DI, newDi, newDi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DmlPackage.TE__E:
        return basicSetE(null, msgs);
      case DmlPackage.TE__F:
        return basicSetF(null, msgs);
      case DmlPackage.TE__DI:
        return basicSetDi(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DmlPackage.TE__E:
        return getE();
      case DmlPackage.TE__I:
        return getI();
      case DmlPackage.TE__D:
        return getD();
      case DmlPackage.TE__S:
        return getS();
      case DmlPackage.TE__B:
        return getB();
      case DmlPackage.TE__F:
        return getF();
      case DmlPackage.TE__DI:
        return getDi();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmlPackage.TE__E:
        setE((E)newValue);
        return;
      case DmlPackage.TE__I:
        setI((Integer)newValue);
        return;
      case DmlPackage.TE__D:
        setD((Double)newValue);
        return;
      case DmlPackage.TE__S:
        setS((String)newValue);
        return;
      case DmlPackage.TE__B:
        setB((String)newValue);
        return;
      case DmlPackage.TE__F:
        setF((FC)newValue);
        return;
      case DmlPackage.TE__DI:
        setDi((DI)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DmlPackage.TE__E:
        setE((E)null);
        return;
      case DmlPackage.TE__I:
        setI(I_EDEFAULT);
        return;
      case DmlPackage.TE__D:
        setD(D_EDEFAULT);
        return;
      case DmlPackage.TE__S:
        setS(S_EDEFAULT);
        return;
      case DmlPackage.TE__B:
        setB(B_EDEFAULT);
        return;
      case DmlPackage.TE__F:
        setF((FC)null);
        return;
      case DmlPackage.TE__DI:
        setDi((DI)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DmlPackage.TE__E:
        return e != null;
      case DmlPackage.TE__I:
        return i != I_EDEFAULT;
      case DmlPackage.TE__D:
        return d != D_EDEFAULT;
      case DmlPackage.TE__S:
        return S_EDEFAULT == null ? s != null : !S_EDEFAULT.equals(s);
      case DmlPackage.TE__B:
        return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
      case DmlPackage.TE__F:
        return f != null;
      case DmlPackage.TE__DI:
        return di != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (i: ");
    result.append(i);
    result.append(", d: ");
    result.append(d);
    result.append(", s: ");
    result.append(s);
    result.append(", b: ");
    result.append(b);
    result.append(')');
    return result.toString();
  }

} //TEImpl