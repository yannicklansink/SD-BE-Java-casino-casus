package novi.blackjack;

import java.util.ArrayList;

public class Dealer {

    private boolean bust;
    private Hand hand;
    private boolean stay;

    public Dealer() {
        hand = new Hand();
        bust = false;
        stay = false;
    }

    public boolean getStay() {
        return this.stay;
    }

    public void performMove(Deck deck) {
        System.out.println("value dealer hands: " + getHandValue());
        if (isBust()) {
            System.out.println("Dealer is bust");
            return;
        }
        if (!isStaying()) {
            // hit nog een beurt
            System.out.println("Dealer wants to hit");
            hand.addCard(deck.getNextCard());
            System.out.println("Dealer score: " + getHandValue());

        } else {
            // dealer is staying
            stay = true;
            System.out.println("Dealer is staying");
            System.out.println("Dealer score: " + getHandValue());
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
        return hand.render();
    }
}
