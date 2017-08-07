import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    @Test
    public void pattern_integer_right_operand_should_be_nine() throws Exception {
        Captcha captcha = new Captcha(2, 1, 1, 9);
        assertEquals("Nine", captcha.getRight());
    }

    @Test
    public void pattern_integer_right_operand_should_be_five() throws Exception {
        Captcha captcha = new Captcha(2, 1, 1, 5);
        assertEquals("Five", captcha.getRight());
    }

    @Test
    public void pattern_integer_right_operand_should_be_one() throws Exception {
        Captcha captcha = new Captcha(2, 1, 1, 1);
        assertEquals("One", captcha.getRight());
    }

    @Test
    public void pattern_integer_left_operand_should_be_9() throws Exception {
        Captcha captcha = new Captcha(2, 9, 1, 1);
        assertEquals("9", captcha.getLeft());
    }

    @Test
    public void pattern_integer_left_operand_should_be_5() throws Exception {
        Captcha captcha = new Captcha(2, 5, 1, 1);
        assertEquals("5", captcha.getLeft());
    }

    @Test
    public void pattern_integer_left_operand_should_be_1() throws Exception {
        Captcha captcha = new Captcha(2, 1, 1, 1);
        assertEquals("1", captcha.getLeft());
    }

    @Test
    public void operator_should_be_minus() throws Exception {
        Captcha captcha = new Captcha(1, 1, 3, 1);
        assertEquals("-", captcha.getOperator());
    }

    @Test
    public void operator_should_be_multiply() throws Exception {
        Captcha captcha = new Captcha(1, 1, 2, 1);
        assertEquals("*", captcha.getOperator());
    }

    @Test
    public void operator_should_be_plus() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("+", captcha.getOperator());
    }

    @Test
    public void right_operand_should_be_7() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 7);
        assertEquals("7", captcha.getRight());
    }

    @Test
    public void right_operand_should_be_9() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 9);
        assertEquals("9", captcha.getRight());
    }

    @Test
    public void right_operand_should_be_5() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 5);
        assertEquals("5", captcha.getRight());
    }

    @Test
    public void right_operand_should_be_1() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("1", captcha.getRight());
    }

    @Test
    public void left_operand_should_be_one() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("One", captcha.getLeft());
    }

    @Test
    public void left_operand_should_be_five() throws Exception {
        Captcha captcha = new Captcha(1, 5, 1, 1);
        assertEquals("Five", captcha.getLeft());
    }

    @Test
    public void left_operand_should_be_nine() throws Exception {
        Captcha captcha = new Captcha(1, 9, 1, 1);
        assertEquals("Nine", captcha.getLeft());
    }

    @Test
    public void left_operand_should_be_four() throws Exception {
        Captcha captcha = new Captcha(1, 4, 1, 1);
        assertEquals("Four", captcha.getLeft());
    }
}
