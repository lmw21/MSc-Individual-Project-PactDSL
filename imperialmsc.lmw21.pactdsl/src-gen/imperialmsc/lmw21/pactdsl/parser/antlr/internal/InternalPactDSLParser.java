package imperialmsc.lmw21.pactdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPactDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContractTitle:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'StateAfterObligationsDischarged:'", "'Termination:'", "'StateAfterTermination:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'owns'", "'willReturn'", "'mayUse'", "'mayNotUse'", "'PaymentObligation:'", "'must'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'mustNot'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPactDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPactDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPactDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPactDSL.g"; }



     	private PactDSLGrammarAccess grammarAccess;

        public InternalPactDSLParser(TokenStream input, PactDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PactDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPactDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPactDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPactDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPactDSL.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_entityTypes_4_0 = null;

        EObject lv_formalityTypes_7_0 = null;

        EObject lv_actionTypes_10_0 = null;

        EObject lv_stateTypes_13_0 = null;

        EObject lv_primaryObligationTypes_16_0 = null;

        EObject lv_stateTypes_19_0 = null;

        EObject lv_terminationTypes_22_0 = null;

        EObject lv_stateTypes_25_0 = null;

        EObject lv_boilerplateTypes_28_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:77:2: ( (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* ) )
            // InternalPactDSL.g:78:2: (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* )
            {
            // InternalPactDSL.g:78:2: (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* )
            // InternalPactDSL.g:79:3: otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getContractTitleKeyword_0());
            		
            // InternalPactDSL.g:83:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalPactDSL.g:84:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:84:4: (lv_title_1_0= RULE_STRING )
            // InternalPactDSL.g:85:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_1_0, grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:101:3: (otherlv_2= '.' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPactDSL.g:102:4: otherlv_2= '.'
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFullStopKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getEntitiesKeyword_3());
            		
            // InternalPactDSL.g:111:3: ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=22 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPactDSL.g:112:4: ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.'
            	    {
            	    // InternalPactDSL.g:112:4: ( (lv_entityTypes_4_0= ruleEntityType ) )
            	    // InternalPactDSL.g:113:5: (lv_entityTypes_4_0= ruleEntityType )
            	    {
            	    // InternalPactDSL.g:113:5: (lv_entityTypes_4_0= ruleEntityType )
            	    // InternalPactDSL.g:114:6: lv_entityTypes_4_0= ruleEntityType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_entityTypes_4_0=ruleEntityType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entityTypes",
            	    							lv_entityTypes_4_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.EntityType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getFullStopKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalPactDSL.g:136:3: (otherlv_6= 'Formalities:' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPactDSL.g:137:4: otherlv_6= 'Formalities:'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getFormalitiesKeyword_5());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:142:3: ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=30 && LA4_0<=31)||LA4_0==33||LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPactDSL.g:143:4: ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.'
            	    {
            	    // InternalPactDSL.g:143:4: ( (lv_formalityTypes_7_0= ruleFormalityType ) )
            	    // InternalPactDSL.g:144:5: (lv_formalityTypes_7_0= ruleFormalityType )
            	    {
            	    // InternalPactDSL.g:144:5: (lv_formalityTypes_7_0= ruleFormalityType )
            	    // InternalPactDSL.g:145:6: lv_formalityTypes_7_0= ruleFormalityType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_formalityTypes_7_0=ruleFormalityType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formalityTypes",
            	    							lv_formalityTypes_7_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.FormalityType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,12,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getFullStopKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPactDSL.g:167:3: (otherlv_9= 'Actions:' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPactDSL.g:168:4: otherlv_9= 'Actions:'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getActionsKeyword_7());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:173:3: ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_2 = input.LA(2);

                    if ( ((LA6_2>=37 && LA6_2<=38)) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPactDSL.g:174:4: ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.'
            	    {
            	    // InternalPactDSL.g:174:4: ( (lv_actionTypes_10_0= ruleActionType ) )
            	    // InternalPactDSL.g:175:5: (lv_actionTypes_10_0= ruleActionType )
            	    {
            	    // InternalPactDSL.g:175:5: (lv_actionTypes_10_0= ruleActionType )
            	    // InternalPactDSL.g:176:6: lv_actionTypes_10_0= ruleActionType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_actionTypes_10_0=ruleActionType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actionTypes",
            	    							lv_actionTypes_10_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.ActionType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,12,FOLLOW_9); 

            	    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getFullStopKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalPactDSL.g:198:3: (otherlv_12= 'StateOnSignature:' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPactDSL.g:199:4: otherlv_12= 'StateOnSignature:'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getStateOnSignatureKeyword_9());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:204:3: ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPactDSL.g:205:4: ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.'
            	    {
            	    // InternalPactDSL.g:205:4: ( (lv_stateTypes_13_0= ruleStateType ) )
            	    // InternalPactDSL.g:206:5: (lv_stateTypes_13_0= ruleStateType )
            	    {
            	    // InternalPactDSL.g:206:5: (lv_stateTypes_13_0= ruleStateType )
            	    // InternalPactDSL.g:207:6: lv_stateTypes_13_0= ruleStateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stateTypes_13_0=ruleStateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateTypes",
            	    							lv_stateTypes_13_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.StateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,12,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getFullStopKeyword_10_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11());
            		
            // InternalPactDSL.g:233:3: ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||LA9_0==43||LA9_0==48||LA9_0==50||LA9_0==52||LA9_0==56||LA9_0==58) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPactDSL.g:234:4: ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.'
            	    {
            	    // InternalPactDSL.g:234:4: ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) )
            	    // InternalPactDSL.g:235:5: (lv_primaryObligationTypes_16_0= rulePrimaryObligationType )
            	    {
            	    // InternalPactDSL.g:235:5: (lv_primaryObligationTypes_16_0= rulePrimaryObligationType )
            	    // InternalPactDSL.g:236:6: lv_primaryObligationTypes_16_0= rulePrimaryObligationType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_primaryObligationTypes_16_0=rulePrimaryObligationType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"primaryObligationTypes",
            	    							lv_primaryObligationTypes_16_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.PrimaryObligationType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_17=(Token)match(input,12,FOLLOW_12); 

            	    				newLeafNode(otherlv_17, grammarAccess.getModelAccess().getFullStopKeyword_12_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalPactDSL.g:258:3: (otherlv_18= 'StateAfterObligationsDischarged:' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPactDSL.g:259:4: otherlv_18= 'StateAfterObligationsDischarged:'
                    {
                    otherlv_18=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getModelAccess().getStateAfterObligationsDischargedKeyword_13());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:264:3: ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPactDSL.g:265:4: ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.'
            	    {
            	    // InternalPactDSL.g:265:4: ( (lv_stateTypes_19_0= ruleStateType ) )
            	    // InternalPactDSL.g:266:5: (lv_stateTypes_19_0= ruleStateType )
            	    {
            	    // InternalPactDSL.g:266:5: (lv_stateTypes_19_0= ruleStateType )
            	    // InternalPactDSL.g:267:6: lv_stateTypes_19_0= ruleStateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_14_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stateTypes_19_0=ruleStateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateTypes",
            	    							lv_stateTypes_19_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.StateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_20=(Token)match(input,12,FOLLOW_13); 

            	    				newLeafNode(otherlv_20, grammarAccess.getModelAccess().getFullStopKeyword_14_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_21=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_21, grammarAccess.getModelAccess().getTerminationKeyword_15());
            		
            // InternalPactDSL.g:293:3: ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19||LA12_0==62||(LA12_0>=65 && LA12_0<=66)||LA12_0==68) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPactDSL.g:294:4: ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.'
            	    {
            	    // InternalPactDSL.g:294:4: ( (lv_terminationTypes_22_0= ruleTerminationType ) )
            	    // InternalPactDSL.g:295:5: (lv_terminationTypes_22_0= ruleTerminationType )
            	    {
            	    // InternalPactDSL.g:295:5: (lv_terminationTypes_22_0= ruleTerminationType )
            	    // InternalPactDSL.g:296:6: lv_terminationTypes_22_0= ruleTerminationType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_16_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_terminationTypes_22_0=ruleTerminationType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terminationTypes",
            	    							lv_terminationTypes_22_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.TerminationType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_23=(Token)match(input,12,FOLLOW_14); 

            	    				newLeafNode(otherlv_23, grammarAccess.getModelAccess().getFullStopKeyword_16_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalPactDSL.g:318:3: (otherlv_24= 'StateAfterTermination:' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPactDSL.g:319:4: otherlv_24= 'StateAfterTermination:'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getModelAccess().getStateAfterTerminationKeyword_17());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:324:3: ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPactDSL.g:325:4: ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.'
            	    {
            	    // InternalPactDSL.g:325:4: ( (lv_stateTypes_25_0= ruleStateType ) )
            	    // InternalPactDSL.g:326:5: (lv_stateTypes_25_0= ruleStateType )
            	    {
            	    // InternalPactDSL.g:326:5: (lv_stateTypes_25_0= ruleStateType )
            	    // InternalPactDSL.g:327:6: lv_stateTypes_25_0= ruleStateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_18_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stateTypes_25_0=ruleStateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateTypes",
            	    							lv_stateTypes_25_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.StateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_26=(Token)match(input,12,FOLLOW_15); 

            	    				newLeafNode(otherlv_26, grammarAccess.getModelAccess().getFullStopKeyword_18_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_27=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_27, grammarAccess.getModelAccess().getBoilerplateKeyword_19());
            		
            // InternalPactDSL.g:353:3: ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=70 && LA15_0<=72)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPactDSL.g:354:4: ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.'
            	    {
            	    // InternalPactDSL.g:354:4: ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) )
            	    // InternalPactDSL.g:355:5: (lv_boilerplateTypes_28_0= ruleBoilerplateType )
            	    {
            	    // InternalPactDSL.g:355:5: (lv_boilerplateTypes_28_0= ruleBoilerplateType )
            	    // InternalPactDSL.g:356:6: lv_boilerplateTypes_28_0= ruleBoilerplateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_20_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_boilerplateTypes_28_0=ruleBoilerplateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boilerplateTypes",
            	    							lv_boilerplateTypes_28_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.BoilerplateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_29=(Token)match(input,12,FOLLOW_16); 

            	    				newLeafNode(otherlv_29, grammarAccess.getModelAccess().getFullStopKeyword_20_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntityType"
    // InternalPactDSL.g:382:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalPactDSL.g:382:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalPactDSL.g:383:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalPactDSL.g:389:1: ruleEntityType returns [EObject current=null] : (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        EObject this_EffectiveDate_0 = null;

        EObject this_Party_1 = null;

        EObject this_ThirdParty_2 = null;

        EObject this_SubjectMatter_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:395:2: ( (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter ) )
            // InternalPactDSL.g:396:2: (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter )
            {
            // InternalPactDSL.g:396:2: (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPactDSL.g:397:3: this_EffectiveDate_0= ruleEffectiveDate
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectiveDate_0=ruleEffectiveDate();

                    state._fsp--;


                    			current = this_EffectiveDate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:406:3: this_Party_1= ruleParty
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Party_1=ruleParty();

                    state._fsp--;


                    			current = this_Party_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:415:3: this_ThirdParty_2= ruleThirdParty
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThirdParty_2=ruleThirdParty();

                    state._fsp--;


                    			current = this_ThirdParty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:424:3: this_SubjectMatter_3= ruleSubjectMatter
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubjectMatter_3=ruleSubjectMatter();

                    state._fsp--;


                    			current = this_SubjectMatter_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEffectiveDate"
    // InternalPactDSL.g:436:1: entryRuleEffectiveDate returns [EObject current=null] : iv_ruleEffectiveDate= ruleEffectiveDate EOF ;
    public final EObject entryRuleEffectiveDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveDate = null;


        try {
            // InternalPactDSL.g:436:54: (iv_ruleEffectiveDate= ruleEffectiveDate EOF )
            // InternalPactDSL.g:437:2: iv_ruleEffectiveDate= ruleEffectiveDate EOF
            {
             newCompositeNode(grammarAccess.getEffectiveDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectiveDate=ruleEffectiveDate();

            state._fsp--;

             current =iv_ruleEffectiveDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectiveDate"


    // $ANTLR start "ruleEffectiveDate"
    // InternalPactDSL.g:443:1: ruleEffectiveDate returns [EObject current=null] : (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleEffectiveDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_day_1_0=null;
        Token lv_month_2_0=null;
        Token lv_year_3_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:449:2: ( (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ ) )
            // InternalPactDSL.g:450:2: (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ )
            {
            // InternalPactDSL.g:450:2: (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ )
            // InternalPactDSL.g:451:3: otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0());
            		
            // InternalPactDSL.g:455:3: ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPactDSL.g:456:4: ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) )
            	    {
            	    // InternalPactDSL.g:456:4: ( (lv_day_1_0= RULE_INT ) )
            	    // InternalPactDSL.g:457:5: (lv_day_1_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:457:5: (lv_day_1_0= RULE_INT )
            	    // InternalPactDSL.g:458:6: lv_day_1_0= RULE_INT
            	    {
            	    lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    						newLeafNode(lv_day_1_0, grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEffectiveDateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"day",
            	    							lv_day_1_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:474:4: ( (lv_month_2_0= RULE_INT ) )
            	    // InternalPactDSL.g:475:5: (lv_month_2_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:475:5: (lv_month_2_0= RULE_INT )
            	    // InternalPactDSL.g:476:6: lv_month_2_0= RULE_INT
            	    {
            	    lv_month_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    						newLeafNode(lv_month_2_0, grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEffectiveDateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"month",
            	    							lv_month_2_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:492:4: ( (lv_year_3_0= RULE_INT ) )
            	    // InternalPactDSL.g:493:5: (lv_year_3_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:493:5: (lv_year_3_0= RULE_INT )
            	    // InternalPactDSL.g:494:6: lv_year_3_0= RULE_INT
            	    {
            	    lv_year_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    						newLeafNode(lv_year_3_0, grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEffectiveDateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"year",
            	    							lv_year_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectiveDate"


    // $ANTLR start "entryRuleParty"
    // InternalPactDSL.g:515:1: entryRuleParty returns [EObject current=null] : iv_ruleParty= ruleParty EOF ;
    public final EObject entryRuleParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParty = null;


        try {
            // InternalPactDSL.g:515:46: (iv_ruleParty= ruleParty EOF )
            // InternalPactDSL.g:516:2: iv_ruleParty= ruleParty EOF
            {
             newCompositeNode(grammarAccess.getPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParty=ruleParty();

            state._fsp--;

             current =iv_ruleParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // InternalPactDSL.g:522:1: ruleParty returns [EObject current=null] : (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) ;
    public final EObject ruleParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fullname_2_0=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:528:2: ( (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:529:2: (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:529:2: (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            // InternalPactDSL.g:530:3: otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPartyAccess().getPartyKeyword_0());
            		
            // InternalPactDSL.g:534:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:535:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:535:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:536:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPactDSL.g:552:3: ( (lv_fullname_2_0= RULE_STRING ) )
            // InternalPactDSL.g:553:4: (lv_fullname_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:553:4: (lv_fullname_2_0= RULE_STRING )
            // InternalPactDSL.g:554:5: lv_fullname_2_0= RULE_STRING
            {
            lv_fullname_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_fullname_2_0, grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fullname",
            						lv_fullname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:570:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=26 && LA18_0<=29)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPactDSL.g:571:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:571:4: (lv_feature_3_0= ruleFeature )
            	    // InternalPactDSL.g:572:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPartyAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRuleThirdParty"
    // InternalPactDSL.g:593:1: entryRuleThirdParty returns [EObject current=null] : iv_ruleThirdParty= ruleThirdParty EOF ;
    public final EObject entryRuleThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdParty = null;


        try {
            // InternalPactDSL.g:593:51: (iv_ruleThirdParty= ruleThirdParty EOF )
            // InternalPactDSL.g:594:2: iv_ruleThirdParty= ruleThirdParty EOF
            {
             newCompositeNode(grammarAccess.getThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThirdParty=ruleThirdParty();

            state._fsp--;

             current =iv_ruleThirdParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThirdParty"


    // $ANTLR start "ruleThirdParty"
    // InternalPactDSL.g:600:1: ruleThirdParty returns [EObject current=null] : (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) ;
    public final EObject ruleThirdParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fullname_2_0=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:606:2: ( (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:607:2: (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:607:2: (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            // InternalPactDSL.g:608:3: otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:612:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:613:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:613:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:614:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPactDSL.g:630:3: ( (lv_fullname_2_0= RULE_STRING ) )
            // InternalPactDSL.g:631:4: (lv_fullname_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:631:4: (lv_fullname_2_0= RULE_STRING )
            // InternalPactDSL.g:632:5: lv_fullname_2_0= RULE_STRING
            {
            lv_fullname_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_fullname_2_0, grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fullname",
            						lv_fullname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:648:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=26 && LA19_0<=29)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPactDSL.g:649:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:649:4: (lv_feature_3_0= ruleFeature )
            	    // InternalPactDSL.g:650:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getThirdPartyAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThirdPartyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThirdParty"


    // $ANTLR start "entryRuleSubjectMatter"
    // InternalPactDSL.g:671:1: entryRuleSubjectMatter returns [EObject current=null] : iv_ruleSubjectMatter= ruleSubjectMatter EOF ;
    public final EObject entryRuleSubjectMatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectMatter = null;


        try {
            // InternalPactDSL.g:671:54: (iv_ruleSubjectMatter= ruleSubjectMatter EOF )
            // InternalPactDSL.g:672:2: iv_ruleSubjectMatter= ruleSubjectMatter EOF
            {
             newCompositeNode(grammarAccess.getSubjectMatterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubjectMatter=ruleSubjectMatter();

            state._fsp--;

             current =iv_ruleSubjectMatter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubjectMatter"


    // $ANTLR start "ruleSubjectMatter"
    // InternalPactDSL.g:678:1: ruleSubjectMatter returns [EObject current=null] : (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) ;
    public final EObject ruleSubjectMatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_subjectMatter_2_0=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:684:2: ( (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:685:2: (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:685:2: (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            // InternalPactDSL.g:686:3: otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0());
            		
            // InternalPactDSL.g:690:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:691:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:691:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:692:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubjectMatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPactDSL.g:708:3: ( (lv_subjectMatter_2_0= RULE_STRING ) )
            // InternalPactDSL.g:709:4: (lv_subjectMatter_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:709:4: (lv_subjectMatter_2_0= RULE_STRING )
            // InternalPactDSL.g:710:5: lv_subjectMatter_2_0= RULE_STRING
            {
            lv_subjectMatter_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_subjectMatter_2_0, grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubjectMatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subjectMatter",
            						lv_subjectMatter_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:726:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=26 && LA20_0<=29)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPactDSL.g:727:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:727:4: (lv_feature_3_0= ruleFeature )
            	    // InternalPactDSL.g:728:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getSubjectMatterAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubjectMatterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubjectMatter"


    // $ANTLR start "entryRuleFeature"
    // InternalPactDSL.g:749:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPactDSL.g:749:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPactDSL.g:750:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPactDSL.g:756:1: ruleFeature returns [EObject current=null] : ( (lv_featuretype_0_0= ruleFeatureType ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_featuretype_0_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:762:2: ( ( (lv_featuretype_0_0= ruleFeatureType ) ) )
            // InternalPactDSL.g:763:2: ( (lv_featuretype_0_0= ruleFeatureType ) )
            {
            // InternalPactDSL.g:763:2: ( (lv_featuretype_0_0= ruleFeatureType ) )
            // InternalPactDSL.g:764:3: (lv_featuretype_0_0= ruleFeatureType )
            {
            // InternalPactDSL.g:764:3: (lv_featuretype_0_0= ruleFeatureType )
            // InternalPactDSL.g:765:4: lv_featuretype_0_0= ruleFeatureType
            {

            				newCompositeNode(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_featuretype_0_0=ruleFeatureType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeatureRule());
            				}
            				set(
            					current,
            					"featuretype",
            					lv_featuretype_0_0,
            					"imperialmsc.lmw21.pactdsl.PactDSL.FeatureType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureType"
    // InternalPactDSL.g:785:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // InternalPactDSL.g:785:52: (iv_ruleFeatureType= ruleFeatureType EOF )
            // InternalPactDSL.g:786:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // InternalPactDSL.g:792:1: ruleFeatureType returns [EObject current=null] : (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject this_DefinedTerm_0 = null;

        EObject this_Address_1 = null;

        EObject this_CompanyNumber_2 = null;

        EObject this_CustomFeature_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:798:2: ( (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature ) )
            // InternalPactDSL.g:799:2: (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature )
            {
            // InternalPactDSL.g:799:2: (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt21=1;
                }
                break;
            case 27:
                {
                alt21=2;
                }
                break;
            case 28:
                {
                alt21=3;
                }
                break;
            case 29:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPactDSL.g:800:3: this_DefinedTerm_0= ruleDefinedTerm
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getDefinedTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinedTerm_0=ruleDefinedTerm();

                    state._fsp--;


                    			current = this_DefinedTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:809:3: this_Address_1= ruleAddress
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getAddressParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Address_1=ruleAddress();

                    state._fsp--;


                    			current = this_Address_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:818:3: this_CompanyNumber_2= ruleCompanyNumber
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getCompanyNumberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompanyNumber_2=ruleCompanyNumber();

                    state._fsp--;


                    			current = this_CompanyNumber_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:827:3: this_CustomFeature_3= ruleCustomFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getCustomFeatureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomFeature_3=ruleCustomFeature();

                    state._fsp--;


                    			current = this_CustomFeature_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleDefinedTerm"
    // InternalPactDSL.g:839:1: entryRuleDefinedTerm returns [EObject current=null] : iv_ruleDefinedTerm= ruleDefinedTerm EOF ;
    public final EObject entryRuleDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedTerm = null;


        try {
            // InternalPactDSL.g:839:52: (iv_ruleDefinedTerm= ruleDefinedTerm EOF )
            // InternalPactDSL.g:840:2: iv_ruleDefinedTerm= ruleDefinedTerm EOF
            {
             newCompositeNode(grammarAccess.getDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinedTerm=ruleDefinedTerm();

            state._fsp--;

             current =iv_ruleDefinedTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinedTerm"


    // $ANTLR start "ruleDefinedTerm"
    // InternalPactDSL.g:846:1: ruleDefinedTerm returns [EObject current=null] : (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:852:2: ( (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:853:2: (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:853:2: (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:854:3: otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0());
            		
            // InternalPactDSL.g:858:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:859:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:859:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:860:5: lv_definition_1_0= RULE_STRING
            {
            lv_definition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_definition_1_0, grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinedTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinedTerm"


    // $ANTLR start "entryRuleAddress"
    // InternalPactDSL.g:880:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalPactDSL.g:880:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalPactDSL.g:881:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalPactDSL.g:887:1: ruleAddress returns [EObject current=null] : (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:893:2: ( (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:894:2: (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:894:2: (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:895:3: otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getWithAddressKeyword_0());
            		
            // InternalPactDSL.g:899:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:900:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:900:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:901:5: lv_definition_1_0= RULE_STRING
            {
            lv_definition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_definition_1_0, grammarAccess.getAddressAccess().getDefinitionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleCompanyNumber"
    // InternalPactDSL.g:921:1: entryRuleCompanyNumber returns [EObject current=null] : iv_ruleCompanyNumber= ruleCompanyNumber EOF ;
    public final EObject entryRuleCompanyNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompanyNumber = null;


        try {
            // InternalPactDSL.g:921:54: (iv_ruleCompanyNumber= ruleCompanyNumber EOF )
            // InternalPactDSL.g:922:2: iv_ruleCompanyNumber= ruleCompanyNumber EOF
            {
             newCompositeNode(grammarAccess.getCompanyNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompanyNumber=ruleCompanyNumber();

            state._fsp--;

             current =iv_ruleCompanyNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompanyNumber"


    // $ANTLR start "ruleCompanyNumber"
    // InternalPactDSL.g:928:1: ruleCompanyNumber returns [EObject current=null] : (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCompanyNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:934:2: ( (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:935:2: (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:935:2: (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:936:3: otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0());
            		
            // InternalPactDSL.g:940:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:941:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:941:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:942:5: lv_definition_1_0= RULE_STRING
            {
            lv_definition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_definition_1_0, grammarAccess.getCompanyNumberAccess().getDefinitionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompanyNumber"


    // $ANTLR start "entryRuleCustomFeature"
    // InternalPactDSL.g:962:1: entryRuleCustomFeature returns [EObject current=null] : iv_ruleCustomFeature= ruleCustomFeature EOF ;
    public final EObject entryRuleCustomFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFeature = null;


        try {
            // InternalPactDSL.g:962:54: (iv_ruleCustomFeature= ruleCustomFeature EOF )
            // InternalPactDSL.g:963:2: iv_ruleCustomFeature= ruleCustomFeature EOF
            {
             newCompositeNode(grammarAccess.getCustomFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomFeature=ruleCustomFeature();

            state._fsp--;

             current =iv_ruleCustomFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFeature"


    // $ANTLR start "ruleCustomFeature"
    // InternalPactDSL.g:969:1: ruleCustomFeature returns [EObject current=null] : (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_feature_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:975:2: ( (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:976:2: (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:976:2: (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:977:3: otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0());
            		
            // InternalPactDSL.g:981:3: ( (lv_feature_1_0= RULE_STRING ) )
            // InternalPactDSL.g:982:4: (lv_feature_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:982:4: (lv_feature_1_0= RULE_STRING )
            // InternalPactDSL.g:983:5: lv_feature_1_0= RULE_STRING
            {
            lv_feature_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_feature_1_0, grammarAccess.getCustomFeatureAccess().getFeatureSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feature",
            						lv_feature_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFeature"


    // $ANTLR start "entryRuleFormalityType"
    // InternalPactDSL.g:1003:1: entryRuleFormalityType returns [EObject current=null] : iv_ruleFormalityType= ruleFormalityType EOF ;
    public final EObject entryRuleFormalityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalityType = null;


        try {
            // InternalPactDSL.g:1003:54: (iv_ruleFormalityType= ruleFormalityType EOF )
            // InternalPactDSL.g:1004:2: iv_ruleFormalityType= ruleFormalityType EOF
            {
             newCompositeNode(grammarAccess.getFormalityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormalityType=ruleFormalityType();

            state._fsp--;

             current =iv_ruleFormalityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalityType"


    // $ANTLR start "ruleFormalityType"
    // InternalPactDSL.g:1010:1: ruleFormalityType returns [EObject current=null] : (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality ) ;
    public final EObject ruleFormalityType() throws RecognitionException {
        EObject current = null;

        EObject this_InWriting_0 = null;

        EObject this_ByEmail_1 = null;

        EObject this_GivingNotice_2 = null;

        EObject this_CustomFormality_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1016:2: ( (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality ) )
            // InternalPactDSL.g:1017:2: (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality )
            {
            // InternalPactDSL.g:1017:2: (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            case 36:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalPactDSL.g:1018:3: this_InWriting_0= ruleInWriting
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InWriting_0=ruleInWriting();

                    state._fsp--;


                    			current = this_InWriting_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1027:3: this_ByEmail_1= ruleByEmail
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ByEmail_1=ruleByEmail();

                    state._fsp--;


                    			current = this_ByEmail_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1036:3: this_GivingNotice_2= ruleGivingNotice
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivingNotice_2=ruleGivingNotice();

                    state._fsp--;


                    			current = this_GivingNotice_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1045:3: this_CustomFormality_3= ruleCustomFormality
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomFormality_3=ruleCustomFormality();

                    state._fsp--;


                    			current = this_CustomFormality_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalityType"


    // $ANTLR start "entryRuleInWriting"
    // InternalPactDSL.g:1057:1: entryRuleInWriting returns [EObject current=null] : iv_ruleInWriting= ruleInWriting EOF ;
    public final EObject entryRuleInWriting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInWriting = null;


        try {
            // InternalPactDSL.g:1057:50: (iv_ruleInWriting= ruleInWriting EOF )
            // InternalPactDSL.g:1058:2: iv_ruleInWriting= ruleInWriting EOF
            {
             newCompositeNode(grammarAccess.getInWritingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInWriting=ruleInWriting();

            state._fsp--;

             current =iv_ruleInWriting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInWriting"


    // $ANTLR start "ruleInWriting"
    // InternalPactDSL.g:1064:1: ruleInWriting returns [EObject current=null] : (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInWriting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customWritingFormality_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1070:2: ( (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1071:2: (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1071:2: (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1072:3: otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInWritingAccess().getInWritingKeyword_0());
            		
            // InternalPactDSL.g:1076:3: ( (lv_customWritingFormality_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1077:4: (lv_customWritingFormality_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1077:4: (lv_customWritingFormality_1_0= RULE_STRING )
            // InternalPactDSL.g:1078:5: lv_customWritingFormality_1_0= RULE_STRING
            {
            lv_customWritingFormality_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customWritingFormality_1_0, grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInWritingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customWritingFormality",
            						lv_customWritingFormality_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInWriting"


    // $ANTLR start "entryRuleByEmail"
    // InternalPactDSL.g:1098:1: entryRuleByEmail returns [EObject current=null] : iv_ruleByEmail= ruleByEmail EOF ;
    public final EObject entryRuleByEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByEmail = null;


        try {
            // InternalPactDSL.g:1098:48: (iv_ruleByEmail= ruleByEmail EOF )
            // InternalPactDSL.g:1099:2: iv_ruleByEmail= ruleByEmail EOF
            {
             newCompositeNode(grammarAccess.getByEmailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleByEmail=ruleByEmail();

            state._fsp--;

             current =iv_ruleByEmail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByEmail"


    // $ANTLR start "ruleByEmail"
    // InternalPactDSL.g:1105:1: ruleByEmail returns [EObject current=null] : (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleByEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_emailAddress_2_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1111:2: ( (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1112:2: (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1112:2: (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1113:3: otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getByEmailAccess().getByEmailKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getByEmailAccess().getToKeyword_1());
            		
            // InternalPactDSL.g:1121:3: ( (lv_emailAddress_2_0= RULE_STRING ) )
            // InternalPactDSL.g:1122:4: (lv_emailAddress_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:1122:4: (lv_emailAddress_2_0= RULE_STRING )
            // InternalPactDSL.g:1123:5: lv_emailAddress_2_0= RULE_STRING
            {
            lv_emailAddress_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_emailAddress_2_0, grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getByEmailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"emailAddress",
            						lv_emailAddress_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleByEmail"


    // $ANTLR start "entryRuleGivingNotice"
    // InternalPactDSL.g:1143:1: entryRuleGivingNotice returns [EObject current=null] : iv_ruleGivingNotice= ruleGivingNotice EOF ;
    public final EObject entryRuleGivingNotice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivingNotice = null;


        try {
            // InternalPactDSL.g:1143:53: (iv_ruleGivingNotice= ruleGivingNotice EOF )
            // InternalPactDSL.g:1144:2: iv_ruleGivingNotice= ruleGivingNotice EOF
            {
             newCompositeNode(grammarAccess.getGivingNoticeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivingNotice=ruleGivingNotice();

            state._fsp--;

             current =iv_ruleGivingNotice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGivingNotice"


    // $ANTLR start "ruleGivingNotice"
    // InternalPactDSL.g:1150:1: ruleGivingNotice returns [EObject current=null] : (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) ) ;
    public final EObject ruleGivingNotice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numDays_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1156:2: ( (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) ) )
            // InternalPactDSL.g:1157:2: (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) )
            {
            // InternalPactDSL.g:1157:2: (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) )
            // InternalPactDSL.g:1158:3: otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0());
            		
            // InternalPactDSL.g:1162:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1163:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1163:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1164:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivingNoticeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:1175:3: (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )
            // InternalPactDSL.g:1176:4: otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days'
            {
            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            				newLeafNode(otherlv_2, grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0());
            			
            // InternalPactDSL.g:1180:4: ( (lv_numDays_3_0= RULE_INT ) )
            // InternalPactDSL.g:1181:5: (lv_numDays_3_0= RULE_INT )
            {
            // InternalPactDSL.g:1181:5: (lv_numDays_3_0= RULE_INT )
            // InternalPactDSL.g:1182:6: lv_numDays_3_0= RULE_INT
            {
            lv_numDays_3_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            						newLeafNode(lv_numDays_3_0, grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGivingNoticeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"numDays",
            							lv_numDays_3_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            				newLeafNode(otherlv_4, grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivingNotice"


    // $ANTLR start "entryRuleCustomFormality"
    // InternalPactDSL.g:1207:1: entryRuleCustomFormality returns [EObject current=null] : iv_ruleCustomFormality= ruleCustomFormality EOF ;
    public final EObject entryRuleCustomFormality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFormality = null;


        try {
            // InternalPactDSL.g:1207:56: (iv_ruleCustomFormality= ruleCustomFormality EOF )
            // InternalPactDSL.g:1208:2: iv_ruleCustomFormality= ruleCustomFormality EOF
            {
             newCompositeNode(grammarAccess.getCustomFormalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomFormality=ruleCustomFormality();

            state._fsp--;

             current =iv_ruleCustomFormality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFormality"


    // $ANTLR start "ruleCustomFormality"
    // InternalPactDSL.g:1214:1: ruleCustomFormality returns [EObject current=null] : (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomFormality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customFormality_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1220:2: ( (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1221:2: (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1221:2: (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1222:3: otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0());
            		
            // InternalPactDSL.g:1226:3: ( (lv_customFormality_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1227:4: (lv_customFormality_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1227:4: (lv_customFormality_1_0= RULE_STRING )
            // InternalPactDSL.g:1228:5: lv_customFormality_1_0= RULE_STRING
            {
            lv_customFormality_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customFormality_1_0, grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomFormalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customFormality",
            						lv_customFormality_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFormality"


    // $ANTLR start "entryRuleActionType"
    // InternalPactDSL.g:1248:1: entryRuleActionType returns [EObject current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final EObject entryRuleActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionType = null;


        try {
            // InternalPactDSL.g:1248:51: (iv_ruleActionType= ruleActionType EOF )
            // InternalPactDSL.g:1249:2: iv_ruleActionType= ruleActionType EOF
            {
             newCompositeNode(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionType=ruleActionType();

            state._fsp--;

             current =iv_ruleActionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalPactDSL.g:1255:1: ruleActionType returns [EObject current=null] : (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent ) ;
    public final EObject ruleActionType() throws RecognitionException {
        EObject current = null;

        EObject this_GivenConsent_0 = null;

        EObject this_GivenWrittenConsent_1 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1261:2: ( (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent ) )
            // InternalPactDSL.g:1262:2: (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent )
            {
            // InternalPactDSL.g:1262:2: (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==38) ) {
                    alt23=2;
                }
                else if ( (LA23_1==37) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPactDSL.g:1263:3: this_GivenConsent_0= ruleGivenConsent
                    {

                    			newCompositeNode(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivenConsent_0=ruleGivenConsent();

                    state._fsp--;


                    			current = this_GivenConsent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1272:3: this_GivenWrittenConsent_1= ruleGivenWrittenConsent
                    {

                    			newCompositeNode(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivenWrittenConsent_1=ruleGivenWrittenConsent();

                    state._fsp--;


                    			current = this_GivenWrittenConsent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGivenConsent"
    // InternalPactDSL.g:1284:1: entryRuleGivenConsent returns [EObject current=null] : iv_ruleGivenConsent= ruleGivenConsent EOF ;
    public final EObject entryRuleGivenConsent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenConsent = null;


        try {
            // InternalPactDSL.g:1284:53: (iv_ruleGivenConsent= ruleGivenConsent EOF )
            // InternalPactDSL.g:1285:2: iv_ruleGivenConsent= ruleGivenConsent EOF
            {
             newCompositeNode(grammarAccess.getGivenConsentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenConsent=ruleGivenConsent();

            state._fsp--;

             current =iv_ruleGivenConsent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGivenConsent"


    // $ANTLR start "ruleGivenConsent"
    // InternalPactDSL.g:1291:1: ruleGivenConsent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' ) ;
    public final EObject ruleGivenConsent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1297:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' ) )
            // InternalPactDSL.g:1298:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' )
            {
            // InternalPactDSL.g:1298:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' )
            // InternalPactDSL.g:1299:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent'
            {
            // InternalPactDSL.g:1299:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1300:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1300:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1301:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenConsentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivenConsent"


    // $ANTLR start "entryRuleGivenWrittenConsent"
    // InternalPactDSL.g:1320:1: entryRuleGivenWrittenConsent returns [EObject current=null] : iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF ;
    public final EObject entryRuleGivenWrittenConsent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenWrittenConsent = null;


        try {
            // InternalPactDSL.g:1320:60: (iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF )
            // InternalPactDSL.g:1321:2: iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF
            {
             newCompositeNode(grammarAccess.getGivenWrittenConsentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenWrittenConsent=ruleGivenWrittenConsent();

            state._fsp--;

             current =iv_ruleGivenWrittenConsent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGivenWrittenConsent"


    // $ANTLR start "ruleGivenWrittenConsent"
    // InternalPactDSL.g:1327:1: ruleGivenWrittenConsent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' ) ;
    public final EObject ruleGivenWrittenConsent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1333:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:1334:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:1334:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' )
            // InternalPactDSL.g:1335:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent'
            {
            // InternalPactDSL.g:1335:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1336:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1336:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1337:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenWrittenConsentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivenWrittenConsent"


    // $ANTLR start "entryRuleStateType"
    // InternalPactDSL.g:1356:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // InternalPactDSL.g:1356:50: (iv_ruleStateType= ruleStateType EOF )
            // InternalPactDSL.g:1357:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // InternalPactDSL.g:1363:1: ruleStateType returns [EObject current=null] : (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        EObject this_Ownership_0 = null;

        EObject this_RightToUse_1 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1369:2: ( (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse ) )
            // InternalPactDSL.g:1370:2: (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse )
            {
            // InternalPactDSL.g:1370:2: (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=39 && LA24_1<=40)) ) {
                    alt24=1;
                }
                else if ( ((LA24_1>=41 && LA24_1<=42)) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPactDSL.g:1371:3: this_Ownership_0= ruleOwnership
                    {

                    			newCompositeNode(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ownership_0=ruleOwnership();

                    state._fsp--;


                    			current = this_Ownership_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1380:3: this_RightToUse_1= ruleRightToUse
                    {

                    			newCompositeNode(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightToUse_1=ruleRightToUse();

                    state._fsp--;


                    			current = this_RightToUse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleOwnership"
    // InternalPactDSL.g:1392:1: entryRuleOwnership returns [EObject current=null] : iv_ruleOwnership= ruleOwnership EOF ;
    public final EObject entryRuleOwnership() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnership = null;


        try {
            // InternalPactDSL.g:1392:50: (iv_ruleOwnership= ruleOwnership EOF )
            // InternalPactDSL.g:1393:2: iv_ruleOwnership= ruleOwnership EOF
            {
             newCompositeNode(grammarAccess.getOwnershipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnership=ruleOwnership();

            state._fsp--;

             current =iv_ruleOwnership; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnership"


    // $ANTLR start "ruleOwnership"
    // InternalPactDSL.g:1399:1: ruleOwnership returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleOwnership() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_customOwnership_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1405:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) )
            // InternalPactDSL.g:1406:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalPactDSL.g:1406:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            // InternalPactDSL.g:1407:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) )
            {
            // InternalPactDSL.g:1407:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1408:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1408:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1409:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOwnershipRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            // InternalPactDSL.g:1420:3: (otherlv_1= 'owns' | otherlv_2= 'willReturn' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            else if ( (LA25_0==40) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPactDSL.g:1421:4: otherlv_1= 'owns'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getOwnershipAccess().getOwnsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1426:4: otherlv_2= 'willReturn'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getOwnershipAccess().getWillReturnKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:1431:3: ( (lv_customOwnership_3_0= RULE_STRING ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPactDSL.g:1432:4: (lv_customOwnership_3_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:1432:4: (lv_customOwnership_3_0= RULE_STRING )
            	    // InternalPactDSL.g:1433:5: lv_customOwnership_3_0= RULE_STRING
            	    {
            	    lv_customOwnership_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    					newLeafNode(lv_customOwnership_3_0, grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOwnershipRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"customOwnership",
            	    						lv_customOwnership_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalPactDSL.g:1449:3: ( (otherlv_4= RULE_ID ) )
            // InternalPactDSL.g:1450:4: (otherlv_4= RULE_ID )
            {
            // InternalPactDSL.g:1450:4: (otherlv_4= RULE_ID )
            // InternalPactDSL.g:1451:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOwnershipRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnership"


    // $ANTLR start "entryRuleRightToUse"
    // InternalPactDSL.g:1466:1: entryRuleRightToUse returns [EObject current=null] : iv_ruleRightToUse= ruleRightToUse EOF ;
    public final EObject entryRuleRightToUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightToUse = null;


        try {
            // InternalPactDSL.g:1466:51: (iv_ruleRightToUse= ruleRightToUse EOF )
            // InternalPactDSL.g:1467:2: iv_ruleRightToUse= ruleRightToUse EOF
            {
             newCompositeNode(grammarAccess.getRightToUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightToUse=ruleRightToUse();

            state._fsp--;

             current =iv_ruleRightToUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightToUse"


    // $ANTLR start "ruleRightToUse"
    // InternalPactDSL.g:1473:1: ruleRightToUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleRightToUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_customUsage_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1479:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) )
            // InternalPactDSL.g:1480:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalPactDSL.g:1480:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            // InternalPactDSL.g:1481:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) )
            {
            // InternalPactDSL.g:1481:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1482:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1482:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1483:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightToUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            // InternalPactDSL.g:1494:3: (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPactDSL.g:1495:4: otherlv_1= 'mayUse'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getRightToUseAccess().getMayUseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1500:4: otherlv_2= 'mayNotUse'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getRightToUseAccess().getMayNotUseKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:1505:3: ( (lv_customUsage_3_0= RULE_STRING ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPactDSL.g:1506:4: (lv_customUsage_3_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:1506:4: (lv_customUsage_3_0= RULE_STRING )
            	    // InternalPactDSL.g:1507:5: lv_customUsage_3_0= RULE_STRING
            	    {
            	    lv_customUsage_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    					newLeafNode(lv_customUsage_3_0, grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRightToUseRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"customUsage",
            	    						lv_customUsage_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalPactDSL.g:1523:3: ( (otherlv_4= RULE_ID ) )
            // InternalPactDSL.g:1524:4: (otherlv_4= RULE_ID )
            {
            // InternalPactDSL.g:1524:4: (otherlv_4= RULE_ID )
            // InternalPactDSL.g:1525:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightToUseRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightToUse"


    // $ANTLR start "entryRulePrimaryObligationType"
    // InternalPactDSL.g:1540:1: entryRulePrimaryObligationType returns [EObject current=null] : iv_rulePrimaryObligationType= rulePrimaryObligationType EOF ;
    public final EObject entryRulePrimaryObligationType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryObligationType = null;


        try {
            // InternalPactDSL.g:1540:62: (iv_rulePrimaryObligationType= rulePrimaryObligationType EOF )
            // InternalPactDSL.g:1541:2: iv_rulePrimaryObligationType= rulePrimaryObligationType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryObligationType=rulePrimaryObligationType();

            state._fsp--;

             current =iv_rulePrimaryObligationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryObligationType"


    // $ANTLR start "rulePrimaryObligationType"
    // InternalPactDSL.g:1547:1: rulePrimaryObligationType returns [EObject current=null] : (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) ) ;
    public final EObject rulePrimaryObligationType() throws RecognitionException {
        EObject current = null;

        Token lv_CustomObligation_6_0=null;
        EObject this_PaymentObligation_0 = null;

        EObject this_DeliveryObligation_1 = null;

        EObject this_TransferObligation_2 = null;

        EObject this_LicenceObligation_3 = null;

        EObject this_ConstraintParty_4 = null;

        EObject this_ConstraintThirdParty_5 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1553:2: ( (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1554:2: (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1554:2: (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 50:
                {
                alt29=3;
                }
                break;
            case 52:
                {
                alt29=4;
                }
                break;
            case 56:
                {
                alt29=5;
                }
                break;
            case 58:
                {
                alt29=6;
                }
                break;
            case RULE_STRING:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalPactDSL.g:1555:3: this_PaymentObligation_0= rulePaymentObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaymentObligation_0=rulePaymentObligation();

                    state._fsp--;


                    			current = this_PaymentObligation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1564:3: this_DeliveryObligation_1= ruleDeliveryObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeliveryObligation_1=ruleDeliveryObligation();

                    state._fsp--;


                    			current = this_DeliveryObligation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1573:3: this_TransferObligation_2= ruleTransferObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransferObligation_2=ruleTransferObligation();

                    state._fsp--;


                    			current = this_TransferObligation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1582:3: this_LicenceObligation_3= ruleLicenceObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LicenceObligation_3=ruleLicenceObligation();

                    state._fsp--;


                    			current = this_LicenceObligation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1591:3: this_ConstraintParty_4= ruleConstraintParty
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintParty_4=ruleConstraintParty();

                    state._fsp--;


                    			current = this_ConstraintParty_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPactDSL.g:1600:3: this_ConstraintThirdParty_5= ruleConstraintThirdParty
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintThirdParty_5=ruleConstraintThirdParty();

                    state._fsp--;


                    			current = this_ConstraintThirdParty_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPactDSL.g:1609:3: ( (lv_CustomObligation_6_0= RULE_STRING ) )
                    {
                    // InternalPactDSL.g:1609:3: ( (lv_CustomObligation_6_0= RULE_STRING ) )
                    // InternalPactDSL.g:1610:4: (lv_CustomObligation_6_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:1610:4: (lv_CustomObligation_6_0= RULE_STRING )
                    // InternalPactDSL.g:1611:5: lv_CustomObligation_6_0= RULE_STRING
                    {
                    lv_CustomObligation_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_CustomObligation_6_0, grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryObligationTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"CustomObligation",
                    						lv_CustomObligation_6_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryObligationType"


    // $ANTLR start "entryRulePaymentObligation"
    // InternalPactDSL.g:1631:1: entryRulePaymentObligation returns [EObject current=null] : iv_rulePaymentObligation= rulePaymentObligation EOF ;
    public final EObject entryRulePaymentObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentObligation = null;


        try {
            // InternalPactDSL.g:1631:58: (iv_rulePaymentObligation= rulePaymentObligation EOF )
            // InternalPactDSL.g:1632:2: iv_rulePaymentObligation= rulePaymentObligation EOF
            {
             newCompositeNode(grammarAccess.getPaymentObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaymentObligation=rulePaymentObligation();

            state._fsp--;

             current =iv_rulePaymentObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaymentObligation"


    // $ANTLR start "rulePaymentObligation"
    // InternalPactDSL.g:1638:1: rulePaymentObligation returns [EObject current=null] : (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
    public final EObject rulePaymentObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sum_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token lv_month_10_0=null;
        Token lv_year_11_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1644:2: ( (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1645:2: (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1645:2: (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1646:3: otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0());
            		
            // InternalPactDSL.g:1650:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1651:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1651:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1652:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getPaymentObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPaymentObligationAccess().getPayKeyword_3());
            		
            // InternalPactDSL.g:1671:3: ( (lv_sum_4_0= RULE_INT ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_INT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPactDSL.g:1672:4: (lv_sum_4_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:1672:4: (lv_sum_4_0= RULE_INT )
            	    // InternalPactDSL.g:1673:5: lv_sum_4_0= RULE_INT
            	    {
            	    lv_sum_4_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    					newLeafNode(lv_sum_4_0, grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPaymentObligationRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"sum",
            	    						lv_sum_4_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getPaymentObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1693:3: ( (otherlv_6= RULE_ID ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPactDSL.g:1694:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1694:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:1695:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPaymentObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // InternalPactDSL.g:1706:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPactDSL.g:1707:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getPaymentObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:1715:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:1716:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1716:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:1717:6: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_day_9_0, grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaymentObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:1733:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:1734:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1734:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:1735:6: lv_month_10_0= RULE_INT
                    {
                    lv_month_10_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_month_10_0, grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaymentObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:1751:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:1752:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1752:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:1753:6: lv_year_11_0= RULE_INT
                    {
                    lv_year_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_11_0, grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaymentObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaymentObligation"


    // $ANTLR start "entryRuleDeliveryObligation"
    // InternalPactDSL.g:1774:1: entryRuleDeliveryObligation returns [EObject current=null] : iv_ruleDeliveryObligation= ruleDeliveryObligation EOF ;
    public final EObject entryRuleDeliveryObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryObligation = null;


        try {
            // InternalPactDSL.g:1774:59: (iv_ruleDeliveryObligation= ruleDeliveryObligation EOF )
            // InternalPactDSL.g:1775:2: iv_ruleDeliveryObligation= ruleDeliveryObligation EOF
            {
             newCompositeNode(grammarAccess.getDeliveryObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeliveryObligation=ruleDeliveryObligation();

            state._fsp--;

             current =iv_ruleDeliveryObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeliveryObligation"


    // $ANTLR start "ruleDeliveryObligation"
    // InternalPactDSL.g:1781:1: ruleDeliveryObligation returns [EObject current=null] : (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDeliveryObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token lv_month_10_0=null;
        Token lv_year_11_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1787:2: ( (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1788:2: (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1788:2: (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1789:3: otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0());
            		
            // InternalPactDSL.g:1793:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1794:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1794:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1795:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3());
            		
            // InternalPactDSL.g:1814:3: ( (otherlv_4= RULE_ID ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPactDSL.g:1815:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1815:4: (otherlv_4= RULE_ID )
            	    // InternalPactDSL.g:1816:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getDeliveryObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1831:3: ( (otherlv_6= RULE_ID ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPactDSL.g:1832:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1832:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:1833:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            // InternalPactDSL.g:1844:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPactDSL.g:1845:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:1853:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:1854:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1854:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:1855:6: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_day_9_0, grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:1871:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:1872:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1872:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:1873:6: lv_month_10_0= RULE_INT
                    {
                    lv_month_10_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_month_10_0, grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:1889:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:1890:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1890:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:1891:6: lv_year_11_0= RULE_INT
                    {
                    lv_year_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_11_0, grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeliveryObligation"


    // $ANTLR start "entryRuleTransferObligation"
    // InternalPactDSL.g:1912:1: entryRuleTransferObligation returns [EObject current=null] : iv_ruleTransferObligation= ruleTransferObligation EOF ;
    public final EObject entryRuleTransferObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransferObligation = null;


        try {
            // InternalPactDSL.g:1912:59: (iv_ruleTransferObligation= ruleTransferObligation EOF )
            // InternalPactDSL.g:1913:2: iv_ruleTransferObligation= ruleTransferObligation EOF
            {
             newCompositeNode(grammarAccess.getTransferObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransferObligation=ruleTransferObligation();

            state._fsp--;

             current =iv_ruleTransferObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransferObligation"


    // $ANTLR start "ruleTransferObligation"
    // InternalPactDSL.g:1919:1: ruleTransferObligation returns [EObject current=null] : (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTransferObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token lv_month_10_0=null;
        Token lv_year_11_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1925:2: ( (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1926:2: (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1926:2: (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1927:3: otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0());
            		
            // InternalPactDSL.g:1931:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1932:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1932:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1933:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransferObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getTransferObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTransferObligationAccess().getTransferKeyword_3());
            		
            // InternalPactDSL.g:1952:3: ( (otherlv_4= RULE_ID ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPactDSL.g:1953:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1953:4: (otherlv_4= RULE_ID )
            	    // InternalPactDSL.g:1954:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTransferObligationRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getTransferObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1969:3: ( (otherlv_6= RULE_ID ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPactDSL.g:1970:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1970:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:1971:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTransferObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    					newLeafNode(otherlv_6, grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // InternalPactDSL.g:1982:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPactDSL.g:1983:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransferObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransferObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:1991:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:1992:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1992:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:1993:6: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_day_9_0, grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransferObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2009:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:2010:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2010:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:2011:6: lv_month_10_0= RULE_INT
                    {
                    lv_month_10_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_month_10_0, grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransferObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2027:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:2028:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2028:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:2029:6: lv_year_11_0= RULE_INT
                    {
                    lv_year_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_11_0, grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransferObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransferObligation"


    // $ANTLR start "entryRuleLicenceObligation"
    // InternalPactDSL.g:2050:1: entryRuleLicenceObligation returns [EObject current=null] : iv_ruleLicenceObligation= ruleLicenceObligation EOF ;
    public final EObject entryRuleLicenceObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicenceObligation = null;


        try {
            // InternalPactDSL.g:2050:58: (iv_ruleLicenceObligation= ruleLicenceObligation EOF )
            // InternalPactDSL.g:2051:2: iv_ruleLicenceObligation= ruleLicenceObligation EOF
            {
             newCompositeNode(grammarAccess.getLicenceObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLicenceObligation=ruleLicenceObligation();

            state._fsp--;

             current =iv_ruleLicenceObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLicenceObligation"


    // $ANTLR start "ruleLicenceObligation"
    // InternalPactDSL.g:2057:1: ruleLicenceObligation returns [EObject current=null] : (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* ) ;
    public final EObject ruleLicenceObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_day_11_0=null;
        Token lv_month_12_0=null;
        Token lv_year_13_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2063:2: ( (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* ) )
            // InternalPactDSL.g:2064:2: (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* )
            {
            // InternalPactDSL.g:2064:2: (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* )
            // InternalPactDSL.g:2065:3: otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0());
            		
            // InternalPactDSL.g:2069:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2070:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2070:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2071:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLicenceObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getLicenceObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getLicenceObligationAccess().getGrantKeyword_3());
            		
            otherlv_4=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_4, grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4());
            		
            otherlv_5=(Token)match(input,55,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getLicenceObligationAccess().getInKeyword_5());
            		
            // InternalPactDSL.g:2098:3: ( (otherlv_6= RULE_ID ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPactDSL.g:2099:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2099:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2100:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_7=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getLicenceObligationAccess().getToKeyword_7());
            		
            // InternalPactDSL.g:2115:3: ( (otherlv_8= RULE_ID ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPactDSL.g:2116:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2116:4: (otherlv_8= RULE_ID )
            	    // InternalPactDSL.g:2117:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // InternalPactDSL.g:2128:3: (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==46) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPactDSL.g:2129:4: otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_33); 

            	    				newLeafNode(otherlv_9, grammarAccess.getLicenceObligationAccess().getByKeyword_9_0());
            	    			
            	    otherlv_10=(Token)match(input,47,FOLLOW_17); 

            	    				newLeafNode(otherlv_10, grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1());
            	    			
            	    // InternalPactDSL.g:2137:4: ( (lv_day_11_0= RULE_INT ) )
            	    // InternalPactDSL.g:2138:5: (lv_day_11_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2138:5: (lv_day_11_0= RULE_INT )
            	    // InternalPactDSL.g:2139:6: lv_day_11_0= RULE_INT
            	    {
            	    lv_day_11_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    						newLeafNode(lv_day_11_0, grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"day",
            	    							lv_day_11_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:2155:4: ( (lv_month_12_0= RULE_INT ) )
            	    // InternalPactDSL.g:2156:5: (lv_month_12_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2156:5: (lv_month_12_0= RULE_INT )
            	    // InternalPactDSL.g:2157:6: lv_month_12_0= RULE_INT
            	    {
            	    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    						newLeafNode(lv_month_12_0, grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"month",
            	    							lv_month_12_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:2173:4: ( (lv_year_13_0= RULE_INT ) )
            	    // InternalPactDSL.g:2174:5: (lv_year_13_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2174:5: (lv_year_13_0= RULE_INT )
            	    // InternalPactDSL.g:2175:6: lv_year_13_0= RULE_INT
            	    {
            	    lv_year_13_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            	    						newLeafNode(lv_year_13_0, grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"year",
            	    							lv_year_13_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLicenceObligation"


    // $ANTLR start "entryRuleConstraintParty"
    // InternalPactDSL.g:2196:1: entryRuleConstraintParty returns [EObject current=null] : iv_ruleConstraintParty= ruleConstraintParty EOF ;
    public final EObject entryRuleConstraintParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintParty = null;


        try {
            // InternalPactDSL.g:2196:56: (iv_ruleConstraintParty= ruleConstraintParty EOF )
            // InternalPactDSL.g:2197:2: iv_ruleConstraintParty= ruleConstraintParty EOF
            {
             newCompositeNode(grammarAccess.getConstraintPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintParty=ruleConstraintParty();

            state._fsp--;

             current =iv_ruleConstraintParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintParty"


    // $ANTLR start "ruleConstraintParty"
    // InternalPactDSL.g:2203:1: ruleConstraintParty returns [EObject current=null] : (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleConstraintParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_forbiddenAction_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2209:2: ( (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2210:2: (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2210:2: (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalPactDSL.g:2211:3: otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0());
            		
            // InternalPactDSL.g:2215:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2216:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2216:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2217:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2());
            		
            // InternalPactDSL.g:2232:3: ( (lv_forbiddenAction_3_0= RULE_STRING ) )
            // InternalPactDSL.g:2233:4: (lv_forbiddenAction_3_0= RULE_STRING )
            {
            // InternalPactDSL.g:2233:4: (lv_forbiddenAction_3_0= RULE_STRING )
            // InternalPactDSL.g:2234:5: lv_forbiddenAction_3_0= RULE_STRING
            {
            lv_forbiddenAction_3_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_forbiddenAction_3_0, grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forbiddenAction",
            						lv_forbiddenAction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2250:3: ( (otherlv_4= RULE_ID ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPactDSL.g:2251:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:2251:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:2252:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintPartyRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_43); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2263:3: (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPactDSL.g:2264:4: otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstraintPartyAccess().getToKeyword_5_0());
                    			
                    // InternalPactDSL.g:2268:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPactDSL.g:2269:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPactDSL.g:2269:5: (otherlv_6= RULE_ID )
                    // InternalPactDSL.g:2270:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintPartyRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintParty"


    // $ANTLR start "entryRuleConstraintThirdParty"
    // InternalPactDSL.g:2286:1: entryRuleConstraintThirdParty returns [EObject current=null] : iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF ;
    public final EObject entryRuleConstraintThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintThirdParty = null;


        try {
            // InternalPactDSL.g:2286:61: (iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:2287:2: iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF
            {
             newCompositeNode(grammarAccess.getConstraintThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintThirdParty=ruleConstraintThirdParty();

            state._fsp--;

             current =iv_ruleConstraintThirdParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintThirdParty"


    // $ANTLR start "ruleConstraintThirdParty"
    // InternalPactDSL.g:2293:1: ruleConstraintThirdParty returns [EObject current=null] : (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? ) ;
    public final EObject ruleConstraintThirdParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_forbiddenAction_3_0=null;
        Token otherlv_4=null;
        Token lv_additionalInfo_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2299:2: ( (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2300:2: (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2300:2: (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? )
            // InternalPactDSL.g:2301:3: otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:2305:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2306:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2306:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2307:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2());
            		
            // InternalPactDSL.g:2322:3: ( (lv_forbiddenAction_3_0= RULE_STRING ) )
            // InternalPactDSL.g:2323:4: (lv_forbiddenAction_3_0= RULE_STRING )
            {
            // InternalPactDSL.g:2323:4: (lv_forbiddenAction_3_0= RULE_STRING )
            // InternalPactDSL.g:2324:5: lv_forbiddenAction_3_0= RULE_STRING
            {
            lv_forbiddenAction_3_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

            					newLeafNode(lv_forbiddenAction_3_0, grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forbiddenAction",
            						lv_forbiddenAction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2340:3: ( (otherlv_4= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPactDSL.g:2341:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:2341:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:2342:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_45); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2353:3: ( (lv_additionalInfo_5_0= RULE_STRING ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPactDSL.g:2354:4: (lv_additionalInfo_5_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:2354:4: (lv_additionalInfo_5_0= RULE_STRING )
                    // InternalPactDSL.g:2355:5: lv_additionalInfo_5_0= RULE_STRING
                    {
                    lv_additionalInfo_5_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    					newLeafNode(lv_additionalInfo_5_0, grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"additionalInfo",
                    						lv_additionalInfo_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2371:3: (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPactDSL.g:2372:4: otherlv_6= 'to' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0());
                    			
                    // InternalPactDSL.g:2376:4: ( (otherlv_7= RULE_ID ) )
                    // InternalPactDSL.g:2377:5: (otherlv_7= RULE_ID )
                    {
                    // InternalPactDSL.g:2377:5: (otherlv_7= RULE_ID )
                    // InternalPactDSL.g:2378:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_7, grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2390:3: (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPactDSL.g:2391:4: otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_48); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,60,FOLLOW_49); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1());
                    			
                    otherlv_10=(Token)match(input,61,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2());
                    			
                    // InternalPactDSL.g:2403:4: ( (otherlv_11= RULE_ID ) )
                    // InternalPactDSL.g:2404:5: (otherlv_11= RULE_ID )
                    {
                    // InternalPactDSL.g:2404:5: (otherlv_11= RULE_ID )
                    // InternalPactDSL.g:2405:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_11, grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintThirdParty"


    // $ANTLR start "entryRuleTerminationType"
    // InternalPactDSL.g:2421:1: entryRuleTerminationType returns [EObject current=null] : iv_ruleTerminationType= ruleTerminationType EOF ;
    public final EObject entryRuleTerminationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminationType = null;


        try {
            // InternalPactDSL.g:2421:56: (iv_ruleTerminationType= ruleTerminationType EOF )
            // InternalPactDSL.g:2422:2: iv_ruleTerminationType= ruleTerminationType EOF
            {
             newCompositeNode(grammarAccess.getTerminationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminationType=ruleTerminationType();

            state._fsp--;

             current =iv_ruleTerminationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminationType"


    // $ANTLR start "ruleTerminationType"
    // InternalPactDSL.g:2428:1: ruleTerminationType returns [EObject current=null] : (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination ) ;
    public final EObject ruleTerminationType() throws RecognitionException {
        EObject current = null;

        EObject this_ForConvenience_0 = null;

        EObject this_OnReasonableNotice_1 = null;

        EObject this_ForBreach_2 = null;

        EObject this_OnInsolvencyEvent_3 = null;

        EObject this_CustomTermination_4 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:2434:2: ( (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination ) )
            // InternalPactDSL.g:2435:2: (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination )
            {
            // InternalPactDSL.g:2435:2: (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt48=1;
                }
                break;
            case 65:
                {
                alt48=2;
                }
                break;
            case 66:
                {
                alt48=3;
                }
                break;
            case 68:
                {
                alt48=4;
                }
                break;
            case 19:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPactDSL.g:2436:3: this_ForConvenience_0= ruleForConvenience
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForConvenience_0=ruleForConvenience();

                    state._fsp--;


                    			current = this_ForConvenience_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:2445:3: this_OnReasonableNotice_1= ruleOnReasonableNotice
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnReasonableNotice_1=ruleOnReasonableNotice();

                    state._fsp--;


                    			current = this_OnReasonableNotice_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:2454:3: this_ForBreach_2= ruleForBreach
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForBreach_2=ruleForBreach();

                    state._fsp--;


                    			current = this_ForBreach_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:2463:3: this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnInsolvencyEvent_3=ruleOnInsolvencyEvent();

                    state._fsp--;


                    			current = this_OnInsolvencyEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:2472:3: this_CustomTermination_4= ruleCustomTermination
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomTermination_4=ruleCustomTermination();

                    state._fsp--;


                    			current = this_CustomTermination_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminationType"


    // $ANTLR start "entryRuleForConvenience"
    // InternalPactDSL.g:2484:1: entryRuleForConvenience returns [EObject current=null] : iv_ruleForConvenience= ruleForConvenience EOF ;
    public final EObject entryRuleForConvenience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForConvenience = null;


        try {
            // InternalPactDSL.g:2484:55: (iv_ruleForConvenience= ruleForConvenience EOF )
            // InternalPactDSL.g:2485:2: iv_ruleForConvenience= ruleForConvenience EOF
            {
             newCompositeNode(grammarAccess.getForConvenienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForConvenience=ruleForConvenience();

            state._fsp--;

             current =iv_ruleForConvenience; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForConvenience"


    // $ANTLR start "ruleForConvenience"
    // InternalPactDSL.g:2491:1: ruleForConvenience returns [EObject current=null] : (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleForConvenience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_customTermination_5_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2497:2: ( (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:2498:2: (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:2498:2: (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) )
            // InternalPactDSL.g:2499:3: otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0());
            		
            // InternalPactDSL.g:2503:3: ( (otherlv_1= RULE_ID ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPactDSL.g:2504:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2504:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2505:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForConvenienceRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    					newLeafNode(otherlv_1, grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getForConvenienceAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getForConvenienceAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getForConvenienceAccess().getByKeyword_4());
            		
            // InternalPactDSL.g:2528:3: ( (lv_customTermination_5_0= RULE_STRING ) )
            // InternalPactDSL.g:2529:4: (lv_customTermination_5_0= RULE_STRING )
            {
            // InternalPactDSL.g:2529:4: (lv_customTermination_5_0= RULE_STRING )
            // InternalPactDSL.g:2530:5: lv_customTermination_5_0= RULE_STRING
            {
            lv_customTermination_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customTermination_5_0, grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForConvenienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customTermination",
            						lv_customTermination_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForConvenience"


    // $ANTLR start "entryRuleOnReasonableNotice"
    // InternalPactDSL.g:2550:1: entryRuleOnReasonableNotice returns [EObject current=null] : iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF ;
    public final EObject entryRuleOnReasonableNotice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnReasonableNotice = null;


        try {
            // InternalPactDSL.g:2550:59: (iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:2551:2: iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF
            {
             newCompositeNode(grammarAccess.getOnReasonableNoticeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnReasonableNotice=ruleOnReasonableNotice();

            state._fsp--;

             current =iv_ruleOnReasonableNotice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnReasonableNotice"


    // $ANTLR start "ruleOnReasonableNotice"
    // InternalPactDSL.g:2557:1: ruleOnReasonableNotice returns [EObject current=null] : (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleOnReasonableNotice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2563:2: ( (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPactDSL.g:2564:2: (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPactDSL.g:2564:2: (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) )
            // InternalPactDSL.g:2565:3: otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0());
            		
            // InternalPactDSL.g:2569:3: ( (otherlv_1= RULE_ID ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPactDSL.g:2570:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2570:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2571:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOnReasonableNoticeRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    					newLeafNode(otherlv_1, grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4());
            		
            // InternalPactDSL.g:2594:3: ( (otherlv_5= RULE_ID ) )
            // InternalPactDSL.g:2595:4: (otherlv_5= RULE_ID )
            {
            // InternalPactDSL.g:2595:4: (otherlv_5= RULE_ID )
            // InternalPactDSL.g:2596:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnReasonableNoticeRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnReasonableNotice"


    // $ANTLR start "entryRuleForBreach"
    // InternalPactDSL.g:2611:1: entryRuleForBreach returns [EObject current=null] : iv_ruleForBreach= ruleForBreach EOF ;
    public final EObject entryRuleForBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBreach = null;


        try {
            // InternalPactDSL.g:2611:50: (iv_ruleForBreach= ruleForBreach EOF )
            // InternalPactDSL.g:2612:2: iv_ruleForBreach= ruleForBreach EOF
            {
             newCompositeNode(grammarAccess.getForBreachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForBreach=ruleForBreach();

            state._fsp--;

             current =iv_ruleForBreach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForBreach"


    // $ANTLR start "ruleForBreach"
    // InternalPactDSL.g:2618:1: ruleForBreach returns [EObject current=null] : (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleForBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ObligationBreached_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_RemedialScheme_9_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2624:2: ( (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? ) )
            // InternalPactDSL.g:2625:2: (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? )
            {
            // InternalPactDSL.g:2625:2: (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? )
            // InternalPactDSL.g:2626:3: otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0());
            		
            // InternalPactDSL.g:2630:3: ( (otherlv_1= RULE_ID ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPactDSL.g:2631:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2631:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2632:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForBreachRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    					newLeafNode(otherlv_1, grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getForBreachAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getForBreachAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getForBreachAccess().getForBreachOfKeyword_4());
            		
            // InternalPactDSL.g:2655:3: ( (lv_ObligationBreached_5_0= RULE_STRING ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_STRING) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPactDSL.g:2656:4: (lv_ObligationBreached_5_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:2656:4: (lv_ObligationBreached_5_0= RULE_STRING )
            	    // InternalPactDSL.g:2657:5: lv_ObligationBreached_5_0= RULE_STRING
            	    {
            	    lv_ObligationBreached_5_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

            	    					newLeafNode(lv_ObligationBreached_5_0, grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForBreachRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"ObligationBreached",
            	    						lv_ObligationBreached_5_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            otherlv_6=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getForBreachAccess().getByKeyword_6());
            		
            // InternalPactDSL.g:2677:3: ( (otherlv_7= RULE_ID ) )
            // InternalPactDSL.g:2678:4: (otherlv_7= RULE_ID )
            {
            // InternalPactDSL.g:2678:4: (otherlv_7= RULE_ID )
            // InternalPactDSL.g:2679:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForBreachRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(otherlv_7, grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0());
            				

            }


            }

            // InternalPactDSL.g:2690:3: (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPactDSL.g:2691:4: otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getForBreachAccess().getUnlessKeyword_8_0());
                    			
                    // InternalPactDSL.g:2695:4: ( (lv_RemedialScheme_9_0= RULE_STRING ) )
                    // InternalPactDSL.g:2696:5: (lv_RemedialScheme_9_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:2696:5: (lv_RemedialScheme_9_0= RULE_STRING )
                    // InternalPactDSL.g:2697:6: lv_RemedialScheme_9_0= RULE_STRING
                    {
                    lv_RemedialScheme_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_RemedialScheme_9_0, grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForBreachRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"RemedialScheme",
                    							lv_RemedialScheme_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForBreach"


    // $ANTLR start "entryRuleOnInsolvencyEvent"
    // InternalPactDSL.g:2718:1: entryRuleOnInsolvencyEvent returns [EObject current=null] : iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF ;
    public final EObject entryRuleOnInsolvencyEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnInsolvencyEvent = null;


        try {
            // InternalPactDSL.g:2718:58: (iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:2719:2: iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF
            {
             newCompositeNode(grammarAccess.getOnInsolvencyEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnInsolvencyEvent=ruleOnInsolvencyEvent();

            state._fsp--;

             current =iv_ruleOnInsolvencyEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnInsolvencyEvent"


    // $ANTLR start "ruleOnInsolvencyEvent"
    // InternalPactDSL.g:2725:1: ruleOnInsolvencyEvent returns [EObject current=null] : (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleOnInsolvencyEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_InsolvencyEvent_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2731:2: ( (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalPactDSL.g:2732:2: (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalPactDSL.g:2732:2: (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) )
            // InternalPactDSL.g:2733:3: otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0());
            		
            // InternalPactDSL.g:2737:3: ( (otherlv_1= RULE_ID ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPactDSL.g:2738:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2738:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2739:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    					newLeafNode(otherlv_1, grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4());
            		
            // InternalPactDSL.g:2762:3: ( (lv_InsolvencyEvent_5_0= RULE_STRING ) )
            // InternalPactDSL.g:2763:4: (lv_InsolvencyEvent_5_0= RULE_STRING )
            {
            // InternalPactDSL.g:2763:4: (lv_InsolvencyEvent_5_0= RULE_STRING )
            // InternalPactDSL.g:2764:5: lv_InsolvencyEvent_5_0= RULE_STRING
            {
            lv_InsolvencyEvent_5_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            					newLeafNode(lv_InsolvencyEvent_5_0, grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"InsolvencyEvent",
            						lv_InsolvencyEvent_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,61,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6());
            		
            // InternalPactDSL.g:2784:3: ( (otherlv_7= RULE_ID ) )
            // InternalPactDSL.g:2785:4: (otherlv_7= RULE_ID )
            {
            // InternalPactDSL.g:2785:4: (otherlv_7= RULE_ID )
            // InternalPactDSL.g:2786:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnInsolvencyEvent"


    // $ANTLR start "entryRuleCustomTermination"
    // InternalPactDSL.g:2801:1: entryRuleCustomTermination returns [EObject current=null] : iv_ruleCustomTermination= ruleCustomTermination EOF ;
    public final EObject entryRuleCustomTermination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTermination = null;


        try {
            // InternalPactDSL.g:2801:58: (iv_ruleCustomTermination= ruleCustomTermination EOF )
            // InternalPactDSL.g:2802:2: iv_ruleCustomTermination= ruleCustomTermination EOF
            {
             newCompositeNode(grammarAccess.getCustomTerminationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomTermination=ruleCustomTermination();

            state._fsp--;

             current =iv_ruleCustomTermination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomTermination"


    // $ANTLR start "ruleCustomTermination"
    // InternalPactDSL.g:2808:1: ruleCustomTermination returns [EObject current=null] : (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleCustomTermination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_CustomTerminationClause_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2814:2: ( (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2815:2: (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2815:2: (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalPactDSL.g:2816:3: otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0());
            		
            // InternalPactDSL.g:2820:3: ( (otherlv_1= RULE_ID ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalPactDSL.g:2821:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2821:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2822:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCustomTerminationRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomTerminationAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3());
            		
            // InternalPactDSL.g:2841:3: ( (lv_CustomTerminationClause_4_0= RULE_STRING ) )
            // InternalPactDSL.g:2842:4: (lv_CustomTerminationClause_4_0= RULE_STRING )
            {
            // InternalPactDSL.g:2842:4: (lv_CustomTerminationClause_4_0= RULE_STRING )
            // InternalPactDSL.g:2843:5: lv_CustomTerminationClause_4_0= RULE_STRING
            {
            lv_CustomTerminationClause_4_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_CustomTerminationClause_4_0, grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomTerminationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CustomTerminationClause",
            						lv_CustomTerminationClause_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2859:3: (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPactDSL.g:2860:4: otherlv_5= 'by' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getCustomTerminationAccess().getByKeyword_5_0());
                    			
                    // InternalPactDSL.g:2864:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPactDSL.g:2865:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPactDSL.g:2865:5: (otherlv_6= RULE_ID )
                    // InternalPactDSL.g:2866:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomTerminationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomTermination"


    // $ANTLR start "entryRuleBoilerplateType"
    // InternalPactDSL.g:2882:1: entryRuleBoilerplateType returns [EObject current=null] : iv_ruleBoilerplateType= ruleBoilerplateType EOF ;
    public final EObject entryRuleBoilerplateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoilerplateType = null;


        try {
            // InternalPactDSL.g:2882:56: (iv_ruleBoilerplateType= ruleBoilerplateType EOF )
            // InternalPactDSL.g:2883:2: iv_ruleBoilerplateType= ruleBoilerplateType EOF
            {
             newCompositeNode(grammarAccess.getBoilerplateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoilerplateType=ruleBoilerplateType();

            state._fsp--;

             current =iv_ruleBoilerplateType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoilerplateType"


    // $ANTLR start "ruleBoilerplateType"
    // InternalPactDSL.g:2889:1: ruleBoilerplateType returns [EObject current=null] : (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices ) ;
    public final EObject ruleBoilerplateType() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicableLaw_0 = null;

        EObject this_Jurisdiction_1 = null;

        EObject this_Notices_2 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:2895:2: ( (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices ) )
            // InternalPactDSL.g:2896:2: (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices )
            {
            // InternalPactDSL.g:2896:2: (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt57=1;
                }
                break;
            case 71:
                {
                alt57=2;
                }
                break;
            case 72:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalPactDSL.g:2897:3: this_ApplicableLaw_0= ruleApplicableLaw
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicableLaw_0=ruleApplicableLaw();

                    state._fsp--;


                    			current = this_ApplicableLaw_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:2906:3: this_Jurisdiction_1= ruleJurisdiction
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Jurisdiction_1=ruleJurisdiction();

                    state._fsp--;


                    			current = this_Jurisdiction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:2915:3: this_Notices_2= ruleNotices
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Notices_2=ruleNotices();

                    state._fsp--;


                    			current = this_Notices_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoilerplateType"


    // $ANTLR start "entryRuleApplicableLaw"
    // InternalPactDSL.g:2927:1: entryRuleApplicableLaw returns [EObject current=null] : iv_ruleApplicableLaw= ruleApplicableLaw EOF ;
    public final EObject entryRuleApplicableLaw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicableLaw = null;


        try {
            // InternalPactDSL.g:2927:54: (iv_ruleApplicableLaw= ruleApplicableLaw EOF )
            // InternalPactDSL.g:2928:2: iv_ruleApplicableLaw= ruleApplicableLaw EOF
            {
             newCompositeNode(grammarAccess.getApplicableLawRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicableLaw=ruleApplicableLaw();

            state._fsp--;

             current =iv_ruleApplicableLaw; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicableLaw"


    // $ANTLR start "ruleApplicableLaw"
    // InternalPactDSL.g:2934:1: ruleApplicableLaw returns [EObject current=null] : (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) ;
    public final EObject ruleApplicableLaw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CustomApplicableLaw_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:2940:2: ( (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) )
            // InternalPactDSL.g:2941:2: (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            {
            // InternalPactDSL.g:2941:2: (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            // InternalPactDSL.g:2942:3: otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0());
            		
            // InternalPactDSL.g:2946:3: ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) )
            // InternalPactDSL.g:2947:4: (lv_CustomApplicableLaw_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:2947:4: (lv_CustomApplicableLaw_1_0= RULE_STRING )
            // InternalPactDSL.g:2948:5: lv_CustomApplicableLaw_1_0= RULE_STRING
            {
            lv_CustomApplicableLaw_1_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

            					newLeafNode(lv_CustomApplicableLaw_1_0, grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicableLawRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CustomApplicableLaw",
            						lv_CustomApplicableLaw_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2964:3: ( (lv_definition_2_0= ruleDefinedTerm ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==26) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPactDSL.g:2965:4: (lv_definition_2_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:2965:4: (lv_definition_2_0= ruleDefinedTerm )
                    // InternalPactDSL.g:2966:5: lv_definition_2_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_definition_2_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicableLawRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_2_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicableLaw"


    // $ANTLR start "entryRuleJurisdiction"
    // InternalPactDSL.g:2987:1: entryRuleJurisdiction returns [EObject current=null] : iv_ruleJurisdiction= ruleJurisdiction EOF ;
    public final EObject entryRuleJurisdiction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJurisdiction = null;


        try {
            // InternalPactDSL.g:2987:53: (iv_ruleJurisdiction= ruleJurisdiction EOF )
            // InternalPactDSL.g:2988:2: iv_ruleJurisdiction= ruleJurisdiction EOF
            {
             newCompositeNode(grammarAccess.getJurisdictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJurisdiction=ruleJurisdiction();

            state._fsp--;

             current =iv_ruleJurisdiction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJurisdiction"


    // $ANTLR start "ruleJurisdiction"
    // InternalPactDSL.g:2994:1: ruleJurisdiction returns [EObject current=null] : (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) ;
    public final EObject ruleJurisdiction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CustomJurisdiction_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3000:2: ( (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) )
            // InternalPactDSL.g:3001:2: (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            {
            // InternalPactDSL.g:3001:2: (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            // InternalPactDSL.g:3002:3: otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0());
            		
            // InternalPactDSL.g:3006:3: ( (lv_CustomJurisdiction_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3007:4: (lv_CustomJurisdiction_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3007:4: (lv_CustomJurisdiction_1_0= RULE_STRING )
            // InternalPactDSL.g:3008:5: lv_CustomJurisdiction_1_0= RULE_STRING
            {
            lv_CustomJurisdiction_1_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

            					newLeafNode(lv_CustomJurisdiction_1_0, grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJurisdictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CustomJurisdiction",
            						lv_CustomJurisdiction_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:3024:3: ( (lv_definition_2_0= ruleDefinedTerm ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==26) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPactDSL.g:3025:4: (lv_definition_2_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:3025:4: (lv_definition_2_0= ruleDefinedTerm )
                    // InternalPactDSL.g:3026:5: lv_definition_2_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_definition_2_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJurisdictionRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_2_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJurisdiction"


    // $ANTLR start "entryRuleNotices"
    // InternalPactDSL.g:3047:1: entryRuleNotices returns [EObject current=null] : iv_ruleNotices= ruleNotices EOF ;
    public final EObject entryRuleNotices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotices = null;


        try {
            // InternalPactDSL.g:3047:48: (iv_ruleNotices= ruleNotices EOF )
            // InternalPactDSL.g:3048:2: iv_ruleNotices= ruleNotices EOF
            {
             newCompositeNode(grammarAccess.getNoticesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotices=ruleNotices();

            state._fsp--;

             current =iv_ruleNotices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotices"


    // $ANTLR start "ruleNotices"
    // InternalPactDSL.g:3054:1: ruleNotices returns [EObject current=null] : (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CustomNotice_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3060:2: ( (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:3061:2: (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:3061:2: (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:3062:3: otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNoticesAccess().getNoticesKeyword_0());
            		
            // InternalPactDSL.g:3066:3: ( (lv_CustomNotice_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3067:4: (lv_CustomNotice_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3067:4: (lv_CustomNotice_1_0= RULE_STRING )
            // InternalPactDSL.g:3068:5: lv_CustomNotice_1_0= RULE_STRING
            {
            lv_CustomNotice_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_CustomNotice_1_0, grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoticesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CustomNotice",
            						lv_CustomNotice_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotices"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000012C3C3C040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000012C0038040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0515080000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x05150800000C0050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x4000000000380040L,0x0000000000000016L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000042L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000100000042L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000100000052L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000100000012L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000100000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000004000002L});

}