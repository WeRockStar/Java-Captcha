public class Operator {
    private int operator;

    public Operator(int operator) {
        this.operator = operator;
    }

    public int calculate(int leftOperand, int rightOperand) {
        switch (toString()) {
            case "+":
                return leftOperand + rightOperand;
            case "-":
                return leftOperand - rightOperand;
            default:
                return leftOperand * rightOperand;
        }
    }

    @Override
    public String toString() {
        String operatorString[] = {"+", "*", "-"};
        return operatorString[operator - 1];
    }
}
