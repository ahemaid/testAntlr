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
		T__24=25, T__25=26, T__26=27, T__27=28, NumericLiteral=29, BooleanLiteral=30, 
		BadLiteral=31, String=32, BlankNode=33, CHARS=34, WS=35, COMMENT=36, PN_PREFIX=37, 
		IRIREF=38, PNAME_NS=39, PrefixedName=40, PNAME_LN=41, BAD_PNAME_LN_STARTS_WITH_DOT=42, 
		BAD_PNAME_LN_ENDS_WITH_DOT=43, BLANK_NODE_LABEL=44, LANGTAG=45, BAD_LANGTAG_AS_NUMBER=46, 
		INTEGER=47, DECIMAL=48, DOUBLE=49, EXPONENT=50, STRING_LITERAL_LONG_SINGLE_QUOTE=51, 
		STRING_LITERAL_LONG_QUOTE=52, STRING_LITERAL_QUOTE=53, STRING_LITERAL_SINGLE_QUOTE=54, 
		UCHAR=55, ECHAR=56, ANON_WS=57, ANON=58, PN_CHARS_BASE=59, PN_CHARS_U=60, 
		PN_CHARS=61, PN_LOCAL=62, BAD_PN_LOCAL_STARTS_WITH_PERCENT=63, PLX=64, 
		PERCENT=65, HEX=66, PN_LOCAL_ESC=67, BAD_IRIREF_WITH_SPACE=68, BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS=69, 
		BAD_IRIREF_WITH_PARENTHESES=70;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_directive = 2, RULE_errors = 3, 
		RULE_unkonwnDecl = 4, RULE_prefixID = 5, RULE_base = 6, RULE_sparqlBase = 7, 
		RULE_sparqlPrefix = 8, RULE_triples = 9, RULE_predicateObjectList = 10, 
		RULE_objectList = 11, RULE_verb = 12, RULE_subject = 13, RULE_predicate = 14, 
		RULE_object = 15, RULE_literal = 16, RULE_blankNodePropertyList = 17, 
		RULE_badBlankNodePropertyList = 18, RULE_collection = 19, RULE_rdfLiteral = 20, 
		RULE_iri = 21;
	public static final String[] ruleNames = {
		"start", "statement", "directive", "errors", "unkonwnDecl", "prefixID", 
		"base", "sparqlBase", "sparqlPrefix", "triples", "predicateObjectList", 
		"objectList", "verb", "subject", "predicate", "object", "literal", "blankNodePropertyList", 
		"badBlankNodePropertyList", "collection", "rdfLiteral", "iri"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'='", "'<='", "'=>'", "'@forAll'", "'@forSome'", "'a'", 
		"'@a'", "'@keywords'", "'@prefix'", "':'", "'@base'", "'BASE'", "'@BASE'", 
		"'PREFIX'", "';'", "','", "'is'", "'of'", "'A'", "'{'", "'}'", "'['", 
		"']'", "'('", "')'", "'^^'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NumericLiteral", "BooleanLiteral", "BadLiteral", 
		"String", "BlankNode", "CHARS", "WS", "COMMENT", "PN_PREFIX", "IRIREF", 
		"PNAME_NS", "PrefixedName", "PNAME_LN", "BAD_PNAME_LN_STARTS_WITH_DOT", 
		"BAD_PNAME_LN_ENDS_WITH_DOT", "BLANK_NODE_LABEL", "LANGTAG", "BAD_LANGTAG_AS_NUMBER", 
		"INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
		"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
		"UCHAR", "ECHAR", "ANON_WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", 
		"PN_LOCAL", "BAD_PN_LOCAL_STARTS_WITH_PERCENT", "PLX", "PERCENT", "HEX", 
		"PN_LOCAL_ESC", "BAD_IRIREF_WITH_SPACE", "BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS", 
		"BAD_IRIREF_WITH_PARENTHESES"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << BlankNode) | (1L << CHARS) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PrefixedName) | (1L << BAD_PNAME_LN_STARTS_WITH_DOT) | (1L << BAD_PNAME_LN_ENDS_WITH_DOT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (BAD_IRIREF_WITH_SPACE - 68)) | (1L << (BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS - 68)) | (1L << (BAD_IRIREF_WITH_PARENTHESES - 68)))) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				triples();
				setState(52);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				triples();
				notifyErrorListeners("Missing '.' at the end of the triple");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				prefixID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				base();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				sparqlPrefix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				sparqlBase();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				unkonwnDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				sparqlPrefix();
				setState(66);
				match(T__0);
				notifyErrorListeners("Extraneous '.' at the end of SPARQL prefix directive");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				sparqlBase();
				setState(70);
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
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public List<TerminalNode> CHARS() { return getTokens(TurtleParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(TurtleParser.CHARS, i);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				iri();
				setState(76);
				match(T__1);
				setState(77);
				iri();
				setState(78);
				match(T__0);
				notifyErrorListeners("'=' sign cannot be used in Turtle");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				iri();
				setState(82);
				match(T__2);
				setState(83);
				iri();
				setState(84);
				match(T__0);
				notifyErrorListeners("'<=' symbol cannot be used in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				iri();
				setState(88);
				match(T__3);
				setState(89);
				iri();
				setState(90);
				match(T__0);
				notifyErrorListeners("'=>' symbol cannot be used in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(93);
						iri();
						setState(94);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(103); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(100);
						iri();
						setState(101);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(107);
				triples();
				setState(108);
				match(T__0);
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(111);
						iri();
						setState(112);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(121); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(118);
						iri();
						setState(119);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(123); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(125);
				triples();
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(T__4);
				setState(129);
				iri();
				setState(130);
				match(T__0);
				notifyErrorListeners(" '@forAll' cannot be used in Turtle ");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(T__5);
				setState(134);
				iri();
				setState(135);
				match(T__0);
				notifyErrorListeners(" '@forSome' cannot be used in Turtle ");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==CHARS) {
					{
					{
					setState(138);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==CHARS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__7);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==CHARS) {
					{
					{
					setState(145);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==CHARS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__0);
				notifyErrorListeners(" '@a' cannot be used in Turtle ");
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
		public List<TerminalNode> CHARS() { return getTokens(TurtleParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(TurtleParser.CHARS, i);
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
			setState(155);
			match(T__8);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==CHARS) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==CHARS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		public List<TerminalNode> CHARS() { return getTokens(TurtleParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(TurtleParser.CHARS, i);
		}
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
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
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__9);
				setState(166);
				match(CHARS);
				setState(167);
				match(T__0);
				setState(168);
				match(T__10);
				setState(169);
				match(IRIREF);
				setState(170);
				match(T__0);
				notifyErrorListeners("Prefix Namespace cannot end with '.' ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__9);
				setState(173);
				match(T__0);
				setState(174);
				match(CHARS);
				setState(175);
				match(T__10);
				setState(176);
				match(IRIREF);
				setState(177);
				match(T__0);
				notifyErrorListeners("Prefix Namespace cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__9);
				setState(180);
				match(T__10);
				setState(181);
				match(IRIREF);
				setState(182);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__9);
				setState(184);
				match(PNAME_NS);
				setState(185);
				match(IRIREF);
				setState(186);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(PNAME_NS);
				setState(188);
				match(IRIREF);
				setState(189);
				match(T__0);
				notifyErrorListeners("Missing Prefix keyword, use '@prefix'");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(T__9);
				setState(192);
				match(IRIREF);
				setState(193);
				match(T__0);
				notifyErrorListeners("Missing NameSpace in Prefix directive");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				match(T__9);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHARS) {
					{
					{
					setState(196);
					match(CHARS);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(IRIREF);
				setState(203);
				match(T__0);
				notifyErrorListeners("Missing ':' in Prefix directive");
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
			setState(207);
			match(T__11);
			setState(208);
			match(IRIREF);
			setState(209);
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__12);
				setState(212);
				match(IRIREF);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__13);
				setState(214);
				match(IRIREF);
				setState(215);
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
		public TerminalNode CHARS() { return getToken(TurtleParser.CHARS, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__14);
				setState(220);
				match(CHARS);
				setState(221);
				match(T__0);
				setState(222);
				match(T__10);
				setState(223);
				match(IRIREF);
				notifyErrorListeners("Prefix Namespace cannot end with '.' ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__14);
				setState(226);
				match(T__0);
				setState(227);
				match(CHARS);
				setState(228);
				match(T__10);
				setState(229);
				match(IRIREF);
				notifyErrorListeners("Prefix Namespace cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__14);
				setState(232);
				match(PNAME_NS);
				setState(233);
				match(IRIREF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(PNAME_NS);
				setState(235);
				match(IRIREF);
				notifyErrorListeners("Missing Prefix keyword, use 'PREFIX'");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(T__14);
				setState(238);
				match(IRIREF);
				notifyErrorListeners("Missing NameSpace in Prefix directive");
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__20:
			case T__24:
			case NumericLiteral:
			case BooleanLiteral:
			case BlankNode:
			case IRIREF:
			case PNAME_NS:
			case PrefixedName:
			case BAD_PNAME_LN_STARTS_WITH_DOT:
			case BAD_PNAME_LN_ENDS_WITH_DOT:
			case BAD_IRIREF_WITH_SPACE:
			case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
			case BAD_IRIREF_WITH_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				subject();
				setState(243);
				predicateObjectList();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				blankNodePropertyList();
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(246);
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
			setState(251);
			verb();
			setState(252);
			objectList();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(253);
				match(T__15);
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(254);
					verb();
					setState(255);
					objectList();
					}
					break;
				}
				}
				}
				setState(263);
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
			setState(264);
			object();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(265);
				match(T__16);
				setState(266);
				object();
				}
				}
				setState(271);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__17);
				setState(274);
				predicate();
				setState(275);
				match(T__18);
				notifyErrorListeners("'is .. of' pattern is not used in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(T__19);
				notifyErrorListeners("'A' cannot be used as predicate, it should be repalced with 'a'");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(BooleanLiteral);
				notifyErrorListeners("Predicate cannot be a boolean value");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(NumericLiteral);
				notifyErrorListeners("Predicate cannot be a number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				literal();
				notifyErrorListeners("Predicate cannot be a literal");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				iri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(BlankNode);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(BlankNode);
				setState(295);
				match(T__0);
				notifyErrorListeners("Blank Node cannot be followed by '.'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(T__6);
				notifyErrorListeners("'a' cannot be used as a subject");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(BooleanLiteral);
				notifyErrorListeners("Subject cannot be a boolean value");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(NumericLiteral);
				notifyErrorListeners("Subject cannot be a number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				collection();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(304);
				match(T__20);
				setState(305);
				triples();
				setState(306);
				match(T__0);
				setState(307);
				match(T__21);
				notifyErrorListeners("{ } pattern cannot be used in Turtle");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(310);
				match(T__20);
				setState(311);
				triples();
				setState(312);
				match(T__21);
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
			setState(317);
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
		public BadBlankNodePropertyListContext badBlankNodePropertyList() {
			return getRuleContext(BadBlankNodePropertyListContext.class,0);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				iri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(BlankNode);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				collection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				blankNodePropertyList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				badBlankNodePropertyList();
				notifyErrorListeners("Uncorrect form of a blank node list");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				match(T__6);
				notifyErrorListeners("'a' cannot be used as an object");
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

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public TerminalNode BadLiteral() { return getToken(TurtleParser.BadLiteral, 0); }
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				rdfLiteral();
				}
				break;
			case NumericLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(NumericLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(BooleanLiteral);
				}
				break;
			case BadLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(BadLiteral);
				notifyErrorListeners("Uncorrect form of a Literal");
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
			setState(338);
			match(T__22);
			setState(339);
			predicateObjectList();
			setState(340);
			match(T__23);
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

	public static class BadBlankNodePropertyListContext extends ParserRuleContext {
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BadBlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badBlankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBadBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBadBlankNodePropertyList(this);
		}
	}

	public final BadBlankNodePropertyListContext badBlankNodePropertyList() throws RecognitionException {
		BadBlankNodePropertyListContext _localctx = new BadBlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_badBlankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__22);
			setState(343);
			predicateObjectList();
			setState(344);
			match(T__0);
			setState(345);
			match(T__23);
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
		enterRule(_localctx, 38, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__24);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__22 - 7)) | (1L << (T__24 - 7)) | (1L << (NumericLiteral - 7)) | (1L << (BooleanLiteral - 7)) | (1L << (BadLiteral - 7)) | (1L << (String - 7)) | (1L << (BlankNode - 7)) | (1L << (IRIREF - 7)) | (1L << (PNAME_NS - 7)) | (1L << (PrefixedName - 7)) | (1L << (BAD_PNAME_LN_STARTS_WITH_DOT - 7)) | (1L << (BAD_PNAME_LN_ENDS_WITH_DOT - 7)) | (1L << (BAD_IRIREF_WITH_SPACE - 7)) | (1L << (BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS - 7)) | (1L << (BAD_IRIREF_WITH_PARENTHESES - 7)))) != 0)) {
				{
				{
				setState(348);
				object();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(T__25);
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
		public TerminalNode BAD_LANGTAG_AS_NUMBER() { return getToken(TurtleParser.BAD_LANGTAG_AS_NUMBER, 0); }
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
		enterRule(_localctx, 40, RULE_rdfLiteral);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(String);
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(357);
					match(LANGTAG);
					}
					break;
				case T__26:
					{
					setState(358);
					match(T__26);
					setState(359);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(String);
				setState(363);
				match(BAD_LANGTAG_AS_NUMBER);
				notifyErrorListeners("Language tag cannot be a numeric value");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(String);
				setState(366);
				match(T__27);
				setState(367);
				iri();
				notifyErrorListeners("Missing '^' Character");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				match(String);
				setState(371);
				match(LANGTAG);
				setState(372);
				match(T__26);
				setState(373);
				iri();
				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				match(String);
				setState(377);
				match(T__26);
				setState(378);
				iri();
				setState(379);
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
		public TerminalNode BAD_PN_LOCAL_STARTS_WITH_PERCENT() { return getToken(TurtleParser.BAD_PN_LOCAL_STARTS_WITH_PERCENT, 0); }
		public TerminalNode BAD_PNAME_LN_STARTS_WITH_DOT() { return getToken(TurtleParser.BAD_PNAME_LN_STARTS_WITH_DOT, 0); }
		public TerminalNode BAD_PNAME_LN_ENDS_WITH_DOT() { return getToken(TurtleParser.BAD_PNAME_LN_ENDS_WITH_DOT, 0); }
		public TerminalNode BAD_IRIREF_WITH_SPACE() { return getToken(TurtleParser.BAD_IRIREF_WITH_SPACE, 0); }
		public TerminalNode BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS() { return getToken(TurtleParser.BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS, 0); }
		public TerminalNode BAD_IRIREF_WITH_PARENTHESES() { return getToken(TurtleParser.BAD_IRIREF_WITH_PARENTHESES, 0); }
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
		enterRule(_localctx, 42, RULE_iri);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(IRIREF);
				}
				break;
			case PrefixedName:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(PrefixedName);
				}
				break;
			case PNAME_NS:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(PNAME_NS);
				setState(387);
				match(BAD_PN_LOCAL_STARTS_WITH_PERCENT);
				notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot contain '%'");
				}
				break;
			case BAD_PNAME_LN_STARTS_WITH_DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(BAD_PNAME_LN_STARTS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of Prefixed Namespace, it cannot start with '.'");
				}
				break;
			case BAD_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				match(BAD_PNAME_LN_ENDS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of Prefixed Namespace, it cannot end with '.'");
				}
				break;
			case BAD_IRIREF_WITH_SPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(BAD_IRIREF_WITH_SPACE);
				notifyErrorListeners("Bas syntax of IRI, IRI cannot contain space or newline");
				}
				break;
			case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
				match(BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS);
				notifyErrorListeners("Bas syntax of IRI, Too many angle brackets in IRI");
				}
				break;
			case BAD_IRIREF_WITH_PARENTHESES:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				match(BAD_IRIREF_WITH_PARENTHESES);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5c\n\5"+
		"\r\5\16\5d\3\5\3\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\6\5u\n\5\r\5\16\5v\3\5\3\5\3\5\6\5|\n\5\r\5\16\5}\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5"+
		"\3\5\3\5\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\5\3\5\5\5\u009c\n\5\3\6\3"+
		"\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c8\n\7\f\7\16\7\u00cb\13\7"+
		"\3\7\3\7\3\7\5\7\u00d0\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00dc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f3\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00fa"+
		"\n\13\5\13\u00fc\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0104\n\f\7\f\u0106"+
		"\n\f\f\f\16\f\u0109\13\f\3\r\3\r\3\r\7\r\u010e\n\r\f\r\16\r\u0111\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0125\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u013e\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u014c\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0153\n"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0160"+
		"\n\25\f\25\16\25\u0163\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u016b"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0181\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0192\n\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\4\2\t"+
		"\t$$\2\u01cc\2\61\3\2\2\2\4<\3\2\2\2\6K\3\2\2\2\b\u009b\3\2\2\2\n\u009d"+
		"\3\2\2\2\f\u00cf\3\2\2\2\16\u00d1\3\2\2\2\20\u00db\3\2\2\2\22\u00f2\3"+
		"\2\2\2\24\u00fb\3\2\2\2\26\u00fd\3\2\2\2\30\u010a\3\2\2\2\32\u0124\3\2"+
		"\2\2\34\u013d\3\2\2\2\36\u013f\3\2\2\2 \u014b\3\2\2\2\"\u0152\3\2\2\2"+
		"$\u0154\3\2\2\2&\u0158\3\2\2\2(\u015d\3\2\2\2*\u0180\3\2\2\2,\u0191\3"+
		"\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\3\3\2\2\2\63\61\3\2\2\2\64=\5\6\4\2\65\66\5\24\13\2\66\67\7\3\2\2\67"+
		"=\3\2\2\289\5\24\13\29:\b\3\1\2:=\3\2\2\2;=\5\b\5\2<\64\3\2\2\2<\65\3"+
		"\2\2\2<8\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>L\5\f\7\2?L\5\16\b\2@L\5\22\n\2"+
		"AL\5\20\t\2BL\5\n\6\2CD\5\22\n\2DE\7\3\2\2EF\b\4\1\2FL\3\2\2\2GH\5\20"+
		"\t\2HI\7\3\2\2IJ\b\4\1\2JL\3\2\2\2K>\3\2\2\2K?\3\2\2\2K@\3\2\2\2KA\3\2"+
		"\2\2KB\3\2\2\2KC\3\2\2\2KG\3\2\2\2L\7\3\2\2\2MN\5,\27\2NO\7\4\2\2OP\5"+
		",\27\2PQ\7\3\2\2QR\b\5\1\2R\u009c\3\2\2\2ST\5,\27\2TU\7\5\2\2UV\5,\27"+
		"\2VW\7\3\2\2WX\b\5\1\2X\u009c\3\2\2\2YZ\5,\27\2Z[\7\6\2\2[\\\5,\27\2\\"+
		"]\7\3\2\2]^\b\5\1\2^\u009c\3\2\2\2_`\5,\27\2`a\7\3\2\2ac\3\2\2\2b_\3\2"+
		"\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3\2\2\2fg\5,\27\2gh\7\3\2\2hj\3\2"+
		"\2\2if\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\24\13\2no\7"+
		"\3\2\2op\b\5\1\2p\u009c\3\2\2\2qr\5,\27\2rs\7\3\2\2su\3\2\2\2tq\3\2\2"+
		"\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xy\5,\27\2yz\7\3\2\2z|\3\2\2"+
		"\2{x\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\5\24"+
		"\13\2\u0080\u0081\b\5\1\2\u0081\u009c\3\2\2\2\u0082\u0083\7\7\2\2\u0083"+
		"\u0084\5,\27\2\u0084\u0085\7\3\2\2\u0085\u0086\b\5\1\2\u0086\u009c\3\2"+
		"\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5,\27\2\u0089\u008a\7\3\2\2\u008a"+
		"\u008b\b\5\1\2\u008b\u009c\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\7\n\2\2\u0093\u0095\t\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\3"+
		"\2\2\u009a\u009c\b\5\1\2\u009bM\3\2\2\2\u009bS\3\2\2\2\u009bY\3\2\2\2"+
		"\u009bb\3\2\2\2\u009bt\3\2\2\2\u009b\u0082\3\2\2\2\u009b\u0087\3\2\2\2"+
		"\u009b\u008f\3\2\2\2\u009c\t\3\2\2\2\u009d\u00a1\7\13\2\2\u009e\u00a0"+
		"\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\3"+
		"\2\2\u00a5\u00a6\b\6\1\2\u00a6\13\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9"+
		"\7$\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\7(\2\2\u00ac"+
		"\u00ad\7\3\2\2\u00ad\u00d0\b\7\1\2\u00ae\u00af\7\f\2\2\u00af\u00b0\7\3"+
		"\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b4"+
		"\7\3\2\2\u00b4\u00d0\b\7\1\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\7\r\2\2\u00b7"+
		"\u00b8\7(\2\2\u00b8\u00d0\7\3\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\7)\2"+
		"\2\u00bb\u00bc\7(\2\2\u00bc\u00d0\7\3\2\2\u00bd\u00be\7)\2\2\u00be\u00bf"+
		"\7(\2\2\u00bf\u00c0\7\3\2\2\u00c0\u00d0\b\7\1\2\u00c1\u00c2\7\f\2\2\u00c2"+
		"\u00c3\7(\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00d0\b\7\1\2\u00c5\u00c9\7\f"+
		"\2\2\u00c6\u00c8\7$\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\7(\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00d0\b\7\1\2\u00cf"+
		"\u00a7\3\2\2\2\u00cf\u00ae\3\2\2\2\u00cf\u00b5\3\2\2\2\u00cf\u00b9\3\2"+
		"\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00c5\3\2\2\2\u00d0"+
		"\r\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d4\7\3\2\2"+
		"\u00d4\17\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\u00dc\7(\2\2\u00d7\u00d8"+
		"\7\20\2\2\u00d8\u00d9\7(\2\2\u00d9\u00da\7\3\2\2\u00da\u00dc\b\t\1\2\u00db"+
		"\u00d5\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\21\3\2\2\2\u00dd\u00de\7\21\2"+
		"\2\u00de\u00df\7$\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2"+
		"\7(\2\2\u00e2\u00f3\b\n\1\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\7\3\2\2\u00e5"+
		"\u00e6\7$\2\2\u00e6\u00e7\7\r\2\2\u00e7\u00e8\7(\2\2\u00e8\u00f3\b\n\1"+
		"\2\u00e9\u00ea\7\21\2\2\u00ea\u00eb\7)\2\2\u00eb\u00f3\7(\2\2\u00ec\u00ed"+
		"\7)\2\2\u00ed\u00ee\7(\2\2\u00ee\u00f3\b\n\1\2\u00ef\u00f0\7\21\2\2\u00f0"+
		"\u00f1\7(\2\2\u00f1\u00f3\b\n\1\2\u00f2\u00dd\3\2\2\2\u00f2\u00e3\3\2"+
		"\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3"+
		"\23\3\2\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6\5\26\f\2\u00f6\u00fc\3\2"+
		"\2\2\u00f7\u00f9\5$\23\2\u00f8\u00fa\5\26\f\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb\u00f7\3\2"+
		"\2\2\u00fc\25\3\2\2\2\u00fd\u00fe\5\32\16\2\u00fe\u0107\5\30\r\2\u00ff"+
		"\u0103\7\22\2\2\u0100\u0101\5\32\16\2\u0101\u0102\5\30\r\2\u0102\u0104"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00ff\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\27\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010f\5 \21\2\u010b\u010c"+
		"\7\23\2\2\u010c\u010e\5 \21\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\31\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0125\5\36\20\2\u0113\u0114\7\24\2\2\u0114\u0115\5\36\20"+
		"\2\u0115\u0116\7\25\2\2\u0116\u0117\b\16\1\2\u0117\u0125\3\2\2\2\u0118"+
		"\u0125\7\t\2\2\u0119\u011a\7\26\2\2\u011a\u0125\b\16\1\2\u011b\u011c\7"+
		" \2\2\u011c\u0125\b\16\1\2\u011d\u011e\7\37\2\2\u011e\u0125\b\16\1\2\u011f"+
		"\u0120\5\"\22\2\u0120\u0121\b\16\1\2\u0121\u0125\3\2\2\2\u0122\u0123\7"+
		"#\2\2\u0123\u0125\b\16\1\2\u0124\u0112\3\2\2\2\u0124\u0113\3\2\2\2\u0124"+
		"\u0118\3\2\2\2\u0124\u0119\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011d\3\2"+
		"\2\2\u0124\u011f\3\2\2\2\u0124\u0122\3\2\2\2\u0125\33\3\2\2\2\u0126\u013e"+
		"\5,\27\2\u0127\u013e\7#\2\2\u0128\u0129\7#\2\2\u0129\u012a\7\3\2\2\u012a"+
		"\u013e\b\17\1\2\u012b\u012c\7\t\2\2\u012c\u013e\b\17\1\2\u012d\u012e\7"+
		" \2\2\u012e\u013e\b\17\1\2\u012f\u0130\7\37\2\2\u0130\u013e\b\17\1\2\u0131"+
		"\u013e\5(\25\2\u0132\u0133\7\27\2\2\u0133\u0134\5\24\13\2\u0134\u0135"+
		"\7\3\2\2\u0135\u0136\7\30\2\2\u0136\u0137\b\17\1\2\u0137\u013e\3\2\2\2"+
		"\u0138\u0139\7\27\2\2\u0139\u013a\5\24\13\2\u013a\u013b\7\30\2\2\u013b"+
		"\u013c\b\17\1\2\u013c\u013e\3\2\2\2\u013d\u0126\3\2\2\2\u013d\u0127\3"+
		"\2\2\2\u013d\u0128\3\2\2\2\u013d\u012b\3\2\2\2\u013d\u012d\3\2\2\2\u013d"+
		"\u012f\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u0138\3\2"+
		"\2\2\u013e\35\3\2\2\2\u013f\u0140\5,\27\2\u0140\37\3\2\2\2\u0141\u014c"+
		"\5,\27\2\u0142\u014c\7#\2\2\u0143\u014c\5(\25\2\u0144\u014c\5$\23\2\u0145"+
		"\u0146\5&\24\2\u0146\u0147\b\21\1\2\u0147\u014c\3\2\2\2\u0148\u014c\5"+
		"\"\22\2\u0149\u014a\7\t\2\2\u014a\u014c\b\21\1\2\u014b\u0141\3\2\2\2\u014b"+
		"\u0142\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2"+
		"\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014c!\3\2\2\2\u014d\u0153"+
		"\5*\26\2\u014e\u0153\7\37\2\2\u014f\u0153\7 \2\2\u0150\u0151\7!\2\2\u0151"+
		"\u0153\b\22\1\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0153#\3\2\2\2\u0154\u0155\7\31\2\2\u0155\u0156"+
		"\5\26\f\2\u0156\u0157\7\32\2\2\u0157%\3\2\2\2\u0158\u0159\7\31\2\2\u0159"+
		"\u015a\5\26\f\2\u015a\u015b\7\3\2\2\u015b\u015c\7\32\2\2\u015c\'\3\2\2"+
		"\2\u015d\u0161\7\33\2\2\u015e\u0160\5 \21\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\34\2\2\u0165)\3\2\2\2\u0166\u016a"+
		"\7\"\2\2\u0167\u016b\7/\2\2\u0168\u0169\7\35\2\2\u0169\u016b\5,\27\2\u016a"+
		"\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0181\3\2"+
		"\2\2\u016c\u016d\7\"\2\2\u016d\u016e\7\60\2\2\u016e\u0181\b\26\1\2\u016f"+
		"\u0170\7\"\2\2\u0170\u0171\7\36\2\2\u0171\u0172\5,\27\2\u0172\u0173\b"+
		"\26\1\2\u0173\u0181\3\2\2\2\u0174\u0175\7\"\2\2\u0175\u0176\7/\2\2\u0176"+
		"\u0177\7\35\2\2\u0177\u0178\5,\27\2\u0178\u0179\b\26\1\2\u0179\u0181\3"+
		"\2\2\2\u017a\u017b\7\"\2\2\u017b\u017c\7\35\2\2\u017c\u017d\5,\27\2\u017d"+
		"\u017e\7/\2\2\u017e\u017f\b\26\1\2\u017f\u0181\3\2\2\2\u0180\u0166\3\2"+
		"\2\2\u0180\u016c\3\2\2\2\u0180\u016f\3\2\2\2\u0180\u0174\3\2\2\2\u0180"+
		"\u017a\3\2\2\2\u0181+\3\2\2\2\u0182\u0192\7(\2\2\u0183\u0192\7*\2\2\u0184"+
		"\u0185\7)\2\2\u0185\u0186\7A\2\2\u0186\u0192\b\27\1\2\u0187\u0188\7,\2"+
		"\2\u0188\u0192\b\27\1\2\u0189\u018a\7-\2\2\u018a\u0192\b\27\1\2\u018b"+
		"\u018c\7F\2\2\u018c\u0192\b\27\1\2\u018d\u018e\7G\2\2\u018e\u0192\b\27"+
		"\1\2\u018f\u0190\7H\2\2\u0190\u0192\b\27\1\2\u0191\u0182\3\2\2\2\u0191"+
		"\u0183\3\2\2\2\u0191\u0184\3\2\2\2\u0191\u0187\3\2\2\2\u0191\u0189\3\2"+
		"\2\2\u0191\u018b\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"-\3\2\2\2\36\61<Kdkv}\u008f\u0096\u009b\u00a1\u00c9\u00cf\u00db\u00f2"+
		"\u00f9\u00fb\u0103\u0107\u010f\u0124\u013d\u014b\u0152\u0161\u016a\u0180"+
		"\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
