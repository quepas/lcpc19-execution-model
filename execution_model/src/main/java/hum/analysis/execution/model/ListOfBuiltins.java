package hum.analysis.execution.model;

import com.google.common.collect.ImmutableList;
import hum.analysis.execution.model.tree.CompilationMode;
import hum.analysis.execution.model.tree.Instruction;

import java.util.List;

/**
 * Stores the compilation mode of built-in functions
 */
public class ListOfBuiltins {

    private static List<Instruction> builtins =
            ImmutableList.<Instruction>builder()
                    .add(new Instruction("acos", CompilationMode.SINGLE))
                    .add(new Instruction("acosh", CompilationMode.SINGLE))
                    .add(new Instruction("asin", CompilationMode.SINGLE))
                    .add(new Instruction("atanh", CompilationMode.SINGLE))
                    .add(new Instruction("colon", CompilationMode.SINGLE))
                    .add(new Instruction("ctranspose", CompilationMode.SINGLE))
                    .add(new Instruction("cumprod", CompilationMode.SINGLE))
                    .add(new Instruction("cumsum", CompilationMode.SINGLE))
                    .add(new Instruction("det", CompilationMode.SINGLE))
                    .add(new Instruction("diff", CompilationMode.SINGLE))
                    .add(new Instruction("eig", CompilationMode.SINGLE))
                    .add(new Instruction("fft", CompilationMode.SINGLE))
                    .add(new Instruction("fliplr", CompilationMode.SINGLE))
                    .add(new Instruction("gamma", CompilationMode.SINGLE))
                    .add(new Instruction("ifft", CompilationMode.SINGLE))
                    .add(new Instruction("log", CompilationMode.SINGLE))
                    .add(new Instruction("log10", CompilationMode.SINGLE))
                    .add(new Instruction("log1p", CompilationMode.SINGLE))
                    .add(new Instruction("log2", CompilationMode.SINGLE))
                    .add(new Instruction("max", CompilationMode.SINGLE))
                    .add(new Instruction("mean", CompilationMode.SINGLE))
                    .add(new Instruction("min", CompilationMode.SINGLE))
                    .add(new Instruction("mtimes", CompilationMode.SINGLE))
                    .add(new Instruction("nextpow2", CompilationMode.SINGLE))
                    .add(new Instruction("norm", CompilationMode.SINGLE))
                    .add(new Instruction("ones", CompilationMode.SINGLE))
                    .add(new Instruction("power", CompilationMode.SINGLE))
                    .add(new Instruction("prod", CompilationMode.SINGLE))
                    .add(new Instruction("rand", CompilationMode.SINGLE))
                    .add(new Instruction("randn", CompilationMode.SINGLE))
                    .add(new Instruction("sqrt", CompilationMode.SINGLE))
                    .add(new Instruction("sum", CompilationMode.SINGLE))
                    .add(new Instruction("zeros", CompilationMode.SINGLE))
                    // Combined
                    .add(new Instruction("abs", CompilationMode.COMBINED))
                    .add(new Instruction("asinh", CompilationMode.COMBINED))
                    .add(new Instruction("atan", CompilationMode.COMBINED))
                    .add(new Instruction("atan2", CompilationMode.COMBINED))
                    .add(new Instruction("ceil", CompilationMode.COMBINED))
                    .add(new Instruction("cos", CompilationMode.COMBINED))
                    .add(new Instruction("cosh", CompilationMode.COMBINED))
                    .add(new Instruction("exp", CompilationMode.COMBINED))
                    .add(new Instruction("expm1", CompilationMode.COMBINED))
                    .add(new Instruction("fix", CompilationMode.COMBINED))
                    .add(new Instruction("floor", CompilationMode.COMBINED))
                    .add(new Instruction("imag", CompilationMode.COMBINED))
                    .add(new Instruction("ldivide", CompilationMode.COMBINED))
                    .add(new Instruction("minus", CompilationMode.COMBINED))
                    .add(new Instruction("mod", CompilationMode.COMBINED))
                    .add(new Instruction("plus", CompilationMode.COMBINED))
                    .add(new Instruction("pow2", CompilationMode.COMBINED))
                    .add(new Instruction("rdivide", CompilationMode.COMBINED))
                    .add(new Instruction("real", CompilationMode.COMBINED))
                    .add(new Instruction("rem", CompilationMode.COMBINED))
                    .add(new Instruction("round", CompilationMode.COMBINED))
                    .add(new Instruction("sign", CompilationMode.COMBINED))
                    .add(new Instruction("sin", CompilationMode.COMBINED))
                    .add(new Instruction("sinh", CompilationMode.COMBINED))
                    .add(new Instruction("tan", CompilationMode.COMBINED))
                    .add(new Instruction("tanh", CompilationMode.COMBINED))
                    .add(new Instruction("times", CompilationMode.COMBINED))
                    .add(new Instruction("transpose", CompilationMode.COMBINED))
                    .add(new Instruction("uminus", CompilationMode.COMBINED))
                    .add(new Instruction("uplus", CompilationMode.COMBINED))
                    .build();

    public static Instruction getByName(String name) {
        for (Instruction inst : builtins) {
            if (inst.getOpcode().equals(name)) {
                return inst;
            }
        }
        throw new UnsupportedOperationException("Missing function=" + name);
    }

    public static boolean hasOpcode(String name) {
        return builtins.stream().anyMatch(inst -> inst.getOpcode().equals(name));
    }

}
