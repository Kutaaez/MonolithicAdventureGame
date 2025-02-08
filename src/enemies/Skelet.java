package enemies;

public class Skelet extends Enemy{

    public Skelet() {
        super("Skeleton", 50, 10, 20);
    }

    public void attack() {
        System.out.println(getEnemyName() + " shoots an arrow!");
    }
}
