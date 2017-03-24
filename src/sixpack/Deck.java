package sixpack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by icyhot on 17/03/2017.
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

    public Deck() {

    }

    public void fill() {
        for(int suit = 1; suit <= 4; suit++) {
            for(int value = 1; value <= 13; value++) {
                Card card = new Card(suit,value);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
        int source;
        int destination;
        for(int i = 0; i < deck.size(); i++){
            source = (int) (Math.random()*52);
            do{
                //this loop assures that the src and dest are different
                destination = (int) (Math.random()*52);
            }while(source == destination);
            Collections.swap(deck, source, destination);
        }
    }

    /**
     * Deals cards to hands, alternating between hands for every card.
     * @param handOne
     * @param handTwo
     */
    public void dealToHands(Hand handOne, Hand handTwo) {
        int initalDeckSize = deck.size();
        for(int i = 0; i < initalDeckSize; i++) {
            if(i % 2 == 0)
                handOne.addCard(deck.get(deck.size()-1));
            else
                handTwo.addCard(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
    }

    /**
     * Deals cards to a randomly chosen hand. When a hand reaches limit of 26, other hand will receive the excess.
     * @param handOne
     * @param handTwo
     */
    public void dealFreshToHands(Hand handOne, Hand handTwo) {
        int randInt;
        Hand[] hands = {handOne, handTwo};
        final int handLimit = 26; //Half of the deck

        for(int s = 1; s <= 4; s++) { //suits in the deck
            for(int v = 1; v <= 13; v++) { //values in the deck
                randInt = (int) Math.random()*2;

                //if chosen hand has reached limit of 26, then the other hand will receive the new card
                if(hands[randInt].getSize() == handLimit)
                    // 1 0 1. Subtracting 1 and calling abs() will always give other hand.
                    hands[Math.abs(randInt - 1)].addCard(new Card(s , v));
                else
                    hands[randInt].addCard(new Card(s , v));
            }
        }
    }

    /**
     * Deals cards to a random hand. Does not alternate between hands like dealCardsToHands()
     * @param handOne
     * @param handTwo
     */
    public void dealCardsToRandomHands(Hand handOne, Hand handTwo) {
        int randInt;
        for(int i = 0; i < deck.size(); i++) {
            randInt = (int) Math.random()*2;

            if(randInt == 0) {
                handOne.addCard(deck.get(i));
            }
            else
                handTwo.addCard(deck.get(i));
        }
    }

    public void print() {
        for(int i = 0; i < deck.size(); i++) {
            String cardName = deck.get(i).getCardName();
            System.out.println(cardName);
        }
    }

    public int getSize() {
        return deck.size();
    }





}

