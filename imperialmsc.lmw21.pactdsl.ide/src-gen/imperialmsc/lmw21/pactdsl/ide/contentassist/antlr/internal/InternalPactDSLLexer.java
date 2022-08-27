package imperialmsc.lmw21.pactdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPactDSLLexer extends Lexer {
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
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

    public InternalPactDSLLexer() {;} 
    public InternalPactDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPactDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPactDSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:11:7: ( 'owns' )
            // InternalPactDSL.g:11:9: 'owns'
            {
            match("owns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:12:7: ( 'mustReturn' )
            // InternalPactDSL.g:12:9: 'mustReturn'
            {
            match("mustReturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:13:7: ( 'mayUse' )
            // InternalPactDSL.g:13:9: 'mayUse'
            {
            match("mayUse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:14:7: ( 'mayNotUse' )
            // InternalPactDSL.g:14:9: 'mayNotUse'
            {
            match("mayNotUse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:15:7: ( 'ContractTitle:' )
            // InternalPactDSL.g:15:9: 'ContractTitle:'
            {
            match("ContractTitle:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:16:7: ( '.' )
            // InternalPactDSL.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:17:7: ( 'Entities:' )
            // InternalPactDSL.g:17:9: 'Entities:'
            {
            match("Entities:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:18:7: ( 'Formalities:' )
            // InternalPactDSL.g:18:9: 'Formalities:'
            {
            match("Formalities:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:19:7: ( 'Actions:' )
            // InternalPactDSL.g:19:9: 'Actions:'
            {
            match("Actions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:20:7: ( 'StateOnSignature:' )
            // InternalPactDSL.g:20:9: 'StateOnSignature:'
            {
            match("StateOnSignature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:21:7: ( 'PrimaryObligations:' )
            // InternalPactDSL.g:21:9: 'PrimaryObligations:'
            {
            match("PrimaryObligations:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:22:7: ( 'SecondaryObligations:' )
            // InternalPactDSL.g:22:9: 'SecondaryObligations:'
            {
            match("SecondaryObligations:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:23:7: ( 'Liability' )
            // InternalPactDSL.g:23:9: 'Liability'
            {
            match("Liability"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:24:7: ( 'Termination:' )
            // InternalPactDSL.g:24:9: 'Termination:'
            {
            match("Termination:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:25:7: ( 'StateAfterContractDischarged:' )
            // InternalPactDSL.g:25:9: 'StateAfterContractDischarged:'
            {
            match("StateAfterContractDischarged:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:26:7: ( 'Boilerplate:' )
            // InternalPactDSL.g:26:9: 'Boilerplate:'
            {
            match("Boilerplate:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:27:7: ( 'EffectiveDate:' )
            // InternalPactDSL.g:27:9: 'EffectiveDate:'
            {
            match("EffectiveDate:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:28:7: ( 'Party:' )
            // InternalPactDSL.g:28:9: 'Party:'
            {
            match("Party:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:29:7: ( 'ThirdParty:' )
            // InternalPactDSL.g:29:9: 'ThirdParty:'
            {
            match("ThirdParty:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:30:7: ( 'SubjectMatter:' )
            // InternalPactDSL.g:30:9: 'SubjectMatter:'
            {
            match("SubjectMatter:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:31:7: ( 'definedAs' )
            // InternalPactDSL.g:31:9: 'definedAs'
            {
            match("definedAs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:32:7: ( 'withAddress' )
            // InternalPactDSL.g:32:9: 'withAddress'
            {
            match("withAddress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:33:7: ( 'withCompanyNumber' )
            // InternalPactDSL.g:33:9: 'withCompanyNumber'
            {
            match("withCompanyNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:34:7: ( 'withFeature' )
            // InternalPactDSL.g:34:9: 'withFeature'
            {
            match("withFeature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:35:7: ( 'inWriting' )
            // InternalPactDSL.g:35:9: 'inWriting'
            {
            match("inWriting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:36:7: ( 'byEmail' )
            // InternalPactDSL.g:36:9: 'byEmail'
            {
            match("byEmail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:37:7: ( 'to' )
            // InternalPactDSL.g:37:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:38:7: ( 'givingNoticeTo' )
            // InternalPactDSL.g:38:9: 'givingNoticeTo'
            {
            match("givingNoticeTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:39:7: ( 'withDuration' )
            // InternalPactDSL.g:39:9: 'withDuration'
            {
            match("withDuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:40:7: ( 'days' )
            // InternalPactDSL.g:40:9: 'days'
            {
            match("days"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:41:7: ( 'ContractFormality' )
            // InternalPactDSL.g:41:9: 'ContractFormality'
            {
            match("ContractFormality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:42:7: ( 'gaveConsent' )
            // InternalPactDSL.g:42:9: 'gaveConsent'
            {
            match("gaveConsent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:43:7: ( 'gaveWrittenConsent' )
            // InternalPactDSL.g:43:9: 'gaveWrittenConsent'
            {
            match("gaveWrittenConsent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:44:7: ( 'Ownership:' )
            // InternalPactDSL.g:44:9: 'Ownership:'
            {
            match("Ownership:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:45:7: ( 'RightToUse:' )
            // InternalPactDSL.g:45:9: 'RightToUse:'
            {
            match("RightToUse:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:46:7: ( 'PaymentObligation:' )
            // InternalPactDSL.g:46:9: 'PaymentObligation:'
            {
            match("PaymentObligation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:47:7: ( 'must' )
            // InternalPactDSL.g:47:9: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:48:7: ( 'pay' )
            // InternalPactDSL.g:48:9: 'pay'
            {
            match("pay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:49:7: ( 'by' )
            // InternalPactDSL.g:49:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:50:7: ( 'date' )
            // InternalPactDSL.g:50:9: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:51:7: ( 'DeliveryObligation:' )
            // InternalPactDSL.g:51:9: 'DeliveryObligation:'
            {
            match("DeliveryObligation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:52:7: ( 'deliver' )
            // InternalPactDSL.g:52:9: 'deliver'
            {
            match("deliver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:53:7: ( 'TransferObligation:' )
            // InternalPactDSL.g:53:9: 'TransferObligation:'
            {
            match("TransferObligation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:54:7: ( 'transfer' )
            // InternalPactDSL.g:54:9: 'transfer'
            {
            match("transfer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:55:7: ( 'LicenceObligation:' )
            // InternalPactDSL.g:55:9: 'LicenceObligation:'
            {
            match("LicenceObligation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:56:7: ( 'grant' )
            // InternalPactDSL.g:56:9: 'grant'
            {
            match("grant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:57:7: ( 'Licence' )
            // InternalPactDSL.g:57:9: 'Licence'
            {
            match("Licence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:58:7: ( 'in' )
            // InternalPactDSL.g:58:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:59:7: ( 'ConstraintParty:' )
            // InternalPactDSL.g:59:9: 'ConstraintParty:'
            {
            match("ConstraintParty:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:60:7: ( 'mustNot' )
            // InternalPactDSL.g:60:9: 'mustNot'
            {
            match("mustNot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:61:7: ( 'ConstraintThirdParty:' )
            // InternalPactDSL.g:61:9: 'ConstraintThirdParty:'
            {
            match("ConstraintThirdParty:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:62:7: ( 'unless' )
            // InternalPactDSL.g:62:9: 'unless'
            {
            match("unless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:63:7: ( 'withWrittenConsent' )
            // InternalPactDSL.g:63:9: 'withWrittenConsent'
            {
            match("withWrittenConsent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:64:7: ( 'of' )
            // InternalPactDSL.g:64:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:65:7: ( 'SecondaryObligation:' )
            // InternalPactDSL.g:65:9: 'SecondaryObligation:'
            {
            match("SecondaryObligation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:66:7: ( 'uponBreachOf' )
            // InternalPactDSL.g:66:9: 'uponBreachOf'
            {
            match("uponBreachOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:67:7: ( 'LiabilityParty:' )
            // InternalPactDSL.g:67:9: 'LiabilityParty:'
            {
            match("LiabilityParty:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:68:7: ( 'shallNotBeLiable' )
            // InternalPactDSL.g:68:9: 'shallNotBeLiable'
            {
            match("shallNotBeLiable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:69:7: ( 'for' )
            // InternalPactDSL.g:69:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:70:7: ( 'LiabilityThirdParty:' )
            // InternalPactDSL.g:70:9: 'LiabilityThirdParty:'
            {
            match("LiabilityThirdParty:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:71:7: ( 'TerminationForConvenience:' )
            // InternalPactDSL.g:71:9: 'TerminationForConvenience:'
            {
            match("TerminationForConvenience:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:72:7: ( 'may' )
            // InternalPactDSL.g:72:9: 'may'
            {
            match("may"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:73:7: ( 'terminate' )
            // InternalPactDSL.g:73:9: 'terminate'
            {
            match("terminate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:74:7: ( 'TerminationOnReasonableNotice:' )
            // InternalPactDSL.g:74:9: 'TerminationOnReasonableNotice:'
            {
            match("TerminationOnReasonableNotice:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:75:7: ( 'TerminationForBreach:' )
            // InternalPactDSL.g:75:9: 'TerminationForBreach:'
            {
            match("TerminationForBreach:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:76:7: ( 'forBreachOf' )
            // InternalPactDSL.g:76:9: 'forBreachOf'
            {
            match("forBreachOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:77:7: ( 'TerminationUponInsolvency:' )
            // InternalPactDSL.g:77:9: 'TerminationUponInsolvency:'
            {
            match("TerminationUponInsolvency:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:78:7: ( 'upon' )
            // InternalPactDSL.g:78:9: 'upon'
            {
            match("upon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:79:7: ( 'ApplicableLaw:' )
            // InternalPactDSL.g:79:9: 'ApplicableLaw:'
            {
            match("ApplicableLaw:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:80:7: ( 'Jurisdiction:' )
            // InternalPactDSL.g:80:9: 'Jurisdiction:'
            {
            match("Jurisdiction:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:81:7: ( 'Notices:' )
            // InternalPactDSL.g:81:9: 'Notices:'
            {
            match("Notices:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9763:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPactDSL.g:9763:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPactDSL.g:9763:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPactDSL.g:9763:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPactDSL.g:9763:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPactDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9765:10: ( ( '0' .. '9' )+ )
            // InternalPactDSL.g:9765:12: ( '0' .. '9' )+
            {
            // InternalPactDSL.g:9765:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPactDSL.g:9765:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9767:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPactDSL.g:9767:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPactDSL.g:9767:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPactDSL.g:9767:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPactDSL.g:9767:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPactDSL.g:9767:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPactDSL.g:9767:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:9767:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPactDSL.g:9767:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPactDSL.g:9767:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPactDSL.g:9767:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9769:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPactDSL.g:9769:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPactDSL.g:9769:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPactDSL.g:9769:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9771:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPactDSL.g:9771:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPactDSL.g:9771:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPactDSL.g:9771:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPactDSL.g:9771:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPactDSL.g:9771:41: ( '\\r' )? '\\n'
                    {
                    // InternalPactDSL.g:9771:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPactDSL.g:9771:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9773:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPactDSL.g:9773:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPactDSL.g:9773:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPactDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPactDSL.g:9775:16: ( . )
            // InternalPactDSL.g:9775:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPactDSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=78;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPactDSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalPactDSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalPactDSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalPactDSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalPactDSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalPactDSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalPactDSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalPactDSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalPactDSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalPactDSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalPactDSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalPactDSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalPactDSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalPactDSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalPactDSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalPactDSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalPactDSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalPactDSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalPactDSL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalPactDSL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalPactDSL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalPactDSL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalPactDSL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalPactDSL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalPactDSL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalPactDSL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalPactDSL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalPactDSL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalPactDSL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalPactDSL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalPactDSL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalPactDSL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalPactDSL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalPactDSL.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalPactDSL.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalPactDSL.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalPactDSL.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalPactDSL.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalPactDSL.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalPactDSL.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalPactDSL.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalPactDSL.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalPactDSL.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalPactDSL.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalPactDSL.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalPactDSL.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalPactDSL.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalPactDSL.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalPactDSL.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalPactDSL.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalPactDSL.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalPactDSL.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalPactDSL.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalPactDSL.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalPactDSL.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalPactDSL.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalPactDSL.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalPactDSL.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalPactDSL.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalPactDSL.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalPactDSL.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalPactDSL.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalPactDSL.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalPactDSL.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalPactDSL.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalPactDSL.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalPactDSL.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalPactDSL.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalPactDSL.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalPactDSL.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalPactDSL.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalPactDSL.g:1:436: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // InternalPactDSL.g:1:444: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // InternalPactDSL.g:1:453: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalPactDSL.g:1:465: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalPactDSL.g:1:481: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // InternalPactDSL.g:1:497: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalPactDSL.g:1:505: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\46\1\uffff\27\46\1\43\2\uffff\3\43\2\uffff\1\46\1\125\1\uffff\3\46\1\uffff\22\46\1\160\1\162\1\163\17\46\5\uffff\1\46\1\uffff\1\46\1\u0087\30\46\1\uffff\1\46\2\uffff\7\46\1\u00a9\4\46\1\u00af\2\46\1\u00b2\1\u00b5\2\46\1\uffff\25\46\1\u00cd\1\u00ce\12\46\1\uffff\2\46\1\u00e1\2\46\1\uffff\2\46\1\uffff\2\46\1\uffff\27\46\2\uffff\14\46\1\u010c\5\46\1\uffff\6\46\1\u0118\15\46\1\uffff\25\46\1\uffff\3\46\1\u013e\6\46\1\u0145\1\uffff\17\46\1\u0156\5\46\1\u015c\6\46\1\u0163\10\46\1\uffff\6\46\1\uffff\6\46\1\uffff\11\46\1\uffff\5\46\1\uffff\6\46\1\uffff\1\u018d\13\46\1\uffff\1\46\1\u019a\3\46\1\uffff\11\46\1\u01a9\5\46\1\u01af\5\46\1\u01b5\1\uffff\1\u01b6\12\46\1\u01c1\1\uffff\16\46\1\uffff\5\46\1\uffff\5\46\2\uffff\3\46\1\uffff\6\46\1\uffff\21\46\1\uffff\2\46\1\u01fa\1\46\1\u01fc\3\46\1\u0200\1\46\1\uffff\3\46\1\u0205\6\46\1\uffff\12\46\1\uffff\4\46\2\uffff\1\46\1\uffff\1\u021b\2\46\1\uffff\2\46\1\u0220\1\46\1\uffff\25\46\1\uffff\4\46\1\uffff\1\46\2\uffff\3\46\2\uffff\3\46\1\uffff\13\46\1\u024e\13\46\1\uffff\11\46\1\uffff\4\46\1\uffff\21\46\1\u0278\1\u0279\1\46\1\uffff\13\46\1\u0286\3\46\2\uffff\4\46\1\uffff\1\46\1\uffff\5\46\1\uffff\1\u0294\1\u0295\4\46\1\uffff\5\46\4\uffff\3\46\2\uffff\4\46\1\uffff\1\46\1\uffff\1\46\1\uffff\23\46\1\uffff\1\46\1\uffff\4\46\1\uffff\1\46\1\uffff";
    static final String DFA12_eofS =
        "\u02c2\uffff";
    static final String DFA12_minS =
        "\1\0\1\146\1\141\1\157\1\uffff\1\146\1\157\1\143\1\145\1\141\1\151\1\145\1\157\1\141\1\151\1\156\1\171\1\145\1\141\1\167\1\151\1\141\1\145\1\156\1\150\1\157\1\165\1\157\1\101\2\uffff\2\0\1\52\2\uffff\1\156\1\60\1\uffff\1\163\1\171\1\156\1\uffff\1\164\1\146\1\162\1\164\1\160\1\141\1\143\1\142\1\151\1\162\1\141\1\162\1\151\1\141\1\151\1\146\2\164\3\60\1\141\1\162\2\166\1\141\1\156\1\147\1\171\2\154\1\157\1\141\2\162\1\164\5\uffff\1\163\1\uffff\1\164\1\60\1\163\1\151\1\145\1\155\1\151\1\154\1\164\1\157\1\152\1\155\1\164\1\155\1\142\1\145\1\155\1\162\1\156\1\154\2\151\1\163\1\145\1\150\1\162\1\uffff\1\155\2\uffff\1\156\1\155\1\151\1\145\1\156\1\145\1\150\1\60\1\151\1\145\1\156\1\154\1\60\2\151\2\60\1\163\1\157\1\uffff\1\162\2\164\1\143\1\141\1\157\1\151\1\145\1\156\1\145\1\141\1\171\1\145\1\151\1\156\1\151\1\144\1\163\1\145\1\156\1\166\2\60\1\101\1\151\1\141\1\163\1\151\1\156\1\103\1\164\1\162\1\164\1\uffff\1\166\1\163\1\60\1\154\1\162\1\uffff\1\163\1\143\1\uffff\1\145\1\157\1\uffff\1\145\1\164\1\141\1\162\1\151\1\164\1\154\1\156\1\143\1\101\1\144\1\143\1\162\1\72\1\156\1\154\1\143\1\156\1\120\1\146\1\162\2\145\2\uffff\1\144\1\157\1\145\1\165\1\162\1\164\1\151\1\146\1\156\1\147\1\157\1\162\1\60\1\163\1\124\1\145\1\163\1\162\1\uffff\1\116\1\145\1\144\1\145\2\164\1\60\1\125\1\143\1\141\1\145\2\151\1\163\1\141\1\156\1\146\1\141\1\164\1\171\1\uffff\1\164\1\151\1\145\2\141\1\145\1\160\1\144\1\162\1\144\1\155\1\141\1\162\2\151\1\154\1\145\1\141\1\116\1\156\1\151\1\uffff\1\150\1\157\1\162\1\60\1\145\1\157\1\141\1\151\1\163\1\165\1\60\1\uffff\1\163\1\164\1\151\1\163\1\166\1\164\1\72\1\142\1\123\1\164\1\162\1\115\2\117\1\164\1\60\1\164\2\162\1\154\1\101\1\60\1\162\1\160\1\164\1\141\1\164\1\156\1\60\1\162\1\164\1\157\1\163\1\164\1\151\1\125\1\171\1\uffff\1\141\1\164\2\143\1\72\1\162\1\uffff\1\145\1\106\1\156\1\72\1\145\1\151\1\uffff\1\154\1\151\1\145\1\171\1\141\2\142\1\171\1\142\1\uffff\1\151\1\164\1\117\1\141\1\163\1\uffff\1\145\1\141\1\165\2\164\1\147\1\uffff\1\60\1\145\1\164\1\145\1\164\1\160\1\163\1\117\1\143\1\102\1\150\1\164\1\uffff\1\156\1\60\1\151\1\157\1\164\1\uffff\1\104\2\145\1\147\1\162\1\117\1\164\2\154\1\60\1\154\1\157\1\171\1\142\1\164\1\60\1\163\1\156\1\162\1\151\1\145\1\60\1\uffff\1\60\1\151\1\156\1\145\1\72\1\145\1\142\1\150\1\145\1\117\1\151\1\60\1\uffff\1\164\1\162\1\120\1\141\1\163\1\114\1\156\1\103\1\142\1\164\2\151\1\141\1\150\1\uffff\1\151\1\156\1\72\1\154\1\145\1\uffff\1\163\1\171\1\145\1\157\1\156\2\uffff\1\143\1\164\1\156\1\uffff\1\72\1\154\1\117\1\114\1\146\1\157\1\uffff\1\154\1\155\1\141\1\150\1\164\1\72\2\141\1\157\1\154\1\145\2\147\1\162\1\151\1\147\1\72\1\uffff\1\151\1\72\1\60\1\116\1\60\1\156\1\103\1\145\1\60\1\103\1\uffff\1\151\1\146\1\151\1\60\1\156\1\145\1\141\1\162\1\151\1\145\1\uffff\1\167\1\164\1\156\1\151\1\162\2\141\1\164\1\162\1\141\1\uffff\1\157\1\156\1\160\1\147\2\uffff\1\165\1\uffff\1\60\1\157\1\124\1\uffff\1\157\1\147\1\60\1\141\1\uffff\2\72\1\154\1\164\1\162\2\72\1\165\1\164\1\147\1\72\2\164\1\171\1\144\1\164\1\162\1\122\1\157\1\141\1\155\1\uffff\1\156\1\157\1\156\1\141\1\uffff\1\142\2\uffff\1\151\1\171\1\144\2\uffff\2\162\1\141\1\uffff\2\151\1\72\1\120\1\151\1\102\1\145\1\156\1\164\1\142\1\163\1\60\1\163\1\164\1\154\1\164\1\72\1\120\1\145\1\141\1\164\2\157\1\uffff\1\141\2\157\1\162\1\141\1\111\1\151\2\145\1\uffff\1\145\1\151\1\145\1\171\1\uffff\1\141\1\72\1\143\1\151\2\156\1\162\2\156\1\145\1\163\1\156\1\157\1\162\2\156\1\157\2\60\1\162\1\uffff\1\164\1\157\1\163\1\72\1\164\1\72\1\166\1\141\1\157\1\163\1\156\1\60\2\164\1\156\2\uffff\1\164\1\104\1\156\1\72\1\uffff\1\171\1\uffff\1\145\1\143\1\156\1\157\1\72\1\uffff\2\60\1\72\1\171\1\151\1\72\1\uffff\1\72\1\156\1\150\1\141\1\154\4\uffff\1\72\1\163\1\72\2\uffff\1\151\1\72\1\142\1\166\1\uffff\1\143\1\uffff\1\145\1\uffff\1\154\1\145\1\150\1\156\1\145\1\156\1\141\1\143\1\116\1\143\1\162\1\145\1\157\1\171\1\147\1\72\1\164\1\72\1\145\1\uffff\1\151\1\uffff\1\144\1\143\1\72\1\145\1\uffff\1\72\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\167\1\165\1\157\1\uffff\1\156\1\157\1\160\1\165\1\162\1\151\1\162\1\157\1\145\1\151\1\156\1\171\2\162\1\167\1\151\1\141\1\145\1\160\1\150\1\157\1\165\1\157\1\172\2\uffff\2\uffff\1\57\2\uffff\1\156\1\172\1\uffff\1\163\1\171\1\156\1\uffff\1\164\1\146\1\162\1\164\1\160\1\141\1\143\1\142\1\151\1\171\1\143\1\162\1\151\1\141\1\151\1\154\1\171\1\164\3\172\1\141\1\162\2\166\1\141\1\156\1\147\1\171\2\154\1\157\1\141\2\162\1\164\5\uffff\1\163\1\uffff\1\164\1\172\1\164\1\151\1\145\1\155\1\151\1\154\1\164\1\157\1\152\1\155\1\164\1\155\1\142\1\145\1\155\1\162\1\156\1\154\2\151\1\163\1\145\1\150\1\162\1\uffff\1\155\2\uffff\1\156\1\155\1\151\1\145\1\156\1\145\1\150\1\172\1\151\1\145\1\156\1\154\1\172\2\151\2\172\1\163\1\157\1\uffff\1\162\2\164\1\143\1\141\1\157\1\151\1\145\1\156\1\145\1\141\1\171\1\145\1\151\1\156\1\151\1\144\1\163\1\145\1\156\1\166\2\172\1\127\1\151\1\141\1\163\1\151\1\156\1\127\1\164\1\162\1\164\1\uffff\1\166\1\163\1\172\1\154\1\162\1\uffff\1\163\1\143\1\uffff\1\145\1\157\1\uffff\1\145\1\164\1\141\1\162\1\151\1\164\1\154\1\156\1\143\1\117\1\144\1\143\1\162\1\72\1\156\1\154\1\143\1\156\1\120\1\146\1\162\2\145\2\uffff\1\144\1\157\1\145\1\165\1\162\1\164\1\151\1\146\1\156\1\147\1\157\1\162\1\172\1\163\1\124\1\145\1\163\1\162\1\uffff\1\116\1\145\1\144\1\145\2\164\1\172\1\125\1\143\1\141\1\145\2\151\1\163\1\141\1\156\1\146\1\141\1\164\1\171\1\uffff\1\164\1\151\1\145\2\141\1\145\1\160\1\144\1\162\1\144\1\155\1\141\1\162\2\151\1\154\1\145\1\141\1\116\1\156\1\151\1\uffff\1\150\1\157\1\162\1\172\1\145\1\157\1\141\1\151\1\163\1\165\1\172\1\uffff\1\163\1\164\1\151\1\163\1\166\1\164\1\72\1\142\1\123\1\164\1\162\1\115\2\117\1\164\1\172\1\164\2\162\1\154\1\101\1\172\1\162\1\160\1\164\1\141\1\164\1\156\1\172\1\162\1\164\1\157\1\163\1\164\1\151\1\125\1\171\1\uffff\1\141\1\164\2\143\1\72\1\162\1\uffff\1\145\1\124\1\156\1\72\1\145\1\151\1\uffff\1\154\1\151\1\145\1\171\1\141\2\142\1\171\1\142\1\uffff\1\151\1\164\1\117\1\141\1\163\1\uffff\1\145\1\141\1\165\2\164\1\147\1\uffff\1\172\1\145\1\164\1\145\1\164\1\160\1\163\1\117\1\143\1\102\1\150\1\164\1\uffff\1\156\1\172\1\151\1\157\1\164\1\uffff\1\104\2\145\1\147\1\162\1\117\1\164\2\154\1\172\1\154\1\157\1\171\1\142\1\164\1\172\1\163\1\156\1\162\1\151\1\145\1\172\1\uffff\1\172\1\151\1\156\1\145\1\72\1\145\1\142\1\150\1\145\1\117\1\151\1\172\1\uffff\1\164\1\162\1\124\1\141\1\163\1\114\1\156\1\103\1\142\1\164\2\151\1\141\1\150\1\uffff\1\151\1\156\1\72\1\154\1\145\1\uffff\1\163\1\171\1\145\1\157\1\156\2\uffff\1\143\1\164\1\156\1\uffff\1\72\1\154\1\117\1\114\1\146\1\157\1\uffff\1\154\1\155\1\141\1\150\1\164\1\72\2\141\1\157\1\154\1\145\2\147\1\162\1\151\1\147\1\125\1\uffff\1\151\1\72\1\172\1\116\1\172\1\156\1\103\1\145\1\172\1\103\1\uffff\1\151\1\146\1\151\1\172\1\156\1\145\1\141\1\162\1\151\1\145\1\uffff\1\167\1\164\1\156\1\151\1\162\2\141\1\164\1\162\1\141\1\uffff\1\157\1\156\1\160\1\147\2\uffff\1\165\1\uffff\1\172\1\157\1\124\1\uffff\1\157\1\147\1\172\1\141\1\uffff\2\72\1\154\1\164\1\162\2\72\1\165\1\164\1\147\1\72\2\164\1\171\1\144\1\164\1\162\1\122\1\157\1\141\1\155\1\uffff\1\156\1\157\1\156\1\141\1\uffff\1\142\2\uffff\1\151\1\171\1\144\2\uffff\2\162\1\141\1\uffff\2\151\1\72\1\120\1\151\1\103\1\145\1\156\1\164\1\142\1\163\1\172\1\163\1\164\1\154\1\164\1\72\1\120\1\145\1\141\1\164\2\157\1\uffff\1\141\2\157\1\162\1\141\1\111\1\151\2\145\1\uffff\1\145\1\151\1\145\1\171\1\uffff\1\141\1\72\1\143\1\151\2\156\1\162\2\156\1\145\1\163\1\156\1\157\1\162\2\156\1\157\2\172\1\162\1\uffff\1\164\1\157\1\163\1\72\1\164\1\72\1\166\1\141\1\157\1\163\1\156\1\172\2\164\1\156\2\uffff\1\164\1\104\1\156\1\72\1\uffff\1\171\1\uffff\1\145\1\143\1\156\1\157\1\72\1\uffff\2\172\1\72\1\171\1\151\1\163\1\uffff\1\72\1\156\1\150\1\141\1\154\4\uffff\1\72\1\163\1\72\2\uffff\1\151\1\72\1\142\1\166\1\uffff\1\143\1\uffff\1\145\1\uffff\1\154\1\145\1\150\1\156\1\145\1\156\1\141\1\143\1\116\1\143\1\162\1\145\1\157\1\171\1\147\1\72\1\164\1\72\1\145\1\uffff\1\151\1\uffff\1\144\1\143\1\72\1\145\1\uffff\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\6\30\uffff\1\110\1\111\3\uffff\1\115\1\116\2\uffff\1\110\3\uffff\1\6\44\uffff\1\111\1\112\1\113\1\114\1\115\1\uffff\1\66\32\uffff\1\60\1\uffff\1\47\1\33\23\uffff\1\76\41\uffff\1\46\5\uffff\1\73\2\uffff\1\1\2\uffff\1\45\27\uffff\1\36\1\50\22\uffff\1\104\24\uffff\1\22\25\uffff\1\56\13\uffff\1\3\45\uffff\1\64\6\uffff\1\62\6\uffff\1\11\11\uffff\1\57\5\uffff\1\52\6\uffff\1\32\14\uffff\1\107\5\uffff\1\7\26\uffff\1\54\14\uffff\1\4\16\uffff\1\15\5\uffff\1\25\5\uffff\1\31\1\77\3\uffff\1\42\6\uffff\1\2\21\uffff\1\23\12\uffff\1\43\12\uffff\1\10\12\uffff\1\16\4\uffff\1\20\1\26\1\uffff\1\30\3\uffff\1\40\4\uffff\1\102\25\uffff\1\35\4\uffff\1\70\1\uffff\1\106\1\5\3\uffff\1\21\1\105\3\uffff\1\24\27\uffff\1\71\11\uffff\1\34\4\uffff\1\61\24\uffff\1\12\17\uffff\1\72\1\37\4\uffff\1\44\1\uffff\1\55\5\uffff\1\27\6\uffff\1\13\5\uffff\1\53\1\65\1\41\1\51\3\uffff\1\67\1\74\4\uffff\1\63\1\uffff\1\14\1\uffff\1\101\23\uffff\1\75\1\uffff\1\103\4\uffff\1\17\1\uffff\1\100";
    static final String DFA12_specialS =
        "\1\0\36\uffff\1\1\1\2\u02a1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\6\43\1\4\1\41\12\36\7\43\1\7\1\14\1\3\1\26\1\5\1\6\3\35\1\32\1\35\1\12\1\35\1\33\1\23\1\11\1\35\1\24\1\10\1\13\6\35\3\43\1\34\1\35\1\43\1\35\1\20\1\35\1\15\1\35\1\31\1\22\1\35\1\17\3\35\1\2\1\35\1\1\1\25\2\35\1\30\1\21\1\27\1\35\1\16\3\35\uff85\43",
            "\1\45\20\uffff\1\44",
            "\1\50\23\uffff\1\47",
            "\1\51",
            "",
            "\1\54\7\uffff\1\53",
            "\1\55",
            "\1\56\14\uffff\1\57",
            "\1\61\16\uffff\1\60\1\62",
            "\1\64\20\uffff\1\63",
            "\1\65",
            "\1\66\2\uffff\1\67\11\uffff\1\70",
            "\1\71",
            "\1\73\3\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\101\11\uffff\1\77\2\uffff\1\100",
            "\1\103\7\uffff\1\102\10\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\1\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\120",
            "\0\120",
            "\1\121\4\uffff\1\122",
            "",
            "",
            "\1\124",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142\6\uffff\1\143",
            "\1\144\1\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\5\uffff\1\153",
            "\1\155\4\uffff\1\154",
            "\1\156",
            "\12\46\7\uffff\26\46\1\157\3\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\4\46\1\161\25\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "",
            "\1\u0084",
            "\12\46\7\uffff\15\46\1\u0086\6\46\1\u0085\5\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0089\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\46\7\uffff\1\46\1\u00ae\30\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b0",
            "\1\u00b1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\15\46\1\u00b4\3\46\1\u00b3\10\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cf\1\uffff\1\u00d0\1\u00d2\1\uffff\1\u00d1\20\uffff\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9\23\uffff\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\12\46\7\uffff\1\46\1\u00e0\30\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f2\15\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\46\7\uffff\16\46\1\u0155\13\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0174\15\uffff\1\u0173",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\46\7\uffff\17\46\1\u01a7\3\46\1\u01a8\6\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4\3\uffff\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4\13\uffff\1\u01f5\10\uffff\1\u01f6\5\uffff\1\u01f7",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01fb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0201",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "",
            "",
            "\1\u021a",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u021c",
            "\1\u021d",
            "",
            "\1\u021e",
            "\1\u021f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0221",
            "",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "",
            "\1\u023b",
            "",
            "",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0248\1\u0247",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u027a",
            "",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "",
            "",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "",
            "\1\u028e",
            "",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u029a\70\uffff\1\u0299",
            "",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "",
            "",
            "",
            "",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "",
            "",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "\1\u02a7",
            "",
            "\1\u02a8",
            "",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "",
            "\1\u02bc",
            "",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "",
            "\1\u02c1",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='o') ) {s = 1;}

                        else if ( (LA12_0=='m') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='.') ) {s = 4;}

                        else if ( (LA12_0=='E') ) {s = 5;}

                        else if ( (LA12_0=='F') ) {s = 6;}

                        else if ( (LA12_0=='A') ) {s = 7;}

                        else if ( (LA12_0=='S') ) {s = 8;}

                        else if ( (LA12_0=='P') ) {s = 9;}

                        else if ( (LA12_0=='L') ) {s = 10;}

                        else if ( (LA12_0=='T') ) {s = 11;}

                        else if ( (LA12_0=='B') ) {s = 12;}

                        else if ( (LA12_0=='d') ) {s = 13;}

                        else if ( (LA12_0=='w') ) {s = 14;}

                        else if ( (LA12_0=='i') ) {s = 15;}

                        else if ( (LA12_0=='b') ) {s = 16;}

                        else if ( (LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='g') ) {s = 18;}

                        else if ( (LA12_0=='O') ) {s = 19;}

                        else if ( (LA12_0=='R') ) {s = 20;}

                        else if ( (LA12_0=='p') ) {s = 21;}

                        else if ( (LA12_0=='D') ) {s = 22;}

                        else if ( (LA12_0=='u') ) {s = 23;}

                        else if ( (LA12_0=='s') ) {s = 24;}

                        else if ( (LA12_0=='f') ) {s = 25;}

                        else if ( (LA12_0=='J') ) {s = 26;}

                        else if ( (LA12_0=='N') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( ((LA12_0>='G' && LA12_0<='I')||LA12_0=='K'||LA12_0=='M'||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='c'||LA12_0=='e'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='l')||LA12_0=='n'||(LA12_0>='q' && LA12_0<='r')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 29;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='\'') ) {s = 32;}

                        else if ( (LA12_0=='/') ) {s = 33;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 34;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 80;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 80;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}