// ANTLR4 Equivalent of accompanying bnf, developed in
// http://www.w3.org/2005/01/yacker/uploads/ShEx3
// Updated to Jul 27 AM ShEx3
// Updated to Aug 23 AM ShEx3 (last change was EGP 20150820)
// Sept 21 AM disallow single internal unary (e.g. {(:p .{2}){3}}
//            Change (non-standard) "codeLabel" to "productionName"
// Oct 26 - change annotation predicate to include rdftype (how did this slip in to the production rules?
// Dec 30 - update to match http://www.w3.org/2005/01/yacker/uploads/ShEx2/bnf with last change "EGP 20151120"
// May 23, 2016 - Update to match http://www.w3.org/2005/01/yacker/uploads/ShEx2/bnf with last change "EGP20160520" AND ';' separator and '//' for annotations
// May 24, 2016 - EGP20150424
// Aug 11, 2016 - EGP20160708
// Sep 14, 2016 - Revised to match Eric's latest reshuffle
// Sep 24, 2016 - Switched to TT grammar (vs inner and outer shapes)
// Sep 26, 2016 - Refactored to match https://raw.githubusercontent.com/shexSpec/shex.js/7eb770fe2b5bab9edfe9558dc07bb6f6dcdf5d23/doc/bnf
// Oct 27, 2016 - Added comments to '*', '*' and '?' to facilitate parsing
// Oct 27, 2016 - Added qualifier rule to be reused by shapeDefinition and inlineShapeDefinition
// Oct 27, 2016 - Added negation rule
// Mar 03, 2017 - removed ^^-style facet arguments per shex#41
// Mar 03, 2017 - switch to ~/regexp/
// Apr 09, 2017 - removed WS fragment (unused)
// Apr 09, 2017 - revise REGEXP definition
// Apr 09, 2017 - factor out REGEXP_FLAGS so we don't have to parse them out
// Apr 09, 2017 - literalRange / languageRange additions
// Apr 09, 2017 - factor out shapeRef to match spec
// Apr 09, 2017 - update repeatRange to allow differentiation of {INTEGER} and {INTEGER,}
// Apr 09, 2017 - add STEM_MARK and UNBOUNDED tokens to eliminate lex token parsing


grammar Turtle;

start 		    : (directive)* ( triples*)? EOF;  // leading CODE
directive       : baseDecl
				| prefixDecl 
				;
baseDecl 		: baseSparql | base  ;			
baseSparql 		: KW_BASE  IRIREF 
				;
base 		    : BASE  IRIREF '.' 
				| BASE  IRIREF {notifyErrorListeners(" Missing '.' at the end of Base directive");}
				| BASE {notifyErrorListeners(" Missing IRI after '@base'");}
				;
prefixDecl		: prefixSparql | prefix ;
prefix		    : PREFIX PNAME_NS IRIREF '.' 
				| PREFIX PNAME_NS IRIREF {notifyErrorListeners(" Missing '.' at the end of Prefix directive");}
				;
prefixSparql	: KW_PREFIX PNAME_NS IRIREF {System.out.println("\nNS "+$PNAME_NS.text+"IRI "+$IRIREF.text);};
triples 		:  	subject predicateObjectList '.';
subject         :  	iri | blank ;
blank	        : 	blankNode | blankNodePropertyList | collection ;
blankNodePropertyList	   :   	'[' predicateObjectList ']' ;
predicateObjectList	   :   	predicate objectList ( ';' predicate objectList )* (';')? ;
objectList	   :   	object ( ',' object )* ;
object	   :   	iri | blank | literal ;
collection	   :   	'(' object* ')' ;

literal         : rdfLiteral
				| numericLiteral
				| booleanLiteral
				;
// BNF: predicate ::= iri | RDF_TYPE
predicate       : iri
				| rdfType
				;
rdfType			: RDF_TYPE ;
datatype        : iri ;

numericLiteral  : INTEGER
				| DECIMAL
				| DOUBLE
				;
rdfLiteral      : string (LANGTAG | '^^' datatype)?
				| string (LANGTAG | '^' datatype)? {notifyErrorListeners("Missing '^' Character");}
			   ;
booleanLiteral  : KW_TRUE
				| KW_FALSE
				;
string          : STRING_LITERAL_LONG1
                | STRING_LITERAL_LONG2
                | STRING_LITERAL1
				| STRING_LITERAL2
				;
iri             : IRIREF
				| prefixedName
				;
prefixedName    : PNAME_LN
				| PNAME_NS
				;
blankNode       : BLANK_NODE_LABEL ;


// Reserved for future use


// Keywords
KW_BASE 			: B A S E ;
KW_PREFIX       	: P R E F I X  ;
KW_TRUE         	: 'true' ;
KW_FALSE        	: 'false' ;

// terminals
PASS				  : [ \t\r\n]+ -> skip;
COMMENT				  : '#' ~[\r\n]* -> skip;

BASE				  : '@base' ;
PREFIX				  : '@prefix' ;
CODE                  : '{' (~[%\\] | '\\' [%\\] | UCHAR)* '%' '}' ;
RDF_TYPE              : 'a' ;
IRIREF                : '<' (~[\u0000-\u0020=<>"{}|^`\\] | UCHAR)* '>' ; /* #x00=NULL #01-#x1F=control codes #x20=space */
PNAME_NS			  : PN_PREFIX? ':' ;
PNAME_LN			  : PNAME_NS PN_LOCAL ;
REGEXP                : '/' (~[/\n\r\\] | '\\' [/nrt\\|.?*+(){}[\]$^-] | UCHAR)+ '/' ;
REGEXP_FLAGS		  : [smix]+ ;
BLANK_NODE_LABEL      : '_:' (PN_CHARS_U | [0-9]) ((PN_CHARS | '.')* PN_CHARS)? ;
LANGTAG               : '@' [a-zA-Z]+ ('-' [a-zA-Z0-9]+)* ;
INTEGER               : [+-]? [0-9]+ ;
DECIMAL               : [+-]? [0-9]* '.' [0-9]+ ;
DOUBLE                : [+-]? ([0-9]+ '.' [0-9]* EXPONENT | '.'? [0-9]+ EXPONENT) ;

fragment EXPONENT     : [eE] [+-]? [0-9]+ ;

STRING_LITERAL1       : '\'' (~[\u0027\u005C\u000A\u000D] | ECHAR | UCHAR)* '\'' ; /* #x27=' #x5C=\ #xA=new line #xD=carriage return */
STRING_LITERAL2       : '"' (~[\u0022\u005C\u000A\u000D] | ECHAR | UCHAR)* '"' ;   /* #x22=" #x5C=\ #xA=new line #xD=carriage return */
STRING_LITERAL_LONG1  : '\'\'\'' (('\'' | '\'\'')? (~['\\] | ECHAR | UCHAR))* '\'\'\'' ;
STRING_LITERAL_LONG2  : '"""' (('"' | '""')? (~["\\] | ECHAR | UCHAR))* '"""' ;

fragment UCHAR                 : '\\u' HEX HEX HEX HEX | '\\U' HEX HEX HEX HEX HEX HEX HEX HEX ;
fragment ECHAR                 : '\\' [tbnrf\\"'] ;

fragment PN_CHARS_BASE 		   : [A-Z] | [a-z] | [\u00C0-\u00D6] | [\u00D8-\u00F6] | [\u00F8-\u02FF] | [\u0370-\u037D]
					   		   | [\u037F-\u1FFF] | [\u200C-\u200D] | [\u2070-\u218F] | [\u2C00-\u2FEF] | [\u3001-\uD7FF]
					           | [\uF900-\uFDCF] | [\uFDF0-\uFFFD]
					   		   ;
fragment PN_CHARS_U            : PN_CHARS_BASE | '_' ;
fragment PN_CHARS              : PN_CHARS_U | '-' | [0-9] | [\u00B7] | [\u0300-\u036F] | [\u203F-\u2040] ;
fragment PN_PREFIX             : PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)? ;
fragment PN_LOCAL              : (PN_CHARS_U | ':' | [0-9] | PLX) ((PN_CHARS | '.' | ':' | PLX)* (PN_CHARS | ':' | PLX))? ;
fragment PLX                   : PERCENT | PN_LOCAL_ESC ;
fragment PERCENT               : '%' HEX HEX ;
fragment HEX                   : [0-9] | [A-F] | [a-f] ;
fragment PN_LOCAL_ESC          : '\\' ('_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ','
					  		   | ';' | '=' | '/' | '?' | '#' | '@' | '%') ;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');