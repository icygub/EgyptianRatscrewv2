package sixpack;

import java.util.Date;

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
        Date date1 = new Date();
        long startTime = date1.getTime();
        //create deck, shuffle, deal between two hands

//        gameDeck.fill();
//        gameDeck.shuffle();
//        gameDeck.dealToHands(handOne, handTwo);


        //or deal cards to random hands, then shuffle both hands
//        gameDeck.dealFreshToHands(handOne, handTwo);
//        handOne.shuffle();
//        handTwo.shuffle();

        Date date2 = new Date();
        long endTime = date2.getTime();
        long totalTime = Math.abs(startTime - endTime);
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.printf("Total time: %d", totalTime);
        System.out.println("\n==========\n==========\n===========\n");

    }


}
