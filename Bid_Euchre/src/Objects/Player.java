package Objects;

import java.util.ArrayList;

public class Player {

    private String name, suit;
    private int team, tricks, bidAmount;
    private ArrayList<Card> cards;

    public Player() {};

    public Player(String name, int team, ArrayList<Card> cards, int tricks, int bidAmount, String suit) {
        this.name = name;
        this.team = team;
        this.cards = cards;
        this.tricks = tricks;
        this.bidAmount = bidAmount;
        this.suit = suit;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setTeam(int team) { this.team = team; }
    public int getTeam() { return team; }

    public void setCards(ArrayList<Card> cards) { this.cards = cards; }
    public ArrayList<Card> getCards() { return cards; }

    public void setTricks(int tricks) { this.tricks = tricks; }
    public int getTricks() { return tricks; }

    public void setBidAmount(int bidAmount) { this.bidAmount = bidAmount; }
    public int getBidAmount() { return bidAmount; }

    public void setSuit(String suit) { this.suit = suit; }
    public String getSuit() { return suit; }
}
