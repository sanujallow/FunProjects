package machine.operations.fill;

import machine.entities.CoffeeMachine;
import machine.operations.Operations;

public class FillCoffee implements Operations {

    CoffeeMachine coffeeMachine;
    int coffeeAmount;

    private FillCoffee(CoffeeMachine coffeeMachine, int coffeeAmount) {
        this.coffeeMachine = coffeeMachine;
        this.coffeeAmount = coffeeAmount;
    }

    public static void of(CoffeeMachine coffeeMachine, int coffeeAmount){
        FillCoffee fillCoffee = new FillCoffee(coffeeMachine,coffeeAmount);
        fillCoffee.execute();
    }

    @Override
    public void execute() {
        int initialCoffee = this.coffeeMachine.getCoffeeBeans();
        this.coffeeMachine.setCoffeeBeans(initialCoffee + this.coffeeAmount);
    }
}
