package novi.blackjack;

import java.util.Scanner;

public class BlackJackGame {

    private Scanner scanner;
    private Player player;
    private Dealer dealer;
    private Deck deck;
    private boolean endgame;
    private boolean playerStay;

    public BlackJackGame(Scanner scanner) {
        this.scanner = scanner;
        this.endgame = false;
        this.playerStay = false;
        this.player = new Player();
        this.dealer = new Dealer();
        deck = new Deck();
    }
    public void playGame() {
        startGame();

        playerMove();
        while (!endgame) {
            dealer.performMove(deck);
            if (dealer.isBust()) {
                endgame = true;
                System.out.println("Dealer is bust with: " + dealer.getHandValue());
                System.out.println("Player has won with: " + player.getHandValue());
            }
            if (!playerStay) {
                playerMove();
            }
            if (dealer.getStay() && playerStay) {
                // dealer is staying
                endgame = true;
                System.out.println("game is over; both player and dealer are staying");
                System.out.println("player score: " + player.getHandValue());
                System.out.println("dealer score: " + dealer.getHandValue());


            }

        }

    }

    private void startGame() {
        System.out.println("Player krijgt 2 kaarten");
        player.addCardToHand(deck.getNextCard());
        player.addCardToHand(deck.getNextCard());
        System.out.println(player.renderHand());

        System.out.println("Dealer krijgt 1 kaart");
        dealer.addCardToHand(deck.getNextCard());
        System.out.println(dealer.renderHand());
    }

    private void checkBustPlayer() {
        if (player.isBust()) {
            endgame = true;
            System.out.println("player is over 21 and is bust with: " + player.getHandValue());
            System.out.println("Dealer has won with: " + dealer.getHandValue());
        }
    }

    private void playerMove() {
        System.out.println("'hit' or 'stay'?");
        boolean correct = false;
        String move = "";
        while (!correct) {
            move = scanner.nextLine();
            move.toLowerCase();
            if (move.equals("hit") || move.equals("stay")) {
                // correct
                correct = true;
                if (move.equals("stay")) {
                    System.out.println("playerstatus nu op true");
                    playerStay = true;
                }
                player.performMove(deck, move);
            } else {
                System.out.println("please guess 'hit' or 'stay' ");
            }
        }
        checkBustPlayer();

    }

}






