package novi;

import java.util.Scanner;

import novi.blackjack.BlackjackGame;
import novi.blackjack.SimpleBlackJack;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        // HigherLowerGame game = new HigherLowerGame(inputScanner);
        BlackjackGame game = new SimpleBlackJack(inputScanner);

        game.playGame();
    }
}
