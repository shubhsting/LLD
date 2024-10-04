package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.CALCULATOR;

public class Main {
    public static void main(String[] args) {
        ArthematicExpression exp1 = new ArthematicExpression(new Number(10), new Number(1), Operation.ADD);
        ArthematicExpression exp2 = new ArthematicExpression(exp1, new Number(3), Operation.MULTIPLY);
        System.out.println(exp2.evaluate());
    }
}
