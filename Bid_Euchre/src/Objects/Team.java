package Objects;

import java.util.ArrayList;

public class Team extends Player {

    private int score, cardsBid;
    private boolean wonBid;
    ArrayList<Player> players = new ArrayList<>();

    public Team () {
        players.clear();
        score = cardsBid = 0;
        wonBid = false;
    }

    public void addPlayer(Player player) { players.add(player); }
    public ArrayList<Player> getPlayers() { return players; }

    public void updateScore(int value) { score += value; }
    public int getScore() { return score; }

    public void setCardsBid(int cardsBid) { this.cardsBid = cardsBid; }
    public int getCardsBid() { return cardsBid; }

    public void setWonBid(boolean value) { wonBid = value; }
    public boolean getWonBid() { return wonBid; }
}