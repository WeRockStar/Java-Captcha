public class IntegerOperand implements Operand {
    private int value;

    public IntegerOperand(int value) {
        this.value = value;
    }

    @Override
    public String toText() {
        return String.valueOf(value);
    }
}
