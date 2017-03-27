package sixpack;

import java.util.Date;

/**
 * Created by icyhot on 17/03/2017.
 */
public class ERS {

    private Deck gameDeck;
    private Hand handOne;
    private Hand handTwo;
    private int handOneScore = 10;
    private int handTwoScore = 10;

    public ERS(Deck gameDeck, Hand handOne, Hand handTwo) {
        this.gameDeck = gameDeck;
        this.handOne = handOne;
        this.handTwo = handTwo;
    }

    public void setup() {
        gameDeck.fill();
        gameDeck.shuffle();
        gameDeck.dealToHands(handOne, handTwo);

        boolean handOneGoesFirst = handOneGoesFirst();
        System.out.println("Time to play!\n" +
                "Instructions == deal card [Enter] : slap [s]");
        if(handOneGoesFirst == true)
            playERS(handOne, handTwo);
        else
            playERS(handOne, handTwo);
    }

    public boolean handOneGoesFirst() {
        int randInt = 0;//(int) Math.random()*2;
        if(randInt == 0)
            return true;
        return false;
    }

    public void playERS(Hand firstHand, Hand secondHand) {
        do{
            playRound(firstHand, secondHand);

        }while(handOneScore > 0 && handTwoScore > 0);

        if(handOneScore == 0) {
            //hand two wins
        }
        else{
            //hand one wins
        }
    }

    public boolean playRound(Hand firstHand, Hand secondHand) {
        String choice = firstHand.getInput();
        if(choice.equals("")) {
            firstHand.dealCard(gameDeck);

        }

        return false;
    }
}
