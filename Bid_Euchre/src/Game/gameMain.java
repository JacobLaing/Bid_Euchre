package Game;

import Objects.Card;
import Objects.Player;
import Objects.Team;
import Objects.cardDeck;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class gameMain {

    final static int PLAYERS = 6;
    private final static ArrayList<Integer> PLAYER1VALUES = new ArrayList<>(Arrays.asList(5, 11, 17, 23, 29, 35, 41, 47));
    private final static ArrayList<Integer> PLAYER2VALUES = new ArrayList<>(Arrays.asList(0, 6, 12, 18, 24, 30, 36, 42));
    private final static ArrayList<Integer> PLAYER3VALUES = new ArrayList<>(Arrays.asList(1, 7, 13, 19, 25, 31, 37, 43));
    private final static ArrayList<Integer> PLAYER4VALUES = new ArrayList<>(Arrays.asList(2, 8, 14, 20, 26, 32, 38, 44));
    private final static ArrayList<Integer> PLAYER5VALUES = new ArrayList<>(Arrays.asList(3, 9, 15, 21, 27, 33, 39, 45));
    private final static ArrayList<Integer> PLAYER6VALUES = new ArrayList<>(Arrays.asList(4, 10, 16, 22, 28, 34, 40, 46));
    private static ArrayList<Player> players = new ArrayList<>();
    private static Team us, them;

    private static void setTeams(ArrayList<Integer> firstJacks) {
        for (int i = 0; i < 3; i++) {
            boolean playerAdded = false;
            while (!playerAdded) {
                if (PLAYER2VALUES.contains(firstJacks.get(i))) {
                    if (players.get(1).getTeam() != 1) {
                        players.get(1).setTeam(1);
                        playerAdded = true;
                        if (i == 0) {
                            players.get(1).setIsDealer(true);
                        }
                    }
                    else {
                        firstJacks.set(i, firstJacks.get(i) + 1);
                    }
                }
                if (PLAYER3VALUES.contains(firstJacks.get(i))) {
                    if (players.get(2).getTeam() != 1) {
                        players.get(2).setTeam(1);
                        playerAdded = true;
                        if (i == 0) {
                            players.get(2).setIsDealer(true);
                        }
                    }
                    else {
                        firstJacks.set(i, firstJacks.get(i) + 1);
                    }
                }
                if (PLAYER4VALUES.contains(firstJacks.get(i))) {
                    if (players.get(3).getTeam() != 1) {
                        players.get(3).setTeam(1);
                        playerAdded = true;
                        if (i == 0) {
                            players.get(3).setIsDealer(true);
                        }
                    }
                    else {
                        firstJacks.set(i, firstJacks.get(i) + 1);
                    }
                }
                if (PLAYER5VALUES.contains(firstJacks.get(i))) {
                    if (players.get(4).getTeam() != 1) {
                        players.get(4).setTeam(1);
                        playerAdded = true;
                        if (i == 0) {
                            players.get(4).setIsDealer(true);
                        }
                    }
                    else {
                        firstJacks.set(i, firstJacks.get(i) + 1);
                    }
                }
                if (PLAYER6VALUES.contains(firstJacks.get(i))) {
                    if (players.get(5).getTeam() != 1) {
                        players.get(5).setTeam(1);
                        playerAdded = true;
                        if (i == 0) {
                            players.get(5).setIsDealer(true);
                        }
                    }
                    else {
                        firstJacks.set(i, firstJacks.get(i) + 1);
                    }
                }
                if (PLAYER1VALUES.contains(firstJacks.get(i))) {
                    if (players.get(0).getTeam() != 1) {
                        players.get(0).setTeam(1);
                        playerAdded = true;
                        if (i == 0) {
                            players.get(0).setIsDealer(true);
                        }
                    }
                    else {
                        firstJacks.set(i, firstJacks.get(i) + 1);
                    }
                }
            }
        }
        for (Player player : players) {
            if (player.getTeam() == 1) {
                them.addPlayer(player);
            }
            else {
                us.addPlayer(player);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < PLAYERS; i++) {
            players.add(new Player("Player " + (i + 1), 0, null, 0, 0, null, false));
        }
        us = new Team();
        them = new Team();

        /*
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
        */

        cardDeck deck = new cardDeck();
        ArrayList<Integer> firstThreeJacks = deck.getFirstThreeJacks();
        setTeams(firstThreeJacks);

        System.out.println(firstThreeJacks.toString());
        System.out.println();
        System.out.println("US:");
        for (Player player : us.getPlayers()) {
            System.out.println(player.getName() + " " + player.getIsDealer());
        }
        System.out.println();
        System.out.println("THEM:");
        for (Player player : them.getPlayers()) {
            System.out.println(player.getName() + " " + player.getIsDealer());
        }
    }
}
