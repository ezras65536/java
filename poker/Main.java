package poker;

import poker.assets.Card; 
import poker.assets.CardSystem;
import poker.assets.Card.Suit; 
import poker.assets.Player;

@SuppressWarnings("unused")
public class Main {
    public static int players = 1; 
    public static int n = 5; 
    public static void main(String[] args) {

        CardSystem cards = new CardSystem(2 * (players + n) + 1); 

        int[] nums = cards.generateIDs(); 
        cards.genCardsFromIDs(nums);

        Player p = new Player(null, 0); 
        Player[] p2 = new Player[n];

        for (int i = 0; i < n; i++) {
            p2[i] = new Player("p" + (i + 1), i + 1); 
        }
    }    
}