package sixpack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by icyhot on 17/03/2017.
 */
public class Hand{

    private String playerName;
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand(String playerName) {
        super();
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
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
    }
}
