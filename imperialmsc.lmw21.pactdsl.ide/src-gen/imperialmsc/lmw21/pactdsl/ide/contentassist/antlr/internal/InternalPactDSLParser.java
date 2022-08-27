package imperialmsc.lmw21.pactdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPactDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'owns'", "'willReturn'", "'mayUse'", "'mayNotUse'", "'ContractTitle:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'StateAfterObligationsDischarged:'", "'Termination:'", "'StateAfterTermination:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'PaymentObligation:'", "'must'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'mustNot'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
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

    	public void setGrammarAccess(PactDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalPactDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPactDSL.g:54:1: ( ruleModel EOF )
            // InternalPactDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPactDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPactDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPactDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalPactDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalPactDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalPactDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntityType"
    // InternalPactDSL.g:78:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:79:1: ( ruleEntityType EOF )
            // InternalPactDSL.g:80:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalPactDSL.g:87:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:91:2: ( ( ( rule__EntityType__Alternatives ) ) )
            // InternalPactDSL.g:92:2: ( ( rule__EntityType__Alternatives ) )
            {
            // InternalPactDSL.g:92:2: ( ( rule__EntityType__Alternatives ) )
            // InternalPactDSL.g:93:3: ( rule__EntityType__Alternatives )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:94:3: ( rule__EntityType__Alternatives )
            // InternalPactDSL.g:94:4: rule__EntityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEffectiveDate"
    // InternalPactDSL.g:103:1: entryRuleEffectiveDate : ruleEffectiveDate EOF ;
    public final void entryRuleEffectiveDate() throws RecognitionException {
        try {
            // InternalPactDSL.g:104:1: ( ruleEffectiveDate EOF )
            // InternalPactDSL.g:105:1: ruleEffectiveDate EOF
            {
             before(grammarAccess.getEffectiveDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectiveDate();

            state._fsp--;

             after(grammarAccess.getEffectiveDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectiveDate"


    // $ANTLR start "ruleEffectiveDate"
    // InternalPactDSL.g:112:1: ruleEffectiveDate : ( ( rule__EffectiveDate__Group__0 ) ) ;
    public final void ruleEffectiveDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:116:2: ( ( ( rule__EffectiveDate__Group__0 ) ) )
            // InternalPactDSL.g:117:2: ( ( rule__EffectiveDate__Group__0 ) )
            {
            // InternalPactDSL.g:117:2: ( ( rule__EffectiveDate__Group__0 ) )
            // InternalPactDSL.g:118:3: ( rule__EffectiveDate__Group__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup()); 
            // InternalPactDSL.g:119:3: ( rule__EffectiveDate__Group__0 )
            // InternalPactDSL.g:119:4: rule__EffectiveDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectiveDate"


    // $ANTLR start "entryRuleParty"
    // InternalPactDSL.g:128:1: entryRuleParty : ruleParty EOF ;
    public final void entryRuleParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:129:1: ( ruleParty EOF )
            // InternalPactDSL.g:130:1: ruleParty EOF
            {
             before(grammarAccess.getPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleParty();

            state._fsp--;

             after(grammarAccess.getPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // InternalPactDSL.g:137:1: ruleParty : ( ( rule__Party__Group__0 ) ) ;
    public final void ruleParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:141:2: ( ( ( rule__Party__Group__0 ) ) )
            // InternalPactDSL.g:142:2: ( ( rule__Party__Group__0 ) )
            {
            // InternalPactDSL.g:142:2: ( ( rule__Party__Group__0 ) )
            // InternalPactDSL.g:143:3: ( rule__Party__Group__0 )
            {
             before(grammarAccess.getPartyAccess().getGroup()); 
            // InternalPactDSL.g:144:3: ( rule__Party__Group__0 )
            // InternalPactDSL.g:144:4: rule__Party__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Party__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRuleThirdParty"
    // InternalPactDSL.g:153:1: entryRuleThirdParty : ruleThirdParty EOF ;
    public final void entryRuleThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:154:1: ( ruleThirdParty EOF )
            // InternalPactDSL.g:155:1: ruleThirdParty EOF
            {
             before(grammarAccess.getThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleThirdParty();

            state._fsp--;

             after(grammarAccess.getThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThirdParty"


    // $ANTLR start "ruleThirdParty"
    // InternalPactDSL.g:162:1: ruleThirdParty : ( ( rule__ThirdParty__Group__0 ) ) ;
    public final void ruleThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:166:2: ( ( ( rule__ThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:167:2: ( ( rule__ThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:167:2: ( ( rule__ThirdParty__Group__0 ) )
            // InternalPactDSL.g:168:3: ( rule__ThirdParty__Group__0 )
            {
             before(grammarAccess.getThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:169:3: ( rule__ThirdParty__Group__0 )
            // InternalPactDSL.g:169:4: rule__ThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThirdParty"


    // $ANTLR start "entryRuleSubjectMatter"
    // InternalPactDSL.g:178:1: entryRuleSubjectMatter : ruleSubjectMatter EOF ;
    public final void entryRuleSubjectMatter() throws RecognitionException {
        try {
            // InternalPactDSL.g:179:1: ( ruleSubjectMatter EOF )
            // InternalPactDSL.g:180:1: ruleSubjectMatter EOF
            {
             before(grammarAccess.getSubjectMatterRule()); 
            pushFollow(FOLLOW_1);
            ruleSubjectMatter();

            state._fsp--;

             after(grammarAccess.getSubjectMatterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubjectMatter"


    // $ANTLR start "ruleSubjectMatter"
    // InternalPactDSL.g:187:1: ruleSubjectMatter : ( ( rule__SubjectMatter__Group__0 ) ) ;
    public final void ruleSubjectMatter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:191:2: ( ( ( rule__SubjectMatter__Group__0 ) ) )
            // InternalPactDSL.g:192:2: ( ( rule__SubjectMatter__Group__0 ) )
            {
            // InternalPactDSL.g:192:2: ( ( rule__SubjectMatter__Group__0 ) )
            // InternalPactDSL.g:193:3: ( rule__SubjectMatter__Group__0 )
            {
             before(grammarAccess.getSubjectMatterAccess().getGroup()); 
            // InternalPactDSL.g:194:3: ( rule__SubjectMatter__Group__0 )
            // InternalPactDSL.g:194:4: rule__SubjectMatter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubjectMatter"


    // $ANTLR start "entryRuleFeature"
    // InternalPactDSL.g:203:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalPactDSL.g:204:1: ( ruleFeature EOF )
            // InternalPactDSL.g:205:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPactDSL.g:212:1: ruleFeature : ( ( rule__Feature__FeaturetypeAssignment ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:216:2: ( ( ( rule__Feature__FeaturetypeAssignment ) ) )
            // InternalPactDSL.g:217:2: ( ( rule__Feature__FeaturetypeAssignment ) )
            {
            // InternalPactDSL.g:217:2: ( ( rule__Feature__FeaturetypeAssignment ) )
            // InternalPactDSL.g:218:3: ( rule__Feature__FeaturetypeAssignment )
            {
             before(grammarAccess.getFeatureAccess().getFeaturetypeAssignment()); 
            // InternalPactDSL.g:219:3: ( rule__Feature__FeaturetypeAssignment )
            // InternalPactDSL.g:219:4: rule__Feature__FeaturetypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Feature__FeaturetypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getFeaturetypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureType"
    // InternalPactDSL.g:228:1: entryRuleFeatureType : ruleFeatureType EOF ;
    public final void entryRuleFeatureType() throws RecognitionException {
        try {
            // InternalPactDSL.g:229:1: ( ruleFeatureType EOF )
            // InternalPactDSL.g:230:1: ruleFeatureType EOF
            {
             before(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // InternalPactDSL.g:237:1: ruleFeatureType : ( ( rule__FeatureType__Alternatives ) ) ;
    public final void ruleFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:241:2: ( ( ( rule__FeatureType__Alternatives ) ) )
            // InternalPactDSL.g:242:2: ( ( rule__FeatureType__Alternatives ) )
            {
            // InternalPactDSL.g:242:2: ( ( rule__FeatureType__Alternatives ) )
            // InternalPactDSL.g:243:3: ( rule__FeatureType__Alternatives )
            {
             before(grammarAccess.getFeatureTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:244:3: ( rule__FeatureType__Alternatives )
            // InternalPactDSL.g:244:4: rule__FeatureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleDefinedTerm"
    // InternalPactDSL.g:253:1: entryRuleDefinedTerm : ruleDefinedTerm EOF ;
    public final void entryRuleDefinedTerm() throws RecognitionException {
        try {
            // InternalPactDSL.g:254:1: ( ruleDefinedTerm EOF )
            // InternalPactDSL.g:255:1: ruleDefinedTerm EOF
            {
             before(grammarAccess.getDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getDefinedTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinedTerm"


    // $ANTLR start "ruleDefinedTerm"
    // InternalPactDSL.g:262:1: ruleDefinedTerm : ( ( rule__DefinedTerm__Group__0 ) ) ;
    public final void ruleDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:266:2: ( ( ( rule__DefinedTerm__Group__0 ) ) )
            // InternalPactDSL.g:267:2: ( ( rule__DefinedTerm__Group__0 ) )
            {
            // InternalPactDSL.g:267:2: ( ( rule__DefinedTerm__Group__0 ) )
            // InternalPactDSL.g:268:3: ( rule__DefinedTerm__Group__0 )
            {
             before(grammarAccess.getDefinedTermAccess().getGroup()); 
            // InternalPactDSL.g:269:3: ( rule__DefinedTerm__Group__0 )
            // InternalPactDSL.g:269:4: rule__DefinedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinedTerm"


    // $ANTLR start "entryRuleAddress"
    // InternalPactDSL.g:278:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalPactDSL.g:279:1: ( ruleAddress EOF )
            // InternalPactDSL.g:280:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalPactDSL.g:287:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:291:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalPactDSL.g:292:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalPactDSL.g:292:2: ( ( rule__Address__Group__0 ) )
            // InternalPactDSL.g:293:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalPactDSL.g:294:3: ( rule__Address__Group__0 )
            // InternalPactDSL.g:294:4: rule__Address__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleCompanyNumber"
    // InternalPactDSL.g:303:1: entryRuleCompanyNumber : ruleCompanyNumber EOF ;
    public final void entryRuleCompanyNumber() throws RecognitionException {
        try {
            // InternalPactDSL.g:304:1: ( ruleCompanyNumber EOF )
            // InternalPactDSL.g:305:1: ruleCompanyNumber EOF
            {
             before(grammarAccess.getCompanyNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleCompanyNumber();

            state._fsp--;

             after(grammarAccess.getCompanyNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompanyNumber"


    // $ANTLR start "ruleCompanyNumber"
    // InternalPactDSL.g:312:1: ruleCompanyNumber : ( ( rule__CompanyNumber__Group__0 ) ) ;
    public final void ruleCompanyNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:316:2: ( ( ( rule__CompanyNumber__Group__0 ) ) )
            // InternalPactDSL.g:317:2: ( ( rule__CompanyNumber__Group__0 ) )
            {
            // InternalPactDSL.g:317:2: ( ( rule__CompanyNumber__Group__0 ) )
            // InternalPactDSL.g:318:3: ( rule__CompanyNumber__Group__0 )
            {
             before(grammarAccess.getCompanyNumberAccess().getGroup()); 
            // InternalPactDSL.g:319:3: ( rule__CompanyNumber__Group__0 )
            // InternalPactDSL.g:319:4: rule__CompanyNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompanyNumber"


    // $ANTLR start "entryRuleCustomFeature"
    // InternalPactDSL.g:328:1: entryRuleCustomFeature : ruleCustomFeature EOF ;
    public final void entryRuleCustomFeature() throws RecognitionException {
        try {
            // InternalPactDSL.g:329:1: ( ruleCustomFeature EOF )
            // InternalPactDSL.g:330:1: ruleCustomFeature EOF
            {
             before(grammarAccess.getCustomFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomFeature();

            state._fsp--;

             after(grammarAccess.getCustomFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomFeature"


    // $ANTLR start "ruleCustomFeature"
    // InternalPactDSL.g:337:1: ruleCustomFeature : ( ( rule__CustomFeature__Group__0 ) ) ;
    public final void ruleCustomFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:341:2: ( ( ( rule__CustomFeature__Group__0 ) ) )
            // InternalPactDSL.g:342:2: ( ( rule__CustomFeature__Group__0 ) )
            {
            // InternalPactDSL.g:342:2: ( ( rule__CustomFeature__Group__0 ) )
            // InternalPactDSL.g:343:3: ( rule__CustomFeature__Group__0 )
            {
             before(grammarAccess.getCustomFeatureAccess().getGroup()); 
            // InternalPactDSL.g:344:3: ( rule__CustomFeature__Group__0 )
            // InternalPactDSL.g:344:4: rule__CustomFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomFeature"


    // $ANTLR start "entryRuleFormalityType"
    // InternalPactDSL.g:353:1: entryRuleFormalityType : ruleFormalityType EOF ;
    public final void entryRuleFormalityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:354:1: ( ruleFormalityType EOF )
            // InternalPactDSL.g:355:1: ruleFormalityType EOF
            {
             before(grammarAccess.getFormalityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFormalityType();

            state._fsp--;

             after(grammarAccess.getFormalityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormalityType"


    // $ANTLR start "ruleFormalityType"
    // InternalPactDSL.g:362:1: ruleFormalityType : ( ( rule__FormalityType__Alternatives ) ) ;
    public final void ruleFormalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:366:2: ( ( ( rule__FormalityType__Alternatives ) ) )
            // InternalPactDSL.g:367:2: ( ( rule__FormalityType__Alternatives ) )
            {
            // InternalPactDSL.g:367:2: ( ( rule__FormalityType__Alternatives ) )
            // InternalPactDSL.g:368:3: ( rule__FormalityType__Alternatives )
            {
             before(grammarAccess.getFormalityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:369:3: ( rule__FormalityType__Alternatives )
            // InternalPactDSL.g:369:4: rule__FormalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormalityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormalityType"


    // $ANTLR start "entryRuleInWriting"
    // InternalPactDSL.g:378:1: entryRuleInWriting : ruleInWriting EOF ;
    public final void entryRuleInWriting() throws RecognitionException {
        try {
            // InternalPactDSL.g:379:1: ( ruleInWriting EOF )
            // InternalPactDSL.g:380:1: ruleInWriting EOF
            {
             before(grammarAccess.getInWritingRule()); 
            pushFollow(FOLLOW_1);
            ruleInWriting();

            state._fsp--;

             after(grammarAccess.getInWritingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInWriting"


    // $ANTLR start "ruleInWriting"
    // InternalPactDSL.g:387:1: ruleInWriting : ( ( rule__InWriting__Group__0 ) ) ;
    public final void ruleInWriting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:391:2: ( ( ( rule__InWriting__Group__0 ) ) )
            // InternalPactDSL.g:392:2: ( ( rule__InWriting__Group__0 ) )
            {
            // InternalPactDSL.g:392:2: ( ( rule__InWriting__Group__0 ) )
            // InternalPactDSL.g:393:3: ( rule__InWriting__Group__0 )
            {
             before(grammarAccess.getInWritingAccess().getGroup()); 
            // InternalPactDSL.g:394:3: ( rule__InWriting__Group__0 )
            // InternalPactDSL.g:394:4: rule__InWriting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInWritingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInWriting"


    // $ANTLR start "entryRuleByEmail"
    // InternalPactDSL.g:403:1: entryRuleByEmail : ruleByEmail EOF ;
    public final void entryRuleByEmail() throws RecognitionException {
        try {
            // InternalPactDSL.g:404:1: ( ruleByEmail EOF )
            // InternalPactDSL.g:405:1: ruleByEmail EOF
            {
             before(grammarAccess.getByEmailRule()); 
            pushFollow(FOLLOW_1);
            ruleByEmail();

            state._fsp--;

             after(grammarAccess.getByEmailRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleByEmail"


    // $ANTLR start "ruleByEmail"
    // InternalPactDSL.g:412:1: ruleByEmail : ( ( rule__ByEmail__Group__0 ) ) ;
    public final void ruleByEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:416:2: ( ( ( rule__ByEmail__Group__0 ) ) )
            // InternalPactDSL.g:417:2: ( ( rule__ByEmail__Group__0 ) )
            {
            // InternalPactDSL.g:417:2: ( ( rule__ByEmail__Group__0 ) )
            // InternalPactDSL.g:418:3: ( rule__ByEmail__Group__0 )
            {
             before(grammarAccess.getByEmailAccess().getGroup()); 
            // InternalPactDSL.g:419:3: ( rule__ByEmail__Group__0 )
            // InternalPactDSL.g:419:4: rule__ByEmail__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByEmailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleByEmail"


    // $ANTLR start "entryRuleGivingNotice"
    // InternalPactDSL.g:428:1: entryRuleGivingNotice : ruleGivingNotice EOF ;
    public final void entryRuleGivingNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:429:1: ( ruleGivingNotice EOF )
            // InternalPactDSL.g:430:1: ruleGivingNotice EOF
            {
             before(grammarAccess.getGivingNoticeRule()); 
            pushFollow(FOLLOW_1);
            ruleGivingNotice();

            state._fsp--;

             after(grammarAccess.getGivingNoticeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivingNotice"


    // $ANTLR start "ruleGivingNotice"
    // InternalPactDSL.g:437:1: ruleGivingNotice : ( ( rule__GivingNotice__Group__0 ) ) ;
    public final void ruleGivingNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:441:2: ( ( ( rule__GivingNotice__Group__0 ) ) )
            // InternalPactDSL.g:442:2: ( ( rule__GivingNotice__Group__0 ) )
            {
            // InternalPactDSL.g:442:2: ( ( rule__GivingNotice__Group__0 ) )
            // InternalPactDSL.g:443:3: ( rule__GivingNotice__Group__0 )
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup()); 
            // InternalPactDSL.g:444:3: ( rule__GivingNotice__Group__0 )
            // InternalPactDSL.g:444:4: rule__GivingNotice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivingNotice"


    // $ANTLR start "entryRuleCustomFormality"
    // InternalPactDSL.g:453:1: entryRuleCustomFormality : ruleCustomFormality EOF ;
    public final void entryRuleCustomFormality() throws RecognitionException {
        try {
            // InternalPactDSL.g:454:1: ( ruleCustomFormality EOF )
            // InternalPactDSL.g:455:1: ruleCustomFormality EOF
            {
             before(grammarAccess.getCustomFormalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomFormality();

            state._fsp--;

             after(grammarAccess.getCustomFormalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomFormality"


    // $ANTLR start "ruleCustomFormality"
    // InternalPactDSL.g:462:1: ruleCustomFormality : ( ( rule__CustomFormality__Group__0 ) ) ;
    public final void ruleCustomFormality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:466:2: ( ( ( rule__CustomFormality__Group__0 ) ) )
            // InternalPactDSL.g:467:2: ( ( rule__CustomFormality__Group__0 ) )
            {
            // InternalPactDSL.g:467:2: ( ( rule__CustomFormality__Group__0 ) )
            // InternalPactDSL.g:468:3: ( rule__CustomFormality__Group__0 )
            {
             before(grammarAccess.getCustomFormalityAccess().getGroup()); 
            // InternalPactDSL.g:469:3: ( rule__CustomFormality__Group__0 )
            // InternalPactDSL.g:469:4: rule__CustomFormality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomFormalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomFormality"


    // $ANTLR start "entryRuleActionType"
    // InternalPactDSL.g:478:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalPactDSL.g:479:1: ( ruleActionType EOF )
            // InternalPactDSL.g:480:1: ruleActionType EOF
            {
             before(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalPactDSL.g:487:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:491:2: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalPactDSL.g:492:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalPactDSL.g:492:2: ( ( rule__ActionType__Alternatives ) )
            // InternalPactDSL.g:493:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:494:3: ( rule__ActionType__Alternatives )
            // InternalPactDSL.g:494:4: rule__ActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGivenConsent"
    // InternalPactDSL.g:503:1: entryRuleGivenConsent : ruleGivenConsent EOF ;
    public final void entryRuleGivenConsent() throws RecognitionException {
        try {
            // InternalPactDSL.g:504:1: ( ruleGivenConsent EOF )
            // InternalPactDSL.g:505:1: ruleGivenConsent EOF
            {
             before(grammarAccess.getGivenConsentRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenConsent();

            state._fsp--;

             after(grammarAccess.getGivenConsentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivenConsent"


    // $ANTLR start "ruleGivenConsent"
    // InternalPactDSL.g:512:1: ruleGivenConsent : ( ( rule__GivenConsent__Group__0 ) ) ;
    public final void ruleGivenConsent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:516:2: ( ( ( rule__GivenConsent__Group__0 ) ) )
            // InternalPactDSL.g:517:2: ( ( rule__GivenConsent__Group__0 ) )
            {
            // InternalPactDSL.g:517:2: ( ( rule__GivenConsent__Group__0 ) )
            // InternalPactDSL.g:518:3: ( rule__GivenConsent__Group__0 )
            {
             before(grammarAccess.getGivenConsentAccess().getGroup()); 
            // InternalPactDSL.g:519:3: ( rule__GivenConsent__Group__0 )
            // InternalPactDSL.g:519:4: rule__GivenConsent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenConsentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenConsent"


    // $ANTLR start "entryRuleGivenWrittenConsent"
    // InternalPactDSL.g:528:1: entryRuleGivenWrittenConsent : ruleGivenWrittenConsent EOF ;
    public final void entryRuleGivenWrittenConsent() throws RecognitionException {
        try {
            // InternalPactDSL.g:529:1: ( ruleGivenWrittenConsent EOF )
            // InternalPactDSL.g:530:1: ruleGivenWrittenConsent EOF
            {
             before(grammarAccess.getGivenWrittenConsentRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenWrittenConsent();

            state._fsp--;

             after(grammarAccess.getGivenWrittenConsentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivenWrittenConsent"


    // $ANTLR start "ruleGivenWrittenConsent"
    // InternalPactDSL.g:537:1: ruleGivenWrittenConsent : ( ( rule__GivenWrittenConsent__Group__0 ) ) ;
    public final void ruleGivenWrittenConsent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:541:2: ( ( ( rule__GivenWrittenConsent__Group__0 ) ) )
            // InternalPactDSL.g:542:2: ( ( rule__GivenWrittenConsent__Group__0 ) )
            {
            // InternalPactDSL.g:542:2: ( ( rule__GivenWrittenConsent__Group__0 ) )
            // InternalPactDSL.g:543:3: ( rule__GivenWrittenConsent__Group__0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGroup()); 
            // InternalPactDSL.g:544:3: ( rule__GivenWrittenConsent__Group__0 )
            // InternalPactDSL.g:544:4: rule__GivenWrittenConsent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenWrittenConsentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenWrittenConsent"


    // $ANTLR start "entryRuleStateType"
    // InternalPactDSL.g:553:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:554:1: ( ruleStateType EOF )
            // InternalPactDSL.g:555:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // InternalPactDSL.g:562:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:566:2: ( ( ( rule__StateType__Alternatives ) ) )
            // InternalPactDSL.g:567:2: ( ( rule__StateType__Alternatives ) )
            {
            // InternalPactDSL.g:567:2: ( ( rule__StateType__Alternatives ) )
            // InternalPactDSL.g:568:3: ( rule__StateType__Alternatives )
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:569:3: ( rule__StateType__Alternatives )
            // InternalPactDSL.g:569:4: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleOwnership"
    // InternalPactDSL.g:578:1: entryRuleOwnership : ruleOwnership EOF ;
    public final void entryRuleOwnership() throws RecognitionException {
        try {
            // InternalPactDSL.g:579:1: ( ruleOwnership EOF )
            // InternalPactDSL.g:580:1: ruleOwnership EOF
            {
             before(grammarAccess.getOwnershipRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnership();

            state._fsp--;

             after(grammarAccess.getOwnershipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnership"


    // $ANTLR start "ruleOwnership"
    // InternalPactDSL.g:587:1: ruleOwnership : ( ( rule__Ownership__Group__0 ) ) ;
    public final void ruleOwnership() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:591:2: ( ( ( rule__Ownership__Group__0 ) ) )
            // InternalPactDSL.g:592:2: ( ( rule__Ownership__Group__0 ) )
            {
            // InternalPactDSL.g:592:2: ( ( rule__Ownership__Group__0 ) )
            // InternalPactDSL.g:593:3: ( rule__Ownership__Group__0 )
            {
             before(grammarAccess.getOwnershipAccess().getGroup()); 
            // InternalPactDSL.g:594:3: ( rule__Ownership__Group__0 )
            // InternalPactDSL.g:594:4: rule__Ownership__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnership"


    // $ANTLR start "entryRuleRightToUse"
    // InternalPactDSL.g:603:1: entryRuleRightToUse : ruleRightToUse EOF ;
    public final void entryRuleRightToUse() throws RecognitionException {
        try {
            // InternalPactDSL.g:604:1: ( ruleRightToUse EOF )
            // InternalPactDSL.g:605:1: ruleRightToUse EOF
            {
             before(grammarAccess.getRightToUseRule()); 
            pushFollow(FOLLOW_1);
            ruleRightToUse();

            state._fsp--;

             after(grammarAccess.getRightToUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightToUse"


    // $ANTLR start "ruleRightToUse"
    // InternalPactDSL.g:612:1: ruleRightToUse : ( ( rule__RightToUse__Group__0 ) ) ;
    public final void ruleRightToUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:616:2: ( ( ( rule__RightToUse__Group__0 ) ) )
            // InternalPactDSL.g:617:2: ( ( rule__RightToUse__Group__0 ) )
            {
            // InternalPactDSL.g:617:2: ( ( rule__RightToUse__Group__0 ) )
            // InternalPactDSL.g:618:3: ( rule__RightToUse__Group__0 )
            {
             before(grammarAccess.getRightToUseAccess().getGroup()); 
            // InternalPactDSL.g:619:3: ( rule__RightToUse__Group__0 )
            // InternalPactDSL.g:619:4: rule__RightToUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightToUse"


    // $ANTLR start "entryRulePrimaryObligationType"
    // InternalPactDSL.g:628:1: entryRulePrimaryObligationType : rulePrimaryObligationType EOF ;
    public final void entryRulePrimaryObligationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:629:1: ( rulePrimaryObligationType EOF )
            // InternalPactDSL.g:630:1: rulePrimaryObligationType EOF
            {
             before(grammarAccess.getPrimaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryObligationType();

            state._fsp--;

             after(grammarAccess.getPrimaryObligationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryObligationType"


    // $ANTLR start "rulePrimaryObligationType"
    // InternalPactDSL.g:637:1: rulePrimaryObligationType : ( ( rule__PrimaryObligationType__Alternatives ) ) ;
    public final void rulePrimaryObligationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:641:2: ( ( ( rule__PrimaryObligationType__Alternatives ) ) )
            // InternalPactDSL.g:642:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            {
            // InternalPactDSL.g:642:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            // InternalPactDSL.g:643:3: ( rule__PrimaryObligationType__Alternatives )
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:644:3: ( rule__PrimaryObligationType__Alternatives )
            // InternalPactDSL.g:644:4: rule__PrimaryObligationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryObligationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryObligationType"


    // $ANTLR start "entryRulePaymentObligation"
    // InternalPactDSL.g:653:1: entryRulePaymentObligation : rulePaymentObligation EOF ;
    public final void entryRulePaymentObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:654:1: ( rulePaymentObligation EOF )
            // InternalPactDSL.g:655:1: rulePaymentObligation EOF
            {
             before(grammarAccess.getPaymentObligationRule()); 
            pushFollow(FOLLOW_1);
            rulePaymentObligation();

            state._fsp--;

             after(grammarAccess.getPaymentObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaymentObligation"


    // $ANTLR start "rulePaymentObligation"
    // InternalPactDSL.g:662:1: rulePaymentObligation : ( ( rule__PaymentObligation__Group__0 ) ) ;
    public final void rulePaymentObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:666:2: ( ( ( rule__PaymentObligation__Group__0 ) ) )
            // InternalPactDSL.g:667:2: ( ( rule__PaymentObligation__Group__0 ) )
            {
            // InternalPactDSL.g:667:2: ( ( rule__PaymentObligation__Group__0 ) )
            // InternalPactDSL.g:668:3: ( rule__PaymentObligation__Group__0 )
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup()); 
            // InternalPactDSL.g:669:3: ( rule__PaymentObligation__Group__0 )
            // InternalPactDSL.g:669:4: rule__PaymentObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentObligation"


    // $ANTLR start "entryRuleDeliveryObligation"
    // InternalPactDSL.g:678:1: entryRuleDeliveryObligation : ruleDeliveryObligation EOF ;
    public final void entryRuleDeliveryObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:679:1: ( ruleDeliveryObligation EOF )
            // InternalPactDSL.g:680:1: ruleDeliveryObligation EOF
            {
             before(grammarAccess.getDeliveryObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeliveryObligation();

            state._fsp--;

             after(grammarAccess.getDeliveryObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeliveryObligation"


    // $ANTLR start "ruleDeliveryObligation"
    // InternalPactDSL.g:687:1: ruleDeliveryObligation : ( ( rule__DeliveryObligation__Group__0 ) ) ;
    public final void ruleDeliveryObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:691:2: ( ( ( rule__DeliveryObligation__Group__0 ) ) )
            // InternalPactDSL.g:692:2: ( ( rule__DeliveryObligation__Group__0 ) )
            {
            // InternalPactDSL.g:692:2: ( ( rule__DeliveryObligation__Group__0 ) )
            // InternalPactDSL.g:693:3: ( rule__DeliveryObligation__Group__0 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup()); 
            // InternalPactDSL.g:694:3: ( rule__DeliveryObligation__Group__0 )
            // InternalPactDSL.g:694:4: rule__DeliveryObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeliveryObligation"


    // $ANTLR start "entryRuleTransferObligation"
    // InternalPactDSL.g:703:1: entryRuleTransferObligation : ruleTransferObligation EOF ;
    public final void entryRuleTransferObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:704:1: ( ruleTransferObligation EOF )
            // InternalPactDSL.g:705:1: ruleTransferObligation EOF
            {
             before(grammarAccess.getTransferObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransferObligation();

            state._fsp--;

             after(grammarAccess.getTransferObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransferObligation"


    // $ANTLR start "ruleTransferObligation"
    // InternalPactDSL.g:712:1: ruleTransferObligation : ( ( rule__TransferObligation__Group__0 ) ) ;
    public final void ruleTransferObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:716:2: ( ( ( rule__TransferObligation__Group__0 ) ) )
            // InternalPactDSL.g:717:2: ( ( rule__TransferObligation__Group__0 ) )
            {
            // InternalPactDSL.g:717:2: ( ( rule__TransferObligation__Group__0 ) )
            // InternalPactDSL.g:718:3: ( rule__TransferObligation__Group__0 )
            {
             before(grammarAccess.getTransferObligationAccess().getGroup()); 
            // InternalPactDSL.g:719:3: ( rule__TransferObligation__Group__0 )
            // InternalPactDSL.g:719:4: rule__TransferObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransferObligation"


    // $ANTLR start "entryRuleLicenceObligation"
    // InternalPactDSL.g:728:1: entryRuleLicenceObligation : ruleLicenceObligation EOF ;
    public final void entryRuleLicenceObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:729:1: ( ruleLicenceObligation EOF )
            // InternalPactDSL.g:730:1: ruleLicenceObligation EOF
            {
             before(grammarAccess.getLicenceObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleLicenceObligation();

            state._fsp--;

             after(grammarAccess.getLicenceObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLicenceObligation"


    // $ANTLR start "ruleLicenceObligation"
    // InternalPactDSL.g:737:1: ruleLicenceObligation : ( ( rule__LicenceObligation__Group__0 ) ) ;
    public final void ruleLicenceObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:741:2: ( ( ( rule__LicenceObligation__Group__0 ) ) )
            // InternalPactDSL.g:742:2: ( ( rule__LicenceObligation__Group__0 ) )
            {
            // InternalPactDSL.g:742:2: ( ( rule__LicenceObligation__Group__0 ) )
            // InternalPactDSL.g:743:3: ( rule__LicenceObligation__Group__0 )
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup()); 
            // InternalPactDSL.g:744:3: ( rule__LicenceObligation__Group__0 )
            // InternalPactDSL.g:744:4: rule__LicenceObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLicenceObligation"


    // $ANTLR start "entryRuleConstraintParty"
    // InternalPactDSL.g:753:1: entryRuleConstraintParty : ruleConstraintParty EOF ;
    public final void entryRuleConstraintParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:754:1: ( ruleConstraintParty EOF )
            // InternalPactDSL.g:755:1: ruleConstraintParty EOF
            {
             before(grammarAccess.getConstraintPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintParty();

            state._fsp--;

             after(grammarAccess.getConstraintPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintParty"


    // $ANTLR start "ruleConstraintParty"
    // InternalPactDSL.g:762:1: ruleConstraintParty : ( ( rule__ConstraintParty__Group__0 ) ) ;
    public final void ruleConstraintParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:766:2: ( ( ( rule__ConstraintParty__Group__0 ) ) )
            // InternalPactDSL.g:767:2: ( ( rule__ConstraintParty__Group__0 ) )
            {
            // InternalPactDSL.g:767:2: ( ( rule__ConstraintParty__Group__0 ) )
            // InternalPactDSL.g:768:3: ( rule__ConstraintParty__Group__0 )
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup()); 
            // InternalPactDSL.g:769:3: ( rule__ConstraintParty__Group__0 )
            // InternalPactDSL.g:769:4: rule__ConstraintParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintParty"


    // $ANTLR start "entryRuleConstraintThirdParty"
    // InternalPactDSL.g:778:1: entryRuleConstraintThirdParty : ruleConstraintThirdParty EOF ;
    public final void entryRuleConstraintThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:779:1: ( ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:780:1: ruleConstraintThirdParty EOF
            {
             before(grammarAccess.getConstraintThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintThirdParty();

            state._fsp--;

             after(grammarAccess.getConstraintThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintThirdParty"


    // $ANTLR start "ruleConstraintThirdParty"
    // InternalPactDSL.g:787:1: ruleConstraintThirdParty : ( ( rule__ConstraintThirdParty__Group__0 ) ) ;
    public final void ruleConstraintThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:791:2: ( ( ( rule__ConstraintThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:792:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:792:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            // InternalPactDSL.g:793:3: ( rule__ConstraintThirdParty__Group__0 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:794:3: ( rule__ConstraintThirdParty__Group__0 )
            // InternalPactDSL.g:794:4: rule__ConstraintThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintThirdParty"


    // $ANTLR start "entryRuleTerminationType"
    // InternalPactDSL.g:803:1: entryRuleTerminationType : ruleTerminationType EOF ;
    public final void entryRuleTerminationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:804:1: ( ruleTerminationType EOF )
            // InternalPactDSL.g:805:1: ruleTerminationType EOF
            {
             before(grammarAccess.getTerminationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminationType();

            state._fsp--;

             after(grammarAccess.getTerminationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminationType"


    // $ANTLR start "ruleTerminationType"
    // InternalPactDSL.g:812:1: ruleTerminationType : ( ( rule__TerminationType__Alternatives ) ) ;
    public final void ruleTerminationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:816:2: ( ( ( rule__TerminationType__Alternatives ) ) )
            // InternalPactDSL.g:817:2: ( ( rule__TerminationType__Alternatives ) )
            {
            // InternalPactDSL.g:817:2: ( ( rule__TerminationType__Alternatives ) )
            // InternalPactDSL.g:818:3: ( rule__TerminationType__Alternatives )
            {
             before(grammarAccess.getTerminationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:819:3: ( rule__TerminationType__Alternatives )
            // InternalPactDSL.g:819:4: rule__TerminationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminationType"


    // $ANTLR start "entryRuleForConvenience"
    // InternalPactDSL.g:828:1: entryRuleForConvenience : ruleForConvenience EOF ;
    public final void entryRuleForConvenience() throws RecognitionException {
        try {
            // InternalPactDSL.g:829:1: ( ruleForConvenience EOF )
            // InternalPactDSL.g:830:1: ruleForConvenience EOF
            {
             before(grammarAccess.getForConvenienceRule()); 
            pushFollow(FOLLOW_1);
            ruleForConvenience();

            state._fsp--;

             after(grammarAccess.getForConvenienceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForConvenience"


    // $ANTLR start "ruleForConvenience"
    // InternalPactDSL.g:837:1: ruleForConvenience : ( ( rule__ForConvenience__Group__0 ) ) ;
    public final void ruleForConvenience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:841:2: ( ( ( rule__ForConvenience__Group__0 ) ) )
            // InternalPactDSL.g:842:2: ( ( rule__ForConvenience__Group__0 ) )
            {
            // InternalPactDSL.g:842:2: ( ( rule__ForConvenience__Group__0 ) )
            // InternalPactDSL.g:843:3: ( rule__ForConvenience__Group__0 )
            {
             before(grammarAccess.getForConvenienceAccess().getGroup()); 
            // InternalPactDSL.g:844:3: ( rule__ForConvenience__Group__0 )
            // InternalPactDSL.g:844:4: rule__ForConvenience__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForConvenience"


    // $ANTLR start "entryRuleOnReasonableNotice"
    // InternalPactDSL.g:853:1: entryRuleOnReasonableNotice : ruleOnReasonableNotice EOF ;
    public final void entryRuleOnReasonableNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:854:1: ( ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:855:1: ruleOnReasonableNotice EOF
            {
             before(grammarAccess.getOnReasonableNoticeRule()); 
            pushFollow(FOLLOW_1);
            ruleOnReasonableNotice();

            state._fsp--;

             after(grammarAccess.getOnReasonableNoticeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnReasonableNotice"


    // $ANTLR start "ruleOnReasonableNotice"
    // InternalPactDSL.g:862:1: ruleOnReasonableNotice : ( ( rule__OnReasonableNotice__Group__0 ) ) ;
    public final void ruleOnReasonableNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:866:2: ( ( ( rule__OnReasonableNotice__Group__0 ) ) )
            // InternalPactDSL.g:867:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            {
            // InternalPactDSL.g:867:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            // InternalPactDSL.g:868:3: ( rule__OnReasonableNotice__Group__0 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 
            // InternalPactDSL.g:869:3: ( rule__OnReasonableNotice__Group__0 )
            // InternalPactDSL.g:869:4: rule__OnReasonableNotice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnReasonableNotice"


    // $ANTLR start "entryRuleForBreach"
    // InternalPactDSL.g:878:1: entryRuleForBreach : ruleForBreach EOF ;
    public final void entryRuleForBreach() throws RecognitionException {
        try {
            // InternalPactDSL.g:879:1: ( ruleForBreach EOF )
            // InternalPactDSL.g:880:1: ruleForBreach EOF
            {
             before(grammarAccess.getForBreachRule()); 
            pushFollow(FOLLOW_1);
            ruleForBreach();

            state._fsp--;

             after(grammarAccess.getForBreachRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForBreach"


    // $ANTLR start "ruleForBreach"
    // InternalPactDSL.g:887:1: ruleForBreach : ( ( rule__ForBreach__Group__0 ) ) ;
    public final void ruleForBreach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:891:2: ( ( ( rule__ForBreach__Group__0 ) ) )
            // InternalPactDSL.g:892:2: ( ( rule__ForBreach__Group__0 ) )
            {
            // InternalPactDSL.g:892:2: ( ( rule__ForBreach__Group__0 ) )
            // InternalPactDSL.g:893:3: ( rule__ForBreach__Group__0 )
            {
             before(grammarAccess.getForBreachAccess().getGroup()); 
            // InternalPactDSL.g:894:3: ( rule__ForBreach__Group__0 )
            // InternalPactDSL.g:894:4: rule__ForBreach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForBreach"


    // $ANTLR start "entryRuleOnInsolvencyEvent"
    // InternalPactDSL.g:903:1: entryRuleOnInsolvencyEvent : ruleOnInsolvencyEvent EOF ;
    public final void entryRuleOnInsolvencyEvent() throws RecognitionException {
        try {
            // InternalPactDSL.g:904:1: ( ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:905:1: ruleOnInsolvencyEvent EOF
            {
             before(grammarAccess.getOnInsolvencyEventRule()); 
            pushFollow(FOLLOW_1);
            ruleOnInsolvencyEvent();

            state._fsp--;

             after(grammarAccess.getOnInsolvencyEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnInsolvencyEvent"


    // $ANTLR start "ruleOnInsolvencyEvent"
    // InternalPactDSL.g:912:1: ruleOnInsolvencyEvent : ( ( rule__OnInsolvencyEvent__Group__0 ) ) ;
    public final void ruleOnInsolvencyEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:916:2: ( ( ( rule__OnInsolvencyEvent__Group__0 ) ) )
            // InternalPactDSL.g:917:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            {
            // InternalPactDSL.g:917:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            // InternalPactDSL.g:918:3: ( rule__OnInsolvencyEvent__Group__0 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 
            // InternalPactDSL.g:919:3: ( rule__OnInsolvencyEvent__Group__0 )
            // InternalPactDSL.g:919:4: rule__OnInsolvencyEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnInsolvencyEvent"


    // $ANTLR start "entryRuleCustomTermination"
    // InternalPactDSL.g:928:1: entryRuleCustomTermination : ruleCustomTermination EOF ;
    public final void entryRuleCustomTermination() throws RecognitionException {
        try {
            // InternalPactDSL.g:929:1: ( ruleCustomTermination EOF )
            // InternalPactDSL.g:930:1: ruleCustomTermination EOF
            {
             before(grammarAccess.getCustomTerminationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomTermination();

            state._fsp--;

             after(grammarAccess.getCustomTerminationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomTermination"


    // $ANTLR start "ruleCustomTermination"
    // InternalPactDSL.g:937:1: ruleCustomTermination : ( ( rule__CustomTermination__Group__0 ) ) ;
    public final void ruleCustomTermination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:941:2: ( ( ( rule__CustomTermination__Group__0 ) ) )
            // InternalPactDSL.g:942:2: ( ( rule__CustomTermination__Group__0 ) )
            {
            // InternalPactDSL.g:942:2: ( ( rule__CustomTermination__Group__0 ) )
            // InternalPactDSL.g:943:3: ( rule__CustomTermination__Group__0 )
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup()); 
            // InternalPactDSL.g:944:3: ( rule__CustomTermination__Group__0 )
            // InternalPactDSL.g:944:4: rule__CustomTermination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomTermination"


    // $ANTLR start "entryRuleBoilerplateType"
    // InternalPactDSL.g:953:1: entryRuleBoilerplateType : ruleBoilerplateType EOF ;
    public final void entryRuleBoilerplateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:954:1: ( ruleBoilerplateType EOF )
            // InternalPactDSL.g:955:1: ruleBoilerplateType EOF
            {
             before(grammarAccess.getBoilerplateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBoilerplateType();

            state._fsp--;

             after(grammarAccess.getBoilerplateTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoilerplateType"


    // $ANTLR start "ruleBoilerplateType"
    // InternalPactDSL.g:962:1: ruleBoilerplateType : ( ( rule__BoilerplateType__Alternatives ) ) ;
    public final void ruleBoilerplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:966:2: ( ( ( rule__BoilerplateType__Alternatives ) ) )
            // InternalPactDSL.g:967:2: ( ( rule__BoilerplateType__Alternatives ) )
            {
            // InternalPactDSL.g:967:2: ( ( rule__BoilerplateType__Alternatives ) )
            // InternalPactDSL.g:968:3: ( rule__BoilerplateType__Alternatives )
            {
             before(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:969:3: ( rule__BoilerplateType__Alternatives )
            // InternalPactDSL.g:969:4: rule__BoilerplateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoilerplateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoilerplateType"


    // $ANTLR start "entryRuleApplicableLaw"
    // InternalPactDSL.g:978:1: entryRuleApplicableLaw : ruleApplicableLaw EOF ;
    public final void entryRuleApplicableLaw() throws RecognitionException {
        try {
            // InternalPactDSL.g:979:1: ( ruleApplicableLaw EOF )
            // InternalPactDSL.g:980:1: ruleApplicableLaw EOF
            {
             before(grammarAccess.getApplicableLawRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicableLaw();

            state._fsp--;

             after(grammarAccess.getApplicableLawRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicableLaw"


    // $ANTLR start "ruleApplicableLaw"
    // InternalPactDSL.g:987:1: ruleApplicableLaw : ( ( rule__ApplicableLaw__Group__0 ) ) ;
    public final void ruleApplicableLaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:991:2: ( ( ( rule__ApplicableLaw__Group__0 ) ) )
            // InternalPactDSL.g:992:2: ( ( rule__ApplicableLaw__Group__0 ) )
            {
            // InternalPactDSL.g:992:2: ( ( rule__ApplicableLaw__Group__0 ) )
            // InternalPactDSL.g:993:3: ( rule__ApplicableLaw__Group__0 )
            {
             before(grammarAccess.getApplicableLawAccess().getGroup()); 
            // InternalPactDSL.g:994:3: ( rule__ApplicableLaw__Group__0 )
            // InternalPactDSL.g:994:4: rule__ApplicableLaw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicableLawAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicableLaw"


    // $ANTLR start "entryRuleJurisdiction"
    // InternalPactDSL.g:1003:1: entryRuleJurisdiction : ruleJurisdiction EOF ;
    public final void entryRuleJurisdiction() throws RecognitionException {
        try {
            // InternalPactDSL.g:1004:1: ( ruleJurisdiction EOF )
            // InternalPactDSL.g:1005:1: ruleJurisdiction EOF
            {
             before(grammarAccess.getJurisdictionRule()); 
            pushFollow(FOLLOW_1);
            ruleJurisdiction();

            state._fsp--;

             after(grammarAccess.getJurisdictionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJurisdiction"


    // $ANTLR start "ruleJurisdiction"
    // InternalPactDSL.g:1012:1: ruleJurisdiction : ( ( rule__Jurisdiction__Group__0 ) ) ;
    public final void ruleJurisdiction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1016:2: ( ( ( rule__Jurisdiction__Group__0 ) ) )
            // InternalPactDSL.g:1017:2: ( ( rule__Jurisdiction__Group__0 ) )
            {
            // InternalPactDSL.g:1017:2: ( ( rule__Jurisdiction__Group__0 ) )
            // InternalPactDSL.g:1018:3: ( rule__Jurisdiction__Group__0 )
            {
             before(grammarAccess.getJurisdictionAccess().getGroup()); 
            // InternalPactDSL.g:1019:3: ( rule__Jurisdiction__Group__0 )
            // InternalPactDSL.g:1019:4: rule__Jurisdiction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJurisdictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJurisdiction"


    // $ANTLR start "entryRuleNotices"
    // InternalPactDSL.g:1028:1: entryRuleNotices : ruleNotices EOF ;
    public final void entryRuleNotices() throws RecognitionException {
        try {
            // InternalPactDSL.g:1029:1: ( ruleNotices EOF )
            // InternalPactDSL.g:1030:1: ruleNotices EOF
            {
             before(grammarAccess.getNoticesRule()); 
            pushFollow(FOLLOW_1);
            ruleNotices();

            state._fsp--;

             after(grammarAccess.getNoticesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotices"


    // $ANTLR start "ruleNotices"
    // InternalPactDSL.g:1037:1: ruleNotices : ( ( rule__Notices__Group__0 ) ) ;
    public final void ruleNotices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1041:2: ( ( ( rule__Notices__Group__0 ) ) )
            // InternalPactDSL.g:1042:2: ( ( rule__Notices__Group__0 ) )
            {
            // InternalPactDSL.g:1042:2: ( ( rule__Notices__Group__0 ) )
            // InternalPactDSL.g:1043:3: ( rule__Notices__Group__0 )
            {
             before(grammarAccess.getNoticesAccess().getGroup()); 
            // InternalPactDSL.g:1044:3: ( rule__Notices__Group__0 )
            // InternalPactDSL.g:1044:4: rule__Notices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Notices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoticesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotices"


    // $ANTLR start "rule__EntityType__Alternatives"
    // InternalPactDSL.g:1052:1: rule__EntityType__Alternatives : ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1056:1: ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPactDSL.g:1057:2: ( ruleEffectiveDate )
                    {
                    // InternalPactDSL.g:1057:2: ( ruleEffectiveDate )
                    // InternalPactDSL.g:1058:3: ruleEffectiveDate
                    {
                     before(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectiveDate();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1063:2: ( ruleParty )
                    {
                    // InternalPactDSL.g:1063:2: ( ruleParty )
                    // InternalPactDSL.g:1064:3: ruleParty
                    {
                     before(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParty();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1069:2: ( ruleThirdParty )
                    {
                    // InternalPactDSL.g:1069:2: ( ruleThirdParty )
                    // InternalPactDSL.g:1070:3: ruleThirdParty
                    {
                     before(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThirdParty();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1075:2: ( ruleSubjectMatter )
                    {
                    // InternalPactDSL.g:1075:2: ( ruleSubjectMatter )
                    // InternalPactDSL.g:1076:3: ruleSubjectMatter
                    {
                     before(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubjectMatter();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Alternatives"


    // $ANTLR start "rule__FeatureType__Alternatives"
    // InternalPactDSL.g:1085:1: rule__FeatureType__Alternatives : ( ( ruleDefinedTerm ) | ( ruleAddress ) | ( ruleCompanyNumber ) | ( ruleCustomFeature ) );
    public final void rule__FeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1089:1: ( ( ruleDefinedTerm ) | ( ruleAddress ) | ( ruleCompanyNumber ) | ( ruleCustomFeature ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPactDSL.g:1090:2: ( ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:1090:2: ( ruleDefinedTerm )
                    // InternalPactDSL.g:1091:3: ruleDefinedTerm
                    {
                     before(grammarAccess.getFeatureTypeAccess().getDefinedTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinedTerm();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getDefinedTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1096:2: ( ruleAddress )
                    {
                    // InternalPactDSL.g:1096:2: ( ruleAddress )
                    // InternalPactDSL.g:1097:3: ruleAddress
                    {
                     before(grammarAccess.getFeatureTypeAccess().getAddressParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddress();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getAddressParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1102:2: ( ruleCompanyNumber )
                    {
                    // InternalPactDSL.g:1102:2: ( ruleCompanyNumber )
                    // InternalPactDSL.g:1103:3: ruleCompanyNumber
                    {
                     before(grammarAccess.getFeatureTypeAccess().getCompanyNumberParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompanyNumber();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getCompanyNumberParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1108:2: ( ruleCustomFeature )
                    {
                    // InternalPactDSL.g:1108:2: ( ruleCustomFeature )
                    // InternalPactDSL.g:1109:3: ruleCustomFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getCustomFeatureParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getCustomFeatureParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__Alternatives"


    // $ANTLR start "rule__FormalityType__Alternatives"
    // InternalPactDSL.g:1118:1: rule__FormalityType__Alternatives : ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) );
    public final void rule__FormalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1122:1: ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPactDSL.g:1123:2: ( ruleInWriting )
                    {
                    // InternalPactDSL.g:1123:2: ( ruleInWriting )
                    // InternalPactDSL.g:1124:3: ruleInWriting
                    {
                     before(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInWriting();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1129:2: ( ruleByEmail )
                    {
                    // InternalPactDSL.g:1129:2: ( ruleByEmail )
                    // InternalPactDSL.g:1130:3: ruleByEmail
                    {
                     before(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleByEmail();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1135:2: ( ruleGivingNotice )
                    {
                    // InternalPactDSL.g:1135:2: ( ruleGivingNotice )
                    // InternalPactDSL.g:1136:3: ruleGivingNotice
                    {
                     before(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGivingNotice();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1141:2: ( ruleCustomFormality )
                    {
                    // InternalPactDSL.g:1141:2: ( ruleCustomFormality )
                    // InternalPactDSL.g:1142:3: ruleCustomFormality
                    {
                     before(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomFormality();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalityType__Alternatives"


    // $ANTLR start "rule__ActionType__Alternatives"
    // InternalPactDSL.g:1151:1: rule__ActionType__Alternatives : ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1155:1: ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==41) ) {
                    alt4=1;
                }
                else if ( (LA4_1==42) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPactDSL.g:1156:2: ( ruleGivenConsent )
                    {
                    // InternalPactDSL.g:1156:2: ( ruleGivenConsent )
                    // InternalPactDSL.g:1157:3: ruleGivenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1162:2: ( ruleGivenWrittenConsent )
                    {
                    // InternalPactDSL.g:1162:2: ( ruleGivenWrittenConsent )
                    // InternalPactDSL.g:1163:3: ruleGivenWrittenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenWrittenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Alternatives"


    // $ANTLR start "rule__StateType__Alternatives"
    // InternalPactDSL.g:1172:1: rule__StateType__Alternatives : ( ( ruleOwnership ) | ( ruleRightToUse ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1176:1: ( ( ruleOwnership ) | ( ruleRightToUse ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=13 && LA5_1<=14)) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=11 && LA5_1<=12)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPactDSL.g:1177:2: ( ruleOwnership )
                    {
                    // InternalPactDSL.g:1177:2: ( ruleOwnership )
                    // InternalPactDSL.g:1178:3: ruleOwnership
                    {
                     before(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOwnership();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1183:2: ( ruleRightToUse )
                    {
                    // InternalPactDSL.g:1183:2: ( ruleRightToUse )
                    // InternalPactDSL.g:1184:3: ruleRightToUse
                    {
                     before(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightToUse();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Alternatives"


    // $ANTLR start "rule__Ownership__Alternatives_1"
    // InternalPactDSL.g:1193:1: rule__Ownership__Alternatives_1 : ( ( 'owns' ) | ( 'willReturn' ) );
    public final void rule__Ownership__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1197:1: ( ( 'owns' ) | ( 'willReturn' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPactDSL.g:1198:2: ( 'owns' )
                    {
                    // InternalPactDSL.g:1198:2: ( 'owns' )
                    // InternalPactDSL.g:1199:3: 'owns'
                    {
                     before(grammarAccess.getOwnershipAccess().getOwnsKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getOwnsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1204:2: ( 'willReturn' )
                    {
                    // InternalPactDSL.g:1204:2: ( 'willReturn' )
                    // InternalPactDSL.g:1205:3: 'willReturn'
                    {
                     before(grammarAccess.getOwnershipAccess().getWillReturnKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getWillReturnKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Alternatives_1"


    // $ANTLR start "rule__RightToUse__Alternatives_1"
    // InternalPactDSL.g:1214:1: rule__RightToUse__Alternatives_1 : ( ( 'mayUse' ) | ( 'mayNotUse' ) );
    public final void rule__RightToUse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1218:1: ( ( 'mayUse' ) | ( 'mayNotUse' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPactDSL.g:1219:2: ( 'mayUse' )
                    {
                    // InternalPactDSL.g:1219:2: ( 'mayUse' )
                    // InternalPactDSL.g:1220:3: 'mayUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayUseKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayUseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1225:2: ( 'mayNotUse' )
                    {
                    // InternalPactDSL.g:1225:2: ( 'mayNotUse' )
                    // InternalPactDSL.g:1226:3: 'mayNotUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayNotUseKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayNotUseKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Alternatives_1"


    // $ANTLR start "rule__PrimaryObligationType__Alternatives"
    // InternalPactDSL.g:1235:1: rule__PrimaryObligationType__Alternatives : ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) ) );
    public final void rule__PrimaryObligationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1239:1: ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt8=1;
                }
                break;
            case 48:
                {
                alt8=2;
                }
                break;
            case 50:
                {
                alt8=3;
                }
                break;
            case 52:
                {
                alt8=4;
                }
                break;
            case 56:
                {
                alt8=5;
                }
                break;
            case 58:
                {
                alt8=6;
                }
                break;
            case RULE_STRING:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPactDSL.g:1240:2: ( rulePaymentObligation )
                    {
                    // InternalPactDSL.g:1240:2: ( rulePaymentObligation )
                    // InternalPactDSL.g:1241:3: rulePaymentObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePaymentObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1246:2: ( ruleDeliveryObligation )
                    {
                    // InternalPactDSL.g:1246:2: ( ruleDeliveryObligation )
                    // InternalPactDSL.g:1247:3: ruleDeliveryObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeliveryObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1252:2: ( ruleTransferObligation )
                    {
                    // InternalPactDSL.g:1252:2: ( ruleTransferObligation )
                    // InternalPactDSL.g:1253:3: ruleTransferObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransferObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1258:2: ( ruleLicenceObligation )
                    {
                    // InternalPactDSL.g:1258:2: ( ruleLicenceObligation )
                    // InternalPactDSL.g:1259:3: ruleLicenceObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLicenceObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1264:2: ( ruleConstraintParty )
                    {
                    // InternalPactDSL.g:1264:2: ( ruleConstraintParty )
                    // InternalPactDSL.g:1265:3: ruleConstraintParty
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintParty();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPactDSL.g:1270:2: ( ruleConstraintThirdParty )
                    {
                    // InternalPactDSL.g:1270:2: ( ruleConstraintThirdParty )
                    // InternalPactDSL.g:1271:3: ruleConstraintThirdParty
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintThirdParty();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPactDSL.g:1276:2: ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) )
                    {
                    // InternalPactDSL.g:1276:2: ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) )
                    // InternalPactDSL.g:1277:3: ( rule__PrimaryObligationType__CustomObligationAssignment_6 )
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6()); 
                    // InternalPactDSL.g:1278:3: ( rule__PrimaryObligationType__CustomObligationAssignment_6 )
                    // InternalPactDSL.g:1278:4: rule__PrimaryObligationType__CustomObligationAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryObligationType__CustomObligationAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryObligationType__Alternatives"


    // $ANTLR start "rule__TerminationType__Alternatives"
    // InternalPactDSL.g:1286:1: rule__TerminationType__Alternatives : ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) );
    public final void rule__TerminationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1290:1: ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt9=1;
                }
                break;
            case 65:
                {
                alt9=2;
                }
                break;
            case 66:
                {
                alt9=3;
                }
                break;
            case 68:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPactDSL.g:1291:2: ( ruleForConvenience )
                    {
                    // InternalPactDSL.g:1291:2: ( ruleForConvenience )
                    // InternalPactDSL.g:1292:3: ruleForConvenience
                    {
                     before(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForConvenience();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1297:2: ( ruleOnReasonableNotice )
                    {
                    // InternalPactDSL.g:1297:2: ( ruleOnReasonableNotice )
                    // InternalPactDSL.g:1298:3: ruleOnReasonableNotice
                    {
                     before(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOnReasonableNotice();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1303:2: ( ruleForBreach )
                    {
                    // InternalPactDSL.g:1303:2: ( ruleForBreach )
                    // InternalPactDSL.g:1304:3: ruleForBreach
                    {
                     before(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForBreach();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1309:2: ( ruleOnInsolvencyEvent )
                    {
                    // InternalPactDSL.g:1309:2: ( ruleOnInsolvencyEvent )
                    // InternalPactDSL.g:1310:3: ruleOnInsolvencyEvent
                    {
                     before(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOnInsolvencyEvent();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1315:2: ( ruleCustomTermination )
                    {
                    // InternalPactDSL.g:1315:2: ( ruleCustomTermination )
                    // InternalPactDSL.g:1316:3: ruleCustomTermination
                    {
                     before(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomTermination();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminationType__Alternatives"


    // $ANTLR start "rule__BoilerplateType__Alternatives"
    // InternalPactDSL.g:1325:1: rule__BoilerplateType__Alternatives : ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) );
    public final void rule__BoilerplateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1329:1: ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt10=1;
                }
                break;
            case 71:
                {
                alt10=2;
                }
                break;
            case 72:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPactDSL.g:1330:2: ( ruleApplicableLaw )
                    {
                    // InternalPactDSL.g:1330:2: ( ruleApplicableLaw )
                    // InternalPactDSL.g:1331:3: ruleApplicableLaw
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicableLaw();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1336:2: ( ruleJurisdiction )
                    {
                    // InternalPactDSL.g:1336:2: ( ruleJurisdiction )
                    // InternalPactDSL.g:1337:3: ruleJurisdiction
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJurisdiction();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1342:2: ( ruleNotices )
                    {
                    // InternalPactDSL.g:1342:2: ( ruleNotices )
                    // InternalPactDSL.g:1343:3: ruleNotices
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNotices();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoilerplateType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalPactDSL.g:1352:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1356:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPactDSL.g:1357:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalPactDSL.g:1364:1: rule__Model__Group__0__Impl : ( 'ContractTitle:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1368:1: ( ( 'ContractTitle:' ) )
            // InternalPactDSL.g:1369:1: ( 'ContractTitle:' )
            {
            // InternalPactDSL.g:1369:1: ( 'ContractTitle:' )
            // InternalPactDSL.g:1370:2: 'ContractTitle:'
            {
             before(grammarAccess.getModelAccess().getContractTitleKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getContractTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalPactDSL.g:1379:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1383:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPactDSL.g:1384:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalPactDSL.g:1391:1: rule__Model__Group__1__Impl : ( ( rule__Model__TitleAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1395:1: ( ( ( rule__Model__TitleAssignment_1 ) ) )
            // InternalPactDSL.g:1396:1: ( ( rule__Model__TitleAssignment_1 ) )
            {
            // InternalPactDSL.g:1396:1: ( ( rule__Model__TitleAssignment_1 ) )
            // InternalPactDSL.g:1397:2: ( rule__Model__TitleAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTitleAssignment_1()); 
            // InternalPactDSL.g:1398:2: ( rule__Model__TitleAssignment_1 )
            // InternalPactDSL.g:1398:3: rule__Model__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalPactDSL.g:1406:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1410:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPactDSL.g:1411:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalPactDSL.g:1418:1: rule__Model__Group__2__Impl : ( ( ( '.' ) ) ( ( '.' )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1422:1: ( ( ( ( '.' ) ) ( ( '.' )* ) ) )
            // InternalPactDSL.g:1423:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            {
            // InternalPactDSL.g:1423:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            // InternalPactDSL.g:1424:2: ( ( '.' ) ) ( ( '.' )* )
            {
            // InternalPactDSL.g:1424:2: ( ( '.' ) )
            // InternalPactDSL.g:1425:3: ( '.' )
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1426:3: ( '.' )
            // InternalPactDSL.g:1426:4: '.'
            {
            match(input,16,FOLLOW_6); 

            }

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

            }

            // InternalPactDSL.g:1429:2: ( ( '.' )* )
            // InternalPactDSL.g:1430:3: ( '.' )*
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1431:3: ( '.' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPactDSL.g:1431:4: '.'
            	    {
            	    match(input,16,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalPactDSL.g:1440:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1444:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPactDSL.g:1445:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalPactDSL.g:1452:1: rule__Model__Group__3__Impl : ( 'Entities:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1456:1: ( ( 'Entities:' ) )
            // InternalPactDSL.g:1457:1: ( 'Entities:' )
            {
            // InternalPactDSL.g:1457:1: ( 'Entities:' )
            // InternalPactDSL.g:1458:2: 'Entities:'
            {
             before(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalPactDSL.g:1467:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1471:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPactDSL.g:1472:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalPactDSL.g:1479:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1483:1: ( ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) )
            // InternalPactDSL.g:1484:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            {
            // InternalPactDSL.g:1484:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            // InternalPactDSL.g:1485:2: ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* )
            {
            // InternalPactDSL.g:1485:2: ( ( rule__Model__Group_4__0 ) )
            // InternalPactDSL.g:1486:3: ( rule__Model__Group_4__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1487:3: ( rule__Model__Group_4__0 )
            // InternalPactDSL.g:1487:4: rule__Model__Group_4__0
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }

            // InternalPactDSL.g:1490:2: ( ( rule__Model__Group_4__0 )* )
            // InternalPactDSL.g:1491:3: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1492:3: ( rule__Model__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPactDSL.g:1492:4: rule__Model__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalPactDSL.g:1501:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1505:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalPactDSL.g:1506:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalPactDSL.g:1513:1: rule__Model__Group__5__Impl : ( ( 'Formalities:' )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1517:1: ( ( ( 'Formalities:' )? ) )
            // InternalPactDSL.g:1518:1: ( ( 'Formalities:' )? )
            {
            // InternalPactDSL.g:1518:1: ( ( 'Formalities:' )? )
            // InternalPactDSL.g:1519:2: ( 'Formalities:' )?
            {
             before(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 
            // InternalPactDSL.g:1520:2: ( 'Formalities:' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPactDSL.g:1520:3: 'Formalities:'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalPactDSL.g:1528:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1532:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalPactDSL.g:1533:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalPactDSL.g:1540:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1544:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // InternalPactDSL.g:1545:1: ( ( rule__Model__Group_6__0 )* )
            {
            // InternalPactDSL.g:1545:1: ( ( rule__Model__Group_6__0 )* )
            // InternalPactDSL.g:1546:2: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // InternalPactDSL.g:1547:2: ( rule__Model__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=34 && LA14_0<=35)||LA14_0==37||LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPactDSL.g:1547:3: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalPactDSL.g:1555:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1559:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalPactDSL.g:1560:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalPactDSL.g:1567:1: rule__Model__Group__7__Impl : ( ( 'Actions:' )? ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1571:1: ( ( ( 'Actions:' )? ) )
            // InternalPactDSL.g:1572:1: ( ( 'Actions:' )? )
            {
            // InternalPactDSL.g:1572:1: ( ( 'Actions:' )? )
            // InternalPactDSL.g:1573:2: ( 'Actions:' )?
            {
             before(grammarAccess.getModelAccess().getActionsKeyword_7()); 
            // InternalPactDSL.g:1574:2: ( 'Actions:' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPactDSL.g:1574:3: 'Actions:'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getActionsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalPactDSL.g:1582:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1586:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalPactDSL.g:1587:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalPactDSL.g:1594:1: rule__Model__Group__8__Impl : ( ( rule__Model__Group_8__0 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1598:1: ( ( ( rule__Model__Group_8__0 )* ) )
            // InternalPactDSL.g:1599:1: ( ( rule__Model__Group_8__0 )* )
            {
            // InternalPactDSL.g:1599:1: ( ( rule__Model__Group_8__0 )* )
            // InternalPactDSL.g:1600:2: ( rule__Model__Group_8__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_8()); 
            // InternalPactDSL.g:1601:2: ( rule__Model__Group_8__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=41 && LA16_2<=42)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalPactDSL.g:1601:3: rule__Model__Group_8__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalPactDSL.g:1609:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1613:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalPactDSL.g:1614:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalPactDSL.g:1621:1: rule__Model__Group__9__Impl : ( ( 'StateOnSignature:' )? ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1625:1: ( ( ( 'StateOnSignature:' )? ) )
            // InternalPactDSL.g:1626:1: ( ( 'StateOnSignature:' )? )
            {
            // InternalPactDSL.g:1626:1: ( ( 'StateOnSignature:' )? )
            // InternalPactDSL.g:1627:2: ( 'StateOnSignature:' )?
            {
             before(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 
            // InternalPactDSL.g:1628:2: ( 'StateOnSignature:' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPactDSL.g:1628:3: 'StateOnSignature:'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalPactDSL.g:1636:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1640:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalPactDSL.g:1641:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalPactDSL.g:1648:1: rule__Model__Group__10__Impl : ( ( rule__Model__Group_10__0 )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1652:1: ( ( ( rule__Model__Group_10__0 )* ) )
            // InternalPactDSL.g:1653:1: ( ( rule__Model__Group_10__0 )* )
            {
            // InternalPactDSL.g:1653:1: ( ( rule__Model__Group_10__0 )* )
            // InternalPactDSL.g:1654:2: ( rule__Model__Group_10__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_10()); 
            // InternalPactDSL.g:1655:2: ( rule__Model__Group_10__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPactDSL.g:1655:3: rule__Model__Group_10__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalPactDSL.g:1663:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1667:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalPactDSL.g:1668:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalPactDSL.g:1675:1: rule__Model__Group__11__Impl : ( 'PrimaryObligations:' ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1679:1: ( ( 'PrimaryObligations:' ) )
            // InternalPactDSL.g:1680:1: ( 'PrimaryObligations:' )
            {
            // InternalPactDSL.g:1680:1: ( 'PrimaryObligations:' )
            // InternalPactDSL.g:1681:2: 'PrimaryObligations:'
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalPactDSL.g:1690:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1694:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalPactDSL.g:1695:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalPactDSL.g:1702:1: rule__Model__Group__12__Impl : ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1706:1: ( ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) )
            // InternalPactDSL.g:1707:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            {
            // InternalPactDSL.g:1707:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            // InternalPactDSL.g:1708:2: ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* )
            {
            // InternalPactDSL.g:1708:2: ( ( rule__Model__Group_12__0 ) )
            // InternalPactDSL.g:1709:3: ( rule__Model__Group_12__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1710:3: ( rule__Model__Group_12__0 )
            // InternalPactDSL.g:1710:4: rule__Model__Group_12__0
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_12()); 

            }

            // InternalPactDSL.g:1713:2: ( ( rule__Model__Group_12__0 )* )
            // InternalPactDSL.g:1714:3: ( rule__Model__Group_12__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1715:3: ( rule__Model__Group_12__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING||LA19_0==43||LA19_0==48||LA19_0==50||LA19_0==52||LA19_0==56||LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPactDSL.g:1715:4: rule__Model__Group_12__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Model__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // InternalPactDSL.g:1724:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1728:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalPactDSL.g:1729:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // InternalPactDSL.g:1736:1: rule__Model__Group__13__Impl : ( ( 'StateAfterObligationsDischarged:' )? ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1740:1: ( ( ( 'StateAfterObligationsDischarged:' )? ) )
            // InternalPactDSL.g:1741:1: ( ( 'StateAfterObligationsDischarged:' )? )
            {
            // InternalPactDSL.g:1741:1: ( ( 'StateAfterObligationsDischarged:' )? )
            // InternalPactDSL.g:1742:2: ( 'StateAfterObligationsDischarged:' )?
            {
             before(grammarAccess.getModelAccess().getStateAfterObligationsDischargedKeyword_13()); 
            // InternalPactDSL.g:1743:2: ( 'StateAfterObligationsDischarged:' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPactDSL.g:1743:3: 'StateAfterObligationsDischarged:'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateAfterObligationsDischargedKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Model__Group__14"
    // InternalPactDSL.g:1751:1: rule__Model__Group__14 : rule__Model__Group__14__Impl rule__Model__Group__15 ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1755:1: ( rule__Model__Group__14__Impl rule__Model__Group__15 )
            // InternalPactDSL.g:1756:2: rule__Model__Group__14__Impl rule__Model__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14"


    // $ANTLR start "rule__Model__Group__14__Impl"
    // InternalPactDSL.g:1763:1: rule__Model__Group__14__Impl : ( ( rule__Model__Group_14__0 )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1767:1: ( ( ( rule__Model__Group_14__0 )* ) )
            // InternalPactDSL.g:1768:1: ( ( rule__Model__Group_14__0 )* )
            {
            // InternalPactDSL.g:1768:1: ( ( rule__Model__Group_14__0 )* )
            // InternalPactDSL.g:1769:2: ( rule__Model__Group_14__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_14()); 
            // InternalPactDSL.g:1770:2: ( rule__Model__Group_14__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPactDSL.g:1770:3: rule__Model__Group_14__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14__Impl"


    // $ANTLR start "rule__Model__Group__15"
    // InternalPactDSL.g:1778:1: rule__Model__Group__15 : rule__Model__Group__15__Impl rule__Model__Group__16 ;
    public final void rule__Model__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1782:1: ( rule__Model__Group__15__Impl rule__Model__Group__16 )
            // InternalPactDSL.g:1783:2: rule__Model__Group__15__Impl rule__Model__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15"


    // $ANTLR start "rule__Model__Group__15__Impl"
    // InternalPactDSL.g:1790:1: rule__Model__Group__15__Impl : ( 'Termination:' ) ;
    public final void rule__Model__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1794:1: ( ( 'Termination:' ) )
            // InternalPactDSL.g:1795:1: ( 'Termination:' )
            {
            // InternalPactDSL.g:1795:1: ( 'Termination:' )
            // InternalPactDSL.g:1796:2: 'Termination:'
            {
             before(grammarAccess.getModelAccess().getTerminationKeyword_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getTerminationKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15__Impl"


    // $ANTLR start "rule__Model__Group__16"
    // InternalPactDSL.g:1805:1: rule__Model__Group__16 : rule__Model__Group__16__Impl rule__Model__Group__17 ;
    public final void rule__Model__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1809:1: ( rule__Model__Group__16__Impl rule__Model__Group__17 )
            // InternalPactDSL.g:1810:2: rule__Model__Group__16__Impl rule__Model__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16"


    // $ANTLR start "rule__Model__Group__16__Impl"
    // InternalPactDSL.g:1817:1: rule__Model__Group__16__Impl : ( ( rule__Model__Group_16__0 )* ) ;
    public final void rule__Model__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1821:1: ( ( ( rule__Model__Group_16__0 )* ) )
            // InternalPactDSL.g:1822:1: ( ( rule__Model__Group_16__0 )* )
            {
            // InternalPactDSL.g:1822:1: ( ( rule__Model__Group_16__0 )* )
            // InternalPactDSL.g:1823:2: ( rule__Model__Group_16__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_16()); 
            // InternalPactDSL.g:1824:2: ( rule__Model__Group_16__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23||LA22_0==62||(LA22_0>=65 && LA22_0<=66)||LA22_0==68) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPactDSL.g:1824:3: rule__Model__Group_16__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Model__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16__Impl"


    // $ANTLR start "rule__Model__Group__17"
    // InternalPactDSL.g:1832:1: rule__Model__Group__17 : rule__Model__Group__17__Impl rule__Model__Group__18 ;
    public final void rule__Model__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1836:1: ( rule__Model__Group__17__Impl rule__Model__Group__18 )
            // InternalPactDSL.g:1837:2: rule__Model__Group__17__Impl rule__Model__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17"


    // $ANTLR start "rule__Model__Group__17__Impl"
    // InternalPactDSL.g:1844:1: rule__Model__Group__17__Impl : ( ( 'StateAfterTermination:' )? ) ;
    public final void rule__Model__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1848:1: ( ( ( 'StateAfterTermination:' )? ) )
            // InternalPactDSL.g:1849:1: ( ( 'StateAfterTermination:' )? )
            {
            // InternalPactDSL.g:1849:1: ( ( 'StateAfterTermination:' )? )
            // InternalPactDSL.g:1850:2: ( 'StateAfterTermination:' )?
            {
             before(grammarAccess.getModelAccess().getStateAfterTerminationKeyword_17()); 
            // InternalPactDSL.g:1851:2: ( 'StateAfterTermination:' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPactDSL.g:1851:3: 'StateAfterTermination:'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateAfterTerminationKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17__Impl"


    // $ANTLR start "rule__Model__Group__18"
    // InternalPactDSL.g:1859:1: rule__Model__Group__18 : rule__Model__Group__18__Impl rule__Model__Group__19 ;
    public final void rule__Model__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1863:1: ( rule__Model__Group__18__Impl rule__Model__Group__19 )
            // InternalPactDSL.g:1864:2: rule__Model__Group__18__Impl rule__Model__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18"


    // $ANTLR start "rule__Model__Group__18__Impl"
    // InternalPactDSL.g:1871:1: rule__Model__Group__18__Impl : ( ( rule__Model__Group_18__0 )* ) ;
    public final void rule__Model__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1875:1: ( ( ( rule__Model__Group_18__0 )* ) )
            // InternalPactDSL.g:1876:1: ( ( rule__Model__Group_18__0 )* )
            {
            // InternalPactDSL.g:1876:1: ( ( rule__Model__Group_18__0 )* )
            // InternalPactDSL.g:1877:2: ( rule__Model__Group_18__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_18()); 
            // InternalPactDSL.g:1878:2: ( rule__Model__Group_18__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPactDSL.g:1878:3: rule__Model__Group_18__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18__Impl"


    // $ANTLR start "rule__Model__Group__19"
    // InternalPactDSL.g:1886:1: rule__Model__Group__19 : rule__Model__Group__19__Impl rule__Model__Group__20 ;
    public final void rule__Model__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1890:1: ( rule__Model__Group__19__Impl rule__Model__Group__20 )
            // InternalPactDSL.g:1891:2: rule__Model__Group__19__Impl rule__Model__Group__20
            {
            pushFollow(FOLLOW_17);
            rule__Model__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19"


    // $ANTLR start "rule__Model__Group__19__Impl"
    // InternalPactDSL.g:1898:1: rule__Model__Group__19__Impl : ( 'Boilerplate:' ) ;
    public final void rule__Model__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1902:1: ( ( 'Boilerplate:' ) )
            // InternalPactDSL.g:1903:1: ( 'Boilerplate:' )
            {
            // InternalPactDSL.g:1903:1: ( 'Boilerplate:' )
            // InternalPactDSL.g:1904:2: 'Boilerplate:'
            {
             before(grammarAccess.getModelAccess().getBoilerplateKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBoilerplateKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19__Impl"


    // $ANTLR start "rule__Model__Group__20"
    // InternalPactDSL.g:1913:1: rule__Model__Group__20 : rule__Model__Group__20__Impl ;
    public final void rule__Model__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1917:1: ( rule__Model__Group__20__Impl )
            // InternalPactDSL.g:1918:2: rule__Model__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20"


    // $ANTLR start "rule__Model__Group__20__Impl"
    // InternalPactDSL.g:1924:1: rule__Model__Group__20__Impl : ( ( rule__Model__Group_20__0 )* ) ;
    public final void rule__Model__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1928:1: ( ( ( rule__Model__Group_20__0 )* ) )
            // InternalPactDSL.g:1929:1: ( ( rule__Model__Group_20__0 )* )
            {
            // InternalPactDSL.g:1929:1: ( ( rule__Model__Group_20__0 )* )
            // InternalPactDSL.g:1930:2: ( rule__Model__Group_20__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_20()); 
            // InternalPactDSL.g:1931:2: ( rule__Model__Group_20__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=70 && LA25_0<=72)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPactDSL.g:1931:3: rule__Model__Group_20__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Model__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalPactDSL.g:1940:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1944:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalPactDSL.g:1945:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalPactDSL.g:1952:1: rule__Model__Group_4__0__Impl : ( ( rule__Model__EntityTypesAssignment_4_0 ) ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1956:1: ( ( ( rule__Model__EntityTypesAssignment_4_0 ) ) )
            // InternalPactDSL.g:1957:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            {
            // InternalPactDSL.g:1957:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            // InternalPactDSL.g:1958:2: ( rule__Model__EntityTypesAssignment_4_0 )
            {
             before(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 
            // InternalPactDSL.g:1959:2: ( rule__Model__EntityTypesAssignment_4_0 )
            // InternalPactDSL.g:1959:3: rule__Model__EntityTypesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__EntityTypesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalPactDSL.g:1967:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1971:1: ( rule__Model__Group_4__1__Impl )
            // InternalPactDSL.g:1972:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalPactDSL.g:1978:1: rule__Model__Group_4__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1982:1: ( ( '.' ) )
            // InternalPactDSL.g:1983:1: ( '.' )
            {
            // InternalPactDSL.g:1983:1: ( '.' )
            // InternalPactDSL.g:1984:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_6__0"
    // InternalPactDSL.g:1994:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1998:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // InternalPactDSL.g:1999:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // InternalPactDSL.g:2006:1: rule__Model__Group_6__0__Impl : ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2010:1: ( ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) )
            // InternalPactDSL.g:2011:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            {
            // InternalPactDSL.g:2011:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            // InternalPactDSL.g:2012:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            {
             before(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 
            // InternalPactDSL.g:2013:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            // InternalPactDSL.g:2013:3: rule__Model__FormalityTypesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__FormalityTypesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // InternalPactDSL.g:2021:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2025:1: ( rule__Model__Group_6__1__Impl )
            // InternalPactDSL.g:2026:2: rule__Model__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // InternalPactDSL.g:2032:1: rule__Model__Group_6__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2036:1: ( ( '.' ) )
            // InternalPactDSL.g:2037:1: ( '.' )
            {
            // InternalPactDSL.g:2037:1: ( '.' )
            // InternalPactDSL.g:2038:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group_8__0"
    // InternalPactDSL.g:2048:1: rule__Model__Group_8__0 : rule__Model__Group_8__0__Impl rule__Model__Group_8__1 ;
    public final void rule__Model__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2052:1: ( rule__Model__Group_8__0__Impl rule__Model__Group_8__1 )
            // InternalPactDSL.g:2053:2: rule__Model__Group_8__0__Impl rule__Model__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0"


    // $ANTLR start "rule__Model__Group_8__0__Impl"
    // InternalPactDSL.g:2060:1: rule__Model__Group_8__0__Impl : ( ( rule__Model__ActionTypesAssignment_8_0 ) ) ;
    public final void rule__Model__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2064:1: ( ( ( rule__Model__ActionTypesAssignment_8_0 ) ) )
            // InternalPactDSL.g:2065:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            {
            // InternalPactDSL.g:2065:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            // InternalPactDSL.g:2066:2: ( rule__Model__ActionTypesAssignment_8_0 )
            {
             before(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 
            // InternalPactDSL.g:2067:2: ( rule__Model__ActionTypesAssignment_8_0 )
            // InternalPactDSL.g:2067:3: rule__Model__ActionTypesAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ActionTypesAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0__Impl"


    // $ANTLR start "rule__Model__Group_8__1"
    // InternalPactDSL.g:2075:1: rule__Model__Group_8__1 : rule__Model__Group_8__1__Impl ;
    public final void rule__Model__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2079:1: ( rule__Model__Group_8__1__Impl )
            // InternalPactDSL.g:2080:2: rule__Model__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1"


    // $ANTLR start "rule__Model__Group_8__1__Impl"
    // InternalPactDSL.g:2086:1: rule__Model__Group_8__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2090:1: ( ( '.' ) )
            // InternalPactDSL.g:2091:1: ( '.' )
            {
            // InternalPactDSL.g:2091:1: ( '.' )
            // InternalPactDSL.g:2092:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1__Impl"


    // $ANTLR start "rule__Model__Group_10__0"
    // InternalPactDSL.g:2102:1: rule__Model__Group_10__0 : rule__Model__Group_10__0__Impl rule__Model__Group_10__1 ;
    public final void rule__Model__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2106:1: ( rule__Model__Group_10__0__Impl rule__Model__Group_10__1 )
            // InternalPactDSL.g:2107:2: rule__Model__Group_10__0__Impl rule__Model__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__0"


    // $ANTLR start "rule__Model__Group_10__0__Impl"
    // InternalPactDSL.g:2114:1: rule__Model__Group_10__0__Impl : ( ( rule__Model__StateTypesAssignment_10_0 ) ) ;
    public final void rule__Model__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2118:1: ( ( ( rule__Model__StateTypesAssignment_10_0 ) ) )
            // InternalPactDSL.g:2119:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            {
            // InternalPactDSL.g:2119:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            // InternalPactDSL.g:2120:2: ( rule__Model__StateTypesAssignment_10_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 
            // InternalPactDSL.g:2121:2: ( rule__Model__StateTypesAssignment_10_0 )
            // InternalPactDSL.g:2121:3: rule__Model__StateTypesAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__0__Impl"


    // $ANTLR start "rule__Model__Group_10__1"
    // InternalPactDSL.g:2129:1: rule__Model__Group_10__1 : rule__Model__Group_10__1__Impl ;
    public final void rule__Model__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2133:1: ( rule__Model__Group_10__1__Impl )
            // InternalPactDSL.g:2134:2: rule__Model__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__1"


    // $ANTLR start "rule__Model__Group_10__1__Impl"
    // InternalPactDSL.g:2140:1: rule__Model__Group_10__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2144:1: ( ( '.' ) )
            // InternalPactDSL.g:2145:1: ( '.' )
            {
            // InternalPactDSL.g:2145:1: ( '.' )
            // InternalPactDSL.g:2146:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__1__Impl"


    // $ANTLR start "rule__Model__Group_12__0"
    // InternalPactDSL.g:2156:1: rule__Model__Group_12__0 : rule__Model__Group_12__0__Impl rule__Model__Group_12__1 ;
    public final void rule__Model__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2160:1: ( rule__Model__Group_12__0__Impl rule__Model__Group_12__1 )
            // InternalPactDSL.g:2161:2: rule__Model__Group_12__0__Impl rule__Model__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__0"


    // $ANTLR start "rule__Model__Group_12__0__Impl"
    // InternalPactDSL.g:2168:1: rule__Model__Group_12__0__Impl : ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) ;
    public final void rule__Model__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2172:1: ( ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) )
            // InternalPactDSL.g:2173:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            {
            // InternalPactDSL.g:2173:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            // InternalPactDSL.g:2174:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 
            // InternalPactDSL.g:2175:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            // InternalPactDSL.g:2175:3: rule__Model__PrimaryObligationTypesAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__PrimaryObligationTypesAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__0__Impl"


    // $ANTLR start "rule__Model__Group_12__1"
    // InternalPactDSL.g:2183:1: rule__Model__Group_12__1 : rule__Model__Group_12__1__Impl ;
    public final void rule__Model__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2187:1: ( rule__Model__Group_12__1__Impl )
            // InternalPactDSL.g:2188:2: rule__Model__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__1"


    // $ANTLR start "rule__Model__Group_12__1__Impl"
    // InternalPactDSL.g:2194:1: rule__Model__Group_12__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2198:1: ( ( '.' ) )
            // InternalPactDSL.g:2199:1: ( '.' )
            {
            // InternalPactDSL.g:2199:1: ( '.' )
            // InternalPactDSL.g:2200:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__1__Impl"


    // $ANTLR start "rule__Model__Group_14__0"
    // InternalPactDSL.g:2210:1: rule__Model__Group_14__0 : rule__Model__Group_14__0__Impl rule__Model__Group_14__1 ;
    public final void rule__Model__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2214:1: ( rule__Model__Group_14__0__Impl rule__Model__Group_14__1 )
            // InternalPactDSL.g:2215:2: rule__Model__Group_14__0__Impl rule__Model__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__0"


    // $ANTLR start "rule__Model__Group_14__0__Impl"
    // InternalPactDSL.g:2222:1: rule__Model__Group_14__0__Impl : ( ( rule__Model__StateTypesAssignment_14_0 ) ) ;
    public final void rule__Model__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2226:1: ( ( ( rule__Model__StateTypesAssignment_14_0 ) ) )
            // InternalPactDSL.g:2227:1: ( ( rule__Model__StateTypesAssignment_14_0 ) )
            {
            // InternalPactDSL.g:2227:1: ( ( rule__Model__StateTypesAssignment_14_0 ) )
            // InternalPactDSL.g:2228:2: ( rule__Model__StateTypesAssignment_14_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_14_0()); 
            // InternalPactDSL.g:2229:2: ( rule__Model__StateTypesAssignment_14_0 )
            // InternalPactDSL.g:2229:3: rule__Model__StateTypesAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__0__Impl"


    // $ANTLR start "rule__Model__Group_14__1"
    // InternalPactDSL.g:2237:1: rule__Model__Group_14__1 : rule__Model__Group_14__1__Impl ;
    public final void rule__Model__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2241:1: ( rule__Model__Group_14__1__Impl )
            // InternalPactDSL.g:2242:2: rule__Model__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__1"


    // $ANTLR start "rule__Model__Group_14__1__Impl"
    // InternalPactDSL.g:2248:1: rule__Model__Group_14__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2252:1: ( ( '.' ) )
            // InternalPactDSL.g:2253:1: ( '.' )
            {
            // InternalPactDSL.g:2253:1: ( '.' )
            // InternalPactDSL.g:2254:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__1__Impl"


    // $ANTLR start "rule__Model__Group_16__0"
    // InternalPactDSL.g:2264:1: rule__Model__Group_16__0 : rule__Model__Group_16__0__Impl rule__Model__Group_16__1 ;
    public final void rule__Model__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2268:1: ( rule__Model__Group_16__0__Impl rule__Model__Group_16__1 )
            // InternalPactDSL.g:2269:2: rule__Model__Group_16__0__Impl rule__Model__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__0"


    // $ANTLR start "rule__Model__Group_16__0__Impl"
    // InternalPactDSL.g:2276:1: rule__Model__Group_16__0__Impl : ( ( rule__Model__TerminationTypesAssignment_16_0 ) ) ;
    public final void rule__Model__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2280:1: ( ( ( rule__Model__TerminationTypesAssignment_16_0 ) ) )
            // InternalPactDSL.g:2281:1: ( ( rule__Model__TerminationTypesAssignment_16_0 ) )
            {
            // InternalPactDSL.g:2281:1: ( ( rule__Model__TerminationTypesAssignment_16_0 ) )
            // InternalPactDSL.g:2282:2: ( rule__Model__TerminationTypesAssignment_16_0 )
            {
             before(grammarAccess.getModelAccess().getTerminationTypesAssignment_16_0()); 
            // InternalPactDSL.g:2283:2: ( rule__Model__TerminationTypesAssignment_16_0 )
            // InternalPactDSL.g:2283:3: rule__Model__TerminationTypesAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__TerminationTypesAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTerminationTypesAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__0__Impl"


    // $ANTLR start "rule__Model__Group_16__1"
    // InternalPactDSL.g:2291:1: rule__Model__Group_16__1 : rule__Model__Group_16__1__Impl ;
    public final void rule__Model__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2295:1: ( rule__Model__Group_16__1__Impl )
            // InternalPactDSL.g:2296:2: rule__Model__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__1"


    // $ANTLR start "rule__Model__Group_16__1__Impl"
    // InternalPactDSL.g:2302:1: rule__Model__Group_16__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2306:1: ( ( '.' ) )
            // InternalPactDSL.g:2307:1: ( '.' )
            {
            // InternalPactDSL.g:2307:1: ( '.' )
            // InternalPactDSL.g:2308:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__1__Impl"


    // $ANTLR start "rule__Model__Group_18__0"
    // InternalPactDSL.g:2318:1: rule__Model__Group_18__0 : rule__Model__Group_18__0__Impl rule__Model__Group_18__1 ;
    public final void rule__Model__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2322:1: ( rule__Model__Group_18__0__Impl rule__Model__Group_18__1 )
            // InternalPactDSL.g:2323:2: rule__Model__Group_18__0__Impl rule__Model__Group_18__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__0"


    // $ANTLR start "rule__Model__Group_18__0__Impl"
    // InternalPactDSL.g:2330:1: rule__Model__Group_18__0__Impl : ( ( rule__Model__StateTypesAssignment_18_0 ) ) ;
    public final void rule__Model__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2334:1: ( ( ( rule__Model__StateTypesAssignment_18_0 ) ) )
            // InternalPactDSL.g:2335:1: ( ( rule__Model__StateTypesAssignment_18_0 ) )
            {
            // InternalPactDSL.g:2335:1: ( ( rule__Model__StateTypesAssignment_18_0 ) )
            // InternalPactDSL.g:2336:2: ( rule__Model__StateTypesAssignment_18_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_18_0()); 
            // InternalPactDSL.g:2337:2: ( rule__Model__StateTypesAssignment_18_0 )
            // InternalPactDSL.g:2337:3: rule__Model__StateTypesAssignment_18_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_18_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__0__Impl"


    // $ANTLR start "rule__Model__Group_18__1"
    // InternalPactDSL.g:2345:1: rule__Model__Group_18__1 : rule__Model__Group_18__1__Impl ;
    public final void rule__Model__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2349:1: ( rule__Model__Group_18__1__Impl )
            // InternalPactDSL.g:2350:2: rule__Model__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__1"


    // $ANTLR start "rule__Model__Group_18__1__Impl"
    // InternalPactDSL.g:2356:1: rule__Model__Group_18__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2360:1: ( ( '.' ) )
            // InternalPactDSL.g:2361:1: ( '.' )
            {
            // InternalPactDSL.g:2361:1: ( '.' )
            // InternalPactDSL.g:2362:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__1__Impl"


    // $ANTLR start "rule__Model__Group_20__0"
    // InternalPactDSL.g:2372:1: rule__Model__Group_20__0 : rule__Model__Group_20__0__Impl rule__Model__Group_20__1 ;
    public final void rule__Model__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2376:1: ( rule__Model__Group_20__0__Impl rule__Model__Group_20__1 )
            // InternalPactDSL.g:2377:2: rule__Model__Group_20__0__Impl rule__Model__Group_20__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__0"


    // $ANTLR start "rule__Model__Group_20__0__Impl"
    // InternalPactDSL.g:2384:1: rule__Model__Group_20__0__Impl : ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) ) ;
    public final void rule__Model__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2388:1: ( ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) ) )
            // InternalPactDSL.g:2389:1: ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) )
            {
            // InternalPactDSL.g:2389:1: ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) )
            // InternalPactDSL.g:2390:2: ( rule__Model__BoilerplateTypesAssignment_20_0 )
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_20_0()); 
            // InternalPactDSL.g:2391:2: ( rule__Model__BoilerplateTypesAssignment_20_0 )
            // InternalPactDSL.g:2391:3: rule__Model__BoilerplateTypesAssignment_20_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__BoilerplateTypesAssignment_20_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__0__Impl"


    // $ANTLR start "rule__Model__Group_20__1"
    // InternalPactDSL.g:2399:1: rule__Model__Group_20__1 : rule__Model__Group_20__1__Impl ;
    public final void rule__Model__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2403:1: ( rule__Model__Group_20__1__Impl )
            // InternalPactDSL.g:2404:2: rule__Model__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__1"


    // $ANTLR start "rule__Model__Group_20__1__Impl"
    // InternalPactDSL.g:2410:1: rule__Model__Group_20__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2414:1: ( ( '.' ) )
            // InternalPactDSL.g:2415:1: ( '.' )
            {
            // InternalPactDSL.g:2415:1: ( '.' )
            // InternalPactDSL.g:2416:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group__0"
    // InternalPactDSL.g:2426:1: rule__EffectiveDate__Group__0 : rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 ;
    public final void rule__EffectiveDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2430:1: ( rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 )
            // InternalPactDSL.g:2431:2: rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EffectiveDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__0"


    // $ANTLR start "rule__EffectiveDate__Group__0__Impl"
    // InternalPactDSL.g:2438:1: rule__EffectiveDate__Group__0__Impl : ( 'EffectiveDate:' ) ;
    public final void rule__EffectiveDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2442:1: ( ( 'EffectiveDate:' ) )
            // InternalPactDSL.g:2443:1: ( 'EffectiveDate:' )
            {
            // InternalPactDSL.g:2443:1: ( 'EffectiveDate:' )
            // InternalPactDSL.g:2444:2: 'EffectiveDate:'
            {
             before(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__0__Impl"


    // $ANTLR start "rule__EffectiveDate__Group__1"
    // InternalPactDSL.g:2453:1: rule__EffectiveDate__Group__1 : rule__EffectiveDate__Group__1__Impl ;
    public final void rule__EffectiveDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2457:1: ( rule__EffectiveDate__Group__1__Impl )
            // InternalPactDSL.g:2458:2: rule__EffectiveDate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__1"


    // $ANTLR start "rule__EffectiveDate__Group__1__Impl"
    // InternalPactDSL.g:2464:1: rule__EffectiveDate__Group__1__Impl : ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) ;
    public final void rule__EffectiveDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2468:1: ( ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) )
            // InternalPactDSL.g:2469:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            {
            // InternalPactDSL.g:2469:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            // InternalPactDSL.g:2470:2: ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* )
            {
            // InternalPactDSL.g:2470:2: ( ( rule__EffectiveDate__Group_1__0 ) )
            // InternalPactDSL.g:2471:3: ( rule__EffectiveDate__Group_1__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2472:3: ( rule__EffectiveDate__Group_1__0 )
            // InternalPactDSL.g:2472:4: rule__EffectiveDate__Group_1__0
            {
            pushFollow(FOLLOW_20);
            rule__EffectiveDate__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

            }

            // InternalPactDSL.g:2475:2: ( ( rule__EffectiveDate__Group_1__0 )* )
            // InternalPactDSL.g:2476:3: ( rule__EffectiveDate__Group_1__0 )*
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2477:3: ( rule__EffectiveDate__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_INT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPactDSL.g:2477:4: rule__EffectiveDate__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EffectiveDate__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__0"
    // InternalPactDSL.g:2487:1: rule__EffectiveDate__Group_1__0 : rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 ;
    public final void rule__EffectiveDate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2491:1: ( rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 )
            // InternalPactDSL.g:2492:2: rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__EffectiveDate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__0"


    // $ANTLR start "rule__EffectiveDate__Group_1__0__Impl"
    // InternalPactDSL.g:2499:1: rule__EffectiveDate__Group_1__0__Impl : ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) ;
    public final void rule__EffectiveDate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2503:1: ( ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) )
            // InternalPactDSL.g:2504:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            {
            // InternalPactDSL.g:2504:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            // InternalPactDSL.g:2505:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 
            // InternalPactDSL.g:2506:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            // InternalPactDSL.g:2506:3: rule__EffectiveDate__DayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__DayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__0__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__1"
    // InternalPactDSL.g:2514:1: rule__EffectiveDate__Group_1__1 : rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 ;
    public final void rule__EffectiveDate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2518:1: ( rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 )
            // InternalPactDSL.g:2519:2: rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__EffectiveDate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__1"


    // $ANTLR start "rule__EffectiveDate__Group_1__1__Impl"
    // InternalPactDSL.g:2526:1: rule__EffectiveDate__Group_1__1__Impl : ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) ;
    public final void rule__EffectiveDate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2530:1: ( ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) )
            // InternalPactDSL.g:2531:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            {
            // InternalPactDSL.g:2531:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            // InternalPactDSL.g:2532:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 
            // InternalPactDSL.g:2533:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            // InternalPactDSL.g:2533:3: rule__EffectiveDate__MonthAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__MonthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__2"
    // InternalPactDSL.g:2541:1: rule__EffectiveDate__Group_1__2 : rule__EffectiveDate__Group_1__2__Impl ;
    public final void rule__EffectiveDate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2545:1: ( rule__EffectiveDate__Group_1__2__Impl )
            // InternalPactDSL.g:2546:2: rule__EffectiveDate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__2"


    // $ANTLR start "rule__EffectiveDate__Group_1__2__Impl"
    // InternalPactDSL.g:2552:1: rule__EffectiveDate__Group_1__2__Impl : ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) ;
    public final void rule__EffectiveDate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2556:1: ( ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) )
            // InternalPactDSL.g:2557:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            {
            // InternalPactDSL.g:2557:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            // InternalPactDSL.g:2558:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            {
             before(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 
            // InternalPactDSL.g:2559:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            // InternalPactDSL.g:2559:3: rule__EffectiveDate__YearAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__YearAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__2__Impl"


    // $ANTLR start "rule__Party__Group__0"
    // InternalPactDSL.g:2568:1: rule__Party__Group__0 : rule__Party__Group__0__Impl rule__Party__Group__1 ;
    public final void rule__Party__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2572:1: ( rule__Party__Group__0__Impl rule__Party__Group__1 )
            // InternalPactDSL.g:2573:2: rule__Party__Group__0__Impl rule__Party__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Party__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0"


    // $ANTLR start "rule__Party__Group__0__Impl"
    // InternalPactDSL.g:2580:1: rule__Party__Group__0__Impl : ( 'Party:' ) ;
    public final void rule__Party__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2584:1: ( ( 'Party:' ) )
            // InternalPactDSL.g:2585:1: ( 'Party:' )
            {
            // InternalPactDSL.g:2585:1: ( 'Party:' )
            // InternalPactDSL.g:2586:2: 'Party:'
            {
             before(grammarAccess.getPartyAccess().getPartyKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0__Impl"


    // $ANTLR start "rule__Party__Group__1"
    // InternalPactDSL.g:2595:1: rule__Party__Group__1 : rule__Party__Group__1__Impl rule__Party__Group__2 ;
    public final void rule__Party__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2599:1: ( rule__Party__Group__1__Impl rule__Party__Group__2 )
            // InternalPactDSL.g:2600:2: rule__Party__Group__1__Impl rule__Party__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Party__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1"


    // $ANTLR start "rule__Party__Group__1__Impl"
    // InternalPactDSL.g:2607:1: rule__Party__Group__1__Impl : ( ( rule__Party__NameAssignment_1 ) ) ;
    public final void rule__Party__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2611:1: ( ( ( rule__Party__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2612:1: ( ( rule__Party__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2612:1: ( ( rule__Party__NameAssignment_1 ) )
            // InternalPactDSL.g:2613:2: ( rule__Party__NameAssignment_1 )
            {
             before(grammarAccess.getPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2614:2: ( rule__Party__NameAssignment_1 )
            // InternalPactDSL.g:2614:3: rule__Party__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Party__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1__Impl"


    // $ANTLR start "rule__Party__Group__2"
    // InternalPactDSL.g:2622:1: rule__Party__Group__2 : rule__Party__Group__2__Impl rule__Party__Group__3 ;
    public final void rule__Party__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2626:1: ( rule__Party__Group__2__Impl rule__Party__Group__3 )
            // InternalPactDSL.g:2627:2: rule__Party__Group__2__Impl rule__Party__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Party__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2"


    // $ANTLR start "rule__Party__Group__2__Impl"
    // InternalPactDSL.g:2634:1: rule__Party__Group__2__Impl : ( ( rule__Party__FullnameAssignment_2 ) ) ;
    public final void rule__Party__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2638:1: ( ( ( rule__Party__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:2639:1: ( ( rule__Party__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:2639:1: ( ( rule__Party__FullnameAssignment_2 ) )
            // InternalPactDSL.g:2640:2: ( rule__Party__FullnameAssignment_2 )
            {
             before(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:2641:2: ( rule__Party__FullnameAssignment_2 )
            // InternalPactDSL.g:2641:3: rule__Party__FullnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Party__FullnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2__Impl"


    // $ANTLR start "rule__Party__Group__3"
    // InternalPactDSL.g:2649:1: rule__Party__Group__3 : rule__Party__Group__3__Impl ;
    public final void rule__Party__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2653:1: ( rule__Party__Group__3__Impl )
            // InternalPactDSL.g:2654:2: rule__Party__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Party__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3"


    // $ANTLR start "rule__Party__Group__3__Impl"
    // InternalPactDSL.g:2660:1: rule__Party__Group__3__Impl : ( ( rule__Party__FeatureAssignment_3 )* ) ;
    public final void rule__Party__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2664:1: ( ( ( rule__Party__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:2665:1: ( ( rule__Party__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:2665:1: ( ( rule__Party__FeatureAssignment_3 )* )
            // InternalPactDSL.g:2666:2: ( rule__Party__FeatureAssignment_3 )*
            {
             before(grammarAccess.getPartyAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:2667:2: ( rule__Party__FeatureAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=30 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPactDSL.g:2667:3: rule__Party__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Party__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPartyAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3__Impl"


    // $ANTLR start "rule__ThirdParty__Group__0"
    // InternalPactDSL.g:2676:1: rule__ThirdParty__Group__0 : rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 ;
    public final void rule__ThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2680:1: ( rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 )
            // InternalPactDSL.g:2681:2: rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__0"


    // $ANTLR start "rule__ThirdParty__Group__0__Impl"
    // InternalPactDSL.g:2688:1: rule__ThirdParty__Group__0__Impl : ( 'ThirdParty:' ) ;
    public final void rule__ThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2692:1: ( ( 'ThirdParty:' ) )
            // InternalPactDSL.g:2693:1: ( 'ThirdParty:' )
            {
            // InternalPactDSL.g:2693:1: ( 'ThirdParty:' )
            // InternalPactDSL.g:2694:2: 'ThirdParty:'
            {
             before(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__0__Impl"


    // $ANTLR start "rule__ThirdParty__Group__1"
    // InternalPactDSL.g:2703:1: rule__ThirdParty__Group__1 : rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 ;
    public final void rule__ThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2707:1: ( rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 )
            // InternalPactDSL.g:2708:2: rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__1"


    // $ANTLR start "rule__ThirdParty__Group__1__Impl"
    // InternalPactDSL.g:2715:1: rule__ThirdParty__Group__1__Impl : ( ( rule__ThirdParty__NameAssignment_1 ) ) ;
    public final void rule__ThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2719:1: ( ( ( rule__ThirdParty__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2720:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2720:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            // InternalPactDSL.g:2721:2: ( rule__ThirdParty__NameAssignment_1 )
            {
             before(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2722:2: ( rule__ThirdParty__NameAssignment_1 )
            // InternalPactDSL.g:2722:3: rule__ThirdParty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__1__Impl"


    // $ANTLR start "rule__ThirdParty__Group__2"
    // InternalPactDSL.g:2730:1: rule__ThirdParty__Group__2 : rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 ;
    public final void rule__ThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2734:1: ( rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 )
            // InternalPactDSL.g:2735:2: rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__2"


    // $ANTLR start "rule__ThirdParty__Group__2__Impl"
    // InternalPactDSL.g:2742:1: rule__ThirdParty__Group__2__Impl : ( ( rule__ThirdParty__FullnameAssignment_2 ) ) ;
    public final void rule__ThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2746:1: ( ( ( rule__ThirdParty__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:2747:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:2747:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            // InternalPactDSL.g:2748:2: ( rule__ThirdParty__FullnameAssignment_2 )
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:2749:2: ( rule__ThirdParty__FullnameAssignment_2 )
            // InternalPactDSL.g:2749:3: rule__ThirdParty__FullnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__FullnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__2__Impl"


    // $ANTLR start "rule__ThirdParty__Group__3"
    // InternalPactDSL.g:2757:1: rule__ThirdParty__Group__3 : rule__ThirdParty__Group__3__Impl ;
    public final void rule__ThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2761:1: ( rule__ThirdParty__Group__3__Impl )
            // InternalPactDSL.g:2762:2: rule__ThirdParty__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__3"


    // $ANTLR start "rule__ThirdParty__Group__3__Impl"
    // InternalPactDSL.g:2768:1: rule__ThirdParty__Group__3__Impl : ( ( rule__ThirdParty__FeatureAssignment_3 )* ) ;
    public final void rule__ThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2772:1: ( ( ( rule__ThirdParty__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:2773:1: ( ( rule__ThirdParty__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:2773:1: ( ( rule__ThirdParty__FeatureAssignment_3 )* )
            // InternalPactDSL.g:2774:2: ( rule__ThirdParty__FeatureAssignment_3 )*
            {
             before(grammarAccess.getThirdPartyAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:2775:2: ( rule__ThirdParty__FeatureAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=30 && LA28_0<=33)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPactDSL.g:2775:3: rule__ThirdParty__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ThirdParty__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getThirdPartyAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__3__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__0"
    // InternalPactDSL.g:2784:1: rule__SubjectMatter__Group__0 : rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 ;
    public final void rule__SubjectMatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2788:1: ( rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 )
            // InternalPactDSL.g:2789:2: rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SubjectMatter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__0"


    // $ANTLR start "rule__SubjectMatter__Group__0__Impl"
    // InternalPactDSL.g:2796:1: rule__SubjectMatter__Group__0__Impl : ( 'SubjectMatter:' ) ;
    public final void rule__SubjectMatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2800:1: ( ( 'SubjectMatter:' ) )
            // InternalPactDSL.g:2801:1: ( 'SubjectMatter:' )
            {
            // InternalPactDSL.g:2801:1: ( 'SubjectMatter:' )
            // InternalPactDSL.g:2802:2: 'SubjectMatter:'
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__0__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__1"
    // InternalPactDSL.g:2811:1: rule__SubjectMatter__Group__1 : rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 ;
    public final void rule__SubjectMatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2815:1: ( rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 )
            // InternalPactDSL.g:2816:2: rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SubjectMatter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__1"


    // $ANTLR start "rule__SubjectMatter__Group__1__Impl"
    // InternalPactDSL.g:2823:1: rule__SubjectMatter__Group__1__Impl : ( ( rule__SubjectMatter__NameAssignment_1 ) ) ;
    public final void rule__SubjectMatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2827:1: ( ( ( rule__SubjectMatter__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2828:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2828:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            // InternalPactDSL.g:2829:2: ( rule__SubjectMatter__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2830:2: ( rule__SubjectMatter__NameAssignment_1 )
            // InternalPactDSL.g:2830:3: rule__SubjectMatter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__1__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__2"
    // InternalPactDSL.g:2838:1: rule__SubjectMatter__Group__2 : rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 ;
    public final void rule__SubjectMatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2842:1: ( rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 )
            // InternalPactDSL.g:2843:2: rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SubjectMatter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__2"


    // $ANTLR start "rule__SubjectMatter__Group__2__Impl"
    // InternalPactDSL.g:2850:1: rule__SubjectMatter__Group__2__Impl : ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) ;
    public final void rule__SubjectMatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2854:1: ( ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) )
            // InternalPactDSL.g:2855:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            {
            // InternalPactDSL.g:2855:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            // InternalPactDSL.g:2856:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 
            // InternalPactDSL.g:2857:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            // InternalPactDSL.g:2857:3: rule__SubjectMatter__SubjectMatterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__SubjectMatterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__2__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__3"
    // InternalPactDSL.g:2865:1: rule__SubjectMatter__Group__3 : rule__SubjectMatter__Group__3__Impl ;
    public final void rule__SubjectMatter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2869:1: ( rule__SubjectMatter__Group__3__Impl )
            // InternalPactDSL.g:2870:2: rule__SubjectMatter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__3"


    // $ANTLR start "rule__SubjectMatter__Group__3__Impl"
    // InternalPactDSL.g:2876:1: rule__SubjectMatter__Group__3__Impl : ( ( rule__SubjectMatter__FeatureAssignment_3 )* ) ;
    public final void rule__SubjectMatter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2880:1: ( ( ( rule__SubjectMatter__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:2881:1: ( ( rule__SubjectMatter__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:2881:1: ( ( rule__SubjectMatter__FeatureAssignment_3 )* )
            // InternalPactDSL.g:2882:2: ( rule__SubjectMatter__FeatureAssignment_3 )*
            {
             before(grammarAccess.getSubjectMatterAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:2883:2: ( rule__SubjectMatter__FeatureAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=30 && LA29_0<=33)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPactDSL.g:2883:3: rule__SubjectMatter__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SubjectMatter__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSubjectMatterAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__3__Impl"


    // $ANTLR start "rule__DefinedTerm__Group__0"
    // InternalPactDSL.g:2892:1: rule__DefinedTerm__Group__0 : rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 ;
    public final void rule__DefinedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2896:1: ( rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 )
            // InternalPactDSL.g:2897:2: rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DefinedTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__0"


    // $ANTLR start "rule__DefinedTerm__Group__0__Impl"
    // InternalPactDSL.g:2904:1: rule__DefinedTerm__Group__0__Impl : ( 'definedAs' ) ;
    public final void rule__DefinedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2908:1: ( ( 'definedAs' ) )
            // InternalPactDSL.g:2909:1: ( 'definedAs' )
            {
            // InternalPactDSL.g:2909:1: ( 'definedAs' )
            // InternalPactDSL.g:2910:2: 'definedAs'
            {
             before(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__0__Impl"


    // $ANTLR start "rule__DefinedTerm__Group__1"
    // InternalPactDSL.g:2919:1: rule__DefinedTerm__Group__1 : rule__DefinedTerm__Group__1__Impl ;
    public final void rule__DefinedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2923:1: ( rule__DefinedTerm__Group__1__Impl )
            // InternalPactDSL.g:2924:2: rule__DefinedTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__1"


    // $ANTLR start "rule__DefinedTerm__Group__1__Impl"
    // InternalPactDSL.g:2930:1: rule__DefinedTerm__Group__1__Impl : ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) ;
    public final void rule__DefinedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2934:1: ( ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:2935:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:2935:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:2936:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:2937:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            // InternalPactDSL.g:2937:3: rule__DefinedTerm__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__1__Impl"


    // $ANTLR start "rule__Address__Group__0"
    // InternalPactDSL.g:2946:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2950:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalPactDSL.g:2951:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0"


    // $ANTLR start "rule__Address__Group__0__Impl"
    // InternalPactDSL.g:2958:1: rule__Address__Group__0__Impl : ( 'withAddress' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2962:1: ( ( 'withAddress' ) )
            // InternalPactDSL.g:2963:1: ( 'withAddress' )
            {
            // InternalPactDSL.g:2963:1: ( 'withAddress' )
            // InternalPactDSL.g:2964:2: 'withAddress'
            {
             before(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0__Impl"


    // $ANTLR start "rule__Address__Group__1"
    // InternalPactDSL.g:2973:1: rule__Address__Group__1 : rule__Address__Group__1__Impl ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2977:1: ( rule__Address__Group__1__Impl )
            // InternalPactDSL.g:2978:2: rule__Address__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1"


    // $ANTLR start "rule__Address__Group__1__Impl"
    // InternalPactDSL.g:2984:1: rule__Address__Group__1__Impl : ( ( rule__Address__DefinitionAssignment_1 ) ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2988:1: ( ( ( rule__Address__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:2989:1: ( ( rule__Address__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:2989:1: ( ( rule__Address__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:2990:2: ( rule__Address__DefinitionAssignment_1 )
            {
             before(grammarAccess.getAddressAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:2991:2: ( rule__Address__DefinitionAssignment_1 )
            // InternalPactDSL.g:2991:3: rule__Address__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1__Impl"


    // $ANTLR start "rule__CompanyNumber__Group__0"
    // InternalPactDSL.g:3000:1: rule__CompanyNumber__Group__0 : rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 ;
    public final void rule__CompanyNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3004:1: ( rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 )
            // InternalPactDSL.g:3005:2: rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompanyNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__0"


    // $ANTLR start "rule__CompanyNumber__Group__0__Impl"
    // InternalPactDSL.g:3012:1: rule__CompanyNumber__Group__0__Impl : ( 'withCompanyNumber' ) ;
    public final void rule__CompanyNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3016:1: ( ( 'withCompanyNumber' ) )
            // InternalPactDSL.g:3017:1: ( 'withCompanyNumber' )
            {
            // InternalPactDSL.g:3017:1: ( 'withCompanyNumber' )
            // InternalPactDSL.g:3018:2: 'withCompanyNumber'
            {
             before(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__0__Impl"


    // $ANTLR start "rule__CompanyNumber__Group__1"
    // InternalPactDSL.g:3027:1: rule__CompanyNumber__Group__1 : rule__CompanyNumber__Group__1__Impl ;
    public final void rule__CompanyNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3031:1: ( rule__CompanyNumber__Group__1__Impl )
            // InternalPactDSL.g:3032:2: rule__CompanyNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__1"


    // $ANTLR start "rule__CompanyNumber__Group__1__Impl"
    // InternalPactDSL.g:3038:1: rule__CompanyNumber__Group__1__Impl : ( ( rule__CompanyNumber__DefinitionAssignment_1 ) ) ;
    public final void rule__CompanyNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3042:1: ( ( ( rule__CompanyNumber__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:3043:1: ( ( rule__CompanyNumber__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:3043:1: ( ( rule__CompanyNumber__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:3044:2: ( rule__CompanyNumber__DefinitionAssignment_1 )
            {
             before(grammarAccess.getCompanyNumberAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:3045:2: ( rule__CompanyNumber__DefinitionAssignment_1 )
            // InternalPactDSL.g:3045:3: rule__CompanyNumber__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyNumberAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__1__Impl"


    // $ANTLR start "rule__CustomFeature__Group__0"
    // InternalPactDSL.g:3054:1: rule__CustomFeature__Group__0 : rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1 ;
    public final void rule__CustomFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3058:1: ( rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1 )
            // InternalPactDSL.g:3059:2: rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__0"


    // $ANTLR start "rule__CustomFeature__Group__0__Impl"
    // InternalPactDSL.g:3066:1: rule__CustomFeature__Group__0__Impl : ( 'withFeature' ) ;
    public final void rule__CustomFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3070:1: ( ( 'withFeature' ) )
            // InternalPactDSL.g:3071:1: ( 'withFeature' )
            {
            // InternalPactDSL.g:3071:1: ( 'withFeature' )
            // InternalPactDSL.g:3072:2: 'withFeature'
            {
             before(grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__0__Impl"


    // $ANTLR start "rule__CustomFeature__Group__1"
    // InternalPactDSL.g:3081:1: rule__CustomFeature__Group__1 : rule__CustomFeature__Group__1__Impl ;
    public final void rule__CustomFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3085:1: ( rule__CustomFeature__Group__1__Impl )
            // InternalPactDSL.g:3086:2: rule__CustomFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__1"


    // $ANTLR start "rule__CustomFeature__Group__1__Impl"
    // InternalPactDSL.g:3092:1: rule__CustomFeature__Group__1__Impl : ( ( rule__CustomFeature__FeatureAssignment_1 ) ) ;
    public final void rule__CustomFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3096:1: ( ( ( rule__CustomFeature__FeatureAssignment_1 ) ) )
            // InternalPactDSL.g:3097:1: ( ( rule__CustomFeature__FeatureAssignment_1 ) )
            {
            // InternalPactDSL.g:3097:1: ( ( rule__CustomFeature__FeatureAssignment_1 ) )
            // InternalPactDSL.g:3098:2: ( rule__CustomFeature__FeatureAssignment_1 )
            {
             before(grammarAccess.getCustomFeatureAccess().getFeatureAssignment_1()); 
            // InternalPactDSL.g:3099:2: ( rule__CustomFeature__FeatureAssignment_1 )
            // InternalPactDSL.g:3099:3: rule__CustomFeature__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomFeature__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomFeatureAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__1__Impl"


    // $ANTLR start "rule__InWriting__Group__0"
    // InternalPactDSL.g:3108:1: rule__InWriting__Group__0 : rule__InWriting__Group__0__Impl rule__InWriting__Group__1 ;
    public final void rule__InWriting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3112:1: ( rule__InWriting__Group__0__Impl rule__InWriting__Group__1 )
            // InternalPactDSL.g:3113:2: rule__InWriting__Group__0__Impl rule__InWriting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InWriting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InWriting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__0"


    // $ANTLR start "rule__InWriting__Group__0__Impl"
    // InternalPactDSL.g:3120:1: rule__InWriting__Group__0__Impl : ( 'inWriting' ) ;
    public final void rule__InWriting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3124:1: ( ( 'inWriting' ) )
            // InternalPactDSL.g:3125:1: ( 'inWriting' )
            {
            // InternalPactDSL.g:3125:1: ( 'inWriting' )
            // InternalPactDSL.g:3126:2: 'inWriting'
            {
             before(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__0__Impl"


    // $ANTLR start "rule__InWriting__Group__1"
    // InternalPactDSL.g:3135:1: rule__InWriting__Group__1 : rule__InWriting__Group__1__Impl ;
    public final void rule__InWriting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3139:1: ( rule__InWriting__Group__1__Impl )
            // InternalPactDSL.g:3140:2: rule__InWriting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__1"


    // $ANTLR start "rule__InWriting__Group__1__Impl"
    // InternalPactDSL.g:3146:1: rule__InWriting__Group__1__Impl : ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) ;
    public final void rule__InWriting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3150:1: ( ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3151:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3151:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            // InternalPactDSL.g:3152:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 
            // InternalPactDSL.g:3153:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            // InternalPactDSL.g:3153:3: rule__InWriting__CustomWritingFormalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__CustomWritingFormalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__1__Impl"


    // $ANTLR start "rule__ByEmail__Group__0"
    // InternalPactDSL.g:3162:1: rule__ByEmail__Group__0 : rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 ;
    public final void rule__ByEmail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3166:1: ( rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 )
            // InternalPactDSL.g:3167:2: rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ByEmail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__0"


    // $ANTLR start "rule__ByEmail__Group__0__Impl"
    // InternalPactDSL.g:3174:1: rule__ByEmail__Group__0__Impl : ( 'byEmail' ) ;
    public final void rule__ByEmail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3178:1: ( ( 'byEmail' ) )
            // InternalPactDSL.g:3179:1: ( 'byEmail' )
            {
            // InternalPactDSL.g:3179:1: ( 'byEmail' )
            // InternalPactDSL.g:3180:2: 'byEmail'
            {
             before(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__0__Impl"


    // $ANTLR start "rule__ByEmail__Group__1"
    // InternalPactDSL.g:3189:1: rule__ByEmail__Group__1 : rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 ;
    public final void rule__ByEmail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3193:1: ( rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 )
            // InternalPactDSL.g:3194:2: rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ByEmail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__1"


    // $ANTLR start "rule__ByEmail__Group__1__Impl"
    // InternalPactDSL.g:3201:1: rule__ByEmail__Group__1__Impl : ( 'to' ) ;
    public final void rule__ByEmail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3205:1: ( ( 'to' ) )
            // InternalPactDSL.g:3206:1: ( 'to' )
            {
            // InternalPactDSL.g:3206:1: ( 'to' )
            // InternalPactDSL.g:3207:2: 'to'
            {
             before(grammarAccess.getByEmailAccess().getToKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__1__Impl"


    // $ANTLR start "rule__ByEmail__Group__2"
    // InternalPactDSL.g:3216:1: rule__ByEmail__Group__2 : rule__ByEmail__Group__2__Impl ;
    public final void rule__ByEmail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3220:1: ( rule__ByEmail__Group__2__Impl )
            // InternalPactDSL.g:3221:2: rule__ByEmail__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__2"


    // $ANTLR start "rule__ByEmail__Group__2__Impl"
    // InternalPactDSL.g:3227:1: rule__ByEmail__Group__2__Impl : ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) ;
    public final void rule__ByEmail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3231:1: ( ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) )
            // InternalPactDSL.g:3232:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            {
            // InternalPactDSL.g:3232:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            // InternalPactDSL.g:3233:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 
            // InternalPactDSL.g:3234:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            // InternalPactDSL.g:3234:3: rule__ByEmail__EmailAddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__EmailAddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__2__Impl"


    // $ANTLR start "rule__GivingNotice__Group__0"
    // InternalPactDSL.g:3243:1: rule__GivingNotice__Group__0 : rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 ;
    public final void rule__GivingNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3247:1: ( rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 )
            // InternalPactDSL.g:3248:2: rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__GivingNotice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__0"


    // $ANTLR start "rule__GivingNotice__Group__0__Impl"
    // InternalPactDSL.g:3255:1: rule__GivingNotice__Group__0__Impl : ( 'givingNoticeTo' ) ;
    public final void rule__GivingNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3259:1: ( ( 'givingNoticeTo' ) )
            // InternalPactDSL.g:3260:1: ( 'givingNoticeTo' )
            {
            // InternalPactDSL.g:3260:1: ( 'givingNoticeTo' )
            // InternalPactDSL.g:3261:2: 'givingNoticeTo'
            {
             before(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__0__Impl"


    // $ANTLR start "rule__GivingNotice__Group__1"
    // InternalPactDSL.g:3270:1: rule__GivingNotice__Group__1 : rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 ;
    public final void rule__GivingNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3274:1: ( rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 )
            // InternalPactDSL.g:3275:2: rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__GivingNotice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__1"


    // $ANTLR start "rule__GivingNotice__Group__1__Impl"
    // InternalPactDSL.g:3282:1: rule__GivingNotice__Group__1__Impl : ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) ;
    public final void rule__GivingNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3286:1: ( ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3287:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3287:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3288:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3289:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3289:3: rule__GivingNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__1__Impl"


    // $ANTLR start "rule__GivingNotice__Group__2"
    // InternalPactDSL.g:3297:1: rule__GivingNotice__Group__2 : rule__GivingNotice__Group__2__Impl ;
    public final void rule__GivingNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3301:1: ( rule__GivingNotice__Group__2__Impl )
            // InternalPactDSL.g:3302:2: rule__GivingNotice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__2"


    // $ANTLR start "rule__GivingNotice__Group__2__Impl"
    // InternalPactDSL.g:3308:1: rule__GivingNotice__Group__2__Impl : ( ( rule__GivingNotice__Group_2__0 ) ) ;
    public final void rule__GivingNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3312:1: ( ( ( rule__GivingNotice__Group_2__0 ) ) )
            // InternalPactDSL.g:3313:1: ( ( rule__GivingNotice__Group_2__0 ) )
            {
            // InternalPactDSL.g:3313:1: ( ( rule__GivingNotice__Group_2__0 ) )
            // InternalPactDSL.g:3314:2: ( rule__GivingNotice__Group_2__0 )
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup_2()); 
            // InternalPactDSL.g:3315:2: ( rule__GivingNotice__Group_2__0 )
            // InternalPactDSL.g:3315:3: rule__GivingNotice__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__2__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__0"
    // InternalPactDSL.g:3324:1: rule__GivingNotice__Group_2__0 : rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 ;
    public final void rule__GivingNotice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3328:1: ( rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 )
            // InternalPactDSL.g:3329:2: rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__GivingNotice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__0"


    // $ANTLR start "rule__GivingNotice__Group_2__0__Impl"
    // InternalPactDSL.g:3336:1: rule__GivingNotice__Group_2__0__Impl : ( 'withDuration' ) ;
    public final void rule__GivingNotice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3340:1: ( ( 'withDuration' ) )
            // InternalPactDSL.g:3341:1: ( 'withDuration' )
            {
            // InternalPactDSL.g:3341:1: ( 'withDuration' )
            // InternalPactDSL.g:3342:2: 'withDuration'
            {
             before(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__0__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__1"
    // InternalPactDSL.g:3351:1: rule__GivingNotice__Group_2__1 : rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 ;
    public final void rule__GivingNotice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3355:1: ( rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 )
            // InternalPactDSL.g:3356:2: rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__GivingNotice__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__1"


    // $ANTLR start "rule__GivingNotice__Group_2__1__Impl"
    // InternalPactDSL.g:3363:1: rule__GivingNotice__Group_2__1__Impl : ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) ;
    public final void rule__GivingNotice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3367:1: ( ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) )
            // InternalPactDSL.g:3368:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            {
            // InternalPactDSL.g:3368:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            // InternalPactDSL.g:3369:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 
            // InternalPactDSL.g:3370:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            // InternalPactDSL.g:3370:3: rule__GivingNotice__NumDaysAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__NumDaysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__1__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__2"
    // InternalPactDSL.g:3378:1: rule__GivingNotice__Group_2__2 : rule__GivingNotice__Group_2__2__Impl ;
    public final void rule__GivingNotice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3382:1: ( rule__GivingNotice__Group_2__2__Impl )
            // InternalPactDSL.g:3383:2: rule__GivingNotice__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__2"


    // $ANTLR start "rule__GivingNotice__Group_2__2__Impl"
    // InternalPactDSL.g:3389:1: rule__GivingNotice__Group_2__2__Impl : ( 'days' ) ;
    public final void rule__GivingNotice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3393:1: ( ( 'days' ) )
            // InternalPactDSL.g:3394:1: ( 'days' )
            {
            // InternalPactDSL.g:3394:1: ( 'days' )
            // InternalPactDSL.g:3395:2: 'days'
            {
             before(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__2__Impl"


    // $ANTLR start "rule__CustomFormality__Group__0"
    // InternalPactDSL.g:3405:1: rule__CustomFormality__Group__0 : rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 ;
    public final void rule__CustomFormality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3409:1: ( rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 )
            // InternalPactDSL.g:3410:2: rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomFormality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__0"


    // $ANTLR start "rule__CustomFormality__Group__0__Impl"
    // InternalPactDSL.g:3417:1: rule__CustomFormality__Group__0__Impl : ( 'ContractFormality' ) ;
    public final void rule__CustomFormality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3421:1: ( ( 'ContractFormality' ) )
            // InternalPactDSL.g:3422:1: ( 'ContractFormality' )
            {
            // InternalPactDSL.g:3422:1: ( 'ContractFormality' )
            // InternalPactDSL.g:3423:2: 'ContractFormality'
            {
             before(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__0__Impl"


    // $ANTLR start "rule__CustomFormality__Group__1"
    // InternalPactDSL.g:3432:1: rule__CustomFormality__Group__1 : rule__CustomFormality__Group__1__Impl ;
    public final void rule__CustomFormality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3436:1: ( rule__CustomFormality__Group__1__Impl )
            // InternalPactDSL.g:3437:2: rule__CustomFormality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__1"


    // $ANTLR start "rule__CustomFormality__Group__1__Impl"
    // InternalPactDSL.g:3443:1: rule__CustomFormality__Group__1__Impl : ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) ;
    public final void rule__CustomFormality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3447:1: ( ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3448:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3448:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            // InternalPactDSL.g:3449:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 
            // InternalPactDSL.g:3450:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            // InternalPactDSL.g:3450:3: rule__CustomFormality__CustomFormalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__CustomFormalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__1__Impl"


    // $ANTLR start "rule__GivenConsent__Group__0"
    // InternalPactDSL.g:3459:1: rule__GivenConsent__Group__0 : rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 ;
    public final void rule__GivenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3463:1: ( rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 )
            // InternalPactDSL.g:3464:2: rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__GivenConsent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__0"


    // $ANTLR start "rule__GivenConsent__Group__0__Impl"
    // InternalPactDSL.g:3471:1: rule__GivenConsent__Group__0__Impl : ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3475:1: ( ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3476:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3476:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3477:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3478:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3478:3: rule__GivenConsent__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__0__Impl"


    // $ANTLR start "rule__GivenConsent__Group__1"
    // InternalPactDSL.g:3486:1: rule__GivenConsent__Group__1 : rule__GivenConsent__Group__1__Impl ;
    public final void rule__GivenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3490:1: ( rule__GivenConsent__Group__1__Impl )
            // InternalPactDSL.g:3491:2: rule__GivenConsent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__1"


    // $ANTLR start "rule__GivenConsent__Group__1__Impl"
    // InternalPactDSL.g:3497:1: rule__GivenConsent__Group__1__Impl : ( 'gaveConsent' ) ;
    public final void rule__GivenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3501:1: ( ( 'gaveConsent' ) )
            // InternalPactDSL.g:3502:1: ( 'gaveConsent' )
            {
            // InternalPactDSL.g:3502:1: ( 'gaveConsent' )
            // InternalPactDSL.g:3503:2: 'gaveConsent'
            {
             before(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__1__Impl"


    // $ANTLR start "rule__GivenWrittenConsent__Group__0"
    // InternalPactDSL.g:3513:1: rule__GivenWrittenConsent__Group__0 : rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 ;
    public final void rule__GivenWrittenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3517:1: ( rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 )
            // InternalPactDSL.g:3518:2: rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__GivenWrittenConsent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__0"


    // $ANTLR start "rule__GivenWrittenConsent__Group__0__Impl"
    // InternalPactDSL.g:3525:1: rule__GivenWrittenConsent__Group__0__Impl : ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenWrittenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3529:1: ( ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3530:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3530:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3531:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3532:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3532:3: rule__GivenWrittenConsent__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__0__Impl"


    // $ANTLR start "rule__GivenWrittenConsent__Group__1"
    // InternalPactDSL.g:3540:1: rule__GivenWrittenConsent__Group__1 : rule__GivenWrittenConsent__Group__1__Impl ;
    public final void rule__GivenWrittenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3544:1: ( rule__GivenWrittenConsent__Group__1__Impl )
            // InternalPactDSL.g:3545:2: rule__GivenWrittenConsent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__1"


    // $ANTLR start "rule__GivenWrittenConsent__Group__1__Impl"
    // InternalPactDSL.g:3551:1: rule__GivenWrittenConsent__Group__1__Impl : ( 'gaveWrittenConsent' ) ;
    public final void rule__GivenWrittenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3555:1: ( ( 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:3556:1: ( 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:3556:1: ( 'gaveWrittenConsent' )
            // InternalPactDSL.g:3557:2: 'gaveWrittenConsent'
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__1__Impl"


    // $ANTLR start "rule__Ownership__Group__0"
    // InternalPactDSL.g:3567:1: rule__Ownership__Group__0 : rule__Ownership__Group__0__Impl rule__Ownership__Group__1 ;
    public final void rule__Ownership__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3571:1: ( rule__Ownership__Group__0__Impl rule__Ownership__Group__1 )
            // InternalPactDSL.g:3572:2: rule__Ownership__Group__0__Impl rule__Ownership__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Ownership__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__0"


    // $ANTLR start "rule__Ownership__Group__0__Impl"
    // InternalPactDSL.g:3579:1: rule__Ownership__Group__0__Impl : ( ( rule__Ownership__SuperTypeAssignment_0 ) ) ;
    public final void rule__Ownership__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3583:1: ( ( ( rule__Ownership__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3584:1: ( ( rule__Ownership__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3584:1: ( ( rule__Ownership__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3585:2: ( rule__Ownership__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3586:2: ( rule__Ownership__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3586:3: rule__Ownership__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__0__Impl"


    // $ANTLR start "rule__Ownership__Group__1"
    // InternalPactDSL.g:3594:1: rule__Ownership__Group__1 : rule__Ownership__Group__1__Impl rule__Ownership__Group__2 ;
    public final void rule__Ownership__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3598:1: ( rule__Ownership__Group__1__Impl rule__Ownership__Group__2 )
            // InternalPactDSL.g:3599:2: rule__Ownership__Group__1__Impl rule__Ownership__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Ownership__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__1"


    // $ANTLR start "rule__Ownership__Group__1__Impl"
    // InternalPactDSL.g:3606:1: rule__Ownership__Group__1__Impl : ( ( rule__Ownership__Alternatives_1 ) ) ;
    public final void rule__Ownership__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3610:1: ( ( ( rule__Ownership__Alternatives_1 ) ) )
            // InternalPactDSL.g:3611:1: ( ( rule__Ownership__Alternatives_1 ) )
            {
            // InternalPactDSL.g:3611:1: ( ( rule__Ownership__Alternatives_1 ) )
            // InternalPactDSL.g:3612:2: ( rule__Ownership__Alternatives_1 )
            {
             before(grammarAccess.getOwnershipAccess().getAlternatives_1()); 
            // InternalPactDSL.g:3613:2: ( rule__Ownership__Alternatives_1 )
            // InternalPactDSL.g:3613:3: rule__Ownership__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__1__Impl"


    // $ANTLR start "rule__Ownership__Group__2"
    // InternalPactDSL.g:3621:1: rule__Ownership__Group__2 : rule__Ownership__Group__2__Impl rule__Ownership__Group__3 ;
    public final void rule__Ownership__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3625:1: ( rule__Ownership__Group__2__Impl rule__Ownership__Group__3 )
            // InternalPactDSL.g:3626:2: rule__Ownership__Group__2__Impl rule__Ownership__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Ownership__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__2"


    // $ANTLR start "rule__Ownership__Group__2__Impl"
    // InternalPactDSL.g:3633:1: rule__Ownership__Group__2__Impl : ( ( rule__Ownership__CustomOwnershipAssignment_2 )* ) ;
    public final void rule__Ownership__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3637:1: ( ( ( rule__Ownership__CustomOwnershipAssignment_2 )* ) )
            // InternalPactDSL.g:3638:1: ( ( rule__Ownership__CustomOwnershipAssignment_2 )* )
            {
            // InternalPactDSL.g:3638:1: ( ( rule__Ownership__CustomOwnershipAssignment_2 )* )
            // InternalPactDSL.g:3639:2: ( rule__Ownership__CustomOwnershipAssignment_2 )*
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_2()); 
            // InternalPactDSL.g:3640:2: ( rule__Ownership__CustomOwnershipAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPactDSL.g:3640:3: rule__Ownership__CustomOwnershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Ownership__CustomOwnershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__2__Impl"


    // $ANTLR start "rule__Ownership__Group__3"
    // InternalPactDSL.g:3648:1: rule__Ownership__Group__3 : rule__Ownership__Group__3__Impl ;
    public final void rule__Ownership__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3652:1: ( rule__Ownership__Group__3__Impl )
            // InternalPactDSL.g:3653:2: rule__Ownership__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__3"


    // $ANTLR start "rule__Ownership__Group__3__Impl"
    // InternalPactDSL.g:3659:1: rule__Ownership__Group__3__Impl : ( ( rule__Ownership__SuperTypeAssignment_3 ) ) ;
    public final void rule__Ownership__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3663:1: ( ( ( rule__Ownership__SuperTypeAssignment_3 ) ) )
            // InternalPactDSL.g:3664:1: ( ( rule__Ownership__SuperTypeAssignment_3 ) )
            {
            // InternalPactDSL.g:3664:1: ( ( rule__Ownership__SuperTypeAssignment_3 ) )
            // InternalPactDSL.g:3665:2: ( rule__Ownership__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3()); 
            // InternalPactDSL.g:3666:2: ( rule__Ownership__SuperTypeAssignment_3 )
            // InternalPactDSL.g:3666:3: rule__Ownership__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__3__Impl"


    // $ANTLR start "rule__RightToUse__Group__0"
    // InternalPactDSL.g:3675:1: rule__RightToUse__Group__0 : rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 ;
    public final void rule__RightToUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3679:1: ( rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 )
            // InternalPactDSL.g:3680:2: rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RightToUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__0"


    // $ANTLR start "rule__RightToUse__Group__0__Impl"
    // InternalPactDSL.g:3687:1: rule__RightToUse__Group__0__Impl : ( ( rule__RightToUse__SuperTypeAssignment_0 ) ) ;
    public final void rule__RightToUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3691:1: ( ( ( rule__RightToUse__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3692:1: ( ( rule__RightToUse__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3692:1: ( ( rule__RightToUse__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3693:2: ( rule__RightToUse__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3694:2: ( rule__RightToUse__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3694:3: rule__RightToUse__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__0__Impl"


    // $ANTLR start "rule__RightToUse__Group__1"
    // InternalPactDSL.g:3702:1: rule__RightToUse__Group__1 : rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 ;
    public final void rule__RightToUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3706:1: ( rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 )
            // InternalPactDSL.g:3707:2: rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__RightToUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__1"


    // $ANTLR start "rule__RightToUse__Group__1__Impl"
    // InternalPactDSL.g:3714:1: rule__RightToUse__Group__1__Impl : ( ( rule__RightToUse__Alternatives_1 ) ) ;
    public final void rule__RightToUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3718:1: ( ( ( rule__RightToUse__Alternatives_1 ) ) )
            // InternalPactDSL.g:3719:1: ( ( rule__RightToUse__Alternatives_1 ) )
            {
            // InternalPactDSL.g:3719:1: ( ( rule__RightToUse__Alternatives_1 ) )
            // InternalPactDSL.g:3720:2: ( rule__RightToUse__Alternatives_1 )
            {
             before(grammarAccess.getRightToUseAccess().getAlternatives_1()); 
            // InternalPactDSL.g:3721:2: ( rule__RightToUse__Alternatives_1 )
            // InternalPactDSL.g:3721:3: rule__RightToUse__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__1__Impl"


    // $ANTLR start "rule__RightToUse__Group__2"
    // InternalPactDSL.g:3729:1: rule__RightToUse__Group__2 : rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 ;
    public final void rule__RightToUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3733:1: ( rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 )
            // InternalPactDSL.g:3734:2: rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__RightToUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__2"


    // $ANTLR start "rule__RightToUse__Group__2__Impl"
    // InternalPactDSL.g:3741:1: rule__RightToUse__Group__2__Impl : ( ( rule__RightToUse__CustomUsageAssignment_2 )* ) ;
    public final void rule__RightToUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3745:1: ( ( ( rule__RightToUse__CustomUsageAssignment_2 )* ) )
            // InternalPactDSL.g:3746:1: ( ( rule__RightToUse__CustomUsageAssignment_2 )* )
            {
            // InternalPactDSL.g:3746:1: ( ( rule__RightToUse__CustomUsageAssignment_2 )* )
            // InternalPactDSL.g:3747:2: ( rule__RightToUse__CustomUsageAssignment_2 )*
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_2()); 
            // InternalPactDSL.g:3748:2: ( rule__RightToUse__CustomUsageAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPactDSL.g:3748:3: rule__RightToUse__CustomUsageAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RightToUse__CustomUsageAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__2__Impl"


    // $ANTLR start "rule__RightToUse__Group__3"
    // InternalPactDSL.g:3756:1: rule__RightToUse__Group__3 : rule__RightToUse__Group__3__Impl ;
    public final void rule__RightToUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3760:1: ( rule__RightToUse__Group__3__Impl )
            // InternalPactDSL.g:3761:2: rule__RightToUse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__3"


    // $ANTLR start "rule__RightToUse__Group__3__Impl"
    // InternalPactDSL.g:3767:1: rule__RightToUse__Group__3__Impl : ( ( rule__RightToUse__SuperTypeAssignment_3 ) ) ;
    public final void rule__RightToUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3771:1: ( ( ( rule__RightToUse__SuperTypeAssignment_3 ) ) )
            // InternalPactDSL.g:3772:1: ( ( rule__RightToUse__SuperTypeAssignment_3 ) )
            {
            // InternalPactDSL.g:3772:1: ( ( rule__RightToUse__SuperTypeAssignment_3 ) )
            // InternalPactDSL.g:3773:2: ( rule__RightToUse__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3()); 
            // InternalPactDSL.g:3774:2: ( rule__RightToUse__SuperTypeAssignment_3 )
            // InternalPactDSL.g:3774:3: rule__RightToUse__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__0"
    // InternalPactDSL.g:3783:1: rule__PaymentObligation__Group__0 : rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 ;
    public final void rule__PaymentObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3787:1: ( rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 )
            // InternalPactDSL.g:3788:2: rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PaymentObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__0"


    // $ANTLR start "rule__PaymentObligation__Group__0__Impl"
    // InternalPactDSL.g:3795:1: rule__PaymentObligation__Group__0__Impl : ( 'PaymentObligation:' ) ;
    public final void rule__PaymentObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3799:1: ( ( 'PaymentObligation:' ) )
            // InternalPactDSL.g:3800:1: ( 'PaymentObligation:' )
            {
            // InternalPactDSL.g:3800:1: ( 'PaymentObligation:' )
            // InternalPactDSL.g:3801:2: 'PaymentObligation:'
            {
             before(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__0__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__1"
    // InternalPactDSL.g:3810:1: rule__PaymentObligation__Group__1 : rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 ;
    public final void rule__PaymentObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3814:1: ( rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 )
            // InternalPactDSL.g:3815:2: rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__PaymentObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__1"


    // $ANTLR start "rule__PaymentObligation__Group__1__Impl"
    // InternalPactDSL.g:3822:1: rule__PaymentObligation__Group__1__Impl : ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__PaymentObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3826:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3827:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3827:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3828:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3829:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3829:3: rule__PaymentObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__1__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__2"
    // InternalPactDSL.g:3837:1: rule__PaymentObligation__Group__2 : rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 ;
    public final void rule__PaymentObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3841:1: ( rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 )
            // InternalPactDSL.g:3842:2: rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__PaymentObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__2"


    // $ANTLR start "rule__PaymentObligation__Group__2__Impl"
    // InternalPactDSL.g:3849:1: rule__PaymentObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__PaymentObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3853:1: ( ( 'must' ) )
            // InternalPactDSL.g:3854:1: ( 'must' )
            {
            // InternalPactDSL.g:3854:1: ( 'must' )
            // InternalPactDSL.g:3855:2: 'must'
            {
             before(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__2__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__3"
    // InternalPactDSL.g:3864:1: rule__PaymentObligation__Group__3 : rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 ;
    public final void rule__PaymentObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3868:1: ( rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 )
            // InternalPactDSL.g:3869:2: rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__3"


    // $ANTLR start "rule__PaymentObligation__Group__3__Impl"
    // InternalPactDSL.g:3876:1: rule__PaymentObligation__Group__3__Impl : ( 'pay' ) ;
    public final void rule__PaymentObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3880:1: ( ( 'pay' ) )
            // InternalPactDSL.g:3881:1: ( 'pay' )
            {
            // InternalPactDSL.g:3881:1: ( 'pay' )
            // InternalPactDSL.g:3882:2: 'pay'
            {
             before(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__4"
    // InternalPactDSL.g:3891:1: rule__PaymentObligation__Group__4 : rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 ;
    public final void rule__PaymentObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3895:1: ( rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 )
            // InternalPactDSL.g:3896:2: rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__PaymentObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__4"


    // $ANTLR start "rule__PaymentObligation__Group__4__Impl"
    // InternalPactDSL.g:3903:1: rule__PaymentObligation__Group__4__Impl : ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) ;
    public final void rule__PaymentObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3907:1: ( ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) )
            // InternalPactDSL.g:3908:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            {
            // InternalPactDSL.g:3908:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            // InternalPactDSL.g:3909:2: ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* )
            {
            // InternalPactDSL.g:3909:2: ( ( rule__PaymentObligation__SumAssignment_4 ) )
            // InternalPactDSL.g:3910:3: ( rule__PaymentObligation__SumAssignment_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:3911:3: ( rule__PaymentObligation__SumAssignment_4 )
            // InternalPactDSL.g:3911:4: rule__PaymentObligation__SumAssignment_4
            {
            pushFollow(FOLLOW_20);
            rule__PaymentObligation__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

            }

            // InternalPactDSL.g:3914:2: ( ( rule__PaymentObligation__SumAssignment_4 )* )
            // InternalPactDSL.g:3915:3: ( rule__PaymentObligation__SumAssignment_4 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:3916:3: ( rule__PaymentObligation__SumAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_INT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPactDSL.g:3916:4: rule__PaymentObligation__SumAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PaymentObligation__SumAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__4__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__5"
    // InternalPactDSL.g:3925:1: rule__PaymentObligation__Group__5 : rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 ;
    public final void rule__PaymentObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3929:1: ( rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 )
            // InternalPactDSL.g:3930:2: rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__PaymentObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__5"


    // $ANTLR start "rule__PaymentObligation__Group__5__Impl"
    // InternalPactDSL.g:3937:1: rule__PaymentObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__PaymentObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3941:1: ( ( 'to' ) )
            // InternalPactDSL.g:3942:1: ( 'to' )
            {
            // InternalPactDSL.g:3942:1: ( 'to' )
            // InternalPactDSL.g:3943:2: 'to'
            {
             before(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__5__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__6"
    // InternalPactDSL.g:3952:1: rule__PaymentObligation__Group__6 : rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 ;
    public final void rule__PaymentObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3956:1: ( rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 )
            // InternalPactDSL.g:3957:2: rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__PaymentObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__6"


    // $ANTLR start "rule__PaymentObligation__Group__6__Impl"
    // InternalPactDSL.g:3964:1: rule__PaymentObligation__Group__6__Impl : ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__PaymentObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3968:1: ( ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:3969:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:3969:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:3970:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:3970:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:3971:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:3972:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:3972:4: rule__PaymentObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__PaymentObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:3975:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:3976:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:3977:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPactDSL.g:3977:4: rule__PaymentObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PaymentObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__6__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__7"
    // InternalPactDSL.g:3986:1: rule__PaymentObligation__Group__7 : rule__PaymentObligation__Group__7__Impl ;
    public final void rule__PaymentObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3990:1: ( rule__PaymentObligation__Group__7__Impl )
            // InternalPactDSL.g:3991:2: rule__PaymentObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__7"


    // $ANTLR start "rule__PaymentObligation__Group__7__Impl"
    // InternalPactDSL.g:3997:1: rule__PaymentObligation__Group__7__Impl : ( ( rule__PaymentObligation__Group_7__0 )? ) ;
    public final void rule__PaymentObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4001:1: ( ( ( rule__PaymentObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4002:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4002:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            // InternalPactDSL.g:4003:2: ( rule__PaymentObligation__Group_7__0 )?
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4004:2: ( rule__PaymentObligation__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPactDSL.g:4004:3: rule__PaymentObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PaymentObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaymentObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__7__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__0"
    // InternalPactDSL.g:4013:1: rule__PaymentObligation__Group_7__0 : rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 ;
    public final void rule__PaymentObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4017:1: ( rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 )
            // InternalPactDSL.g:4018:2: rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__PaymentObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__0"


    // $ANTLR start "rule__PaymentObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4025:1: rule__PaymentObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__PaymentObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4029:1: ( ( 'by' ) )
            // InternalPactDSL.g:4030:1: ( 'by' )
            {
            // InternalPactDSL.g:4030:1: ( 'by' )
            // InternalPactDSL.g:4031:2: 'by'
            {
             before(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__0__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__1"
    // InternalPactDSL.g:4040:1: rule__PaymentObligation__Group_7__1 : rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 ;
    public final void rule__PaymentObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4044:1: ( rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 )
            // InternalPactDSL.g:4045:2: rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__1"


    // $ANTLR start "rule__PaymentObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4052:1: rule__PaymentObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__PaymentObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4056:1: ( ( 'date' ) )
            // InternalPactDSL.g:4057:1: ( 'date' )
            {
            // InternalPactDSL.g:4057:1: ( 'date' )
            // InternalPactDSL.g:4058:2: 'date'
            {
             before(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__1__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__2"
    // InternalPactDSL.g:4067:1: rule__PaymentObligation__Group_7__2 : rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 ;
    public final void rule__PaymentObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4071:1: ( rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 )
            // InternalPactDSL.g:4072:2: rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__2"


    // $ANTLR start "rule__PaymentObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4079:1: rule__PaymentObligation__Group_7__2__Impl : ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) ;
    public final void rule__PaymentObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4083:1: ( ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4084:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4084:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4085:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4086:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4086:3: rule__PaymentObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__2__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__3"
    // InternalPactDSL.g:4094:1: rule__PaymentObligation__Group_7__3 : rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 ;
    public final void rule__PaymentObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4098:1: ( rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 )
            // InternalPactDSL.g:4099:2: rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__3"


    // $ANTLR start "rule__PaymentObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4106:1: rule__PaymentObligation__Group_7__3__Impl : ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__PaymentObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4110:1: ( ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4111:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4111:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4112:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4113:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4113:3: rule__PaymentObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__4"
    // InternalPactDSL.g:4121:1: rule__PaymentObligation__Group_7__4 : rule__PaymentObligation__Group_7__4__Impl ;
    public final void rule__PaymentObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4125:1: ( rule__PaymentObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4126:2: rule__PaymentObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__4"


    // $ANTLR start "rule__PaymentObligation__Group_7__4__Impl"
    // InternalPactDSL.g:4132:1: rule__PaymentObligation__Group_7__4__Impl : ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) ;
    public final void rule__PaymentObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4136:1: ( ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4137:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4137:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4138:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4139:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4139:3: rule__PaymentObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__4__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__0"
    // InternalPactDSL.g:4148:1: rule__DeliveryObligation__Group__0 : rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 ;
    public final void rule__DeliveryObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4152:1: ( rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 )
            // InternalPactDSL.g:4153:2: rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__DeliveryObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__0"


    // $ANTLR start "rule__DeliveryObligation__Group__0__Impl"
    // InternalPactDSL.g:4160:1: rule__DeliveryObligation__Group__0__Impl : ( 'DeliveryObligation:' ) ;
    public final void rule__DeliveryObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4164:1: ( ( 'DeliveryObligation:' ) )
            // InternalPactDSL.g:4165:1: ( 'DeliveryObligation:' )
            {
            // InternalPactDSL.g:4165:1: ( 'DeliveryObligation:' )
            // InternalPactDSL.g:4166:2: 'DeliveryObligation:'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__0__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__1"
    // InternalPactDSL.g:4175:1: rule__DeliveryObligation__Group__1 : rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 ;
    public final void rule__DeliveryObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4179:1: ( rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 )
            // InternalPactDSL.g:4180:2: rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__DeliveryObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__1"


    // $ANTLR start "rule__DeliveryObligation__Group__1__Impl"
    // InternalPactDSL.g:4187:1: rule__DeliveryObligation__Group__1__Impl : ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__DeliveryObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4191:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4192:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4192:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4193:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4194:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4194:3: rule__DeliveryObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__1__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__2"
    // InternalPactDSL.g:4202:1: rule__DeliveryObligation__Group__2 : rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 ;
    public final void rule__DeliveryObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4206:1: ( rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 )
            // InternalPactDSL.g:4207:2: rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__DeliveryObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__2"


    // $ANTLR start "rule__DeliveryObligation__Group__2__Impl"
    // InternalPactDSL.g:4214:1: rule__DeliveryObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__DeliveryObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4218:1: ( ( 'must' ) )
            // InternalPactDSL.g:4219:1: ( 'must' )
            {
            // InternalPactDSL.g:4219:1: ( 'must' )
            // InternalPactDSL.g:4220:2: 'must'
            {
             before(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__2__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__3"
    // InternalPactDSL.g:4229:1: rule__DeliveryObligation__Group__3 : rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 ;
    public final void rule__DeliveryObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4233:1: ( rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 )
            // InternalPactDSL.g:4234:2: rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DeliveryObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__3"


    // $ANTLR start "rule__DeliveryObligation__Group__3__Impl"
    // InternalPactDSL.g:4241:1: rule__DeliveryObligation__Group__3__Impl : ( 'deliver' ) ;
    public final void rule__DeliveryObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4245:1: ( ( 'deliver' ) )
            // InternalPactDSL.g:4246:1: ( 'deliver' )
            {
            // InternalPactDSL.g:4246:1: ( 'deliver' )
            // InternalPactDSL.g:4247:2: 'deliver'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__3__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__4"
    // InternalPactDSL.g:4256:1: rule__DeliveryObligation__Group__4 : rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 ;
    public final void rule__DeliveryObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4260:1: ( rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 )
            // InternalPactDSL.g:4261:2: rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__DeliveryObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__4"


    // $ANTLR start "rule__DeliveryObligation__Group__4__Impl"
    // InternalPactDSL.g:4268:1: rule__DeliveryObligation__Group__4__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__DeliveryObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4272:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4273:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4273:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4274:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4274:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4275:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4276:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4276:4: rule__DeliveryObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4279:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4280:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4281:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPactDSL.g:4281:4: rule__DeliveryObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__4__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__5"
    // InternalPactDSL.g:4290:1: rule__DeliveryObligation__Group__5 : rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 ;
    public final void rule__DeliveryObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4294:1: ( rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 )
            // InternalPactDSL.g:4295:2: rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DeliveryObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__5"


    // $ANTLR start "rule__DeliveryObligation__Group__5__Impl"
    // InternalPactDSL.g:4302:1: rule__DeliveryObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__DeliveryObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4306:1: ( ( 'to' ) )
            // InternalPactDSL.g:4307:1: ( 'to' )
            {
            // InternalPactDSL.g:4307:1: ( 'to' )
            // InternalPactDSL.g:4308:2: 'to'
            {
             before(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__5__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__6"
    // InternalPactDSL.g:4317:1: rule__DeliveryObligation__Group__6 : rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 ;
    public final void rule__DeliveryObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4321:1: ( rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 )
            // InternalPactDSL.g:4322:2: rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__DeliveryObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__6"


    // $ANTLR start "rule__DeliveryObligation__Group__6__Impl"
    // InternalPactDSL.g:4329:1: rule__DeliveryObligation__Group__6__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__DeliveryObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4333:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4334:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4334:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4335:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4335:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4336:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4337:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4337:4: rule__DeliveryObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4340:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4341:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4342:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPactDSL.g:4342:4: rule__DeliveryObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__6__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__7"
    // InternalPactDSL.g:4351:1: rule__DeliveryObligation__Group__7 : rule__DeliveryObligation__Group__7__Impl ;
    public final void rule__DeliveryObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4355:1: ( rule__DeliveryObligation__Group__7__Impl )
            // InternalPactDSL.g:4356:2: rule__DeliveryObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__7"


    // $ANTLR start "rule__DeliveryObligation__Group__7__Impl"
    // InternalPactDSL.g:4362:1: rule__DeliveryObligation__Group__7__Impl : ( ( rule__DeliveryObligation__Group_7__0 )? ) ;
    public final void rule__DeliveryObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4366:1: ( ( ( rule__DeliveryObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4367:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4367:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            // InternalPactDSL.g:4368:2: ( rule__DeliveryObligation__Group_7__0 )?
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4369:2: ( rule__DeliveryObligation__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPactDSL.g:4369:3: rule__DeliveryObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeliveryObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__7__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__0"
    // InternalPactDSL.g:4378:1: rule__DeliveryObligation__Group_7__0 : rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 ;
    public final void rule__DeliveryObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4382:1: ( rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 )
            // InternalPactDSL.g:4383:2: rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__DeliveryObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__0"


    // $ANTLR start "rule__DeliveryObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4390:1: rule__DeliveryObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__DeliveryObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4394:1: ( ( 'by' ) )
            // InternalPactDSL.g:4395:1: ( 'by' )
            {
            // InternalPactDSL.g:4395:1: ( 'by' )
            // InternalPactDSL.g:4396:2: 'by'
            {
             before(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__0__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__1"
    // InternalPactDSL.g:4405:1: rule__DeliveryObligation__Group_7__1 : rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 ;
    public final void rule__DeliveryObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4409:1: ( rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 )
            // InternalPactDSL.g:4410:2: rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__DeliveryObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__1"


    // $ANTLR start "rule__DeliveryObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4417:1: rule__DeliveryObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__DeliveryObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4421:1: ( ( 'date' ) )
            // InternalPactDSL.g:4422:1: ( 'date' )
            {
            // InternalPactDSL.g:4422:1: ( 'date' )
            // InternalPactDSL.g:4423:2: 'date'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__1__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__2"
    // InternalPactDSL.g:4432:1: rule__DeliveryObligation__Group_7__2 : rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 ;
    public final void rule__DeliveryObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4436:1: ( rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 )
            // InternalPactDSL.g:4437:2: rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__DeliveryObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__2"


    // $ANTLR start "rule__DeliveryObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4444:1: rule__DeliveryObligation__Group_7__2__Impl : ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) ;
    public final void rule__DeliveryObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4448:1: ( ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4449:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4449:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4450:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4451:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4451:3: rule__DeliveryObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__2__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__3"
    // InternalPactDSL.g:4459:1: rule__DeliveryObligation__Group_7__3 : rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 ;
    public final void rule__DeliveryObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4463:1: ( rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 )
            // InternalPactDSL.g:4464:2: rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__DeliveryObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__3"


    // $ANTLR start "rule__DeliveryObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4471:1: rule__DeliveryObligation__Group_7__3__Impl : ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__DeliveryObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4475:1: ( ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4476:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4476:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4477:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4478:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4478:3: rule__DeliveryObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__3__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__4"
    // InternalPactDSL.g:4486:1: rule__DeliveryObligation__Group_7__4 : rule__DeliveryObligation__Group_7__4__Impl ;
    public final void rule__DeliveryObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4490:1: ( rule__DeliveryObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4491:2: rule__DeliveryObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__4"


    // $ANTLR start "rule__DeliveryObligation__Group_7__4__Impl"
    // InternalPactDSL.g:4497:1: rule__DeliveryObligation__Group_7__4__Impl : ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) ;
    public final void rule__DeliveryObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4501:1: ( ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4502:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4502:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4503:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4504:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4504:3: rule__DeliveryObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__4__Impl"


    // $ANTLR start "rule__TransferObligation__Group__0"
    // InternalPactDSL.g:4513:1: rule__TransferObligation__Group__0 : rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 ;
    public final void rule__TransferObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4517:1: ( rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 )
            // InternalPactDSL.g:4518:2: rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TransferObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__0"


    // $ANTLR start "rule__TransferObligation__Group__0__Impl"
    // InternalPactDSL.g:4525:1: rule__TransferObligation__Group__0__Impl : ( 'TransferObligation:' ) ;
    public final void rule__TransferObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4529:1: ( ( 'TransferObligation:' ) )
            // InternalPactDSL.g:4530:1: ( 'TransferObligation:' )
            {
            // InternalPactDSL.g:4530:1: ( 'TransferObligation:' )
            // InternalPactDSL.g:4531:2: 'TransferObligation:'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__0__Impl"


    // $ANTLR start "rule__TransferObligation__Group__1"
    // InternalPactDSL.g:4540:1: rule__TransferObligation__Group__1 : rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 ;
    public final void rule__TransferObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4544:1: ( rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 )
            // InternalPactDSL.g:4545:2: rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__TransferObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__1"


    // $ANTLR start "rule__TransferObligation__Group__1__Impl"
    // InternalPactDSL.g:4552:1: rule__TransferObligation__Group__1__Impl : ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__TransferObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4556:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4557:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4557:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4558:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4559:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4559:3: rule__TransferObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__1__Impl"


    // $ANTLR start "rule__TransferObligation__Group__2"
    // InternalPactDSL.g:4567:1: rule__TransferObligation__Group__2 : rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 ;
    public final void rule__TransferObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4571:1: ( rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 )
            // InternalPactDSL.g:4572:2: rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__TransferObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__2"


    // $ANTLR start "rule__TransferObligation__Group__2__Impl"
    // InternalPactDSL.g:4579:1: rule__TransferObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__TransferObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4583:1: ( ( 'must' ) )
            // InternalPactDSL.g:4584:1: ( 'must' )
            {
            // InternalPactDSL.g:4584:1: ( 'must' )
            // InternalPactDSL.g:4585:2: 'must'
            {
             before(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__2__Impl"


    // $ANTLR start "rule__TransferObligation__Group__3"
    // InternalPactDSL.g:4594:1: rule__TransferObligation__Group__3 : rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 ;
    public final void rule__TransferObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4598:1: ( rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 )
            // InternalPactDSL.g:4599:2: rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TransferObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__3"


    // $ANTLR start "rule__TransferObligation__Group__3__Impl"
    // InternalPactDSL.g:4606:1: rule__TransferObligation__Group__3__Impl : ( 'transfer' ) ;
    public final void rule__TransferObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4610:1: ( ( 'transfer' ) )
            // InternalPactDSL.g:4611:1: ( 'transfer' )
            {
            // InternalPactDSL.g:4611:1: ( 'transfer' )
            // InternalPactDSL.g:4612:2: 'transfer'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__3__Impl"


    // $ANTLR start "rule__TransferObligation__Group__4"
    // InternalPactDSL.g:4621:1: rule__TransferObligation__Group__4 : rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 ;
    public final void rule__TransferObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4625:1: ( rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 )
            // InternalPactDSL.g:4626:2: rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__TransferObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__4"


    // $ANTLR start "rule__TransferObligation__Group__4__Impl"
    // InternalPactDSL.g:4633:1: rule__TransferObligation__Group__4__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__TransferObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4637:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4638:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4638:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4639:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4639:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4640:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4641:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4641:4: rule__TransferObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4644:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4645:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4646:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPactDSL.g:4646:4: rule__TransferObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__4__Impl"


    // $ANTLR start "rule__TransferObligation__Group__5"
    // InternalPactDSL.g:4655:1: rule__TransferObligation__Group__5 : rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 ;
    public final void rule__TransferObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4659:1: ( rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 )
            // InternalPactDSL.g:4660:2: rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__TransferObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__5"


    // $ANTLR start "rule__TransferObligation__Group__5__Impl"
    // InternalPactDSL.g:4667:1: rule__TransferObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__TransferObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4671:1: ( ( 'to' ) )
            // InternalPactDSL.g:4672:1: ( 'to' )
            {
            // InternalPactDSL.g:4672:1: ( 'to' )
            // InternalPactDSL.g:4673:2: 'to'
            {
             before(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__5__Impl"


    // $ANTLR start "rule__TransferObligation__Group__6"
    // InternalPactDSL.g:4682:1: rule__TransferObligation__Group__6 : rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 ;
    public final void rule__TransferObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4686:1: ( rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 )
            // InternalPactDSL.g:4687:2: rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__TransferObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__6"


    // $ANTLR start "rule__TransferObligation__Group__6__Impl"
    // InternalPactDSL.g:4694:1: rule__TransferObligation__Group__6__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__TransferObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4698:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4699:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4699:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4700:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4700:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4701:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4702:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4702:4: rule__TransferObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4705:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4706:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4707:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPactDSL.g:4707:4: rule__TransferObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__6__Impl"


    // $ANTLR start "rule__TransferObligation__Group__7"
    // InternalPactDSL.g:4716:1: rule__TransferObligation__Group__7 : rule__TransferObligation__Group__7__Impl ;
    public final void rule__TransferObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4720:1: ( rule__TransferObligation__Group__7__Impl )
            // InternalPactDSL.g:4721:2: rule__TransferObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__7"


    // $ANTLR start "rule__TransferObligation__Group__7__Impl"
    // InternalPactDSL.g:4727:1: rule__TransferObligation__Group__7__Impl : ( ( rule__TransferObligation__Group_7__0 )? ) ;
    public final void rule__TransferObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4731:1: ( ( ( rule__TransferObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4732:1: ( ( rule__TransferObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4732:1: ( ( rule__TransferObligation__Group_7__0 )? )
            // InternalPactDSL.g:4733:2: ( rule__TransferObligation__Group_7__0 )?
            {
             before(grammarAccess.getTransferObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4734:2: ( rule__TransferObligation__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPactDSL.g:4734:3: rule__TransferObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransferObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransferObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__7__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__0"
    // InternalPactDSL.g:4743:1: rule__TransferObligation__Group_7__0 : rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 ;
    public final void rule__TransferObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4747:1: ( rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 )
            // InternalPactDSL.g:4748:2: rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__TransferObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__0"


    // $ANTLR start "rule__TransferObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4755:1: rule__TransferObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__TransferObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4759:1: ( ( 'by' ) )
            // InternalPactDSL.g:4760:1: ( 'by' )
            {
            // InternalPactDSL.g:4760:1: ( 'by' )
            // InternalPactDSL.g:4761:2: 'by'
            {
             before(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__0__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__1"
    // InternalPactDSL.g:4770:1: rule__TransferObligation__Group_7__1 : rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 ;
    public final void rule__TransferObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4774:1: ( rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 )
            // InternalPactDSL.g:4775:2: rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__TransferObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__1"


    // $ANTLR start "rule__TransferObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4782:1: rule__TransferObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__TransferObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4786:1: ( ( 'date' ) )
            // InternalPactDSL.g:4787:1: ( 'date' )
            {
            // InternalPactDSL.g:4787:1: ( 'date' )
            // InternalPactDSL.g:4788:2: 'date'
            {
             before(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__1__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__2"
    // InternalPactDSL.g:4797:1: rule__TransferObligation__Group_7__2 : rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 ;
    public final void rule__TransferObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4801:1: ( rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 )
            // InternalPactDSL.g:4802:2: rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__TransferObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__2"


    // $ANTLR start "rule__TransferObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4809:1: rule__TransferObligation__Group_7__2__Impl : ( ( rule__TransferObligation__DayAssignment_7_2 ) ) ;
    public final void rule__TransferObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4813:1: ( ( ( rule__TransferObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4814:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4814:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4815:2: ( rule__TransferObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4816:2: ( rule__TransferObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4816:3: rule__TransferObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__2__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__3"
    // InternalPactDSL.g:4824:1: rule__TransferObligation__Group_7__3 : rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 ;
    public final void rule__TransferObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4828:1: ( rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 )
            // InternalPactDSL.g:4829:2: rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__TransferObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__3"


    // $ANTLR start "rule__TransferObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4836:1: rule__TransferObligation__Group_7__3__Impl : ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__TransferObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4840:1: ( ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4841:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4841:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4842:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4843:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4843:3: rule__TransferObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__3__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__4"
    // InternalPactDSL.g:4851:1: rule__TransferObligation__Group_7__4 : rule__TransferObligation__Group_7__4__Impl ;
    public final void rule__TransferObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4855:1: ( rule__TransferObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4856:2: rule__TransferObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__4"


    // $ANTLR start "rule__TransferObligation__Group_7__4__Impl"
    // InternalPactDSL.g:4862:1: rule__TransferObligation__Group_7__4__Impl : ( ( rule__TransferObligation__YearAssignment_7_4 ) ) ;
    public final void rule__TransferObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4866:1: ( ( ( rule__TransferObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4867:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4867:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4868:2: ( rule__TransferObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4869:2: ( rule__TransferObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4869:3: rule__TransferObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__4__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__0"
    // InternalPactDSL.g:4878:1: rule__LicenceObligation__Group__0 : rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 ;
    public final void rule__LicenceObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4882:1: ( rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 )
            // InternalPactDSL.g:4883:2: rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__LicenceObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__0"


    // $ANTLR start "rule__LicenceObligation__Group__0__Impl"
    // InternalPactDSL.g:4890:1: rule__LicenceObligation__Group__0__Impl : ( 'LicenceObligation:' ) ;
    public final void rule__LicenceObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4894:1: ( ( 'LicenceObligation:' ) )
            // InternalPactDSL.g:4895:1: ( 'LicenceObligation:' )
            {
            // InternalPactDSL.g:4895:1: ( 'LicenceObligation:' )
            // InternalPactDSL.g:4896:2: 'LicenceObligation:'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__0__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__1"
    // InternalPactDSL.g:4905:1: rule__LicenceObligation__Group__1 : rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 ;
    public final void rule__LicenceObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4909:1: ( rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 )
            // InternalPactDSL.g:4910:2: rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__LicenceObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__1"


    // $ANTLR start "rule__LicenceObligation__Group__1__Impl"
    // InternalPactDSL.g:4917:1: rule__LicenceObligation__Group__1__Impl : ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__LicenceObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4921:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4922:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4922:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4923:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4924:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4924:3: rule__LicenceObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__1__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__2"
    // InternalPactDSL.g:4932:1: rule__LicenceObligation__Group__2 : rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 ;
    public final void rule__LicenceObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4936:1: ( rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 )
            // InternalPactDSL.g:4937:2: rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__LicenceObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__2"


    // $ANTLR start "rule__LicenceObligation__Group__2__Impl"
    // InternalPactDSL.g:4944:1: rule__LicenceObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__LicenceObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4948:1: ( ( 'must' ) )
            // InternalPactDSL.g:4949:1: ( 'must' )
            {
            // InternalPactDSL.g:4949:1: ( 'must' )
            // InternalPactDSL.g:4950:2: 'must'
            {
             before(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__2__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__3"
    // InternalPactDSL.g:4959:1: rule__LicenceObligation__Group__3 : rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 ;
    public final void rule__LicenceObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4963:1: ( rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 )
            // InternalPactDSL.g:4964:2: rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__LicenceObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__3"


    // $ANTLR start "rule__LicenceObligation__Group__3__Impl"
    // InternalPactDSL.g:4971:1: rule__LicenceObligation__Group__3__Impl : ( 'grant' ) ;
    public final void rule__LicenceObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4975:1: ( ( 'grant' ) )
            // InternalPactDSL.g:4976:1: ( 'grant' )
            {
            // InternalPactDSL.g:4976:1: ( 'grant' )
            // InternalPactDSL.g:4977:2: 'grant'
            {
             before(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__3__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__4"
    // InternalPactDSL.g:4986:1: rule__LicenceObligation__Group__4 : rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 ;
    public final void rule__LicenceObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4990:1: ( rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 )
            // InternalPactDSL.g:4991:2: rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__LicenceObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__4"


    // $ANTLR start "rule__LicenceObligation__Group__4__Impl"
    // InternalPactDSL.g:4998:1: rule__LicenceObligation__Group__4__Impl : ( 'Licence' ) ;
    public final void rule__LicenceObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5002:1: ( ( 'Licence' ) )
            // InternalPactDSL.g:5003:1: ( 'Licence' )
            {
            // InternalPactDSL.g:5003:1: ( 'Licence' )
            // InternalPactDSL.g:5004:2: 'Licence'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__4__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__5"
    // InternalPactDSL.g:5013:1: rule__LicenceObligation__Group__5 : rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 ;
    public final void rule__LicenceObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5017:1: ( rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 )
            // InternalPactDSL.g:5018:2: rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__LicenceObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__5"


    // $ANTLR start "rule__LicenceObligation__Group__5__Impl"
    // InternalPactDSL.g:5025:1: rule__LicenceObligation__Group__5__Impl : ( 'in' ) ;
    public final void rule__LicenceObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5029:1: ( ( 'in' ) )
            // InternalPactDSL.g:5030:1: ( 'in' )
            {
            // InternalPactDSL.g:5030:1: ( 'in' )
            // InternalPactDSL.g:5031:2: 'in'
            {
             before(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__5__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__6"
    // InternalPactDSL.g:5040:1: rule__LicenceObligation__Group__6 : rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 ;
    public final void rule__LicenceObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5044:1: ( rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 )
            // InternalPactDSL.g:5045:2: rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__LicenceObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__6"


    // $ANTLR start "rule__LicenceObligation__Group__6__Impl"
    // InternalPactDSL.g:5052:1: rule__LicenceObligation__Group__6__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__LicenceObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5056:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:5057:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:5057:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:5058:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:5058:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:5059:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5060:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:5060:4: rule__LicenceObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:5063:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:5064:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5065:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPactDSL.g:5065:4: rule__LicenceObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__6__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__7"
    // InternalPactDSL.g:5074:1: rule__LicenceObligation__Group__7 : rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 ;
    public final void rule__LicenceObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5078:1: ( rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 )
            // InternalPactDSL.g:5079:2: rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__LicenceObligation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__7"


    // $ANTLR start "rule__LicenceObligation__Group__7__Impl"
    // InternalPactDSL.g:5086:1: rule__LicenceObligation__Group__7__Impl : ( 'to' ) ;
    public final void rule__LicenceObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5090:1: ( ( 'to' ) )
            // InternalPactDSL.g:5091:1: ( 'to' )
            {
            // InternalPactDSL.g:5091:1: ( 'to' )
            // InternalPactDSL.g:5092:2: 'to'
            {
             before(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__7__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__8"
    // InternalPactDSL.g:5101:1: rule__LicenceObligation__Group__8 : rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 ;
    public final void rule__LicenceObligation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5105:1: ( rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 )
            // InternalPactDSL.g:5106:2: rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__LicenceObligation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__8"


    // $ANTLR start "rule__LicenceObligation__Group__8__Impl"
    // InternalPactDSL.g:5113:1: rule__LicenceObligation__Group__8__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) ;
    public final void rule__LicenceObligation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5117:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) )
            // InternalPactDSL.g:5118:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            {
            // InternalPactDSL.g:5118:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            // InternalPactDSL.g:5119:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            {
            // InternalPactDSL.g:5119:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) )
            // InternalPactDSL.g:5120:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5121:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            // InternalPactDSL.g:5121:4: rule__LicenceObligation__SuperTypeAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

            }

            // InternalPactDSL.g:5124:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            // InternalPactDSL.g:5125:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5126:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPactDSL.g:5126:4: rule__LicenceObligation__SuperTypeAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__8__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__9"
    // InternalPactDSL.g:5135:1: rule__LicenceObligation__Group__9 : rule__LicenceObligation__Group__9__Impl ;
    public final void rule__LicenceObligation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5139:1: ( rule__LicenceObligation__Group__9__Impl )
            // InternalPactDSL.g:5140:2: rule__LicenceObligation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__9"


    // $ANTLR start "rule__LicenceObligation__Group__9__Impl"
    // InternalPactDSL.g:5146:1: rule__LicenceObligation__Group__9__Impl : ( ( rule__LicenceObligation__Group_9__0 )* ) ;
    public final void rule__LicenceObligation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5150:1: ( ( ( rule__LicenceObligation__Group_9__0 )* ) )
            // InternalPactDSL.g:5151:1: ( ( rule__LicenceObligation__Group_9__0 )* )
            {
            // InternalPactDSL.g:5151:1: ( ( rule__LicenceObligation__Group_9__0 )* )
            // InternalPactDSL.g:5152:2: ( rule__LicenceObligation__Group_9__0 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup_9()); 
            // InternalPactDSL.g:5153:2: ( rule__LicenceObligation__Group_9__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==46) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPactDSL.g:5153:3: rule__LicenceObligation__Group_9__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__LicenceObligation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__9__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__0"
    // InternalPactDSL.g:5162:1: rule__LicenceObligation__Group_9__0 : rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 ;
    public final void rule__LicenceObligation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5166:1: ( rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 )
            // InternalPactDSL.g:5167:2: rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1
            {
            pushFollow(FOLLOW_36);
            rule__LicenceObligation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__0"


    // $ANTLR start "rule__LicenceObligation__Group_9__0__Impl"
    // InternalPactDSL.g:5174:1: rule__LicenceObligation__Group_9__0__Impl : ( 'by' ) ;
    public final void rule__LicenceObligation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5178:1: ( ( 'by' ) )
            // InternalPactDSL.g:5179:1: ( 'by' )
            {
            // InternalPactDSL.g:5179:1: ( 'by' )
            // InternalPactDSL.g:5180:2: 'by'
            {
             before(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__0__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__1"
    // InternalPactDSL.g:5189:1: rule__LicenceObligation__Group_9__1 : rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 ;
    public final void rule__LicenceObligation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5193:1: ( rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 )
            // InternalPactDSL.g:5194:2: rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__LicenceObligation__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__1"


    // $ANTLR start "rule__LicenceObligation__Group_9__1__Impl"
    // InternalPactDSL.g:5201:1: rule__LicenceObligation__Group_9__1__Impl : ( 'date' ) ;
    public final void rule__LicenceObligation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5205:1: ( ( 'date' ) )
            // InternalPactDSL.g:5206:1: ( 'date' )
            {
            // InternalPactDSL.g:5206:1: ( 'date' )
            // InternalPactDSL.g:5207:2: 'date'
            {
             before(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__1__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__2"
    // InternalPactDSL.g:5216:1: rule__LicenceObligation__Group_9__2 : rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 ;
    public final void rule__LicenceObligation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5220:1: ( rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 )
            // InternalPactDSL.g:5221:2: rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3
            {
            pushFollow(FOLLOW_19);
            rule__LicenceObligation__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__2"


    // $ANTLR start "rule__LicenceObligation__Group_9__2__Impl"
    // InternalPactDSL.g:5228:1: rule__LicenceObligation__Group_9__2__Impl : ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) ;
    public final void rule__LicenceObligation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5232:1: ( ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) )
            // InternalPactDSL.g:5233:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            {
            // InternalPactDSL.g:5233:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            // InternalPactDSL.g:5234:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            {
             before(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 
            // InternalPactDSL.g:5235:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            // InternalPactDSL.g:5235:3: rule__LicenceObligation__DayAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__DayAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__2__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__3"
    // InternalPactDSL.g:5243:1: rule__LicenceObligation__Group_9__3 : rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 ;
    public final void rule__LicenceObligation__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5247:1: ( rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 )
            // InternalPactDSL.g:5248:2: rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4
            {
            pushFollow(FOLLOW_19);
            rule__LicenceObligation__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__3"


    // $ANTLR start "rule__LicenceObligation__Group_9__3__Impl"
    // InternalPactDSL.g:5255:1: rule__LicenceObligation__Group_9__3__Impl : ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) ;
    public final void rule__LicenceObligation__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5259:1: ( ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) )
            // InternalPactDSL.g:5260:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            {
            // InternalPactDSL.g:5260:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            // InternalPactDSL.g:5261:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 
            // InternalPactDSL.g:5262:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            // InternalPactDSL.g:5262:3: rule__LicenceObligation__MonthAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__MonthAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__3__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__4"
    // InternalPactDSL.g:5270:1: rule__LicenceObligation__Group_9__4 : rule__LicenceObligation__Group_9__4__Impl ;
    public final void rule__LicenceObligation__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5274:1: ( rule__LicenceObligation__Group_9__4__Impl )
            // InternalPactDSL.g:5275:2: rule__LicenceObligation__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__4"


    // $ANTLR start "rule__LicenceObligation__Group_9__4__Impl"
    // InternalPactDSL.g:5281:1: rule__LicenceObligation__Group_9__4__Impl : ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) ;
    public final void rule__LicenceObligation__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5285:1: ( ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) )
            // InternalPactDSL.g:5286:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            {
            // InternalPactDSL.g:5286:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            // InternalPactDSL.g:5287:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            {
             before(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 
            // InternalPactDSL.g:5288:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            // InternalPactDSL.g:5288:3: rule__LicenceObligation__YearAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__YearAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__4__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__0"
    // InternalPactDSL.g:5297:1: rule__ConstraintParty__Group__0 : rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 ;
    public final void rule__ConstraintParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5301:1: ( rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 )
            // InternalPactDSL.g:5302:2: rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__0"


    // $ANTLR start "rule__ConstraintParty__Group__0__Impl"
    // InternalPactDSL.g:5309:1: rule__ConstraintParty__Group__0__Impl : ( 'ConstraintParty:' ) ;
    public final void rule__ConstraintParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5313:1: ( ( 'ConstraintParty:' ) )
            // InternalPactDSL.g:5314:1: ( 'ConstraintParty:' )
            {
            // InternalPactDSL.g:5314:1: ( 'ConstraintParty:' )
            // InternalPactDSL.g:5315:2: 'ConstraintParty:'
            {
             before(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__0__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__1"
    // InternalPactDSL.g:5324:1: rule__ConstraintParty__Group__1 : rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 ;
    public final void rule__ConstraintParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5328:1: ( rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 )
            // InternalPactDSL.g:5329:2: rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ConstraintParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__1"


    // $ANTLR start "rule__ConstraintParty__Group__1__Impl"
    // InternalPactDSL.g:5336:1: rule__ConstraintParty__Group__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5340:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5341:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5341:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5342:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5343:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5343:3: rule__ConstraintParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__1__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__2"
    // InternalPactDSL.g:5351:1: rule__ConstraintParty__Group__2 : rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 ;
    public final void rule__ConstraintParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5355:1: ( rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 )
            // InternalPactDSL.g:5356:2: rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__2"


    // $ANTLR start "rule__ConstraintParty__Group__2__Impl"
    // InternalPactDSL.g:5363:1: rule__ConstraintParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5367:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5368:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5368:1: ( 'mustNot' )
            // InternalPactDSL.g:5369:2: 'mustNot'
            {
             before(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__2__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__3"
    // InternalPactDSL.g:5378:1: rule__ConstraintParty__Group__3 : rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 ;
    public final void rule__ConstraintParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5382:1: ( rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 )
            // InternalPactDSL.g:5383:2: rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__3"


    // $ANTLR start "rule__ConstraintParty__Group__3__Impl"
    // InternalPactDSL.g:5390:1: rule__ConstraintParty__Group__3__Impl : ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5394:1: ( ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5395:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5395:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5396:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5397:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5397:3: rule__ConstraintParty__ForbiddenActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__ForbiddenActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__3__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__4"
    // InternalPactDSL.g:5405:1: rule__ConstraintParty__Group__4 : rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 ;
    public final void rule__ConstraintParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5409:1: ( rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 )
            // InternalPactDSL.g:5410:2: rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__4"


    // $ANTLR start "rule__ConstraintParty__Group__4__Impl"
    // InternalPactDSL.g:5417:1: rule__ConstraintParty__Group__4__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5421:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:5422:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:5422:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:5423:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5424:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPactDSL.g:5424:3: rule__ConstraintParty__SuperTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParty__SuperTypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__4__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__5"
    // InternalPactDSL.g:5432:1: rule__ConstraintParty__Group__5 : rule__ConstraintParty__Group__5__Impl ;
    public final void rule__ConstraintParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5436:1: ( rule__ConstraintParty__Group__5__Impl )
            // InternalPactDSL.g:5437:2: rule__ConstraintParty__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__5"


    // $ANTLR start "rule__ConstraintParty__Group__5__Impl"
    // InternalPactDSL.g:5443:1: rule__ConstraintParty__Group__5__Impl : ( ( rule__ConstraintParty__Group_5__0 )? ) ;
    public final void rule__ConstraintParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5447:1: ( ( ( rule__ConstraintParty__Group_5__0 )? ) )
            // InternalPactDSL.g:5448:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            {
            // InternalPactDSL.g:5448:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            // InternalPactDSL.g:5449:2: ( rule__ConstraintParty__Group_5__0 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup_5()); 
            // InternalPactDSL.g:5450:2: ( rule__ConstraintParty__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==36) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPactDSL.g:5450:3: rule__ConstraintParty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintPartyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__5__Impl"


    // $ANTLR start "rule__ConstraintParty__Group_5__0"
    // InternalPactDSL.g:5459:1: rule__ConstraintParty__Group_5__0 : rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 ;
    public final void rule__ConstraintParty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5463:1: ( rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 )
            // InternalPactDSL.g:5464:2: rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintParty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__0"


    // $ANTLR start "rule__ConstraintParty__Group_5__0__Impl"
    // InternalPactDSL.g:5471:1: rule__ConstraintParty__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintParty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5475:1: ( ( 'to' ) )
            // InternalPactDSL.g:5476:1: ( 'to' )
            {
            // InternalPactDSL.g:5476:1: ( 'to' )
            // InternalPactDSL.g:5477:2: 'to'
            {
             before(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__0__Impl"


    // $ANTLR start "rule__ConstraintParty__Group_5__1"
    // InternalPactDSL.g:5486:1: rule__ConstraintParty__Group_5__1 : rule__ConstraintParty__Group_5__1__Impl ;
    public final void rule__ConstraintParty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5490:1: ( rule__ConstraintParty__Group_5__1__Impl )
            // InternalPactDSL.g:5491:2: rule__ConstraintParty__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__1"


    // $ANTLR start "rule__ConstraintParty__Group_5__1__Impl"
    // InternalPactDSL.g:5497:1: rule__ConstraintParty__Group_5__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__ConstraintParty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5501:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:5502:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:5502:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:5503:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:5504:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:5504:3: rule__ConstraintParty__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__0"
    // InternalPactDSL.g:5513:1: rule__ConstraintThirdParty__Group__0 : rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 ;
    public final void rule__ConstraintThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5517:1: ( rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 )
            // InternalPactDSL.g:5518:2: rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group__0__Impl"
    // InternalPactDSL.g:5525:1: rule__ConstraintThirdParty__Group__0__Impl : ( 'ConstraintThirdParty:' ) ;
    public final void rule__ConstraintThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5529:1: ( ( 'ConstraintThirdParty:' ) )
            // InternalPactDSL.g:5530:1: ( 'ConstraintThirdParty:' )
            {
            // InternalPactDSL.g:5530:1: ( 'ConstraintThirdParty:' )
            // InternalPactDSL.g:5531:2: 'ConstraintThirdParty:'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__1"
    // InternalPactDSL.g:5540:1: rule__ConstraintThirdParty__Group__1 : rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 ;
    public final void rule__ConstraintThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5544:1: ( rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 )
            // InternalPactDSL.g:5545:2: rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ConstraintThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group__1__Impl"
    // InternalPactDSL.g:5552:1: rule__ConstraintThirdParty__Group__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5556:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5557:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5557:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5558:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5559:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5559:3: rule__ConstraintThirdParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__2"
    // InternalPactDSL.g:5567:1: rule__ConstraintThirdParty__Group__2 : rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 ;
    public final void rule__ConstraintThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5571:1: ( rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 )
            // InternalPactDSL.g:5572:2: rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__2"


    // $ANTLR start "rule__ConstraintThirdParty__Group__2__Impl"
    // InternalPactDSL.g:5579:1: rule__ConstraintThirdParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5583:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5584:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5584:1: ( 'mustNot' )
            // InternalPactDSL.g:5585:2: 'mustNot'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__2__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__3"
    // InternalPactDSL.g:5594:1: rule__ConstraintThirdParty__Group__3 : rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 ;
    public final void rule__ConstraintThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5598:1: ( rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 )
            // InternalPactDSL.g:5599:2: rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__3"


    // $ANTLR start "rule__ConstraintThirdParty__Group__3__Impl"
    // InternalPactDSL.g:5606:1: rule__ConstraintThirdParty__Group__3__Impl : ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5610:1: ( ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5611:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5611:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5612:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5613:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5613:3: rule__ConstraintThirdParty__ForbiddenActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__ForbiddenActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__3__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__4"
    // InternalPactDSL.g:5621:1: rule__ConstraintThirdParty__Group__4 : rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 ;
    public final void rule__ConstraintThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5625:1: ( rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 )
            // InternalPactDSL.g:5626:2: rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__4"


    // $ANTLR start "rule__ConstraintThirdParty__Group__4__Impl"
    // InternalPactDSL.g:5633:1: rule__ConstraintThirdParty__Group__4__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5637:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:5638:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:5638:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:5639:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5640:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPactDSL.g:5640:3: rule__ConstraintThirdParty__SuperTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__SuperTypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__4__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__5"
    // InternalPactDSL.g:5648:1: rule__ConstraintThirdParty__Group__5 : rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 ;
    public final void rule__ConstraintThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5652:1: ( rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 )
            // InternalPactDSL.g:5653:2: rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__5"


    // $ANTLR start "rule__ConstraintThirdParty__Group__5__Impl"
    // InternalPactDSL.g:5660:1: rule__ConstraintThirdParty__Group__5__Impl : ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) ;
    public final void rule__ConstraintThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5664:1: ( ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) )
            // InternalPactDSL.g:5665:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            {
            // InternalPactDSL.g:5665:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            // InternalPactDSL.g:5666:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 
            // InternalPactDSL.g:5667:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPactDSL.g:5667:3: rule__ConstraintThirdParty__AdditionalInfoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__AdditionalInfoAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__5__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__6"
    // InternalPactDSL.g:5675:1: rule__ConstraintThirdParty__Group__6 : rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 ;
    public final void rule__ConstraintThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5679:1: ( rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 )
            // InternalPactDSL.g:5680:2: rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__6"


    // $ANTLR start "rule__ConstraintThirdParty__Group__6__Impl"
    // InternalPactDSL.g:5687:1: rule__ConstraintThirdParty__Group__6__Impl : ( ( rule__ConstraintThirdParty__Group_6__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5691:1: ( ( ( rule__ConstraintThirdParty__Group_6__0 )? ) )
            // InternalPactDSL.g:5692:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            {
            // InternalPactDSL.g:5692:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            // InternalPactDSL.g:5693:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 
            // InternalPactDSL.g:5694:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPactDSL.g:5694:3: rule__ConstraintThirdParty__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__6__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__7"
    // InternalPactDSL.g:5702:1: rule__ConstraintThirdParty__Group__7 : rule__ConstraintThirdParty__Group__7__Impl ;
    public final void rule__ConstraintThirdParty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5706:1: ( rule__ConstraintThirdParty__Group__7__Impl )
            // InternalPactDSL.g:5707:2: rule__ConstraintThirdParty__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__7"


    // $ANTLR start "rule__ConstraintThirdParty__Group__7__Impl"
    // InternalPactDSL.g:5713:1: rule__ConstraintThirdParty__Group__7__Impl : ( ( rule__ConstraintThirdParty__Group_7__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5717:1: ( ( ( rule__ConstraintThirdParty__Group_7__0 )? ) )
            // InternalPactDSL.g:5718:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            {
            // InternalPactDSL.g:5718:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            // InternalPactDSL.g:5719:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 
            // InternalPactDSL.g:5720:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==59) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPactDSL.g:5720:3: rule__ConstraintThirdParty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__7__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__0"
    // InternalPactDSL.g:5729:1: rule__ConstraintThirdParty__Group_6__0 : rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 ;
    public final void rule__ConstraintThirdParty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5733:1: ( rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 )
            // InternalPactDSL.g:5734:2: rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintThirdParty__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__0__Impl"
    // InternalPactDSL.g:5741:1: rule__ConstraintThirdParty__Group_6__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintThirdParty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5745:1: ( ( 'to' ) )
            // InternalPactDSL.g:5746:1: ( 'to' )
            {
            // InternalPactDSL.g:5746:1: ( 'to' )
            // InternalPactDSL.g:5747:2: 'to'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__1"
    // InternalPactDSL.g:5756:1: rule__ConstraintThirdParty__Group_6__1 : rule__ConstraintThirdParty__Group_6__1__Impl ;
    public final void rule__ConstraintThirdParty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5760:1: ( rule__ConstraintThirdParty__Group_6__1__Impl )
            // InternalPactDSL.g:5761:2: rule__ConstraintThirdParty__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__1__Impl"
    // InternalPactDSL.g:5767:1: rule__ConstraintThirdParty__Group_6__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5771:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) )
            // InternalPactDSL.g:5772:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            {
            // InternalPactDSL.g:5772:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            // InternalPactDSL.g:5773:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 
            // InternalPactDSL.g:5774:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            // InternalPactDSL.g:5774:3: rule__ConstraintThirdParty__SuperTypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__0"
    // InternalPactDSL.g:5783:1: rule__ConstraintThirdParty__Group_7__0 : rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 ;
    public final void rule__ConstraintThirdParty__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5787:1: ( rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 )
            // InternalPactDSL.g:5788:2: rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1
            {
            pushFollow(FOLLOW_46);
            rule__ConstraintThirdParty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__0__Impl"
    // InternalPactDSL.g:5795:1: rule__ConstraintThirdParty__Group_7__0__Impl : ( 'unless' ) ;
    public final void rule__ConstraintThirdParty__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5799:1: ( ( 'unless' ) )
            // InternalPactDSL.g:5800:1: ( 'unless' )
            {
            // InternalPactDSL.g:5800:1: ( 'unless' )
            // InternalPactDSL.g:5801:2: 'unless'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__1"
    // InternalPactDSL.g:5810:1: rule__ConstraintThirdParty__Group_7__1 : rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 ;
    public final void rule__ConstraintThirdParty__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5814:1: ( rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 )
            // InternalPactDSL.g:5815:2: rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2
            {
            pushFollow(FOLLOW_47);
            rule__ConstraintThirdParty__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__1__Impl"
    // InternalPactDSL.g:5822:1: rule__ConstraintThirdParty__Group_7__1__Impl : ( 'withWrittenConsent' ) ;
    public final void rule__ConstraintThirdParty__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5826:1: ( ( 'withWrittenConsent' ) )
            // InternalPactDSL.g:5827:1: ( 'withWrittenConsent' )
            {
            // InternalPactDSL.g:5827:1: ( 'withWrittenConsent' )
            // InternalPactDSL.g:5828:2: 'withWrittenConsent'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__2"
    // InternalPactDSL.g:5837:1: rule__ConstraintThirdParty__Group_7__2 : rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 ;
    public final void rule__ConstraintThirdParty__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5841:1: ( rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 )
            // InternalPactDSL.g:5842:2: rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintThirdParty__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__2"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__2__Impl"
    // InternalPactDSL.g:5849:1: rule__ConstraintThirdParty__Group_7__2__Impl : ( 'of' ) ;
    public final void rule__ConstraintThirdParty__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5853:1: ( ( 'of' ) )
            // InternalPactDSL.g:5854:1: ( 'of' )
            {
            // InternalPactDSL.g:5854:1: ( 'of' )
            // InternalPactDSL.g:5855:2: 'of'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__2__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__3"
    // InternalPactDSL.g:5864:1: rule__ConstraintThirdParty__Group_7__3 : rule__ConstraintThirdParty__Group_7__3__Impl ;
    public final void rule__ConstraintThirdParty__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5868:1: ( rule__ConstraintThirdParty__Group_7__3__Impl )
            // InternalPactDSL.g:5869:2: rule__ConstraintThirdParty__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__3"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__3__Impl"
    // InternalPactDSL.g:5875:1: rule__ConstraintThirdParty__Group_7__3__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5879:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) )
            // InternalPactDSL.g:5880:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            {
            // InternalPactDSL.g:5880:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            // InternalPactDSL.g:5881:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 
            // InternalPactDSL.g:5882:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            // InternalPactDSL.g:5882:3: rule__ConstraintThirdParty__SuperTypeAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__3__Impl"


    // $ANTLR start "rule__ForConvenience__Group__0"
    // InternalPactDSL.g:5891:1: rule__ForConvenience__Group__0 : rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 ;
    public final void rule__ForConvenience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5895:1: ( rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 )
            // InternalPactDSL.g:5896:2: rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ForConvenience__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__0"


    // $ANTLR start "rule__ForConvenience__Group__0__Impl"
    // InternalPactDSL.g:5903:1: rule__ForConvenience__Group__0__Impl : ( 'TerminationForConvenience:' ) ;
    public final void rule__ForConvenience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5907:1: ( ( 'TerminationForConvenience:' ) )
            // InternalPactDSL.g:5908:1: ( 'TerminationForConvenience:' )
            {
            // InternalPactDSL.g:5908:1: ( 'TerminationForConvenience:' )
            // InternalPactDSL.g:5909:2: 'TerminationForConvenience:'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__0__Impl"


    // $ANTLR start "rule__ForConvenience__Group__1"
    // InternalPactDSL.g:5918:1: rule__ForConvenience__Group__1 : rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 ;
    public final void rule__ForConvenience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5922:1: ( rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 )
            // InternalPactDSL.g:5923:2: rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__ForConvenience__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__1"


    // $ANTLR start "rule__ForConvenience__Group__1__Impl"
    // InternalPactDSL.g:5930:1: rule__ForConvenience__Group__1__Impl : ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForConvenience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5934:1: ( ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:5935:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:5935:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:5936:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:5936:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5937:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5938:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5938:4: rule__ForConvenience__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForConvenience__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:5941:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:5942:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5943:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPactDSL.g:5943:4: rule__ForConvenience__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForConvenience__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__1__Impl"


    // $ANTLR start "rule__ForConvenience__Group__2"
    // InternalPactDSL.g:5952:1: rule__ForConvenience__Group__2 : rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 ;
    public final void rule__ForConvenience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5956:1: ( rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 )
            // InternalPactDSL.g:5957:2: rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__ForConvenience__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__2"


    // $ANTLR start "rule__ForConvenience__Group__2__Impl"
    // InternalPactDSL.g:5964:1: rule__ForConvenience__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForConvenience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5968:1: ( ( 'may' ) )
            // InternalPactDSL.g:5969:1: ( 'may' )
            {
            // InternalPactDSL.g:5969:1: ( 'may' )
            // InternalPactDSL.g:5970:2: 'may'
            {
             before(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__2__Impl"


    // $ANTLR start "rule__ForConvenience__Group__3"
    // InternalPactDSL.g:5979:1: rule__ForConvenience__Group__3 : rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 ;
    public final void rule__ForConvenience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5983:1: ( rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 )
            // InternalPactDSL.g:5984:2: rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ForConvenience__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__3"


    // $ANTLR start "rule__ForConvenience__Group__3__Impl"
    // InternalPactDSL.g:5991:1: rule__ForConvenience__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForConvenience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5995:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:5996:1: ( 'terminate' )
            {
            // InternalPactDSL.g:5996:1: ( 'terminate' )
            // InternalPactDSL.g:5997:2: 'terminate'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__3__Impl"


    // $ANTLR start "rule__ForConvenience__Group__4"
    // InternalPactDSL.g:6006:1: rule__ForConvenience__Group__4 : rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 ;
    public final void rule__ForConvenience__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6010:1: ( rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 )
            // InternalPactDSL.g:6011:2: rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ForConvenience__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__4"


    // $ANTLR start "rule__ForConvenience__Group__4__Impl"
    // InternalPactDSL.g:6018:1: rule__ForConvenience__Group__4__Impl : ( 'by' ) ;
    public final void rule__ForConvenience__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6022:1: ( ( 'by' ) )
            // InternalPactDSL.g:6023:1: ( 'by' )
            {
            // InternalPactDSL.g:6023:1: ( 'by' )
            // InternalPactDSL.g:6024:2: 'by'
            {
             before(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__4__Impl"


    // $ANTLR start "rule__ForConvenience__Group__5"
    // InternalPactDSL.g:6033:1: rule__ForConvenience__Group__5 : rule__ForConvenience__Group__5__Impl ;
    public final void rule__ForConvenience__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6037:1: ( rule__ForConvenience__Group__5__Impl )
            // InternalPactDSL.g:6038:2: rule__ForConvenience__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__5"


    // $ANTLR start "rule__ForConvenience__Group__5__Impl"
    // InternalPactDSL.g:6044:1: rule__ForConvenience__Group__5__Impl : ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) ;
    public final void rule__ForConvenience__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6048:1: ( ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) )
            // InternalPactDSL.g:6049:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            {
            // InternalPactDSL.g:6049:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            // InternalPactDSL.g:6050:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 
            // InternalPactDSL.g:6051:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            // InternalPactDSL.g:6051:3: rule__ForConvenience__CustomTerminationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__CustomTerminationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__5__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__0"
    // InternalPactDSL.g:6060:1: rule__OnReasonableNotice__Group__0 : rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 ;
    public final void rule__OnReasonableNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6064:1: ( rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 )
            // InternalPactDSL.g:6065:2: rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OnReasonableNotice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__0"


    // $ANTLR start "rule__OnReasonableNotice__Group__0__Impl"
    // InternalPactDSL.g:6072:1: rule__OnReasonableNotice__Group__0__Impl : ( 'TerminationOnReasonableNotice:' ) ;
    public final void rule__OnReasonableNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6076:1: ( ( 'TerminationOnReasonableNotice:' ) )
            // InternalPactDSL.g:6077:1: ( 'TerminationOnReasonableNotice:' )
            {
            // InternalPactDSL.g:6077:1: ( 'TerminationOnReasonableNotice:' )
            // InternalPactDSL.g:6078:2: 'TerminationOnReasonableNotice:'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__0__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__1"
    // InternalPactDSL.g:6087:1: rule__OnReasonableNotice__Group__1 : rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 ;
    public final void rule__OnReasonableNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6091:1: ( rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 )
            // InternalPactDSL.g:6092:2: rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__OnReasonableNotice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__1"


    // $ANTLR start "rule__OnReasonableNotice__Group__1__Impl"
    // InternalPactDSL.g:6099:1: rule__OnReasonableNotice__Group__1__Impl : ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnReasonableNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6103:1: ( ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6104:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6104:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6105:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6105:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6106:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6107:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6107:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnReasonableNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6110:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6111:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6112:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPactDSL.g:6112:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnReasonableNotice__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__1__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__2"
    // InternalPactDSL.g:6121:1: rule__OnReasonableNotice__Group__2 : rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 ;
    public final void rule__OnReasonableNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6125:1: ( rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 )
            // InternalPactDSL.g:6126:2: rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__OnReasonableNotice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__2"


    // $ANTLR start "rule__OnReasonableNotice__Group__2__Impl"
    // InternalPactDSL.g:6133:1: rule__OnReasonableNotice__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnReasonableNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6137:1: ( ( 'may' ) )
            // InternalPactDSL.g:6138:1: ( 'may' )
            {
            // InternalPactDSL.g:6138:1: ( 'may' )
            // InternalPactDSL.g:6139:2: 'may'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__2__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__3"
    // InternalPactDSL.g:6148:1: rule__OnReasonableNotice__Group__3 : rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 ;
    public final void rule__OnReasonableNotice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6152:1: ( rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 )
            // InternalPactDSL.g:6153:2: rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__OnReasonableNotice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__3"


    // $ANTLR start "rule__OnReasonableNotice__Group__3__Impl"
    // InternalPactDSL.g:6160:1: rule__OnReasonableNotice__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnReasonableNotice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6164:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6165:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6165:1: ( 'terminate' )
            // InternalPactDSL.g:6166:2: 'terminate'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__3__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__4"
    // InternalPactDSL.g:6175:1: rule__OnReasonableNotice__Group__4 : rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 ;
    public final void rule__OnReasonableNotice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6179:1: ( rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 )
            // InternalPactDSL.g:6180:2: rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__OnReasonableNotice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__4"


    // $ANTLR start "rule__OnReasonableNotice__Group__4__Impl"
    // InternalPactDSL.g:6187:1: rule__OnReasonableNotice__Group__4__Impl : ( 'by' ) ;
    public final void rule__OnReasonableNotice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6191:1: ( ( 'by' ) )
            // InternalPactDSL.g:6192:1: ( 'by' )
            {
            // InternalPactDSL.g:6192:1: ( 'by' )
            // InternalPactDSL.g:6193:2: 'by'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__4__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__5"
    // InternalPactDSL.g:6202:1: rule__OnReasonableNotice__Group__5 : rule__OnReasonableNotice__Group__5__Impl ;
    public final void rule__OnReasonableNotice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6206:1: ( rule__OnReasonableNotice__Group__5__Impl )
            // InternalPactDSL.g:6207:2: rule__OnReasonableNotice__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__5"


    // $ANTLR start "rule__OnReasonableNotice__Group__5__Impl"
    // InternalPactDSL.g:6213:1: rule__OnReasonableNotice__Group__5__Impl : ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) ;
    public final void rule__OnReasonableNotice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6217:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) )
            // InternalPactDSL.g:6218:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            {
            // InternalPactDSL.g:6218:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            // InternalPactDSL.g:6219:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 
            // InternalPactDSL.g:6220:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            // InternalPactDSL.g:6220:3: rule__OnReasonableNotice__SuperTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__SuperTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__5__Impl"


    // $ANTLR start "rule__ForBreach__Group__0"
    // InternalPactDSL.g:6229:1: rule__ForBreach__Group__0 : rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 ;
    public final void rule__ForBreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6233:1: ( rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 )
            // InternalPactDSL.g:6234:2: rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ForBreach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__0"


    // $ANTLR start "rule__ForBreach__Group__0__Impl"
    // InternalPactDSL.g:6241:1: rule__ForBreach__Group__0__Impl : ( 'TerminationForBreach:' ) ;
    public final void rule__ForBreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6245:1: ( ( 'TerminationForBreach:' ) )
            // InternalPactDSL.g:6246:1: ( 'TerminationForBreach:' )
            {
            // InternalPactDSL.g:6246:1: ( 'TerminationForBreach:' )
            // InternalPactDSL.g:6247:2: 'TerminationForBreach:'
            {
             before(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__0__Impl"


    // $ANTLR start "rule__ForBreach__Group__1"
    // InternalPactDSL.g:6256:1: rule__ForBreach__Group__1 : rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 ;
    public final void rule__ForBreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6260:1: ( rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 )
            // InternalPactDSL.g:6261:2: rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__ForBreach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__1"


    // $ANTLR start "rule__ForBreach__Group__1__Impl"
    // InternalPactDSL.g:6268:1: rule__ForBreach__Group__1__Impl : ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForBreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6272:1: ( ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6273:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6273:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6274:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6274:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6275:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6276:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6276:4: rule__ForBreach__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForBreach__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6279:2: ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6280:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6281:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPactDSL.g:6281:4: rule__ForBreach__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForBreach__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__1__Impl"


    // $ANTLR start "rule__ForBreach__Group__2"
    // InternalPactDSL.g:6290:1: rule__ForBreach__Group__2 : rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 ;
    public final void rule__ForBreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6294:1: ( rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 )
            // InternalPactDSL.g:6295:2: rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__ForBreach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__2"


    // $ANTLR start "rule__ForBreach__Group__2__Impl"
    // InternalPactDSL.g:6302:1: rule__ForBreach__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForBreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6306:1: ( ( 'may' ) )
            // InternalPactDSL.g:6307:1: ( 'may' )
            {
            // InternalPactDSL.g:6307:1: ( 'may' )
            // InternalPactDSL.g:6308:2: 'may'
            {
             before(grammarAccess.getForBreachAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__2__Impl"


    // $ANTLR start "rule__ForBreach__Group__3"
    // InternalPactDSL.g:6317:1: rule__ForBreach__Group__3 : rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 ;
    public final void rule__ForBreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6321:1: ( rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 )
            // InternalPactDSL.g:6322:2: rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__ForBreach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__3"


    // $ANTLR start "rule__ForBreach__Group__3__Impl"
    // InternalPactDSL.g:6329:1: rule__ForBreach__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForBreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6333:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6334:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6334:1: ( 'terminate' )
            // InternalPactDSL.g:6335:2: 'terminate'
            {
             before(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__3__Impl"


    // $ANTLR start "rule__ForBreach__Group__4"
    // InternalPactDSL.g:6344:1: rule__ForBreach__Group__4 : rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 ;
    public final void rule__ForBreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6348:1: ( rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 )
            // InternalPactDSL.g:6349:2: rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ForBreach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__4"


    // $ANTLR start "rule__ForBreach__Group__4__Impl"
    // InternalPactDSL.g:6356:1: rule__ForBreach__Group__4__Impl : ( 'forBreachOf' ) ;
    public final void rule__ForBreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6360:1: ( ( 'forBreachOf' ) )
            // InternalPactDSL.g:6361:1: ( 'forBreachOf' )
            {
            // InternalPactDSL.g:6361:1: ( 'forBreachOf' )
            // InternalPactDSL.g:6362:2: 'forBreachOf'
            {
             before(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__4__Impl"


    // $ANTLR start "rule__ForBreach__Group__5"
    // InternalPactDSL.g:6371:1: rule__ForBreach__Group__5 : rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 ;
    public final void rule__ForBreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6375:1: ( rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 )
            // InternalPactDSL.g:6376:2: rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__ForBreach__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__5"


    // $ANTLR start "rule__ForBreach__Group__5__Impl"
    // InternalPactDSL.g:6383:1: rule__ForBreach__Group__5__Impl : ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) ;
    public final void rule__ForBreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6387:1: ( ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) )
            // InternalPactDSL.g:6388:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            {
            // InternalPactDSL.g:6388:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            // InternalPactDSL.g:6389:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            {
            // InternalPactDSL.g:6389:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) )
            // InternalPactDSL.g:6390:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:6391:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            // InternalPactDSL.g:6391:4: rule__ForBreach__ObligationBreachedAssignment_5
            {
            pushFollow(FOLLOW_31);
            rule__ForBreach__ObligationBreachedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

            }

            // InternalPactDSL.g:6394:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            // InternalPactDSL.g:6395:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:6396:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_STRING) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPactDSL.g:6396:4: rule__ForBreach__ObligationBreachedAssignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ForBreach__ObligationBreachedAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__5__Impl"


    // $ANTLR start "rule__ForBreach__Group__6"
    // InternalPactDSL.g:6405:1: rule__ForBreach__Group__6 : rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 ;
    public final void rule__ForBreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6409:1: ( rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 )
            // InternalPactDSL.g:6410:2: rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ForBreach__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__6"


    // $ANTLR start "rule__ForBreach__Group__6__Impl"
    // InternalPactDSL.g:6417:1: rule__ForBreach__Group__6__Impl : ( 'by' ) ;
    public final void rule__ForBreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6421:1: ( ( 'by' ) )
            // InternalPactDSL.g:6422:1: ( 'by' )
            {
            // InternalPactDSL.g:6422:1: ( 'by' )
            // InternalPactDSL.g:6423:2: 'by'
            {
             before(grammarAccess.getForBreachAccess().getByKeyword_6()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getByKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__6__Impl"


    // $ANTLR start "rule__ForBreach__Group__7"
    // InternalPactDSL.g:6432:1: rule__ForBreach__Group__7 : rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 ;
    public final void rule__ForBreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6436:1: ( rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 )
            // InternalPactDSL.g:6437:2: rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8
            {
            pushFollow(FOLLOW_51);
            rule__ForBreach__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__7"


    // $ANTLR start "rule__ForBreach__Group__7__Impl"
    // InternalPactDSL.g:6444:1: rule__ForBreach__Group__7__Impl : ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) ;
    public final void rule__ForBreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6448:1: ( ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:6449:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:6449:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:6450:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:6451:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            // InternalPactDSL.g:6451:3: rule__ForBreach__SuperTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__SuperTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__7__Impl"


    // $ANTLR start "rule__ForBreach__Group__8"
    // InternalPactDSL.g:6459:1: rule__ForBreach__Group__8 : rule__ForBreach__Group__8__Impl ;
    public final void rule__ForBreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6463:1: ( rule__ForBreach__Group__8__Impl )
            // InternalPactDSL.g:6464:2: rule__ForBreach__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__8"


    // $ANTLR start "rule__ForBreach__Group__8__Impl"
    // InternalPactDSL.g:6470:1: rule__ForBreach__Group__8__Impl : ( ( rule__ForBreach__Group_8__0 )? ) ;
    public final void rule__ForBreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6474:1: ( ( ( rule__ForBreach__Group_8__0 )? ) )
            // InternalPactDSL.g:6475:1: ( ( rule__ForBreach__Group_8__0 )? )
            {
            // InternalPactDSL.g:6475:1: ( ( rule__ForBreach__Group_8__0 )? )
            // InternalPactDSL.g:6476:2: ( rule__ForBreach__Group_8__0 )?
            {
             before(grammarAccess.getForBreachAccess().getGroup_8()); 
            // InternalPactDSL.g:6477:2: ( rule__ForBreach__Group_8__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==59) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPactDSL.g:6477:3: rule__ForBreach__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForBreach__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForBreachAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__8__Impl"


    // $ANTLR start "rule__ForBreach__Group_8__0"
    // InternalPactDSL.g:6486:1: rule__ForBreach__Group_8__0 : rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 ;
    public final void rule__ForBreach__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6490:1: ( rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 )
            // InternalPactDSL.g:6491:2: rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ForBreach__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__0"


    // $ANTLR start "rule__ForBreach__Group_8__0__Impl"
    // InternalPactDSL.g:6498:1: rule__ForBreach__Group_8__0__Impl : ( 'unless' ) ;
    public final void rule__ForBreach__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6502:1: ( ( 'unless' ) )
            // InternalPactDSL.g:6503:1: ( 'unless' )
            {
            // InternalPactDSL.g:6503:1: ( 'unless' )
            // InternalPactDSL.g:6504:2: 'unless'
            {
             before(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__0__Impl"


    // $ANTLR start "rule__ForBreach__Group_8__1"
    // InternalPactDSL.g:6513:1: rule__ForBreach__Group_8__1 : rule__ForBreach__Group_8__1__Impl ;
    public final void rule__ForBreach__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6517:1: ( rule__ForBreach__Group_8__1__Impl )
            // InternalPactDSL.g:6518:2: rule__ForBreach__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__1"


    // $ANTLR start "rule__ForBreach__Group_8__1__Impl"
    // InternalPactDSL.g:6524:1: rule__ForBreach__Group_8__1__Impl : ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) ;
    public final void rule__ForBreach__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6528:1: ( ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) )
            // InternalPactDSL.g:6529:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            {
            // InternalPactDSL.g:6529:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            // InternalPactDSL.g:6530:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 
            // InternalPactDSL.g:6531:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            // InternalPactDSL.g:6531:3: rule__ForBreach__RemedialSchemeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__RemedialSchemeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__1__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__0"
    // InternalPactDSL.g:6540:1: rule__OnInsolvencyEvent__Group__0 : rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 ;
    public final void rule__OnInsolvencyEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6544:1: ( rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 )
            // InternalPactDSL.g:6545:2: rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OnInsolvencyEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__0"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__0__Impl"
    // InternalPactDSL.g:6552:1: rule__OnInsolvencyEvent__Group__0__Impl : ( 'TerminationUponInsolvency:' ) ;
    public final void rule__OnInsolvencyEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6556:1: ( ( 'TerminationUponInsolvency:' ) )
            // InternalPactDSL.g:6557:1: ( 'TerminationUponInsolvency:' )
            {
            // InternalPactDSL.g:6557:1: ( 'TerminationUponInsolvency:' )
            // InternalPactDSL.g:6558:2: 'TerminationUponInsolvency:'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__0__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__1"
    // InternalPactDSL.g:6567:1: rule__OnInsolvencyEvent__Group__1 : rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 ;
    public final void rule__OnInsolvencyEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6571:1: ( rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 )
            // InternalPactDSL.g:6572:2: rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__OnInsolvencyEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__1"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__1__Impl"
    // InternalPactDSL.g:6579:1: rule__OnInsolvencyEvent__Group__1__Impl : ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnInsolvencyEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6583:1: ( ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6584:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6584:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6585:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6585:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6586:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6587:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6587:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6590:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6591:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6592:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalPactDSL.g:6592:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__1__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__2"
    // InternalPactDSL.g:6601:1: rule__OnInsolvencyEvent__Group__2 : rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 ;
    public final void rule__OnInsolvencyEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6605:1: ( rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 )
            // InternalPactDSL.g:6606:2: rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__OnInsolvencyEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__2"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__2__Impl"
    // InternalPactDSL.g:6613:1: rule__OnInsolvencyEvent__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnInsolvencyEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6617:1: ( ( 'may' ) )
            // InternalPactDSL.g:6618:1: ( 'may' )
            {
            // InternalPactDSL.g:6618:1: ( 'may' )
            // InternalPactDSL.g:6619:2: 'may'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__2__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__3"
    // InternalPactDSL.g:6628:1: rule__OnInsolvencyEvent__Group__3 : rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 ;
    public final void rule__OnInsolvencyEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6632:1: ( rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 )
            // InternalPactDSL.g:6633:2: rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__OnInsolvencyEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__3"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__3__Impl"
    // InternalPactDSL.g:6640:1: rule__OnInsolvencyEvent__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnInsolvencyEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6644:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6645:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6645:1: ( 'terminate' )
            // InternalPactDSL.g:6646:2: 'terminate'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__3__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__4"
    // InternalPactDSL.g:6655:1: rule__OnInsolvencyEvent__Group__4 : rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 ;
    public final void rule__OnInsolvencyEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6659:1: ( rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 )
            // InternalPactDSL.g:6660:2: rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__OnInsolvencyEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__4"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__4__Impl"
    // InternalPactDSL.g:6667:1: rule__OnInsolvencyEvent__Group__4__Impl : ( 'upon' ) ;
    public final void rule__OnInsolvencyEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6671:1: ( ( 'upon' ) )
            // InternalPactDSL.g:6672:1: ( 'upon' )
            {
            // InternalPactDSL.g:6672:1: ( 'upon' )
            // InternalPactDSL.g:6673:2: 'upon'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__4__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__5"
    // InternalPactDSL.g:6682:1: rule__OnInsolvencyEvent__Group__5 : rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 ;
    public final void rule__OnInsolvencyEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6686:1: ( rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 )
            // InternalPactDSL.g:6687:2: rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__OnInsolvencyEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__5"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__5__Impl"
    // InternalPactDSL.g:6694:1: rule__OnInsolvencyEvent__Group__5__Impl : ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6698:1: ( ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) )
            // InternalPactDSL.g:6699:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            {
            // InternalPactDSL.g:6699:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            // InternalPactDSL.g:6700:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 
            // InternalPactDSL.g:6701:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            // InternalPactDSL.g:6701:3: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__InsolvencyEventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__5__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__6"
    // InternalPactDSL.g:6709:1: rule__OnInsolvencyEvent__Group__6 : rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 ;
    public final void rule__OnInsolvencyEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6713:1: ( rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 )
            // InternalPactDSL.g:6714:2: rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__OnInsolvencyEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__6"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__6__Impl"
    // InternalPactDSL.g:6721:1: rule__OnInsolvencyEvent__Group__6__Impl : ( 'of' ) ;
    public final void rule__OnInsolvencyEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6725:1: ( ( 'of' ) )
            // InternalPactDSL.g:6726:1: ( 'of' )
            {
            // InternalPactDSL.g:6726:1: ( 'of' )
            // InternalPactDSL.g:6727:2: 'of'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__6__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__7"
    // InternalPactDSL.g:6736:1: rule__OnInsolvencyEvent__Group__7 : rule__OnInsolvencyEvent__Group__7__Impl ;
    public final void rule__OnInsolvencyEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6740:1: ( rule__OnInsolvencyEvent__Group__7__Impl )
            // InternalPactDSL.g:6741:2: rule__OnInsolvencyEvent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__7"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__7__Impl"
    // InternalPactDSL.g:6747:1: rule__OnInsolvencyEvent__Group__7__Impl : ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6751:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:6752:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:6752:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:6753:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:6754:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            // InternalPactDSL.g:6754:3: rule__OnInsolvencyEvent__SuperTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__SuperTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__7__Impl"


    // $ANTLR start "rule__CustomTermination__Group__0"
    // InternalPactDSL.g:6763:1: rule__CustomTermination__Group__0 : rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 ;
    public final void rule__CustomTermination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6767:1: ( rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 )
            // InternalPactDSL.g:6768:2: rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CustomTermination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__0"


    // $ANTLR start "rule__CustomTermination__Group__0__Impl"
    // InternalPactDSL.g:6775:1: rule__CustomTermination__Group__0__Impl : ( 'Termination:' ) ;
    public final void rule__CustomTermination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6779:1: ( ( 'Termination:' ) )
            // InternalPactDSL.g:6780:1: ( 'Termination:' )
            {
            // InternalPactDSL.g:6780:1: ( 'Termination:' )
            // InternalPactDSL.g:6781:2: 'Termination:'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__0__Impl"


    // $ANTLR start "rule__CustomTermination__Group__1"
    // InternalPactDSL.g:6790:1: rule__CustomTermination__Group__1 : rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 ;
    public final void rule__CustomTermination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6794:1: ( rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 )
            // InternalPactDSL.g:6795:2: rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__CustomTermination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__1"


    // $ANTLR start "rule__CustomTermination__Group__1__Impl"
    // InternalPactDSL.g:6802:1: rule__CustomTermination__Group__1__Impl : ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__CustomTermination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6806:1: ( ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6807:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6807:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6808:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6808:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6809:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6810:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6810:4: rule__CustomTermination__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__CustomTermination__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6813:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6814:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6815:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalPactDSL.g:6815:4: rule__CustomTermination__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CustomTermination__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__1__Impl"


    // $ANTLR start "rule__CustomTermination__Group__2"
    // InternalPactDSL.g:6824:1: rule__CustomTermination__Group__2 : rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 ;
    public final void rule__CustomTermination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6828:1: ( rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 )
            // InternalPactDSL.g:6829:2: rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__CustomTermination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__2"


    // $ANTLR start "rule__CustomTermination__Group__2__Impl"
    // InternalPactDSL.g:6836:1: rule__CustomTermination__Group__2__Impl : ( 'may' ) ;
    public final void rule__CustomTermination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6840:1: ( ( 'may' ) )
            // InternalPactDSL.g:6841:1: ( 'may' )
            {
            // InternalPactDSL.g:6841:1: ( 'may' )
            // InternalPactDSL.g:6842:2: 'may'
            {
             before(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__2__Impl"


    // $ANTLR start "rule__CustomTermination__Group__3"
    // InternalPactDSL.g:6851:1: rule__CustomTermination__Group__3 : rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 ;
    public final void rule__CustomTermination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6855:1: ( rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 )
            // InternalPactDSL.g:6856:2: rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__CustomTermination__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__3"


    // $ANTLR start "rule__CustomTermination__Group__3__Impl"
    // InternalPactDSL.g:6863:1: rule__CustomTermination__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__CustomTermination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6867:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6868:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6868:1: ( 'terminate' )
            // InternalPactDSL.g:6869:2: 'terminate'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__3__Impl"


    // $ANTLR start "rule__CustomTermination__Group__4"
    // InternalPactDSL.g:6878:1: rule__CustomTermination__Group__4 : rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 ;
    public final void rule__CustomTermination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6882:1: ( rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 )
            // InternalPactDSL.g:6883:2: rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__CustomTermination__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__4"


    // $ANTLR start "rule__CustomTermination__Group__4__Impl"
    // InternalPactDSL.g:6890:1: rule__CustomTermination__Group__4__Impl : ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) ;
    public final void rule__CustomTermination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6894:1: ( ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) )
            // InternalPactDSL.g:6895:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            {
            // InternalPactDSL.g:6895:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            // InternalPactDSL.g:6896:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 
            // InternalPactDSL.g:6897:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            // InternalPactDSL.g:6897:3: rule__CustomTermination__CustomTerminationClauseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__CustomTerminationClauseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__4__Impl"


    // $ANTLR start "rule__CustomTermination__Group__5"
    // InternalPactDSL.g:6905:1: rule__CustomTermination__Group__5 : rule__CustomTermination__Group__5__Impl ;
    public final void rule__CustomTermination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6909:1: ( rule__CustomTermination__Group__5__Impl )
            // InternalPactDSL.g:6910:2: rule__CustomTermination__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__5"


    // $ANTLR start "rule__CustomTermination__Group__5__Impl"
    // InternalPactDSL.g:6916:1: rule__CustomTermination__Group__5__Impl : ( ( rule__CustomTermination__Group_5__0 )? ) ;
    public final void rule__CustomTermination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6920:1: ( ( ( rule__CustomTermination__Group_5__0 )? ) )
            // InternalPactDSL.g:6921:1: ( ( rule__CustomTermination__Group_5__0 )? )
            {
            // InternalPactDSL.g:6921:1: ( ( rule__CustomTermination__Group_5__0 )? )
            // InternalPactDSL.g:6922:2: ( rule__CustomTermination__Group_5__0 )?
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup_5()); 
            // InternalPactDSL.g:6923:2: ( rule__CustomTermination__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPactDSL.g:6923:3: rule__CustomTermination__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTermination__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTerminationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__5__Impl"


    // $ANTLR start "rule__CustomTermination__Group_5__0"
    // InternalPactDSL.g:6932:1: rule__CustomTermination__Group_5__0 : rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 ;
    public final void rule__CustomTermination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6936:1: ( rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 )
            // InternalPactDSL.g:6937:2: rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__CustomTermination__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__0"


    // $ANTLR start "rule__CustomTermination__Group_5__0__Impl"
    // InternalPactDSL.g:6944:1: rule__CustomTermination__Group_5__0__Impl : ( 'by' ) ;
    public final void rule__CustomTermination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6948:1: ( ( 'by' ) )
            // InternalPactDSL.g:6949:1: ( 'by' )
            {
            // InternalPactDSL.g:6949:1: ( 'by' )
            // InternalPactDSL.g:6950:2: 'by'
            {
             before(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__0__Impl"


    // $ANTLR start "rule__CustomTermination__Group_5__1"
    // InternalPactDSL.g:6959:1: rule__CustomTermination__Group_5__1 : rule__CustomTermination__Group_5__1__Impl ;
    public final void rule__CustomTermination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6963:1: ( rule__CustomTermination__Group_5__1__Impl )
            // InternalPactDSL.g:6964:2: rule__CustomTermination__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__1"


    // $ANTLR start "rule__CustomTermination__Group_5__1__Impl"
    // InternalPactDSL.g:6970:1: rule__CustomTermination__Group_5__1__Impl : ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__CustomTermination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6974:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:6975:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:6975:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:6976:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:6977:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:6977:3: rule__CustomTermination__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__1__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__0"
    // InternalPactDSL.g:6986:1: rule__ApplicableLaw__Group__0 : rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 ;
    public final void rule__ApplicableLaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6990:1: ( rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 )
            // InternalPactDSL.g:6991:2: rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ApplicableLaw__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__0"


    // $ANTLR start "rule__ApplicableLaw__Group__0__Impl"
    // InternalPactDSL.g:6998:1: rule__ApplicableLaw__Group__0__Impl : ( 'ApplicableLaw:' ) ;
    public final void rule__ApplicableLaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7002:1: ( ( 'ApplicableLaw:' ) )
            // InternalPactDSL.g:7003:1: ( 'ApplicableLaw:' )
            {
            // InternalPactDSL.g:7003:1: ( 'ApplicableLaw:' )
            // InternalPactDSL.g:7004:2: 'ApplicableLaw:'
            {
             before(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__0__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__1"
    // InternalPactDSL.g:7013:1: rule__ApplicableLaw__Group__1 : rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 ;
    public final void rule__ApplicableLaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7017:1: ( rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 )
            // InternalPactDSL.g:7018:2: rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__ApplicableLaw__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__1"


    // $ANTLR start "rule__ApplicableLaw__Group__1__Impl"
    // InternalPactDSL.g:7025:1: rule__ApplicableLaw__Group__1__Impl : ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) ;
    public final void rule__ApplicableLaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7029:1: ( ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) )
            // InternalPactDSL.g:7030:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            {
            // InternalPactDSL.g:7030:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            // InternalPactDSL.g:7031:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 
            // InternalPactDSL.g:7032:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            // InternalPactDSL.g:7032:3: rule__ApplicableLaw__CustomApplicableLawAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__CustomApplicableLawAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__1__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__2"
    // InternalPactDSL.g:7040:1: rule__ApplicableLaw__Group__2 : rule__ApplicableLaw__Group__2__Impl ;
    public final void rule__ApplicableLaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7044:1: ( rule__ApplicableLaw__Group__2__Impl )
            // InternalPactDSL.g:7045:2: rule__ApplicableLaw__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__2"


    // $ANTLR start "rule__ApplicableLaw__Group__2__Impl"
    // InternalPactDSL.g:7051:1: rule__ApplicableLaw__Group__2__Impl : ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) ;
    public final void rule__ApplicableLaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7055:1: ( ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:7056:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:7056:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:7057:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:7058:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPactDSL.g:7058:3: rule__ApplicableLaw__DefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicableLaw__DefinitionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__2__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__0"
    // InternalPactDSL.g:7067:1: rule__Jurisdiction__Group__0 : rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 ;
    public final void rule__Jurisdiction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7071:1: ( rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 )
            // InternalPactDSL.g:7072:2: rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jurisdiction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__0"


    // $ANTLR start "rule__Jurisdiction__Group__0__Impl"
    // InternalPactDSL.g:7079:1: rule__Jurisdiction__Group__0__Impl : ( 'Jurisdiction:' ) ;
    public final void rule__Jurisdiction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7083:1: ( ( 'Jurisdiction:' ) )
            // InternalPactDSL.g:7084:1: ( 'Jurisdiction:' )
            {
            // InternalPactDSL.g:7084:1: ( 'Jurisdiction:' )
            // InternalPactDSL.g:7085:2: 'Jurisdiction:'
            {
             before(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__0__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__1"
    // InternalPactDSL.g:7094:1: rule__Jurisdiction__Group__1 : rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 ;
    public final void rule__Jurisdiction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7098:1: ( rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 )
            // InternalPactDSL.g:7099:2: rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Jurisdiction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__1"


    // $ANTLR start "rule__Jurisdiction__Group__1__Impl"
    // InternalPactDSL.g:7106:1: rule__Jurisdiction__Group__1__Impl : ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) ;
    public final void rule__Jurisdiction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7110:1: ( ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) )
            // InternalPactDSL.g:7111:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            {
            // InternalPactDSL.g:7111:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            // InternalPactDSL.g:7112:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 
            // InternalPactDSL.g:7113:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            // InternalPactDSL.g:7113:3: rule__Jurisdiction__CustomJurisdictionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__CustomJurisdictionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__1__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__2"
    // InternalPactDSL.g:7121:1: rule__Jurisdiction__Group__2 : rule__Jurisdiction__Group__2__Impl ;
    public final void rule__Jurisdiction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7125:1: ( rule__Jurisdiction__Group__2__Impl )
            // InternalPactDSL.g:7126:2: rule__Jurisdiction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__2"


    // $ANTLR start "rule__Jurisdiction__Group__2__Impl"
    // InternalPactDSL.g:7132:1: rule__Jurisdiction__Group__2__Impl : ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) ;
    public final void rule__Jurisdiction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7136:1: ( ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:7137:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:7137:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:7138:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:7139:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==30) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPactDSL.g:7139:3: rule__Jurisdiction__DefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Jurisdiction__DefinitionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__2__Impl"


    // $ANTLR start "rule__Notices__Group__0"
    // InternalPactDSL.g:7148:1: rule__Notices__Group__0 : rule__Notices__Group__0__Impl rule__Notices__Group__1 ;
    public final void rule__Notices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7152:1: ( rule__Notices__Group__0__Impl rule__Notices__Group__1 )
            // InternalPactDSL.g:7153:2: rule__Notices__Group__0__Impl rule__Notices__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Notices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__0"


    // $ANTLR start "rule__Notices__Group__0__Impl"
    // InternalPactDSL.g:7160:1: rule__Notices__Group__0__Impl : ( 'Notices:' ) ;
    public final void rule__Notices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7164:1: ( ( 'Notices:' ) )
            // InternalPactDSL.g:7165:1: ( 'Notices:' )
            {
            // InternalPactDSL.g:7165:1: ( 'Notices:' )
            // InternalPactDSL.g:7166:2: 'Notices:'
            {
             before(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__0__Impl"


    // $ANTLR start "rule__Notices__Group__1"
    // InternalPactDSL.g:7175:1: rule__Notices__Group__1 : rule__Notices__Group__1__Impl ;
    public final void rule__Notices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7179:1: ( rule__Notices__Group__1__Impl )
            // InternalPactDSL.g:7180:2: rule__Notices__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notices__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__1"


    // $ANTLR start "rule__Notices__Group__1__Impl"
    // InternalPactDSL.g:7186:1: rule__Notices__Group__1__Impl : ( ( rule__Notices__CustomNoticeAssignment_1 ) ) ;
    public final void rule__Notices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7190:1: ( ( ( rule__Notices__CustomNoticeAssignment_1 ) ) )
            // InternalPactDSL.g:7191:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            {
            // InternalPactDSL.g:7191:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            // InternalPactDSL.g:7192:2: ( rule__Notices__CustomNoticeAssignment_1 )
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 
            // InternalPactDSL.g:7193:2: ( rule__Notices__CustomNoticeAssignment_1 )
            // InternalPactDSL.g:7193:3: rule__Notices__CustomNoticeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Notices__CustomNoticeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__1__Impl"


    // $ANTLR start "rule__Model__TitleAssignment_1"
    // InternalPactDSL.g:7202:1: rule__Model__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7206:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7207:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7207:2: ( RULE_STRING )
            // InternalPactDSL.g:7208:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TitleAssignment_1"


    // $ANTLR start "rule__Model__EntityTypesAssignment_4_0"
    // InternalPactDSL.g:7217:1: rule__Model__EntityTypesAssignment_4_0 : ( ruleEntityType ) ;
    public final void rule__Model__EntityTypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7221:1: ( ( ruleEntityType ) )
            // InternalPactDSL.g:7222:2: ( ruleEntityType )
            {
            // InternalPactDSL.g:7222:2: ( ruleEntityType )
            // InternalPactDSL.g:7223:3: ruleEntityType
            {
             before(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntityTypesAssignment_4_0"


    // $ANTLR start "rule__Model__FormalityTypesAssignment_6_0"
    // InternalPactDSL.g:7232:1: rule__Model__FormalityTypesAssignment_6_0 : ( ruleFormalityType ) ;
    public final void rule__Model__FormalityTypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7236:1: ( ( ruleFormalityType ) )
            // InternalPactDSL.g:7237:2: ( ruleFormalityType )
            {
            // InternalPactDSL.g:7237:2: ( ruleFormalityType )
            // InternalPactDSL.g:7238:3: ruleFormalityType
            {
             before(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormalityTypesAssignment_6_0"


    // $ANTLR start "rule__Model__ActionTypesAssignment_8_0"
    // InternalPactDSL.g:7247:1: rule__Model__ActionTypesAssignment_8_0 : ( ruleActionType ) ;
    public final void rule__Model__ActionTypesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7251:1: ( ( ruleActionType ) )
            // InternalPactDSL.g:7252:2: ( ruleActionType )
            {
            // InternalPactDSL.g:7252:2: ( ruleActionType )
            // InternalPactDSL.g:7253:3: ruleActionType
            {
             before(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ActionTypesAssignment_8_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_10_0"
    // InternalPactDSL.g:7262:1: rule__Model__StateTypesAssignment_10_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7266:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:7267:2: ( ruleStateType )
            {
            // InternalPactDSL.g:7267:2: ( ruleStateType )
            // InternalPactDSL.g:7268:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_10_0"


    // $ANTLR start "rule__Model__PrimaryObligationTypesAssignment_12_0"
    // InternalPactDSL.g:7277:1: rule__Model__PrimaryObligationTypesAssignment_12_0 : ( rulePrimaryObligationType ) ;
    public final void rule__Model__PrimaryObligationTypesAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7281:1: ( ( rulePrimaryObligationType ) )
            // InternalPactDSL.g:7282:2: ( rulePrimaryObligationType )
            {
            // InternalPactDSL.g:7282:2: ( rulePrimaryObligationType )
            // InternalPactDSL.g:7283:3: rulePrimaryObligationType
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryObligationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PrimaryObligationTypesAssignment_12_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_14_0"
    // InternalPactDSL.g:7292:1: rule__Model__StateTypesAssignment_14_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7296:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:7297:2: ( ruleStateType )
            {
            // InternalPactDSL.g:7297:2: ( ruleStateType )
            // InternalPactDSL.g:7298:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_14_0"


    // $ANTLR start "rule__Model__TerminationTypesAssignment_16_0"
    // InternalPactDSL.g:7307:1: rule__Model__TerminationTypesAssignment_16_0 : ( ruleTerminationType ) ;
    public final void rule__Model__TerminationTypesAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7311:1: ( ( ruleTerminationType ) )
            // InternalPactDSL.g:7312:2: ( ruleTerminationType )
            {
            // InternalPactDSL.g:7312:2: ( ruleTerminationType )
            // InternalPactDSL.g:7313:3: ruleTerminationType
            {
             before(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_16_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TerminationTypesAssignment_16_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_18_0"
    // InternalPactDSL.g:7322:1: rule__Model__StateTypesAssignment_18_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7326:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:7327:2: ( ruleStateType )
            {
            // InternalPactDSL.g:7327:2: ( ruleStateType )
            // InternalPactDSL.g:7328:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_18_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_18_0"


    // $ANTLR start "rule__Model__BoilerplateTypesAssignment_20_0"
    // InternalPactDSL.g:7337:1: rule__Model__BoilerplateTypesAssignment_20_0 : ( ruleBoilerplateType ) ;
    public final void rule__Model__BoilerplateTypesAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7341:1: ( ( ruleBoilerplateType ) )
            // InternalPactDSL.g:7342:2: ( ruleBoilerplateType )
            {
            // InternalPactDSL.g:7342:2: ( ruleBoilerplateType )
            // InternalPactDSL.g:7343:3: ruleBoilerplateType
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_20_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoilerplateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BoilerplateTypesAssignment_20_0"


    // $ANTLR start "rule__EffectiveDate__DayAssignment_1_0"
    // InternalPactDSL.g:7352:1: rule__EffectiveDate__DayAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__DayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7356:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7357:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7357:2: ( RULE_INT )
            // InternalPactDSL.g:7358:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__DayAssignment_1_0"


    // $ANTLR start "rule__EffectiveDate__MonthAssignment_1_1"
    // InternalPactDSL.g:7367:1: rule__EffectiveDate__MonthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__MonthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7371:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7372:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7372:2: ( RULE_INT )
            // InternalPactDSL.g:7373:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__MonthAssignment_1_1"


    // $ANTLR start "rule__EffectiveDate__YearAssignment_1_2"
    // InternalPactDSL.g:7382:1: rule__EffectiveDate__YearAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__YearAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7386:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7387:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7387:2: ( RULE_INT )
            // InternalPactDSL.g:7388:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__YearAssignment_1_2"


    // $ANTLR start "rule__Party__NameAssignment_1"
    // InternalPactDSL.g:7397:1: rule__Party__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Party__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7401:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:7402:2: ( RULE_ID )
            {
            // InternalPactDSL.g:7402:2: ( RULE_ID )
            // InternalPactDSL.g:7403:3: RULE_ID
            {
             before(grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__NameAssignment_1"


    // $ANTLR start "rule__Party__FullnameAssignment_2"
    // InternalPactDSL.g:7412:1: rule__Party__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Party__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7416:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7417:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7417:2: ( RULE_STRING )
            // InternalPactDSL.g:7418:3: RULE_STRING
            {
             before(grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__FullnameAssignment_2"


    // $ANTLR start "rule__Party__FeatureAssignment_3"
    // InternalPactDSL.g:7427:1: rule__Party__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__Party__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7431:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:7432:2: ( ruleFeature )
            {
            // InternalPactDSL.g:7432:2: ( ruleFeature )
            // InternalPactDSL.g:7433:3: ruleFeature
            {
             before(grammarAccess.getPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__FeatureAssignment_3"


    // $ANTLR start "rule__ThirdParty__NameAssignment_1"
    // InternalPactDSL.g:7442:1: rule__ThirdParty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ThirdParty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7446:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:7447:2: ( RULE_ID )
            {
            // InternalPactDSL.g:7447:2: ( RULE_ID )
            // InternalPactDSL.g:7448:3: RULE_ID
            {
             before(grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__NameAssignment_1"


    // $ANTLR start "rule__ThirdParty__FullnameAssignment_2"
    // InternalPactDSL.g:7457:1: rule__ThirdParty__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ThirdParty__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7461:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7462:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7462:2: ( RULE_STRING )
            // InternalPactDSL.g:7463:3: RULE_STRING
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__FullnameAssignment_2"


    // $ANTLR start "rule__ThirdParty__FeatureAssignment_3"
    // InternalPactDSL.g:7472:1: rule__ThirdParty__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__ThirdParty__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7476:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:7477:2: ( ruleFeature )
            {
            // InternalPactDSL.g:7477:2: ( ruleFeature )
            // InternalPactDSL.g:7478:3: ruleFeature
            {
             before(grammarAccess.getThirdPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getThirdPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__FeatureAssignment_3"


    // $ANTLR start "rule__SubjectMatter__NameAssignment_1"
    // InternalPactDSL.g:7487:1: rule__SubjectMatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubjectMatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7491:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:7492:2: ( RULE_ID )
            {
            // InternalPactDSL.g:7492:2: ( RULE_ID )
            // InternalPactDSL.g:7493:3: RULE_ID
            {
             before(grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__NameAssignment_1"


    // $ANTLR start "rule__SubjectMatter__SubjectMatterAssignment_2"
    // InternalPactDSL.g:7502:1: rule__SubjectMatter__SubjectMatterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubjectMatter__SubjectMatterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7506:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7507:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7507:2: ( RULE_STRING )
            // InternalPactDSL.g:7508:3: RULE_STRING
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__SubjectMatterAssignment_2"


    // $ANTLR start "rule__SubjectMatter__FeatureAssignment_3"
    // InternalPactDSL.g:7517:1: rule__SubjectMatter__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__SubjectMatter__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7521:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:7522:2: ( ruleFeature )
            {
            // InternalPactDSL.g:7522:2: ( ruleFeature )
            // InternalPactDSL.g:7523:3: ruleFeature
            {
             before(grammarAccess.getSubjectMatterAccess().getFeatureFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectMatterAccess().getFeatureFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__FeatureAssignment_3"


    // $ANTLR start "rule__Feature__FeaturetypeAssignment"
    // InternalPactDSL.g:7532:1: rule__Feature__FeaturetypeAssignment : ( ruleFeatureType ) ;
    public final void rule__Feature__FeaturetypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7536:1: ( ( ruleFeatureType ) )
            // InternalPactDSL.g:7537:2: ( ruleFeatureType )
            {
            // InternalPactDSL.g:7537:2: ( ruleFeatureType )
            // InternalPactDSL.g:7538:3: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__FeaturetypeAssignment"


    // $ANTLR start "rule__DefinedTerm__DefinitionAssignment_1"
    // InternalPactDSL.g:7547:1: rule__DefinedTerm__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DefinedTerm__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7551:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7552:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7552:2: ( RULE_STRING )
            // InternalPactDSL.g:7553:3: RULE_STRING
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__DefinitionAssignment_1"


    // $ANTLR start "rule__Address__DefinitionAssignment_1"
    // InternalPactDSL.g:7562:1: rule__Address__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Address__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7566:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7567:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7567:2: ( RULE_STRING )
            // InternalPactDSL.g:7568:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__DefinitionAssignment_1"


    // $ANTLR start "rule__CompanyNumber__DefinitionAssignment_1"
    // InternalPactDSL.g:7577:1: rule__CompanyNumber__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CompanyNumber__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7581:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7582:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7582:2: ( RULE_STRING )
            // InternalPactDSL.g:7583:3: RULE_STRING
            {
             before(grammarAccess.getCompanyNumberAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__DefinitionAssignment_1"


    // $ANTLR start "rule__CustomFeature__FeatureAssignment_1"
    // InternalPactDSL.g:7592:1: rule__CustomFeature__FeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFeature__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7596:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7597:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7597:2: ( RULE_STRING )
            // InternalPactDSL.g:7598:3: RULE_STRING
            {
             before(grammarAccess.getCustomFeatureAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomFeatureAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__FeatureAssignment_1"


    // $ANTLR start "rule__InWriting__CustomWritingFormalityAssignment_1"
    // InternalPactDSL.g:7607:1: rule__InWriting__CustomWritingFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InWriting__CustomWritingFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7611:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7612:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7612:2: ( RULE_STRING )
            // InternalPactDSL.g:7613:3: RULE_STRING
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__CustomWritingFormalityAssignment_1"


    // $ANTLR start "rule__ByEmail__EmailAddressAssignment_2"
    // InternalPactDSL.g:7622:1: rule__ByEmail__EmailAddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ByEmail__EmailAddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7626:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7627:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7627:2: ( RULE_STRING )
            // InternalPactDSL.g:7628:3: RULE_STRING
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__EmailAddressAssignment_2"


    // $ANTLR start "rule__GivingNotice__SuperTypeAssignment_1"
    // InternalPactDSL.g:7637:1: rule__GivingNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__GivingNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7641:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7642:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7642:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7643:3: ( RULE_ID )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:7644:3: ( RULE_ID )
            // InternalPactDSL.g:7645:4: RULE_ID
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__SuperTypeAssignment_1"


    // $ANTLR start "rule__GivingNotice__NumDaysAssignment_2_1"
    // InternalPactDSL.g:7656:1: rule__GivingNotice__NumDaysAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GivingNotice__NumDaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7660:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7661:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7661:2: ( RULE_INT )
            // InternalPactDSL.g:7662:3: RULE_INT
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__NumDaysAssignment_2_1"


    // $ANTLR start "rule__CustomFormality__CustomFormalityAssignment_1"
    // InternalPactDSL.g:7671:1: rule__CustomFormality__CustomFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFormality__CustomFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7675:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7676:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7676:2: ( RULE_STRING )
            // InternalPactDSL.g:7677:3: RULE_STRING
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__CustomFormalityAssignment_1"


    // $ANTLR start "rule__GivenConsent__SuperTypeAssignment_0"
    // InternalPactDSL.g:7686:1: rule__GivenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7690:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7691:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7691:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7692:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:7693:3: ( RULE_ID )
            // InternalPactDSL.g:7694:4: RULE_ID
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__SuperTypeAssignment_0"


    // $ANTLR start "rule__GivenWrittenConsent__SuperTypeAssignment_0"
    // InternalPactDSL.g:7705:1: rule__GivenWrittenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenWrittenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7709:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7710:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7710:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7711:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:7712:3: ( RULE_ID )
            // InternalPactDSL.g:7713:4: RULE_ID
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__SuperTypeAssignment_0"


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_0"
    // InternalPactDSL.g:7724:1: rule__Ownership__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7728:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7729:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7729:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7730:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:7731:3: ( RULE_ID )
            // InternalPactDSL.g:7732:4: RULE_ID
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__SuperTypeAssignment_0"


    // $ANTLR start "rule__Ownership__CustomOwnershipAssignment_2"
    // InternalPactDSL.g:7743:1: rule__Ownership__CustomOwnershipAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ownership__CustomOwnershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7747:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7748:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7748:2: ( RULE_STRING )
            // InternalPactDSL.g:7749:3: RULE_STRING
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__CustomOwnershipAssignment_2"


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_3"
    // InternalPactDSL.g:7758:1: rule__Ownership__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7762:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7763:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7763:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7764:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 
            // InternalPactDSL.g:7765:3: ( RULE_ID )
            // InternalPactDSL.g:7766:4: RULE_ID
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__SuperTypeAssignment_3"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_0"
    // InternalPactDSL.g:7777:1: rule__RightToUse__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7781:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7782:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7782:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7783:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:7784:3: ( RULE_ID )
            // InternalPactDSL.g:7785:4: RULE_ID
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__SuperTypeAssignment_0"


    // $ANTLR start "rule__RightToUse__CustomUsageAssignment_2"
    // InternalPactDSL.g:7796:1: rule__RightToUse__CustomUsageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RightToUse__CustomUsageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7800:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7801:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7801:2: ( RULE_STRING )
            // InternalPactDSL.g:7802:3: RULE_STRING
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__CustomUsageAssignment_2"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_3"
    // InternalPactDSL.g:7811:1: rule__RightToUse__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7815:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7816:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7816:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7817:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 
            // InternalPactDSL.g:7818:3: ( RULE_ID )
            // InternalPactDSL.g:7819:4: RULE_ID
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__SuperTypeAssignment_3"


    // $ANTLR start "rule__PrimaryObligationType__CustomObligationAssignment_6"
    // InternalPactDSL.g:7830:1: rule__PrimaryObligationType__CustomObligationAssignment_6 : ( RULE_STRING ) ;
    public final void rule__PrimaryObligationType__CustomObligationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7834:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7835:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7835:2: ( RULE_STRING )
            // InternalPactDSL.g:7836:3: RULE_STRING
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryObligationType__CustomObligationAssignment_6"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:7845:1: rule__PaymentObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7849:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7850:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7850:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7851:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:7852:3: ( RULE_ID )
            // InternalPactDSL.g:7853:4: RULE_ID
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__PaymentObligation__SumAssignment_4"
    // InternalPactDSL.g:7864:1: rule__PaymentObligation__SumAssignment_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7868:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7869:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7869:2: ( RULE_INT )
            // InternalPactDSL.g:7870:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SumAssignment_4"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:7879:1: rule__PaymentObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7883:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7884:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7884:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7885:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:7886:3: ( RULE_ID )
            // InternalPactDSL.g:7887:4: RULE_ID
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__PaymentObligation__DayAssignment_7_2"
    // InternalPactDSL.g:7898:1: rule__PaymentObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7902:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7903:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7903:2: ( RULE_INT )
            // InternalPactDSL.g:7904:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__DayAssignment_7_2"


    // $ANTLR start "rule__PaymentObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:7913:1: rule__PaymentObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7917:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7918:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7918:2: ( RULE_INT )
            // InternalPactDSL.g:7919:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__PaymentObligation__YearAssignment_7_4"
    // InternalPactDSL.g:7928:1: rule__PaymentObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7932:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7933:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7933:2: ( RULE_INT )
            // InternalPactDSL.g:7934:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__YearAssignment_7_4"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:7943:1: rule__DeliveryObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7947:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7948:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7948:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7949:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:7950:3: ( RULE_ID )
            // InternalPactDSL.g:7951:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_4"
    // InternalPactDSL.g:7962:1: rule__DeliveryObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7966:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7967:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7967:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7968:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:7969:3: ( RULE_ID )
            // InternalPactDSL.g:7970:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_4"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:7981:1: rule__DeliveryObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7985:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7986:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7986:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7987:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:7988:3: ( RULE_ID )
            // InternalPactDSL.g:7989:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__DeliveryObligation__DayAssignment_7_2"
    // InternalPactDSL.g:8000:1: rule__DeliveryObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8004:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8005:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8005:2: ( RULE_INT )
            // InternalPactDSL.g:8006:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__DayAssignment_7_2"


    // $ANTLR start "rule__DeliveryObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:8015:1: rule__DeliveryObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8019:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8020:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8020:2: ( RULE_INT )
            // InternalPactDSL.g:8021:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__DeliveryObligation__YearAssignment_7_4"
    // InternalPactDSL.g:8030:1: rule__DeliveryObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8034:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8035:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8035:2: ( RULE_INT )
            // InternalPactDSL.g:8036:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__YearAssignment_7_4"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8045:1: rule__TransferObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8049:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8050:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8050:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8051:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8052:3: ( RULE_ID )
            // InternalPactDSL.g:8053:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_4"
    // InternalPactDSL.g:8064:1: rule__TransferObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8068:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8069:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8069:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8070:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8071:3: ( RULE_ID )
            // InternalPactDSL.g:8072:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_4"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:8083:1: rule__TransferObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8087:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8088:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8088:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8089:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8090:3: ( RULE_ID )
            // InternalPactDSL.g:8091:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__TransferObligation__DayAssignment_7_2"
    // InternalPactDSL.g:8102:1: rule__TransferObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__TransferObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8106:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8107:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8107:2: ( RULE_INT )
            // InternalPactDSL.g:8108:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__DayAssignment_7_2"


    // $ANTLR start "rule__TransferObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:8117:1: rule__TransferObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__TransferObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8121:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8122:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8122:2: ( RULE_INT )
            // InternalPactDSL.g:8123:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__TransferObligation__YearAssignment_7_4"
    // InternalPactDSL.g:8132:1: rule__TransferObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__TransferObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8136:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8137:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8137:2: ( RULE_INT )
            // InternalPactDSL.g:8138:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__YearAssignment_7_4"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8147:1: rule__LicenceObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8151:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8152:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8152:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8153:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8154:3: ( RULE_ID )
            // InternalPactDSL.g:8155:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:8166:1: rule__LicenceObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8170:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8171:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8171:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8172:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 
            // InternalPactDSL.g:8173:3: ( RULE_ID )
            // InternalPactDSL.g:8174:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_8"
    // InternalPactDSL.g:8185:1: rule__LicenceObligation__SuperTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8189:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8190:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8190:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8191:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 
            // InternalPactDSL.g:8192:3: ( RULE_ID )
            // InternalPactDSL.g:8193:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_8"


    // $ANTLR start "rule__LicenceObligation__DayAssignment_9_2"
    // InternalPactDSL.g:8204:1: rule__LicenceObligation__DayAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__DayAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8208:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8209:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8209:2: ( RULE_INT )
            // InternalPactDSL.g:8210:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__DayAssignment_9_2"


    // $ANTLR start "rule__LicenceObligation__MonthAssignment_9_3"
    // InternalPactDSL.g:8219:1: rule__LicenceObligation__MonthAssignment_9_3 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__MonthAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8223:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8224:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8224:2: ( RULE_INT )
            // InternalPactDSL.g:8225:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__MonthAssignment_9_3"


    // $ANTLR start "rule__LicenceObligation__YearAssignment_9_4"
    // InternalPactDSL.g:8234:1: rule__LicenceObligation__YearAssignment_9_4 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__YearAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8238:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8239:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8239:2: ( RULE_INT )
            // InternalPactDSL.g:8240:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__YearAssignment_9_4"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:8249:1: rule__ConstraintParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8253:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8254:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8254:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8255:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8256:3: ( RULE_ID )
            // InternalPactDSL.g:8257:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__ConstraintParty__ForbiddenActionAssignment_3"
    // InternalPactDSL.g:8268:1: rule__ConstraintParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8272:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8273:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8273:2: ( RULE_STRING )
            // InternalPactDSL.g:8274:3: RULE_STRING
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__ForbiddenActionAssignment_3"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:8283:1: rule__ConstraintParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8287:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8288:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8288:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8289:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8290:3: ( RULE_ID )
            // InternalPactDSL.g:8291:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_5_1"
    // InternalPactDSL.g:8302:1: rule__ConstraintParty__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8306:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8307:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8307:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8308:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 
            // InternalPactDSL.g:8309:3: ( RULE_ID )
            // InternalPactDSL.g:8310:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:8321:1: rule__ConstraintThirdParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8325:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8326:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8326:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8327:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8328:3: ( RULE_ID )
            // InternalPactDSL.g:8329:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__ConstraintThirdParty__ForbiddenActionAssignment_3"
    // InternalPactDSL.g:8340:1: rule__ConstraintThirdParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8344:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8345:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8345:2: ( RULE_STRING )
            // InternalPactDSL.g:8346:3: RULE_STRING
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__ForbiddenActionAssignment_3"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:8355:1: rule__ConstraintThirdParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8359:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8360:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8360:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8361:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8362:3: ( RULE_ID )
            // InternalPactDSL.g:8363:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__ConstraintThirdParty__AdditionalInfoAssignment_5"
    // InternalPactDSL.g:8374:1: rule__ConstraintThirdParty__AdditionalInfoAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__AdditionalInfoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8378:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8379:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8379:2: ( RULE_STRING )
            // InternalPactDSL.g:8380:3: RULE_STRING
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__AdditionalInfoAssignment_5"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_6_1"
    // InternalPactDSL.g:8389:1: rule__ConstraintThirdParty__SuperTypeAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8393:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8394:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8394:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8395:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 
            // InternalPactDSL.g:8396:3: ( RULE_ID )
            // InternalPactDSL.g:8397:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_6_1"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_7_3"
    // InternalPactDSL.g:8408:1: rule__ConstraintThirdParty__SuperTypeAssignment_7_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8412:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8413:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8413:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8414:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 
            // InternalPactDSL.g:8415:3: ( RULE_ID )
            // InternalPactDSL.g:8416:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_7_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_7_3_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_7_3"


    // $ANTLR start "rule__ForConvenience__SuperTypeAssignment_1"
    // InternalPactDSL.g:8427:1: rule__ForConvenience__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForConvenience__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8431:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8432:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8432:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8433:3: ( RULE_ID )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8434:3: ( RULE_ID )
            // InternalPactDSL.g:8435:4: RULE_ID
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__SuperTypeAssignment_1"


    // $ANTLR start "rule__ForConvenience__CustomTerminationAssignment_5"
    // InternalPactDSL.g:8446:1: rule__ForConvenience__CustomTerminationAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForConvenience__CustomTerminationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8450:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8451:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8451:2: ( RULE_STRING )
            // InternalPactDSL.g:8452:3: RULE_STRING
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__CustomTerminationAssignment_5"


    // $ANTLR start "rule__OnReasonableNotice__SuperTypeAssignment_1"
    // InternalPactDSL.g:8461:1: rule__OnReasonableNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8465:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8466:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8466:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8467:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8468:3: ( RULE_ID )
            // InternalPactDSL.g:8469:4: RULE_ID
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__SuperTypeAssignment_1"


    // $ANTLR start "rule__OnReasonableNotice__SuperTypeAssignment_5"
    // InternalPactDSL.g:8480:1: rule__OnReasonableNotice__SuperTypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8484:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8485:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8485:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8486:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 
            // InternalPactDSL.g:8487:3: ( RULE_ID )
            // InternalPactDSL.g:8488:4: RULE_ID
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__SuperTypeAssignment_5"


    // $ANTLR start "rule__ForBreach__SuperTypeAssignment_1"
    // InternalPactDSL.g:8499:1: rule__ForBreach__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8503:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8504:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8504:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8505:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8506:3: ( RULE_ID )
            // InternalPactDSL.g:8507:4: RULE_ID
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__SuperTypeAssignment_1"


    // $ANTLR start "rule__ForBreach__ObligationBreachedAssignment_5"
    // InternalPactDSL.g:8518:1: rule__ForBreach__ObligationBreachedAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForBreach__ObligationBreachedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8522:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8523:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8523:2: ( RULE_STRING )
            // InternalPactDSL.g:8524:3: RULE_STRING
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__ObligationBreachedAssignment_5"


    // $ANTLR start "rule__ForBreach__SuperTypeAssignment_7"
    // InternalPactDSL.g:8533:1: rule__ForBreach__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8537:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8538:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8538:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8539:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:8540:3: ( RULE_ID )
            // InternalPactDSL.g:8541:4: RULE_ID
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__SuperTypeAssignment_7"


    // $ANTLR start "rule__ForBreach__RemedialSchemeAssignment_8_1"
    // InternalPactDSL.g:8552:1: rule__ForBreach__RemedialSchemeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ForBreach__RemedialSchemeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8556:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8557:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8557:2: ( RULE_STRING )
            // InternalPactDSL.g:8558:3: RULE_STRING
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__RemedialSchemeAssignment_8_1"


    // $ANTLR start "rule__OnInsolvencyEvent__SuperTypeAssignment_1"
    // InternalPactDSL.g:8567:1: rule__OnInsolvencyEvent__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8571:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8572:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8572:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8573:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8574:3: ( RULE_ID )
            // InternalPactDSL.g:8575:4: RULE_ID
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__SuperTypeAssignment_1"


    // $ANTLR start "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5"
    // InternalPactDSL.g:8586:1: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 : ( RULE_STRING ) ;
    public final void rule__OnInsolvencyEvent__InsolvencyEventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8590:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8591:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8591:2: ( RULE_STRING )
            // InternalPactDSL.g:8592:3: RULE_STRING
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5"


    // $ANTLR start "rule__OnInsolvencyEvent__SuperTypeAssignment_7"
    // InternalPactDSL.g:8601:1: rule__OnInsolvencyEvent__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8605:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8606:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8606:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8607:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:8608:3: ( RULE_ID )
            // InternalPactDSL.g:8609:4: RULE_ID
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__SuperTypeAssignment_7"


    // $ANTLR start "rule__CustomTermination__SuperTypeAssignment_1"
    // InternalPactDSL.g:8620:1: rule__CustomTermination__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8624:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8625:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8625:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8626:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8627:3: ( RULE_ID )
            // InternalPactDSL.g:8628:4: RULE_ID
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__SuperTypeAssignment_1"


    // $ANTLR start "rule__CustomTermination__CustomTerminationClauseAssignment_4"
    // InternalPactDSL.g:8639:1: rule__CustomTermination__CustomTerminationClauseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomTermination__CustomTerminationClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8643:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8644:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8644:2: ( RULE_STRING )
            // InternalPactDSL.g:8645:3: RULE_STRING
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__CustomTerminationClauseAssignment_4"


    // $ANTLR start "rule__CustomTermination__SuperTypeAssignment_5_1"
    // InternalPactDSL.g:8654:1: rule__CustomTermination__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8658:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8659:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8659:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8660:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 
            // InternalPactDSL.g:8661:3: ( RULE_ID )
            // InternalPactDSL.g:8662:4: RULE_ID
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ApplicableLaw__CustomApplicableLawAssignment_1"
    // InternalPactDSL.g:8673:1: rule__ApplicableLaw__CustomApplicableLawAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ApplicableLaw__CustomApplicableLawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8677:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8678:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8678:2: ( RULE_STRING )
            // InternalPactDSL.g:8679:3: RULE_STRING
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__CustomApplicableLawAssignment_1"


    // $ANTLR start "rule__ApplicableLaw__DefinitionAssignment_2"
    // InternalPactDSL.g:8688:1: rule__ApplicableLaw__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__ApplicableLaw__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8692:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:8693:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:8693:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:8694:3: ruleDefinedTerm
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__DefinitionAssignment_2"


    // $ANTLR start "rule__Jurisdiction__CustomJurisdictionAssignment_1"
    // InternalPactDSL.g:8703:1: rule__Jurisdiction__CustomJurisdictionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Jurisdiction__CustomJurisdictionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8707:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8708:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8708:2: ( RULE_STRING )
            // InternalPactDSL.g:8709:3: RULE_STRING
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__CustomJurisdictionAssignment_1"


    // $ANTLR start "rule__Jurisdiction__DefinitionAssignment_2"
    // InternalPactDSL.g:8718:1: rule__Jurisdiction__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__Jurisdiction__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8722:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:8723:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:8723:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:8724:3: ruleDefinedTerm
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__DefinitionAssignment_2"


    // $ANTLR start "rule__Notices__CustomNoticeAssignment_1"
    // InternalPactDSL.g:8733:1: rule__Notices__CustomNoticeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notices__CustomNoticeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8737:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8738:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8738:2: ( RULE_STRING )
            // InternalPactDSL.g:8739:3: RULE_STRING
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__CustomNoticeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000012C003C0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000012C00000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0515080000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0515080000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x4000000003800040L,0x0000000000000016L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000800002L,0x0000000000000016L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800001000000050L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000040000000L});

}