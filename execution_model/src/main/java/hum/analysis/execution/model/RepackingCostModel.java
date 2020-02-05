package hum.analysis.execution.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import hum.analysis.execution.model.tree.ArraySlice;
import hum.analysis.execution.model.tree.InstTreeNode;
import hum.analysis.execution.model.tree.InstructionBlock;

import java.util.List;
import java.util.Set;

public class RepackingCostModel {

    private Set<ArraySlice> repackingCandidates = Sets.newHashSet();

    public void apply(List<InstTreeNode> instructionChain) {
        // In case of subsequent calls
        repackingCandidates.clear();
        for (int idx = 1; idx < instructionChain.size()-1; ++idx) {
            InstTreeNode node = instructionChain.get(idx);
            if (node instanceof ArraySlice) {
                InstTreeNode blockBefore = instructionChain.get(idx-1);
                if (blockBefore instanceof InstructionBlock) {
                    // There might be many nodes after
                    List<ArraySlice> arraySlices = Lists.newArrayList();
                    arraySlices.add((ArraySlice) node);
                    int subSlicesIdx = idx+1;
                    while (instructionChain.get(subSlicesIdx) instanceof ArraySlice) {
                        arraySlices.add((ArraySlice) instructionChain.get(subSlicesIdx));
                        ++subSlicesIdx;
                    }
                    idx = subSlicesIdx;
                    InstTreeNode blockAfter = instructionChain.get(idx);

                    if (blockAfter instanceof InstructionBlock
                            && ((InstructionBlock) blockBefore).hasOnlyCombinableOperations()
                            && ((InstructionBlock) blockAfter).hasOnlyCombinableOperations()) {
                        repackingCandidates.addAll(arraySlices);
                    }
                }
            }
        }
    }

    public Set<ArraySlice> getRepackingCandidates() {
        return repackingCandidates;
    }

}
