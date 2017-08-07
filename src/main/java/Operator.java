public class Operator {
    private int operator;

    public Operator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        String operatorString[] = {"+", "*", "-"};
        return operatorString[operator - 1];
    }
}
