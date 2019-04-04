package Game;

import Objects.Player;
import Objects.Team;
import Objects.cardDeck;

import java.util.ArrayList;

public class gameBoard {

    private ArrayList<Player> players = new ArrayList<>();
    private Team us;
    private Team them;
    private cardDeck deck;
    private boolean isOver = false;

    public gameBoard(ArrayList<Player> players, Team us, Team them, cardDeck deck) {
        this.players = players;
        this.us = us;
        this.them = them;
        this.deck = deck;
    }

    public boolean isOver() {
        return isOver;
    }
}
