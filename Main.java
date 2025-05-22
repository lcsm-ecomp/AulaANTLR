import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromString(args[0]);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.expr();
        if (parser.getNumberOfSyntaxErrors()==0)
            System.out.println(tree.toStringTree(parser));
        else
            System.err.println("Erro de compilação");
    }
}
