package cl.ejemplo.entidades.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cl.ejemplo.entidades.services.EntidadesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntidadesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entidad'", "'extends'", "'{'", "'}'", "';'", "'['", "']'"
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

        public InternalEntidadesParser(TokenStream input, EntidadesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EntidadesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEntidades.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEntidades.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEntidades.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalEntidades.g:71:1: ruleModel returns [EObject current=null] : ( (lv_entidades_0_0= ruleEntidad ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entidades_0_0 = null;



        	enterRule();

        try {
            // InternalEntidades.g:77:2: ( ( (lv_entidades_0_0= ruleEntidad ) )* )
            // InternalEntidades.g:78:2: ( (lv_entidades_0_0= ruleEntidad ) )*
            {
            // InternalEntidades.g:78:2: ( (lv_entidades_0_0= ruleEntidad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntidades.g:79:3: (lv_entidades_0_0= ruleEntidad )
            	    {
            	    // InternalEntidades.g:79:3: (lv_entidades_0_0= ruleEntidad )
            	    // InternalEntidades.g:80:4: lv_entidades_0_0= ruleEntidad
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entidades_0_0=ruleEntidad();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entidades",
            	    					lv_entidades_0_0,
            	    					"cl.ejemplo.entidades.Entidades.Entidad");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleEntidad"
    // InternalEntidades.g:100:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalEntidades.g:100:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalEntidades.g:101:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalEntidades.g:107:1: ruleEntidad returns [EObject current=null] : (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_atributos_5_0= ruleAtributo ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_atributos_5_0 = null;



        	enterRule();

        try {
            // InternalEntidades.g:113:2: ( (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_atributos_5_0= ruleAtributo ) )* otherlv_6= '}' ) )
            // InternalEntidades.g:114:2: (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_atributos_5_0= ruleAtributo ) )* otherlv_6= '}' )
            {
            // InternalEntidades.g:114:2: (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_atributos_5_0= ruleAtributo ) )* otherlv_6= '}' )
            // InternalEntidades.g:115:3: otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_atributos_5_0= ruleAtributo ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadAccess().getEntidadKeyword_0());
            		
            // InternalEntidades.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntidades.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntidades.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalEntidades.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntidades.g:137:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntidades.g:138:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntidadAccess().getExtendsKeyword_2_0());
                    			
                    // InternalEntidades.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEntidades.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEntidades.g:143:5: (otherlv_3= RULE_ID )
                    // InternalEntidades.g:144:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntidadRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getSuperTipoEntidadCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEntidades.g:160:3: ( (lv_atributos_5_0= ruleAtributo ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntidades.g:161:4: (lv_atributos_5_0= ruleAtributo )
            	    {
            	    // InternalEntidades.g:161:4: (lv_atributos_5_0= ruleAtributo )
            	    // InternalEntidades.g:162:5: lv_atributos_5_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_atributos_5_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_5_0,
            	    						"cl.ejemplo.entidades.Entidades.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalEntidades.g:187:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalEntidades.g:187:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalEntidades.g:188:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalEntidades.g:194:1: ruleAtributo returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_0_0 = null;



        	enterRule();

        try {
            // InternalEntidades.g:200:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalEntidades.g:201:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalEntidades.g:201:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalEntidades.g:202:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalEntidades.g:202:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalEntidades.g:203:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalEntidades.g:203:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalEntidades.g:204:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTipoTipoAtributoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"cl.ejemplo.entidades.Entidades.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEntidades.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntidades.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntidades.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalEntidades.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleTipoAtributo"
    // InternalEntidades.g:247:1: entryRuleTipoAtributo returns [EObject current=null] : iv_ruleTipoAtributo= ruleTipoAtributo EOF ;
    public final EObject entryRuleTipoAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoAtributo = null;


        try {
            // InternalEntidades.g:247:53: (iv_ruleTipoAtributo= ruleTipoAtributo EOF )
            // InternalEntidades.g:248:2: iv_ruleTipoAtributo= ruleTipoAtributo EOF
            {
             newCompositeNode(grammarAccess.getTipoAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoAtributo=ruleTipoAtributo();

            state._fsp--;

             current =iv_ruleTipoAtributo; 
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
    // $ANTLR end "entryRuleTipoAtributo"


    // $ANTLR start "ruleTipoAtributo"
    // InternalEntidades.g:254:1: ruleTipoAtributo returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleTipoAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEntidades.g:260:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // InternalEntidades.g:261:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // InternalEntidades.g:261:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // InternalEntidades.g:262:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // InternalEntidades.g:262:3: ( (otherlv_0= RULE_ID ) )
            // InternalEntidades.g:263:4: (otherlv_0= RULE_ID )
            {
            // InternalEntidades.g:263:4: (otherlv_0= RULE_ID )
            // InternalEntidades.g:264:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTipoAtributoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getTipoAtributoAccess().getEntidadEntidadCrossReference_0_0());
            				

            }


            }

            // InternalEntidades.g:275:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntidades.g:276:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalEntidades.g:276:4: ( (lv_array_1_0= '[' ) )
                    // InternalEntidades.g:277:5: (lv_array_1_0= '[' )
                    {
                    // InternalEntidades.g:277:5: (lv_array_1_0= '[' )
                    // InternalEntidades.g:278:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,16,FOLLOW_10); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getTipoAtributoAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTipoAtributoRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalEntidades.g:290:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalEntidades.g:291:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalEntidades.g:291:5: (lv_length_2_0= RULE_INT )
                            // InternalEntidades.g:292:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getTipoAtributoAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTipoAtributoRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTipoAtributoAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleTipoAtributo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}