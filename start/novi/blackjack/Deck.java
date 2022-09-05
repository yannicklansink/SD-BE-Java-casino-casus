package novi.blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardList;

    public Deck() {
        cardList = new ArrayList<Card>();
    }

    public void shuffle() {
        Collections.shuffle(cardList);
    }

    public boolean isEmpty() {
        if (cardList.size() == 0) {
            return true;
        }
        return false;
    }

    public Card getNextCard() {
        return cardList.get(cardList.size() -1); // get last card on deck
    }
}
