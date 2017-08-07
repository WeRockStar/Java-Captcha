import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

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
}
