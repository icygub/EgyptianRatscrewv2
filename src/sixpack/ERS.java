package sixpack;

/**
 * Created by icyhot on 17/03/2017.
 */
public class ERS {

    private Deck gameDeck;
    private Hand handOne;
    private Hand handTwo;

    public ERS(Deck gameDeck, Hand handOne, Hand handTwo) {
        this.gameDeck = gameDeck;
        this.handOne = handOne;
        this.handTwo = handTwo;
    }

    public void setup() {
        gameDeck.fill();
        gameDeck.printDeck();
        //gameDeck.shuffle();
        //gameDeck.dealCardsToHands();
    }


}
