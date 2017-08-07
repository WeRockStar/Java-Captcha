public class Captcha {

    private int left;
    private int right;
    private int operator;
    private int pattern;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.left = leftOperand;
        this.right = rightOperand;
        this.operator = operator;
        this.pattern = pattern;
    }

    public String getLeft() {
        String numberString[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (pattern == 1)
            return numberString[left - 1];
        return String.valueOf(left);
    }

    public String getRight() {
        String numberString[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (pattern == 2) {
            return numberString[right - 1];
        }
        return String.valueOf(right);
    }

    public String getOperator() {
        String operatorString[] = {"+", "*", "-"};
        return operatorString[operator - 1];
    }
}
