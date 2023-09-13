package composition.challenge;

public class CoffeeMaker extends Appliance {

    public CoffeeMaker() {
        super();
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee maker brewing coffee");
        }
        this.hasWorkToDo = false;
    }
}
