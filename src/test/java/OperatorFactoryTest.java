import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorFactoryTest {

    @Test
    public void string_pattern_create_operand_left() throws Exception {
        assertTrue(OperandFactory.createLeft(1, 1) instanceof StringOperand);
    }

    @Test
    public void string_pattern_create_operand_right() throws Exception {
        assertTrue(OperandFactory.createRight(1, 1) instanceof IntegerOperand);
    }

    @Test
    public void integer_pattern_create_operand_left() throws Exception {
        assertTrue(OperandFactory.createLeft(2,1) instanceof IntegerOperand);
    }

    @Test
    public void integer_pattern_create_operand_right() throws Exception {
        assertTrue(OperandFactory.createRight(2,1) instanceof StringOperand);
    }
}