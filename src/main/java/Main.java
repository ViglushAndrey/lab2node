import abstractsClass.NodeAbs;

public class Main {
    public static void main(String[] args) {


        NodeAbs num1 = new Value(1);
        NodeAbs num2 = new Value(2);
        NodeAbs num3 = new Value(3);

        Operation multiplication = new Multiplication();

        multiplication.setLeft(num2);
        multiplication.setRight(num3);

        Operation addition = new Addition();
        addition.setLeft(num1);
        addition.setRight(multiplication);

        System.out.println(addition.evaluate());

    }
}
