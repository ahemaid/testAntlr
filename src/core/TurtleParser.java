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
		null, "'@keywords'", "'.'", "'@BASE'", "':'", "'='", "';'", "','", "'{'", 
		"'}'", "'@forAll'", "'@forSome'", "'['", "']'", "'<='", "'=>'", "'is'", 
		"'of'", "'('", "')'", "'A'", "'0x'", "'0X'", "'^^'", "'^'", "'@'", "'\"'", 
		null, null, "'true'", "'false'", null, null, "'@base'", "'@prefix'", null, 
		"'a'"
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
		public List<ErrorsContext> errors() {
			return getRuleContexts(ErrorsContext.class);
		}
		public ErrorsContext errors(int i) {
			return getRuleContext(ErrorsContext.class,i);
		}
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
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					errors();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << KW_BASE) | (1L << KW_PREFIX) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				{
				setState(68);
				directive();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					errors();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						triples();
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << WRONG_PNAME_LN_STARTS_WITH_DOT) | (1L << WRONG_PNAME_LN_ENDS_WITH_DOT) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL2_MIX_QUOTES) | (1L << WRONG_STRING_LITERAL2_WITH_ESCAPE) | (1L << WRONG_STRING_LITERAL1) | (1L << WRONG_STRING_LITERAL2))) != 0)) {
				{
				{
				setState(88);
				errors();
				}
				}
				setState(93);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case KW_BASE:
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				baseDecl();
				}
				break;
			case KW_PREFIX:
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				prefixDecl();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case KW_BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				baseSparql();
				}
				break;
			case BASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
			setState(103);
			match(T__0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(104);
				match(CHAR);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(KW_BASE);
				setState(114);
				match(IRIREF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__2);
				setState(116);
				match(IRIREF);
				setState(117);
				match(T__1);
				notifyErrorListeners("Uncorrect form of Base directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__2);
				setState(120);
				match(IRIREF);
				notifyErrorListeners("Uncorrect form of Base  directive");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(KW_BASE);
				setState(123);
				match(IRIREF);
				setState(124);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(BASE);
				setState(129);
				match(IRIREF);
				setState(130);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(BASE);
				setState(132);
				match(IRIREF);
				notifyErrorListeners("Missing '.' at the end of Base directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				prefixSparql();
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(PREFIX);
				setState(143);
				match(PNAME_NS);
				setState(144);
				match(IRIREF);
				setState(145);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(PREFIX);
				setState(147);
				match(T__1);
				setState(148);
				match(PNAME_NS);
				setState(149);
				match(IRIREF);
				setState(150);
				match(T__1);
				notifyErrorListeners("Namespace cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(PREFIX);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PN_PREFIX) {
					{
					setState(153);
					match(PN_PREFIX);
					}
				}

				setState(156);
				match(T__1);
				setState(157);
				match(T__3);
				setState(158);
				match(IRIREF);
				setState(159);
				match(T__1);
				notifyErrorListeners("Namespace cannot end with '.' ");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(PREFIX);
				setState(162);
				match(PNAME_NS);
				setState(163);
				match(IRIREF);
				notifyErrorListeners("Missing '.' at the end of Prefix directive");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(PREFIX);
				setState(166);
				match(PNAME_NS);
				notifyErrorListeners("Missing IRI in Prefix directive");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(PREFIX);
				setState(169);
				match(IRIREF);
				setState(170);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(KW_PREFIX);
				setState(175);
				((PrefixSparqlContext)_localctx).PNAME_NS = match(PNAME_NS);
				setState(176);
				((PrefixSparqlContext)_localctx).IRIREF = match(IRIREF);
				System.out.println("\nNS "+(((PrefixSparqlContext)_localctx).PNAME_NS!=null?((PrefixSparqlContext)_localctx).PNAME_NS.getText():null)+"IRI "+(((PrefixSparqlContext)_localctx).IRIREF!=null?((PrefixSparqlContext)_localctx).IRIREF.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(KW_PREFIX);
				setState(179);
				match(T__1);
				setState(180);
				match(PNAME_NS);
				setState(181);
				match(IRIREF);
				notifyErrorListeners("Namespace cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(KW_PREFIX);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PN_PREFIX) {
					{
					setState(184);
					match(PN_PREFIX);
					}
				}

				setState(187);
				match(T__1);
				setState(188);
				match(T__3);
				setState(189);
				match(IRIREF);
				notifyErrorListeners("Namespace cannot end with '.' ");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(KW_PREFIX);
				setState(192);
				match(PNAME_NS);
				setState(193);
				match(IRIREF);
				setState(194);
				match(T__1);
				notifyErrorListeners(" extraneous input'.' at the end of Prefix directive");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(KW_PREFIX);
				setState(197);
				match(PNAME_NS);
				setState(198);
				match(T__1);
				notifyErrorListeners("Missing IRI in Prefix directive");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(KW_PREFIX);
				setState(201);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				iri();
				setState(206);
				match(T__4);
				setState(207);
				iri();
				setState(208);
				match(T__1);
				notifyErrorListeners("Turtle is not N3");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				subject();
				setState(212);
				predicateObjectList();
				setState(213);
				match(T__5);
				notifyErrorListeners("Uncorrect end of a triple, a triple ends with '.'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				subject();
				setState(217);
				predicateObjectList();
				setState(218);
				match(T__6);
				notifyErrorListeners("Uncorrect end of a triple, a triple ends with '.'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(T__7);
				setState(222);
				subject();
				setState(223);
				predicateObjectList();
				setState(224);
				match(T__8);
				notifyErrorListeners("{ } pattern is not in Turtle");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(T__7);
				setState(228);
				triples();
				setState(229);
				match(T__8);
				notifyErrorListeners("{ } pattern is not in Turtle");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(232);
				subject();
				setState(233);
				match(T__1);
				}
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				subject();
				setState(238);
				predicate();
				setState(239);
				object();
				setState(240);
				graphLabel();
				setState(241);
				match(T__1);
				notifyErrorListeners("Turtle is not NQuads");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(T__9);
				setState(245);
				iri();
				setState(246);
				match(T__1);
				notifyErrorListeners(" '@forAll' cannot be used in Turtle ");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				match(T__10);
				setState(250);
				iri();
				setState(251);
				match(T__1);
				notifyErrorListeners(" '@forSome' cannot be used in Turtle ");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				subject();
				setState(255);
				wrongPredicateObjectList();
				setState(256);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				subject();
				setState(262);
				predicateObjectList();
				setState(263);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				subject();
				setState(266);
				predicateObjectList();
				setState(268); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(267);
						match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(270); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(272);
					match(T__1);
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				notifyErrorListeners("Too many DOT ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				subject();
				setState(280);
				predicateObjectList();
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
			setState(285);
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
			setState(300);
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
				setState(287);
				iri();
				}
				break;
			case T__11:
			case T__17:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				blank();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
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
			case WRONG_STRING_LITERAL2_WITH_ESCAPE:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
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
				setState(295);
				numericLiteral();
				notifyErrorListeners("Subject cannot be a number");
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				blankNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				blankNodePropertyList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				collection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				blankNode();
				setState(306);
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
			setState(311);
			match(T__11);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << WRONG_PNAME_LN_STARTS_WITH_DOT) | (1L << WRONG_PNAME_LN_ENDS_WITH_DOT) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL2_MIX_QUOTES) | (1L << WRONG_STRING_LITERAL2_WITH_ESCAPE) | (1L << WRONG_STRING_LITERAL1) | (1L << WRONG_STRING_LITERAL2))) != 0)) {
				{
				{
				setState(312);
				predicateObjectList();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(T__12);
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
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				predicate();
				setState(321);
				objectList();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						match(T__5);
						setState(323);
						predicate();
						setState(324);
						objectList();
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(331);
					match(T__5);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				predicate();
				notifyErrorListeners("Object is missing in the triple");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(T__13);
				setState(338);
				objectList();
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
						match(T__5);
						setState(340);
						predicate();
						setState(341);
						objectList();
						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(348);
					match(T__5);
					}
					break;
				}
				notifyErrorListeners("'<=' is not in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				match(T__14);
				setState(354);
				objectList();
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						match(T__5);
						setState(356);
						predicate();
						setState(357);
						objectList();
						}
						} 
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(364);
					match(T__5);
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
			setState(371);
			match(T__15);
			setState(372);
			predicate();
			setState(373);
			match(T__16);
			setState(374);
			objectList();
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					match(T__5);
					setState(376);
					predicate();
					setState(377);
					objectList();
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(384);
				match(T__5);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			object();
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(T__6);
					setState(389);
					object();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
			setState(400);
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
				setState(395);
				iri();
				}
				break;
			case T__11:
			case T__17:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				blank();
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
			case WRONG_STRING_LITERAL2_WITH_ESCAPE:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				literal();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
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
			setState(402);
			match(T__17);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << WRONG_PNAME_LN_STARTS_WITH_DOT) | (1L << WRONG_PNAME_LN_ENDS_WITH_DOT) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL2_MIX_QUOTES) | (1L << WRONG_STRING_LITERAL2_WITH_ESCAPE) | (1L << WRONG_STRING_LITERAL1) | (1L << WRONG_STRING_LITERAL2))) != 0)) {
				{
				{
				setState(403);
				object();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
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
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL2_MIX_QUOTES:
			case WRONG_STRING_LITERAL2_WITH_ESCAPE:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
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
				setState(412);
				numericLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
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
			setState(426);
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
				setState(416);
				iri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				rdfType();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
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
			case WRONG_STRING_LITERAL2_WITH_ESCAPE:
			case WRONG_STRING_LITERAL1:
			case WRONG_STRING_LITERAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				literal();
				notifyErrorListeners("Predicate cannot be a literal");
				}
				break;
			case T__11:
			case T__17:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
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
			setState(428);
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
			setState(430);
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
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(DECIMAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(436);
				match(INTEGER);
				notifyErrorListeners("Bad format of a numberic literal");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				match(INTEGER);
				setState(440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(439);
					match(CHAR);
					}
					}
					setState(442); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR );
				notifyErrorListeners("Numeric literal cannot have string characters");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(445);
				match(INTEGER);
				setState(446);
				match(T__1);
				setState(448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(447);
					match(CHAR);
					}
					}
					setState(450); 
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				string();
				setState(459);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(456);
					match(LANGTAG);
					}
					break;
				case T__22:
					{
					setState(457);
					match(T__22);
					setState(458);
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
				case WRONG_STRING_LITERAL2_WITH_ESCAPE:
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
				setState(461);
				string();
				setState(465);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(462);
					match(LANGTAG);
					}
					break;
				case T__23:
					{
					setState(463);
					match(T__23);
					setState(464);
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
				case WRONG_STRING_LITERAL2_WITH_ESCAPE:
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
				setState(469);
				string();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGTAG) {
					{
					setState(470);
					match(LANGTAG);
					setState(471);
					match(T__22);
					setState(472);
					datatype();
					}
				}

				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				string();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(478);
					match(T__22);
					setState(479);
					datatype();
					setState(480);
					match(LANGTAG);
					}
				}

				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				string();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(487);
					match(T__24);
					setState(489);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(488);
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
			setState(497);
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
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(TurtleParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(TurtleParser.STRING_LITERAL_LONG2, 0); }
		public TerminalNode WRONG_STRING_LITERAL_LONG2() { return getToken(TurtleParser.WRONG_STRING_LITERAL_LONG2, 0); }
		public TerminalNode WRONG_STRING_LITERAL2_MIX_QUOTES() { return getToken(TurtleParser.WRONG_STRING_LITERAL2_MIX_QUOTES, 0); }
		public TerminalNode WRONG_STRING_LITERAL1() { return getToken(TurtleParser.WRONG_STRING_LITERAL1, 0); }
		public TerminalNode WRONG_STRING_LITERAL2() { return getToken(TurtleParser.WRONG_STRING_LITERAL2, 0); }
		public TerminalNode WRONG_STRING_LITERAL2_WITH_ESCAPE() { return getToken(TurtleParser.WRONG_STRING_LITERAL2_WITH_ESCAPE, 0); }
		public TerminalNode STRING_LITERAL1() { return getToken(TurtleParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(TurtleParser.STRING_LITERAL2, 0); }
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
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(STRING_LITERAL_LONG1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(STRING_LITERAL_LONG2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(STRING_LITERAL_LONG2);
				setState(502);
				match(T__25);
				notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				match(T__25);
				setState(505);
				match(STRING_LITERAL_LONG2);
				notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				match(WRONG_STRING_LITERAL_LONG2);
				notifyErrorListeners("Missing qoutes of long literal");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				match(WRONG_STRING_LITERAL2_MIX_QUOTES);
				notifyErrorListeners("Literal cannot be used with a mix of single and double quotes, either one of them can be used");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(511);
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(513);
				match(WRONG_STRING_LITERAL2_WITH_ESCAPE);
				notifyErrorListeners("Uncorrect literal form with escape");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(515);
				match(STRING_LITERAL1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(516);
				match(STRING_LITERAL2);
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
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRONGIRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(WRONGIRIREF);
				notifyErrorListeners("Uncorrect form of URI, URI cannot contain newline or space");
				}
				break;
			case IRIREF:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
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
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRONG_PNAME_LN_STARTS_WITH_DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(WRONG_PNAME_LN_STARTS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of prefixed name, it cannot start with '.'");
				}
				break;
			case WRONG_PNAME_LN_ENDS_WITH_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(WRONG_PNAME_LN_ENDS_WITH_DOT);
				notifyErrorListeners("Uncorrect form of prefixed name, it cannot end with '.'");
				}
				break;
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(PNAME_LN);
				}
				break;
			case PNAME_NS:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
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
			setState(533);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u021a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2"+
		"\16\2Q\13\2\3\2\7\2T\n\2\f\2\16\2W\13\2\5\2Y\n\2\3\2\7\2\\\n\2\f\2\16"+
		"\2_\13\2\3\3\3\3\3\3\5\3d\n\3\3\4\3\4\5\4h\n\4\3\5\3\5\7\5l\n\5\f\5\16"+
		"\5o\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b"+
		"\5\b\u008f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00af\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bc\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ce"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0106\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u010f\n\f\r\f\16\f\u0110\3"+
		"\f\6\f\u0114\n\f\r\f\16\f\u0115\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011e\n\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u012f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0138\n\17"+
		"\3\20\3\20\7\20\u013c\n\20\f\20\16\20\u013f\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0149\n\21\f\21\16\21\u014c\13\21\3\21\5\21"+
		"\u014f\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u015a\n"+
		"\21\f\21\16\21\u015d\13\21\3\21\5\21\u0160\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u016a\n\21\f\21\16\21\u016d\13\21\3\21\5\21\u0170"+
		"\n\21\3\21\3\21\5\21\u0174\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u017e\n\22\f\22\16\22\u0181\13\22\3\22\5\22\u0184\n\22\3\23\3\23"+
		"\3\23\7\23\u0189\n\23\f\23\16\23\u018c\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0193\n\24\3\25\3\25\7\25\u0197\n\25\f\25\16\25\u019a\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u01a1\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01ad\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\6\32\u01bb\n\32\r\32\16\32\u01bc\3\32\3\32\3\32\3"+
		"\32\6\32\u01c3\n\32\r\32\16\32\u01c4\3\32\5\32\u01c8\n\32\3\33\3\33\3"+
		"\33\3\33\5\33\u01ce\n\33\3\33\3\33\3\33\3\33\5\33\u01d4\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01dc\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01e5\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ec\n\33\5\33\u01ee\n"+
		"\33\3\33\3\33\5\33\u01f2\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0208"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u020e\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0216\n\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>\2\7\4\2\'\'//\3\2\27\30\3\2\61\63\3\2\37 \3"+
		"\2<=\2\u0263\2C\3\2\2\2\4c\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\n\u0080\3\2\2"+
		"\2\f\u008a\3\2\2\2\16\u008e\3\2\2\2\20\u00ae\3\2\2\2\22\u00cd\3\2\2\2"+
		"\24\u0105\3\2\2\2\26\u011d\3\2\2\2\30\u011f\3\2\2\2\32\u012e\3\2\2\2\34"+
		"\u0137\3\2\2\2\36\u0139\3\2\2\2 \u0173\3\2\2\2\"\u0175\3\2\2\2$\u0185"+
		"\3\2\2\2&\u0192\3\2\2\2(\u0194\3\2\2\2*\u01a0\3\2\2\2,\u01ac\3\2\2\2."+
		"\u01ae\3\2\2\2\60\u01b0\3\2\2\2\62\u01c7\3\2\2\2\64\u01f1\3\2\2\2\66\u01f3"+
		"\3\2\2\28\u0207\3\2\2\2:\u020d\3\2\2\2<\u0215\3\2\2\2>\u0217\3\2\2\2@"+
		"B\5\24\13\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2"+
		"\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2KI\3\2\2"+
		"\2LN\5\24\13\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PX\3\2\2\2QO\3\2"+
		"\2\2RT\5\26\f\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2XU\3\2\2\2XY\3\2\2\2Y]\3\2\2\2Z\\\5\24\13\2[Z\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_]\3\2\2\2`d\5\6\4\2ad\5\16\b\2bd\5\b\5"+
		"\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\5\3\2\2\2eh\5\n\6\2fh\5\f\7\2ge\3\2"+
		"\2\2gf\3\2\2\2h\7\3\2\2\2im\7\3\2\2jl\7\64\2\2kj\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\4\2\2qr\b\5\1\2r\t\3\2\2\2st"+
		"\7\35\2\2t\u0081\7\'\2\2uv\7\5\2\2vw\7\'\2\2wx\7\4\2\2x\u0081\b\6\1\2"+
		"yz\7\5\2\2z{\7\'\2\2{\u0081\b\6\1\2|}\7\35\2\2}~\7\'\2\2~\177\7\4\2\2"+
		"\177\u0081\b\6\1\2\u0080s\3\2\2\2\u0080u\3\2\2\2\u0080y\3\2\2\2\u0080"+
		"|\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084\7\'\2\2\u0084"+
		"\u008b\7\4\2\2\u0085\u0086\7#\2\2\u0086\u0087\7\'\2\2\u0087\u008b\b\7"+
		"\1\2\u0088\u0089\7#\2\2\u0089\u008b\b\7\1\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0088\3\2\2\2\u008b\r\3\2\2\2\u008c\u008f\5\22\n"+
		"\2\u008d\u008f\5\20\t\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\17\3\2\2\2\u0090\u0091\7$\2\2\u0091\u0092\7)\2\2\u0092\u0093\7\'\2\2"+
		"\u0093\u00af\7\4\2\2\u0094\u0095\7$\2\2\u0095\u0096\7\4\2\2\u0096\u0097"+
		"\7)\2\2\u0097\u0098\7\'\2\2\u0098\u0099\7\4\2\2\u0099\u00af\b\t\1\2\u009a"+
		"\u009c\7$\2\2\u009b\u009d\7>\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u009e\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1"+
		"\7\'\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00af\b\t\1\2\u00a3\u00a4\7$\2\2\u00a4"+
		"\u00a5\7)\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00af\b\t\1\2\u00a7\u00a8\7$\2"+
		"\2\u00a8\u00a9\7)\2\2\u00a9\u00af\b\t\1\2\u00aa\u00ab\7$\2\2\u00ab\u00ac"+
		"\7\'\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\b\t\1\2\u00ae\u0090\3\2\2\2\u00ae"+
		"\u0094\3\2\2\2\u00ae\u009a\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00a7\3\2"+
		"\2\2\u00ae\u00aa\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b2"+
		"\7)\2\2\u00b2\u00b3\7\'\2\2\u00b3\u00ce\b\n\1\2\u00b4\u00b5\7\36\2\2\u00b5"+
		"\u00b6\7\4\2\2\u00b6\u00b7\7)\2\2\u00b7\u00b8\7\'\2\2\u00b8\u00ce\b\n"+
		"\1\2\u00b9\u00bb\7\36\2\2\u00ba\u00bc\7>\2\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\7\6"+
		"\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00ce\b\n\1\2\u00c1\u00c2\7\36\2\2\u00c2"+
		"\u00c3\7)\2\2\u00c3\u00c4\7\'\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00ce\b\n"+
		"\1\2\u00c6\u00c7\7\36\2\2\u00c7\u00c8\7)\2\2\u00c8\u00c9\7\4\2\2\u00c9"+
		"\u00ce\b\n\1\2\u00ca\u00cb\7\36\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00ce\b"+
		"\n\1\2\u00cd\u00b0\3\2\2\2\u00cd\u00b4\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd"+
		"\u00c1\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\23\3\2\2"+
		"\2\u00cf\u00d0\5:\36\2\u00d0\u00d1\7\7\2\2\u00d1\u00d2\5:\36\2\u00d2\u00d3"+
		"\7\4\2\2\u00d3\u00d4\b\13\1\2\u00d4\u0106\3\2\2\2\u00d5\u00d6\5\32\16"+
		"\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\b\13\1\2\u00d9"+
		"\u0106\3\2\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\5 \21\2\u00dc\u00dd\7"+
		"\t\2\2\u00dd\u00de\b\13\1\2\u00de\u0106\3\2\2\2\u00df\u00e0\7\n\2\2\u00e0"+
		"\u00e1\5\32\16\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\13\2\2\u00e3\u00e4"+
		"\b\13\1\2\u00e4\u0106\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\u00e7\5\26\f\2"+
		"\u00e7\u00e8\7\13\2\2\u00e8\u00e9\b\13\1\2\u00e9\u0106\3\2\2\2\u00ea\u00eb"+
		"\5\32\16\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\13\1"+
		"\2\u00ee\u0106\3\2\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\5,\27\2\u00f1"+
		"\u00f2\5&\24\2\u00f2\u00f3\5\30\r\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\b"+
		"\13\1\2\u00f5\u0106\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\5:\36\2\u00f8"+
		"\u00f9\7\4\2\2\u00f9\u00fa\b\13\1\2\u00fa\u0106\3\2\2\2\u00fb\u00fc\7"+
		"\r\2\2\u00fc\u00fd\5:\36\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\b\13\1\2\u00ff"+
		"\u0106\3\2\2\2\u0100\u0101\5\32\16\2\u0101\u0102\5\"\22\2\u0102\u0103"+
		"\7\4\2\2\u0103\u0104\b\13\1\2\u0104\u0106\3\2\2\2\u0105\u00cf\3\2\2\2"+
		"\u0105\u00d5\3\2\2\2\u0105\u00da\3\2\2\2\u0105\u00df\3\2\2\2\u0105\u00e5"+
		"\3\2\2\2\u0105\u00ea\3\2\2\2\u0105\u00ef\3\2\2\2\u0105\u00f6\3\2\2\2\u0105"+
		"\u00fb\3\2\2\2\u0105\u0100\3\2\2\2\u0106\25\3\2\2\2\u0107\u0108\5\32\16"+
		"\2\u0108\u0109\5 \21\2\u0109\u010a\7\4\2\2\u010a\u011e\3\2\2\2\u010b\u010c"+
		"\5\32\16\2\u010c\u010e\5 \21\2\u010d\u010f\7\4\2\2\u010e\u010d\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u0114\7\4\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\b\f"+
		"\1\2\u0118\u011e\3\2\2\2\u0119\u011a\5\32\16\2\u011a\u011b\5 \21\2\u011b"+
		"\u011c\b\f\1\2\u011c\u011e\3\2\2\2\u011d\u0107\3\2\2\2\u011d\u010b\3\2"+
		"\2\2\u011d\u0119\3\2\2\2\u011e\27\3\2\2\2\u011f\u0120\t\2\2\2\u0120\31"+
		"\3\2\2\2\u0121\u012f\5:\36\2\u0122\u012f\5\34\17\2\u0123\u0124\5\66\34"+
		"\2\u0124\u0125\b\16\1\2\u0125\u012f\3\2\2\2\u0126\u0127\5\64\33\2\u0127"+
		"\u0128\b\16\1\2\u0128\u012f\3\2\2\2\u0129\u012a\5\62\32\2\u012a\u012b"+
		"\b\16\1\2\u012b\u012f\3\2\2\2\u012c\u012d\7&\2\2\u012d\u012f\b\16\1\2"+
		"\u012e\u0121\3\2\2\2\u012e\u0122\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0126"+
		"\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012c\3\2\2\2\u012f\33\3\2\2\2\u0130"+
		"\u0138\5> \2\u0131\u0138\5\36\20\2\u0132\u0138\5(\25\2\u0133\u0134\5>"+
		" \2\u0134\u0135\7\4\2\2\u0135\u0136\b\17\1\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0130\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2"+
		"\2\2\u0138\35\3\2\2\2\u0139\u013d\7\16\2\2\u013a\u013c\5 \21\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\17\2\2\u0141\37\3\2\2"+
		"\2\u0142\u0143\5,\27\2\u0143\u014a\5$\23\2\u0144\u0145\7\b\2\2\u0145\u0146"+
		"\5,\27\2\u0146\u0147\5$\23\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\b\2\2\u014e\u014d\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0174\3\2\2\2\u0150\u0151\5,\27\2\u0151\u0152\b\21"+
		"\1\2\u0152\u0174\3\2\2\2\u0153\u0154\7\20\2\2\u0154\u015b\5$\23\2\u0155"+
		"\u0156\7\b\2\2\u0156\u0157\5,\27\2\u0157\u0158\5$\23\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0155\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\7\b"+
		"\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\b\21\1\2\u0162\u0174\3\2\2\2\u0163\u0164\7\21\2\2\u0164\u016b\5"+
		"$\23\2\u0165\u0166\7\b\2\2\u0166\u0167\5,\27\2\u0167\u0168\5$\23\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0165\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\7\b\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\b\21\1\2\u0172\u0174\3\2\2\2\u0173\u0142\3\2\2\2\u0173"+
		"\u0150\3\2\2\2\u0173\u0153\3\2\2\2\u0173\u0163\3\2\2\2\u0174!\3\2\2\2"+
		"\u0175\u0176\7\22\2\2\u0176\u0177\5,\27\2\u0177\u0178\7\23\2\2\u0178\u017f"+
		"\5$\23\2\u0179\u017a\7\b\2\2\u017a\u017b\5,\27\2\u017b\u017c\5$\23\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0179\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0184\7\b\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184#\3\2\2\2"+
		"\u0185\u018a\5&\24\2\u0186\u0187\7\t\2\2\u0187\u0189\5&\24\2\u0188\u0186"+
		"\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"%\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0193\5:\36\2\u018e\u0193\5\34\17"+
		"\2\u018f\u0193\5*\26\2\u0190\u0191\7&\2\2\u0191\u0193\b\24\1\2\u0192\u018d"+
		"\3\2\2\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\'\3\2\2\2\u0194\u0198\7\24\2\2\u0195\u0197\5&\24\2\u0196\u0195\3\2\2"+
		"\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7\25\2\2\u019c)\3\2\2\2\u019d"+
		"\u01a1\5\64\33\2\u019e\u01a1\5\62\32\2\u019f\u01a1\5\66\34\2\u01a0\u019d"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1+\3\2\2\2\u01a2"+
		"\u01ad\5:\36\2\u01a3\u01ad\5.\30\2\u01a4\u01a5\7\26\2\2\u01a5\u01ad\b"+
		"\27\1\2\u01a6\u01a7\5*\26\2\u01a7\u01a8\b\27\1\2\u01a8\u01ad\3\2\2\2\u01a9"+
		"\u01aa\5\34\17\2\u01aa\u01ab\b\27\1\2\u01ab\u01ad\3\2\2\2\u01ac\u01a2"+
		"\3\2\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ad-\3\2\2\2\u01ae\u01af\7&\2\2\u01af/\3\2\2\2\u01b0"+
		"\u01b1\5:\36\2\u01b1\61\3\2\2\2\u01b2\u01c8\7\61\2\2\u01b3\u01c8\7\62"+
		"\2\2\u01b4\u01c8\7\63\2\2\u01b5\u01b6\t\3\2\2\u01b6\u01b7\7\61\2\2\u01b7"+
		"\u01c8\b\32\1\2\u01b8\u01ba\7\61\2\2\u01b9\u01bb\7\64\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c8\b\32\1\2\u01bf\u01c0\7\61\2\2\u01c0\u01c2\7"+
		"\4\2\2\u01c1\u01c3\7\64\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\b\32"+
		"\1\2\u01c7\u01b2\3\2\2\2\u01c7\u01b3\3\2\2\2\u01c7\u01b4\3\2\2\2\u01c7"+
		"\u01b5\3\2\2\2\u01c7\u01b8\3\2\2\2\u01c7\u01bf\3\2\2\2\u01c8\63\3\2\2"+
		"\2\u01c9\u01cd\58\35\2\u01ca\u01ce\7\60\2\2\u01cb\u01cc\7\31\2\2\u01cc"+
		"\u01ce\5\60\31\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3"+
		"\2\2\2\u01ce\u01f2\3\2\2\2\u01cf\u01d3\58\35\2\u01d0\u01d4\7\60\2\2\u01d1"+
		"\u01d2\7\32\2\2\u01d2\u01d4\5\60\31\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\b\33\1\2"+
		"\u01d6\u01f2\3\2\2\2\u01d7\u01db\58\35\2\u01d8\u01d9\7\60\2\2\u01d9\u01da"+
		"\7\31\2\2\u01da\u01dc\5\60\31\2\u01db\u01d8\3\2\2\2\u01db\u01dc\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\b\33\1\2\u01de\u01f2\3\2\2\2\u01df"+
		"\u01e4\58\35\2\u01e0\u01e1\7\31\2\2\u01e1\u01e2\5\60\31\2\u01e2\u01e3"+
		"\7\60\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e5\3\2\2\2"+
		"\u01e5\u01e6\3\2\2\2\u01e6\u01e7\b\33\1\2\u01e7\u01f2\3\2\2\2\u01e8\u01ed"+
		"\58\35\2\u01e9\u01eb\7\33\2\2\u01ea\u01ec\t\4\2\2\u01eb\u01ea\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\b\33\1\2\u01f0\u01f2\3\2\2\2"+
		"\u01f1\u01c9\3\2\2\2\u01f1\u01cf\3\2\2\2\u01f1\u01d7\3\2\2\2\u01f1\u01df"+
		"\3\2\2\2\u01f1\u01e8\3\2\2\2\u01f2\65\3\2\2\2\u01f3\u01f4\t\5\2\2\u01f4"+
		"\67\3\2\2\2\u01f5\u0208\7\67\2\2\u01f6\u0208\78\2\2\u01f7\u01f8\78\2\2"+
		"\u01f8\u01f9\7\34\2\2\u01f9\u0208\b\35\1\2\u01fa\u01fb\7\34\2\2\u01fb"+
		"\u01fc\78\2\2\u01fc\u0208\b\35\1\2\u01fd\u01fe\79\2\2\u01fe\u0208\b\35"+
		"\1\2\u01ff\u0200\7:\2\2\u0200\u0208\b\35\1\2\u0201\u0202\t\6\2\2\u0202"+
		"\u0208\b\35\1\2\u0203\u0204\7;\2\2\u0204\u0208\b\35\1\2\u0205\u0208\7"+
		"\65\2\2\u0206\u0208\7\66\2\2\u0207\u01f5\3\2\2\2\u0207\u01f6\3\2\2\2\u0207"+
		"\u01f7\3\2\2\2\u0207\u01fa\3\2\2\2\u0207\u01fd\3\2\2\2\u0207\u01ff\3\2"+
		"\2\2\u0207\u0201\3\2\2\2\u0207\u0203\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0206\3\2\2\2\u02089\3\2\2\2\u0209\u020a\7(\2\2\u020a\u020e\b\36\1\2"+
		"\u020b\u020e\7\'\2\2\u020c\u020e\5<\37\2\u020d\u0209\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020d\u020c\3\2\2\2\u020e;\3\2\2\2\u020f\u0210\7+\2\2\u0210\u0216"+
		"\b\37\1\2\u0211\u0212\7,\2\2\u0212\u0216\b\37\1\2\u0213\u0216\7*\2\2\u0214"+
		"\u0216\7)\2\2\u0215\u020f\3\2\2\2\u0215\u0211\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0215\u0214\3\2\2\2\u0216=\3\2\2\2\u0217\u0218\7/\2\2\u0218?\3\2"+
		"\2\2\64CIOUX]cgm\u0080\u008a\u008e\u009c\u00ae\u00bb\u00cd\u0105\u0110"+
		"\u0115\u011d\u012e\u0137\u013d\u014a\u014e\u015b\u015f\u016b\u016f\u0173"+
		"\u017f\u0183\u018a\u0192\u0198\u01a0\u01ac\u01bc\u01c4\u01c7\u01cd\u01d3"+
		"\u01db\u01e4\u01eb\u01ed\u01f1\u0207\u020d\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
