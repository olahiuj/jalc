// Generated from /home/jjppp/Code/Project/jalc/src/main/antlr/Jalc.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JalcParser}.
 */
public interface JalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JalcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JalcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JalcParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JalcParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JalcParser.ExprContext ctx);
}