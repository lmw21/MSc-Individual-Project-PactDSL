/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.ConstraintParty;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ConstraintPartyImpl#getForbiddenAction <em>Forbidden Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintPartyImpl extends PrimaryObligationTypeImpl implements ConstraintParty
{
  /**
   * The default value of the '{@link #getForbiddenAction() <em>Forbidden Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForbiddenAction()
   * @generated
   * @ordered
   */
  protected static final String FORBIDDEN_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForbiddenAction() <em>Forbidden Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForbiddenAction()
   * @generated
   * @ordered
   */
  protected String forbiddenAction = FORBIDDEN_ACTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintPartyImpl()
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
    return PactDSLPackage.Literals.CONSTRAINT_PARTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getForbiddenAction()
  {
    return forbiddenAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForbiddenAction(String newForbiddenAction)
  {
    String oldForbiddenAction = forbiddenAction;
    forbiddenAction = newForbiddenAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.CONSTRAINT_PARTY__FORBIDDEN_ACTION, oldForbiddenAction, forbiddenAction));
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
      case PactDSLPackage.CONSTRAINT_PARTY__FORBIDDEN_ACTION:
        return getForbiddenAction();
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
      case PactDSLPackage.CONSTRAINT_PARTY__FORBIDDEN_ACTION:
        setForbiddenAction((String)newValue);
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
      case PactDSLPackage.CONSTRAINT_PARTY__FORBIDDEN_ACTION:
        setForbiddenAction(FORBIDDEN_ACTION_EDEFAULT);
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
      case PactDSLPackage.CONSTRAINT_PARTY__FORBIDDEN_ACTION:
        return FORBIDDEN_ACTION_EDEFAULT == null ? forbiddenAction != null : !FORBIDDEN_ACTION_EDEFAULT.equals(forbiddenAction);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (forbiddenAction: ");
    result.append(forbiddenAction);
    result.append(')');
    return result.toString();
  }

} //ConstraintPartyImpl
