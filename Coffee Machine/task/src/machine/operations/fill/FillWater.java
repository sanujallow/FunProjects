package machine.operations.fill;

import machine.entities.CoffeeMachine;
import machine.operations.Operations;

public class FillWater implements Operations {
    CoffeeMachine coffeeMachine;
    int waterAmount;

    private FillWater(CoffeeMachine coffeeMachine, int waterAmount) {
        this.coffeeMachine = coffeeMachine;
        this.waterAmount = waterAmount;
    }

    public static void of(CoffeeMachine coffeeMachine, int waterAmount){
        new FillWater(coffeeMachine, waterAmount).execute();
    }

    @Override
    public void execute() {
        int initialWater = coffeeMachine.getWater();
        coffeeMachine.setWater(initialWater + waterAmount);
    }
}
