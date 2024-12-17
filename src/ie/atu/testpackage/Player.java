package ie.atu.testpackage;

public class Player {
    private String name;
    private int age;
    private String position;  // Role (Striker, Defender, Midfielder)
    private int skill;        // Skill rating (arbitrary for simulation)

    // Constructor
    public Player(String name, int age, String position, int skill) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.skill = skill;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSkill() {
        return skill;
    }

    public String getRole() {
        return position;
    }
}









    

