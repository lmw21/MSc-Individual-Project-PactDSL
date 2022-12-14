/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.Feature;
import imperialmsc.lmw21.pactdsl.pactDSL.FeatureType;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.FeatureImpl#getFeaturetype <em>Featuretype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
{
  /**
   * The cached value of the '{@link #getFeaturetype() <em>Featuretype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeaturetype()
   * @generated
   * @ordered
   */
  protected FeatureType featuretype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return PactDSLPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeatureType getFeaturetype()
  {
    return featuretype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeaturetype(FeatureType newFeaturetype, NotificationChain msgs)
  {
    FeatureType oldFeaturetype = featuretype;
    featuretype = newFeaturetype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PactDSLPackage.FEATURE__FEATURETYPE, oldFeaturetype, newFeaturetype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFeaturetype(FeatureType newFeaturetype)
  {
    if (newFeaturetype != featuretype)
    {
      NotificationChain msgs = null;
      if (featuretype != null)
        msgs = ((InternalEObject)featuretype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PactDSLPackage.FEATURE__FEATURETYPE, null, msgs);
      if (newFeaturetype != null)
        msgs = ((InternalEObject)newFeaturetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PactDSLPackage.FEATURE__FEATURETYPE, null, msgs);
      msgs = basicSetFeaturetype(newFeaturetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.FEATURE__FEATURETYPE, newFeaturetype, newFeaturetype));
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
      case PactDSLPackage.FEATURE__FEATURETYPE:
        return basicSetFeaturetype(null, msgs);
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
      case PactDSLPackage.FEATURE__FEATURETYPE:
        return getFeaturetype();
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
      case PactDSLPackage.FEATURE__FEATURETYPE:
        setFeaturetype((FeatureType)newValue);
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
      case PactDSLPackage.FEATURE__FEATURETYPE:
        setFeaturetype((FeatureType)null);
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
      case PactDSLPackage.FEATURE__FEATURETYPE:
        return featuretype != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureImpl
