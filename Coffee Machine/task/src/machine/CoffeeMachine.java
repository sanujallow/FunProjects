package machine;

import machine.entities.beverages.*;
import machine.operations.buy.Buy;
import machine.operations.fill.*;
import machine.operations.take.Take;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        machine.entities.CoffeeMachine coffeeMachine = new machine.entities.CoffeeMachine();


        Espresso espresso = new Espresso();
        Latte latte = new Latte();
        Cappuccino cappuccino = new Cappuccino();

        HashMap<Integer, CoffeeBev> coffeeBevMenu = new HashMap<>();
        coffeeBevMenu.put(1, espresso);
        coffeeBevMenu.put(2, latte);
        coffeeBevMenu.put(3, cappuccino);

        menuPrompts(coffeeMachine, coffeeBevMenu);

    }

    private static void menuPrompts(machine.entities.CoffeeMachine coffeeMachine, HashMap<Integer, CoffeeBev> coffeeBevMenu) {
//        System.out.println("Write action (buy, fill, take,  remaining, exit):");

        Scanner sc = new Scanner(System.in);
        String action = "go";
        while (!action.equalsIgnoreCase("exit")) {
            System.out.println("Write action (buy, fill, take,  remaining, exit):");

            action = sc.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu :");
                    String selection = sc.nextLine();
                    if (selection.equals("back"))
                        break;
                    else{
                        Buy.order(coffeeMachine, coffeeBevMenu.get(Integer.parseInt(selection)));
                    }

//                    displayLevels(coffeeMachine);
                    break;
                case "fill":
                    fillAction(coffeeMachine, sc);
//                    displayLevels(coffeeMachine);
                    break;
                case "take":
                    Take.from(coffeeMachine);
//                    displayLevels(coffeeMachine);
                    break;
                case "remaining":
                    displayLevels(coffeeMachine);
                    break;
                case "exit":
                    System.exit(0);
            }
        }


        sc.close();
    }

    private static void fillAction(machine.entities.CoffeeMachine coffeeMachine, Scanner sc) {
        System.out.println("Write how many ml of water you want to add:");
        int waterLevel = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milkLevel = sc.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeLevel = sc.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int disposableCupsLevel = sc.nextInt();

        Fill.fillMachine(waterLevel, milkLevel, coffeeLevel, disposableCupsLevel, coffeeMachine);
    }

    static void displayLevels(machine.entities.CoffeeMachine coffeeMachine){
        System.out.println("The coffee machine has:");
        System.out.println(
                coffeeMachine.getWater() + " ml of water\n"
                + coffeeMachine.getMilk()  + " ml of milk\n"
                + coffeeMachine.getCoffeeBeans() + " g of coffee beans\n"
                + coffeeMachine.getDisposableCups() + " disposable cups\n"
                + "$" + coffeeMachine.getAmountOfMoney() + " of money\n"
        );

    }


}
