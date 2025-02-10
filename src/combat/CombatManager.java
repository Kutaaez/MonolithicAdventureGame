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
        if(!enemies.contains(enemy)){
            System.out.println("Error" + enemy.getEnemyName() + " is not the enemy list.");

        }
        else {
            System.out.println(player.getPlayerName() + " engages in combat with " + enemy.getEnemyName() + "!");
            enemy.attack();
            player.setPlayerHealth(player.getPlayerHealth() - enemy.getEnemyDMG());

            player.setPlayerExperience(player.getPlayerExperience() + enemy.getEnemyXP());

            System.out.println("After combat: Health = " + player.getPlayerHealth() + ", Experience = " + player.getPlayerExperience());
            score.addKE();
            score.addScore(2);
            enemies.remove(enemy);
        }
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

}
