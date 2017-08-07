import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperandTest {

    @Test
    public void put_1_operand_should_be_one() throws Exception {
        Operand operand = new StringOperand(1);
        assertEquals("One", operand.toText());
    }

    @Test
    public void put_5_operand_should_be_five() throws Exception {
        Operand operand = new StringOperand(5);
        assertEquals("Five", operand.toText());
    }

    @Test
    public void put_5_operand_should_be_nine() throws Exception {
        Operand operand = new StringOperand(9);
        assertEquals("Nine", operand.toText());
    }
}