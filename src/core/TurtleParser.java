package core;
// Generated from Turtle.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NumericLiteral=25, BooleanLiteral=26, String=27, BlankNode=28, CHAR=29, 
		WS=30, COMMENT=31, PN_PREFIX=32, IRIREF=33, PNAME_NS=34, PrefixedName=35, 
		PNAME_LN=36, BAD_PNAME_LN_STARTS_WITH_DOT=37, BAD_PNAME_LN_ENDS_WITH_DOT=38, 
		BLANK_NODE_LABEL=39, LANGTAG=40, LANGTAG_BAD_AS_NUMBER=41, INTEGER=42, 
		DECIMAL=43, DOUBLE=44, EXPONENT=45, STRING_LITERAL_LONG_SINGLE_QUOTE=46, 
		STRING_LITERAL_LONG_QUOTE=47, STRING_LITERAL_QUOTE=48, STRING_LITERAL_SINGLE_QUOTE=49, 
		UCHAR=50, ECHAR=51, ANON_WS=52, ANON=53, PN_CHARS_BASE=54, PN_CHARS_U=55, 
		PN_CHARS=56, PN_LOCAL=57, PN_LOCAL_BAD_STARTS_WITH_PERCENT=58, PLX=59, 
		PERCENT=60, HEX=61, PN_LOCAL_ESC=62, IRIREF_BAD_WITH_SPACE=63, IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS=64, 
		IRIREF_BAD_WITH_PARENTHESES=65;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_directive = 2, RULE_errors = 3, 
		RULE_unkonwnDecl = 4, RULE_prefixID = 5, RULE_base = 6, RULE_sparqlBase = 7, 
		RULE_sparqlPrefix = 8, RULE_triples = 9, RULE_predicateObjectList = 10, 
		RULE_objectList = 11, RULE_verb = 12, RULE_subject = 13, RULE_predicate = 14, 
		RULE_object = 15, RULE_literal = 16, RULE_blankNodePropertyList = 17, 
		RULE_collection = 18, RULE_rdfLiteral = 19, RULE_iri = 20;
	public static final String[] ruleNames = {
		"start", "statement", "directive", "errors", "unkonwnDecl", "prefixID", 
		"base", "sparqlBase", "sparqlPrefix", "triples", "predicateObjectList", 
		"objectList", "verb", "subject", "predicate", "object", "literal", "blankNodePropertyList", 
		"collection", "rdfLiteral", "iri"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'='", "'<='", "';'", "'=>'", "'@keywords'", "'a'", "'@prefix'", 
		"'@base'", "'BASE'", "'@BASE'", "'PREFIX'", "','", "'is'", "'of'", "'A'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "'^^'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NumericLiteral", "BooleanLiteral", "String", "BlankNode", "CHAR", 
		"WS", "COMMENT", "PN_PREFIX", "IRIREF", "PNAME_NS", "PrefixedName", "PNAME_LN", 
		"BAD_PNAME_LN_STARTS_WITH_DOT", "BAD_PNAME_LN_ENDS_WITH_DOT", "BLANK_NODE_LABEL", 
		"LANGTAG", "LANGTAG_BAD_AS_NUMBER", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", 
		"STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", 
		"STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", "ANON_WS", "ANON", "PN_CHARS_BASE", 
		"PN_CHARS_U", "PN_CHARS", "PN_LOCAL", "PN_LOCAL_BAD_STARTS_WITH_PERCENT", 
		"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", "IRIREF_BAD_WITH_SPACE", "IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS", 
		"IRIREF_BAD_WITH_PARENTHESES"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Turtle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TurtleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__6 - 6)) | (1L << (T__7 - 6)) | (1L << (T__8 - 6)) | (1L << (T__9 - 6)) | (1L << (T__10 - 6)) | (1L << (T__11 - 6)) | (1L << (T__16 - 6)) | (1L << (T__18 - 6)) | (1L << (T__20 - 6)) | (1L << (NumericLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (BlankNode - 6)) | (1L << (IRIREF - 6)) | (1L << (PNAME_NS - 6)) | (1L << (PrefixedName - 6)) | (1L << (BAD_PNAME_LN_STARTS_WITH_DOT - 6)) | (1L << (BAD_PNAME_LN_ENDS_WITH_DOT - 6)) | (1L << (IRIREF_BAD_WITH_SPACE - 6)) | (1L << (IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS - 6)) | (1L << (IRIREF_BAD_WITH_PARENTHESES - 6)))) != 0)) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public ErrorsContext errors() {
			return getRuleContext(ErrorsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				triples();
				setState(50);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				triples();
				notifyErrorListeners("Missing '.' at the end of the triple");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				errors();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public PrefixIDContext prefixID() {
			return getRuleContext(PrefixIDContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public SparqlPrefixContext sparqlPrefix() {
			return getRuleContext(SparqlPrefixContext.class,0);
		}
		public SparqlBaseContext sparqlBase() {
			return getRuleContext(SparqlBaseContext.class,0);
		}
		public UnkonwnDeclContext unkonwnDecl() {
			return getRuleContext(UnkonwnDeclContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				prefixID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				base();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				sparqlPrefix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				sparqlBase();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				unkonwnDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				sparqlPrefix();
				setState(64);
				match(T__0);
				notifyErrorListeners("Extraneous '.' at the end of SPARQL prefix directive");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				sparqlBase();
				setState(68);
				match(T__0);
				notifyErrorListeners("Extraneous '.' at the end of SPARQL base directive");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorsContext extends ParserRuleContext {
		public List<IriContext> iri() {
			return getRuleContexts(IriContext.class);
		}
		public IriContext iri(int i) {
			return getRuleContext(IriContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public ErrorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterErrors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitErrors(this);
		}
	}

	public final ErrorsContext errors() throws RecognitionException {
		ErrorsContext _localctx = new ErrorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_errors);
		int _la;
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				iri();
				setState(74);
				match(T__1);
				setState(75);
				iri();
				setState(76);
				match(T__0);
				notifyErrorListeners("'=' sign cannot be used in Turtle");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				iri();
				setState(80);
				match(T__2);
				setState(81);
				iri();
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						match(T__3);
						setState(83);
						predicate();
						setState(84);
						objectList();
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(91);
					match(T__3);
					}
				}

				notifyErrorListeners("'<=' is not in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				iri();
				setState(97);
				match(T__4);
				setState(98);
				iri();
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						match(T__3);
						setState(100);
						predicate();
						setState(101);
						objectList();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(108);
					match(T__3);
					}
				}

				notifyErrorListeners("'=>' is not in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(113);
						iri();
						setState(114);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(120);
						iri();
						setState(121);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(127);
				triples();
				setState(128);
				match(T__0);
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(131);
						iri();
						setState(132);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(136); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(141); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(138);
						iri();
						setState(139);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(143); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(145);
				triples();
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnkonwnDeclContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(TurtleParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(TurtleParser.CHAR, i);
		}
		public UnkonwnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unkonwnDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterUnkonwnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitUnkonwnDecl(this);
		}
	}

	public final UnkonwnDeclContext unkonwnDecl() throws RecognitionException {
		UnkonwnDeclContext _localctx = new UnkonwnDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unkonwnDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__5);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==CHAR) {
				{
				{
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__0);
			notifyErrorListeners("@keywords is unkown directive in Turtle");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixIDContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public PrefixIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPrefixID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPrefixID(this);
		}
	}

	public final PrefixIDContext prefixID() throws RecognitionException {
		PrefixIDContext _localctx = new PrefixIDContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prefixID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__7);
			setState(161);
			match(PNAME_NS);
			setState(162);
			match(IRIREF);
			setState(163);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__8);
			setState(166);
			match(IRIREF);
			setState(167);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlBaseContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public SparqlBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterSparqlBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitSparqlBase(this);
		}
	}

	public final SparqlBaseContext sparqlBase() throws RecognitionException {
		SparqlBaseContext _localctx = new SparqlBaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sparqlBase);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__9);
				setState(170);
				match(IRIREF);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__10);
				setState(172);
				match(IRIREF);
				setState(173);
				match(T__0);
				notifyErrorListeners("Uncorrect syntax form of base directive");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlPrefixContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public SparqlPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterSparqlPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitSparqlPrefix(this);
		}
	}

	public final SparqlPrefixContext sparqlPrefix() throws RecognitionException {
		SparqlPrefixContext _localctx = new SparqlPrefixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sparqlPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__11);
			setState(178);
			match(PNAME_NS);
			setState(179);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriplesContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitTriples(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException {
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_triples);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__16:
			case T__20:
			case NumericLiteral:
			case BooleanLiteral:
			case BlankNode:
			case IRIREF:
			case PNAME_NS:
			case PrefixedName:
			case BAD_PNAME_LN_STARTS_WITH_DOT:
			case BAD_PNAME_LN_ENDS_WITH_DOT:
			case IRIREF_BAD_WITH_SPACE:
			case IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS:
			case IRIREF_BAD_WITH_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				subject();
				setState(182);
				predicateObjectList();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				blankNodePropertyList();
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(185);
					predicateObjectList();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateObjectListContext extends ParserRuleContext {
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public PredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPredicateObjectList(this);
		}
	}

	public final PredicateObjectListContext predicateObjectList() throws RecognitionException {
		PredicateObjectListContext _localctx = new PredicateObjectListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_predicateObjectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			verb();
			setState(191);
			objectList();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(192);
				match(T__3);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(193);
					verb();
					setState(194);
					objectList();
					}
					break;
				}
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectListContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitObjectList(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			object();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(204);
				match(T__12);
				setState(205);
				object();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(TurtleParser.BlankNode, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_verb);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__13);
				setState(213);
				predicate();
				setState(214);
				match(T__14);
				notifyErrorListeners("'is .. of' pattern is not used in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(T__15);
				notifyErrorListeners("'A' cannot be used as predicate, it should be repalced with 'a'");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(BooleanLiteral);
				notifyErrorListeners("Predicate cannot be a boolean value");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(NumericLiteral);
				notifyErrorListeners("Predicate cannot be a number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				literal();
				notifyErrorListeners("Predicate cannot be a literal");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				match(BlankNode);
				notifyErrorListeners("Predicate cannot be a blank node");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(TurtleParser.BlankNode, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subject);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				iri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(BlankNode);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(BlankNode);
				setState(234);
				match(T__0);
				notifyErrorListeners("Blank Node cannot be followed by '.'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(T__6);
				notifyErrorListeners("'a' cannot be used as a subject");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(BooleanLiteral);
				notifyErrorListeners("Subject cannot be a boolean value");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(NumericLiteral);
				notifyErrorListeners("Subject cannot be a number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				collection();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(T__16);
				setState(244);
				triples();
				setState(245);
				match(T__0);
				setState(246);
				match(T__17);
				notifyErrorListeners("{ } pattern cannot be used in Turtle");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				match(T__16);
				setState(250);
				triples();
				setState(251);
				match(T__17);
				notifyErrorListeners("{ } pattern cannot be used in Turtle");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(TurtleParser.BlankNode, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_object);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PrefixedName:
			case BAD_PNAME_LN_STARTS_WITH_DOT:
			case BAD_PNAME_LN_ENDS_WITH_DOT:
			case IRIREF_BAD_WITH_SPACE:
			case IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS:
			case IRIREF_BAD_WITH_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				iri();
				}
				break;
			case BlankNode:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(BlankNode);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				collection();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				blankNodePropertyList();
				}
				break;
			case NumericLiteral:
			case BooleanLiteral:
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				literal();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(T__6);
				notifyErrorListeners("'a' cannot be used as an object");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				rdfLiteral();
				}
				break;
			case NumericLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(NumericLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBlankNodePropertyList(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__18);
			setState(273);
			predicateObjectList();
			setState(274);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__20);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__18 - 7)) | (1L << (T__20 - 7)) | (1L << (NumericLiteral - 7)) | (1L << (BooleanLiteral - 7)) | (1L << (String - 7)) | (1L << (BlankNode - 7)) | (1L << (IRIREF - 7)) | (1L << (PNAME_NS - 7)) | (1L << (PrefixedName - 7)) | (1L << (BAD_PNAME_LN_STARTS_WITH_DOT - 7)) | (1L << (BAD_PNAME_LN_ENDS_WITH_DOT - 7)) | (1L << (IRIREF_BAD_WITH_SPACE - 7)) | (1L << (IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS - 7)) | (1L << (IRIREF_BAD_WITH_PARENTHESES - 7)))) != 0)) {
				{
				{
				setState(277);
				object();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RdfLiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(TurtleParser.String, 0); }
		public TerminalNode LANGTAG() { return getToken(TurtleParser.LANGTAG, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode LANGTAG_BAD_AS_NUMBER() { return getToken(TurtleParser.LANGTAG_BAD_AS_NUMBER, 0); }
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitRdfLiteral(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rdfLiteral);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(String);
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(286);
					match(LANGTAG);
					}
					break;
				case T__22:
					{
					setState(287);
					match(T__22);
					setState(288);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__3:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case NumericLiteral:
				case BooleanLiteral:
				case String:
				case BlankNode:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case IRIREF_BAD_WITH_SPACE:
				case IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS:
				case IRIREF_BAD_WITH_PARENTHESES:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(String);
				setState(292);
				match(LANGTAG_BAD_AS_NUMBER);
				notifyErrorListeners("Language tag cannot be a numeric value");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(String);
				setState(295);
				match(T__23);
				setState(296);
				iri();
				notifyErrorListeners("Missing '^' Character");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(String);
				setState(300);
				match(LANGTAG);
				setState(301);
				match(T__22);
				setState(302);
				iri();
				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(String);
				setState(306);
				match(T__22);
				setState(307);
				iri();
				setState(308);
				match(LANGTAG);
				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PrefixedName() { return getToken(TurtleParser.PrefixedName, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public TerminalNode PN_LOCAL_BAD_STARTS_WITH_PERCENT() { return getToken(TurtleParser.PN_LOCAL_BAD_STARTS_WITH_PERCENT, 0); }
		public TerminalNode BAD_PNAME_LN_STARTS_WITH_DOT() { return getToken(TurtleParser.BAD_PNAME_LN_STARTS_WITH_DOT, 0); }
		public TerminalNode BAD_PNAME_LN_ENDS_WITH_DOT() { return getToken(TurtleParser.BAD_PNAME_LN_ENDS_WITH_DOT, 0); }
		public TerminalNode IRIREF_BAD_WITH_SPACE() { return getToken(TurtleParser.IRIREF_BAD_WITH_SPACE, 0); }
		public TerminalNode IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS() { return getToken(TurtleParser.IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS, 0); }
		public TerminalNode IRIREF_BAD_WITH_PARENTHESES() { return getToken(TurtleParser.IRIREF_BAD_WITH_PARENTHESES, 0); }
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitIri(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iri);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(IRIREF);
				}
				break;
			case PrefixedName:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(PrefixedName);
				}
				break;
			case PNAME_NS:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(PNAME_NS);
				setState(316);
				match(PN_LOCAL_BAD_STARTS_WITH_PERCENT);
				notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot contain '%'");
				}
				break;
			case BAD_PNAME_LN_STARTS_WITH_DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(BAD_PNAME_LN_STARTS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of Prefixed Namespace, it cannot start with '.'");
				}
				break;
			case BAD_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(BAD_PNAME_LN_ENDS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of Prefixed Namespace, it cannot end with '.'");
				}
				break;
			case IRIREF_BAD_WITH_SPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				match(IRIREF_BAD_WITH_SPACE);
				notifyErrorListeners("Bas syntax of IRI, IRI cannot contain space or newline");
				}
				break;
			case IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				match(IRIREF_BAD_WITH_MULTIPLE_ANGLE_BRACKETS);
				notifyErrorListeners("Bas syntax of IRI, Too many angle brackets in IRI");
				}
				break;
			case IRIREF_BAD_WITH_PARENTHESES:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				match(IRIREF_BAD_WITH_PARENTHESES);
				notifyErrorListeners("Bas syntax of IRI, IRI cannot contain parentheses");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\5\5_\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\5\5p\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\6\5w\n\5\r\5\16\5x\3\5\3\5\3\5\6\5~\n\5\r\5\16\5\177\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\6\5\u0089\n\5\r\5\16\5\u008a\3\5\3\5\3\5\6\5\u0090"+
		"\n\5\r\5\16\5\u0091\3\5\3\5\3\5\5\5\u0097\n\5\3\6\3\6\7\6\u009b\n\6\f"+
		"\6\16\6\u009e\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00b2\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00bd\n\13\5\13\u00bf\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c7"+
		"\n\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\r\3\r\3\r\7\r\u00d1\n\r\f\r\16"+
		"\r\u00d4\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0101\n\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u010c\n\21\3\22\3\22\3\22\5\22\u0111\n\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\5\25\u0124\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u013a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u014b\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\3\4\2\t\t\37\37\2\u0178\2/\3\2\2\2\4:\3\2"+
		"\2\2\6I\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2\2\f\u00a2\3\2\2\2\16\u00a7"+
		"\3\2\2\2\20\u00b1\3\2\2\2\22\u00b3\3\2\2\2\24\u00be\3\2\2\2\26\u00c0\3"+
		"\2\2\2\30\u00cd\3\2\2\2\32\u00e7\3\2\2\2\34\u0100\3\2\2\2\36\u0102\3\2"+
		"\2\2 \u010b\3\2\2\2\"\u0110\3\2\2\2$\u0112\3\2\2\2&\u0116\3\2\2\2(\u0139"+
		"\3\2\2\2*\u014a\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2\62;\5\6\4\2\63\64\5\24\13\2\64\65\7"+
		"\3\2\2\65;\3\2\2\2\66\67\5\24\13\2\678\b\3\1\28;\3\2\2\29;\5\b\5\2:\62"+
		"\3\2\2\2:\63\3\2\2\2:\66\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<J\5\f\7\2=J\5\16"+
		"\b\2>J\5\22\n\2?J\5\20\t\2@J\5\n\6\2AB\5\22\n\2BC\7\3\2\2CD\b\4\1\2DJ"+
		"\3\2\2\2EF\5\20\t\2FG\7\3\2\2GH\b\4\1\2HJ\3\2\2\2I<\3\2\2\2I=\3\2\2\2"+
		"I>\3\2\2\2I?\3\2\2\2I@\3\2\2\2IA\3\2\2\2IE\3\2\2\2J\7\3\2\2\2KL\5*\26"+
		"\2LM\7\4\2\2MN\5*\26\2NO\7\3\2\2OP\b\5\1\2P\u0097\3\2\2\2QR\5*\26\2RS"+
		"\7\5\2\2SZ\5*\26\2TU\7\6\2\2UV\5\36\20\2VW\5\30\r\2WY\3\2\2\2XT\3\2\2"+
		"\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\7\6\2\2^]\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`a\b\5\1\2a\u0097\3\2\2\2bc\5*\26\2cd\7\7\2\2"+
		"dk\5*\26\2ef\7\6\2\2fg\5\36\20\2gh\5\30\r\2hj\3\2\2\2ie\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\7\6\2\2on\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\b\5\1\2r\u0097\3\2\2\2st\5*\26\2tu\7\3\2\2uw\3\2\2\2"+
		"vs\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2z{\5*\26\2{|\7\3\2\2"+
		"|~\3\2\2\2}z\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\3\2\2\u0083\u0084\b"+
		"\5\1\2\u0084\u0097\3\2\2\2\u0085\u0086\5*\26\2\u0086\u0087\7\3\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008f\3\2\2\2\u008c\u008d\5*\26\2\u008d"+
		"\u008e\7\3\2\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\u0095\b\5\1\2\u0095\u0097\3\2\2\2\u0096K\3\2\2"+
		"\2\u0096Q\3\2\2\2\u0096b\3\2\2\2\u0096v\3\2\2\2\u0096\u0088\3\2\2\2\u0097"+
		"\t\3\2\2\2\u0098\u009c\7\b\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\b\6\1\2\u00a1"+
		"\13\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a5\7#\2\2"+
		"\u00a5\u00a6\7\3\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9"+
		"\7#\2\2\u00a9\u00aa\7\3\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac"+
		"\u00b2\7#\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\3\2"+
		"\2\u00b0\u00b2\b\t\1\2\u00b1\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\21"+
		"\3\2\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7#\2\2\u00b6"+
		"\23\3\2\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\5\26\f\2\u00b9\u00bf\3\2"+
		"\2\2\u00ba\u00bc\5$\23\2\u00bb\u00bd\5\26\f\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00ba\3\2"+
		"\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00ca\5\30\r\2\u00c2"+
		"\u00c6\7\6\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\5\30\r\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\27\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d2\5 \21\2\u00ce\u00cf"+
		"\7\17\2\2\u00cf\u00d1\5 \21\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00e8\5\36\20\2\u00d6\u00d7\7\20\2\2\u00d7\u00d8\5\36\20"+
		"\2\u00d8\u00d9\7\21\2\2\u00d9\u00da\b\16\1\2\u00da\u00e8\3\2\2\2\u00db"+
		"\u00e8\7\t\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00e8\b\16\1\2\u00de\u00df\7"+
		"\34\2\2\u00df\u00e8\b\16\1\2\u00e0\u00e1\7\33\2\2\u00e1\u00e8\b\16\1\2"+
		"\u00e2\u00e3\5\"\22\2\u00e3\u00e4\b\16\1\2\u00e4\u00e8\3\2\2\2\u00e5\u00e6"+
		"\7\36\2\2\u00e6\u00e8\b\16\1\2\u00e7\u00d5\3\2\2\2\u00e7\u00d6\3\2\2\2"+
		"\u00e7\u00db\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e0"+
		"\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\33\3\2\2\2\u00e9"+
		"\u0101\5*\26\2\u00ea\u0101\7\36\2\2\u00eb\u00ec\7\36\2\2\u00ec\u00ed\7"+
		"\3\2\2\u00ed\u0101\b\17\1\2\u00ee\u00ef\7\t\2\2\u00ef\u0101\b\17\1\2\u00f0"+
		"\u00f1\7\34\2\2\u00f1\u0101\b\17\1\2\u00f2\u00f3\7\33\2\2\u00f3\u0101"+
		"\b\17\1\2\u00f4\u0101\5&\24\2\u00f5\u00f6\7\23\2\2\u00f6\u00f7\5\24\13"+
		"\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\b\17\1\2\u00fa"+
		"\u0101\3\2\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe"+
		"\7\24\2\2\u00fe\u00ff\b\17\1\2\u00ff\u0101\3\2\2\2\u0100\u00e9\3\2\2\2"+
		"\u0100\u00ea\3\2\2\2\u0100\u00eb\3\2\2\2\u0100\u00ee\3\2\2\2\u0100\u00f0"+
		"\3\2\2\2\u0100\u00f2\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f5\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0101\35\3\2\2\2\u0102\u0103\5*\26\2\u0103\37\3\2\2\2\u0104"+
		"\u010c\5*\26\2\u0105\u010c\7\36\2\2\u0106\u010c\5&\24\2\u0107\u010c\5"+
		"$\23\2\u0108\u010c\5\"\22\2\u0109\u010a\7\t\2\2\u010a\u010c\b\21\1\2\u010b"+
		"\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2"+
		"\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010c!\3\2\2\2\u010d\u0111"+
		"\5(\25\2\u010e\u0111\7\33\2\2\u010f\u0111\7\34\2\2\u0110\u010d\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111#\3\2\2\2\u0112\u0113\7"+
		"\25\2\2\u0113\u0114\5\26\f\2\u0114\u0115\7\26\2\2\u0115%\3\2\2\2\u0116"+
		"\u011a\7\27\2\2\u0117\u0119\5 \21\2\u0118\u0117\3\2\2\2\u0119\u011c\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\7\30\2\2\u011e\'\3\2\2\2\u011f\u0123\7\35\2"+
		"\2\u0120\u0124\7*\2\2\u0121\u0122\7\31\2\2\u0122\u0124\5*\26\2\u0123\u0120"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u013a\3\2\2\2\u0125"+
		"\u0126\7\35\2\2\u0126\u0127\7+\2\2\u0127\u013a\b\25\1\2\u0128\u0129\7"+
		"\35\2\2\u0129\u012a\7\32\2\2\u012a\u012b\5*\26\2\u012b\u012c\b\25\1\2"+
		"\u012c\u013a\3\2\2\2\u012d\u012e\7\35\2\2\u012e\u012f\7*\2\2\u012f\u0130"+
		"\7\31\2\2\u0130\u0131\5*\26\2\u0131\u0132\b\25\1\2\u0132\u013a\3\2\2\2"+
		"\u0133\u0134\7\35\2\2\u0134\u0135\7\31\2\2\u0135\u0136\5*\26\2\u0136\u0137"+
		"\7*\2\2\u0137\u0138\b\25\1\2\u0138\u013a\3\2\2\2\u0139\u011f\3\2\2\2\u0139"+
		"\u0125\3\2\2\2\u0139\u0128\3\2\2\2\u0139\u012d\3\2\2\2\u0139\u0133\3\2"+
		"\2\2\u013a)\3\2\2\2\u013b\u014b\7#\2\2\u013c\u014b\7%\2\2\u013d\u013e"+
		"\7$\2\2\u013e\u013f\7<\2\2\u013f\u014b\b\26\1\2\u0140\u0141\7\'\2\2\u0141"+
		"\u014b\b\26\1\2\u0142\u0143\7(\2\2\u0143\u014b\b\26\1\2\u0144\u0145\7"+
		"A\2\2\u0145\u014b\b\26\1\2\u0146\u0147\7B\2\2\u0147\u014b\b\26\1\2\u0148"+
		"\u0149\7C\2\2\u0149\u014b\b\26\1\2\u014a\u013b\3\2\2\2\u014a\u013c\3\2"+
		"\2\2\u014a\u013d\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0142\3\2\2\2\u014a"+
		"\u0144\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0148\3\2\2\2\u014b+\3\2\2\2"+
		"\35/:IZ^kox\177\u008a\u0091\u0096\u009c\u00b1\u00bc\u00be\u00c6\u00ca"+
		"\u00d2\u00e7\u0100\u010b\u0110\u011a\u0123\u0139\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
