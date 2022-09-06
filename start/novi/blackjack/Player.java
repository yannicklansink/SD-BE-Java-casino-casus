package novi.blackjack;

import java.sql.Array;
import java.util.ArrayList;

public class Player {

    private boolean bust;
    private Hand hand;

    public Player() {
        bust = false;
        hand = new Hand();
    }

    public void performMove(Deck deck, String move) {
        if (bust) {
            System.out.println("Player is bust");
            return;
        }
        if (!isStaying(move)) {
            // hit nog een beurt
            System.out.println("Player wants to hit");
            hand.addCard(deck.getNextCard());
            System.out.println("Player score: " + getHandValue());
        } else {
            // stay
            System.out.println("Player is staying");
            System.out.println("Player score: " + getHandValue());
        }
    }

    public void addCardsToHand(ArrayList<Card> cards) {
        for (Card card : cards) {
            hand.addCard(card);
        }
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public boolean isStaying(String move) {
        if (move.equals("hit")) {
            return false;
        } else if (move.equals("stay")) {
            return true;
        }
        System.out.println("error");
        return true;
    }

    public boolean isBust() {
        if (getHandValue() > 21) {
            bust = true;
            return true;
        }
        return false;
    }

    public int getHandValue() {
        return hand.getTotalValue();
    }

    public String renderHand() {
        return hand.render();
    }
}
