package Game;

import Objects.Card;
import Objects.Player;
import Objects.Team;
import Objects.cardDeck;

import java.util.ArrayList;
import java.util.Scanner;

public class gameMain {

    final static int PLAYERS = 6;

    private Team us, them;

    public static void main(String[] args) {

        Player player1, player2, player3, player4, player5, player6;
        player1 = new Player("Player 1", 0, null, 0, 0, null);
        player2 = new Player("Player 2", 0, null, 0, 0, null);
        player3 = new Player("Player 3", 0, null, 0, 0, null);
        player4 = new Player("Player 4", 0, null, 0, 0, null);
        player5 = new Player("Player 5", 0, null, 0, 0, null);
        player6 = new Player("Player 6", 0, null, 0, 0, null);
        Player[] players = {player1, player2, player3, player4, player5, player6};

        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < PLAYERS; i++) {
            String name = "";
            while (name.isEmpty()) {
                System.out.print("Enter player " + (i + 1) + "'s name: ");
                name = reader.next();
            }
            players[i].setName(name);
        }
        reader.close();

        cardDeck deck = new cardDeck();
        deck.printDeck();
        ArrayList<Integer> firstThreeJacks = deck.getFirstThreeJacks();
        for (int jackLocation : firstThreeJacks) {
            switch (jackLocation) {
                case 0:
                case 6:
                case 12:
                case 18:
                case 24:
                case 30:
                case 36:
                case 42:
                    //player2
                    break;
                case 1:
                case 7:
                case 13:
                case 19:
                case 25:
                case 31:
                case 37:
                case 43:
                    //player3
                    break;
                case 2:
                case 8:
                case 14:
                case 20:
                case 26:
                case 32:
                case 38:
                case 44:
                    //player4
                    break;
                case 3:
                case 9:
                case 15:
                case 21:
                case 27:
                case 33:
                case 39:
                case 45:
                    //player5
                    break;
                case 4:
                case 10:
                case 16:
                case 22:
                case 28:
                case 34:
                case 40:
                case 46:
                    //player6
                    break;
                case 5:
                case 11:
                case 17:
                case 23:
                case 29:
                case 35:
                case 41:
                case 47:
                    //player1
                    break;
            }
        }
        System.out.println(firstThreeJacks.toString());
    }
}
