/*
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.serializer;

import com.google.inject.Inject;
import imperialmsc.lmw21.pactdsl.pactDSL.Address;
import imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw;
import imperialmsc.lmw21.pactdsl.pactDSL.ByEmail;
import imperialmsc.lmw21.pactdsl.pactDSL.CompanyNumber;
import imperialmsc.lmw21.pactdsl.pactDSL.ConstraintParty;
import imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty;
import imperialmsc.lmw21.pactdsl.pactDSL.CustomAction;
import imperialmsc.lmw21.pactdsl.pactDSL.CustomFeature;
import imperialmsc.lmw21.pactdsl.pactDSL.CustomFormality;
import imperialmsc.lmw21.pactdsl.pactDSL.CustomObligation;
import imperialmsc.lmw21.pactdsl.pactDSL.CustomState;
import imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination;
import imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm;
import imperialmsc.lmw21.pactdsl.pactDSL.DeliveryObligation;
import imperialmsc.lmw21.pactdsl.pactDSL.EffectiveDate;
import imperialmsc.lmw21.pactdsl.pactDSL.Feature;
import imperialmsc.lmw21.pactdsl.pactDSL.ForBreach;
import imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience;
import imperialmsc.lmw21.pactdsl.pactDSL.GivenConsent;
import imperialmsc.lmw21.pactdsl.pactDSL.GivenWrittenConsent;
import imperialmsc.lmw21.pactdsl.pactDSL.GivingNotice;
import imperialmsc.lmw21.pactdsl.pactDSL.InWriting;
import imperialmsc.lmw21.pactdsl.pactDSL.Jurisdiction;
import imperialmsc.lmw21.pactdsl.pactDSL.LiabilityParty;
import imperialmsc.lmw21.pactdsl.pactDSL.LiabilityThirdParty;
import imperialmsc.lmw21.pactdsl.pactDSL.LicenceObligation;
import imperialmsc.lmw21.pactdsl.pactDSL.Model;
import imperialmsc.lmw21.pactdsl.pactDSL.Notices;
import imperialmsc.lmw21.pactdsl.pactDSL.OnInsolvencyEvent;
import imperialmsc.lmw21.pactdsl.pactDSL.OnReasonableNotice;
import imperialmsc.lmw21.pactdsl.pactDSL.Ownership;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;
import imperialmsc.lmw21.pactdsl.pactDSL.Party;
import imperialmsc.lmw21.pactdsl.pactDSL.PaymentObligation;
import imperialmsc.lmw21.pactdsl.pactDSL.RightToUse;
import imperialmsc.lmw21.pactdsl.pactDSL.SecondaryObligationType;
import imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter;
import imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty;
import imperialmsc.lmw21.pactdsl.pactDSL.TransferObligation;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PactDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PactDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PactDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PactDSLPackage.ADDRESS:
				sequence_Address(context, (Address) semanticObject); 
				return; 
			case PactDSLPackage.APPLICABLE_LAW:
				sequence_ApplicableLaw(context, (ApplicableLaw) semanticObject); 
				return; 
			case PactDSLPackage.BY_EMAIL:
				sequence_ByEmail(context, (ByEmail) semanticObject); 
				return; 
			case PactDSLPackage.COMPANY_NUMBER:
				sequence_CompanyNumber(context, (CompanyNumber) semanticObject); 
				return; 
			case PactDSLPackage.CONSTRAINT_PARTY:
				sequence_ConstraintParty(context, (ConstraintParty) semanticObject); 
				return; 
			case PactDSLPackage.CONSTRAINT_THIRD_PARTY:
				sequence_ConstraintThirdParty(context, (ConstraintThirdParty) semanticObject); 
				return; 
			case PactDSLPackage.CUSTOM_ACTION:
				sequence_CustomAction(context, (CustomAction) semanticObject); 
				return; 
			case PactDSLPackage.CUSTOM_FEATURE:
				sequence_CustomFeature(context, (CustomFeature) semanticObject); 
				return; 
			case PactDSLPackage.CUSTOM_FORMALITY:
				sequence_CustomFormality(context, (CustomFormality) semanticObject); 
				return; 
			case PactDSLPackage.CUSTOM_OBLIGATION:
				sequence_CustomObligation(context, (CustomObligation) semanticObject); 
				return; 
			case PactDSLPackage.CUSTOM_STATE:
				sequence_CustomState(context, (CustomState) semanticObject); 
				return; 
			case PactDSLPackage.CUSTOM_TERMINATION:
				sequence_CustomTermination(context, (CustomTermination) semanticObject); 
				return; 
			case PactDSLPackage.DEFINED_TERM:
				sequence_DefinedTerm(context, (DefinedTerm) semanticObject); 
				return; 
			case PactDSLPackage.DELIVERY_OBLIGATION:
				sequence_DeliveryObligation(context, (DeliveryObligation) semanticObject); 
				return; 
			case PactDSLPackage.EFFECTIVE_DATE:
				sequence_EffectiveDate(context, (EffectiveDate) semanticObject); 
				return; 
			case PactDSLPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case PactDSLPackage.FOR_BREACH:
				sequence_ForBreach(context, (ForBreach) semanticObject); 
				return; 
			case PactDSLPackage.FOR_CONVENIENCE:
				sequence_ForConvenience(context, (ForConvenience) semanticObject); 
				return; 
			case PactDSLPackage.GIVEN_CONSENT:
				sequence_GivenConsent(context, (GivenConsent) semanticObject); 
				return; 
			case PactDSLPackage.GIVEN_WRITTEN_CONSENT:
				sequence_GivenWrittenConsent(context, (GivenWrittenConsent) semanticObject); 
				return; 
			case PactDSLPackage.GIVING_NOTICE:
				sequence_GivingNotice(context, (GivingNotice) semanticObject); 
				return; 
			case PactDSLPackage.IN_WRITING:
				sequence_InWriting(context, (InWriting) semanticObject); 
				return; 
			case PactDSLPackage.JURISDICTION:
				sequence_Jurisdiction(context, (Jurisdiction) semanticObject); 
				return; 
			case PactDSLPackage.LIABILITY_PARTY:
				sequence_LiabilityParty(context, (LiabilityParty) semanticObject); 
				return; 
			case PactDSLPackage.LIABILITY_THIRD_PARTY:
				sequence_LiabilityThirdParty(context, (LiabilityThirdParty) semanticObject); 
				return; 
			case PactDSLPackage.LICENCE_OBLIGATION:
				sequence_LicenceObligation(context, (LicenceObligation) semanticObject); 
				return; 
			case PactDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PactDSLPackage.NOTICES:
				sequence_Notices(context, (Notices) semanticObject); 
				return; 
			case PactDSLPackage.ON_INSOLVENCY_EVENT:
				sequence_OnInsolvencyEvent(context, (OnInsolvencyEvent) semanticObject); 
				return; 
			case PactDSLPackage.ON_REASONABLE_NOTICE:
				sequence_OnReasonableNotice(context, (OnReasonableNotice) semanticObject); 
				return; 
			case PactDSLPackage.OWNERSHIP:
				sequence_Ownership(context, (Ownership) semanticObject); 
				return; 
			case PactDSLPackage.PARTY:
				sequence_Party(context, (Party) semanticObject); 
				return; 
			case PactDSLPackage.PAYMENT_OBLIGATION:
				sequence_PaymentObligation(context, (PaymentObligation) semanticObject); 
				return; 
			case PactDSLPackage.RIGHT_TO_USE:
				sequence_RightToUse(context, (RightToUse) semanticObject); 
				return; 
			case PactDSLPackage.SECONDARY_OBLIGATION_TYPE:
				sequence_SecondaryObligationType(context, (SecondaryObligationType) semanticObject); 
				return; 
			case PactDSLPackage.SUBJECT_MATTER:
				sequence_SubjectMatter(context, (SubjectMatter) semanticObject); 
				return; 
			case PactDSLPackage.THIRD_PARTY:
				sequence_ThirdParty(context, (ThirdParty) semanticObject); 
				return; 
			case PactDSLPackage.TRANSFER_OBLIGATION:
				sequence_TransferObligation(context, (TransferObligation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FeatureType returns Address
	 *     Address returns Address
	 *
	 * Constraint:
	 *     address=STRING
	 */
	protected void sequence_Address(ISerializationContext context, Address semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.ADDRESS__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.ADDRESS__ADDRESS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_1_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BoilerplateType returns ApplicableLaw
	 *     ApplicableLaw returns ApplicableLaw
	 *
	 * Constraint:
	 *     (customApplicableLaw=STRING definition+=DefinedTerm?)
	 */
	protected void sequence_ApplicableLaw(ISerializationContext context, ApplicableLaw semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormalityType returns ByEmail
	 *     ByEmail returns ByEmail
	 *
	 * Constraint:
	 *     emailAddress=STRING
	 */
	protected void sequence_ByEmail(ISerializationContext context, ByEmail semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.BY_EMAIL__EMAIL_ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.BY_EMAIL__EMAIL_ADDRESS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0(), semanticObject.getEmailAddress());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureType returns CompanyNumber
	 *     CompanyNumber returns CompanyNumber
	 *
	 * Constraint:
	 *     companyNumber=INT
	 */
	protected void sequence_CompanyNumber(ISerializationContext context, CompanyNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.COMPANY_NUMBER__COMPANY_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.COMPANY_NUMBER__COMPANY_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompanyNumberAccess().getCompanyNumberINTTerminalRuleCall_1_0(), semanticObject.getCompanyNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns ConstraintParty
	 *     ConstraintParty returns ConstraintParty
	 *
	 * Constraint:
	 *     (superType=[Party|ID] forbiddenAction=STRING superType=[SubjectMatter|ID]? superType=[Party|ID]?)
	 */
	protected void sequence_ConstraintParty(ISerializationContext context, ConstraintParty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns ConstraintThirdParty
	 *     ConstraintThirdParty returns ConstraintThirdParty
	 *
	 * Constraint:
	 *     (
	 *         superType=[Party|ID] 
	 *         forbiddenAction=STRING 
	 *         superType=[SubjectMatter|ID]? 
	 *         additionalInfo=STRING? 
	 *         superType=[ThirdParty|ID]? 
	 *         superType=[Party|ID]?
	 *     )
	 */
	protected void sequence_ConstraintThirdParty(ISerializationContext context, ConstraintThirdParty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionType returns CustomAction
	 *     CustomAction returns CustomAction
	 *
	 * Constraint:
	 *     (superType=[Party|ID] customAction=STRING)
	 */
	protected void sequence_CustomAction(ISerializationContext context, CustomAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE));
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.CUSTOM_ACTION__CUSTOM_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.CUSTOM_ACTION__CUSTOM_ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomActionAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE, false));
		feeder.accept(grammarAccess.getCustomActionAccess().getCustomActionSTRINGTerminalRuleCall_1_0(), semanticObject.getCustomAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureType returns CustomFeature
	 *     CustomFeature returns CustomFeature
	 *
	 * Constraint:
	 *     customFeature=STRING
	 */
	protected void sequence_CustomFeature(ISerializationContext context, CustomFeature semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.CUSTOM_FEATURE__CUSTOM_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.CUSTOM_FEATURE__CUSTOM_FEATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomFeatureAccess().getCustomFeatureSTRINGTerminalRuleCall_1_0(), semanticObject.getCustomFeature());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FormalityType returns CustomFormality
	 *     CustomFormality returns CustomFormality
	 *
	 * Constraint:
	 *     customFormality=STRING
	 */
	protected void sequence_CustomFormality(ISerializationContext context, CustomFormality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.CUSTOM_FORMALITY__CUSTOM_FORMALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.CUSTOM_FORMALITY__CUSTOM_FORMALITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0(), semanticObject.getCustomFormality());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns CustomObligation
	 *     CustomObligation returns CustomObligation
	 *
	 * Constraint:
	 *     (superType=[Party|ID] customObligation=STRING)
	 */
	protected void sequence_CustomObligation(ISerializationContext context, CustomObligation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.PRIMARY_OBLIGATION_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.PRIMARY_OBLIGATION_TYPE__SUPER_TYPE));
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.CUSTOM_OBLIGATION__CUSTOM_OBLIGATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.CUSTOM_OBLIGATION__CUSTOM_OBLIGATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1(), semanticObject.eGet(PactDSLPackage.Literals.PRIMARY_OBLIGATION_TYPE__SUPER_TYPE, false));
		feeder.accept(grammarAccess.getCustomObligationAccess().getCustomObligationSTRINGTerminalRuleCall_3_0(), semanticObject.getCustomObligation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateType returns CustomState
	 *     CustomState returns CustomState
	 *
	 * Constraint:
	 *     (superType=[Party|ID] customState=STRING)
	 */
	protected void sequence_CustomState(ISerializationContext context, CustomState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE));
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.CUSTOM_STATE__CUSTOM_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.CUSTOM_STATE__CUSTOM_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomStateAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1(), semanticObject.eGet(PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE, false));
		feeder.accept(grammarAccess.getCustomStateAccess().getCustomStateSTRINGTerminalRuleCall_2_0(), semanticObject.getCustomState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminationType returns CustomTermination
	 *     CustomTermination returns CustomTermination
	 *
	 * Constraint:
	 *     (superType=[Party|ID]+ customTerminationClause=STRING superType=[GivingNotice|ID]?)
	 */
	protected void sequence_CustomTermination(ISerializationContext context, CustomTermination semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureType returns DefinedTerm
	 *     DefinedTerm returns DefinedTerm
	 *
	 * Constraint:
	 *     definition=STRING
	 */
	protected void sequence_DefinedTerm(ISerializationContext context, DefinedTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.DEFINED_TERM__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.DEFINED_TERM__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns DeliveryObligation
	 *     DeliveryObligation returns DeliveryObligation
	 *
	 * Constraint:
	 *     (superType=[Party|ID] superType=[SubjectMatter|ID]+ superType=[Party|ID]+ (day=INT month=INT year=INT)?)
	 */
	protected void sequence_DeliveryObligation(ISerializationContext context, DeliveryObligation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityType returns EffectiveDate
	 *     EffectiveDate returns EffectiveDate
	 *
	 * Constraint:
	 *     (day=INT month=INT year=INT)+
	 */
	protected void sequence_EffectiveDate(ISerializationContext context, EffectiveDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     featuretype=FeatureType
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.FEATURE__FEATURETYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.FEATURE__FEATURETYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0(), semanticObject.getFeaturetype());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminationType returns ForBreach
	 *     ForBreach returns ForBreach
	 *
	 * Constraint:
	 *     (superType=[Party|ID]+ ObligationBreached=STRING+ superType=[Party|ID] remedialScheme=STRING?)
	 */
	protected void sequence_ForBreach(ISerializationContext context, ForBreach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminationType returns ForConvenience
	 *     ForConvenience returns ForConvenience
	 *
	 * Constraint:
	 *     (superType=[Party|ID]+ customTermination=STRING)
	 */
	protected void sequence_ForConvenience(ISerializationContext context, ForConvenience semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionType returns GivenConsent
	 *     GivenConsent returns GivenConsent
	 *
	 * Constraint:
	 *     superType=[Party|ID]
	 */
	protected void sequence_GivenConsent(ISerializationContext context, GivenConsent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActionType returns GivenWrittenConsent
	 *     GivenWrittenConsent returns GivenWrittenConsent
	 *
	 * Constraint:
	 *     superType=[Party|ID]
	 */
	protected void sequence_GivenWrittenConsent(ISerializationContext context, GivenWrittenConsent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PactDSLPackage.Literals.ACTION_TYPE__SUPER_TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FormalityType returns GivingNotice
	 *     GivingNotice returns GivingNotice
	 *
	 * Constraint:
	 *     (superType=[Party|ID] numDays=INT)
	 */
	protected void sequence_GivingNotice(ISerializationContext context, GivingNotice semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.GIVING_NOTICE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.GIVING_NOTICE__SUPER_TYPE));
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.GIVING_NOTICE__NUM_DAYS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.GIVING_NOTICE__NUM_DAYS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1(), semanticObject.eGet(PactDSLPackage.Literals.GIVING_NOTICE__SUPER_TYPE, false));
		feeder.accept(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0(), semanticObject.getNumDays());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FormalityType returns InWriting
	 *     InWriting returns InWriting
	 *
	 * Constraint:
	 *     customWritingFormality=STRING
	 */
	protected void sequence_InWriting(ISerializationContext context, InWriting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.IN_WRITING__CUSTOM_WRITING_FORMALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.IN_WRITING__CUSTOM_WRITING_FORMALITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0(), semanticObject.getCustomWritingFormality());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BoilerplateType returns Jurisdiction
	 *     Jurisdiction returns Jurisdiction
	 *
	 * Constraint:
	 *     (customJurisdiction=STRING definition+=DefinedTerm?)
	 */
	protected void sequence_Jurisdiction(ISerializationContext context, Jurisdiction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LiabilityType returns LiabilityParty
	 *     LiabilityParty returns LiabilityParty
	 *
	 * Constraint:
	 *     (superType=[Party|ID] superType=[Party|ID] customLoss=STRING)
	 */
	protected void sequence_LiabilityParty(ISerializationContext context, LiabilityParty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LiabilityType returns LiabilityThirdParty
	 *     LiabilityThirdParty returns LiabilityThirdParty
	 *
	 * Constraint:
	 *     (superType=[Party|ID] superType=[ThirdParty|ID] customLoss=STRING)
	 */
	protected void sequence_LiabilityThirdParty(ISerializationContext context, LiabilityThirdParty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns LicenceObligation
	 *     LicenceObligation returns LicenceObligation
	 *
	 * Constraint:
	 *     (superType=[Party|ID] superType=[SubjectMatter|ID]+ superType=[Party|ID]+ (day=INT month=INT year=INT)*)
	 */
	protected void sequence_LicenceObligation(ISerializationContext context, LicenceObligation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         title=STRING 
	 *         entityTypes+=EntityType+ 
	 *         formalityTypes+=FormalityType* 
	 *         actionTypes+=ActionType* 
	 *         stateTypes+=StateType* 
	 *         primaryObligationTypes+=PrimaryObligationType+ 
	 *         secondaryObligationTypes+=SecondaryObligationType* 
	 *         liabilityTypes+=LiabilityType* 
	 *         terminationTypes+=TerminationType* 
	 *         stateTypes+=StateType* 
	 *         boilerplateTypes+=BoilerplateType*
	 *     )
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BoilerplateType returns Notices
	 *     Notices returns Notices
	 *
	 * Constraint:
	 *     customNotice=STRING
	 */
	protected void sequence_Notices(ISerializationContext context, Notices semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.NOTICES__CUSTOM_NOTICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.NOTICES__CUSTOM_NOTICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0(), semanticObject.getCustomNotice());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminationType returns OnInsolvencyEvent
	 *     OnInsolvencyEvent returns OnInsolvencyEvent
	 *
	 * Constraint:
	 *     (superType=[Party|ID]+ InsolvencyEvent=STRING superType=[Party|ID])
	 */
	protected void sequence_OnInsolvencyEvent(ISerializationContext context, OnInsolvencyEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminationType returns OnReasonableNotice
	 *     OnReasonableNotice returns OnReasonableNotice
	 *
	 * Constraint:
	 *     (superType=[Party|ID]+ superType=[GivingNotice|ID])
	 */
	protected void sequence_OnReasonableNotice(ISerializationContext context, OnReasonableNotice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateType returns Ownership
	 *     Ownership returns Ownership
	 *
	 * Constraint:
	 *     (superType=[Party|ID] customOwnership=STRING)
	 */
	protected void sequence_Ownership(ISerializationContext context, Ownership semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE));
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.OWNERSHIP__CUSTOM_OWNERSHIP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.OWNERSHIP__CUSTOM_OWNERSHIP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1(), semanticObject.eGet(PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE, false));
		feeder.accept(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_3_0(), semanticObject.getCustomOwnership());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityType returns Party
	 *     Party returns Party
	 *
	 * Constraint:
	 *     (name=ID fullname=STRING feature+=Feature*)
	 */
	protected void sequence_Party(ISerializationContext context, Party semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns PaymentObligation
	 *     PaymentObligation returns PaymentObligation
	 *
	 * Constraint:
	 *     (superType=[Party|ID] sum=INT+ superType=[Party|ID]+ (day=INT month=INT year=INT)?)
	 */
	protected void sequence_PaymentObligation(ISerializationContext context, PaymentObligation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateType returns RightToUse
	 *     RightToUse returns RightToUse
	 *
	 * Constraint:
	 *     (superType=[Party|ID] customUsage=STRING)
	 */
	protected void sequence_RightToUse(ISerializationContext context, RightToUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE));
			if (transientValues.isValueTransient(semanticObject, PactDSLPackage.Literals.RIGHT_TO_USE__CUSTOM_USAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PactDSLPackage.Literals.RIGHT_TO_USE__CUSTOM_USAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1(), semanticObject.eGet(PactDSLPackage.Literals.STATE_TYPE__SUPER_TYPE, false));
		feeder.accept(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_3_0(), semanticObject.getCustomUsage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SecondaryObligationType returns SecondaryObligationType
	 *
	 * Constraint:
	 *     (superType=[Party|ID] sum=INT+ superType=[Party|ID]+ customPrimaryObligation=STRING)
	 */
	protected void sequence_SecondaryObligationType(ISerializationContext context, SecondaryObligationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityType returns SubjectMatter
	 *     SubjectMatter returns SubjectMatter
	 *
	 * Constraint:
	 *     (name=ID subjectMatter=STRING feature+=Feature*)
	 */
	protected void sequence_SubjectMatter(ISerializationContext context, SubjectMatter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityType returns ThirdParty
	 *     ThirdParty returns ThirdParty
	 *
	 * Constraint:
	 *     (name=ID fullname=STRING feature+=Feature*)
	 */
	protected void sequence_ThirdParty(ISerializationContext context, ThirdParty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryObligationType returns TransferObligation
	 *     TransferObligation returns TransferObligation
	 *
	 * Constraint:
	 *     (superType=[Party|ID] superType=[SubjectMatter|ID]+ superType=[Party|ID]+ (day=INT month=INT year=INT)?)
	 */
	protected void sequence_TransferObligation(ISerializationContext context, TransferObligation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
