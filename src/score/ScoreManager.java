package score;

import combat.CombatManager;
import player.Player;

public class ScoreManager {
     private int score;
     private int killedEnemy;
     public ScoreManager(){
         this.score = 0;
         this.killedEnemy = 0;
     }
     public void addScore(int points){
         score += points;

     }
     public void addKE(){
         killedEnemy++;
     }

    public int getScore() {
        return score;
    }

    public int getKilledEnemy() {
        return killedEnemy;
    }
    //idk zachem nuzhen etot class, but I create something like score player progress,
    //like, how much enemy player killed.
    //and give point for something.
}
