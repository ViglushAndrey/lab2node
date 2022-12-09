

public class Addition extends Operation {


    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

}
