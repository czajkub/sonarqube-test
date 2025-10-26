package lab3;

import java.util.ArrayList;

public class Player {
    public ArrayList<Card> cards =  new ArrayList<>();

    /**
     * add card
     * @param card card
     */
    public void addCard(Card card)
    {
        cards.add(card);
    }

    /**
     * show cards
     */
    public void showCards()
    {
        for (Card card : cards)
        {
            System.out.println(card.rank + " of " +  card.suit);
        }
    }
}
