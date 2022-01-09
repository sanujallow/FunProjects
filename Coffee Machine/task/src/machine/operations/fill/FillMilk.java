package machine.operations.fill;

import machine.entities.CoffeeMachine;
import machine.operations.Operations;

public class FillMilk implements Operations {

    CoffeeMachine coffeeMachine;
    int milkAmount;

    private FillMilk(CoffeeMachine coffeeMachine, int milkAmount) {
        this.coffeeMachine = coffeeMachine;
        this.milkAmount  = milkAmount;
    }

    public static void of(CoffeeMachine coffeeMachine, int milkAmount){
        new FillMilk(coffeeMachine, milkAmount).execute();
    }

    @Override
    public void execute() {
        int initialMilk = this.coffeeMachine.getMilk();
        this.coffeeMachine.setMilk(initialMilk + this.milkAmount);
    }
}
