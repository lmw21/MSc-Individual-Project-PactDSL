/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw;
import imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicable Law</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ApplicableLawImpl#getCustomApplicableLaw <em>Custom Applicable Law</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ApplicableLawImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicableLawImpl extends BoilerplateTypeImpl implements ApplicableLaw
{
  /**
   * The default value of the '{@link #getCustomApplicableLaw() <em>Custom Applicable Law</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomApplicableLaw()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_APPLICABLE_LAW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomApplicableLaw() <em>Custom Applicable Law</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomApplicableLaw()
   * @generated
   * @ordered
   */
  protected String customApplicableLaw = CUSTOM_APPLICABLE_LAW_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected EList<DefinedTerm> definition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicableLawImpl()
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
    return PactDSLPackage.Literals.APPLICABLE_LAW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCustomApplicableLaw()
  {
    return customApplicableLaw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomApplicableLaw(String newCustomApplicableLaw)
  {
    String oldCustomApplicableLaw = customApplicableLaw;
    customApplicableLaw = newCustomApplicableLaw;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.APPLICABLE_LAW__CUSTOM_APPLICABLE_LAW, oldCustomApplicableLaw, customApplicableLaw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DefinedTerm> getDefinition()
  {
    if (definition == null)
    {
      definition = new EObjectContainmentEList<DefinedTerm>(DefinedTerm.class, this, PactDSLPackage.APPLICABLE_LAW__DEFINITION);
    }
    return definition;
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
      case PactDSLPackage.APPLICABLE_LAW__DEFINITION:
        return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
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
      case PactDSLPackage.APPLICABLE_LAW__CUSTOM_APPLICABLE_LAW:
        return getCustomApplicableLaw();
      case PactDSLPackage.APPLICABLE_LAW__DEFINITION:
        return getDefinition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PactDSLPackage.APPLICABLE_LAW__CUSTOM_APPLICABLE_LAW:
        setCustomApplicableLaw((String)newValue);
        return;
      case PactDSLPackage.APPLICABLE_LAW__DEFINITION:
        getDefinition().clear();
        getDefinition().addAll((Collection<? extends DefinedTerm>)newValue);
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
      case PactDSLPackage.APPLICABLE_LAW__CUSTOM_APPLICABLE_LAW:
        setCustomApplicableLaw(CUSTOM_APPLICABLE_LAW_EDEFAULT);
        return;
      case PactDSLPackage.APPLICABLE_LAW__DEFINITION:
        getDefinition().clear();
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
      case PactDSLPackage.APPLICABLE_LAW__CUSTOM_APPLICABLE_LAW:
        return CUSTOM_APPLICABLE_LAW_EDEFAULT == null ? customApplicableLaw != null : !CUSTOM_APPLICABLE_LAW_EDEFAULT.equals(customApplicableLaw);
      case PactDSLPackage.APPLICABLE_LAW__DEFINITION:
        return definition != null && !definition.isEmpty();
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
    result.append(" (CustomApplicableLaw: ");
    result.append(customApplicableLaw);
    result.append(')');
    return result.toString();
  }

} //ApplicableLawImpl