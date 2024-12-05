package HangManGame;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomWord randomWord = new RandomWord();

        while (true) {
            System.out.println("Menu: [S]tart/[E]xit");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("E")) {
                System.out.println("Exiting the game, BYE!");
                break;
            } else if (choice.equals("S")) {
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
                        } else if (attemptsLeft == 0) {
                            System.out.println("You didn't guess...");
                        }

                    }
                }

                if (mask.isComplete()) {
                    System.out.println("You won! The secret word was: " + wordToGuess);
                } else {
                    System.out.println("You loose! The secret word was: " + wordToGuess);
                }
            } else {
                System.out.println("Incorrect symbol. Choose 'S' to start or 'E' to exit.");
            }
        }
        scanner.close();
    }
}