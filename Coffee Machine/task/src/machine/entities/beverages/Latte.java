package machine.entities.beverages;

public class Latte extends CoffeeBev{
    private final int water = 350;
    private final int coffeeBeans = 20;
    private final int milk = 75;

    public static final int cost = 7;

    public Latte() {
        super(cost);
    }

    @Override
    public int getWater() {
        return water;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    public int getMilk() {
        return milk;
    }
}
