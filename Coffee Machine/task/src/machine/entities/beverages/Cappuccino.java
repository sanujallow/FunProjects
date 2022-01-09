package machine.entities.beverages;

public class Cappuccino extends CoffeeBev {
    private final int water = 200;
    private final int coffeeBeans = 12;
    private final int milk = 100;
    public static final int cost = 6;

    public Cappuccino() {
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
