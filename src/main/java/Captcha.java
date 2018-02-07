public class Captcha {

    private Operand left;
    private Operand right;
    private Operator operator;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.left = OperandFactory.createLeft(pattern, leftOperand);
        this.right = OperandFactory.createRight(pattern, rightOperand);
        this.operator = new Operator(operator);
    }

    public String getLeft() {
        return left.toString();
    }

    public String getRight() {
        return right.toString();
    }

    public String getOperator() {
        return operator.toString();
    }

    public String getCaptcha() {
        return String.format("%s %s %s", getLeft(), getOperator(), getRight());
    }

    public int getSumOfCaptchaNumber() {
        int leftOperand = left.getOriginalValue();
        int rightOperand = right.getOriginalValue();
        return operator.calculate(leftOperand, rightOperand);
    }
}
