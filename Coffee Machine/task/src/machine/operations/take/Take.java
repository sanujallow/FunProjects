package machine.operations.take;

import machine.entities.CoffeeMachine;
import machine.operations.Operations;

public class Take implements Operations {
    CoffeeMachine coffeeMachine;
    int moneyTaken;

    private Take(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    public static void from (CoffeeMachine coffeeMachine){
        new Take(coffeeMachine).execute();
    }
    @Override
    public void execute() {
        this.moneyTaken = coffeeMachine.getAmountOfMoney();
        coffeeMachine.setAmountOfMoney(0);
        System.out.println("I gave you $" + this.moneyTaken);

    }

    public int takeMoney(){

        return coffeeMachine.getAmountOfMoney();
    }
}
