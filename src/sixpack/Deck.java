package sixpack;

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
        for(int i=0; i<deck.size(); i++){
            source = (int) (Math.random()*52);
            do{
                destination = (int) (Math.random()*52);
            }while(source == destination);
            Collections.swap(deck, source, destination);
        }
    }

    public void dealCardsToHands() {

    }

    public void printDeck() {
        for(int i = 0; i < deck.size(); i++) {
            String cardName = deck.get(i).getCardName();
            System.out.println(cardName);
        }
    }





}

