package hangmangame;

import java.util.Scanner;

public class HangmanGame {
    private final Dictionary dictionary;
    public final Scanner scanner;

    public HangmanGame(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        RandomWord randomWord = new RandomWord(dictionary);
        String wordToGuess = randomWord.getWord();
        Mask mask = new Mask(wordToGuess);
        int attemptsLeft = 5;

        System.out.println("Welcome to the 'HangMan Game'!");

        while (attemptsLeft > 0 && !mask.isComplete()) {
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.println("Secret word is: " + mask.getMaskedWord());
            System.out.print("Guess the letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (wordToGuess.indexOf(guess) >= 0) {
                mask.revealLetter(guess, wordToGuess);
                System.out.println("You guessed the letter!");
            } else {
                attemptsLeft--;
                if (attemptsLeft >= 1) {
                    System.out.println("You didn't guess. Try another letter.");
                } else {
                    System.out.println("You didn't guess...");
                }
            }
        }

        if (mask.isComplete()) {
            System.out.println("You won! The secret word was: " + wordToGuess);
        } else {
            System.out.println("You lose! The secret word was: " + wordToGuess);
        }
    }
}

