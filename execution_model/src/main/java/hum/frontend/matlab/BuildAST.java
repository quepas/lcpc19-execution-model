package hum.frontend.matlab;

import com.google.common.collect.Lists;
import hum.frontend.matlab.parser.matlabBaseVisitor;
import hum.frontend.matlab.parser.matlabLexer;
import hum.frontend.matlab.parser.matlabParser;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.*;
import hum.ir.ast.element.expr.literal.Cell;
import hum.ir.ast.element.expr.literal.Matrix;
import hum.ir.ast.element.expr.literal.Numeric;
import hum.ir.ast.element.expr.literal.String;
import hum.ir.ast.element.expr.op.arithmetic.*;
import hum.ir.ast.element.expr.op.comparison.*;
import hum.ir.ast.element.expr.op.logical.*;
import hum.ir.ast.element.expr.ref.IndexingType;
import hum.ir.ast.element.expr.ref.ReadRef;
import hum.ir.ast.element.expr.ref.WriteRef;
import hum.ir.ast.element.mfile.Function;
import hum.ir.ast.element.mfile.FunctionFile;
import hum.ir.ast.element.mfile.Script;
import hum.ir.ast.element.statement.*;
import hum.ir.ast.element.statement.conditional.ElseClause;
import hum.ir.ast.element.statement.conditional.ElseIfClause;
import hum.ir.ast.element.statement.conditional.If;
import hum.ir.ast.element.statement.conditional.IfClause;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static hum.frontend.matlab.parser.matlabParser.*;


/**
 * Created by Quepas on 19.04.2017.
 */
public class BuildAST {

    public BuildAST() {
    }

    public static Expression fromStringExpr(java.lang.String code) {
        CharStream charStream = CharStreams.fromString(code);
        matlabLexer lexer = new matlabLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        matlabParser parser = new matlabParser(tokens);
        ParseTree parseTree = parser.expr();
        BuildAST buildAST = new BuildAST();
        return (Expression) buildAST.apply(parseTree);
    }

    public Node apply(ParseTree input) {
        InternalBuildAST buildAST = new InternalBuildAST();
        return buildAST.visit(input);
    }

    private static class InternalBuildAST extends matlabBaseVisitor<Node> {

        private List<Statement> prepareStatements(matlabParser.BodyContext stmtsCtx) {
            List<Statement> stmts = Lists.newArrayList();
            for (matlabParser.StatementContext s : stmtsCtx.statement()) {
                stmts.add((Statement) visit(s));
            }
            return stmts;
        }

        private List<Expression> prepareExpressions(matlabParser.Expr_index_listContext exprsCtx) {
            List<Expression> expressions = Lists.newArrayList();
            if (exprsCtx != null) {
                for (matlabParser.Expr_indexContext expr : exprsCtx.expr_index()) {
                    expressions.add((Expression) visit(expr));
                }
            }
            return expressions;
        }

        /* Build statement AST */
        @Override
        public Node visitStmtGlobal(StmtGlobalContext ctx) {
            return new Global(ctx.NAME()
                    .stream()
                    .map(name -> new ReadRef(name.getText()))
                    .collect(Collectors.toList()));
        }

        @Override
        public Node visitStmtFor(StmtForContext ctx) {
            return new ForLoop(new WriteRef(ctx.NAME().getText()),
                    (Expression) visit
                            (ctx.expr_primary()),
                    prepareStatements(ctx.body()));
        }

        @Override
        public Node visitStmtParfor(StmtParforContext ctx) {
            return new ParforLoop(new WriteRef(ctx.NAME().getText()),
                    (Expression) visit(ctx.initVal),
                    (Expression) visit(ctx.endVal),
                    prepareStatements(ctx.body()));
        }

        @Override
        public Node visitStmtWhile(StmtWhileContext ctx) {
            return new WhileLoop((Expression) visit(ctx.expr_primary()), prepareStatements(ctx.body()));
        }

        @Override
        public IfClause visitIf_clause(If_clauseContext ctx) {
            if (ctx == null) return null;
            return new IfClause(
                    visitExpr_primary(ctx.expr_primary()),
                    prepareStatements(ctx.body()));
        }

        @Override
        public ElseIfClause visitElseif_clause(Elseif_clauseContext ctx) {
            if (ctx == null) return null;
            return new ElseIfClause(
                    visitExpr_primary(ctx.expr_primary()),
                    prepareStatements(ctx.body()));
        }

        @Override
        public ElseClause visitElse_clause(Else_clauseContext ctx) {
            if (ctx == null) return null;
            return new ElseClause(prepareStatements(ctx.body()));
        }

        @Override
        public If visitStmtIf(StmtIfContext ctx) {
            IfClause ifClause = visitIf_clause(ctx.if_clause());
            List<ElseIfClause> elseIfClauses = ctx
                    .elseif_clause()
                    .stream()
                    .map(this::visitElseif_clause)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            ElseClause elseStmt = visitElse_clause(ctx.else_clause());
            if (elseIfClauses.isEmpty() && elseStmt == null) {
                return new If(ifClause);
            }
            if (elseIfClauses.isEmpty()) {
                return new If(ifClause, elseStmt);
            }
            if (elseStmt == null) {
                return new If(ifClause, elseIfClauses);
            }
            return new If(ifClause, elseIfClauses, elseStmt);
        }

        @Override
        public CatchClause visitCatch_clause(Catch_clauseContext ctx) {
            if (ctx == null) return null;
            List<Statement> statements = prepareStatements(ctx.body());
            if (ctx.NAME() == null) {
                return new CatchClause(statements);
            }
            return new CatchClause(ctx.NAME().getText(), statements);
        }

        @Override
        public Try visitStmtTry(StmtTryContext ctx) {
            return new Try(
                    visitCatch_clause(ctx.catch_clause()),
                    prepareStatements(ctx.body()));
        }

        @Override
        public Break visitStmtBreak(StmtBreakContext ctx) {
            return new Break();
        }

        @Override
        public Node visitAnyWriteRef(AnyWriteRefContext ctx) {
            return new WriteRef(ctx.NAME().getText());
        }

        @Override
        public Node visitArrayWriteRef(ArrayWriteRefContext ctx) {
            return new WriteRef(ctx.NAME().getText(),
                    IndexingType.PARENTHESES,
                    prepareExpressions(ctx.expr_index_list()));
        }

        @Override
        public Node visitCellWriteRef(CellWriteRefContext ctx) {
            return new WriteRef(ctx.NAME().getText(),
                    IndexingType.BRACKETS,
                    prepareExpressions(ctx.expr_index_list()));
        }

        @Override
        public Node visitStmtSingleAssignment(StmtSingleAssignmentContext ctx) {
            WriteRef def = (WriteRef) visit(ctx.variable());
            Expression rhs = (Expression) visit(ctx.expr_primary());
            return new SingleAssignment(def, rhs);
        }

        @Override
        public Node visitStmtMultiAssignment(StmtMultiAssignmentContext ctx) {
            List<WriteRef> definitions = ctx.expr_index().stream()
                    .map(n -> new WriteRef(n.getText()))
                    .collect(Collectors.toList());
            Expression rhs = (Expression) visit(ctx.expr_primary());
            return new MultiAssignment(definitions, rhs);
        }

        @Override
        public Node visitStmtSideEffect(StmtSideEffectContext ctx) {
            return new SideEffect((Expression) visit(ctx.expr_primary()));
        }

        @Override
        public Node visitStmtCommand(StmtCommandContext ctx) {
            java.lang.String cmd = ctx.NAME(0).getText();
            List<Expression> args = ctx.NAME()
                    .stream()
                    .skip(1)
                    .map(ParseTree::getText)
                    .map(String::new)
                    .collect(Collectors.toList());
            return new ExpressionStatement(new ReadRef(cmd,
                    IndexingType.PARENTHESES, args));
        }

        @Override
        public SwitchCase visitCase_clause(Case_clauseContext ctx) {
            return new SwitchCase(
                    visitExpr_primary(ctx.expr_primary()),
                    prepareStatements(ctx.body()));
        }

        @Override
        public SwitchOtherwise visitOtherwise_clause(Otherwise_clauseContext ctx) {
            return new SwitchOtherwise(prepareStatements(ctx.body()));
        }

        @Override
        public Node visitStmtSwitch(StmtSwitchContext ctx) {
            Otherwise_clauseContext otherwise = ctx.otherwise_clause();

            return new Switch(visitExpr_primary(ctx.expr_primary()),
                    ctx.case_clause()
                            .stream()
                            .map(this::visitCase_clause)
                            .collect(Collectors.toList()),
                    otherwise != null ?
                            visitOtherwise_clause(ctx.otherwise_clause()) :
                            null);
        }

        /* Build expr AST */
        @Override
        public Expression visitExpr_primary(matlabParser.Expr_primaryContext ctx) {
            return (Expression) super.visitExpr_primary(ctx);
        }

        @Override
        public Expression visitExprInParentheses(matlabParser.ExprInParenthesesContext ctx) {
            return new Parentheses((Expression) visit(ctx.expr()));
        }

        @Override
        public Expression visitExprTranspose(matlabParser.ExprTransposeContext ctx) {
            if (ctx.op.getType() == TRANSPOSE) {
                return new Transpose((Expression) visit(ctx.expr()));
            } else {
                return new CTranspose((Expression) visit(ctx.expr()));
            }
        }

        @Override
        public Node visitExprLambda(ExprLambdaContext ctx) {
            if (ctx.inputs().parameter_list() != null) {
                return new Lambda(ctx.inputs()
                        .parameter_list()
                        .NAME()
                        .stream()
                        .map(ParseTree::getText)
                        .map(WriteRef::new)
                        .collect(Collectors.toList()),
                        visitExpr_primary(ctx.expr_primary()));
            } else {
                return new Lambda(Lists.newArrayList(),
                        visitExpr_primary(ctx.expr_primary()));
            }
        }

        @Override
        public Expression visitExprPower(matlabParser.ExprPowerContext ctx) {
            if (ctx.op.getType() == POWER) {
                return new Power((Expression) visit(ctx.left), (Expression) visit(ctx.right));
            } else {
                return new MPower((Expression) visit(ctx.left), (Expression) visit(ctx.right));
            }
        }

        @Override
        public Expression visitExprUnary(matlabParser.ExprUnaryContext ctx) {
            switch (ctx.op.getType()) {
                case PLUS:
                    return new UPlus((Expression) visit(ctx.expr()));
                case MINUS:
                    // if negated numeric, return numeric
                    Expression expr = (Expression) visit(ctx.expr());
                    if (expr instanceof Numeric) {
                        return new Numeric(-((Numeric) expr).getValue());
                    } else {
                        return new UMinus(expr);
                    }
                default:
                    return new Not((Expression) visit(ctx.expr()));
            }
        }

        @Override
        public Expression visitExprMatrixOp(matlabParser.ExprMatrixOpContext ctx) {
            switch (ctx.op.getType()) {
                case TIMES:
                    return new Times((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case R_DIVIDE:
                    return new RDivide((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case L_DIVIDE:
                    return new LDivide((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case M_TIMES:
                    return new MTimes((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case MR_DIVIDE:
                    return new MRDivide((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                default:
                    return new MLDivide((Expression) visit(ctx.left), (Expression) visit(ctx.right));
            }
        }

        @Override
        public Expression visitExprArithmetic(matlabParser.ExprArithmeticContext ctx) {
            if (ctx.op.getType() == PLUS) {
                return new Plus((Expression) visit(ctx.left), (Expression) visit(ctx.right));
            } else {
                return new Minus((Expression) visit(ctx.left), (Expression) visit(ctx.right));
            }
        }

        @Override
        public Expression visitExprColon(matlabParser.ExprColonContext ctx) {
            if (ctx.middle != null) {
                return new Range((Expression) visit(ctx.left),
                        (Expression) visit(ctx.middle),
                        (Expression) visit(ctx.right));
            }
            return new Range(
                    (Expression) visit(ctx.left),
                    (Expression) visit(ctx.right));
        }

        @Override
        public Expression visitExprComparison(matlabParser.ExprComparisonContext ctx) {
            switch (ctx.op.getType()) {
                case LT:
                    return new Lt((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case LE:
                    return new Le((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case GT:
                    return new Gt((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case GE:
                    return new Ge((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                case EQ:
                    return new Eq((Expression) visit(ctx.left), (Expression) visit(ctx.right));
                default:
                    return new Ne((Expression) visit(ctx.left), (Expression) visit(ctx.right));
            }
        }

        @Override
        public Expression visitExprAnd(matlabParser.ExprAndContext ctx) {
            return new And((Expression) visit(ctx.left), (Expression) visit(ctx.right));
        }

        @Override
        public Expression visitExprOr(matlabParser.ExprOrContext ctx) {
            return new Or((Expression) visit(ctx.left), (Expression) visit(ctx.right));
        }

        @Override
        public Expression visitExprShortAnd(matlabParser.ExprShortAndContext ctx) {
            return new ShortAnd((Expression) visit(ctx.left), (Expression) visit(ctx.right));
        }

        @Override
        public Expression visitExprShortOr(matlabParser.ExprShortOrContext ctx) {
            return new ShortOr((Expression) visit(ctx.left), (Expression) visit(ctx.right));
        }

        @Override
        public Expression visitExprMatrix(matlabParser.ExprMatrixContext ctx) {
            List<List<Expression>> elements = Lists.newArrayList();
            ctx.matrix().row().forEach(rowContext -> elements.add(Lists
                    .newArrayList(rowContext
                            .expr_primary()
                            .stream()
                            .map(this::visitExpr_primary)
                            .collect(Collectors.toList()))));
            return new Matrix(elements);
        }

        @Override
        public Expression visitExprNumeric(matlabParser.ExprNumericContext ctx) {
            if (ctx.numeric().DECIMAL_INTEGER() != null
                    || ctx.numeric().FLOATING_POINT() != null) {
                return new Numeric(Double.parseDouble(ctx.getText()));
            } else {
                return new Numeric(ctx.numeric().COMPLEX_NUMBER().getText());
            }
        }

        @Override
        public Node visitExprHandle(ExprHandleContext ctx) {
            return new Handle(ctx.NAME().getText());
        }

        @Override
        public Expression visitExprCell(matlabParser.ExprCellContext ctx) {
            List<RowContext> rows = ctx.cell_array().row();
            int rowDim = rows.size();
            int colDim = rowDim > 0 ? rows.get(0).expr_primary().size() : 0;
            Expression[][] elements = new Expression[rowDim][colDim];
            for (int i = 0; i < rowDim; ++i) {
                for (int j = 0; j < colDim; ++j) {
                    elements[i][j] = (Expression) visit(ctx.cell_array().row(i)
                            .expr_primary(j));
                }
            }
            return new Cell(elements, rowDim, colDim);
        }

        @Override
        public Expression visitExprString(matlabParser.ExprStringContext ctx) {
            // Remove quotations
            java.lang.String literal = ctx.getText();
            return new String(literal.substring(1, literal.length() - 1));
        }

        @Override
        public Node visitExprArrayReadRefOrFunCall(ExprArrayReadRefOrFunCallContext ctx) {
            return new ReadRef(ctx.NAME().getText(),
                    IndexingType.PARENTHESES,
                    prepareExpressions(ctx.expr_index_list()));
        }

        @Override
        public Node visitExprCellReadRef(ExprCellReadRefContext ctx) {
            return new ReadRef(ctx.NAME().getText(),
                    IndexingType.BRACKETS,
                    prepareExpressions(ctx.expr_index_list()));
        }

        @Override
        public Node visitExprIndexAll(ExprIndexAllContext ctx) {
            return new IndexAll();
        }

        @Override
        public Node visitExprIndexEnd(ExprIndexEndContext ctx) {
            return new IndexEnd();
        }

        /* Build function definition */
        @Override
        public Node visitFunction_def(matlabParser.Function_defContext ctx) {
            // Process output
            List<ReadRef> output = Lists.newArrayList();
            if (ctx.outputs() != null) {
                if (ctx.outputs().name_list() != null) {
                    for (TerminalNode n : ctx.outputs().name_list().NAME()) {
                        output.add(new ReadRef(n.getText()));
                    }
                } else {
                    output.add(new ReadRef(ctx.outputs().NAME().getText()));
                }
            }
            // Process function name
            ReadRef name = new ReadRef(ctx.NAME().getText());
            // Process input
            List<WriteRef> input = Lists.newArrayList();
            if (ctx.inputs() != null) {
                if (ctx.inputs().parameter_list() != null) {
                    for (TerminalNode n : ctx.inputs().parameter_list().NAME()) {
                        input.add(new WriteRef(n.getText()));
                    }
                }
            }
            return new Function(output, name, input, prepareStatements(ctx.body()));
        }

        @Override
        public Node visitScriptFile(ScriptFileContext ctx) {
            return new Script(prepareStatements(ctx.body()));
        }

        @Override
        public Node visitFunctionFile(FunctionFileContext ctx) {
            return new FunctionFile(ctx.function_def()
                    .stream()
                    .map(this::visitFunction_def)
                    .map(fun -> (Function) fun)
                    .collect(Collectors.toList()));
        }

    }

}
