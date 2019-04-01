package Objects;

public class Card {

    private int rank, suit;
    private String[] suits = {"hearts", "spades", "diamonds", "clubs"};
    private String[] ranks = {"9", "10", "Jack", "Queen", "King", "Ace"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    protected String getRank() { return ranks[rank]; }
    protected String getSuit() { return suits[suit]; }
}
