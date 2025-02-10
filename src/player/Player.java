package player;

import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private List<Item> inventory;

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

    public List<Item> getInventory() {
        return inventory;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public void setPlayerExperience(int playerExperience) {
        this.playerExperience = playerExperience;
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }
}
