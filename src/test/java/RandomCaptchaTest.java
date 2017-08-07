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

    @Test
    public void verify_random_next_int_should_call_once() throws Exception {
        // Arrange
        SpyRandom random = new SpyRandom();
        RandomCaptcha randomCaptcha = new RandomCaptcha(random);

        // Act
        randomCaptcha.getPattern();

        // Assert
        assertTrue(random.verifyNextIntHaveBeenCalledOnce());
    }

    private class SpyRandom extends Random {
        private int bound;
        private int count = 0;

        @Override
        public int nextInt(int bound) {
            this.bound = bound;
            this.count++;
            return 1;
        }

        public int getBound() {
            return bound;
        }

        public boolean verifyNextIntHaveBeenCalledOnce() {
            return count == 1;
        }
    }
}