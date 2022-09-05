package novi.higherlower;

import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;
    private int guesses;
    private int randomInt;
    private final static int MIN = 1;
    private final static int MAX = 100;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
        guesses = 0;
        randomInt = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
        System.out.println("CHEATMODE to be guessed: " + randomInt);
    }

    public void playGame() {
        gameIsRunning = true;
        // Here you should generate the number to guess

        while (gameIsRunning) {
            System.out.println("Make a guess");

            int input = inputScanner.nextInt();
            System.out.printf("You typed: %s\n", input);

            // Check if the guess is correct, if so end the game
            checkGuessesNumber(input);
        }
    }

    private void checkGuessesNumber(int input) {
        if (input > randomInt) {
            System.out.println("You guessed to high!");
        } else if (input < randomInt) {
            System.out.println("You guessed to low");
        } else {
            System.out.println("You guessed correct!");
            gameIsRunning = false;
        }
    }
}
