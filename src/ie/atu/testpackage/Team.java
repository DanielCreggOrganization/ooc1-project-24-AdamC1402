package ie.atu.testpackage;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Get the team name
    public String getTeamName() {
        return teamName;
    }

    // Add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Remove a player from the team
    public boolean removePlayer(String playerName) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                players.remove(player);
                return true;
            }
        }
        return false;  // Player not found
    }

    // Get all players in the team
    public List<Player> getPlayers() {
        return players;
    }

    // Show information about all players in the team
    public void showTeamInfo() {
        if (players.isEmpty()) {
            System.out.println("No players in this team.");
        } else {
            System.out.println("Team: " + teamName);
            for (Player player : players) {
                System.out.println(player.getName() + " (" + player.getRole() + ") - Skill: " + player.getSkill());
            }
        }
    }
}











