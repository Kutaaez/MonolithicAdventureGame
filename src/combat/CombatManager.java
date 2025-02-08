package combat;

import enemies.Enemy;
import player.Player;

import java.util.List;

public class CombatManager {
    private Enemy enemy;
    private List<Enemy> enemies;
    private Player player;


    public void fightEnemy(Enemy enemy) {
        System.out.println(player.getPlayerName() + " engages in combat with " + enemy.getEnemyName() + "!");
        enemy.attack();
        player.setPlayerHealth(player.getPlayerHealth() - enemy.getEnemyDMG());

        player.setPlayerExperience(player.getPlayerExperience() + enemy.getEnemyXP());

        System.out.println("After combat: Health = " + player.getPlayerHealth() + ", Experience = " + player.getPlayerExperience());

        enemies.remove(enemy);
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

}
