package hangmangame;

public class main {
    public static void main(String[] args) {
        Dictionary dictionary = new SimpleDictionary();
        HangmanGame game = new HangmanGame(dictionary);

        while (true) {
            System.out.println("Menu: [S]tart/[E]xit");
            String choice = game.scanner.nextLine().toUpperCase();

            if (choice.equals("E")) {
                System.out.println("Exiting the game, BYE!");
                break;
            } else if (choice.equals("S")) {
                game.start();
            } else {
                System.out.println("Incorrect symbol. Choose 'S' to start or 'E' to exit.");
            }
        }

        game.scanner.close();
    }
}