package machine;

import machine.operations.IngredientCalculator;

import java.util.Scanner;

public class MachineFirstImpl {
    static IngredientCalculator ingredients = new IngredientCalculator();

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.println("Write how many cups of coffee you will need: \n");
////        int numOfCups = sc.nextInt();
////        displayTotalIngredients(numOfCups);
//        System.out.println("Write how many ml of water the coffee machine has: \n");
//        int amtWater = sc.nextInt();
//        System.out.println("Write how many ml of water the coffee machine has: \n");
//        int amtMilk = sc.nextInt();
//        System.out.println("Write how many ml of water the coffee machine has: \n");
//        int amtCoffee = sc.nextInt();
//        System.out.println("Write how many ml of water the coffee machine has: \n");
//        int cupsNeeded = sc.nextInt();
//
//
//        System.out.println(numberOfServings(cupsNeeded, amtWater, amtMilk,amtCoffee ));
//        sc.close();
//    }

    //Stage 3 of 6
    static String numberOfServings(int cupsNeeded, int amtWater, int amtMilk, int amtCoffee) {
        int minNumberOfCups = ingredients.getNumberOfCups(amtWater, amtMilk, amtCoffee);
        int remainder = minNumberOfCups - cupsNeeded;
        String servingsInfo;
        servingsInfo = getServingsInfo(minNumberOfCups, remainder);
        return servingsInfo;
    }

    private static String getServingsInfo(int minNumberOfCups, int remainder) {
        String servingsInfo;
        if (remainder == 0) {
            servingsInfo = "Yes, I can make that amount of coffee";
        } else if (remainder > 0) {
            servingsInfo = "Yes, I can make that amount of coffee (and even " + remainder + " more than that)";
        } else {
            servingsInfo = "No, I can make only " + minNumberOfCups + "cup(s) of coffee";
        }
        return servingsInfo;
    }

    //Stage 2 of 6
    static void displayTotalIngredients(int numOfCups) {
        System.out.println(ingredients.calculateIngredients(numOfCups).get("water") + " ml of water");
        System.out.println(ingredients.calculateIngredients(numOfCups).get("milk") + " ml of milk");
        System.out.println(ingredients.calculateIngredients(numOfCups).get("coffee") + " g of coffee beans");
    }

    //Stage 1 of 6
    static void displayCoffeeStatus() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
    }
}
