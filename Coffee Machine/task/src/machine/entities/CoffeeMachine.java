package machine.entities;


public class CoffeeMachine {
    private int water;
    private int coffeeBeans;
    private int milk;
    private int amountOfMoney;
    private int disposableCups;



    public CoffeeMachine() {
        this.water = 400;
        this.coffeeBeans = 120;
        this.milk = 540;
        this.amountOfMoney = 550;
        this.disposableCups = 9;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "water=" + water +
                ", coffeeBeans=" + coffeeBeans +
                ", milk=" + milk +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }


}
