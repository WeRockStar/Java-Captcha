import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerOperandTest {
    @Test
    public void put_9_should_be_9() throws Exception {
        Operand operand = new IntegerOperand(9);
        assertEquals("9", operand.toString());
    }

    @Test
    public void put_5_should_be_5() throws Exception {
        Operand operand = new IntegerOperand(5);
        assertEquals("5", operand.toString());
    }

    @Test
    public void put_1_should_be_1() throws Exception {
        Operand operand = new IntegerOperand(1);
        assertEquals("1", operand.toString());
    }
}