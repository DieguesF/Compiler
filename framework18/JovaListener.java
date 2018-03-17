// Generated from Jova.g4 by ANTLR 4.5

	package at.tugraz.ist.cc.antlr.gen; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JovaParser}.
 */
public interface JovaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JovaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JovaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JovaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JovaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JovaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_decls}.
	 * @param ctx the parse tree
	 */
	void enterClass_decls(JovaParser.Class_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_decls}.
	 * @param ctx the parse tree
	 */
	void exitClass_decls(JovaParser.Class_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(JovaParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(JovaParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_head}.
	 * @param ctx the parse tree
	 */
	void enterClass_head(JovaParser.Class_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_head}.
	 * @param ctx the parse tree
	 */
	void exitClass_head(JovaParser.Class_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(JovaParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(JovaParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#member_decls}.
	 * @param ctx the parse tree
	 */
	void enterMember_decls(JovaParser.Member_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#member_decls}.
	 * @param ctx the parse tree
	 */
	void exitMember_decls(JovaParser.Member_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#member_decl}.
	 * @param ctx the parse tree
	 */
	void enterMember_decl(JovaParser.Member_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#member_decl}.
	 * @param ctx the parse tree
	 */
	void exitMember_decl(JovaParser.Member_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(JovaParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(JovaParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decls(JovaParser.Method_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decls(JovaParser.Method_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(JovaParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(JovaParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_head}.
	 * @param ctx the parse tree
	 */
	void enterMethod_head(JovaParser.Method_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_head}.
	 * @param ctx the parse tree
	 */
	void exitMethod_head(JovaParser.Method_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(JovaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(JovaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(JovaParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(JovaParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(JovaParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(JovaParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JovaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JovaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JovaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JovaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRet_stmt(JovaParser.Ret_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRet_stmt(JovaParser.Ret_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(JovaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(JovaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(JovaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(JovaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JovaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JovaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(JovaParser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(JovaParser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#object_alloc}.
	 * @param ctx the parse tree
	 */
	void enterObject_alloc(JovaParser.Object_allocContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#object_alloc}.
	 * @param ctx the parse tree
	 */
	void exitObject_alloc(JovaParser.Object_allocContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(JovaParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(JovaParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JovaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JovaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(JovaParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(JovaParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(JovaParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(JovaParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#expr_relop}.
	 * @param ctx the parse tree
	 */
	void enterExpr_relop(JovaParser.Expr_relopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#expr_relop}.
	 * @param ctx the parse tree
	 */
	void exitExpr_relop(JovaParser.Expr_relopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#expr_sign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sign(JovaParser.Expr_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#expr_sign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sign(JovaParser.Expr_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#expr_mulop}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mulop(JovaParser.Expr_mulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#expr_mulop}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mulop(JovaParser.Expr_mulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(JovaParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(JovaParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 */
	void enterId_operand(JovaParser.Id_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 */
	void exitId_operand(JovaParser.Id_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(JovaParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(JovaParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JovaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JovaParser.ArgsContext ctx);
}