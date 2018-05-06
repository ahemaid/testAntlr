// Generated from Turtle.g4 by ANTLR 4.4
package antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TurtleParser}.
 */
public interface TurtleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TurtleParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(@NotNull TurtleParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(@NotNull TurtleParser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#blank}.
	 * @param ctx the parse tree
	 */
	void enterBlank(@NotNull TurtleParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#blank}.
	 * @param ctx the parse tree
	 */
	void exitBlank(@NotNull TurtleParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull TurtleParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull TurtleParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(@NotNull TurtleParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(@NotNull TurtleParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull TurtleParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull TurtleParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void enterBaseDecl(@NotNull TurtleParser.BaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void exitBaseDecl(@NotNull TurtleParser.BaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(@NotNull TurtleParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(@NotNull TurtleParser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDecl(@NotNull TurtleParser.PrefixDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDecl(@NotNull TurtleParser.PrefixDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TurtleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TurtleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull TurtleParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull TurtleParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(@NotNull TurtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(@NotNull TurtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#prefixSparql}.
	 * @param ctx the parse tree
	 */
	void enterPrefixSparql(@NotNull TurtleParser.PrefixSparqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#prefixSparql}.
	 * @param ctx the parse tree
	 */
	void exitPrefixSparql(@NotNull TurtleParser.PrefixSparqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull TurtleParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull TurtleParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#baseSparql}.
	 * @param ctx the parse tree
	 */
	void enterBaseSparql(@NotNull TurtleParser.BaseSparqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#baseSparql}.
	 * @param ctx the parse tree
	 */
	void exitBaseSparql(@NotNull TurtleParser.BaseSparqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(@NotNull TurtleParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(@NotNull TurtleParser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(@NotNull TurtleParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(@NotNull TurtleParser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull TurtleParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull TurtleParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull TurtleParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull TurtleParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(@NotNull TurtleParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(@NotNull TurtleParser.BlankNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(@NotNull TurtleParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(@NotNull TurtleParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull TurtleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull TurtleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(@NotNull TurtleParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(@NotNull TurtleParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(@NotNull TurtleParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(@NotNull TurtleParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull TurtleParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull TurtleParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#errors}.
	 * @param ctx the parse tree
	 */
	void enterErrors(@NotNull TurtleParser.ErrorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#errors}.
	 * @param ctx the parse tree
	 */
	void exitErrors(@NotNull TurtleParser.ErrorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#rdfType}.
	 * @param ctx the parse tree
	 */
	void enterRdfType(@NotNull TurtleParser.RdfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#rdfType}.
	 * @param ctx the parse tree
	 */
	void exitRdfType(@NotNull TurtleParser.RdfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(@NotNull TurtleParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(@NotNull TurtleParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TurtleParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull TurtleParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TurtleParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull TurtleParser.ObjectContext ctx);
}