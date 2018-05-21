/*
 [The "BSD licence"]
 Copyright (c) 2014, Alejandro Medrano (@ Universidad Politecnica de Madrid, http://www.upm.es/)
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
*/
/* Derived from http://www.w3.org/TR/turtle/#sec-grammar-grammar */

grammar Turtle;

start
   : statement*
   ;

statement
   : directive
   | triples '.'
   | triples {notifyErrorListeners("Missing '.' at the end of the triple");}
   | errors		
   
   ;

directive
   : prefixID
   | base
   | sparqlPrefix
   | sparqlBase
   | unkonwnDecl
   | sparqlPrefix '.' {notifyErrorListeners("Extraneous '.' at the end of SPARQL prefix directive");}
   | sparqlBase '.' {notifyErrorListeners("Extraneous '.' at the end of SPARQL base directive");}
   ;
   
errors	
 	: iri '=' iri '.' {notifyErrorListeners("'=' sign cannot be used in Turtle");}
 	| iri '<=' iri '.'  {notifyErrorListeners("'<=' symbol cannot be used in Turtle");}
    | iri '=>' iri '.'  {notifyErrorListeners("'=>' symbol cannot be used in Turtle");}
//TODO
// 	| BAD_PNAME_LN_ENDS_WITH_DOT BAD_PNAME_LN_ENDS_WITH_DOT  BAD_PNAME_LN_ENDS_WITH_DOT  {notifyErrorListeners("'IRI' as a Subject or a Predicate cannot be followed by '.' in Turtle");}
 	| (iri '.')+ (iri '.')+  triples '.' {notifyErrorListeners("N3 paths cannot be used in Turtle");}
    | (iri '.')+ (iri '.')+  triples  {notifyErrorListeners("N3 paths cannot be used in Turtle");}
    | '@forAll' iri '.' {notifyErrorListeners(" '@forAll' cannot be used in Turtle ");}
    | '@forSome' iri '.' {notifyErrorListeners(" '@forSome' cannot be used in Turtle ");}
    | ('a'|CHARS)* '@a' ('a'|CHARS)* '.' {notifyErrorListeners(" '@a' cannot be used in Turtle ");}
    ;
   
 unkonwnDecl 	:
 	'@keywords' ('a'|CHARS)*  '.' {notifyErrorListeners("@keywords is unkown directive in Turtle");}
	;	

prefixID
   :
     '@prefix' CHARS '.' ':' IRIREF '.' {notifyErrorListeners("Prefix Namespace cannot end with '.' ");}
   | '@prefix' '.' CHARS ':' IRIREF '.' {notifyErrorListeners("Prefix Namespace cannot start with '.' ");}
   | '@prefix' ':' IRIREF '.' 
   | '@prefix' PNAME_NS IRIREF '.' 
   | PNAME_NS IRIREF '.' {notifyErrorListeners("Missing Prefix keyword, use '@prefix'");}
   | '@prefix'   IRIREF '.' {notifyErrorListeners("Missing NameSpace in Prefix directive");}
   | '@prefix' CHARS*  IRIREF '.'  {notifyErrorListeners("Missing ':' in Prefix directive");}
   ;
   
//   | '@prefix' PNAME_NS IRIREF {notifyErrorListeners("Missing '.' at the end of Prefix directive");}
//   | '@prefix' PNAME_NS  '.' {notifyErrorListeners("Missing IRI in Prefix directive");}
//   | '@prefix' PNAME_NS  {notifyErrorListeners("Missing IRI  and dot at Prefix directive");}
  

base
   : '@base' IRIREF '.'
   ;

sparqlBase
   : 'BASE' IRIREF 
   | '@BASE'   IRIREF '.'  {notifyErrorListeners("Uncorrect syntax form of base directive");}
   ;

sparqlPrefix
   : 'PREFIX' CHARS '.' ':' IRIREF  {notifyErrorListeners("Prefix Namespace cannot end with '.' ");}
   | 'PREFIX' '.' CHARS ':' IRIREF  {notifyErrorListeners("Prefix Namespace cannot start with '.' ");}
   | 'PREFIX' PNAME_NS IRIREF
   |  PNAME_NS IRIREF {notifyErrorListeners("Missing Prefix keyword, use 'PREFIX'");}
   | 'PREFIX'   IRIREF  {notifyErrorListeners("Missing NameSpace in Prefix directive");}
   
   ;

triples
   :    
   subject predicateObjectList
   | blankNodePropertyList predicateObjectList?
   ;

predicateObjectList
   : verb objectList (';' (verb objectList)?)*
   ;

objectList
   : object (',' object)*
   ;

verb
   : predicate
   | 'is' predicate 'of' {notifyErrorListeners("'is .. of' pattern is not used in Turtle");}
   | 'a'
   | 'A' {notifyErrorListeners("'A' cannot be used as predicate, it should be repalced with 'a'");}
   | BooleanLiteral {notifyErrorListeners("Predicate cannot be a boolean value");}
   | NumericLiteral  {notifyErrorListeners("Predicate cannot be a number");}
   | literal {notifyErrorListeners("Predicate cannot be a literal");}
   | BlankNode {notifyErrorListeners("Predicate cannot be a blank node");}
   ;

subject
   : iri
   | BlankNode
   | BlankNode  '.' {notifyErrorListeners("Blank Node cannot be followed by '.'");}
   | 'a' {notifyErrorListeners("'a' cannot be used as a subject");}
   | BooleanLiteral {notifyErrorListeners("Subject cannot be a boolean value");}
   | NumericLiteral  {notifyErrorListeners("Subject cannot be a number");}
   | collection
   | '{' triples '.' '}' {notifyErrorListeners("{ } pattern cannot be used in Turtle");}
   | '{' triples '}' {notifyErrorListeners("{ } pattern cannot be used in Turtle");} 
   ;

predicate
   : iri
   ;

object
   : iri
   | BlankNode
   | collection
   | blankNodePropertyList
   | badBlankNodePropertyList  {notifyErrorListeners("Uncorrect form of a blank node list");}
   | literal
   | 'a' {notifyErrorListeners("'a' cannot be used as an object");}
   ;

literal
   : rdfLiteral
   | NumericLiteral
   | BooleanLiteral
   | BadLiteral {notifyErrorListeners("Uncorrect form of a Literal");}
   ;

blankNodePropertyList
   : '[' predicateObjectList ']'
   ;
//TODO: if this only for number or for every object
badBlankNodePropertyList   
	: '[' predicateObjectList '.' ']'
	;
collection
   : '(' object* ')'
   ;


NumericLiteral
   : INTEGER | DECIMAL | DOUBLE
   ;

rdfLiteral
   : String (LANGTAG | '^^' iri)?
   | String  BAD_LANGTAG_AS_NUMBER  {notifyErrorListeners("Language tag cannot be a numeric value");}
   | String '^' iri {notifyErrorListeners("Missing '^' Character");}
   | String LANGTAG '^^' iri {notifyErrorListeners("Uncorrect form of a Literal");}
   | String '^^' iri LANGTAG {notifyErrorListeners("Uncorrect form of a Literal");}
   ;


BooleanLiteral
   : 'true' | 'false'
   ;

BadLiteral 
   : NumericLiteral ('.')+ CHARS 
   | NumericLiteral CHARS 
   ;

String
   : STRING_LITERAL_QUOTE | STRING_LITERAL_SINGLE_QUOTE | STRING_LITERAL_LONG_SINGLE_QUOTE | STRING_LITERAL_LONG_QUOTE
   ;

iri
   : 
   IRIREF 
   | PrefixedName
//ToDO   
// | PNAME_NS  PN_LOCAL_BAD_WITH_DASH {notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot start with dash");}
   | PNAME_NS  BAD_PN_LOCAL_STARTS_WITH_PERCENT {notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot contain '%'");}
//   | PNAME_NS  PN_LOCAL_BAD_WITH_PERCENT {notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot contain '%'");}
   | BAD_PNAME_LN_STARTS_WITH_DOT  {notifyErrorListeners("Uncorrect form of Prefixed Namespace, it cannot start with '.'");} 
   | BAD_PNAME_LN_ENDS_WITH_DOT  {notifyErrorListeners("Uncorrect form of Prefixed Namespace, it cannot end with '.'");} 
   | BAD_IRIREF_WITH_SPACE {notifyErrorListeners("Bas syntax of IRI, IRI cannot contain space or newline");}
   | BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS {notifyErrorListeners("Bas syntax of IRI, Too many angle brackets in IRI");}
   | BAD_IRIREF_WITH_PARENTHESES {notifyErrorListeners("Bas syntax of IRI, IRI cannot contain parentheses");}
   ;


BlankNode
   : BLANK_NODE_LABEL 
   | ANON
   ;
   
CHARS: 
	[a-zA-Z]+ [0-9]*
	;


WS
   : ([\t\r\n\u000C] | ' ') + -> skip
   ;

COMMENT				  
	: '#' ~[\r\n]* -> skip;
// LEXER

PN_PREFIX
   : PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)?
   ;

//IRIREF	        :	'<' (~(['\u0000'..'\u0020']|'<'|'>'|'"'|'{'|'}'|'|'|'^'|'`'|'\\') | UCHAR)* '>'; /* \u00=NULL #01-\u1F=control codes \u20=space */

IRIREF
   : '<' (PN_CHARS | '.' | ':' | '/' | '\\' | '#' | '@' | '%' | '&' | UCHAR)* '>'
   ;


PNAME_NS
   : PN_PREFIX? ':'
   ;


PrefixedName
   : PNAME_LN | PNAME_NS
   ;


PNAME_LN
   : PNAME_NS PN_LOCAL
   ;

BAD_PNAME_LN_STARTS_WITH_DOT	  
	: '.' PN_PREFIX ':' PN_LOCAL 
	;
	
BAD_PNAME_LN_ENDS_WITH_DOT	  
	: PN_PREFIX  '.:' PN_LOCAL 
	;

BLANK_NODE_LABEL
   : '_:' (PN_CHARS_U | [0-9]) ((PN_CHARS | '.')* PN_CHARS)?
   ;


LANGTAG
   : '@' [a-zA-Z] + ('-' [a-zA-Z0-9] +)*
   ;

BAD_LANGTAG_AS_NUMBER
   : '@' [0-9]+
   ;

INTEGER
   : [+-]? [0-9] +
   ;


DECIMAL
   : [+-]? [0-9]* '.' [0-9] +
   ;


DOUBLE
   : [+-]? ([0-9] + '.' [0-9]* EXPONENT | '.' [0-9] + EXPONENT | [0-9] + EXPONENT)
   ;


EXPONENT
   : [eE] [+-]? [0-9] +
   ;


STRING_LITERAL_LONG_SINGLE_QUOTE
   : '\'\'\'' (('\'' | '\'\'')? ([^'\\] | ECHAR | UCHAR | '"'))* '\'\'\''
   ;


STRING_LITERAL_LONG_QUOTE
   : '"""' (('"' | '""')? (~ ["\\] | ECHAR | UCHAR | '\''))* '"""'
   ;


STRING_LITERAL_QUOTE
   : '"' (~ ["\\\r\n] | '\'' | '\\"')* '"'
   ;


STRING_LITERAL_SINGLE_QUOTE
   : '\'' (~ [\u0027\u005C\u000A\u000D] | ECHAR | UCHAR | '"')* '\''
   ;


UCHAR
   : '\\u' HEX HEX HEX HEX | '\\U' HEX HEX HEX HEX HEX HEX HEX HEX
   ;


ECHAR
   : '\\' [tbnrf"'\\]
   ;


ANON_WS
   : ' ' | '\t' | '\r' | '\n'
   ;


ANON
   : '[' ANON_WS* ']'
   ;


PN_CHARS_BASE
   : 'A' .. 'Z' | 'a' .. 'z' | '\u00C0' .. '\u00D6' | '\u00D8' .. '\u00F6' | '\u00F8' .. '\u02FF' | '\u0370' .. '\u037D' | '\u037F' .. '\u1FFF' | '\u200C' .. '\u200D' | '\u2070' .. '\u218F' | '\u2C00' .. '\u2FEF' | '\u3001' .. '\uD7FF' | '\uF900' .. '\uFDCF' | '\uFDF0' .. '\uFFFD'
   ;


PN_CHARS_U
   : PN_CHARS_BASE | '_'
   ;


PN_CHARS
   : PN_CHARS_U | '-' | [0-9] | '\u00B7' | [\u0300-\u036F] | [\u203F-\u2040]
   ;


PN_LOCAL
   : (PN_CHARS_U | ':' | [0-9] | PLX) ((PN_CHARS | '.' | ':' | PLX)* (PN_CHARS | ':' | PLX))?
   ;


BAD_PN_LOCAL_STARTS_WITH_PERCENT
   :   '%' PN_LOCAL
   ;


PLX
   : PERCENT | PN_LOCAL_ESC
   ;


PERCENT
   : '%' HEX HEX
   ;


HEX
   : [0-9] | [A-F] | [a-f]
   ;


PN_LOCAL_ESC
   : '\\' ('_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%')
   ;
   

   
   
   
// check if the IRI has a newline or space  
BAD_IRIREF_WITH_SPACE
 		  :  '<' (PN_CHARS | '.' | ':' | '/' | '\\' | '#' | '@' | '%' | '&' | UCHAR)* '\n>'
		  | '<' (PN_CHARS | '.' | ':' | '/' | '\\' | '#' | '@' | '%' | '&' | UCHAR)* '\u0020>'
		  ;
BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS
		  :'<' (PN_CHARS | '.' | ':' | '/' | '\\' | '#' | '@' | '%' | '&' | UCHAR)* '\u003C>'
		  | '<' (PN_CHARS | '.' | ':' | '/' | '\\' | '#' | '@' | '%' | '&' | UCHAR)* '\u003E>'
		  ;
BAD_IRIREF_WITH_PARENTHESES 
		  : '<' (PN_CHARS | '.' | ':' | '/' | '{'| '}' | '\\' | '#' | '@' | '%' | '&' | UCHAR)* '>'
		  ;
		  
		  
		  