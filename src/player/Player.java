package player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private List<String> inventory;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHealth = 100;
        this.playerExperience = 0;
        this.inventory = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public void setPlayerExperience(int playerExperience) {
        this.playerExperience = playerExperience;
    }

    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(String item) {
        inventory.remove(item);
    }
}
