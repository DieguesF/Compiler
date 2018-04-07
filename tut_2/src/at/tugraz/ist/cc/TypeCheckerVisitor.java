package at.tugraz.ist.cc;

import java.util.HashMap;
import java.util.Map;

import at.tugraz.ist.cc.antlr.gen.CalculatorBaseVisitor;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.AddExprContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.AssignmentContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.DeclContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.IdContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.IntLitContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.MulExprContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.ProgramContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.StrLitContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.TypeContext;

//information sharing among nodes:
//1. native java call stack (used in this tutorial)
//2. stack based (e.g. add a stack as member to the visitor class)
//3. annotator (provided by ANTLR)
//for more information see "The Definitive ANTLR 4 Reference" - 7.5 "Sharing
//Information Among Event Methods" p.121

// we have added some additional code to "complete" tut2. 
// the respective passages are marked by comments.

public class TypeCheckerVisitor extends CalculatorBaseVisitor<Integer> {

	// for the actual task 2 another representation of types might be a
	// good idea!
	private static final int TYPE_INT = 1;
	private static final int TYPE_STR = 2;
	private static final int TYPE_ERR = -1;

	// symbol table
	private Map<String, Integer> st = new HashMap<>();

	@Override
	public Integer visitProgram(ProgramContext ctx) {
		System.out.println("walking tree");
		visitChildren(ctx);
		System.out.println("done");
		return 0;
	}

	@Override
	public Integer visitDecl(DeclContext ctx) {
		Integer type = visit(ctx.type());
		String id = ctx.ID().getText();
		int line = ctx.ID().getSymbol().getLine();

		// added to complete code for tut2
		if (st.containsKey(id)) {
			System.out.println("ERROR (line " + line + "): double def. of var " + id);
			return TYPE_ERR;
		} else
			st.put(id, type);

		return 0;
	}

	@Override
	public Integer visitType(TypeContext ctx) {

		if (ctx.KEY_INT() != null)
			return TYPE_INT;
		else if (ctx.KEY_STR() != null)
			return TYPE_STR;

		return TYPE_ERR;
	}

	@Override
	public Integer visitAssignment(AssignmentContext ctx) {

		String lhs = ctx.ID().getText();
		Integer lhs_type = st.get(lhs);
		if (lhs_type == null) {
			System.out.println("ERROR: Undeclared var. " + lhs);
			return 0;
		}

		// added to complete code for tut2
		if (lhs_type == TYPE_ERR)
			return 0;

		Integer rhs_type = visit(ctx.expr());
		if (rhs_type == TYPE_ERR)
			return 0;

		if (rhs_type != lhs_type)
			System.out.println("ERROR: Mismatched type for op. =");

		return 0;
	}

	@Override
	public Integer visitIntLit(IntLitContext ctx) {
		return TYPE_INT;
	}

	@Override
	public Integer visitStrLit(StrLitContext ctx) {
		return TYPE_STR;
	}

	// added to complete code for tut2
	@Override
	public Integer visitId(IdContext ctx) {
		String id = ctx.getText();
		Integer type = st.get(id);

		if (type == null) {
			System.out.println("ERROR: Undeclared var. " + id);
			return TYPE_ERR;
		}
		return type;
	}

	@Override
	public Integer visitAddExpr(AddExprContext ctx) {
		Integer lhs_type = visit(ctx.lhs);
		Integer rhs_type = visit(ctx.rhs);

		// added to complete code for tut2
		// added to prevent "after effect" of previous errors
		if (lhs_type == TYPE_ERR || rhs_type == TYPE_ERR)
			return TYPE_ERR;

		if (lhs_type != TYPE_INT || rhs_type != TYPE_INT) {
			System.out.println("ERROR: Mismatched types for op. +");
			return TYPE_ERR;
		}

		return TYPE_INT;
	}

	// added to complete code for tut2
	@Override
	public Integer visitMulExpr(MulExprContext ctx) {
		Integer lhs_type = visit(ctx.lhs);
		Integer rhs_type = visit(ctx.rhs);

		if (lhs_type == TYPE_ERR || rhs_type == TYPE_ERR)
			return TYPE_ERR;

		if (lhs_type != TYPE_INT || rhs_type != TYPE_INT) {
			System.out.println("ERROR: Mismatched types for op. *");
			return TYPE_ERR;
		}

		return TYPE_INT;
	}
}
