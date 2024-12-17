package ie.atu.testpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create teams and add players with skills
        List<Player> team1Players = new ArrayList<>();
        team1Players.add(new Striker("John", 25, 80));  // Skill: 80
        team1Players.add(new Defender("James", 28, 75));  // Skill: 75
        team1Players.add(new Midfielder("Robert", 27, 85));  // Skill: 85

        List<Player> team2Players = new ArrayList<>();
        team2Players.add(new Striker("Alex", 24, 78));  // Skill: 78
        team2Players.add(new Defender("Michael", 26, 77));  // Skill: 77
        team2Players.add(new Midfielder("Chris", 30, 82));  // Skill: 82

        // Create teams
        Team team1 = new Team("Red Devils");
        team1Players.forEach(team1::addPlayer);  // Adding players to team1

        Team team2 = new Team("Blue Sharks");
        team2Players.forEach(team2::addPlayer);  // Adding players to team2

        // Create a Scanner for user input
        Scanner userInput = new Scanner(System.in);

        // Main menu loop
        while (true) {
            // Display Menu to console
            System.out.println("");
            System.out.println("##################################");
            System.out.println("#      Football Team Manager    #");
            System.out.println("##################################");
            System.out.println("(1) Add a Player.");
            System.out.println("(2) Remove a Player.");
            System.out.println("(3) Show Team Information.");
            System.out.println("(4) Simulate Match.");
            System.out.println("(5) Quit.");
            System.out.println("Select an option from 1 to 5 and press Enter>");

            // Store user Menu option selection
            int userSelection = userInput.nextInt();

            // If user selects option 1: Add a Player
            if (userSelection == 1) {
                // Ask user for player details
                System.out.println("Enter Player Name:");
                String playerName = userInput.next();
                System.out.println("Enter Player Age:");
                int playerAge = userInput.nextInt();
                System.out.println("Enter Player Position (Striker, Defender, Midfielder):");
                String playerPosition = userInput.next();
                System.out.println("Enter Player Skill Level (1-100):");
                int playerSkill = userInput.nextInt();

                // Create player based on position
                Player player;
                if (playerPosition.equalsIgnoreCase("Striker")) {
                    player = new Striker(playerName, playerAge, playerSkill);
                } else if (playerPosition.equalsIgnoreCase("Defender")) {
                    player = new Defender(playerName, playerAge, playerSkill);
                } else if (playerPosition.equalsIgnoreCase("Midfielder")) {
                    player = new Midfielder(playerName, playerAge, playerSkill);
                } else {
                    System.out.println("Invalid Position!");
                    continue;
                }

                // Add player to team (you can modify which team based on user input)
                System.out.println("Which team would you like to add the player to? (1) Red Devils (2) Blue Sharks");
                int teamSelection = userInput.nextInt();
                if (teamSelection == 1) {
                    team1.addPlayer(player);
                    System.out.println(player.getName() + " has been added to Red Devils.");
                } else if (teamSelection == 2) {
                    team2.addPlayer(player);
                    System.out.println(player.getName() + " has been added to Blue Sharks.");
                } else {
                    System.out.println("Invalid team selection.");
                }
            }

            // If user selects option 2: Remove a Player
            if (userSelection == 2) {
                System.out.println("Enter Player Name to Remove:");
                String playerNameToRemove = userInput.next();

                // Remove player from both teams
                if (team1.removePlayer(playerNameToRemove)) {
                    System.out.println(playerNameToRemove + " has been removed from Red Devils.");
                } else if (team2.removePlayer(playerNameToRemove)) {
                    System.out.println(playerNameToRemove + " has been removed from Blue Sharks.");
                } else {
                    System.out.println("Player not found.");
                }
            }

            // If user selects option 3: Show Team Information
            if (userSelection == 3) {
                System.out.println("Team 1: " + team1.getTeamName());
                team1.showTeamInfo();  // Shows all players in Team 1

                System.out.println("Team 2: " + team2.getTeamName());
                team2.showTeamInfo();  // Shows all players in Team 2
            }

            // If user selects option 4: Simulate Match
            if (userSelection == 4) {
                // Simulate the match
                Match match = new Match(team1, team2);
                match.simulateMatch();  // Simulate the match
            }

            // If user selects option 5: Quit
            if (userSelection == 5) {
                System.out.println("Application Closing - Goodbye!");
                // Close the User Input Scanner
                userInput.close();
                break;  // Break out of the menu loop
            }
        }
    }
}










