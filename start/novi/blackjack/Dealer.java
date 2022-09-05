package novi.blackjack;

import java.util.ArrayList;

public class Dealer {

    private boolean bust;
    private Hand hand;

    public Dealer() {
        hand = new Hand();
        bust = false;
    }

    public void performMove(Deck deck) {
        if (bust) {
            System.out.println("Dealer is bust");
            return;
        }
        if (!isStaying()) {
            // hit nog een beurt

        }
    }

    public void addCardsToHand(ArrayList<Card> cards) {
        for (Card card : cards) {
            hand.addCard(card);
        }

    }

    public boolean isStaying() {
        if (getHandValue() < 17) {
            return false;
        }
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
        return "";
    }
}
