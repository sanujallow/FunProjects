package machine.entities.beverages;

public class Espresso extends CoffeeBev{
    private final int water = 250;
    private final int coffeeBeans = 16;
    private final int milk = 0;

    public static final int cost = 4;
    public Espresso() {
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
