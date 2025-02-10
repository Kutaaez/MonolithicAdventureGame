package player;

import Items.Item;
import combat.IAttackable;

import java.util.ArrayList;
import java.util.List;

public class Player implements IAttackable {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private int playerDMG;
    private List<Item> inventory;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHealth = 100;
        this.playerExperience = 0;
        this.inventory = new ArrayList<>();
        this.playerDMG = 50;
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

    public void addPlayerExperience(int EXP) {
        this.playerExperience += EXP;
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }
    @Override
    public void takeDamage(int damage) {
        this.playerHealth -= damage;
    }

    public int getPlayerDMG() {
        return playerDMG;
    }

    @Override
    public boolean isDefeated() {
        return playerHealth <= 0;
    }
}
