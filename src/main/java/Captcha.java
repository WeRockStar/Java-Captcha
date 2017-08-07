public class Captcha {

    private Operand left;
    private Operand right;
    private int operator;
    private int pattern;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.left = OperandFactory.createLeft(pattern,leftOperand);
        this.right = OperandFactory.createRight(pattern,rightOperand);
        this.operator = operator;
        this.pattern = pattern;
    }

    public String getLeft() {
        return left.toText();
    }

    public String getRight() {
        return right.toText();
    }

    public String getOperator() {
        String operatorString[] = {"+", "*", "-"};
        return operatorString[operator - 1];
    }
}
