package Items;

public class HealthElixir  extends Item {

    public HealthElixir() {
        super("Health Elixir", 0, 20);
    }

    @Override
    public void itemEffect() {
        System.out.println("Tastes like cough syrup...");
    }
}
