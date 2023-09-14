package composition.challenge;

public class DishWasher extends Appliance {

    public DishWasher() {
        super();
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dish washer doing dishes");
        }
        this.hasWorkToDo = false;
    }
}
