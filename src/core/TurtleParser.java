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
		T__24=25, T__25=26, KW_BASE=27, KW_PREFIX=28, KW_TRUE=29, KW_FALSE=30, 
		PASS=31, COMMENT=32, BASE=33, PREFIX=34, CODE=35, RDF_TYPE=36, IRIREF=37, 
		WRONGIRIREF=38, PNAME_NS=39, PNAME_LN=40, WRONG_PNAME_LN_STARTS_WITH_DOT=41, 
		WRONG_PNAME_LN_ENDS_WITH_DOT=42, REGEXP=43, REGEXP_FLAGS=44, BLANK_NODE_LABEL=45, 
		LANGTAG=46, INTEGER=47, DECIMAL=48, DOUBLE=49, CHAR=50, STRING_LITERAL1=51, 
		STRING_LITERAL2=52, STRING_LITERAL_LONG1=53, STRING_LITERAL_LONG2=54, 
		WRONG_STRING_LITERAL_LONG2=55, WRONG_STRING_LITERAL2_MIX_QUOTES=56, WRONG_STRING_LITERAL2_WITH_ESCAPE=57, 
		WRONG_STRING_LITERAL1=58, WRONG_STRING_LITERAL2=59, PN_PREFIX=60;
	public static final int
		RULE_start = 0, RULE_directive = 1, RULE_baseDecl = 2, RULE_unkonwnDecl = 3, 
		RULE_baseSparql = 4, RULE_base = 5, RULE_prefixDecl = 6, RULE_prefix = 7, 
		RULE_prefixSparql = 8, RULE_errors = 9, RULE_triples = 10, RULE_graphLabel = 11, 
		RULE_subject = 12, RULE_blank = 13, RULE_blankNodePropertyList = 14, RULE_predicateObjectList = 15, 
		RULE_wrongPredicateObjectList = 16, RULE_objectList = 17, RULE_object = 18, 
		RULE_collection = 19, RULE_literal = 20, RULE_predicate = 21, RULE_rdfType = 22, 
		RULE_datatype = 23, RULE_numericLiteral = 24, RULE_rdfLiteral = 25, RULE_booleanLiteral = 26, 
		RULE_string = 27, RULE_iri = 28, RULE_prefixedName = 29, RULE_blankNode = 30;
	public static final String[] ruleNames = {
		"start", "directive", "baseDecl", "unkonwnDecl", "baseSparql", "base", 
		"prefixDecl", "prefix", "prefixSparql", "errors", "triples", "graphLabel", 
		"subject", "blank", "blankNodePropertyList", "predicateObjectList", "wrongPredicateObjectList", 
		"objectList", "object", "collection", "literal", "predicate", "rdfType", 
		"datatype", "numericLiteral", "rdfLiteral", "booleanLiteral", "string", 
		"iri", "prefixedName", "blankNode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@keywords'", "'.'", "'@BASE'", "':'", "'='", "'{'", "'}'", "'@forAll'", 
		"'@forSome'", "';'", "'['", "']'", "'<='", "'=>'", "'is'", "'of'", "','", 
		"'('", "')'", "'A'", "'0x'", "'0X'", "'^^'", "'^'", "'@'", "'\"'", null, 
		null, "'true'", "'false'", null, null, "'@base'", "'@prefix'", null, "'a'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "KW_BASE", "KW_PREFIX", "KW_TRUE", "KW_FALSE", "PASS", 
		"COMMENT", "BASE", "PREFIX", "CODE", "RDF_TYPE", "IRIREF", "WRONGIRIREF", 
		"PNAME_NS", "PNAME_LN", "WRONG_PNAME_LN_STARTS_WITH_DOT", "WRONG_PNAME_LN_ENDS_WITH_DOT", 
		"REGEXP", "REGEXP_FLAGS", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", 
		"DOUBLE", "CHAR", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "WRONG_STRING_LITERAL_LONG2", "WRONG_STRING_LITERAL2_MIX_QUOTES", 
		"WRONG_STRING_LITERAL2_WITH_ESCAPE", "WRONG_STRING_LITERAL1", "WRONG_STRING_LITERAL2", 
		"PN_PREFIX"
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
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TriplesContext> triples() {
			return getRuleContexts(TriplesContext.class);
		}
		public TriplesContext triples(int i) {
			return getRuleContext(TriplesContext.class,i);
		}
		public List<ErrorsContext> errors() {
			return getRuleContexts(ErrorsContext.class);
		}
		public ErrorsContext errors(int i) {
			return getRuleContext(ErrorsContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << KW_BASE) | (1L << KW_PREFIX) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				{
				setState(62);
				directive();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					triples();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << WRONG_PNAME_LN_STARTS_WITH_DOT) | (1L << WRONG_PNAME_LN_ENDS_WITH_DOT) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL2_MIX_QUOTES) | (1L << WRONG_STRING_LITERAL1) | (1L << WRONG_STRING_LITERAL2))) != 0)) {
				{
				{
				setState(74);
				errors();
				}
				}
				setState(79);
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

	public static class DirectiveContext extends ParserRuleContext {
		public BaseDeclContext baseDecl() {
			return getRuleContext(BaseDeclContext.class,0);
		}
		public PrefixDeclContext prefixDecl() {
			return getRuleContext(PrefixDeclContext.class,0);
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
		enterRule(_localctx, 2, RULE_directive);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case KW_BASE:
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				baseDecl();
				}
				break;
			case KW_PREFIX:
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				prefixDecl();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				unkonwnDecl();
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

	public static class BaseDeclContext extends ParserRuleContext {
		public BaseSparqlContext baseSparql() {
			return getRuleContext(BaseSparqlContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public BaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBaseDecl(this);
		}
	}

	public final BaseDeclContext baseDecl() throws RecognitionException {
		BaseDeclContext _localctx = new BaseDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_baseDecl);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case KW_BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				baseSparql();
				}
				break;
			case BASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				base();
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
		enterRule(_localctx, 6, RULE_unkonwnDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(90);
				match(CHAR);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__1);
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

	public static class BaseSparqlContext extends ParserRuleContext {
		public TerminalNode KW_BASE() { return getToken(TurtleParser.KW_BASE, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public BaseSparqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSparql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBaseSparql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBaseSparql(this);
		}
	}

	public final BaseSparqlContext baseSparql() throws RecognitionException {
		BaseSparqlContext _localctx = new BaseSparqlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_baseSparql);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(KW_BASE);
				setState(100);
				match(IRIREF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__2);
				setState(102);
				match(IRIREF);
				setState(103);
				match(T__1);
				notifyErrorListeners("Uncorrect form of Base directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__2);
				setState(106);
				match(IRIREF);
				notifyErrorListeners("Uncorrect form of Base  directive");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(KW_BASE);
				setState(109);
				match(IRIREF);
				setState(110);
				match(T__1);
				notifyErrorListeners("SPARQL BASE directive should not followed by '.'");
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
		public TerminalNode BASE() { return getToken(TurtleParser.BASE, 0); }
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
		enterRule(_localctx, 10, RULE_base);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(BASE);
				setState(115);
				match(IRIREF);
				setState(116);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(BASE);
				setState(118);
				match(IRIREF);
				notifyErrorListeners("Missing '.' at the end of Base directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(BASE);
				notifyErrorListeners("Missing IRI after '@base'");
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

	public static class PrefixDeclContext extends ParserRuleContext {
		public PrefixSparqlContext prefixSparql() {
			return getRuleContext(PrefixSparqlContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPrefixDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPrefixDecl(this);
		}
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefixDecl);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				prefixSparql();
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				prefix();
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(TurtleParser.PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PN_PREFIX() { return getToken(TurtleParser.PN_PREFIX, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prefix);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(PREFIX);
				setState(129);
				match(PNAME_NS);
				setState(130);
				match(IRIREF);
				setState(131);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(PREFIX);
				setState(133);
				match(T__1);
				setState(134);
				match(PNAME_NS);
				setState(135);
				match(IRIREF);
				setState(136);
				match(T__1);
				notifyErrorListeners("Namespace cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(PREFIX);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PN_PREFIX) {
					{
					setState(139);
					match(PN_PREFIX);
					}
				}

				setState(142);
				match(T__1);
				setState(143);
				match(T__3);
				setState(144);
				match(IRIREF);
				setState(145);
				match(T__1);
				notifyErrorListeners("Namespace cannot end with '.' ");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(PREFIX);
				setState(148);
				match(PNAME_NS);
				setState(149);
				match(IRIREF);
				notifyErrorListeners("Missing '.' at the end of Prefix directive");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(PREFIX);
				setState(152);
				match(PNAME_NS);
				setState(153);
				match(T__1);
				notifyErrorListeners("Missing IRI in Prefix directive");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				match(PREFIX);
				setState(156);
				match(PNAME_NS);
				notifyErrorListeners("Missing IRI  and dot at Prefix directive");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(PREFIX);
				setState(159);
				match(IRIREF);
				setState(160);
				match(T__1);
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

	public static class PrefixSparqlContext extends ParserRuleContext {
		public Token PNAME_NS;
		public Token IRIREF;
		public TerminalNode KW_PREFIX() { return getToken(TurtleParser.KW_PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PN_PREFIX() { return getToken(TurtleParser.PN_PREFIX, 0); }
		public PrefixSparqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixSparql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPrefixSparql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPrefixSparql(this);
		}
	}

	public final PrefixSparqlContext prefixSparql() throws RecognitionException {
		PrefixSparqlContext _localctx = new PrefixSparqlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prefixSparql);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(KW_PREFIX);
				setState(165);
				((PrefixSparqlContext)_localctx).PNAME_NS = match(PNAME_NS);
				setState(166);
				((PrefixSparqlContext)_localctx).IRIREF = match(IRIREF);
				System.out.println("\nNS "+(((PrefixSparqlContext)_localctx).PNAME_NS!=null?((PrefixSparqlContext)_localctx).PNAME_NS.getText():null)+"IRI "+(((PrefixSparqlContext)_localctx).IRIREF!=null?((PrefixSparqlContext)_localctx).IRIREF.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(KW_PREFIX);
				setState(169);
				match(T__1);
				setState(170);
				match(PNAME_NS);
				setState(171);
				match(IRIREF);
				notifyErrorListeners("Namespace cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(KW_PREFIX);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PN_PREFIX) {
					{
					setState(174);
					match(PN_PREFIX);
					}
				}

				setState(177);
				match(T__1);
				setState(178);
				match(T__3);
				setState(179);
				match(IRIREF);
				notifyErrorListeners("Namespace cannot end with '.' ");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(KW_PREFIX);
				setState(182);
				match(PNAME_NS);
				setState(183);
				match(IRIREF);
				setState(184);
				match(T__1);
				notifyErrorListeners(" extraneous input'.' at the end of Prefix directive");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(KW_PREFIX);
				setState(187);
				match(PNAME_NS);
				setState(188);
				match(T__1);
				notifyErrorListeners("Missing IRI in Prefix directive");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(KW_PREFIX);
				setState(191);
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

	public static class ErrorsContext extends ParserRuleContext {
		public List<IriContext> iri() {
			return getRuleContexts(IriContext.class);
		}
		public IriContext iri(int i) {
			return getRuleContext(IriContext.class,i);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public GraphLabelContext graphLabel() {
			return getRuleContext(GraphLabelContext.class,0);
		}
		public WrongPredicateObjectListContext wrongPredicateObjectList() {
			return getRuleContext(WrongPredicateObjectListContext.class,0);
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
		enterRule(_localctx, 18, RULE_errors);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				iri();
				setState(196);
				match(T__4);
				setState(197);
				iri();
				setState(198);
				match(T__1);
				notifyErrorListeners("'=' sign cannot be used in Turtle");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__5);
				setState(202);
				subject();
				setState(203);
				predicateObjectList();
				setState(204);
				match(T__6);
				notifyErrorListeners("{ } pattern is not in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__5);
				setState(208);
				triples();
				setState(209);
				match(T__6);
				notifyErrorListeners("{ } pattern is not in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(212);
				subject();
				setState(213);
				match(T__1);
				}
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				subject();
				setState(218);
				predicate();
				setState(219);
				object();
				setState(220);
				graphLabel();
				setState(221);
				match(T__1);
				notifyErrorListeners("Turtle is not NQuads");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(T__7);
				setState(225);
				iri();
				setState(226);
				match(T__1);
				notifyErrorListeners(" '@forAll' cannot be used in Turtle ");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(T__8);
				setState(230);
				iri();
				setState(231);
				match(T__1);
				notifyErrorListeners(" '@forSome' cannot be used in Turtle ");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				subject();
				setState(235);
				wrongPredicateObjectList();
				setState(236);
				match(T__1);
				notifyErrorListeners("N3 Pattern 'is...of' cannot be used in Turtle");
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
		enterRule(_localctx, 20, RULE_triples);
		int _la;
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				subject();
				setState(242);
				predicateObjectList();
				setState(243);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				subject();
				setState(246);
				predicateObjectList();
				setState(248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(247);
						match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					match(T__1);
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				notifyErrorListeners("Too many DOT ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				subject();
				setState(260);
				predicateObjectList();
				notifyErrorListeners("Missing '.' at the end of the triple");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				subject();
				setState(264);
				predicateObjectList();
				{
				setState(265);
				match(T__9);
				}
				notifyErrorListeners("Missing '.' at the end of the triple");
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

	public static class GraphLabelContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode BLANK_NODE_LABEL() { return getToken(TurtleParser.BLANK_NODE_LABEL, 0); }
		public GraphLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterGraphLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitGraphLabel(this);
		}
	}

	public final GraphLabelContext graphLabel() throws RecognitionException {
		GraphLabelContext _localctx = new GraphLabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_graphLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==IRIREF || _la==BLANK_NODE_LABEL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SubjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode RDF_TYPE() { return getToken(TurtleParser.RDF_TYPE, 0); }
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
		enterRule(_localctx, 24, RULE_subject);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case WRONGIRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				iri();
				}
				break;
			case T__10:
			case T__17:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				blank();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				booleanLiteral();
				notifyErrorListeners("Subject cannot be a boolean value");
				}
				break;
			case T__25:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL2_MIX_QUOTES:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				rdfLiteral();
				notifyErrorListeners("Subject cannot be a string");
				}
				break;
			case T__20:
			case T__21:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				numericLiteral();
				notifyErrorListeners("Subject cannot be a number");
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(RDF_TYPE);
				notifyErrorListeners("'a' cannot be used as a subject");
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

	public static class BlankContext extends ParserRuleContext {
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBlank(this);
		}
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blank);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				blankNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				blankNodePropertyList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				collection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				blankNode();
				setState(291);
				match(T__1);
				notifyErrorListeners("Blank Node cannot be followed by '.'");
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

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public List<PredicateObjectListContext> predicateObjectList() {
			return getRuleContexts(PredicateObjectListContext.class);
		}
		public PredicateObjectListContext predicateObjectList(int i) {
			return getRuleContext(PredicateObjectListContext.class,i);
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
		enterRule(_localctx, 28, RULE_blankNodePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__10);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << WRONG_PNAME_LN_STARTS_WITH_DOT) | (1L << WRONG_PNAME_LN_ENDS_WITH_DOT) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL2_MIX_QUOTES) | (1L << WRONG_STRING_LITERAL1) | (1L << WRONG_STRING_LITERAL2))) != 0)) {
				{
				{
				setState(297);
				predicateObjectList();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(T__11);
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
		enterRule(_localctx, 30, RULE_predicateObjectList);
		try {
			int _alt;
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				predicate();
				setState(306);
				objectList();
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(T__9);
						setState(308);
						predicate();
						setState(309);
						objectList();
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				predicate();
				notifyErrorListeners("Object is missing in the triple");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(T__12);
				setState(320);
				objectList();
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						match(T__9);
						setState(322);
						predicate();
						setState(323);
						objectList();
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(330);
					match(T__9);
					}
					break;
				}
				notifyErrorListeners("'<=' is not in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(T__13);
				setState(336);
				objectList();
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(T__9);
						setState(338);
						predicate();
						setState(339);
						objectList();
						}
						} 
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(346);
					match(T__9);
					}
					break;
				}
				notifyErrorListeners("'=>' is not in Turtle");
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

	public static class WrongPredicateObjectListContext extends ParserRuleContext {
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
		public WrongPredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrongPredicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterWrongPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitWrongPredicateObjectList(this);
		}
	}

	public final WrongPredicateObjectListContext wrongPredicateObjectList() throws RecognitionException {
		WrongPredicateObjectListContext _localctx = new WrongPredicateObjectListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wrongPredicateObjectList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__14);
			setState(354);
			predicate();
			setState(355);
			match(T__15);
			setState(356);
			objectList();
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357);
					match(T__9);
					setState(358);
					predicate();
					setState(359);
					objectList();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(366);
				match(T__9);
				}
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
		enterRule(_localctx, 34, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			object();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(370);
				match(T__16);
				setState(371);
				object();
				}
				}
				setState(376);
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

	public static class ObjectContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public TerminalNode RDF_TYPE() { return getToken(TurtleParser.RDF_TYPE, 0); }
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
		enterRule(_localctx, 36, RULE_object);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__25:
			case KW_TRUE:
			case KW_FALSE:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL2_MIX_QUOTES:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				literal();
				}
				break;
			case IRIREF:
			case WRONGIRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				iri();
				}
				break;
			case T__10:
			case T__17:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				blank();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(RDF_TYPE);
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
			setState(384);
			match(T__17);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << WRONG_PNAME_LN_STARTS_WITH_DOT) | (1L << WRONG_PNAME_LN_ENDS_WITH_DOT) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL2_MIX_QUOTES) | (1L << WRONG_STRING_LITERAL1) | (1L << WRONG_STRING_LITERAL2))) != 0)) {
				{
				{
				setState(385);
				object();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(T__18);
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
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL2_MIX_QUOTES:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				rdfLiteral();
				}
				break;
			case T__20:
			case T__21:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				numericLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				booleanLiteral();
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

	public static class PredicateContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfTypeContext rdfType() {
			return getRuleContext(RdfTypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
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
		enterRule(_localctx, 42, RULE_predicate);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case WRONGIRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				iri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				rdfType();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(T__19);
				notifyErrorListeners("'A' cannot be used as predicate, it should be repalce with 'a'");
				}
				break;
			case T__20:
			case T__21:
			case T__25:
			case KW_TRUE:
			case KW_FALSE:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL2_MIX_QUOTES:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				literal();
				notifyErrorListeners("Predicate cannot be a literal");
				}
				break;
			case T__10:
			case T__17:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				blank();
				notifyErrorListeners("Predicate cannot be a blank node");
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

	public static class RdfTypeContext extends ParserRuleContext {
		public TerminalNode RDF_TYPE() { return getToken(TurtleParser.RDF_TYPE, 0); }
		public RdfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterRdfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitRdfType(this);
		}
	}

	public final RdfTypeContext rdfType() throws RecognitionException {
		RdfTypeContext _localctx = new RdfTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rdfType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(RDF_TYPE);
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

	public static class DatatypeContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurtleParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(TurtleParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(TurtleParser.DOUBLE, 0); }
		public List<TerminalNode> CHAR() { return getTokens(TurtleParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(TurtleParser.CHAR, i);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numericLiteral);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(DECIMAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(418);
				match(INTEGER);
				notifyErrorListeners("Bad format of a numberic literal");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				match(INTEGER);
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(421);
					match(CHAR);
					}
					}
					setState(424); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR );
				notifyErrorListeners("Numeric literal cannot have string characters");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				match(INTEGER);
				setState(428);
				match(T__1);
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(429);
					match(CHAR);
					}
					}
					setState(432); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR );
				notifyErrorListeners("Uncorrect form of a literal");
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

	public static class RdfLiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(TurtleParser.LANGTAG, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(TurtleParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(TurtleParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(TurtleParser.DOUBLE, 0); }
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
		enterRule(_localctx, 50, RULE_rdfLiteral);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				string();
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(438);
					match(LANGTAG);
					}
					break;
				case T__22:
					{
					setState(439);
					match(T__22);
					setState(440);
					datatype();
					}
					break;
				case EOF:
				case T__1:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__25:
				case KW_TRUE:
				case KW_FALSE:
				case RDF_TYPE:
				case IRIREF:
				case WRONGIRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case WRONG_PNAME_LN_STARTS_WITH_DOT:
				case WRONG_PNAME_LN_ENDS_WITH_DOT:
				case BLANK_NODE_LABEL:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
				case WRONG_STRING_LITERAL_LONG2:
				case WRONG_STRING_LITERAL2_MIX_QUOTES:
				case WRONG_STRING_LITERAL1:
				case WRONG_STRING_LITERAL2:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				string();
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(444);
					match(LANGTAG);
					}
					break;
				case T__23:
					{
					setState(445);
					match(T__23);
					setState(446);
					datatype();
					}
					break;
				case EOF:
				case T__1:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__25:
				case KW_TRUE:
				case KW_FALSE:
				case RDF_TYPE:
				case IRIREF:
				case WRONGIRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case WRONG_PNAME_LN_STARTS_WITH_DOT:
				case WRONG_PNAME_LN_ENDS_WITH_DOT:
				case BLANK_NODE_LABEL:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
				case WRONG_STRING_LITERAL_LONG2:
				case WRONG_STRING_LITERAL2_MIX_QUOTES:
				case WRONG_STRING_LITERAL1:
				case WRONG_STRING_LITERAL2:
					break;
				default:
					break;
				}
				notifyErrorListeners("Missing '^' Character");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				string();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGTAG) {
					{
					setState(452);
					match(LANGTAG);
					setState(453);
					match(T__22);
					setState(454);
					datatype();
					}
				}

				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				string();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(460);
					match(T__22);
					setState(461);
					datatype();
					setState(462);
					match(LANGTAG);
					}
				}

				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				string();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(469);
					match(T__24);
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(470);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
				}

				notifyErrorListeners("Language tag cannot be a numeric value");
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(TurtleParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(TurtleParser.KW_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL1() { return getToken(TurtleParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(TurtleParser.STRING_LITERAL2, 0); }
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(TurtleParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(TurtleParser.STRING_LITERAL_LONG2, 0); }
		public TerminalNode WRONG_STRING_LITERAL_LONG2() { return getToken(TurtleParser.WRONG_STRING_LITERAL_LONG2, 0); }
		public TerminalNode WRONG_STRING_LITERAL2_MIX_QUOTES() { return getToken(TurtleParser.WRONG_STRING_LITERAL2_MIX_QUOTES, 0); }
		public TerminalNode WRONG_STRING_LITERAL1() { return getToken(TurtleParser.WRONG_STRING_LITERAL1, 0); }
		public TerminalNode WRONG_STRING_LITERAL2() { return getToken(TurtleParser.WRONG_STRING_LITERAL2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(STRING_LITERAL1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(STRING_LITERAL2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(STRING_LITERAL_LONG1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(STRING_LITERAL_LONG2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(STRING_LITERAL_LONG2);
				setState(486);
				match(T__25);
				notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
				match(T__25);
				setState(489);
				match(STRING_LITERAL_LONG2);
				notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(491);
				match(WRONG_STRING_LITERAL_LONG2);
				notifyErrorListeners("Missing qoutes of long literal");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(493);
				match(WRONG_STRING_LITERAL2_MIX_QUOTES);
				notifyErrorListeners("Literal cannot be used with a mix of single and double quotes, either one of them can be used");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				_la = _input.LA(1);
				if ( !(_la==WRONG_STRING_LITERAL1 || _la==WRONG_STRING_LITERAL2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				notifyErrorListeners("Uncorrect quotes form of a literal");
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
		public TerminalNode WRONGIRIREF() { return getToken(TurtleParser.WRONGIRIREF, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_iri);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRONGIRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(WRONGIRIREF);
				notifyErrorListeners("Uncorrect form of URI, URI cannot contain newline or space");
				}
				break;
			case IRIREF:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				prefixedName();
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

	public static class PrefixedNameContext extends ParserRuleContext {
		public TerminalNode WRONG_PNAME_LN_STARTS_WITH_DOT() { return getToken(TurtleParser.WRONG_PNAME_LN_STARTS_WITH_DOT, 0); }
		public TerminalNode WRONG_PNAME_LN_ENDS_WITH_DOT() { return getToken(TurtleParser.WRONG_PNAME_LN_ENDS_WITH_DOT, 0); }
		public TerminalNode PNAME_LN() { return getToken(TurtleParser.PNAME_LN, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPrefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPrefixedName(this);
		}
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_prefixedName);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(WRONG_PNAME_LN_STARTS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of prefixed name, it cannot start with '.'");
				}
				break;
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(WRONG_PNAME_LN_ENDS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of prefixed name, it cannot end with '.'");
				}
				break;
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(PNAME_LN);
				}
				break;
			case PNAME_NS:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				match(PNAME_NS);
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

	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BLANK_NODE_LABEL() { return getToken(TurtleParser.BLANK_NODE_LABEL, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBlankNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBlankNode(this);
		}
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_blankNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(BLANK_NODE_LABEL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0206\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2"+
		"\16\2Q\13\2\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\5\4Z\n\4\3\5\3\5\7\5^\n\5\f\5"+
		"\16\5a\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6s\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\5\b\u0081"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00c4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00f2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6"+
		"\f\u00fb\n\f\r\f\16\f\u00fc\3\f\6\f\u0100\n\f\r\f\16\f\u0101\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010f\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0120\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0129\n\17\3\20\3\20\7\20\u012d\n"+
		"\20\f\20\16\20\u0130\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u013a\n\21\f\21\16\21\u013d\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0148\n\21\f\21\16\21\u014b\13\21\3\21\5\21\u014e\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0158\n\21\f\21\16\21\u015b"+
		"\13\21\3\21\5\21\u015e\n\21\3\21\3\21\5\21\u0162\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u016c\n\22\f\22\16\22\u016f\13\22\3\22\5"+
		"\22\u0172\n\22\3\23\3\23\3\23\7\23\u0177\n\23\f\23\16\23\u017a\13\23\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0181\n\24\3\25\3\25\7\25\u0185\n\25\f\25"+
		"\16\25\u0188\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u018f\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019b\n\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u01a9\n\32\r\32\16"+
		"\32\u01aa\3\32\3\32\3\32\3\32\6\32\u01b1\n\32\r\32\16\32\u01b2\3\32\5"+
		"\32\u01b6\n\32\3\33\3\33\3\33\3\33\5\33\u01bc\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01c2\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ca\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u01d3\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01da\n\33\5\33\u01dc\n\33\3\33\3\33\5\33\u01e0\n\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01f4\n\35\3\36\3\36\3\36\3\36\5\36\u01fa\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0202\n\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\4\2\'\'//\3\2\27\30\3"+
		"\2\61\63\3\2\37 \3\2<=\2\u024a\2C\3\2\2\2\4U\3\2\2\2\6Y\3\2\2\2\b[\3\2"+
		"\2\2\nr\3\2\2\2\f|\3\2\2\2\16\u0080\3\2\2\2\20\u00a4\3\2\2\2\22\u00c3"+
		"\3\2\2\2\24\u00f1\3\2\2\2\26\u010e\3\2\2\2\30\u0110\3\2\2\2\32\u011f\3"+
		"\2\2\2\34\u0128\3\2\2\2\36\u012a\3\2\2\2 \u0161\3\2\2\2\"\u0163\3\2\2"+
		"\2$\u0173\3\2\2\2&\u0180\3\2\2\2(\u0182\3\2\2\2*\u018e\3\2\2\2,\u019a"+
		"\3\2\2\2.\u019c\3\2\2\2\60\u019e\3\2\2\2\62\u01b5\3\2\2\2\64\u01df\3\2"+
		"\2\2\66\u01e1\3\2\2\28\u01f3\3\2\2\2:\u01f9\3\2\2\2<\u0201\3\2\2\2>\u0203"+
		"\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2E"+
		"C\3\2\2\2FH\5\26\f\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2"+
		"KI\3\2\2\2LN\5\24\13\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2"+
		"\2\2QO\3\2\2\2RV\5\6\4\2SV\5\16\b\2TV\5\b\5\2UR\3\2\2\2US\3\2\2\2UT\3"+
		"\2\2\2V\5\3\2\2\2WZ\5\n\6\2XZ\5\f\7\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2["+
		"_\7\3\2\2\\^\7\64\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2"+
		"\2a_\3\2\2\2bc\7\4\2\2cd\b\5\1\2d\t\3\2\2\2ef\7\35\2\2fs\7\'\2\2gh\7\5"+
		"\2\2hi\7\'\2\2ij\7\4\2\2js\b\6\1\2kl\7\5\2\2lm\7\'\2\2ms\b\6\1\2no\7\35"+
		"\2\2op\7\'\2\2pq\7\4\2\2qs\b\6\1\2re\3\2\2\2rg\3\2\2\2rk\3\2\2\2rn\3\2"+
		"\2\2s\13\3\2\2\2tu\7#\2\2uv\7\'\2\2v}\7\4\2\2wx\7#\2\2xy\7\'\2\2y}\b\7"+
		"\1\2z{\7#\2\2{}\b\7\1\2|t\3\2\2\2|w\3\2\2\2|z\3\2\2\2}\r\3\2\2\2~\u0081"+
		"\5\22\n\2\177\u0081\5\20\t\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\17"+
		"\3\2\2\2\u0082\u0083\7$\2\2\u0083\u0084\7)\2\2\u0084\u0085\7\'\2\2\u0085"+
		"\u00a5\7\4\2\2\u0086\u0087\7$\2\2\u0087\u0088\7\4\2\2\u0088\u0089\7)\2"+
		"\2\u0089\u008a\7\'\2\2\u008a\u008b\7\4\2\2\u008b\u00a5\b\t\1\2\u008c\u008e"+
		"\7$\2\2\u008d\u008f\7>\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\4\2\2\u0091\u0092\7\6\2\2\u0092\u0093\7\'"+
		"\2\2\u0093\u0094\7\4\2\2\u0094\u00a5\b\t\1\2\u0095\u0096\7$\2\2\u0096"+
		"\u0097\7)\2\2\u0097\u0098\7\'\2\2\u0098\u00a5\b\t\1\2\u0099\u009a\7$\2"+
		"\2\u009a\u009b\7)\2\2\u009b\u009c\7\4\2\2\u009c\u00a5\b\t\1\2\u009d\u009e"+
		"\7$\2\2\u009e\u009f\7)\2\2\u009f\u00a5\b\t\1\2\u00a0\u00a1\7$\2\2\u00a1"+
		"\u00a2\7\'\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\b\t\1\2\u00a4\u0082\3\2"+
		"\2\2\u00a4\u0086\3\2\2\2\u00a4\u008c\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4"+
		"\u0099\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\21\3\2\2"+
		"\2\u00a6\u00a7\7\36\2\2\u00a7\u00a8\7)\2\2\u00a8\u00a9\7\'\2\2\u00a9\u00c4"+
		"\b\n\1\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\7)\2\2\u00ad"+
		"\u00ae\7\'\2\2\u00ae\u00c4\b\n\1\2\u00af\u00b1\7\36\2\2\u00b0\u00b2\7"+
		">\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\7\4\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00c4\b\n"+
		"\1\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\7)\2\2\u00b9\u00ba\7\'\2\2\u00ba"+
		"\u00bb\7\4\2\2\u00bb\u00c4\b\n\1\2\u00bc\u00bd\7\36\2\2\u00bd\u00be\7"+
		")\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c4\b\n\1\2\u00c0\u00c1\7\36\2\2\u00c1"+
		"\u00c2\7\'\2\2\u00c2\u00c4\b\n\1\2\u00c3\u00a6\3\2\2\2\u00c3\u00aa\3\2"+
		"\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\5:\36\2\u00c6\u00c7\7\7\2"+
		"\2\u00c7\u00c8\5:\36\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\b\13\1\2\u00ca"+
		"\u00f2\3\2\2\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5\32\16\2\u00cd\u00ce\5"+
		" \21\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\b\13\1\2\u00d0\u00f2\3\2\2\2\u00d1"+
		"\u00d2\7\b\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\b"+
		"\13\1\2\u00d5\u00f2\3\2\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\7\4\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\13\1\2\u00da\u00f2\3\2\2\2\u00db\u00dc"+
		"\5\32\16\2\u00dc\u00dd\5,\27\2\u00dd\u00de\5&\24\2\u00de\u00df\5\30\r"+
		"\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\b\13\1\2\u00e1\u00f2\3\2\2\2\u00e2"+
		"\u00e3\7\n\2\2\u00e3\u00e4\5:\36\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\b\13"+
		"\1\2\u00e6\u00f2\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5:\36\2\u00e9"+
		"\u00ea\7\4\2\2\u00ea\u00eb\b\13\1\2\u00eb\u00f2\3\2\2\2\u00ec\u00ed\5"+
		"\32\16\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\b\13\1\2"+
		"\u00f0\u00f2\3\2\2\2\u00f1\u00c5\3\2\2\2\u00f1\u00cb\3\2\2\2\u00f1\u00d1"+
		"\3\2\2\2\u00f1\u00d6\3\2\2\2\u00f1\u00db\3\2\2\2\u00f1\u00e2\3\2\2\2\u00f1"+
		"\u00e7\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\25\3\2\2\2\u00f3\u00f4\5\32\16"+
		"\2\u00f4\u00f5\5 \21\2\u00f5\u00f6\7\4\2\2\u00f6\u010f\3\2\2\2\u00f7\u00f8"+
		"\5\32\16\2\u00f8\u00fa\5 \21\2\u00f9\u00fb\7\4\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u0100\7\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b\f"+
		"\1\2\u0104\u010f\3\2\2\2\u0105\u0106\5\32\16\2\u0106\u0107\5 \21\2\u0107"+
		"\u0108\b\f\1\2\u0108\u010f\3\2\2\2\u0109\u010a\5\32\16\2\u010a\u010b\5"+
		" \21\2\u010b\u010c\7\f\2\2\u010c\u010d\b\f\1\2\u010d\u010f\3\2\2\2\u010e"+
		"\u00f3\3\2\2\2\u010e\u00f7\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0109\3\2"+
		"\2\2\u010f\27\3\2\2\2\u0110\u0111\t\2\2\2\u0111\31\3\2\2\2\u0112\u0120"+
		"\5:\36\2\u0113\u0120\5\34\17\2\u0114\u0115\5\66\34\2\u0115\u0116\b\16"+
		"\1\2\u0116\u0120\3\2\2\2\u0117\u0118\5\64\33\2\u0118\u0119\b\16\1\2\u0119"+
		"\u0120\3\2\2\2\u011a\u011b\5\62\32\2\u011b\u011c\b\16\1\2\u011c\u0120"+
		"\3\2\2\2\u011d\u011e\7&\2\2\u011e\u0120\b\16\1\2\u011f\u0112\3\2\2\2\u011f"+
		"\u0113\3\2\2\2\u011f\u0114\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u011a\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\33\3\2\2\2\u0121\u0129\5> \2\u0122\u0129"+
		"\5\36\20\2\u0123\u0129\5(\25\2\u0124\u0125\5> \2\u0125\u0126\7\4\2\2\u0126"+
		"\u0127\b\17\1\2\u0127\u0129\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3"+
		"\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0129\35\3\2\2\2\u012a"+
		"\u012e\7\r\2\2\u012b\u012d\5 \21\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\7\16\2\2\u0132\37\3\2\2\2\u0133\u0134\5,\27"+
		"\2\u0134\u013b\5$\23\2\u0135\u0136\7\f\2\2\u0136\u0137\5,\27\2\u0137\u0138"+
		"\5$\23\2\u0138\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0162\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u013f\5,\27\2\u013f\u0140\b\21\1\2\u0140\u0162\3\2\2\2\u0141"+
		"\u0142\7\17\2\2\u0142\u0149\5$\23\2\u0143\u0144\7\f\2\2\u0144\u0145\5"+
		",\27\2\u0145\u0146\5$\23\2\u0146\u0148\3\2\2\2\u0147\u0143\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7\f\2\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\21\1\2\u0150\u0162\3"+
		"\2\2\2\u0151\u0152\7\20\2\2\u0152\u0159\5$\23\2\u0153\u0154\7\f\2\2\u0154"+
		"\u0155\5,\27\2\u0155\u0156\5$\23\2\u0156\u0158\3\2\2\2\u0157\u0153\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\7\f\2\2\u015d\u015c\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\21\1\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0133\3\2\2\2\u0161\u013e\3\2\2\2\u0161\u0141\3\2"+
		"\2\2\u0161\u0151\3\2\2\2\u0162!\3\2\2\2\u0163\u0164\7\21\2\2\u0164\u0165"+
		"\5,\27\2\u0165\u0166\7\22\2\2\u0166\u016d\5$\23\2\u0167\u0168\7\f\2\2"+
		"\u0168\u0169\5,\27\2\u0169\u016a\5$\23\2\u016a\u016c\3\2\2\2\u016b\u0167"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7\f\2\2\u0171\u0170\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172#\3\2\2\2\u0173\u0178\5&\24\2\u0174\u0175"+
		"\7\23\2\2\u0175\u0177\5&\24\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179%\3\2\2\2\u017a\u0178\3"+
		"\2\2\2\u017b\u0181\5*\26\2\u017c\u0181\5:\36\2\u017d\u0181\5\34\17\2\u017e"+
		"\u017f\7&\2\2\u017f\u0181\b\24\1\2\u0180\u017b\3\2\2\2\u0180\u017c\3\2"+
		"\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0181\'\3\2\2\2\u0182\u0186"+
		"\7\24\2\2\u0183\u0185\5&\24\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2"+
		"\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0189\u018a\7\25\2\2\u018a)\3\2\2\2\u018b\u018f\5\64\33\2\u018c"+
		"\u018f\5\62\32\2\u018d\u018f\5\66\34\2\u018e\u018b\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f+\3\2\2\2\u0190\u019b\5:\36\2\u0191"+
		"\u019b\5.\30\2\u0192\u0193\7\26\2\2\u0193\u019b\b\27\1\2\u0194\u0195\5"+
		"*\26\2\u0195\u0196\b\27\1\2\u0196\u019b\3\2\2\2\u0197\u0198\5\34\17\2"+
		"\u0198\u0199\b\27\1\2\u0199\u019b\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0191"+
		"\3\2\2\2\u019a\u0192\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0197\3\2\2\2\u019b"+
		"-\3\2\2\2\u019c\u019d\7&\2\2\u019d/\3\2\2\2\u019e\u019f\5:\36\2\u019f"+
		"\61\3\2\2\2\u01a0\u01b6\7\61\2\2\u01a1\u01b6\7\62\2\2\u01a2\u01b6\7\63"+
		"\2\2\u01a3\u01a4\t\3\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01b6\b\32\1\2\u01a6"+
		"\u01a8\7\61\2\2\u01a7\u01a9\7\64\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01b6\b\32\1\2\u01ad\u01ae\7\61\2\2\u01ae\u01b0\7\4\2\2\u01af\u01b1\7"+
		"\64\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\b\32\1\2\u01b5\u01a0\3"+
		"\2\2\2\u01b5\u01a1\3\2\2\2\u01b5\u01a2\3\2\2\2\u01b5\u01a3\3\2\2\2\u01b5"+
		"\u01a6\3\2\2\2\u01b5\u01ad\3\2\2\2\u01b6\63\3\2\2\2\u01b7\u01bb\58\35"+
		"\2\u01b8\u01bc\7\60\2\2\u01b9\u01ba\7\31\2\2\u01ba\u01bc\5\60\31\2\u01bb"+
		"\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01e0\3\2"+
		"\2\2\u01bd\u01c1\58\35\2\u01be\u01c2\7\60\2\2\u01bf\u01c0\7\32\2\2\u01c0"+
		"\u01c2\5\60\31\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\b\33\1\2\u01c4\u01e0\3\2\2\2\u01c5"+
		"\u01c9\58\35\2\u01c6\u01c7\7\60\2\2\u01c7\u01c8\7\31\2\2\u01c8\u01ca\5"+
		"\60\31\2\u01c9\u01c6\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cc\b\33\1\2\u01cc\u01e0\3\2\2\2\u01cd\u01d2\58\35\2\u01ce\u01cf\7"+
		"\31\2\2\u01cf\u01d0\5\60\31\2\u01d0\u01d1\7\60\2\2\u01d1\u01d3\3\2\2\2"+
		"\u01d2\u01ce\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\b\33\1\2\u01d5\u01e0\3\2\2\2\u01d6\u01db\58\35\2\u01d7\u01d9\7\33\2\2"+
		"\u01d8\u01da\t\4\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc"+
		"\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\b\33\1\2\u01de\u01e0\3\2\2\2\u01df\u01b7\3\2\2\2\u01df\u01bd\3"+
		"\2\2\2\u01df\u01c5\3\2\2\2\u01df\u01cd\3\2\2\2\u01df\u01d6\3\2\2\2\u01e0"+
		"\65\3\2\2\2\u01e1\u01e2\t\5\2\2\u01e2\67\3\2\2\2\u01e3\u01f4\7\65\2\2"+
		"\u01e4\u01f4\7\66\2\2\u01e5\u01f4\7\67\2\2\u01e6\u01f4\78\2\2\u01e7\u01e8"+
		"\78\2\2\u01e8\u01e9\7\34\2\2\u01e9\u01f4\b\35\1\2\u01ea\u01eb\7\34\2\2"+
		"\u01eb\u01ec\78\2\2\u01ec\u01f4\b\35\1\2\u01ed\u01ee\79\2\2\u01ee\u01f4"+
		"\b\35\1\2\u01ef\u01f0\7:\2\2\u01f0\u01f4\b\35\1\2\u01f1\u01f2\t\6\2\2"+
		"\u01f2\u01f4\b\35\1\2\u01f3\u01e3\3\2\2\2\u01f3\u01e4\3\2\2\2\u01f3\u01e5"+
		"\3\2\2\2\u01f3\u01e6\3\2\2\2\u01f3\u01e7\3\2\2\2\u01f3\u01ea\3\2\2\2\u01f3"+
		"\u01ed\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f49\3\2\2\2"+
		"\u01f5\u01f6\7(\2\2\u01f6\u01fa\b\36\1\2\u01f7\u01fa\7\'\2\2\u01f8\u01fa"+
		"\5<\37\2\u01f9\u01f5\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		";\3\2\2\2\u01fb\u01fc\7+\2\2\u01fc\u0202\b\37\1\2\u01fd\u01fe\7,\2\2\u01fe"+
		"\u0202\b\37\1\2\u01ff\u0202\7*\2\2\u0200\u0202\7)\2\2\u0201\u01fb\3\2"+
		"\2\2\u0201\u01fd\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202"+
		"=\3\2\2\2\u0203\u0204\7/\2\2\u0204?\3\2\2\2\60CIOUY_r|\u0080\u008e\u00a4"+
		"\u00b1\u00c3\u00f1\u00fc\u0101\u010e\u011f\u0128\u012e\u013b\u0149\u014d"+
		"\u0159\u015d\u0161\u016d\u0171\u0178\u0180\u0186\u018e\u019a\u01aa\u01b2"+
		"\u01b5\u01bb\u01c1\u01c9\u01d2\u01d9\u01db\u01df\u01f3\u01f9\u0201";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
