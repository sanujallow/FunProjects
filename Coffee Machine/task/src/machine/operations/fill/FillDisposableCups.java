package machine.operations.fill;

import machine.entities.CoffeeMachine;
import machine.operations.Operations;

public class FillDisposableCups implements Operations {
    CoffeeMachine coffeeMachine;
    int disposableCups;

    private FillDisposableCups(CoffeeMachine coffeeMachine, int disposableCups) {
        this.coffeeMachine = coffeeMachine;
        this.disposableCups = disposableCups;
    }

    public static void of(CoffeeMachine coffeeMachine, int disposableCups){
        new FillDisposableCups(coffeeMachine, disposableCups).execute();
    }

    @Override
    public void execute() {
        int initialCups = this.coffeeMachine.getDisposableCups();
        this.coffeeMachine.setDisposableCups(initialCups + this.disposableCups);
    }
}
