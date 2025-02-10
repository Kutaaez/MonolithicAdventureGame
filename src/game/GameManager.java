package game;

import Items.Item;
import Items.ItemManager;
import combat.CombatManager;
import enemies.Enemy;
import level.LevelManager;
import player.Player;
import score.ScoreManager;

import java.util.List;

public class GameManager {
    private final Player player;
    private final LevelManager level;
    private final ScoreManager score;
    private final CombatManager combat;
    private final ItemManager itemManager;

    public GameManager(String playerName) {
        this.player = new Player(playerName);
        this.level = new LevelManager();
        this.score = new ScoreManager();
        this.combat = new CombatManager(level.getEnemies(), player, score);
        this.itemManager = new ItemManager(level.getItems(), player, score);
    }

    public void playGame() {
        while (level.getCurrentLevel() <= 3 && player.getPlayerHealth() > 0) {
            if (level.getCurrentLevel() == 3) {
                break;
            }
            processLevel();
        }
        printGameResult();
    }

    private void processLevel() {
        System.out.println("=== Level " + level.getCurrentLevel() + " ===");
        processEnemies();
        processItems();
        if (player.getPlayerHealth() > 0 && level.getCurrentLevel() < 3) {
            level.advanceLevel();
        }
    }

    private void processEnemies() {
        List<Enemy> enemies = level.getEnemies();
        while (!enemies.isEmpty() && player.getPlayerHealth() > 0) {
            combat.fightEnemy(enemies.get(0));
        }
    }

    private void processItems() {
        List<Item> items = level.getItems();
        while (!items.isEmpty() && player.getPlayerHealth() > 0) {
            itemManager.pickUpItem(items.get(0));
        }
    }

    private void printGameResult() {
        if (player.getPlayerHealth() <= 0) {
            System.out.println(player.getPlayerName() + " has perished. Game Over.");
        } else {
            System.out.println("Congratulations, " + player.getPlayerName() + "! You completed the adventure with "
                    + player.getPlayerExperience() + " experience points! " + score.getScore() + " points "
                    + score.getKilledEnemy() + " killed enemies.");
        }
    }
}
