package ie.atu.testpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Match {
    private Team team1;
    private Team team2;
    private Random random;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.random = new Random();
    }

    // Simulate the match
    public void simulateMatch() {
        int team1Score = 0;
        int team2Score = 0;

        // Simulate the match action (e.g., goal attempts, passes, etc.)
        System.out.println("Match started between " + team1.getTeamName() + " and " + team2.getTeamName());

        for (int minute = 1; minute <= 90; minute++) {
            if (minute % 10 == 0) {  // Every 10th minute, attempt a random action
                System.out.println("Minute: " + minute);
                
                // Attempt an action for team 1
                if (attemptAction(team1)) {
                    team1Score++;
                    System.out.println(team1.getTeamName() + " scores a goal!");
                }

                // Attempt an action for team 2
                if (attemptAction(team2)) {
                    team2Score++;
                    System.out.println(team2.getTeamName() + " scores a goal!");
                }
            }
        }

        // Final score
        System.out.println("Match ended!");
        System.out.println(team1.getTeamName() + " " + team1Score + " - " + team2Score + " " + team2.getTeamName());
    }

    // Attempt an action (pass or goal attempt) for a team
    private boolean attemptAction(Team team) {
        Player player;
        // Randomly choose a player from the team
        if (random.nextBoolean()) {
            player = getRandomStriker(team);
        } else {
            player = getRandomMidfielder(team);
        }

        // Randomly decide if the player succeeds in the action based on skill
        System.out.println(player.getName() + " attempts an action!");
        return random.nextInt(100) < player.getSkill();
    }

    // Get a random Striker from the team
    private Player getRandomStriker(Team team) {
        List<Player> strikers = new ArrayList<>();
        for (Player player : team.getPlayers()) {
            if (player.getRole().equalsIgnoreCase("Striker")) {
                strikers.add(player);
            }
        }
        return strikers.get(random.nextInt(strikers.size()));
    }

    // Get a random Midfielder from the team
    private Player getRandomMidfielder(Team team) {
        List<Player> midfielders = new ArrayList<>();
        for (Player player : team.getPlayers()) {
            if (player.getRole().equalsIgnoreCase("Midfielder")) {
                midfielders.add(player);
            }
        }
        return midfielders.get(random.nextInt(midfielders.size()));
    }
}

      


