package novi.blackjack;

import java.util.Scanner;

public class SimpleBlackJack extends BlackjackGame {

    public SimpleBlackJack(Scanner inputScanner) {
        super(inputScanner);

    }

    @Override
    public void runGameLoop() {
        renderTableState();

        if (dealer.isBust() || dealer.isStaying() && player.getHandValue() > dealer.getHandValue()) {
            System.out.println("You won!");
            gameIsRunning = false;
            return;
        }

        if (player.isBust() || player.isStaying() && player.getHandValue() <= dealer.getHandValue()) {
            System.out.println("You lost!");
            gameIsRunning = false;
            return;
        }

        if (!player.isStaying()) {
            String move = getNextUserMove();
            player.performMove(deck, move);
        }

        if (!dealer.isStaying() && !player.isBust()) {
            dealer.performMove(deck);
        }

    }
}
