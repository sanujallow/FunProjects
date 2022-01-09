package machine.operations;

import java.util.HashMap;
import java.util.Map;

public class IngredientCalculator {
    private static int numberOfCups;
    private String water = "water", milk = "milk", coffee = "coffee";
    private Map<String, Integer> cupOfCoffee;

    public IngredientCalculator() {
        this.numberOfCups = numberOfCups;
        cupOfCoffee = new HashMap<>();
        cupOfCoffee.put(water, 200);
        cupOfCoffee.put(milk, 50);
        cupOfCoffee.put(coffee, 15);
    }

    public Map<String, Integer> calculateIngredients(int numOfCups) {
        Map<String, Integer> newIngredients = new HashMap<>();
        for (var i : cupOfCoffee.keySet()) {
            Integer newVal = cupOfCoffee.get(i) * numOfCups;
            newIngredients.put(i, newVal);
        }
        return newIngredients;
    }

    public int getNumberOfCups(int w, int milk, int coffee) {
            int waterLevel = w / cupOfCoffee.get("water");
            int milkLevel = milk / cupOfCoffee.get("milk");
            int coffeeLevel = coffee / cupOfCoffee.get("coffee");
           return Math.min(Math.min(waterLevel, milkLevel), coffeeLevel);
    }
}
