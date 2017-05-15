package sixpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by icyhot on 17/03/2017.
 */
public class Hand{

    private String playerName;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean isComputer;
    private Scanner sc = new Scanner(System.in);

    public Hand(String playerName, boolean isComputer) {
        this.playerName = playerName;
        this.isComputer = isComputer;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getSize() {
        return hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void shuffle() {
        int source;
        int destination;
        for(int i = 0; i < hand.size(); i++){
            source = (int) (Math.random()*26);
            do{
                //this loop assures that the src and dest are different
                destination = (int) (Math.random()*26);
            }while(source == destination);
            Collections.swap(hand, source, destination);
        }
    }

    public void print() {
        for(int i = 0; i < hand.size(); i++) {
            String cardName = hand.get(i).getCardName();
            System.out.println(cardName);
        }
        System.out.println("==============\n==============");
    }

    public void dealCard(Deck deck) {
        deck.add(hand.get(hand.size()-1)); //adds top card of hand to the deck
        System.out.println("******" + hand.get(hand.size()-1).getCardName());
        hand.remove(hand.size()-1); //removes top card from hand
    }

    public boolean isComputer() {
        return isComputer;
    }

}
