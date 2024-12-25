package hangmangame;

import java.util.List;
import java.util.Random;

public class RandomWord {
    private Random random;
    private Dictionary dictionary;

    public RandomWord(Dictionary dictionary) {
        this.random = new Random();
        this.dictionary = dictionary;
    }

    public String getWord() {
        List<String> words = dictionary.getWords();
        return words.get(random.nextInt(words.size()));
    }
}