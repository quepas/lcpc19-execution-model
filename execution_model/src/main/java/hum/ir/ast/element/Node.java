package hum.ir.ast.element;

import com.google.common.collect.Lists;
import hum.ir.HasPrettyPrint;
import hum.ir.ast.traversal.listener.AcceptASTListener;
import hum.ir.ast.traversal.visitor.AcceptASTVisitor;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by Quepas on 07.04.2017.
 */
public abstract class Node implements HasPrettyPrint, AcceptASTVisitor,
        AcceptASTListener<Node> {

    protected static final List<Node> NO_CHILDREN = Lists.newArrayList();

    // Unique id for disambiguation between syntactically statements and
    // expressions (also ids, variables etc.)
    protected UUID id = UUID.randomUUID();

    public UUID getId() {
        return id;
    }

    public boolean sameAs(Node node) {
        return id.equals(node.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(id, node.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
