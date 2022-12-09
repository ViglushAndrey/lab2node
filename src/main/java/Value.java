import abstractsClass.NodeAbs;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class Value extends NodeAbs {

    public double value;


    @Override
    public double evaluate() {
        return value;
    }
}
