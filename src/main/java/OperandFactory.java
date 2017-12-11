import java.util.HashMap;
import java.util.Map;

public class OperandFactory {

    public static Operand createLeft(int pattern, int operand) {
        Map<Integer, Operand> patterns = new HashMap<>();
        patterns.put(1, new StringOperand(operand));
        patterns.put(2, new IntegerOperand(operand));
        return patterns.get(pattern);
    }

    public static Operand createRight(int pattern, int operand) {
        Map<Integer, Operand> patterns = new HashMap<>();
        patterns.put(1, new IntegerOperand(operand));
        patterns.put(2, new StringOperand(operand));
        return patterns.get(pattern);
    }
}
