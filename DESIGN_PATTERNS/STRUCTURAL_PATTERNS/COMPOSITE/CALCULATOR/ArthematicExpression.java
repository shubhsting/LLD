package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.CALCULATOR;

public class ArthematicExpression implements Expression {
    public Expression leftExpression;
    public Expression rightExpression;
    public Operation operation;

    ArthematicExpression(Expression leftExpression,
            Expression rightExpression,
            Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        switch (operation) {
            case ADD:
                return leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT:
                return leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY:
                return leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE:
                return leftExpression.evaluate() / rightExpression.evaluate();
            default:
                return -1;
        }
    }

}
