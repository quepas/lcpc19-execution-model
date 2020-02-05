package hum.analysis.execution.model.tree;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;

import java.util.Set;
import java.util.stream.Collectors;

public class InstructionBlock extends InstTreeNode {

    private Set<ArrayReference> references = Sets.newHashSet();
    private Set<ArraySlice> slices = Sets.newHashSet();
    private Multiset<Instruction> operations = HashMultiset.create();

    public InstructionBlock(Instruction operation) {
        operations.add(operation);
    }

    public Multiset<Instruction> getOperations() {
        return operations;
    }

    public Set<ArrayReference> getReferences() {
        return references;
    }

    public Set<ArraySlice> getSlices() {
        return slices;
    }

    public void addIfArrayRef(InstTreeNode node) {
        if (node instanceof ArrayReference) {
            references.add((ArrayReference) node);
        }
    }

    public InstructionBlock mergeWith(InstructionBlock block) {
        operations = Multisets.sum(operations, block.getOperations());
        references = Sets.union(references, block.getReferences());
        slices = Sets.union(slices, block.getSlices());
        return this;
    }

    public void addChild(InstTreeNode child) {
        children.add(child);
    }

    public boolean hasOnlyCombinableOperations() {
        return operations.stream()
                .allMatch(op -> op.getCompilationMode() == CompilationMode.COMBINED);
    }


    @Override
    public String toString() {
        if (references.isEmpty()) {
            return operations.toString();
        }
        return operations.toString() + "{" + references.stream()
                .map(ArrayReference::toString)
                .sorted()
                .collect(Collectors.joining(", ")) + "}";
    }

}
