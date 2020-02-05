package hum.ir.ast.element.mfile;

import hum.ir.ast.element.expr.ref.ReadRef;
import hum.ir.ast.element.expr.ref.Reference;
import hum.ir.ast.element.expr.ref.WriteRef;
import hum.ir.ast.element.statement.Statement;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by quepas on 20/04/17.
 */
public class Function extends Unit {

    private ReadRef name;
    private List<ReadRef> output;
    private List<WriteRef> input;

    public Function(List<ReadRef> output, ReadRef name, List<WriteRef> input, List<Statement> statements) {
        super(statements);
        this.output = output;
        this.name = name;
        this.input = input;
    }

    public ReadRef getName() {
        return name;
    }

    public List<ReadRef> getOutput() {
        return output;
    }

    public List<WriteRef> getInput() {
        return input;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("function <if(output)>" +
                "[<output;separator=\", \">] = <endif>" +
                "<name>(<if(input)><input;separator=\", \"><endif>)\n" +
                "\t<statements;separator=\"\n\">\n" +
                "end\n");
        template.add("output", output.stream()
                                            .map(Reference::toPrettyString)
                                            .collect(Collectors.toList()));
        template.add("name", name.toPrettyString());
        template.add("input", input.stream()
                                            .map(Reference::toPrettyString)
                                            .collect(Collectors.toList()));
        template.add("statements", getStatements().stream()
                                            .map(Statement::toPrettyString)
                                            .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitFunction(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterFunction(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitFunction(this);
    }
}
