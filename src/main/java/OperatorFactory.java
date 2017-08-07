
public class OperatorFactory {

    public static Object createLeft(int pattern, int operand) {
        if (pattern == 1)
            return new StringOperand(operand);
        return new IntegerOperand(operand);
    }

    public static Object createRight(int pattern, int operand) {
        if (pattern == 1)
            return new IntegerOperand(operand);
        return new StringOperand(operand);
    }
}
