package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.CALCULATOR;

public class Number implements Expression {
    int number;

    Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }

}
