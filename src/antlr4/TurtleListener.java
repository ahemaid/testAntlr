package antlr4;
// Generated from Turtle.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TurtleParser}.
 */
public interface TurtleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TurtleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TurtleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TurtleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(TurtleParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(TurtleParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void enterBaseDecl(TurtleParser.BaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void exitBaseDecl(TurtleParser.BaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#baseSparql}.
	 * @param ctx the parse tree
	 */
	void enterBaseSparql(TurtleParser.BaseSparqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#baseSparql}.
	 * @param ctx the parse tree
	 */
	void exitBaseSparql(TurtleParser.BaseSparqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(TurtleParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(TurtleParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDecl(TurtleParser.PrefixDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDecl(TurtleParser.PrefixDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(TurtleParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(TurtleParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefixSparql}.
	 * @param ctx the parse tree
	 */
	void enterPrefixSparql(TurtleParser.PrefixSparqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefixSparql}.
	 * @param ctx the parse tree
	 */
	void exitPrefixSparql(TurtleParser.PrefixSparqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#errors}.
	 * @param ctx the parse tree
	 */
	void enterErrors(TurtleParser.ErrorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#errors}.
	 * @param ctx the parse tree
	 */
	void exitErrors(TurtleParser.ErrorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(TurtleParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(TurtleParser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(TurtleParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(TurtleParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#blank}.
	 * @param ctx the parse tree
	 */
	void enterBlank(TurtleParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#blank}.
	 * @param ctx the parse tree
	 */
	void exitBlank(TurtleParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(TurtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(TurtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(TurtleParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(TurtleParser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(TurtleParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(TurtleParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(TurtleParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(TurtleParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(TurtleParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(TurtleParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TurtleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TurtleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(TurtleParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(TurtleParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#rdfType}.
	 * @param ctx the parse tree
	 */
	void enterRdfType(TurtleParser.RdfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#rdfType}.
	 * @param ctx the parse tree
	 */
	void exitRdfType(TurtleParser.RdfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(TurtleParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(TurtleParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(TurtleParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(TurtleParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(TurtleParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(TurtleParser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(TurtleParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(TurtleParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(TurtleParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(TurtleParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(TurtleParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(TurtleParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(TurtleParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(TurtleParser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(TurtleParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(TurtleParser.BlankNodeContext ctx);
}
