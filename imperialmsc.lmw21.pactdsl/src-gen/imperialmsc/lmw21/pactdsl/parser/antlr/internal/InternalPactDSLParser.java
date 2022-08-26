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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContractName:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'StateAfterObligationsDischarged:'", "'Termination:'", "'StateAfterTermination:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'owns'", "'willReturn'", "'mayUse'", "'mayNotUse'", "'PaymentObligation:'", "'must'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'mustNot'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
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
    // InternalPactDSL.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'ContractName:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* ) ;
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
            // InternalPactDSL.g:77:2: ( (otherlv_0= 'ContractName:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* ) )
            // InternalPactDSL.g:78:2: (otherlv_0= 'ContractName:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* )
            {
            // InternalPactDSL.g:78:2: (otherlv_0= 'ContractName:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )* )
            // InternalPactDSL.g:79:3: otherlv_0= 'ContractName:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'StateAfterObligationsDischarged:' )? ( ( (lv_stateTypes_19_0= ruleStateType ) ) otherlv_20= '.' )* otherlv_21= 'Termination:' ( ( (lv_terminationTypes_22_0= ruleTerminationType ) ) otherlv_23= '.' )* (otherlv_24= 'StateAfterTermination:' )? ( ( (lv_stateTypes_25_0= ruleStateType ) ) otherlv_26= '.' )* otherlv_27= 'Boilerplate:' ( ( (lv_boilerplateTypes_28_0= ruleBoilerplateType ) ) otherlv_29= '.' )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getContractNameKeyword_0());
            		
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
    // InternalPactDSL.g:522:1: ruleParty returns [EObject current=null] : (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* ) ;
    public final EObject ruleParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fullname_2_0=null;
        EObject lv_definition_3_0 = null;

        EObject lv_address_4_0 = null;

        EObject lv_companyNumber_5_0 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:528:2: ( (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:529:2: (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:529:2: (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* )
            // InternalPactDSL.g:530:3: otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )*
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

            // InternalPactDSL.g:570:3: ( (lv_definition_3_0= ruleDefinedTerm ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPactDSL.g:571:4: (lv_definition_3_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:571:4: (lv_definition_3_0= ruleDefinedTerm )
                    // InternalPactDSL.g:572:5: lv_definition_3_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getPartyAccess().getDefinitionDefinedTermParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_definition_3_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPartyRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_3_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:589:3: ( (lv_address_4_0= ruleAddress ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPactDSL.g:590:4: (lv_address_4_0= ruleAddress )
                    {
                    // InternalPactDSL.g:590:4: (lv_address_4_0= ruleAddress )
                    // InternalPactDSL.g:591:5: lv_address_4_0= ruleAddress
                    {

                    					newCompositeNode(grammarAccess.getPartyAccess().getAddressAddressParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_address_4_0=ruleAddress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPartyRule());
                    					}
                    					add(
                    						current,
                    						"address",
                    						lv_address_4_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.Address");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:608:3: ( (lv_companyNumber_5_0= ruleCompanyNumber ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPactDSL.g:609:4: (lv_companyNumber_5_0= ruleCompanyNumber )
                    {
                    // InternalPactDSL.g:609:4: (lv_companyNumber_5_0= ruleCompanyNumber )
                    // InternalPactDSL.g:610:5: lv_companyNumber_5_0= ruleCompanyNumber
                    {

                    					newCompositeNode(grammarAccess.getPartyAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_companyNumber_5_0=ruleCompanyNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPartyRule());
                    					}
                    					add(
                    						current,
                    						"companyNumber",
                    						lv_companyNumber_5_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.CompanyNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:627:3: ( (lv_features_6_0= ruleFeature ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPactDSL.g:628:4: (lv_features_6_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:628:4: (lv_features_6_0= ruleFeature )
            	    // InternalPactDSL.g:629:5: lv_features_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPartyAccess().getFeaturesFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_features_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPactDSL.g:650:1: entryRuleThirdParty returns [EObject current=null] : iv_ruleThirdParty= ruleThirdParty EOF ;
    public final EObject entryRuleThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdParty = null;


        try {
            // InternalPactDSL.g:650:51: (iv_ruleThirdParty= ruleThirdParty EOF )
            // InternalPactDSL.g:651:2: iv_ruleThirdParty= ruleThirdParty EOF
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
    // InternalPactDSL.g:657:1: ruleThirdParty returns [EObject current=null] : (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* ) ;
    public final EObject ruleThirdParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fullname_2_0=null;
        EObject lv_definition_3_0 = null;

        EObject lv_address_4_0 = null;

        EObject lv_companyNumber_5_0 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:663:2: ( (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:664:2: (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:664:2: (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* )
            // InternalPactDSL.g:665:3: otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:669:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:670:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:670:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:671:5: lv_name_1_0= RULE_ID
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

            // InternalPactDSL.g:687:3: ( (lv_fullname_2_0= RULE_STRING ) )
            // InternalPactDSL.g:688:4: (lv_fullname_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:688:4: (lv_fullname_2_0= RULE_STRING )
            // InternalPactDSL.g:689:5: lv_fullname_2_0= RULE_STRING
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

            // InternalPactDSL.g:705:3: ( (lv_definition_3_0= ruleDefinedTerm ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPactDSL.g:706:4: (lv_definition_3_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:706:4: (lv_definition_3_0= ruleDefinedTerm )
                    // InternalPactDSL.g:707:5: lv_definition_3_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getThirdPartyAccess().getDefinitionDefinedTermParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_definition_3_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThirdPartyRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_3_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:724:3: ( (lv_address_4_0= ruleAddress ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPactDSL.g:725:4: (lv_address_4_0= ruleAddress )
                    {
                    // InternalPactDSL.g:725:4: (lv_address_4_0= ruleAddress )
                    // InternalPactDSL.g:726:5: lv_address_4_0= ruleAddress
                    {

                    					newCompositeNode(grammarAccess.getThirdPartyAccess().getAddressAddressParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_address_4_0=ruleAddress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThirdPartyRule());
                    					}
                    					add(
                    						current,
                    						"address",
                    						lv_address_4_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.Address");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:743:3: ( (lv_companyNumber_5_0= ruleCompanyNumber ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPactDSL.g:744:4: (lv_companyNumber_5_0= ruleCompanyNumber )
                    {
                    // InternalPactDSL.g:744:4: (lv_companyNumber_5_0= ruleCompanyNumber )
                    // InternalPactDSL.g:745:5: lv_companyNumber_5_0= ruleCompanyNumber
                    {

                    					newCompositeNode(grammarAccess.getThirdPartyAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_companyNumber_5_0=ruleCompanyNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThirdPartyRule());
                    					}
                    					add(
                    						current,
                    						"companyNumber",
                    						lv_companyNumber_5_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.CompanyNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:762:3: ( (lv_features_6_0= ruleFeature ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPactDSL.g:763:4: (lv_features_6_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:763:4: (lv_features_6_0= ruleFeature )
            	    // InternalPactDSL.g:764:5: lv_features_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getThirdPartyAccess().getFeaturesFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_features_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThirdPartyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPactDSL.g:785:1: entryRuleSubjectMatter returns [EObject current=null] : iv_ruleSubjectMatter= ruleSubjectMatter EOF ;
    public final EObject entryRuleSubjectMatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectMatter = null;


        try {
            // InternalPactDSL.g:785:54: (iv_ruleSubjectMatter= ruleSubjectMatter EOF )
            // InternalPactDSL.g:786:2: iv_ruleSubjectMatter= ruleSubjectMatter EOF
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
    // InternalPactDSL.g:792:1: ruleSubjectMatter returns [EObject current=null] : (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* ) ;
    public final EObject ruleSubjectMatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_subjectMatter_2_0=null;
        EObject lv_definition_3_0 = null;

        EObject lv_address_4_0 = null;

        EObject lv_companyNumber_5_0 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:798:2: ( (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:799:2: (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:799:2: (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )* )
            // InternalPactDSL.g:800:3: otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_definition_3_0= ruleDefinedTerm ) )? ( (lv_address_4_0= ruleAddress ) )? ( (lv_companyNumber_5_0= ruleCompanyNumber ) )? ( (lv_features_6_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0());
            		
            // InternalPactDSL.g:804:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:805:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:805:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:806:5: lv_name_1_0= RULE_ID
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

            // InternalPactDSL.g:822:3: ( (lv_subjectMatter_2_0= RULE_STRING ) )
            // InternalPactDSL.g:823:4: (lv_subjectMatter_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:823:4: (lv_subjectMatter_2_0= RULE_STRING )
            // InternalPactDSL.g:824:5: lv_subjectMatter_2_0= RULE_STRING
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

            // InternalPactDSL.g:840:3: ( (lv_definition_3_0= ruleDefinedTerm ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPactDSL.g:841:4: (lv_definition_3_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:841:4: (lv_definition_3_0= ruleDefinedTerm )
                    // InternalPactDSL.g:842:5: lv_definition_3_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getSubjectMatterAccess().getDefinitionDefinedTermParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_definition_3_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubjectMatterRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_3_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:859:3: ( (lv_address_4_0= ruleAddress ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPactDSL.g:860:4: (lv_address_4_0= ruleAddress )
                    {
                    // InternalPactDSL.g:860:4: (lv_address_4_0= ruleAddress )
                    // InternalPactDSL.g:861:5: lv_address_4_0= ruleAddress
                    {

                    					newCompositeNode(grammarAccess.getSubjectMatterAccess().getAddressAddressParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_address_4_0=ruleAddress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubjectMatterRule());
                    					}
                    					add(
                    						current,
                    						"address",
                    						lv_address_4_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.Address");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:878:3: ( (lv_companyNumber_5_0= ruleCompanyNumber ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPactDSL.g:879:4: (lv_companyNumber_5_0= ruleCompanyNumber )
                    {
                    // InternalPactDSL.g:879:4: (lv_companyNumber_5_0= ruleCompanyNumber )
                    // InternalPactDSL.g:880:5: lv_companyNumber_5_0= ruleCompanyNumber
                    {

                    					newCompositeNode(grammarAccess.getSubjectMatterAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_companyNumber_5_0=ruleCompanyNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubjectMatterRule());
                    					}
                    					add(
                    						current,
                    						"companyNumber",
                    						lv_companyNumber_5_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.CompanyNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:897:3: ( (lv_features_6_0= ruleFeature ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPactDSL.g:898:4: (lv_features_6_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:898:4: (lv_features_6_0= ruleFeature )
            	    // InternalPactDSL.g:899:5: lv_features_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getSubjectMatterAccess().getFeaturesFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_features_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubjectMatterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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


    // $ANTLR start "entryRuleDefinedTerm"
    // InternalPactDSL.g:920:1: entryRuleDefinedTerm returns [EObject current=null] : iv_ruleDefinedTerm= ruleDefinedTerm EOF ;
    public final EObject entryRuleDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedTerm = null;


        try {
            // InternalPactDSL.g:920:52: (iv_ruleDefinedTerm= ruleDefinedTerm EOF )
            // InternalPactDSL.g:921:2: iv_ruleDefinedTerm= ruleDefinedTerm EOF
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
    // InternalPactDSL.g:927:1: ruleDefinedTerm returns [EObject current=null] : (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:933:2: ( (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:934:2: (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:934:2: (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:935:3: otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0());
            		
            // InternalPactDSL.g:939:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:940:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:940:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:941:5: lv_definition_1_0= RULE_STRING
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
    // InternalPactDSL.g:961:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalPactDSL.g:961:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalPactDSL.g:962:2: iv_ruleAddress= ruleAddress EOF
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
    // InternalPactDSL.g:968:1: ruleAddress returns [EObject current=null] : (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:974:2: ( (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:975:2: (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:975:2: (otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:976:3: otherlv_0= 'withAddress' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getWithAddressKeyword_0());
            		
            // InternalPactDSL.g:980:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:981:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:981:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:982:5: lv_definition_1_0= RULE_STRING
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
    // InternalPactDSL.g:1002:1: entryRuleCompanyNumber returns [EObject current=null] : iv_ruleCompanyNumber= ruleCompanyNumber EOF ;
    public final EObject entryRuleCompanyNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompanyNumber = null;


        try {
            // InternalPactDSL.g:1002:54: (iv_ruleCompanyNumber= ruleCompanyNumber EOF )
            // InternalPactDSL.g:1003:2: iv_ruleCompanyNumber= ruleCompanyNumber EOF
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
    // InternalPactDSL.g:1009:1: ruleCompanyNumber returns [EObject current=null] : (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCompanyNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1015:2: ( (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1016:2: (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1016:2: (otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1017:3: otherlv_0= 'withCompanyNumber' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0());
            		
            // InternalPactDSL.g:1021:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1022:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1022:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:1023:5: lv_definition_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleFeature"
    // InternalPactDSL.g:1043:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPactDSL.g:1043:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPactDSL.g:1044:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalPactDSL.g:1050:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_feature_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1056:2: ( (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1057:2: (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1057:2: (otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1058:3: otherlv_0= 'withFeature' ( (lv_feature_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getWithFeatureKeyword_0());
            		
            // InternalPactDSL.g:1062:3: ( (lv_feature_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1063:4: (lv_feature_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1063:4: (lv_feature_1_0= RULE_STRING )
            // InternalPactDSL.g:1064:5: lv_feature_1_0= RULE_STRING
            {
            lv_feature_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_feature_1_0, grammarAccess.getFeatureAccess().getFeatureSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFormalityType"
    // InternalPactDSL.g:1084:1: entryRuleFormalityType returns [EObject current=null] : iv_ruleFormalityType= ruleFormalityType EOF ;
    public final EObject entryRuleFormalityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalityType = null;


        try {
            // InternalPactDSL.g:1084:54: (iv_ruleFormalityType= ruleFormalityType EOF )
            // InternalPactDSL.g:1085:2: iv_ruleFormalityType= ruleFormalityType EOF
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
    // InternalPactDSL.g:1091:1: ruleFormalityType returns [EObject current=null] : (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality ) ;
    public final EObject ruleFormalityType() throws RecognitionException {
        EObject current = null;

        EObject this_InWriting_0 = null;

        EObject this_ByEmail_1 = null;

        EObject this_GivingNotice_2 = null;

        EObject this_CustomFormality_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1097:2: ( (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality ) )
            // InternalPactDSL.g:1098:2: (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality )
            {
            // InternalPactDSL.g:1098:2: (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 33:
                {
                alt30=3;
                }
                break;
            case 36:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalPactDSL.g:1099:3: this_InWriting_0= ruleInWriting
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
                    // InternalPactDSL.g:1108:3: this_ByEmail_1= ruleByEmail
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
                    // InternalPactDSL.g:1117:3: this_GivingNotice_2= ruleGivingNotice
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
                    // InternalPactDSL.g:1126:3: this_CustomFormality_3= ruleCustomFormality
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
    // InternalPactDSL.g:1138:1: entryRuleInWriting returns [EObject current=null] : iv_ruleInWriting= ruleInWriting EOF ;
    public final EObject entryRuleInWriting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInWriting = null;


        try {
            // InternalPactDSL.g:1138:50: (iv_ruleInWriting= ruleInWriting EOF )
            // InternalPactDSL.g:1139:2: iv_ruleInWriting= ruleInWriting EOF
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
    // InternalPactDSL.g:1145:1: ruleInWriting returns [EObject current=null] : (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInWriting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customWritingFormality_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1151:2: ( (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1152:2: (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1152:2: (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1153:3: otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInWritingAccess().getInWritingKeyword_0());
            		
            // InternalPactDSL.g:1157:3: ( (lv_customWritingFormality_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1158:4: (lv_customWritingFormality_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1158:4: (lv_customWritingFormality_1_0= RULE_STRING )
            // InternalPactDSL.g:1159:5: lv_customWritingFormality_1_0= RULE_STRING
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
    // InternalPactDSL.g:1179:1: entryRuleByEmail returns [EObject current=null] : iv_ruleByEmail= ruleByEmail EOF ;
    public final EObject entryRuleByEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByEmail = null;


        try {
            // InternalPactDSL.g:1179:48: (iv_ruleByEmail= ruleByEmail EOF )
            // InternalPactDSL.g:1180:2: iv_ruleByEmail= ruleByEmail EOF
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
    // InternalPactDSL.g:1186:1: ruleByEmail returns [EObject current=null] : (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleByEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_emailAddress_2_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1192:2: ( (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1193:2: (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1193:2: (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1194:3: otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getByEmailAccess().getByEmailKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getByEmailAccess().getToKeyword_1());
            		
            // InternalPactDSL.g:1202:3: ( (lv_emailAddress_2_0= RULE_STRING ) )
            // InternalPactDSL.g:1203:4: (lv_emailAddress_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:1203:4: (lv_emailAddress_2_0= RULE_STRING )
            // InternalPactDSL.g:1204:5: lv_emailAddress_2_0= RULE_STRING
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
    // InternalPactDSL.g:1224:1: entryRuleGivingNotice returns [EObject current=null] : iv_ruleGivingNotice= ruleGivingNotice EOF ;
    public final EObject entryRuleGivingNotice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivingNotice = null;


        try {
            // InternalPactDSL.g:1224:53: (iv_ruleGivingNotice= ruleGivingNotice EOF )
            // InternalPactDSL.g:1225:2: iv_ruleGivingNotice= ruleGivingNotice EOF
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
    // InternalPactDSL.g:1231:1: ruleGivingNotice returns [EObject current=null] : (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) ) ;
    public final EObject ruleGivingNotice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numDays_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1237:2: ( (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) ) )
            // InternalPactDSL.g:1238:2: (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) )
            {
            // InternalPactDSL.g:1238:2: (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' ) )
            // InternalPactDSL.g:1239:3: otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0());
            		
            // InternalPactDSL.g:1243:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1244:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1244:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1245:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivingNoticeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:1256:3: (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )
            // InternalPactDSL.g:1257:4: otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days'
            {
            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            				newLeafNode(otherlv_2, grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0());
            			
            // InternalPactDSL.g:1261:4: ( (lv_numDays_3_0= RULE_INT ) )
            // InternalPactDSL.g:1262:5: (lv_numDays_3_0= RULE_INT )
            {
            // InternalPactDSL.g:1262:5: (lv_numDays_3_0= RULE_INT )
            // InternalPactDSL.g:1263:6: lv_numDays_3_0= RULE_INT
            {
            lv_numDays_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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
    // InternalPactDSL.g:1288:1: entryRuleCustomFormality returns [EObject current=null] : iv_ruleCustomFormality= ruleCustomFormality EOF ;
    public final EObject entryRuleCustomFormality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFormality = null;


        try {
            // InternalPactDSL.g:1288:56: (iv_ruleCustomFormality= ruleCustomFormality EOF )
            // InternalPactDSL.g:1289:2: iv_ruleCustomFormality= ruleCustomFormality EOF
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
    // InternalPactDSL.g:1295:1: ruleCustomFormality returns [EObject current=null] : (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomFormality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customFormality_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1301:2: ( (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1302:2: (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1302:2: (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1303:3: otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0());
            		
            // InternalPactDSL.g:1307:3: ( (lv_customFormality_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1308:4: (lv_customFormality_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1308:4: (lv_customFormality_1_0= RULE_STRING )
            // InternalPactDSL.g:1309:5: lv_customFormality_1_0= RULE_STRING
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
    // InternalPactDSL.g:1329:1: entryRuleActionType returns [EObject current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final EObject entryRuleActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionType = null;


        try {
            // InternalPactDSL.g:1329:51: (iv_ruleActionType= ruleActionType EOF )
            // InternalPactDSL.g:1330:2: iv_ruleActionType= ruleActionType EOF
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
    // InternalPactDSL.g:1336:1: ruleActionType returns [EObject current=null] : (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent ) ;
    public final EObject ruleActionType() throws RecognitionException {
        EObject current = null;

        EObject this_GivenConsent_0 = null;

        EObject this_GivenWrittenConsent_1 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1342:2: ( (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent ) )
            // InternalPactDSL.g:1343:2: (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent )
            {
            // InternalPactDSL.g:1343:2: (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==38) ) {
                    alt31=2;
                }
                else if ( (LA31_1==37) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPactDSL.g:1344:3: this_GivenConsent_0= ruleGivenConsent
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
                    // InternalPactDSL.g:1353:3: this_GivenWrittenConsent_1= ruleGivenWrittenConsent
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
    // InternalPactDSL.g:1365:1: entryRuleGivenConsent returns [EObject current=null] : iv_ruleGivenConsent= ruleGivenConsent EOF ;
    public final EObject entryRuleGivenConsent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenConsent = null;


        try {
            // InternalPactDSL.g:1365:53: (iv_ruleGivenConsent= ruleGivenConsent EOF )
            // InternalPactDSL.g:1366:2: iv_ruleGivenConsent= ruleGivenConsent EOF
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
    // InternalPactDSL.g:1372:1: ruleGivenConsent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' ) ;
    public final EObject ruleGivenConsent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1378:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' ) )
            // InternalPactDSL.g:1379:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' )
            {
            // InternalPactDSL.g:1379:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' )
            // InternalPactDSL.g:1380:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent'
            {
            // InternalPactDSL.g:1380:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1381:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1381:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1382:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenConsentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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
    // InternalPactDSL.g:1401:1: entryRuleGivenWrittenConsent returns [EObject current=null] : iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF ;
    public final EObject entryRuleGivenWrittenConsent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenWrittenConsent = null;


        try {
            // InternalPactDSL.g:1401:60: (iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF )
            // InternalPactDSL.g:1402:2: iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF
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
    // InternalPactDSL.g:1408:1: ruleGivenWrittenConsent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' ) ;
    public final EObject ruleGivenWrittenConsent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1414:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:1415:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:1415:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' )
            // InternalPactDSL.g:1416:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent'
            {
            // InternalPactDSL.g:1416:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1417:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1417:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1418:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenWrittenConsentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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
    // InternalPactDSL.g:1437:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // InternalPactDSL.g:1437:50: (iv_ruleStateType= ruleStateType EOF )
            // InternalPactDSL.g:1438:2: iv_ruleStateType= ruleStateType EOF
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
    // InternalPactDSL.g:1444:1: ruleStateType returns [EObject current=null] : (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        EObject this_Ownership_0 = null;

        EObject this_RightToUse_1 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1450:2: ( (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse ) )
            // InternalPactDSL.g:1451:2: (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse )
            {
            // InternalPactDSL.g:1451:2: (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1>=41 && LA32_1<=42)) ) {
                    alt32=2;
                }
                else if ( ((LA32_1>=39 && LA32_1<=40)) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPactDSL.g:1452:3: this_Ownership_0= ruleOwnership
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
                    // InternalPactDSL.g:1461:3: this_RightToUse_1= ruleRightToUse
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
    // InternalPactDSL.g:1473:1: entryRuleOwnership returns [EObject current=null] : iv_ruleOwnership= ruleOwnership EOF ;
    public final EObject entryRuleOwnership() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnership = null;


        try {
            // InternalPactDSL.g:1473:50: (iv_ruleOwnership= ruleOwnership EOF )
            // InternalPactDSL.g:1474:2: iv_ruleOwnership= ruleOwnership EOF
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
    // InternalPactDSL.g:1480:1: ruleOwnership returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleOwnership() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_customOwnership_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1486:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) )
            // InternalPactDSL.g:1487:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalPactDSL.g:1487:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            // InternalPactDSL.g:1488:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'owns' | otherlv_2= 'willReturn' ) ( (lv_customOwnership_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) )
            {
            // InternalPactDSL.g:1488:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1489:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1489:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1490:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOwnershipRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            // InternalPactDSL.g:1501:3: (otherlv_1= 'owns' | otherlv_2= 'willReturn' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            else if ( (LA33_0==40) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalPactDSL.g:1502:4: otherlv_1= 'owns'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getOwnershipAccess().getOwnsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1507:4: otherlv_2= 'willReturn'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getOwnershipAccess().getWillReturnKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:1512:3: ( (lv_customOwnership_3_0= RULE_STRING ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STRING) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPactDSL.g:1513:4: (lv_customOwnership_3_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:1513:4: (lv_customOwnership_3_0= RULE_STRING )
            	    // InternalPactDSL.g:1514:5: lv_customOwnership_3_0= RULE_STRING
            	    {
            	    lv_customOwnership_3_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
            	    break loop34;
                }
            } while (true);

            // InternalPactDSL.g:1530:3: ( (otherlv_4= RULE_ID ) )
            // InternalPactDSL.g:1531:4: (otherlv_4= RULE_ID )
            {
            // InternalPactDSL.g:1531:4: (otherlv_4= RULE_ID )
            // InternalPactDSL.g:1532:5: otherlv_4= RULE_ID
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
    // InternalPactDSL.g:1547:1: entryRuleRightToUse returns [EObject current=null] : iv_ruleRightToUse= ruleRightToUse EOF ;
    public final EObject entryRuleRightToUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightToUse = null;


        try {
            // InternalPactDSL.g:1547:51: (iv_ruleRightToUse= ruleRightToUse EOF )
            // InternalPactDSL.g:1548:2: iv_ruleRightToUse= ruleRightToUse EOF
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
    // InternalPactDSL.g:1554:1: ruleRightToUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleRightToUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_customUsage_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1560:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) ) )
            // InternalPactDSL.g:1561:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalPactDSL.g:1561:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) ) )
            // InternalPactDSL.g:1562:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' ) ( (lv_customUsage_3_0= RULE_STRING ) )* ( (otherlv_4= RULE_ID ) )
            {
            // InternalPactDSL.g:1562:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1563:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1563:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1564:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightToUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            // InternalPactDSL.g:1575:3: (otherlv_1= 'mayUse' | otherlv_2= 'mayNotUse' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            else if ( (LA35_0==42) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPactDSL.g:1576:4: otherlv_1= 'mayUse'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getRightToUseAccess().getMayUseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1581:4: otherlv_2= 'mayNotUse'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getRightToUseAccess().getMayNotUseKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:1586:3: ( (lv_customUsage_3_0= RULE_STRING ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPactDSL.g:1587:4: (lv_customUsage_3_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:1587:4: (lv_customUsage_3_0= RULE_STRING )
            	    // InternalPactDSL.g:1588:5: lv_customUsage_3_0= RULE_STRING
            	    {
            	    lv_customUsage_3_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
            	    break loop36;
                }
            } while (true);

            // InternalPactDSL.g:1604:3: ( (otherlv_4= RULE_ID ) )
            // InternalPactDSL.g:1605:4: (otherlv_4= RULE_ID )
            {
            // InternalPactDSL.g:1605:4: (otherlv_4= RULE_ID )
            // InternalPactDSL.g:1606:5: otherlv_4= RULE_ID
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
    // InternalPactDSL.g:1621:1: entryRulePrimaryObligationType returns [EObject current=null] : iv_rulePrimaryObligationType= rulePrimaryObligationType EOF ;
    public final EObject entryRulePrimaryObligationType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryObligationType = null;


        try {
            // InternalPactDSL.g:1621:62: (iv_rulePrimaryObligationType= rulePrimaryObligationType EOF )
            // InternalPactDSL.g:1622:2: iv_rulePrimaryObligationType= rulePrimaryObligationType EOF
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
    // InternalPactDSL.g:1628:1: rulePrimaryObligationType returns [EObject current=null] : (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) ) ;
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
            // InternalPactDSL.g:1634:2: ( (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1635:2: (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1635:2: (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | ( (lv_CustomObligation_6_0= RULE_STRING ) ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt37=1;
                }
                break;
            case 48:
                {
                alt37=2;
                }
                break;
            case 50:
                {
                alt37=3;
                }
                break;
            case 52:
                {
                alt37=4;
                }
                break;
            case 56:
                {
                alt37=5;
                }
                break;
            case 58:
                {
                alt37=6;
                }
                break;
            case RULE_STRING:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalPactDSL.g:1636:3: this_PaymentObligation_0= rulePaymentObligation
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
                    // InternalPactDSL.g:1645:3: this_DeliveryObligation_1= ruleDeliveryObligation
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
                    // InternalPactDSL.g:1654:3: this_TransferObligation_2= ruleTransferObligation
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
                    // InternalPactDSL.g:1663:3: this_LicenceObligation_3= ruleLicenceObligation
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
                    // InternalPactDSL.g:1672:3: this_ConstraintParty_4= ruleConstraintParty
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
                    // InternalPactDSL.g:1681:3: this_ConstraintThirdParty_5= ruleConstraintThirdParty
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
                    // InternalPactDSL.g:1690:3: ( (lv_CustomObligation_6_0= RULE_STRING ) )
                    {
                    // InternalPactDSL.g:1690:3: ( (lv_CustomObligation_6_0= RULE_STRING ) )
                    // InternalPactDSL.g:1691:4: (lv_CustomObligation_6_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:1691:4: (lv_CustomObligation_6_0= RULE_STRING )
                    // InternalPactDSL.g:1692:5: lv_CustomObligation_6_0= RULE_STRING
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
    // InternalPactDSL.g:1712:1: entryRulePaymentObligation returns [EObject current=null] : iv_rulePaymentObligation= rulePaymentObligation EOF ;
    public final EObject entryRulePaymentObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentObligation = null;


        try {
            // InternalPactDSL.g:1712:58: (iv_rulePaymentObligation= rulePaymentObligation EOF )
            // InternalPactDSL.g:1713:2: iv_rulePaymentObligation= rulePaymentObligation EOF
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
    // InternalPactDSL.g:1719:1: rulePaymentObligation returns [EObject current=null] : (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
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
            // InternalPactDSL.g:1725:2: ( (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1726:2: (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1726:2: (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1727:3: otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0());
            		
            // InternalPactDSL.g:1731:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1732:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1732:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1733:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getPaymentObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPaymentObligationAccess().getPayKeyword_3());
            		
            // InternalPactDSL.g:1752:3: ( (lv_sum_4_0= RULE_INT ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_INT) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPactDSL.g:1753:4: (lv_sum_4_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:1753:4: (lv_sum_4_0= RULE_INT )
            	    // InternalPactDSL.g:1754:5: lv_sum_4_0= RULE_INT
            	    {
            	    lv_sum_4_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getPaymentObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1774:3: ( (otherlv_6= RULE_ID ) )+
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
            	    // InternalPactDSL.g:1775:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1775:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:1776:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPaymentObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

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

            // InternalPactDSL.g:1787:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPactDSL.g:1788:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getPaymentObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:1796:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:1797:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1797:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:1798:6: lv_day_9_0= RULE_INT
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

                    // InternalPactDSL.g:1814:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:1815:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1815:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:1816:6: lv_month_10_0= RULE_INT
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

                    // InternalPactDSL.g:1832:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:1833:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1833:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:1834:6: lv_year_11_0= RULE_INT
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
    // InternalPactDSL.g:1855:1: entryRuleDeliveryObligation returns [EObject current=null] : iv_ruleDeliveryObligation= ruleDeliveryObligation EOF ;
    public final EObject entryRuleDeliveryObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryObligation = null;


        try {
            // InternalPactDSL.g:1855:59: (iv_ruleDeliveryObligation= ruleDeliveryObligation EOF )
            // InternalPactDSL.g:1856:2: iv_ruleDeliveryObligation= ruleDeliveryObligation EOF
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
    // InternalPactDSL.g:1862:1: ruleDeliveryObligation returns [EObject current=null] : (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
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
            // InternalPactDSL.g:1868:2: ( (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1869:2: (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1869:2: (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1870:3: otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0());
            		
            // InternalPactDSL.g:1874:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1875:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1875:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1876:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3());
            		
            // InternalPactDSL.g:1895:3: ( (otherlv_4= RULE_ID ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPactDSL.g:1896:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1896:4: (otherlv_4= RULE_ID )
            	    // InternalPactDSL.g:1897:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getDeliveryObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1912:3: ( (otherlv_6= RULE_ID ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPactDSL.g:1913:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1913:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:1914:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // InternalPactDSL.g:1925:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPactDSL.g:1926:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:1934:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:1935:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1935:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:1936:6: lv_day_9_0= RULE_INT
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

                    // InternalPactDSL.g:1952:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:1953:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1953:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:1954:6: lv_month_10_0= RULE_INT
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

                    // InternalPactDSL.g:1970:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:1971:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1971:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:1972:6: lv_year_11_0= RULE_INT
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
    // InternalPactDSL.g:1993:1: entryRuleTransferObligation returns [EObject current=null] : iv_ruleTransferObligation= ruleTransferObligation EOF ;
    public final EObject entryRuleTransferObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransferObligation = null;


        try {
            // InternalPactDSL.g:1993:59: (iv_ruleTransferObligation= ruleTransferObligation EOF )
            // InternalPactDSL.g:1994:2: iv_ruleTransferObligation= ruleTransferObligation EOF
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
    // InternalPactDSL.g:2000:1: ruleTransferObligation returns [EObject current=null] : (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
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
            // InternalPactDSL.g:2006:2: ( (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:2007:2: (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:2007:2: (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:2008:3: otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0());
            		
            // InternalPactDSL.g:2012:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2013:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2013:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2014:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransferObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getTransferObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTransferObligationAccess().getTransferKeyword_3());
            		
            // InternalPactDSL.g:2033:3: ( (otherlv_4= RULE_ID ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPactDSL.g:2034:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2034:4: (otherlv_4= RULE_ID )
            	    // InternalPactDSL.g:2035:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTransferObligationRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getTransferObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:2050:3: ( (otherlv_6= RULE_ID ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPactDSL.g:2051:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2051:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2052:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTransferObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_6, grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // InternalPactDSL.g:2063:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPactDSL.g:2064:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransferObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransferObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:2072:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:2073:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2073:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:2074:6: lv_day_9_0= RULE_INT
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

                    // InternalPactDSL.g:2090:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:2091:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2091:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:2092:6: lv_month_10_0= RULE_INT
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

                    // InternalPactDSL.g:2108:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:2109:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2109:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:2110:6: lv_year_11_0= RULE_INT
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
    // InternalPactDSL.g:2131:1: entryRuleLicenceObligation returns [EObject current=null] : iv_ruleLicenceObligation= ruleLicenceObligation EOF ;
    public final EObject entryRuleLicenceObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicenceObligation = null;


        try {
            // InternalPactDSL.g:2131:58: (iv_ruleLicenceObligation= ruleLicenceObligation EOF )
            // InternalPactDSL.g:2132:2: iv_ruleLicenceObligation= ruleLicenceObligation EOF
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
    // InternalPactDSL.g:2138:1: ruleLicenceObligation returns [EObject current=null] : (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )? ) ;
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
            // InternalPactDSL.g:2144:2: ( (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:2145:2: (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:2145:2: (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:2146:3: otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0());
            		
            // InternalPactDSL.g:2150:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2151:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2151:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2152:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLicenceObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getLicenceObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getLicenceObligationAccess().getGrantKeyword_3());
            		
            otherlv_4=(Token)match(input,54,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4());
            		
            otherlv_5=(Token)match(input,55,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getLicenceObligationAccess().getInKeyword_5());
            		
            // InternalPactDSL.g:2179:3: ( (otherlv_6= RULE_ID ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPactDSL.g:2180:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2180:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2181:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            otherlv_7=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getLicenceObligationAccess().getToKeyword_7());
            		
            // InternalPactDSL.g:2196:3: ( (otherlv_8= RULE_ID ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPactDSL.g:2197:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2197:4: (otherlv_8= RULE_ID )
            	    // InternalPactDSL.g:2198:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // InternalPactDSL.g:2209:3: (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPactDSL.g:2210:4: otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getLicenceObligationAccess().getByKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,47,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1());
                    			
                    // InternalPactDSL.g:2218:4: ( (lv_day_11_0= RULE_INT ) )
                    // InternalPactDSL.g:2219:5: (lv_day_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2219:5: (lv_day_11_0= RULE_INT )
                    // InternalPactDSL.g:2220:6: lv_day_11_0= RULE_INT
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

                    // InternalPactDSL.g:2236:4: ( (lv_month_12_0= RULE_INT ) )
                    // InternalPactDSL.g:2237:5: (lv_month_12_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2237:5: (lv_month_12_0= RULE_INT )
                    // InternalPactDSL.g:2238:6: lv_month_12_0= RULE_INT
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

                    // InternalPactDSL.g:2254:4: ( (lv_year_13_0= RULE_INT ) )
                    // InternalPactDSL.g:2255:5: (lv_year_13_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2255:5: (lv_year_13_0= RULE_INT )
                    // InternalPactDSL.g:2256:6: lv_year_13_0= RULE_INT
                    {
                    lv_year_13_0=(Token)match(input,RULE_INT,FOLLOW_2); 

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
    // $ANTLR end "ruleLicenceObligation"


    // $ANTLR start "entryRuleConstraintParty"
    // InternalPactDSL.g:2277:1: entryRuleConstraintParty returns [EObject current=null] : iv_ruleConstraintParty= ruleConstraintParty EOF ;
    public final EObject entryRuleConstraintParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintParty = null;


        try {
            // InternalPactDSL.g:2277:56: (iv_ruleConstraintParty= ruleConstraintParty EOF )
            // InternalPactDSL.g:2278:2: iv_ruleConstraintParty= ruleConstraintParty EOF
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
    // InternalPactDSL.g:2284:1: ruleConstraintParty returns [EObject current=null] : (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? ) ;
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
            // InternalPactDSL.g:2290:2: ( (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2291:2: (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2291:2: (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalPactDSL.g:2292:3: otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0());
            		
            // InternalPactDSL.g:2296:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2297:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2297:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2298:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2());
            		
            // InternalPactDSL.g:2313:3: ( (lv_forbiddenAction_3_0= RULE_STRING ) )
            // InternalPactDSL.g:2314:4: (lv_forbiddenAction_3_0= RULE_STRING )
            {
            // InternalPactDSL.g:2314:4: (lv_forbiddenAction_3_0= RULE_STRING )
            // InternalPactDSL.g:2315:5: lv_forbiddenAction_3_0= RULE_STRING
            {
            lv_forbiddenAction_3_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            // InternalPactDSL.g:2331:3: ( (otherlv_4= RULE_ID ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPactDSL.g:2332:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:2332:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:2333:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintPartyRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_45); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2344:3: (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==32) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPactDSL.g:2345:4: otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstraintPartyAccess().getToKeyword_5_0());
                    			
                    // InternalPactDSL.g:2349:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPactDSL.g:2350:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPactDSL.g:2350:5: (otherlv_6= RULE_ID )
                    // InternalPactDSL.g:2351:6: otherlv_6= RULE_ID
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
    // InternalPactDSL.g:2367:1: entryRuleConstraintThirdParty returns [EObject current=null] : iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF ;
    public final EObject entryRuleConstraintThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintThirdParty = null;


        try {
            // InternalPactDSL.g:2367:61: (iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:2368:2: iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF
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
    // InternalPactDSL.g:2374:1: ruleConstraintThirdParty returns [EObject current=null] : (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? ) ;
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
            // InternalPactDSL.g:2380:2: ( (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2381:2: (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2381:2: (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? )
            // InternalPactDSL.g:2382:3: otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:2386:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2387:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2387:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2388:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2());
            		
            // InternalPactDSL.g:2403:3: ( (lv_forbiddenAction_3_0= RULE_STRING ) )
            // InternalPactDSL.g:2404:4: (lv_forbiddenAction_3_0= RULE_STRING )
            {
            // InternalPactDSL.g:2404:4: (lv_forbiddenAction_3_0= RULE_STRING )
            // InternalPactDSL.g:2405:5: lv_forbiddenAction_3_0= RULE_STRING
            {
            lv_forbiddenAction_3_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

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

            // InternalPactDSL.g:2421:3: ( (otherlv_4= RULE_ID ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPactDSL.g:2422:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:2422:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:2423:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_47); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2434:3: ( (lv_additionalInfo_5_0= RULE_STRING ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPactDSL.g:2435:4: (lv_additionalInfo_5_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:2435:4: (lv_additionalInfo_5_0= RULE_STRING )
                    // InternalPactDSL.g:2436:5: lv_additionalInfo_5_0= RULE_STRING
                    {
                    lv_additionalInfo_5_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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

            // InternalPactDSL.g:2452:3: (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==32) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPactDSL.g:2453:4: otherlv_6= 'to' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0());
                    			
                    // InternalPactDSL.g:2457:4: ( (otherlv_7= RULE_ID ) )
                    // InternalPactDSL.g:2458:5: (otherlv_7= RULE_ID )
                    {
                    // InternalPactDSL.g:2458:5: (otherlv_7= RULE_ID )
                    // InternalPactDSL.g:2459:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_49); 

                    						newLeafNode(otherlv_7, grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2471:3: (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPactDSL.g:2472:4: otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_50); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,60,FOLLOW_51); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1());
                    			
                    otherlv_10=(Token)match(input,61,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2());
                    			
                    // InternalPactDSL.g:2484:4: ( (otherlv_11= RULE_ID ) )
                    // InternalPactDSL.g:2485:5: (otherlv_11= RULE_ID )
                    {
                    // InternalPactDSL.g:2485:5: (otherlv_11= RULE_ID )
                    // InternalPactDSL.g:2486:6: otherlv_11= RULE_ID
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
    // InternalPactDSL.g:2502:1: entryRuleTerminationType returns [EObject current=null] : iv_ruleTerminationType= ruleTerminationType EOF ;
    public final EObject entryRuleTerminationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminationType = null;


        try {
            // InternalPactDSL.g:2502:56: (iv_ruleTerminationType= ruleTerminationType EOF )
            // InternalPactDSL.g:2503:2: iv_ruleTerminationType= ruleTerminationType EOF
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
    // InternalPactDSL.g:2509:1: ruleTerminationType returns [EObject current=null] : (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination ) ;
    public final EObject ruleTerminationType() throws RecognitionException {
        EObject current = null;

        EObject this_ForConvenience_0 = null;

        EObject this_OnReasonableNotice_1 = null;

        EObject this_ForBreach_2 = null;

        EObject this_OnInsolvencyEvent_3 = null;

        EObject this_CustomTermination_4 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:2515:2: ( (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination ) )
            // InternalPactDSL.g:2516:2: (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination )
            {
            // InternalPactDSL.g:2516:2: (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination )
            int alt56=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt56=1;
                }
                break;
            case 65:
                {
                alt56=2;
                }
                break;
            case 66:
                {
                alt56=3;
                }
                break;
            case 68:
                {
                alt56=4;
                }
                break;
            case 19:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalPactDSL.g:2517:3: this_ForConvenience_0= ruleForConvenience
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
                    // InternalPactDSL.g:2526:3: this_OnReasonableNotice_1= ruleOnReasonableNotice
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
                    // InternalPactDSL.g:2535:3: this_ForBreach_2= ruleForBreach
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
                    // InternalPactDSL.g:2544:3: this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent
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
                    // InternalPactDSL.g:2553:3: this_CustomTermination_4= ruleCustomTermination
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
    // InternalPactDSL.g:2565:1: entryRuleForConvenience returns [EObject current=null] : iv_ruleForConvenience= ruleForConvenience EOF ;
    public final EObject entryRuleForConvenience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForConvenience = null;


        try {
            // InternalPactDSL.g:2565:55: (iv_ruleForConvenience= ruleForConvenience EOF )
            // InternalPactDSL.g:2566:2: iv_ruleForConvenience= ruleForConvenience EOF
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
    // InternalPactDSL.g:2572:1: ruleForConvenience returns [EObject current=null] : (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) ) ;
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
            // InternalPactDSL.g:2578:2: ( (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:2579:2: (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:2579:2: (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) )
            // InternalPactDSL.g:2580:3: otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0());
            		
            // InternalPactDSL.g:2584:3: ( (otherlv_1= RULE_ID ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalPactDSL.g:2585:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2585:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2586:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForConvenienceRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    					newLeafNode(otherlv_1, grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getForConvenienceAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getForConvenienceAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getForConvenienceAccess().getByKeyword_4());
            		
            // InternalPactDSL.g:2609:3: ( (lv_customTermination_5_0= RULE_STRING ) )
            // InternalPactDSL.g:2610:4: (lv_customTermination_5_0= RULE_STRING )
            {
            // InternalPactDSL.g:2610:4: (lv_customTermination_5_0= RULE_STRING )
            // InternalPactDSL.g:2611:5: lv_customTermination_5_0= RULE_STRING
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
    // InternalPactDSL.g:2631:1: entryRuleOnReasonableNotice returns [EObject current=null] : iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF ;
    public final EObject entryRuleOnReasonableNotice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnReasonableNotice = null;


        try {
            // InternalPactDSL.g:2631:59: (iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:2632:2: iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF
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
    // InternalPactDSL.g:2638:1: ruleOnReasonableNotice returns [EObject current=null] : (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalPactDSL.g:2644:2: ( (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPactDSL.g:2645:2: (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPactDSL.g:2645:2: (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) )
            // InternalPactDSL.g:2646:3: otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0());
            		
            // InternalPactDSL.g:2650:3: ( (otherlv_1= RULE_ID ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPactDSL.g:2651:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2651:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2652:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOnReasonableNoticeRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    					newLeafNode(otherlv_1, grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4());
            		
            // InternalPactDSL.g:2675:3: ( (otherlv_5= RULE_ID ) )
            // InternalPactDSL.g:2676:4: (otherlv_5= RULE_ID )
            {
            // InternalPactDSL.g:2676:4: (otherlv_5= RULE_ID )
            // InternalPactDSL.g:2677:5: otherlv_5= RULE_ID
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
    // InternalPactDSL.g:2692:1: entryRuleForBreach returns [EObject current=null] : iv_ruleForBreach= ruleForBreach EOF ;
    public final EObject entryRuleForBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBreach = null;


        try {
            // InternalPactDSL.g:2692:50: (iv_ruleForBreach= ruleForBreach EOF )
            // InternalPactDSL.g:2693:2: iv_ruleForBreach= ruleForBreach EOF
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
    // InternalPactDSL.g:2699:1: ruleForBreach returns [EObject current=null] : (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? ) ;
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
            // InternalPactDSL.g:2705:2: ( (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? ) )
            // InternalPactDSL.g:2706:2: (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? )
            {
            // InternalPactDSL.g:2706:2: (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )? )
            // InternalPactDSL.g:2707:3: otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0());
            		
            // InternalPactDSL.g:2711:3: ( (otherlv_1= RULE_ID ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalPactDSL.g:2712:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2712:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2713:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForBreachRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    					newLeafNode(otherlv_1, grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getForBreachAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getForBreachAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getForBreachAccess().getForBreachOfKeyword_4());
            		
            // InternalPactDSL.g:2736:3: ( (lv_ObligationBreached_5_0= RULE_STRING ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_STRING) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPactDSL.g:2737:4: (lv_ObligationBreached_5_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:2737:4: (lv_ObligationBreached_5_0= RULE_STRING )
            	    // InternalPactDSL.g:2738:5: lv_ObligationBreached_5_0= RULE_STRING
            	    {
            	    lv_ObligationBreached_5_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

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
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            otherlv_6=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getForBreachAccess().getByKeyword_6());
            		
            // InternalPactDSL.g:2758:3: ( (otherlv_7= RULE_ID ) )
            // InternalPactDSL.g:2759:4: (otherlv_7= RULE_ID )
            {
            // InternalPactDSL.g:2759:4: (otherlv_7= RULE_ID )
            // InternalPactDSL.g:2760:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForBreachRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_7, grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0());
            				

            }


            }

            // InternalPactDSL.g:2771:3: (otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==59) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPactDSL.g:2772:4: otherlv_8= 'unless' ( (lv_RemedialScheme_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getForBreachAccess().getUnlessKeyword_8_0());
                    			
                    // InternalPactDSL.g:2776:4: ( (lv_RemedialScheme_9_0= RULE_STRING ) )
                    // InternalPactDSL.g:2777:5: (lv_RemedialScheme_9_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:2777:5: (lv_RemedialScheme_9_0= RULE_STRING )
                    // InternalPactDSL.g:2778:6: lv_RemedialScheme_9_0= RULE_STRING
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
    // InternalPactDSL.g:2799:1: entryRuleOnInsolvencyEvent returns [EObject current=null] : iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF ;
    public final EObject entryRuleOnInsolvencyEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnInsolvencyEvent = null;


        try {
            // InternalPactDSL.g:2799:58: (iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:2800:2: iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF
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
    // InternalPactDSL.g:2806:1: ruleOnInsolvencyEvent returns [EObject current=null] : (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) ) ;
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
            // InternalPactDSL.g:2812:2: ( (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalPactDSL.g:2813:2: (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalPactDSL.g:2813:2: (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) )
            // InternalPactDSL.g:2814:3: otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0());
            		
            // InternalPactDSL.g:2818:3: ( (otherlv_1= RULE_ID ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalPactDSL.g:2819:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2819:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2820:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    					newLeafNode(otherlv_1, grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4());
            		
            // InternalPactDSL.g:2843:3: ( (lv_InsolvencyEvent_5_0= RULE_STRING ) )
            // InternalPactDSL.g:2844:4: (lv_InsolvencyEvent_5_0= RULE_STRING )
            {
            // InternalPactDSL.g:2844:4: (lv_InsolvencyEvent_5_0= RULE_STRING )
            // InternalPactDSL.g:2845:5: lv_InsolvencyEvent_5_0= RULE_STRING
            {
            lv_InsolvencyEvent_5_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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
            		
            // InternalPactDSL.g:2865:3: ( (otherlv_7= RULE_ID ) )
            // InternalPactDSL.g:2866:4: (otherlv_7= RULE_ID )
            {
            // InternalPactDSL.g:2866:4: (otherlv_7= RULE_ID )
            // InternalPactDSL.g:2867:5: otherlv_7= RULE_ID
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
    // InternalPactDSL.g:2882:1: entryRuleCustomTermination returns [EObject current=null] : iv_ruleCustomTermination= ruleCustomTermination EOF ;
    public final EObject entryRuleCustomTermination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTermination = null;


        try {
            // InternalPactDSL.g:2882:58: (iv_ruleCustomTermination= ruleCustomTermination EOF )
            // InternalPactDSL.g:2883:2: iv_ruleCustomTermination= ruleCustomTermination EOF
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
    // InternalPactDSL.g:2889:1: ruleCustomTermination returns [EObject current=null] : (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? ) ;
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
            // InternalPactDSL.g:2895:2: ( (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2896:2: (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2896:2: (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalPactDSL.g:2897:3: otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_CustomTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0());
            		
            // InternalPactDSL.g:2901:3: ( (otherlv_1= RULE_ID ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalPactDSL.g:2902:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2902:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:2903:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCustomTerminationRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            otherlv_2=(Token)match(input,63,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomTerminationAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3());
            		
            // InternalPactDSL.g:2922:3: ( (lv_CustomTerminationClause_4_0= RULE_STRING ) )
            // InternalPactDSL.g:2923:4: (lv_CustomTerminationClause_4_0= RULE_STRING )
            {
            // InternalPactDSL.g:2923:4: (lv_CustomTerminationClause_4_0= RULE_STRING )
            // InternalPactDSL.g:2924:5: lv_CustomTerminationClause_4_0= RULE_STRING
            {
            lv_CustomTerminationClause_4_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

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

            // InternalPactDSL.g:2940:3: (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==46) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPactDSL.g:2941:4: otherlv_5= 'by' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getCustomTerminationAccess().getByKeyword_5_0());
                    			
                    // InternalPactDSL.g:2945:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPactDSL.g:2946:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPactDSL.g:2946:5: (otherlv_6= RULE_ID )
                    // InternalPactDSL.g:2947:6: otherlv_6= RULE_ID
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
    // InternalPactDSL.g:2963:1: entryRuleBoilerplateType returns [EObject current=null] : iv_ruleBoilerplateType= ruleBoilerplateType EOF ;
    public final EObject entryRuleBoilerplateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoilerplateType = null;


        try {
            // InternalPactDSL.g:2963:56: (iv_ruleBoilerplateType= ruleBoilerplateType EOF )
            // InternalPactDSL.g:2964:2: iv_ruleBoilerplateType= ruleBoilerplateType EOF
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
    // InternalPactDSL.g:2970:1: ruleBoilerplateType returns [EObject current=null] : (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices ) ;
    public final EObject ruleBoilerplateType() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicableLaw_0 = null;

        EObject this_Jurisdiction_1 = null;

        EObject this_Notices_2 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:2976:2: ( (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices ) )
            // InternalPactDSL.g:2977:2: (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices )
            {
            // InternalPactDSL.g:2977:2: (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt65=1;
                }
                break;
            case 71:
                {
                alt65=2;
                }
                break;
            case 72:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalPactDSL.g:2978:3: this_ApplicableLaw_0= ruleApplicableLaw
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
                    // InternalPactDSL.g:2987:3: this_Jurisdiction_1= ruleJurisdiction
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
                    // InternalPactDSL.g:2996:3: this_Notices_2= ruleNotices
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
    // InternalPactDSL.g:3008:1: entryRuleApplicableLaw returns [EObject current=null] : iv_ruleApplicableLaw= ruleApplicableLaw EOF ;
    public final EObject entryRuleApplicableLaw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicableLaw = null;


        try {
            // InternalPactDSL.g:3008:54: (iv_ruleApplicableLaw= ruleApplicableLaw EOF )
            // InternalPactDSL.g:3009:2: iv_ruleApplicableLaw= ruleApplicableLaw EOF
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
    // InternalPactDSL.g:3015:1: ruleApplicableLaw returns [EObject current=null] : (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) ;
    public final EObject ruleApplicableLaw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CustomApplicableLaw_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3021:2: ( (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) )
            // InternalPactDSL.g:3022:2: (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            {
            // InternalPactDSL.g:3022:2: (otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            // InternalPactDSL.g:3023:3: otherlv_0= 'ApplicableLaw:' ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0());
            		
            // InternalPactDSL.g:3027:3: ( (lv_CustomApplicableLaw_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3028:4: (lv_CustomApplicableLaw_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3028:4: (lv_CustomApplicableLaw_1_0= RULE_STRING )
            // InternalPactDSL.g:3029:5: lv_CustomApplicableLaw_1_0= RULE_STRING
            {
            lv_CustomApplicableLaw_1_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

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

            // InternalPactDSL.g:3045:3: ( (lv_definition_2_0= ruleDefinedTerm ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==26) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalPactDSL.g:3046:4: (lv_definition_2_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:3046:4: (lv_definition_2_0= ruleDefinedTerm )
                    // InternalPactDSL.g:3047:5: lv_definition_2_0= ruleDefinedTerm
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
    // InternalPactDSL.g:3068:1: entryRuleJurisdiction returns [EObject current=null] : iv_ruleJurisdiction= ruleJurisdiction EOF ;
    public final EObject entryRuleJurisdiction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJurisdiction = null;


        try {
            // InternalPactDSL.g:3068:53: (iv_ruleJurisdiction= ruleJurisdiction EOF )
            // InternalPactDSL.g:3069:2: iv_ruleJurisdiction= ruleJurisdiction EOF
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
    // InternalPactDSL.g:3075:1: ruleJurisdiction returns [EObject current=null] : (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) ;
    public final EObject ruleJurisdiction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CustomJurisdiction_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3081:2: ( (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) )
            // InternalPactDSL.g:3082:2: (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            {
            // InternalPactDSL.g:3082:2: (otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            // InternalPactDSL.g:3083:3: otherlv_0= 'Jurisdiction:' ( (lv_CustomJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0());
            		
            // InternalPactDSL.g:3087:3: ( (lv_CustomJurisdiction_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3088:4: (lv_CustomJurisdiction_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3088:4: (lv_CustomJurisdiction_1_0= RULE_STRING )
            // InternalPactDSL.g:3089:5: lv_CustomJurisdiction_1_0= RULE_STRING
            {
            lv_CustomJurisdiction_1_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

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

            // InternalPactDSL.g:3105:3: ( (lv_definition_2_0= ruleDefinedTerm ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==26) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalPactDSL.g:3106:4: (lv_definition_2_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:3106:4: (lv_definition_2_0= ruleDefinedTerm )
                    // InternalPactDSL.g:3107:5: lv_definition_2_0= ruleDefinedTerm
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
    // InternalPactDSL.g:3128:1: entryRuleNotices returns [EObject current=null] : iv_ruleNotices= ruleNotices EOF ;
    public final EObject entryRuleNotices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotices = null;


        try {
            // InternalPactDSL.g:3128:48: (iv_ruleNotices= ruleNotices EOF )
            // InternalPactDSL.g:3129:2: iv_ruleNotices= ruleNotices EOF
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
    // InternalPactDSL.g:3135:1: ruleNotices returns [EObject current=null] : (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CustomNotice_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3141:2: ( (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:3142:2: (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:3142:2: (otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:3143:3: otherlv_0= 'Notices:' ( (lv_CustomNotice_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNoticesAccess().getNoticesKeyword_0());
            		
            // InternalPactDSL.g:3147:3: ( (lv_CustomNotice_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3148:4: (lv_CustomNotice_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3148:4: (lv_CustomNotice_1_0= RULE_STRING )
            // InternalPactDSL.g:3149:5: lv_CustomNotice_1_0= RULE_STRING
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000100000052L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000100000012L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000100000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000004000002L});

}