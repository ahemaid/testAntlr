package antlr4;
// Generated from Turtle.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		KW_BASE=10, KW_PREFIX=11, KW_TRUE=12, KW_FALSE=13, PASS=14, COMMENT=15, 
		BASE=16, PREFIX=17, CODE=18, RDF_TYPE=19, IRIREF=20, PNAME_NS=21, PNAME_LN=22, 
		REGEXP=23, REGEXP_FLAGS=24, BLANK_NODE_LABEL=25, LANGTAG=26, INTEGER=27, 
		DECIMAL=28, DOUBLE=29, STRING_LITERAL1=30, STRING_LITERAL2=31, STRING_LITERAL_LONG1=32, 
		STRING_LITERAL_LONG2=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"KW_BASE", "KW_PREFIX", "KW_TRUE", "KW_FALSE", "PASS", "COMMENT", "BASE", 
		"PREFIX", "CODE", "RDF_TYPE", "IRIREF", "PNAME_NS", "PNAME_LN", "REGEXP", 
		"REGEXP_FLAGS", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", 
		"EXPONENT", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "UCHAR", "ECHAR", "PN_CHARS_BASE", "PN_CHARS_U", 
		"PN_CHARS", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'['", "']'", "';'", "','", "'('", "')'", "'^^'", "'^'", 
		null, null, "'true'", "'false'", null, null, "'@base'", "'@prefix'", null, 
		"'a'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "KW_BASE", 
		"KW_PREFIX", "KW_TRUE", "KW_FALSE", "PASS", "COMMENT", "BASE", "PREFIX", 
		"CODE", "RDF_TYPE", "IRIREF", "PNAME_NS", "PNAME_LN", "REGEXP", "REGEXP_FLAGS", 
		"BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "STRING_LITERAL1", 
		"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2"
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


	public TurtleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Turtle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0230\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17\u00bd\n\17\r\17\16\17\u00be"+
		"\3\17\3\17\3\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u00df\n\23\f\23\16\23\u00e2\13\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u00ec\n\25\f\25\16\25\u00ef\13"+
		"\25\3\25\3\25\3\26\5\26\u00f4\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\6\30\u0100\n\30\r\30\16\30\u0101\3\30\3\30\3\31\6\31\u0107"+
		"\n\31\r\31\16\31\u0108\3\32\3\32\3\32\3\32\3\32\5\32\u0110\n\32\3\32\3"+
		"\32\7\32\u0114\n\32\f\32\16\32\u0117\13\32\3\32\5\32\u011a\n\32\3\33\3"+
		"\33\6\33\u011e\n\33\r\33\16\33\u011f\3\33\3\33\6\33\u0124\n\33\r\33\16"+
		"\33\u0125\7\33\u0128\n\33\f\33\16\33\u012b\13\33\3\34\5\34\u012e\n\34"+
		"\3\34\6\34\u0131\n\34\r\34\16\34\u0132\3\35\5\35\u0136\n\35\3\35\7\35"+
		"\u0139\n\35\f\35\16\35\u013c\13\35\3\35\3\35\6\35\u0140\n\35\r\35\16\35"+
		"\u0141\3\36\5\36\u0145\n\36\3\36\6\36\u0148\n\36\r\36\16\36\u0149\3\36"+
		"\3\36\7\36\u014e\n\36\f\36\16\36\u0151\13\36\3\36\3\36\5\36\u0155\n\36"+
		"\3\36\6\36\u0158\n\36\r\36\16\36\u0159\3\36\5\36\u015d\n\36\3\37\3\37"+
		"\5\37\u0161\n\37\3\37\6\37\u0164\n\37\r\37\16\37\u0165\3 \3 \3 \3 \7 "+
		"\u016c\n \f \16 \u016f\13 \3 \3 \3!\3!\3!\3!\7!\u0177\n!\f!\16!\u017a"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0185\n\"\3\"\3\"\3\"\5\"\u018a"+
		"\n\"\7\"\u018c\n\"\f\"\16\"\u018f\13\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u019c\n#\3#\3#\3#\5#\u01a1\n#\7#\u01a3\n#\f#\16#\u01a6\13#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u01c0\n$\3%\3%\3%\3&\5&\u01c6\n&\3\'\3\'\5\'\u01ca\n\'\3(\3(\5(\u01ce"+
		"\n(\3)\3)\3)\7)\u01d3\n)\f)\16)\u01d6\13)\3)\5)\u01d9\n)\3*\3*\3*\5*\u01de"+
		"\n*\3*\3*\3*\7*\u01e3\n*\f*\16*\u01e6\13*\3*\3*\3*\5*\u01eb\n*\5*\u01ed"+
		"\n*\3+\3+\5+\u01f1\n+\3,\3,\3,\3,\3-\5-\u01f8\n-\3.\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B"+
		"\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\2\2I\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2? A!C\"E#G\2I\2K\2M\2O\2"+
		"Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2"+
		"\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2"+
		"\3\2\61\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2\'\'^^\t\2\2\"$$>@^^``bb}"+
		"\177\6\2\f\f\17\17\61\61^^\13\2&&*-/\61AA]`ppttvv}\177\6\2kkoouuzz\3\2"+
		"\62;\4\2C\\c|\5\2\62;C\\c|\4\2--//\4\2GGgg\6\2\f\f\17\17))^^\6\2\f\f\17"+
		"\17$$^^\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\17\2C\\c|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\7\2//\62;\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\4\2\60\60<<\5\2\62;CHch\t\2##%\61==??ABaa\u0080\u0080"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2L"+
		"Lll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0248"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3\u0091\3\2\2\2\5\u0093"+
		"\3\2\2\2\7\u0095\3\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2"+
		"\2\2\17\u009d\3\2\2\2\21\u009f\3\2\2\2\23\u00a2\3\2\2\2\25\u00a4\3\2\2"+
		"\2\27\u00a9\3\2\2\2\31\u00b0\3\2\2\2\33\u00b5\3\2\2\2\35\u00bc\3\2\2\2"+
		"\37\u00c2\3\2\2\2!\u00cb\3\2\2\2#\u00d1\3\2\2\2%\u00d9\3\2\2\2\'\u00e6"+
		"\3\2\2\2)\u00e8\3\2\2\2+\u00f3\3\2\2\2-\u00f7\3\2\2\2/\u00fa\3\2\2\2\61"+
		"\u0106\3\2\2\2\63\u010a\3\2\2\2\65\u011b\3\2\2\2\67\u012d\3\2\2\29\u0135"+
		"\3\2\2\2;\u0144\3\2\2\2=\u015e\3\2\2\2?\u0167\3\2\2\2A\u0172\3\2\2\2C"+
		"\u017d\3\2\2\2E\u0194\3\2\2\2G\u01bf\3\2\2\2I\u01c1\3\2\2\2K\u01c5\3\2"+
		"\2\2M\u01c9\3\2\2\2O\u01cd\3\2\2\2Q\u01cf\3\2\2\2S\u01dd\3\2\2\2U\u01f0"+
		"\3\2\2\2W\u01f2\3\2\2\2Y\u01f7\3\2\2\2[\u01f9\3\2\2\2]\u01fc\3\2\2\2_"+
		"\u01fe\3\2\2\2a\u0200\3\2\2\2c\u0202\3\2\2\2e\u0204\3\2\2\2g\u0206\3\2"+
		"\2\2i\u0208\3\2\2\2k\u020a\3\2\2\2m\u020c\3\2\2\2o\u020e\3\2\2\2q\u0210"+
		"\3\2\2\2s\u0212\3\2\2\2u\u0214\3\2\2\2w\u0216\3\2\2\2y\u0218\3\2\2\2{"+
		"\u021a\3\2\2\2}\u021c\3\2\2\2\177\u021e\3\2\2\2\u0081\u0220\3\2\2\2\u0083"+
		"\u0222\3\2\2\2\u0085\u0224\3\2\2\2\u0087\u0226\3\2\2\2\u0089\u0228\3\2"+
		"\2\2\u008b\u022a\3\2\2\2\u008d\u022c\3\2\2\2\u008f\u022e\3\2\2\2\u0091"+
		"\u0092\7\60\2\2\u0092\4\3\2\2\2\u0093\u0094\7]\2\2\u0094\6\3\2\2\2\u0095"+
		"\u0096\7_\2\2\u0096\b\3\2\2\2\u0097\u0098\7=\2\2\u0098\n\3\2\2\2\u0099"+
		"\u009a\7.\2\2\u009a\f\3\2\2\2\u009b\u009c\7*\2\2\u009c\16\3\2\2\2\u009d"+
		"\u009e\7+\2\2\u009e\20\3\2\2\2\u009f\u00a0\7`\2\2\u00a0\u00a1\7`\2\2\u00a1"+
		"\22\3\2\2\2\u00a2\u00a3\7`\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\5_\60\2\u00a5"+
		"\u00a6\5]/\2\u00a6\u00a7\5\u0081A\2\u00a7\u00a8\5e\63\2\u00a8\26\3\2\2"+
		"\2\u00a9\u00aa\5{>\2\u00aa\u00ab\5\177@\2\u00ab\u00ac\5e\63\2\u00ac\u00ad"+
		"\5g\64\2\u00ad\u00ae\5m\67\2\u00ae\u00af\5\u008bF\2\u00af\30\3\2\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\32\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7"+
		"n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba\34\3\2\2\2\u00bb\u00bd"+
		"\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\17\2\2\u00c1\36\3\2\2"+
		"\2\u00c2\u00c6\7%\2\2\u00c3\u00c5\n\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\b\20\2\2\u00ca \3\2\2\2\u00cb\u00cc\7B\2\2"+
		"\u00cc\u00cd\7d\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7z\2\2\u00d8$\3\2\2\2\u00d9\u00e0\7}\2\2\u00da\u00df\n\4\2\2\u00db"+
		"\u00dc\7^\2\2\u00dc\u00df\t\4\2\2\u00dd\u00df\5G$\2\u00de\u00da\3\2\2"+
		"\2\u00de\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\'\2\2\u00e4\u00e5\7\177\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7(\3\2\2\2\u00e8\u00ed\7>\2\2\u00e9\u00ec\n\5\2\2\u00ea\u00ec\5G"+
		"$\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7@\2\2\u00f1*\3\2\2\2\u00f2\u00f4\5Q)\2\u00f3\u00f2\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6"+
		",\3\2\2\2\u00f7\u00f8\5+\26\2\u00f8\u00f9\5S*\2\u00f9.\3\2\2\2\u00fa\u00ff"+
		"\7\61\2\2\u00fb\u0100\n\6\2\2\u00fc\u00fd\7^\2\2\u00fd\u0100\t\7\2\2\u00fe"+
		"\u0100\5G$\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fe\3\2\2"+
		"\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\7\61\2\2\u0104\60\3\2\2\2\u0105\u0107\t\b\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\62\3\2\2\2\u010a\u010b\7a\2\2\u010b\u010c\7<\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u0110\5M\'\2\u010e\u0110\t\t\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0119\3\2\2\2\u0111\u0114\5O(\2\u0112\u0114\7\60"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011a\5O(\2\u0119\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a\64"+
		"\3\2\2\2\u011b\u011d\7B\2\2\u011c\u011e\t\n\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0129\3\2"+
		"\2\2\u0121\u0123\7/\2\2\u0122\u0124\t\13\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"+
		"\2\2\u0127\u0121\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\66\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\t\f\2"+
		"\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131"+
		"\t\t\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u01338\3\2\2\2\u0134\u0136\t\f\2\2\u0135\u0134\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u013a\3\2\2\2\u0137\u0139\t\t\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\7\60\2\2\u013e\u0140\t"+
		"\t\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142:\3\2\2\2\u0143\u0145\t\f\2\2\u0144\u0143\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u015c\3\2\2\2\u0146\u0148\t\t\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014f\7\60\2\2\u014c\u014e\t\t\2\2\u014d\u014c\3"+
		"\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u015d\5=\37\2\u0153\u0155\7\60"+
		"\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0158\t\t\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5=\37\2\u015c"+
		"\u0147\3\2\2\2\u015c\u0154\3\2\2\2\u015d<\3\2\2\2\u015e\u0160\t\r\2\2"+
		"\u015f\u0161\t\f\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u0164\t\t\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166>\3\2\2\2\u0167\u016d\7)\2\2\u0168"+
		"\u016c\n\16\2\2\u0169\u016c\5I%\2\u016a\u016c\5G$\2\u016b\u0168\3\2\2"+
		"\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0171\7)\2\2\u0171@\3\2\2\2\u0172\u0178\7$\2\2\u0173\u0177\n\17\2\2\u0174"+
		"\u0177\5I%\2\u0175\u0177\5G$\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2"+
		"\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7$\2\2\u017c"+
		"B\3\2\2\2\u017d\u017e\7)\2\2\u017e\u017f\7)\2\2\u017f\u0180\7)\2\2\u0180"+
		"\u018d\3\2\2\2\u0181\u0185\7)\2\2\u0182\u0183\7)\2\2\u0183\u0185\7)\2"+
		"\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189"+
		"\3\2\2\2\u0186\u018a\n\20\2\2\u0187\u018a\5I%\2\u0188\u018a\5G$\2\u0189"+
		"\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0184\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7)"+
		"\2\2\u0191\u0192\7)\2\2\u0192\u0193\7)\2\2\u0193D\3\2\2\2\u0194\u0195"+
		"\7$\2\2\u0195\u0196\7$\2\2\u0196\u0197\7$\2\2\u0197\u01a4\3\2\2\2\u0198"+
		"\u019c\7$\2\2\u0199\u019a\7$\2\2\u019a\u019c\7$\2\2\u019b\u0198\3\2\2"+
		"\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a0\3\2\2\2\u019d\u01a1"+
		"\n\21\2\2\u019e\u01a1\5I%\2\u019f\u01a1\5G$\2\u01a0\u019d\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019b\3\2"+
		"\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7$\2\2\u01a8\u01a9\7$\2"+
		"\2\u01a9\u01aa\7$\2\2\u01aaF\3\2\2\2\u01ab\u01ac\7^\2\2\u01ac\u01ad\7"+
		"w\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5Y-\2\u01af\u01b0\5Y-\2\u01b0\u01b1"+
		"\5Y-\2\u01b1\u01b2\5Y-\2\u01b2\u01c0\3\2\2\2\u01b3\u01b4\7^\2\2\u01b4"+
		"\u01b5\7W\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5Y-\2\u01b7\u01b8\5Y-\2"+
		"\u01b8\u01b9\5Y-\2\u01b9\u01ba\5Y-\2\u01ba\u01bb\5Y-\2\u01bb\u01bc\5Y"+
		"-\2\u01bc\u01bd\5Y-\2\u01bd\u01be\5Y-\2\u01be\u01c0\3\2\2\2\u01bf\u01ab"+
		"\3\2\2\2\u01bf\u01b3\3\2\2\2\u01c0H\3\2\2\2\u01c1\u01c2\7^\2\2\u01c2\u01c3"+
		"\t\22\2\2\u01c3J\3\2\2\2\u01c4\u01c6\t\23\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"L\3\2\2\2\u01c7\u01ca\5K&\2\u01c8\u01ca\7a\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01caN\3\2\2\2\u01cb\u01ce\5M\'\2\u01cc\u01ce\t\24\2\2"+
		"\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceP\3\2\2\2\u01cf\u01d8\5"+
		"K&\2\u01d0\u01d3\5O(\2\u01d1\u01d3\7\60\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d9\5O(\2\u01d8\u01d4"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9R\3\2\2\2\u01da\u01de\5M\'\2\u01db\u01de"+
		"\4\62<\2\u01dc\u01de\5U+\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01ec\3\2\2\2\u01df\u01e3\5O(\2\u01e0\u01e3\t\25"+
		"\2\2\u01e1\u01e3\5U+\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01ea\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01eb\5O(\2\u01e8\u01eb\7<\2"+
		"\2\u01e9\u01eb\5U+\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"T\3\2\2\2\u01ee\u01f1\5W,\2\u01ef\u01f1\5[.\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1V\3\2\2\2\u01f2\u01f3\7\'\2\2\u01f3\u01f4\5Y-\2\u01f4"+
		"\u01f5\5Y-\2\u01f5X\3\2\2\2\u01f6\u01f8\t\26\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"Z\3\2\2\2\u01f9\u01fa\7^\2\2\u01fa\u01fb\t\27\2\2\u01fb\\\3\2\2\2\u01fc"+
		"\u01fd\t\30\2\2\u01fd^\3\2\2\2\u01fe\u01ff\t\31\2\2\u01ff`\3\2\2\2\u0200"+
		"\u0201\t\32\2\2\u0201b\3\2\2\2\u0202\u0203\t\33\2\2\u0203d\3\2\2\2\u0204"+
		"\u0205\t\r\2\2\u0205f\3\2\2\2\u0206\u0207\t\34\2\2\u0207h\3\2\2\2\u0208"+
		"\u0209\t\35\2\2\u0209j\3\2\2\2\u020a\u020b\t\36\2\2\u020bl\3\2\2\2\u020c"+
		"\u020d\t\37\2\2\u020dn\3\2\2\2\u020e\u020f\t \2\2\u020fp\3\2\2\2\u0210"+
		"\u0211\t!\2\2\u0211r\3\2\2\2\u0212\u0213\t\"\2\2\u0213t\3\2\2\2\u0214"+
		"\u0215\t#\2\2\u0215v\3\2\2\2\u0216\u0217\t$\2\2\u0217x\3\2\2\2\u0218\u0219"+
		"\t%\2\2\u0219z\3\2\2\2\u021a\u021b\t&\2\2\u021b|\3\2\2\2\u021c\u021d\t"+
		"\'\2\2\u021d~\3\2\2\2\u021e\u021f\t(\2\2\u021f\u0080\3\2\2\2\u0220\u0221"+
		"\t)\2\2\u0221\u0082\3\2\2\2\u0222\u0223\t*\2\2\u0223\u0084\3\2\2\2\u0224"+
		"\u0225\t+\2\2\u0225\u0086\3\2\2\2\u0226\u0227\t,\2\2\u0227\u0088\3\2\2"+
		"\2\u0228\u0229\t-\2\2\u0229\u008a\3\2\2\2\u022a\u022b\t.\2\2\u022b\u008c"+
		"\3\2\2\2\u022c\u022d\t/\2\2\u022d\u008e\3\2\2\2\u022e\u022f\t\60\2\2\u022f"+
		"\u0090\3\2\2\29\2\u00be\u00c6\u00de\u00e0\u00eb\u00ed\u00f3\u00ff\u0101"+
		"\u0108\u010f\u0113\u0115\u0119\u011f\u0125\u0129\u012d\u0132\u0135\u013a"+
		"\u0141\u0144\u0149\u014f\u0154\u0159\u015c\u0160\u0165\u016b\u016d\u0176"+
		"\u0178\u0184\u0189\u018d\u019b\u01a0\u01a4\u01bf\u01c5\u01c9\u01cd\u01d2"+
		"\u01d4\u01d8\u01dd\u01e2\u01e4\u01ea\u01ec\u01f0\u01f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
