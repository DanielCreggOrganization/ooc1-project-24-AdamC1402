package ie.atu.testpackage;

import java.util.ArrayList;
import java.util.List;

public class FootballTeamManager {

    private List<Player> players;  // List to hold players

    public FootballTeamManager() {
        players = new ArrayList<>();
    }

    // Method to add a player
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getName() + " added to the team.");
    }

    // Method to return total number of players
    public int totalPlayers() {
        return players.size();
    }

    // Method to search for a player by name
    public Player searchPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;  // Return null if player is not found
    }
}

    

