package Objects;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class cardDeck extends Card {

    private ArrayList<Card> deck = new ArrayList<>();

    final int RANKS = 6;
    final int SUITS = 4;


    public cardDeck() {
        initialize();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void initialize() {
        for (int rank = 0; rank < RANKS; rank++) {
            for (int suit = 0; suit < SUITS; suit++) {
                Card card = new Card(rank, suit);
                deck.add(card);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public ArrayList<Integer> getFirstThreeJacks() {
        ArrayList<Integer> jacks = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (count < 3) {
                if (deck.get(i).getRank().equals("Jack")) {
                    jacks.add(i);
                    count++;
                }
            }
            else {
                break;
            }
        }
        return jacks;
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

    public int getSize() {
        return deck.size();
    }

    public Card get(int index) {
        return deck.get(index);
    }



}
