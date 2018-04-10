
package at.tugraz.ist.cc;

import org.antlr.v4.runtime.tree.ParseTreeProperty;;

import at.tugraz.ist.cc.antlr.gen.CalculatorBaseVisitor;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.DeclContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.ProgramContext;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser.TypeContext;

public class TypeCheckerVisitor extends CalculatorBaseVisitor<Integer>{

  private static final int TYPE_INT = 1;
  private static final int TYPE_STR = 2;
  private static final int TYPE_ERR = -1;

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

    if (st.put(id, type) != null){
      System.out.println("Error (line "+ line + "): double");
    }
  }

  @Override
  public Integer visitType(TypeContext ctc){
    if (ctx.KEY_INT() != null){
      return TYPE_INT;
    }
    else if (ctx.KEY_STR() != null){
      return TYPE_STR;
    }
    return TYPE_ERR;
  }

  @Override
  public Integer visitAssignment(AssignmentContext ctx){
    String lhs = ctx.ID().getText();
    Integer lhs_type = st.get(lhs);

    if (lhs_type == null){
      System.out.println("ERRPR: Undeclared variable");
      return 0;
    }

    Integer rhs_type = visit(ctx.expr());
    if (rhs_type == TYPE_ERR){
      return 0;
    }

    if (rhs_type != lhs_type){
      System.out.println("ERROR: Missmatched");
    }
    return 0;
  }

  @Override
  public Integer visitIntLit(IntLitContext ctx){
    return TYPE_INT;
  }

  @Override
  public Integer visitStrLit(StrLitContext ctx){
    return TYPE_STR;
  }

  @Override
  public Integer visitAddExpr(AddExprContext ctx){
    Integer lhs_type = visit(ctx.lhs);
    Integer rhs_type = visit(ctx.rhs);
    if (lhs_type != TYPE_INT || rhs_type != TYPE_INT){
      System.out.println("ERROR: Missmatched types for op. +");
      return TYPE_ERR;
    }
    return TYPE_INT;
  }
}