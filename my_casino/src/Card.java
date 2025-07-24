
public class Card {
/*
    private enum suit {
        HEARTS,
        SPADES,
        CLUBS, 
        DIAMONDS
    };
    private enum Rank {
        A, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K
    }
*/
    private String suit;
    private int rank;

    public Card() {
    }

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return "(" + suit +", "+ rank +")";
    }
}
