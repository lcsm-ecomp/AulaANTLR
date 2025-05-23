import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromString(args[0]);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ExprParser.ExprContext tree = parser.expr();
        if (parser.getNumberOfSyntaxErrors()!=0) {
            System.err.println("Erro de compilação");
            System.exit(1);
        }
        System.out.println(tree.toStringTree(parser));
        imprime(tree,"");
        System.out.printf("valor = %d\n",avalieExpressao(tree));
    }
    static int avalieExpressao(ExprParser.ExprContext exp) {
        if (exp.INT()!=null) {
            return Integer.parseInt(exp.getText());
        }
        if (exp.PLUS()!=null) {
            return avalieExpressao(exp.expr(0)) + avalieExpressao(exp.expr(1));
        }
        if (exp.MUL()!=null) {
            return avalieExpressao(exp.expr(0)) * avalieExpressao(exp.expr(1));
        }
        throw new RuntimeException("Nao sei como avaliar: " + exp.getText());
    }
    static void imprime(ParseTree t,String identacao) {
        if (t instanceof TerminalNode) {
            System.out.printf("%sTerminal: %s\n" , identacao,t.getText());
            return;
        }
        int nFilhos = t.getChildCount();
        System.out.printf("%sNão terminal Texto: %s com %d filhos\n" , identacao,t.getText(),nFilhos);
        for (int c=0;c<nFilhos;c++) {
            imprime(t.getChild(c), identacao+"|  ");
            //System.out.printf("Filho %d = %s\n",c, t.getChild(c).getText());
        }
        
    }
}
