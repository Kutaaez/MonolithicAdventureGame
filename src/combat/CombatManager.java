package combat;

import enemies.Enemy;
import player.Player;
import score.ScoreManager;

import java.util.List;

public class CombatManager {
    private List<Enemy> enemies;
    private Player player;
    private ScoreManager score;

    public CombatManager(List<Enemy> enemies, Player player, ScoreManager score) {
        this.enemies = enemies;
        this.player = player;
        this.score = score;
    }

    public void fightEnemy(Enemy enemy) {
        if (player.isDefeated()) {
            System.out.println(player.getPlayerName() + " has perished. Game Over.");
            return;
        }

        if (!enemies.contains(enemy)) {
            System.out.println("Error: " + enemy.getEnemyName() + " is not in the enemy list.");
            return;
        }

        System.out.println(player.getPlayerName() + " engages in combat with " + enemy.getEnemyName() + "!");

        enemy.takeDamage(player.getPlayerDMG());

        enemy.attack();
        player.takeDamage(enemy.getEnemyDMG());

        if (player.isDefeated()) {
            System.out.println(player.getPlayerName() + " has been defeated!");
            return;
        }

        if (enemy.isDefeated()) {
            System.out.println(enemy.getEnemyName() + " has been defeated!");
            player.addPlayerExperience(enemy.getEnemyXP());
            score.addKE();
            score.addScore(2);
            enemies.remove(enemy);
        }

        System.out.println("After combat: Health = " + player.getPlayerHealth() + ", Experience = " + player.getPlayerExperience());
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

}
