package HangManGame;

public class Mask {
    private StringBuilder maskedWord;

    public Mask(String word) {
        this.maskedWord = new StringBuilder("_".repeat(word.length()));
    }

    public String getMaskedWord() {
        return maskedWord.toString();
    }

    public void revealLetter(char letter, String originalWord) {
        for (int i = 0; i < originalWord.length(); i++) {
            if (originalWord.charAt(i) == letter) {
                maskedWord.setCharAt(i, letter);
            }
        }
    }

    public boolean isComplete() {
        return !maskedWord.toString().contains("_");
    }
}
