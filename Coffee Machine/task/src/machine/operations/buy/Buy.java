package machine.operations.buy;


import machine.entities.CoffeeMachine;
import machine.entities.beverages.CoffeeBev;
import machine.operations.Operations;

public class Buy implements Operations {
    private CoffeeMachine coffeeMachine;
    private CoffeeBev beverage;

    private Buy(CoffeeMachine coffeeMachine, CoffeeBev beverage) {
        this.coffeeMachine = coffeeMachine;
        this.beverage = beverage;
    }

    public static void order(CoffeeMachine coffeeMachine, CoffeeBev beverage){
        new Buy(coffeeMachine, beverage).execute();
    }

    @Override
    public void execute() {
        if (!(isEnoughWater() && isEnoughMilk() && isEnoughCoffee()))
            return;
        coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() - beverage.getCoffeeBeans());
        coffeeMachine.setWater(coffeeMachine.getWater() - beverage.getWater());
        coffeeMachine.setMilk(coffeeMachine.getMilk() - beverage.getMilk());
        coffeeMachine.setDisposableCups(coffeeMachine.getDisposableCups() -1);
        coffeeMachine.setAmountOfMoney(coffeeMachine.getAmountOfMoney() + beverage.getCost());
        System.out.println("I have enough resources, making you a coffee!");
    }



    private boolean isEnoughWater() {
        if(coffeeMachine.getWater() - beverage.getWater() < 0){
            System.out.println("sorry not enough water");
            return false;
        }
        return true;
    }

    private boolean isEnoughMilk() {
        if(coffeeMachine.getMilk() - beverage.getMilk() < 0){
            System.out.println("sorry not enough milk");
            return false;
        }
        return true;
    }

    private boolean isEnoughCoffee() {
        if (coffeeMachine.getCoffeeBeans() - beverage.getCoffeeBeans() < 0){
            System.out.println("sorry not enough coffee");
            return false;

        }
        return true;
    }


}
