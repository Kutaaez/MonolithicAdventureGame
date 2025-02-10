package enemies;


import combat.IAttackable;

    public abstract class Enemy implements IAttackable {
        private String enemyName;
        private int enemyHP;
        private int enemyDMG;
        private int enemyXP;

    public Enemy(String enemyName, int enemyHP, int enemyDMG, int enemyXP) {
        this.enemyName = enemyName;
        this.enemyHP = enemyHP;
        this.enemyDMG = enemyDMG;
        this.enemyXP = enemyXP;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public int getEnemyDMG() {
        return enemyDMG;
    }

    public int getEnemyXP() {
        return enemyXP;
    }
    public abstract  void attack();
        @Override
        public void takeDamage(int damage) {
            this.enemyHP -= damage;
        }

        @Override
        public boolean isDefeated() {
            return enemyHP <= 0;
        }
}

