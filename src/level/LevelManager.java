package level;

import Items.GoldCoin;
import Items.HealthElixir;
import Items.Item;
import Items.MagicScroll;
import enemies.Enemy;
import enemies.Skelet;
import enemies.Vampire;
import enemies.Zombie;

import java.util.ArrayList;
import java.util.List;

public class LevelManager {
    private int currentLevel;
    private List<Enemy> enemies;
    private List<Item> items;

    public LevelManager() {
        this.currentLevel = 1;
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
        initLevel();
    }

    public void advanceLevel(){
        currentLevel++;
        System.out.println("Advancing to level " + currentLevel + "...");
        initLevel();
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<Item> getItems() {
        return items;
    }

    public void initLevel(){
        enemies.clear();
        items.clear();
        switch (currentLevel){
            case 1:
                enemies.add(new Skelet());
                enemies.add(new Zombie());
                items.add(new GoldCoin());
                items.add(new HealthElixir());
                break;
            case 2:
                enemies.add(new Vampire());
                items.add(new MagicScroll());
                break;
            case 3:
                enemies.add(new Vampire());
                enemies.add(new Zombie());
                enemies.add(new Skelet());
                items.add(new HealthElixir());
                items.add(new GoldCoin());
                break;
            default:
                System.out.println("No more lvl. Games complete!");
        }

    }
}
