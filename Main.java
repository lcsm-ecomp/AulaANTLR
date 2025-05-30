import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromString(args[0]);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ExprParser.ProgramaContext tree = parser.programa();
        if (parser.getNumberOfSyntaxErrors()!=0) {
            System.err.println("Erro de compilação");
            System.exit(1);
        }
        //System.out.println(tree.toStringTree(parser));
        //imprime(tree,"");
        //for (X=0;X<=10;X++) {
        executeComando(tree.com());
        //}
    }
    static int X = 0;
    static void executeComando(ExprParser.ComContext com) {
        if (com.PRINT()!=null) {
            int result = avalieExpressao(com.expr());
            System.out.printf("print %d\n",result);
            return;
        }
        if (com.ACHA()!=null) {
            for (var c : com.com()) {
                executeComando(c);
            }
            return ;
        }
        if (com.EQ()!=null) {
            int valor = avalieExpressao(com.expr());
            X = valor;
            System.out.printf("X foi modificado para %d\n",valor);
            return;
        }
        if (com.WHILE()!=null) {
            var teste = com.expr();
            var rept = com.com(0);
            System.out.println("Iniciando loop");
            int valor = avalieExpressao(teste);
            while (valor!=0) {
                executeComando(rept);
                valor = avalieExpressao(teste);
            }
            System.out.println("Fim do loop");
            return;
        }
        if (com.IF()!=null) {
            var teste = com.expr();
            var cTRUE = com.com(0);
            var cFALSE = com.com(1);
            int valor = avalieExpressao(teste);
            if (valor!=0)
               executeComando(cTRUE);
            else
               executeComando(cFALSE);
            return;
        }
        throw new RuntimeException("Nao sei como executar: " + com.getText());

    }
    static int avalieExpressao(ExprParser.ExprContext exp) {
        if (exp.INT()!=null) {
            int constante = Integer.parseInt(exp.INT().getText());
            if (exp.expr(0)!=null) {
                return constante*avalieExpressao(exp.expr(0));
            }
            return constante;
        }
        if (exp.X()!=null) {
            return X;
        }
        if (exp.POT()!=null) {
            return (int)Math.pow(avalieExpressao(exp.expr(0)),avalieExpressao(exp.expr(1)));
        }
        if (exp.PLUS()!=null) {
            return avalieExpressao(exp.expr(0)) + avalieExpressao(exp.expr(1));
        }
        if (exp.MUL()!=null) {
            return avalieExpressao(exp.expr(0)) * avalieExpressao(exp.expr(1));
        }
        if (exp.MINUS()!=null) {
            return avalieExpressao(exp.expr(0)) - avalieExpressao(exp.expr(1));
        }
        if (exp.DIV()!=null) {
            int esq = avalieExpressao(exp.expr(0));
            int dir = avalieExpressao(exp.expr(1));
            if (dir==0) throw new RuntimeException("Divisao por zero");
            return  esq / dir ;
        }
        if (exp.APAR()!=null) {
            return avalieExpressao(exp.expr(0));
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
