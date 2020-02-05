package hum.analysis.execution.model.tree;

import java.util.Objects;

public class Instruction {

    private String opcode;
    private CompilationMode compilationMode;

    public Instruction(String opcode, CompilationMode compilationMode) {
        this.opcode = opcode;
        this.compilationMode = compilationMode;
    }

    public String getOpcode() {
        return opcode;
    }

    public CompilationMode getCompilationMode() {
        return compilationMode;
    }

    @Override
    public String toString() {
        return opcode + (compilationMode == CompilationMode.COMBINED ? " ✔"
                : " ✘");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instruction that = (Instruction) o;
        return Objects.equals(opcode, that.opcode) &&
                compilationMode == that.compilationMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(opcode, compilationMode);
    }
}
