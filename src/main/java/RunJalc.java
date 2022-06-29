import Evaluate.Evaluate;
import antlr.JalcLexer;
import antlr.JalcParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class RunJalc {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello World");
        JalcLexer lexer = new JalcLexer(CharStreams.fromStream(System.in));
        JalcParser parser = new JalcParser(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Evaluate(), parseTree);
    }
}
