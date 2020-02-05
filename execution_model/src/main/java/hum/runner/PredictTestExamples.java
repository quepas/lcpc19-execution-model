package hum.runner;

import com.google.common.base.Strings;
import hum.frontend.matlab.BuildAST;
import hum.ir.ast.element.expr.Expression;

public class PredictTestExamples {

    public static final Expression mit_1 = BuildAST.fromStringExpr(
            "sum(round(A))");
    public static final Expression mit_2 = BuildAST.fromStringExpr(
            "floor(A) + sqrt(fix(B.* C))");
    public static final Expression mit_2_reversed = BuildAST.fromStringExpr(
            "sqrt(fix(B .* C)) + floor(A)");
    public static final Expression mit_3 = BuildAST.fromStringExpr(
            "floor(A) + sin(fix(B .* C))");
    public static final Expression mit_3_reversed = BuildAST.fromStringExpr(
            "sin(fix(B .* C)) + floor(A)\t");
    public static final Expression mit_4 = BuildAST.fromStringExpr(
            "exp((A.^D + B.^E) ./ (C.^F))");
    public static final Expression mit_5 = BuildAST.fromStringExpr(
            "A(1:LEN_1D) .* atan2(B(1:LEN_1D), C)");
    public static final Expression mit_5_reversed = BuildAST.fromStringExpr(
            "atan2(B(1:LEN_1D), C) .* A(1:LEN_1D)");
    public static final Expression mit_6 = BuildAST.fromStringExpr(
            "log(A) + B + C(1:LEN_1D)");
    public static final Expression mit_6_reversed = BuildAST.fromStringExpr(
            "log(A) + C(1:LEN_1D) + B");
    public static final Expression mit_7 = BuildAST.fromStringExpr(
            "fix(A(1:LEN_1D)) + (B(1:LEN_1D) .* C(1:LEN_1D))");
    public static final Expression mit_7_reversed = BuildAST.fromStringExpr(
            "(B(1:LEN_1D) .* C(1:LEN_1D)) + fix(A(1:LEN_1D))");
    public static final Expression mit_8 = BuildAST.fromStringExpr(
            "A(1:LEN_1D) + (B(1:LEN_1D) + C(1:LEN_1D))");
    public static final Expression mit_8_reversed = BuildAST.fromStringExpr(
            "(B(1:LEN_1D) + C(1:LEN_1D)) + A(1:LEN_1D)");

    public static void printHeader(String header, int maxLength) {
        int length = maxLength - (header.length() + 2);
        // Print just the header
        if (length < 0) {
            System.out.println(header);
            return;
        }
        // Equal amount of signs on the left and the right
        if (length % 2 == 0) {
            String bar = Strings.repeat("=", length / 2);
            System.out.println(bar + " " + header + " " + bar);
            return;
        }
        // Odd number of signs
        String left_bar = Strings.repeat("=", length / 2);
        String right_bar = Strings.repeat("=", (length / 2) + 1);
        System.out.println(left_bar + " " + header + " " + right_bar);
    }

    public static void predictExample(Expression expr, String exprName) {
        printHeader(exprName, 100);
        String prediction = ExecutionPredictor.predict(expr);
        System.out.println("Execution prediction   = " + prediction);
    }

    public static void main(String[] args) {
        System.out.println("Running the example expressions...");
        System.out.println("Built-in functions measured for the MATLAB R2018b");
        System.out.println("Prediction legend:");
        System.out.println("\t[fun1, fun2, ...] - instruction block");
        System.out.println("\t{A, B, ...}       - variables referenced in the" +
                " adjacent instruction block");
        System.out.println("\t!A, !B, ...       - array slicing, copies of " +
                "variables A, B, ...");
        predictExample(mit_1, "mit_1");
        predictExample(mit_2, "mit_2");
        predictExample(mit_2_reversed, "mit_2_reversed");
        predictExample(mit_3, "mit_3");
        predictExample(mit_3_reversed, "mit_3_reversed");
        predictExample(mit_4, "mit_4");
        predictExample(mit_5, "mit_5");
        predictExample(mit_5_reversed, "mit_5_reversed");
        predictExample(mit_6, "mit_6");
        predictExample(mit_6_reversed, "mit_6_reversed");
        predictExample(mit_7, "mit_7");
        predictExample(mit_7_reversed, "mit_7_reversed");
        predictExample(mit_8, "mit_8");
        predictExample(mit_8_reversed, "mit_8_reversed");
    }

}
