package poker.assets;

import poker.assets.Card;
import poker.assets.Card.Suit; 

@SuppressWarnings("unused")
public class CardSystem {

    public int decks;
    public Card[] cards; 

    public CardSystem(int Decks) {
        this.decks = Decks; 
        this.cards = new Card[52 * Decks]; 

    }

    public void genCardsFromIDs(int[] idList) {
        for (int i = 0; i < idList.length; i++) {
            this.cards[i] = new Card(i); 
            if ((i % 52) <= 12) {
                this.cards[i].suit = Suit.HEARTS;
            } else if ((12 < (i % 52)) && ((i % 52) <= 25)) {
                this.cards[i].suit = Suit.CLUBS;
            } else if ((25 < (i % 52)) && ((i % 52) <= 38)) {
                this.cards[i].suit = Suit.DIAMONDS;
            } else if ((38 < (i % 52)) && ((i % 52) <= 51)) {
                this.cards[i].suit = Suit.SPADES;
            }
        }
        
    }

    public int[] generateIDs() {

        int[] IDs = new int[52 * this.decks]; 

        for (int i = 0; i < (52 * this.decks); i++) {
            IDs[i] = i; 
        }

        return IDs; 
    }

    public Card getRandom() {
        return this.cards[(int)(Math.random() * this.decks * 52)]; 
    }
}
