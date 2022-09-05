package novi.blackjack;

public class Card {

    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public String render() {
        return "name: " + suit.getName() + " and color: " + suit.getColor() + " and value: " + value.getValue();
    }

    public int getValue() {
        return value.getValue();
    }


}
