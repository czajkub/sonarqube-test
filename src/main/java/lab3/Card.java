package lab3;

import java.util.Objects;

public class Card {
    /**
     * just a normal card class
     * @return nothing. this is a class. or a card i guess
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public Rank rank;
    public Suit suit;

    /**
     * Card . card
     * @param rank
     * @param suit
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

}
