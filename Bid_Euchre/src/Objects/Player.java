package Objects;

import java.util.ArrayList;

public class Player {

    private String name, suit = "";
    private int team, tricks, bidAmount = 0;
    private boolean isDealer = false;
    private ArrayList<Card> cards = new ArrayList<>();

    private final static int NUMCARDS = 8;
    final private String[] SUITS = {"hearts", "spades", "diamonds", "clubs"};

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setTeam(int team) { this.team = team; }
    public int getTeam() { return team; }

    public void addCard(Card card) { cards.add(card); }
    public ArrayList<Card> getCards() { return cards; }

    public void setTricks(int tricks) { this.tricks = tricks; }
    public int getTricks() { return tricks; }

    public void setBidAmount(int bidAmount) { this.bidAmount = bidAmount; }
    public int getBidAmount() { return bidAmount; }

    public void setSuit(String suit) { this.suit = suit; }
    public String getSuit() { return suit; }

    public void setIsDealer(boolean isDealer) { this.isDealer = isDealer; }
    public boolean getIsDealer() { return isDealer; }

    public void orderCards() {
        /*
        ArrayList<Card> orderedCards = new ArrayList<>();
        int suit = 0;
        while (orderedCards.size() < NUMCARDS) {
            for (int i = 0; i < NUMCARDS; i++) {
                for (int j = 0; j < orderedCards.size(); j++) {

                }
            }
            suit++;
        }
        */
    }
}
