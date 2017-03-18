package sixpack;

/**
 * Created by icyhot on 17/03/2017.
 */
public class Card {

    private String suit;
    private String value;

    public Card(int suitInt, int valueInt) {
        this.suit = setSuit(suitInt);
        this.value = setValue(valueInt);
    }

    private String setSuit(int suitInt) {
        switch(suitInt) {
            case 1:
                return "Clubs";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            case 4:
                return "Diamonds";
            default:
                return null;
        }
    }

    private String setValue(int valueInt) {
        if(valueInt == 1)
            return "Ace";
        else if(valueInt == 11)
            return "Jack";
        else if(valueInt == 12)
            return "Queen";
        else if(valueInt == 13)
            return "King";
        else
            return Integer.toString(valueInt);
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }
}
