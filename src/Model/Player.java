package Model;

public class Player {

    public Player() {

    }

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    private int playerID;
    private String name;
    private int health;

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
