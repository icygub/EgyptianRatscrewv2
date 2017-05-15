package sixpack;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by icyhot on 17/03/2017.
 */
public class ERS {

    private Deck gameDeck;
    private Hand handOne;
    private Hand handTwo;
    private int handOneScore = 10;
    private int handTwoScore = 10;
    private Scanner sc = new Scanner(System.in);

    public ERS(Deck gameDeck, Hand handOne, Hand handTwo) {
        this.gameDeck = gameDeck;
        this.handOne = handOne;
        this.handTwo = handTwo;
    }

    public void setup() {
        gameDeck.fill();
        gameDeck.shuffle();
        gameDeck.dealToHands(handOne, handTwo);

        System.out.println("Time to play!\n" +
                "Instructions == deal card [Enter] : slap [s]");
        if(handOneGoesFirst() == true)
            playERS(handOne, handTwo);
        else
            playERS(handTwo, handOne);
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
        boolean topIsSpecial = topIsSpecial();
        String choice = getInput(firstHand);
        if(choice.equals("")) {
            firstHand.dealCard(gameDeck);
        }

        return false;
    }

    public boolean topIsSpecial() {
        String topCardValue = gameDeck.getTopCardValue();
        if(topCardValue == "Ace" ||
                topCardValue == "Jack" ||
                topCardValue == "Queen" ||
                topCardValue == "King") {
            return true;
        }
        return false;
    }

    //start the round
    //see if there is a sandwich or double
    //see if there is a special card

    public String getInput (Hand hand){
        if(hand.isComputer() == true)
            return getComputerInput();

        return getHumanInput();

    }

    public String getComputerInput() {
        return "";
    }

    public String getHumanInput() {
        //special card on top of the deck
        //sandwich on top of the deck
        //double on top of the deck
        String input = sc.nextLine();
        return input;
    }
}
