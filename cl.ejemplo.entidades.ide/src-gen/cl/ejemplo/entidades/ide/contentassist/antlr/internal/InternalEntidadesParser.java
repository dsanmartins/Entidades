package cl.ejemplo.entidades.ide.contentassist.antlr.internal;

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
import cl.ejemplo.entidades.services.EntidadesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntidadesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entidad'", "'{'", "'}'", "'extends'", "';'", "']'", "'['"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEntidadesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntidadesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntidadesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntidades.g"; }


    	private EntidadesGrammarAccess grammarAccess;

    	public void setGrammarAccess(EntidadesGrammarAccess grammarAccess) {
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
    // InternalEntidades.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEntidades.g:54:1: ( ruleModel EOF )
            // InternalEntidades.g:55:1: ruleModel EOF
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
    // InternalEntidades.g:62:1: ruleModel : ( ( rule__Model__EntidadesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:66:2: ( ( ( rule__Model__EntidadesAssignment )* ) )
            // InternalEntidades.g:67:2: ( ( rule__Model__EntidadesAssignment )* )
            {
            // InternalEntidades.g:67:2: ( ( rule__Model__EntidadesAssignment )* )
            // InternalEntidades.g:68:3: ( rule__Model__EntidadesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntidadesAssignment()); 
            // InternalEntidades.g:69:3: ( rule__Model__EntidadesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntidades.g:69:4: rule__Model__EntidadesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EntidadesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntidadesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEntidad"
    // InternalEntidades.g:78:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalEntidades.g:79:1: ( ruleEntidad EOF )
            // InternalEntidades.g:80:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalEntidades.g:87:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:91:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalEntidades.g:92:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalEntidades.g:92:2: ( ( rule__Entidad__Group__0 ) )
            // InternalEntidades.g:93:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalEntidades.g:94:3: ( rule__Entidad__Group__0 )
            // InternalEntidades.g:94:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalEntidades.g:103:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalEntidades.g:104:1: ( ruleAtributo EOF )
            // InternalEntidades.g:105:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalEntidades.g:112:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:116:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalEntidades.g:117:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalEntidades.g:117:2: ( ( rule__Atributo__Group__0 ) )
            // InternalEntidades.g:118:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalEntidades.g:119:3: ( rule__Atributo__Group__0 )
            // InternalEntidades.g:119:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleTipoAtributo"
    // InternalEntidades.g:128:1: entryRuleTipoAtributo : ruleTipoAtributo EOF ;
    public final void entryRuleTipoAtributo() throws RecognitionException {
        try {
            // InternalEntidades.g:129:1: ( ruleTipoAtributo EOF )
            // InternalEntidades.g:130:1: ruleTipoAtributo EOF
            {
             before(grammarAccess.getTipoAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getTipoAtributoRule()); 
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
    // $ANTLR end "entryRuleTipoAtributo"


    // $ANTLR start "ruleTipoAtributo"
    // InternalEntidades.g:137:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Group__0 ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:141:2: ( ( ( rule__TipoAtributo__Group__0 ) ) )
            // InternalEntidades.g:142:2: ( ( rule__TipoAtributo__Group__0 ) )
            {
            // InternalEntidades.g:142:2: ( ( rule__TipoAtributo__Group__0 ) )
            // InternalEntidades.g:143:3: ( rule__TipoAtributo__Group__0 )
            {
             before(grammarAccess.getTipoAtributoAccess().getGroup()); 
            // InternalEntidades.g:144:3: ( rule__TipoAtributo__Group__0 )
            // InternalEntidades.g:144:4: rule__TipoAtributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTipoAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoAtributo"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalEntidades.g:152:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:156:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalEntidades.g:157:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

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
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalEntidades.g:164:1: rule__Entidad__Group__0__Impl : ( 'entidad' ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:168:1: ( ( 'entidad' ) )
            // InternalEntidades.g:169:1: ( 'entidad' )
            {
            // InternalEntidades.g:169:1: ( 'entidad' )
            // InternalEntidades.g:170:2: 'entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalEntidades.g:179:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:183:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalEntidades.g:184:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

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
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalEntidades.g:191:1: rule__Entidad__Group__1__Impl : ( ( rule__Entidad__NameAssignment_1 ) ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:195:1: ( ( ( rule__Entidad__NameAssignment_1 ) ) )
            // InternalEntidades.g:196:1: ( ( rule__Entidad__NameAssignment_1 ) )
            {
            // InternalEntidades.g:196:1: ( ( rule__Entidad__NameAssignment_1 ) )
            // InternalEntidades.g:197:2: ( rule__Entidad__NameAssignment_1 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_1()); 
            // InternalEntidades.g:198:2: ( rule__Entidad__NameAssignment_1 )
            // InternalEntidades.g:198:3: rule__Entidad__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalEntidades.g:206:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:210:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalEntidades.g:211:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

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
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalEntidades.g:218:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__Group_2__0 )? ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:222:1: ( ( ( rule__Entidad__Group_2__0 )? ) )
            // InternalEntidades.g:223:1: ( ( rule__Entidad__Group_2__0 )? )
            {
            // InternalEntidades.g:223:1: ( ( rule__Entidad__Group_2__0 )? )
            // InternalEntidades.g:224:2: ( rule__Entidad__Group_2__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_2()); 
            // InternalEntidades.g:225:2: ( rule__Entidad__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntidades.g:225:3: rule__Entidad__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entidad__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntidadAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalEntidades.g:233:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:237:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalEntidades.g:238:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

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
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalEntidades.g:245:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:249:1: ( ( '{' ) )
            // InternalEntidades.g:250:1: ( '{' )
            {
            // InternalEntidades.g:250:1: ( '{' )
            // InternalEntidades.g:251:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalEntidades.g:260:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:264:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalEntidades.g:265:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

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
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalEntidades.g:272:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__AtributosAssignment_4 )* ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:276:1: ( ( ( rule__Entidad__AtributosAssignment_4 )* ) )
            // InternalEntidades.g:277:1: ( ( rule__Entidad__AtributosAssignment_4 )* )
            {
            // InternalEntidades.g:277:1: ( ( rule__Entidad__AtributosAssignment_4 )* )
            // InternalEntidades.g:278:2: ( rule__Entidad__AtributosAssignment_4 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4()); 
            // InternalEntidades.g:279:2: ( rule__Entidad__AtributosAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntidades.g:279:3: rule__Entidad__AtributosAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entidad__AtributosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalEntidades.g:287:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:291:1: ( rule__Entidad__Group__5__Impl )
            // InternalEntidades.g:292:2: rule__Entidad__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5__Impl();

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
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalEntidades.g:298:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:302:1: ( ( '}' ) )
            // InternalEntidades.g:303:1: ( '}' )
            {
            // InternalEntidades.g:303:1: ( '}' )
            // InternalEntidades.g:304:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group_2__0"
    // InternalEntidades.g:314:1: rule__Entidad__Group_2__0 : rule__Entidad__Group_2__0__Impl rule__Entidad__Group_2__1 ;
    public final void rule__Entidad__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:318:1: ( rule__Entidad__Group_2__0__Impl rule__Entidad__Group_2__1 )
            // InternalEntidades.g:319:2: rule__Entidad__Group_2__0__Impl rule__Entidad__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_2__1();

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
    // $ANTLR end "rule__Entidad__Group_2__0"


    // $ANTLR start "rule__Entidad__Group_2__0__Impl"
    // InternalEntidades.g:326:1: rule__Entidad__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entidad__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:330:1: ( ( 'extends' ) )
            // InternalEntidades.g:331:1: ( 'extends' )
            {
            // InternalEntidades.g:331:1: ( 'extends' )
            // InternalEntidades.g:332:2: 'extends'
            {
             before(grammarAccess.getEntidadAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_2__0__Impl"


    // $ANTLR start "rule__Entidad__Group_2__1"
    // InternalEntidades.g:341:1: rule__Entidad__Group_2__1 : rule__Entidad__Group_2__1__Impl ;
    public final void rule__Entidad__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:345:1: ( rule__Entidad__Group_2__1__Impl )
            // InternalEntidades.g:346:2: rule__Entidad__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entidad__Group_2__1"


    // $ANTLR start "rule__Entidad__Group_2__1__Impl"
    // InternalEntidades.g:352:1: rule__Entidad__Group_2__1__Impl : ( ( rule__Entidad__SuperTipoAssignment_2_1 ) ) ;
    public final void rule__Entidad__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:356:1: ( ( ( rule__Entidad__SuperTipoAssignment_2_1 ) ) )
            // InternalEntidades.g:357:1: ( ( rule__Entidad__SuperTipoAssignment_2_1 ) )
            {
            // InternalEntidades.g:357:1: ( ( rule__Entidad__SuperTipoAssignment_2_1 ) )
            // InternalEntidades.g:358:2: ( rule__Entidad__SuperTipoAssignment_2_1 )
            {
             before(grammarAccess.getEntidadAccess().getSuperTipoAssignment_2_1()); 
            // InternalEntidades.g:359:2: ( rule__Entidad__SuperTipoAssignment_2_1 )
            // InternalEntidades.g:359:3: rule__Entidad__SuperTipoAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__SuperTipoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getSuperTipoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_2__1__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalEntidades.g:368:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:372:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalEntidades.g:373:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

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
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalEntidades.g:380:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:384:1: ( ( ( rule__Atributo__TipoAssignment_0 ) ) )
            // InternalEntidades.g:385:1: ( ( rule__Atributo__TipoAssignment_0 ) )
            {
            // InternalEntidades.g:385:1: ( ( rule__Atributo__TipoAssignment_0 ) )
            // InternalEntidades.g:386:2: ( rule__Atributo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipoAssignment_0()); 
            // InternalEntidades.g:387:2: ( rule__Atributo__TipoAssignment_0 )
            // InternalEntidades.g:387:3: rule__Atributo__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalEntidades.g:395:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:399:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalEntidades.g:400:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2();

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
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalEntidades.g:407:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:411:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalEntidades.g:412:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalEntidades.g:412:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalEntidades.g:413:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalEntidades.g:414:2: ( rule__Atributo__NameAssignment_1 )
            // InternalEntidades.g:414:3: rule__Atributo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__2"
    // InternalEntidades.g:422:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:426:1: ( rule__Atributo__Group__2__Impl )
            // InternalEntidades.g:427:2: rule__Atributo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2__Impl();

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
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // InternalEntidades.g:433:1: rule__Atributo__Group__2__Impl : ( ';' ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:437:1: ( ( ';' ) )
            // InternalEntidades.g:438:1: ( ';' )
            {
            // InternalEntidades.g:438:1: ( ';' )
            // InternalEntidades.g:439:2: ';'
            {
             before(grammarAccess.getAtributoAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__TipoAtributo__Group__0"
    // InternalEntidades.g:449:1: rule__TipoAtributo__Group__0 : rule__TipoAtributo__Group__0__Impl rule__TipoAtributo__Group__1 ;
    public final void rule__TipoAtributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:453:1: ( rule__TipoAtributo__Group__0__Impl rule__TipoAtributo__Group__1 )
            // InternalEntidades.g:454:2: rule__TipoAtributo__Group__0__Impl rule__TipoAtributo__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TipoAtributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Group__1();

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
    // $ANTLR end "rule__TipoAtributo__Group__0"


    // $ANTLR start "rule__TipoAtributo__Group__0__Impl"
    // InternalEntidades.g:461:1: rule__TipoAtributo__Group__0__Impl : ( ( rule__TipoAtributo__EntidadAssignment_0 ) ) ;
    public final void rule__TipoAtributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:465:1: ( ( ( rule__TipoAtributo__EntidadAssignment_0 ) ) )
            // InternalEntidades.g:466:1: ( ( rule__TipoAtributo__EntidadAssignment_0 ) )
            {
            // InternalEntidades.g:466:1: ( ( rule__TipoAtributo__EntidadAssignment_0 ) )
            // InternalEntidades.g:467:2: ( rule__TipoAtributo__EntidadAssignment_0 )
            {
             before(grammarAccess.getTipoAtributoAccess().getEntidadAssignment_0()); 
            // InternalEntidades.g:468:2: ( rule__TipoAtributo__EntidadAssignment_0 )
            // InternalEntidades.g:468:3: rule__TipoAtributo__EntidadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__EntidadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTipoAtributoAccess().getEntidadAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Group__0__Impl"


    // $ANTLR start "rule__TipoAtributo__Group__1"
    // InternalEntidades.g:476:1: rule__TipoAtributo__Group__1 : rule__TipoAtributo__Group__1__Impl ;
    public final void rule__TipoAtributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:480:1: ( rule__TipoAtributo__Group__1__Impl )
            // InternalEntidades.g:481:2: rule__TipoAtributo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Group__1__Impl();

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
    // $ANTLR end "rule__TipoAtributo__Group__1"


    // $ANTLR start "rule__TipoAtributo__Group__1__Impl"
    // InternalEntidades.g:487:1: rule__TipoAtributo__Group__1__Impl : ( ( rule__TipoAtributo__Group_1__0 )? ) ;
    public final void rule__TipoAtributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:491:1: ( ( ( rule__TipoAtributo__Group_1__0 )? ) )
            // InternalEntidades.g:492:1: ( ( rule__TipoAtributo__Group_1__0 )? )
            {
            // InternalEntidades.g:492:1: ( ( rule__TipoAtributo__Group_1__0 )? )
            // InternalEntidades.g:493:2: ( rule__TipoAtributo__Group_1__0 )?
            {
             before(grammarAccess.getTipoAtributoAccess().getGroup_1()); 
            // InternalEntidades.g:494:2: ( rule__TipoAtributo__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntidades.g:494:3: rule__TipoAtributo__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TipoAtributo__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTipoAtributoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Group__1__Impl"


    // $ANTLR start "rule__TipoAtributo__Group_1__0"
    // InternalEntidades.g:503:1: rule__TipoAtributo__Group_1__0 : rule__TipoAtributo__Group_1__0__Impl rule__TipoAtributo__Group_1__1 ;
    public final void rule__TipoAtributo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:507:1: ( rule__TipoAtributo__Group_1__0__Impl rule__TipoAtributo__Group_1__1 )
            // InternalEntidades.g:508:2: rule__TipoAtributo__Group_1__0__Impl rule__TipoAtributo__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__TipoAtributo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Group_1__1();

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
    // $ANTLR end "rule__TipoAtributo__Group_1__0"


    // $ANTLR start "rule__TipoAtributo__Group_1__0__Impl"
    // InternalEntidades.g:515:1: rule__TipoAtributo__Group_1__0__Impl : ( ( rule__TipoAtributo__ArrayAssignment_1_0 ) ) ;
    public final void rule__TipoAtributo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:519:1: ( ( ( rule__TipoAtributo__ArrayAssignment_1_0 ) ) )
            // InternalEntidades.g:520:1: ( ( rule__TipoAtributo__ArrayAssignment_1_0 ) )
            {
            // InternalEntidades.g:520:1: ( ( rule__TipoAtributo__ArrayAssignment_1_0 ) )
            // InternalEntidades.g:521:2: ( rule__TipoAtributo__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getTipoAtributoAccess().getArrayAssignment_1_0()); 
            // InternalEntidades.g:522:2: ( rule__TipoAtributo__ArrayAssignment_1_0 )
            // InternalEntidades.g:522:3: rule__TipoAtributo__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTipoAtributoAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Group_1__0__Impl"


    // $ANTLR start "rule__TipoAtributo__Group_1__1"
    // InternalEntidades.g:530:1: rule__TipoAtributo__Group_1__1 : rule__TipoAtributo__Group_1__1__Impl rule__TipoAtributo__Group_1__2 ;
    public final void rule__TipoAtributo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:534:1: ( rule__TipoAtributo__Group_1__1__Impl rule__TipoAtributo__Group_1__2 )
            // InternalEntidades.g:535:2: rule__TipoAtributo__Group_1__1__Impl rule__TipoAtributo__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__TipoAtributo__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Group_1__2();

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
    // $ANTLR end "rule__TipoAtributo__Group_1__1"


    // $ANTLR start "rule__TipoAtributo__Group_1__1__Impl"
    // InternalEntidades.g:542:1: rule__TipoAtributo__Group_1__1__Impl : ( ( rule__TipoAtributo__LengthAssignment_1_1 )? ) ;
    public final void rule__TipoAtributo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:546:1: ( ( ( rule__TipoAtributo__LengthAssignment_1_1 )? ) )
            // InternalEntidades.g:547:1: ( ( rule__TipoAtributo__LengthAssignment_1_1 )? )
            {
            // InternalEntidades.g:547:1: ( ( rule__TipoAtributo__LengthAssignment_1_1 )? )
            // InternalEntidades.g:548:2: ( rule__TipoAtributo__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getTipoAtributoAccess().getLengthAssignment_1_1()); 
            // InternalEntidades.g:549:2: ( rule__TipoAtributo__LengthAssignment_1_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntidades.g:549:3: rule__TipoAtributo__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TipoAtributo__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTipoAtributoAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Group_1__1__Impl"


    // $ANTLR start "rule__TipoAtributo__Group_1__2"
    // InternalEntidades.g:557:1: rule__TipoAtributo__Group_1__2 : rule__TipoAtributo__Group_1__2__Impl ;
    public final void rule__TipoAtributo__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:561:1: ( rule__TipoAtributo__Group_1__2__Impl )
            // InternalEntidades.g:562:2: rule__TipoAtributo__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Group_1__2__Impl();

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
    // $ANTLR end "rule__TipoAtributo__Group_1__2"


    // $ANTLR start "rule__TipoAtributo__Group_1__2__Impl"
    // InternalEntidades.g:568:1: rule__TipoAtributo__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TipoAtributo__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:572:1: ( ( ']' ) )
            // InternalEntidades.g:573:1: ( ']' )
            {
            // InternalEntidades.g:573:1: ( ']' )
            // InternalEntidades.g:574:2: ']'
            {
             before(grammarAccess.getTipoAtributoAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTipoAtributoAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Group_1__2__Impl"


    // $ANTLR start "rule__Model__EntidadesAssignment"
    // InternalEntidades.g:584:1: rule__Model__EntidadesAssignment : ( ruleEntidad ) ;
    public final void rule__Model__EntidadesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:588:1: ( ( ruleEntidad ) )
            // InternalEntidades.g:589:2: ( ruleEntidad )
            {
            // InternalEntidades.g:589:2: ( ruleEntidad )
            // InternalEntidades.g:590:3: ruleEntidad
            {
             before(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntidadesAssignment"


    // $ANTLR start "rule__Entidad__NameAssignment_1"
    // InternalEntidades.g:599:1: rule__Entidad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entidad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:603:1: ( ( RULE_ID ) )
            // InternalEntidades.g:604:2: ( RULE_ID )
            {
            // InternalEntidades.g:604:2: ( RULE_ID )
            // InternalEntidades.g:605:3: RULE_ID
            {
             before(grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_1"


    // $ANTLR start "rule__Entidad__SuperTipoAssignment_2_1"
    // InternalEntidades.g:614:1: rule__Entidad__SuperTipoAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entidad__SuperTipoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:618:1: ( ( ( RULE_ID ) ) )
            // InternalEntidades.g:619:2: ( ( RULE_ID ) )
            {
            // InternalEntidades.g:619:2: ( ( RULE_ID ) )
            // InternalEntidades.g:620:3: ( RULE_ID )
            {
             before(grammarAccess.getEntidadAccess().getSuperTipoEntidadCrossReference_2_1_0()); 
            // InternalEntidades.g:621:3: ( RULE_ID )
            // InternalEntidades.g:622:4: RULE_ID
            {
             before(grammarAccess.getEntidadAccess().getSuperTipoEntidadIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getSuperTipoEntidadIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntidadAccess().getSuperTipoEntidadCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__SuperTipoAssignment_2_1"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4"
    // InternalEntidades.g:633:1: rule__Entidad__AtributosAssignment_4 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:637:1: ( ( ruleAtributo ) )
            // InternalEntidades.g:638:2: ( ruleAtributo )
            {
            // InternalEntidades.g:638:2: ( ruleAtributo )
            // InternalEntidades.g:639:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4"


    // $ANTLR start "rule__Atributo__TipoAssignment_0"
    // InternalEntidades.g:648:1: rule__Atributo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__Atributo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:652:1: ( ( ruleTipoAtributo ) )
            // InternalEntidades.g:653:2: ( ruleTipoAtributo )
            {
            // InternalEntidades.g:653:2: ( ruleTipoAtributo )
            // InternalEntidades.g:654:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoAccess().getTipoTipoAtributoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipoTipoAtributoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipoAssignment_0"


    // $ANTLR start "rule__Atributo__NameAssignment_1"
    // InternalEntidades.g:663:1: rule__Atributo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:667:1: ( ( RULE_ID ) )
            // InternalEntidades.g:668:2: ( RULE_ID )
            {
            // InternalEntidades.g:668:2: ( RULE_ID )
            // InternalEntidades.g:669:3: RULE_ID
            {
             before(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NameAssignment_1"


    // $ANTLR start "rule__TipoAtributo__EntidadAssignment_0"
    // InternalEntidades.g:678:1: rule__TipoAtributo__EntidadAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TipoAtributo__EntidadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:682:1: ( ( ( RULE_ID ) ) )
            // InternalEntidades.g:683:2: ( ( RULE_ID ) )
            {
            // InternalEntidades.g:683:2: ( ( RULE_ID ) )
            // InternalEntidades.g:684:3: ( RULE_ID )
            {
             before(grammarAccess.getTipoAtributoAccess().getEntidadEntidadCrossReference_0_0()); 
            // InternalEntidades.g:685:3: ( RULE_ID )
            // InternalEntidades.g:686:4: RULE_ID
            {
             before(grammarAccess.getTipoAtributoAccess().getEntidadEntidadIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTipoAtributoAccess().getEntidadEntidadIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTipoAtributoAccess().getEntidadEntidadCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__EntidadAssignment_0"


    // $ANTLR start "rule__TipoAtributo__ArrayAssignment_1_0"
    // InternalEntidades.g:697:1: rule__TipoAtributo__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__TipoAtributo__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:701:1: ( ( ( '[' ) ) )
            // InternalEntidades.g:702:2: ( ( '[' ) )
            {
            // InternalEntidades.g:702:2: ( ( '[' ) )
            // InternalEntidades.g:703:3: ( '[' )
            {
             before(grammarAccess.getTipoAtributoAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalEntidades.g:704:3: ( '[' )
            // InternalEntidades.g:705:4: '['
            {
             before(grammarAccess.getTipoAtributoAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTipoAtributoAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getTipoAtributoAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__ArrayAssignment_1_0"


    // $ANTLR start "rule__TipoAtributo__LengthAssignment_1_1"
    // InternalEntidades.g:716:1: rule__TipoAtributo__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TipoAtributo__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntidades.g:720:1: ( ( RULE_INT ) )
            // InternalEntidades.g:721:2: ( RULE_INT )
            {
            // InternalEntidades.g:721:2: ( RULE_INT )
            // InternalEntidades.g:722:3: RULE_INT
            {
             before(grammarAccess.getTipoAtributoAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTipoAtributoAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__LengthAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010020L});

}