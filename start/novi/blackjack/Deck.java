package novi.blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardList;

    public Deck() {
        cardList = new ArrayList<Card>();
        generateDeck();
        shuffle();
    }

    /*
    Maakt deck aan voor het spel
     */
    private void generateDeck() {
        CardSuit[] suits = new CardSuit[] {
                new CardSuit("diamonds", '\u2666', "red"),
                new CardSuit("spades", '\u2660', "black"),
                new CardSuit("hearts", '\u2665', "red"),
                new CardSuit("clubs", '\u2663', "black")
        };

        CardValue[] values = new CardValue[] {
                new CardValue("two", 2),
                new CardValue("three", 3),
                new CardValue("four", 4),
                new CardValue("five", 5),
                new CardValue("six", 6),
                new CardValue("seven", 7),
                new CardValue("eight", 8),
                new CardValue("nine", 9),
                new CardValue("ten", 10),
                new CardValue("jack", 10),
                new CardValue("queen", 10),
                new CardValue("king", 10)
        };

        for (CardSuit suite : suits) {
            for (CardValue value : values) {
                cardList.add(new Card(suite, value));
                System.out.println("card info: " + suite.getName() + " | " + value.getName());
            }
        }
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
        Card card = cardList.get(cardList.size() -1);
        cardList.remove(cardList.size() -1); // get last card on deck
        return card;
    }
}
