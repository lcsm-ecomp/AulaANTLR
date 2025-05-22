import org.antlr.v4.runtime.tree.ParseTree;

public class Evaluator {

    public int eval(ParseTree tree) {
        if (tree instanceof ExprParser.IntContext ic) {
            return Integer.parseInt(ic.getText());
        }

        if (tree instanceof ExprParser.ParensContext pc) {
            return eval(pc.expr());
        }

        if (tree instanceof ExprParser.AddSubContext ac) {
            int l = eval(ac.expr(0)), r = eval(ac.expr(1));
            return ac.op.getText().equals("+") ? l + r : l - r;
        }

        if (tree instanceof ExprParser.MulDivContext mc) {
            int l = eval(mc.expr(0)), r = eval(mc.expr(1));
            return mc.op.getText().equals("*") ? l * r : l / r;
        }

        throw new RuntimeException("Expressão inválida");
    }
}
