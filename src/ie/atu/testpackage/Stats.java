package ie.atu.testpackage;

public class Stats {
    private int goals;
    private int assists;
    private int matchesPlayed;

    public Stats(int goals, int assists, int matchesPlayed) {
        this.goals = goals;
        this.assists = assists;
        this.matchesPlayed = matchesPlayed;
    }

    public void addGoal() {
        goals++;
    }

    public void addAssist() {
        assists++;
    }

    public void incrementMatchesPlayed() {
        matchesPlayed++;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    @Override
    public String toString() {
        return "Goals: " + goals + ", Assists: " + assists + ", Matches Played: " + matchesPlayed;
    }
}

