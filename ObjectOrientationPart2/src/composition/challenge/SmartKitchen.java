package composition.challenge;

public class SmartKitchen {

    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void addWater() {
        coffeeMaker.setHasWorkToDo(true);
        System.out.println("Adding water to the dishwasher");
    }

    public void pourMilk() {
        refrigerator.setHasWorkToDo(true);
        System.out.println("Pouring milk into the refrigerator");
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
        System.out.println("Loading dishwasher");
    }

    public void setKitchenState(boolean setRefrigerator, boolean setDishWasher, boolean setCoffeeMaker) {
        refrigerator.setHasWorkToDo(setRefrigerator);
        dishWasher.setHasWorkToDo(setDishWasher);
        coffeeMaker.setHasWorkToDo(setCoffeeMaker);
    }

    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }
}
