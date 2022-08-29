/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.util;

import imperialmsc.lmw21.pactdsl.pactDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage
 * @generated
 */
public class PactDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PactDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PactDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PactDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PactDSLSwitch<Adapter> modelSwitch =
    new PactDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object)
      {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter caseEffectiveDate(EffectiveDate object)
      {
        return createEffectiveDateAdapter();
      }
      @Override
      public Adapter caseParty(Party object)
      {
        return createPartyAdapter();
      }
      @Override
      public Adapter caseThirdParty(ThirdParty object)
      {
        return createThirdPartyAdapter();
      }
      @Override
      public Adapter caseSubjectMatter(SubjectMatter object)
      {
        return createSubjectMatterAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseFeatureType(FeatureType object)
      {
        return createFeatureTypeAdapter();
      }
      @Override
      public Adapter caseDefinedTerm(DefinedTerm object)
      {
        return createDefinedTermAdapter();
      }
      @Override
      public Adapter caseAddress(Address object)
      {
        return createAddressAdapter();
      }
      @Override
      public Adapter caseCompanyNumber(CompanyNumber object)
      {
        return createCompanyNumberAdapter();
      }
      @Override
      public Adapter caseCustomFeature(CustomFeature object)
      {
        return createCustomFeatureAdapter();
      }
      @Override
      public Adapter caseFormalityType(FormalityType object)
      {
        return createFormalityTypeAdapter();
      }
      @Override
      public Adapter caseInWriting(InWriting object)
      {
        return createInWritingAdapter();
      }
      @Override
      public Adapter caseByEmail(ByEmail object)
      {
        return createByEmailAdapter();
      }
      @Override
      public Adapter caseGivingNotice(GivingNotice object)
      {
        return createGivingNoticeAdapter();
      }
      @Override
      public Adapter caseCustomFormality(CustomFormality object)
      {
        return createCustomFormalityAdapter();
      }
      @Override
      public Adapter caseActionType(ActionType object)
      {
        return createActionTypeAdapter();
      }
      @Override
      public Adapter caseGivenConsent(GivenConsent object)
      {
        return createGivenConsentAdapter();
      }
      @Override
      public Adapter caseGivenWrittenConsent(GivenWrittenConsent object)
      {
        return createGivenWrittenConsentAdapter();
      }
      @Override
      public Adapter caseCustomAction(CustomAction object)
      {
        return createCustomActionAdapter();
      }
      @Override
      public Adapter caseStateType(StateType object)
      {
        return createStateTypeAdapter();
      }
      @Override
      public Adapter caseOwnership(Ownership object)
      {
        return createOwnershipAdapter();
      }
      @Override
      public Adapter caseRightToUse(RightToUse object)
      {
        return createRightToUseAdapter();
      }
      @Override
      public Adapter caseCustomState(CustomState object)
      {
        return createCustomStateAdapter();
      }
      @Override
      public Adapter casePrimaryObligationType(PrimaryObligationType object)
      {
        return createPrimaryObligationTypeAdapter();
      }
      @Override
      public Adapter casePaymentObligation(PaymentObligation object)
      {
        return createPaymentObligationAdapter();
      }
      @Override
      public Adapter caseDeliveryObligation(DeliveryObligation object)
      {
        return createDeliveryObligationAdapter();
      }
      @Override
      public Adapter caseTransferObligation(TransferObligation object)
      {
        return createTransferObligationAdapter();
      }
      @Override
      public Adapter caseLicenceObligation(LicenceObligation object)
      {
        return createLicenceObligationAdapter();
      }
      @Override
      public Adapter caseConstraintParty(ConstraintParty object)
      {
        return createConstraintPartyAdapter();
      }
      @Override
      public Adapter caseConstraintThirdParty(ConstraintThirdParty object)
      {
        return createConstraintThirdPartyAdapter();
      }
      @Override
      public Adapter caseCustomObligation(CustomObligation object)
      {
        return createCustomObligationAdapter();
      }
      @Override
      public Adapter caseSecondaryObligationType(SecondaryObligationType object)
      {
        return createSecondaryObligationTypeAdapter();
      }
      @Override
      public Adapter caseLiabilityType(LiabilityType object)
      {
        return createLiabilityTypeAdapter();
      }
      @Override
      public Adapter caseLiabilityToParty(LiabilityToParty object)
      {
        return createLiabilityToPartyAdapter();
      }
      @Override
      public Adapter caseLiabilityToThirdParty(LiabilityToThirdParty object)
      {
        return createLiabilityToThirdPartyAdapter();
      }
      @Override
      public Adapter caseTerminationType(TerminationType object)
      {
        return createTerminationTypeAdapter();
      }
      @Override
      public Adapter caseForConvenience(ForConvenience object)
      {
        return createForConvenienceAdapter();
      }
      @Override
      public Adapter caseOnReasonableNotice(OnReasonableNotice object)
      {
        return createOnReasonableNoticeAdapter();
      }
      @Override
      public Adapter caseForBreach(ForBreach object)
      {
        return createForBreachAdapter();
      }
      @Override
      public Adapter caseOnInsolvencyEvent(OnInsolvencyEvent object)
      {
        return createOnInsolvencyEventAdapter();
      }
      @Override
      public Adapter caseCustomTermination(CustomTermination object)
      {
        return createCustomTerminationAdapter();
      }
      @Override
      public Adapter caseBoilerplateType(BoilerplateType object)
      {
        return createBoilerplateTypeAdapter();
      }
      @Override
      public Adapter caseApplicableLaw(ApplicableLaw object)
      {
        return createApplicableLawAdapter();
      }
      @Override
      public Adapter caseJurisdiction(Jurisdiction object)
      {
        return createJurisdictionAdapter();
      }
      @Override
      public Adapter caseNotices(Notices object)
      {
        return createNoticesAdapter();
      }
      @Override
      public Adapter caseCustomBoilerplate(CustomBoilerplate object)
      {
        return createCustomBoilerplateAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.EffectiveDate <em>Effective Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.EffectiveDate
   * @generated
   */
  public Adapter createEffectiveDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Party <em>Party</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Party
   * @generated
   */
  public Adapter createPartyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty <em>Third Party</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty
   * @generated
   */
  public Adapter createThirdPartyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter <em>Subject Matter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter
   * @generated
   */
  public Adapter createSubjectMatterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.FeatureType <em>Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.FeatureType
   * @generated
   */
  public Adapter createFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm <em>Defined Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm
   * @generated
   */
  public Adapter createDefinedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Address
   * @generated
   */
  public Adapter createAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CompanyNumber <em>Company Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CompanyNumber
   * @generated
   */
  public Adapter createCompanyNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomFeature <em>Custom Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomFeature
   * @generated
   */
  public Adapter createCustomFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.FormalityType <em>Formality Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.FormalityType
   * @generated
   */
  public Adapter createFormalityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.InWriting <em>In Writing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.InWriting
   * @generated
   */
  public Adapter createInWritingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ByEmail <em>By Email</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ByEmail
   * @generated
   */
  public Adapter createByEmailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.GivingNotice <em>Giving Notice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.GivingNotice
   * @generated
   */
  public Adapter createGivingNoticeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomFormality <em>Custom Formality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomFormality
   * @generated
   */
  public Adapter createCustomFormalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ActionType
   * @generated
   */
  public Adapter createActionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.GivenConsent <em>Given Consent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.GivenConsent
   * @generated
   */
  public Adapter createGivenConsentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.GivenWrittenConsent <em>Given Written Consent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.GivenWrittenConsent
   * @generated
   */
  public Adapter createGivenWrittenConsentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomAction <em>Custom Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomAction
   * @generated
   */
  public Adapter createCustomActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.StateType
   * @generated
   */
  public Adapter createStateTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Ownership <em>Ownership</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Ownership
   * @generated
   */
  public Adapter createOwnershipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.RightToUse <em>Right To Use</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.RightToUse
   * @generated
   */
  public Adapter createRightToUseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomState <em>Custom State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomState
   * @generated
   */
  public Adapter createCustomStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.PrimaryObligationType <em>Primary Obligation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PrimaryObligationType
   * @generated
   */
  public Adapter createPrimaryObligationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.PaymentObligation <em>Payment Obligation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PaymentObligation
   * @generated
   */
  public Adapter createPaymentObligationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.DeliveryObligation <em>Delivery Obligation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.DeliveryObligation
   * @generated
   */
  public Adapter createDeliveryObligationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.TransferObligation <em>Transfer Obligation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.TransferObligation
   * @generated
   */
  public Adapter createTransferObligationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.LicenceObligation <em>Licence Obligation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.LicenceObligation
   * @generated
   */
  public Adapter createLicenceObligationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ConstraintParty <em>Constraint Party</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ConstraintParty
   * @generated
   */
  public Adapter createConstraintPartyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty <em>Constraint Third Party</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty
   * @generated
   */
  public Adapter createConstraintThirdPartyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomObligation <em>Custom Obligation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomObligation
   * @generated
   */
  public Adapter createCustomObligationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.SecondaryObligationType <em>Secondary Obligation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.SecondaryObligationType
   * @generated
   */
  public Adapter createSecondaryObligationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.LiabilityType <em>Liability Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.LiabilityType
   * @generated
   */
  public Adapter createLiabilityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.LiabilityToParty <em>Liability To Party</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.LiabilityToParty
   * @generated
   */
  public Adapter createLiabilityToPartyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.LiabilityToThirdParty <em>Liability To Third Party</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.LiabilityToThirdParty
   * @generated
   */
  public Adapter createLiabilityToThirdPartyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.TerminationType <em>Termination Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.TerminationType
   * @generated
   */
  public Adapter createTerminationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience <em>For Convenience</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience
   * @generated
   */
  public Adapter createForConvenienceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.OnReasonableNotice <em>On Reasonable Notice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.OnReasonableNotice
   * @generated
   */
  public Adapter createOnReasonableNoticeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ForBreach <em>For Breach</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ForBreach
   * @generated
   */
  public Adapter createForBreachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.OnInsolvencyEvent <em>On Insolvency Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.OnInsolvencyEvent
   * @generated
   */
  public Adapter createOnInsolvencyEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination <em>Custom Termination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination
   * @generated
   */
  public Adapter createCustomTerminationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.BoilerplateType <em>Boilerplate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.BoilerplateType
   * @generated
   */
  public Adapter createBoilerplateTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw <em>Applicable Law</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw
   * @generated
   */
  public Adapter createApplicableLawAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Jurisdiction <em>Jurisdiction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Jurisdiction
   * @generated
   */
  public Adapter createJurisdictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.Notices <em>Notices</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.Notices
   * @generated
   */
  public Adapter createNoticesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomBoilerplate <em>Custom Boilerplate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.CustomBoilerplate
   * @generated
   */
  public Adapter createCustomBoilerplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PactDSLAdapterFactory
