package poker.assets; 

public class Card {

    public Suit suit; 
    public int id; 

    public enum Suit {
        HEARTS, 
        CLUBS, 
        DIAMONDS, 
        SPADES
    }

    public enum Type {
        ACE, 
        TWO,
        THREE, 
        FOUR, 
        FIVE, 
        SIX, 
        SEVEN, 
        EIGHT, 
        NINE, 
        TEN, 
        JACK,
        QUEEN, 
        KING
    }

    public Card(Suit suit_, int id_) {
        this.suit = suit_; 
        this.id = id_; 
    }

    public Card(int id_) {
        this.suit = null; 
        this.id = id_; 
    }

    public String idToType(int id_) {
        Type[] idConversionList = {Type.ACE, Type.TWO, Type.THREE, Type.FOUR, Type.FIVE, Type.SIX, Type.SEVEN, Type.EIGHT, Type.NINE, Type.TEN, Type.JACK, Type.QUEEN, Type.KING}; 
        return idConversionList[id_ % 13].toString(); 
    }

    public String toString() {

        return (idToType(this.id).toLowerCase() + " of " + this.suit.toString().toLowerCase()); 
    }
}