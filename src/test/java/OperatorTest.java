import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorTest {

    @Test
    public void put_1_operator_should_be_plus() throws Exception {
        Operator operator = new Operator(1);
        assertEquals("+", operator.toString());
    }

    @Test
    public void put_2_operator_should_be_multiply() throws Exception {
        Operator operator = new Operator(2);
        assertEquals("*", operator.toString());
    }

    @Test
    public void put_3_operator_should_be_minus() throws Exception {
        Operator operator = new Operator(3);
        assertEquals("-", operator.toString());
    }
}
