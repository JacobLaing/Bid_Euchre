package Game;

import Objects.Player;
import Objects.Team;

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
    }
}
