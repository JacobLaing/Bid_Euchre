package Objects;

public class Card {

    private int rank, suit;
    final private String[] SUITS = {"hearts", "spades", "diamonds", "clubs"};
    final private String[] RANKS = {"9", "10", "Jack", "Queen", "King", "Ace"};

    public Card() { }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() { return RANKS[rank]; }
    public void setRank(int rank) { this.rank = rank; }

    public String getSuit() { return SUITS[suit]; }
    public void setSuit(int suit) { this.suit = suit; }
}
