
public class OperandFactory {

    public static Operand createLeft(int pattern, int operand) {
        return pattern == 1 ? new StringOperand(operand) : new IntegerOperand(operand);
    }

    public static Operand createRight(int pattern, int operand) {
        return pattern == 1 ? new IntegerOperand(operand) : new StringOperand(operand);
    }
}
