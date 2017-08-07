import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RandomCaptchaTest {

    @Test
    public void random_captcha_should_be_pattern_1() throws Exception {
        Random random = new SpyRandom();
        RandomCaptcha randomCaptcha = new RandomCaptcha(random);
        assertEquals(1, randomCaptcha.getPattern());
    }

    private class SpyRandom extends Random {

        @Override
        public int nextInt(int bound) {
            return 1;
        }
    }
}