package Game;

import Objects.Card;
import Objects.Player;
import Objects.Team;
import Objects.cardDeck;

import java.util.ArrayList;

public class gameBoard {

    private ArrayList<Player> players;
    private Team us;
    private Team them;
    private cardDeck deck;
    private int dealerPosition = -1;
    private ArrayList<Player> dealOrder = new ArrayList<>();
    private boolean isOver = false;
    private int trumpValue = -1;

    final private String[] TRUMPS = {"hearts", "spades", "diamonds", "clubs", "no trump"};
    final static int PLAYERS = 6;

    public gameBoard(ArrayList<Player> players, Team us, Team them, cardDeck deck) {
        this.players = players;
        this.us = us;
        this.them = them;
        this.deck = deck;
    }

    public boolean isOver() {
        return isOver;
    }

    public void startBidding() {
        for (int i = 0; i < PLAYERS; i++) {
            if (i == 0) {

            }
            else {

            }
        }
        isOver = true;
    }

    public void dealCards() {
        findDealer();
        deck.shuffle();
        int player = 0;
        for (int i = 0; i < deck.getSize(); i++) {
            players.get(player).addCard(deck.get(i));
            player++;
            if (player >= PLAYERS) {
                player = 0;
            }
        }
        players.get(dealerPosition).setIsDealer(false);
        if (dealerPosition + 1 >= PLAYERS) {
            players.get(0).setIsDealer(true);
        }
        else {
            players.get(dealerPosition + 1).setIsDealer(true);
        }
    }

    private void findDealer() {
        for (int i = 0; i < PLAYERS; i++) {
            if (players.get(i).getIsDealer()) {
                dealerPosition = i;
            }
        }
        createDealOrder();
    }

    private void createDealOrder() {
        dealOrder.clear();
        for (int i = dealerPosition + 1; i < PLAYERS; i++) {
            dealOrder.add(players.get(i));
        }
        for (int i = 0; i <= dealerPosition; i++) {
            dealOrder.add(players.get(i));
        }
    }

    public String getTrump() { return TRUMPS[trumpValue]; }
}
