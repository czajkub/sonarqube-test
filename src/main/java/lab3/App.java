package lab3;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * simulate shuffling deck and uhh yeah
     * @param args args args
     */
    public static void main( String[] args )
    {
        Deck deck = new Deck();
        deck.shuffle();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        ArrayList<Player> players =  new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        for (int i=0;i<players.size();i++) {
            for(int j=0;j<5;j++) {
                players.get(i).addCard(deck.cards.get(i*5+j));
            }
        }
        p1.showCards();
    }
}
