package novi.blackjack;

import java.util.Scanner;

public class BlackJackGame {

    private Scanner scanner;
    private Player player;
    private Dealer dealer;
    private Deck deck;

    public BlackJackGame(Scanner scanner) {
        this.scanner = scanner;
        this.player = new Player();
        this.dealer = new Dealer();
        deck = new Deck();
    }
    public void playGame() {
        // maak deck aan voor het spel



    }

}
