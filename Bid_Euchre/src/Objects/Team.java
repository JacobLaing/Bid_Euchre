package Objects;

import java.util.ArrayList;

public class Team extends Player {

    private Player player1, player2, player3;
    private int score, cardsBid;
    private boolean wonBid;

    public Team (Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        score = cardsBid = 0;
        wonBid = false;
    }

    protected ArrayList<Player> getPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        return players;
    }

    protected void updateScore(int value) { score += value; }
    protected int getScore() { return score; }

    protected void setCardsBid(int cardsBid) { this.cardsBid = cardsBid; }
    protected int getCardsBid() { return cardsBid; }

    protected void setWonBid(boolean value) { wonBid = value; }
    protected boolean getWonBid() { return wonBid; }
}