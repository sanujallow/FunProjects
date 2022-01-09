package machine.operations.fill;

import machine.entities.CoffeeMachine;
import machine.operations.Operations;

public class Fill implements Operations {
    int waterAmount;
    int milkAmount;
    int coffeeBeanAmount;
    int disposableCups;
    CoffeeMachine coffeeMachine;


    public Fill(int waterAmount, int milkAmount, int coffeeBeanAmount, int disposableCups, CoffeeMachine coffeeMachine) {
        this.waterAmount = waterAmount;
        this.milkAmount = milkAmount;
        this.coffeeBeanAmount = coffeeBeanAmount;
        this.disposableCups = disposableCups;
        this.coffeeMachine = coffeeMachine;
        execute();
    }

    @Override
    public void execute() {
        FillWater.of(coffeeMachine, waterAmount);
        FillMilk.of(coffeeMachine, milkAmount);
        FillCoffee.of(coffeeMachine, coffeeBeanAmount);
        FillDisposableCups.of(coffeeMachine, disposableCups);
    }

    public static void fillMachine(int waterAmount, int milkAmount, int coffeeBeanAmount, int disposableCups, CoffeeMachine coffeeMachine){
       new Fill(waterAmount, milkAmount,coffeeBeanAmount, disposableCups, coffeeMachine);
    }
}
