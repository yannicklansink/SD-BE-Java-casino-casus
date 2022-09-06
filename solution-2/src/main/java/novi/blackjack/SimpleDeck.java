package novi.blackjack;

import java.util.Stack;

public class SimpleDeck extends Deck {

    public SimpleDeck() {
        super();
        CardSuit[] suits = new CardSuit[] {
                new CardSuit("diamonds", '\u2666', "red"),
                new CardSuit("spades", '\u2660', "black"),
                new CardSuit("hearts", '\u2665', "red"),
                new CardSuit("clubs", '\u2663', "black")
        };

        CardValue[] values = new CardValue[] { new CardValue("two", 2), new CardValue("three", 3),
                new CardValue("four", 4), new CardValue("five", 5), new CardValue("six", 6), new CardValue("seven", 7),
                new CardValue("eight", 8), new CardValue("nine", 9), new CardValue("ten", 10),
                new CardValue("jack", 10), new CardValue("queen", 10), new CardValue("king", 10) };

        cards = new Stack<>();
        for (CardSuit suite : suits) {
            for (CardValue value : values) {
                cards.add(new Card(suite, value));
            }
        }
    }
}
