package antlr4;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, KW_BASE=17, 
		KW_PREFIX=18, KW_TRUE=19, KW_FALSE=20, PASS=21, COMMENT=22, BASE=23, PREFIX=24, 
		CODE=25, RDF_TYPE=26, IRIREF=27, WRONGIRIREF=28, PNAME_NS=29, PNAME_LN=30, 
		REGEXP=31, REGEXP_FLAGS=32, BLANK_NODE_LABEL=33, LANGTAG=34, INTEGER=35, 
		DECIMAL=36, DOUBLE=37, CHAR=38, STRING_LITERAL1=39, STRING_LITERAL2=40, 
		STRING_LITERAL_LONG1=41, STRING_LITERAL_LONG2=42, WRONG_STRING_LITERAL_LONG2=43;
	public static final int
		RULE_start = 0, RULE_directive = 1, RULE_baseDecl = 2, RULE_unkonwnDecl = 3, 
		RULE_baseSparql = 4, RULE_base = 5, RULE_prefixDecl = 6, RULE_prefix = 7, 
		RULE_prefixSparql = 8, RULE_errors = 9, RULE_triples = 10, RULE_subject = 11, 
		RULE_blank = 12, RULE_blankNodePropertyList = 13, RULE_predicateObjectList = 14, 
		RULE_objectList = 15, RULE_object = 16, RULE_collection = 17, RULE_literal = 18, 
		RULE_predicate = 19, RULE_rdfType = 20, RULE_datatype = 21, RULE_numericLiteral = 22, 
		RULE_rdfLiteral = 23, RULE_booleanLiteral = 24, RULE_string = 25, RULE_iri = 26, 
		RULE_prefixedName = 27, RULE_blankNode = 28;
	public static final String[] ruleNames = {
		"start", "directive", "baseDecl", "unkonwnDecl", "baseSparql", "base", 
		"prefixDecl", "prefix", "prefixSparql", "errors", "triples", "subject", 
		"blank", "blankNodePropertyList", "predicateObjectList", "objectList", 
		"object", "collection", "literal", "predicate", "rdfType", "datatype", 
		"numericLiteral", "rdfLiteral", "booleanLiteral", "string", "iri", "prefixedName", 
		"blankNode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@keywords'", "'.'", "'@BASE'", "'='", "'{'", "'}'", "'['", "']'", 
		"';'", "'<='", "','", "'('", "')'", "'^^'", "'^'", "'\"'", null, null, 
		"'true'", "'false'", null, null, "'@base'", "'@prefix'", null, "'a'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "KW_BASE", "KW_PREFIX", "KW_TRUE", "KW_FALSE", 
		"PASS", "COMMENT", "BASE", "PREFIX", "CODE", "RDF_TYPE", "IRIREF", "WRONGIRIREF", 
		"PNAME_NS", "PNAME_LN", "REGEXP", "REGEXP_FLAGS", "BLANK_NODE_LABEL", 
		"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "CHAR", "STRING_LITERAL1", 
		"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "WRONG_STRING_LITERAL_LONG2"
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
		public List<ErrorsContext> errors() {
			return getRuleContexts(ErrorsContext.class);
		}
		public ErrorsContext errors(int i) {
			return getRuleContext(ErrorsContext.class,i);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << KW_BASE) | (1L << KW_PREFIX) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				{
				setState(58);
				directive();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					errors();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						triples();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2))) != 0)) {
				{
				{
				setState(78);
				errors();
				}
				}
				setState(83);
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case KW_BASE:
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				baseDecl();
				}
				break;
			case KW_PREFIX:
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				prefixDecl();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case KW_BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				baseSparql();
				}
				break;
			case BASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
			setState(93);
			match(T__0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(94);
				match(CHAR);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(KW_BASE);
				setState(104);
				match(IRIREF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__2);
				setState(106);
				match(IRIREF);
				setState(107);
				match(T__1);
				notifyErrorListeners("Uncorrect form of Base directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__2);
				setState(110);
				match(IRIREF);
				notifyErrorListeners("Uncorrect form of Base  directive");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(KW_BASE);
				setState(113);
				match(IRIREF);
				setState(114);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(BASE);
				setState(119);
				match(IRIREF);
				setState(120);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(BASE);
				setState(122);
				match(IRIREF);
				notifyErrorListeners("Missing '.' at the end of Base directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				prefixSparql();
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(PREFIX);
				setState(133);
				match(PNAME_NS);
				setState(134);
				match(IRIREF);
				setState(135);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(PREFIX);
				setState(137);
				match(PNAME_NS);
				setState(138);
				match(IRIREF);
				notifyErrorListeners("Missing '.' at the end of Prefix directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(PREFIX);
				setState(141);
				match(PNAME_NS);
				notifyErrorListeners("Missing IRI in Prefix directive");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(PREFIX);
				setState(144);
				match(IRIREF);
				setState(145);
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
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(KW_PREFIX);
				setState(150);
				((PrefixSparqlContext)_localctx).PNAME_NS = match(PNAME_NS);
				setState(151);
				((PrefixSparqlContext)_localctx).IRIREF = match(IRIREF);
				System.out.println("\nNS "+(((PrefixSparqlContext)_localctx).PNAME_NS!=null?((PrefixSparqlContext)_localctx).PNAME_NS.getText():null)+"IRI "+(((PrefixSparqlContext)_localctx).IRIREF!=null?((PrefixSparqlContext)_localctx).IRIREF.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(KW_PREFIX);
				setState(154);
				match(PNAME_NS);
				setState(155);
				match(IRIREF);
				setState(156);
				match(T__1);
				notifyErrorListeners(" extraneous input'.' at the end of Prefix directive");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(KW_PREFIX);
				setState(159);
				match(PNAME_NS);
				setState(160);
				match(T__1);
				notifyErrorListeners("Missing IRI in Prefix directive");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(KW_PREFIX);
				setState(163);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				iri();
				setState(168);
				match(T__3);
				setState(169);
				iri();
				setState(170);
				match(T__1);
				notifyErrorListeners("Turtle is not N3");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__4);
				setState(174);
				subject();
				setState(175);
				predicateObjectList();
				setState(176);
				match(T__5);
				notifyErrorListeners("{ } pattern is not in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__4);
				setState(180);
				triples();
				setState(181);
				match(T__5);
				notifyErrorListeners("{ } pattern is not in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(184);
				subject();
				setState(185);
				match(T__1);
				}
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				subject();
				setState(192);
				predicateObjectList();
				setState(193);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				subject();
				setState(196);
				predicateObjectList();
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(197);
						match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(T__1);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				notifyErrorListeners("Too many DOT ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				subject();
				setState(210);
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
		enterRule(_localctx, 22, RULE_subject);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case WRONGIRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				iri();
				}
				break;
			case T__6:
			case T__11:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				blank();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				booleanLiteral();
				notifyErrorListeners("Subject cannot be a boolean value");
				}
				break;
			case T__15:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				rdfLiteral();
				notifyErrorListeners("Subject cannot be a string");
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				numericLiteral();
				notifyErrorListeners("Subject cannot be a number");
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
		enterRule(_localctx, 24, RULE_blank);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				blankNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				blankNodePropertyList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				collection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				blankNode();
				setState(232);
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
		enterRule(_localctx, 26, RULE_blankNodePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__6);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2))) != 0)) {
				{
				{
				setState(238);
				predicateObjectList();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__7);
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
		enterRule(_localctx, 28, RULE_predicateObjectList);
		int _la;
		try {
			int _alt;
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				predicate();
				setState(247);
				objectList();
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						match(T__8);
						setState(249);
						predicate();
						setState(250);
						objectList();
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(257);
					match(T__8);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				predicate();
				notifyErrorListeners("Object is missing in the triple");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(T__9);
				setState(264);
				objectList();
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						match(T__8);
						setState(266);
						predicate();
						setState(267);
						objectList();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(274);
					match(T__8);
					}
				}

				notifyErrorListeners("'<=' is not in Turtle");
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
		enterRule(_localctx, 30, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			object();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(282);
				match(T__10);
				setState(283);
				object();
				}
				}
				setState(288);
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
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
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
		enterRule(_localctx, 32, RULE_object);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case WRONGIRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				iri();
				}
				break;
			case T__6:
			case T__11:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				blank();
				}
				break;
			case T__15:
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
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				literal();
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
		enterRule(_localctx, 34, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__11);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << IRIREF) | (1L << WRONGIRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2) | (1L << WRONG_STRING_LITERAL_LONG2))) != 0)) {
				{
				{
				setState(295);
				object();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case WRONG_STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				numericLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
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
		enterRule(_localctx, 38, RULE_predicate);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case WRONGIRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				iri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				rdfType();
				}
				break;
			case T__15:
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
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				literal();
				notifyErrorListeners("Predicate cannot be a literal");
				}
				break;
			case T__6:
			case T__11:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
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
		enterRule(_localctx, 40, RULE_rdfType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 42, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		enterRule(_localctx, 44, RULE_numericLiteral);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(DECIMAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(INTEGER);
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(326);
					match(CHAR);
					}
					}
					setState(329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR );
				notifyErrorListeners("Numeric literal cannot have string characters");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(INTEGER);
				setState(333);
				match(T__1);
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(334);
					match(CHAR);
					}
					}
					setState(337); 
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
		enterRule(_localctx, 46, RULE_rdfLiteral);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				string();
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(343);
					match(LANGTAG);
					}
					break;
				case T__13:
					{
					setState(344);
					match(T__13);
					setState(345);
					datatype();
					}
					break;
				case EOF:
				case T__1:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__15:
				case KW_TRUE:
				case KW_FALSE:
				case RDF_TYPE:
				case IRIREF:
				case WRONGIRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case BLANK_NODE_LABEL:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
				case WRONG_STRING_LITERAL_LONG2:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				string();
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(349);
					match(LANGTAG);
					}
					break;
				case T__14:
					{
					setState(350);
					match(T__14);
					setState(351);
					datatype();
					}
					break;
				case EOF:
				case T__1:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__15:
				case KW_TRUE:
				case KW_FALSE:
				case RDF_TYPE:
				case IRIREF:
				case WRONGIRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case BLANK_NODE_LABEL:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
				case WRONG_STRING_LITERAL_LONG2:
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
				setState(356);
				string();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGTAG) {
					{
					setState(357);
					match(LANGTAG);
					setState(358);
					match(T__13);
					setState(359);
					datatype();
					}
				}

				notifyErrorListeners("Uncorrect form of a Literal");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				string();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(365);
					match(T__13);
					setState(366);
					datatype();
					setState(367);
					match(LANGTAG);
					}
				}

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
		enterRule(_localctx, 48, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 50, RULE_string);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(STRING_LITERAL_LONG1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(STRING_LITERAL_LONG2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(STRING_LITERAL_LONG2);
				setState(380);
				match(T__15);
				notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(T__15);
				setState(383);
				match(STRING_LITERAL_LONG2);
				notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(WRONG_STRING_LITERAL_LONG2);
				notifyErrorListeners("Missing qoutes of long literal");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				match(STRING_LITERAL1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
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
		enterRule(_localctx, 52, RULE_iri);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRONGIRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(WRONGIRIREF);
				notifyErrorListeners("Uncorrect form of URI, it should not contain newline");
				}
				break;
			case IRIREF:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
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
		enterRule(_localctx, 54, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
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
		enterRule(_localctx, 56, RULE_blankNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\5\2O"+
		"\n\2\3\2\7\2R\n\2\f\2\16\2U\13\2\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\5\4^\n\4"+
		"\3\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0081\n\7\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00c9"+
		"\n\f\r\f\16\f\u00ca\3\f\6\f\u00ce\n\f\r\f\16\f\u00cf\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e5"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17\7\17"+
		"\u00f2\n\17\f\17\16\17\u00f5\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00ff\n\20\f\20\16\20\u0102\13\20\3\20\5\20\u0105\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0110\n\20\f\20\16\20\u0113"+
		"\13\20\3\20\5\20\u0116\n\20\3\20\3\20\5\20\u011a\n\20\3\21\3\21\3\21\7"+
		"\21\u011f\n\21\f\21\16\21\u0122\13\21\3\22\3\22\3\22\5\22\u0127\n\22\3"+
		"\23\3\23\7\23\u012b\n\23\f\23\16\23\u012e\13\23\3\23\3\23\3\24\3\24\3"+
		"\24\5\24\u0135\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013f"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\6\30\u014a\n\30\r\30"+
		"\16\30\u014b\3\30\3\30\3\30\3\30\6\30\u0152\n\30\r\30\16\30\u0153\3\30"+
		"\5\30\u0157\n\30\3\31\3\31\3\31\3\31\5\31\u015d\n\31\3\31\3\31\3\31\3"+
		"\31\5\31\u0163\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016b\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0174\n\31\3\31\3\31\5\31\u0178\n"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0188\n\33\3\34\3\34\3\34\3\34\5\34\u018e\n\34\3\35\3\35\3\36"+
		"\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\4\3\2\25\26\3\2\37 \2\u01c0\2?\3\2\2\2\4Y\3\2\2\2\6]\3\2\2"+
		"\2\b_\3\2\2\2\nv\3\2\2\2\f\u0080\3\2\2\2\16\u0084\3\2\2\2\20\u0095\3\2"+
		"\2\2\22\u00a7\3\2\2\2\24\u00bf\3\2\2\2\26\u00d7\3\2\2\2\30\u00e4\3\2\2"+
		"\2\32\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u0119\3\2\2\2 \u011b\3\2\2\2\""+
		"\u0126\3\2\2\2$\u0128\3\2\2\2&\u0134\3\2\2\2(\u013e\3\2\2\2*\u0140\3\2"+
		"\2\2,\u0142\3\2\2\2.\u0156\3\2\2\2\60\u0177\3\2\2\2\62\u0179\3\2\2\2\64"+
		"\u0187\3\2\2\2\66\u018d\3\2\2\28\u018f\3\2\2\2:\u0191\3\2\2\2<>\5\4\3"+
		"\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\24"+
		"\13\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FN\3\2\2\2GE\3\2\2\2HJ\5"+
		"\26\f\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NK"+
		"\3\2\2\2NO\3\2\2\2OS\3\2\2\2PR\5\24\13\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2T\3\3\2\2\2US\3\2\2\2VZ\5\6\4\2WZ\5\16\b\2XZ\5\b\5\2YV\3\2\2"+
		"\2YW\3\2\2\2YX\3\2\2\2Z\5\3\2\2\2[^\5\n\6\2\\^\5\f\7\2][\3\2\2\2]\\\3"+
		"\2\2\2^\7\3\2\2\2_c\7\3\2\2`b\7(\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\4\2\2gh\b\5\1\2h\t\3\2\2\2ij\7\23\2\2j"+
		"w\7\35\2\2kl\7\5\2\2lm\7\35\2\2mn\7\4\2\2nw\b\6\1\2op\7\5\2\2pq\7\35\2"+
		"\2qw\b\6\1\2rs\7\23\2\2st\7\35\2\2tu\7\4\2\2uw\b\6\1\2vi\3\2\2\2vk\3\2"+
		"\2\2vo\3\2\2\2vr\3\2\2\2w\13\3\2\2\2xy\7\31\2\2yz\7\35\2\2z\u0081\7\4"+
		"\2\2{|\7\31\2\2|}\7\35\2\2}\u0081\b\7\1\2~\177\7\31\2\2\177\u0081\b\7"+
		"\1\2\u0080x\3\2\2\2\u0080{\3\2\2\2\u0080~\3\2\2\2\u0081\r\3\2\2\2\u0082"+
		"\u0085\5\22\n\2\u0083\u0085\5\20\t\2\u0084\u0082\3\2\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\17\3\2\2\2\u0086\u0087\7\32\2\2\u0087\u0088\7\37\2\2\u0088"+
		"\u0089\7\35\2\2\u0089\u0096\7\4\2\2\u008a\u008b\7\32\2\2\u008b\u008c\7"+
		"\37\2\2\u008c\u008d\7\35\2\2\u008d\u0096\b\t\1\2\u008e\u008f\7\32\2\2"+
		"\u008f\u0090\7\37\2\2\u0090\u0096\b\t\1\2\u0091\u0092\7\32\2\2\u0092\u0093"+
		"\7\35\2\2\u0093\u0094\7\4\2\2\u0094\u0096\b\t\1\2\u0095\u0086\3\2\2\2"+
		"\u0095\u008a\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0096\21"+
		"\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7\35\2"+
		"\2\u009a\u00a8\b\n\1\2\u009b\u009c\7\24\2\2\u009c\u009d\7\37\2\2\u009d"+
		"\u009e\7\35\2\2\u009e\u009f\7\4\2\2\u009f\u00a8\b\n\1\2\u00a0\u00a1\7"+
		"\24\2\2\u00a1\u00a2\7\37\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a8\b\n\1\2\u00a4"+
		"\u00a5\7\24\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a8\b\n\1\2\u00a7\u0097\3"+
		"\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8"+
		"\23\3\2\2\2\u00a9\u00aa\5\66\34\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5\66"+
		"\34\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\b\13\1\2\u00ae\u00c0\3\2\2\2\u00af"+
		"\u00b0\7\7\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3"+
		"\7\b\2\2\u00b3\u00b4\b\13\1\2\u00b4\u00c0\3\2\2\2\u00b5\u00b6\7\7\2\2"+
		"\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\b\13\1\2\u00b9\u00c0"+
		"\3\2\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\b\13\1\2\u00be\u00c0\3\2\2\2\u00bf\u00a9\3\2\2\2\u00bf\u00af"+
		"\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\25\3\2\2\2\u00c1"+
		"\u00c2\5\30\r\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\4\2\2\u00c4\u00d8"+
		"\3\2\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c8\5\36\20\2\u00c7\u00c9\7\4\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\7\4\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\b\f\1\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\5\30\r\2\u00d4"+
		"\u00d5\5\36\20\2\u00d5\u00d6\b\f\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00c1\3"+
		"\2\2\2\u00d7\u00c5\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\27\3\2\2\2\u00d9"+
		"\u00e5\5\66\34\2\u00da\u00e5\5\32\16\2\u00db\u00dc\5\62\32\2\u00dc\u00dd"+
		"\b\r\1\2\u00dd\u00e5\3\2\2\2\u00de\u00df\5\60\31\2\u00df\u00e0\b\r\1\2"+
		"\u00e0\u00e5\3\2\2\2\u00e1\u00e2\5.\30\2\u00e2\u00e3\b\r\1\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4"+
		"\u00de\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00ee\5:\36"+
		"\2\u00e7\u00ee\5\34\17\2\u00e8\u00ee\5$\23\2\u00e9\u00ea\5:\36\2\u00ea"+
		"\u00eb\7\4\2\2\u00eb\u00ec\b\16\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e6\3"+
		"\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee"+
		"\33\3\2\2\2\u00ef\u00f3\7\t\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\n\2\2\u00f7\35\3\2\2"+
		"\2\u00f8\u00f9\5(\25\2\u00f9\u0100\5 \21\2\u00fa\u00fb\7\13\2\2\u00fb"+
		"\u00fc\5(\25\2\u00fc\u00fd\5 \21\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\13\2\2\u0104\u0103\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u011a\3\2\2\2\u0106\u0107\5(\25\2\u0107"+
		"\u0108\b\20\1\2\u0108\u011a\3\2\2\2\u0109\u010a\7\f\2\2\u010a\u0111\5"+
		" \21\2\u010b\u010c\7\13\2\2\u010c\u010d\5(\25\2\u010d\u010e\5 \21\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010b\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0116\7\13\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3"+
		"\2\2\2\u0117\u0118\b\20\1\2\u0118\u011a\3\2\2\2\u0119\u00f8\3\2\2\2\u0119"+
		"\u0106\3\2\2\2\u0119\u0109\3\2\2\2\u011a\37\3\2\2\2\u011b\u0120\5\"\22"+
		"\2\u011c\u011d\7\r\2\2\u011d\u011f\5\"\22\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121!\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0123\u0127\5\66\34\2\u0124\u0127\5\32\16\2\u0125"+
		"\u0127\5&\24\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2"+
		"\2\2\u0127#\3\2\2\2\u0128\u012c\7\16\2\2\u0129\u012b\5\"\22\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\17\2\2\u0130%\3\2\2\2"+
		"\u0131\u0135\5\60\31\2\u0132\u0135\5.\30\2\u0133\u0135\5\62\32\2\u0134"+
		"\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\'\3\2\2\2"+
		"\u0136\u013f\5\66\34\2\u0137\u013f\5*\26\2\u0138\u0139\5&\24\2\u0139\u013a"+
		"\b\25\1\2\u013a\u013f\3\2\2\2\u013b\u013c\5\32\16\2\u013c\u013d\b\25\1"+
		"\2\u013d\u013f\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0137\3\2\2\2\u013e\u0138"+
		"\3\2\2\2\u013e\u013b\3\2\2\2\u013f)\3\2\2\2\u0140\u0141\7\34\2\2\u0141"+
		"+\3\2\2\2\u0142\u0143\5\66\34\2\u0143-\3\2\2\2\u0144\u0157\7%\2\2\u0145"+
		"\u0157\7&\2\2\u0146\u0157\7\'\2\2\u0147\u0149\7%\2\2\u0148\u014a\7(\2"+
		"\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0157\b\30\1\2\u014e\u014f\7%\2\2\u014f"+
		"\u0151\7\4\2\2\u0150\u0152\7(\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\b\30\1\2\u0156\u0144\3\2\2\2\u0156\u0145\3\2\2\2\u0156\u0146\3"+
		"\2\2\2\u0156\u0147\3\2\2\2\u0156\u014e\3\2\2\2\u0157/\3\2\2\2\u0158\u015c"+
		"\5\64\33\2\u0159\u015d\7$\2\2\u015a\u015b\7\20\2\2\u015b\u015d\5,\27\2"+
		"\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0178"+
		"\3\2\2\2\u015e\u0162\5\64\33\2\u015f\u0163\7$\2\2\u0160\u0161\7\21\2\2"+
		"\u0161\u0163\5,\27\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b\31\1\2\u0165\u0178\3\2\2\2"+
		"\u0166\u016a\5\64\33\2\u0167\u0168\7$\2\2\u0168\u0169\7\20\2\2\u0169\u016b"+
		"\5,\27\2\u016a\u0167\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\b\31\1\2\u016d\u0178\3\2\2\2\u016e\u0173\5\64\33\2\u016f\u0170"+
		"\7\20\2\2\u0170\u0171\5,\27\2\u0171\u0172\7$\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u016f\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b\31"+
		"\1\2\u0176\u0178\3\2\2\2\u0177\u0158\3\2\2\2\u0177\u015e\3\2\2\2\u0177"+
		"\u0166\3\2\2\2\u0177\u016e\3\2\2\2\u0178\61\3\2\2\2\u0179\u017a\t\2\2"+
		"\2\u017a\63\3\2\2\2\u017b\u0188\7+\2\2\u017c\u0188\7,\2\2\u017d\u017e"+
		"\7,\2\2\u017e\u017f\7\22\2\2\u017f\u0188\b\33\1\2\u0180\u0181\7\22\2\2"+
		"\u0181\u0182\7,\2\2\u0182\u0188\b\33\1\2\u0183\u0184\7-\2\2\u0184\u0188"+
		"\b\33\1\2\u0185\u0188\7)\2\2\u0186\u0188\7*\2\2\u0187\u017b\3\2\2\2\u0187"+
		"\u017c\3\2\2\2\u0187\u017d\3\2\2\2\u0187\u0180\3\2\2\2\u0187\u0183\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\65\3\2\2\2\u0189\u018a"+
		"\7\36\2\2\u018a\u018e\b\34\1\2\u018b\u018e\7\35\2\2\u018c\u018e\58\35"+
		"\2\u018d\u0189\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\67"+
		"\3\2\2\2\u018f\u0190\t\3\2\2\u01909\3\2\2\2\u0191\u0192\7#\2\2\u0192;"+
		"\3\2\2\2*?EKNSY]cv\u0080\u0084\u0095\u00a7\u00bf\u00ca\u00cf\u00d7\u00e4"+
		"\u00ed\u00f3\u0100\u0104\u0111\u0115\u0119\u0120\u0126\u012c\u0134\u013e"+
		"\u014b\u0153\u0156\u015c\u0162\u016a\u0173\u0177\u0187\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
