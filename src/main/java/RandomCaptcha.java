import java.util.Random;

public class RandomCaptcha {
    private Random random;

    public RandomCaptcha(Random random) {
        this.random = random;
    }

    public int getPattern() {
        return random.nextInt(2);
    }
}
