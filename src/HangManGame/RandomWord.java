package HangManGame;

import java.util.Random;

public class RandomWord {
    private Random random;

    public RandomWord() {
        random = new Random();
    }

    public String getWord() {
        return Dictionary.Words[random.nextInt(Dictionary.Words.length)];
    }
}