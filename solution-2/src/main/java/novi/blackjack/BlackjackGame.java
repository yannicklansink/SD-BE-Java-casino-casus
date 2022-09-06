package novi.blackjack;

import java.util.Scanner;

public abstract class BlackjackGame {
    protected Scanner inputScanner;

    protected boolean gameIsRunning;

    protected Deck deck;
    protected Player player;
    protected Dealer dealer;

    public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
        this.deck = new SimpleDeck();
    }

    public void playGame() {
        gameIsRunning = true;

        player = new Player();
        dealer = new Dealer();

        deck.shuffle();
        dealer.addCardsToHand(deck.getNextCard());
        player.addCardsToHand(deck.getNextCard(), deck.getNextCard());

        while (gameIsRunning) {
            runGameLoop();
        }
    }

    public abstract void runGameLoop();
    /*
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
        */


    protected String getNextUserMove() {
        while (true) {
            System.out.println("What do you want to do? (hit or stay)");
            String input = inputScanner.nextLine();

            if (input.equals("hit") || input.equals("stay")) {
                return input;
            }
        }
    }

    protected void renderTableState() {
        System.out.println("");
        System.out.println("Dealers hand:");
        System.out.println(dealer.renderHand());
        System.out.println("");

        System.out.println("your hand:");
        System.out.println(player.renderHand());
        System.out.println("");
    }
}