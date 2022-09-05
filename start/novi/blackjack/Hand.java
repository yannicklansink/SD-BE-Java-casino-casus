package novi.blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cardList;

    public Hand() {

    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public int getTotalValue() {
        // return total value of all cards in players hand
        int totalValue = 0;
        for (Card card : cardList) {
            totalValue += card.getValue();
        }
         return totalValue;
    }

    public String render() {
        // ?
        StringBuilder string = new StringBuilder();
        for (Card card : cardList) {
            string.append(card.render());
        }
        return string.toString();
    }
}
