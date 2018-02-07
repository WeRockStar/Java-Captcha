import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    private final int DUMMY_PATTERN = 1;
    private final int DUMMY_OPERATOR = 1;
    private final int DUMMY_OPERAND = 1;


    @Test
    public void put_1_minus_1_result_should_be_2() throws Exception {
        Captcha captcha = new Captcha(1, 1,3,1);
        assertEquals(0, captcha.getSumOfCaptchaNumber());
    }

    @Test
    public void put_2_multiply_2_result_should_be_2() throws Exception {
        Captcha captcha = new Captcha(1, 2, 2, 2);
        assertEquals(4, captcha.getSumOfCaptchaNumber());
    }

    @Test
    public void put_1_plus_1_result_should_be_2() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals(2, captcha.getSumOfCaptchaNumber());
    }

    @Test
    public void put_2_plus_1_result_should_be_2() throws Exception {
        Captcha captcha = new Captcha(1, 2, 1, 1);
        assertEquals(3, captcha.getSumOfCaptchaNumber());
    }

    @Test
    public void put_3_plus_1_result_should_be_2() throws Exception {
        Captcha captcha = new Captcha(1, 3, 1, 1);
        assertEquals(4, captcha.getSumOfCaptchaNumber());
    }

    @Test
    public void get_captcha_1111_should_be_one_plus_1() throws Exception {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("One + 1", captcha.getCaptcha());
    }

    @Test
    public void get_captcha_2111_should_be_1_plus_one() throws Exception {
        Captcha captcha = new Captcha(2, 1, 1, 1);
        assertEquals("1 + One", captcha.getCaptcha());
    }

    @Test
    public void get_captcha_2211_should_be_2_plus_one() throws Exception {
        Captcha captcha = new Captcha(2, 2, 1, 1);
        assertEquals("2 + One", captcha.getCaptcha());
    }

    @Test
    public void get_captcha_1211_should_be_two_plus_1() throws Exception {
        Captcha captcha = new Captcha(1, 2, 1, 1);
        assertEquals("Two + 1", captcha.getCaptcha());
    }

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
        Captcha captcha = new Captcha(DUMMY_PATTERN, 1, 3, 1);
        assertEquals("-", captcha.getOperator());
    }

    @Test
    public void operator_should_be_multiply() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, 1, 2, 1);
        assertEquals("*", captcha.getOperator());
    }

    @Test
    public void operator_should_be_plus() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_OPERAND, 1, DUMMY_OPERAND);
        assertEquals("+", captcha.getOperator());
    }

    @Test
    public void right_operand_should_be_7() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_OPERAND, DUMMY_OPERATOR, 7);
        assertEquals("7", captcha.getRight());
    }

    @Test
    public void right_operand_should_be_9() throws Exception {
        Captcha captcha = new Captcha(1, 1, DUMMY_OPERATOR, 9);
        assertEquals("9", captcha.getRight());
    }

    @Test
    public void right_operand_should_be_5() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, 1, DUMMY_OPERATOR, 5);
        assertEquals("5", captcha.getRight());
    }

    @Test
    public void right_operand_should_be_1() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_OPERAND, DUMMY_OPERATOR, 1);
        assertEquals("1", captcha.getRight());
    }

    @Test
    public void left_operand_should_be_one() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, 1, DUMMY_OPERATOR, DUMMY_OPERAND);
        assertEquals("One", captcha.getLeft());
    }

    @Test
    public void left_operand_should_be_five() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, 5, DUMMY_OPERATOR, DUMMY_OPERAND);
        assertEquals("Five", captcha.getLeft());
    }

    @Test
    public void left_operand_should_be_nine() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, 9, DUMMY_OPERATOR, DUMMY_OPERAND);
        assertEquals("Nine", captcha.getLeft());
    }

    @Test
    public void left_operand_should_be_four() throws Exception {
        Captcha captcha = new Captcha(DUMMY_PATTERN, 4, DUMMY_OPERATOR, DUMMY_OPERAND);
        assertEquals("Four", captcha.getLeft());
    }
}
