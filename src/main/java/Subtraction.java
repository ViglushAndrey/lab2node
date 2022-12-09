public class Subtraction extends Operation{


    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
