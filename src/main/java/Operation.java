import abstractsClass.NodeAbs;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.security.PublicKey;

@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Operation extends NodeAbs {

    public NodeAbs left;
    public NodeAbs right;

    public void setLeft(NodeAbs left) {
        this.left = left;
    }

    public void setRight(NodeAbs right) {
        this.right = right;
    }

    public abstract double evaluate();
}
