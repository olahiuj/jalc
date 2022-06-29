package Evaluate;

import antlr.JalcBaseListener;
import antlr.JalcParser;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Evaluate extends JalcBaseListener {
    private final Stack<BigInteger> stack = new Stack<>();

    private final Map<String, BigInteger> map = new HashMap<>();

    @Override
    public void exitAssignStmt(JalcParser.AssignStmtContext ctx) {
        String lhs = ctx.asgn().lhs.getText();
        map.put(lhs, stack.pop());
    }

    @Override
    public void exitEvalStmt(JalcParser.EvalStmtContext ctx) {
        System.out.println(stack.pop());
    }

    @Override
    public void exitMulOrDivExpr(JalcParser.MulOrDivExprContext ctx) {
        BigInteger right = stack.pop();
        BigInteger left  = stack.pop();
        String op = ctx.operator.getText();
        if (op.equals("*")) {
            stack.push(left.multiply(right));
        } else if (op.equals("/")) {
            stack.push(left.divide(right));
        }
    }

    @Override
    public void exitAddOrSubExpr(JalcParser.AddOrSubExprContext ctx) {
        BigInteger right = stack.pop();
        BigInteger left  = stack.pop();
        String op = ctx.operator.getText();
        if (op.equals("+")) {
            stack.push(left.add(right));
        } else if (op.equals("-")) {
            stack.push(left.subtract(right));
        }
    }

    @Override
    public void exitIdentifier(JalcParser.IdentifierContext ctx) {
        String lhs = ctx.ID().getText();
        stack.push(map.getOrDefault(lhs, BigInteger.ZERO));
    }

    @Override
    public void exitNumber(JalcParser.NumberContext ctx) {
        stack.push(BigInteger.valueOf(Integer.parseInt(ctx.getText())));
    }
}
