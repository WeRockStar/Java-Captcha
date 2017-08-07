public class StringOperand implements Operand {

    private int value;

    public StringOperand(int value) {
        this.value = value;
    }

    @Override
    public String toText() {
        String numberString[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return numberString[value - 1];
    }

}
