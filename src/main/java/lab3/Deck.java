package lab3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    /**
     * Class for deck containing 52 poker cards, by default sorted
     * Includes shuffle() method for shuffling the deck
     */
    ArrayList<Card> cards = new ArrayList<Card>();

    /**
     * probably creates deck
     */
    public Deck()
    {
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * idk, shuffle?
     */
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
}
