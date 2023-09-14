package composition.challenge;

public class Refrigerator extends Appliance {

    public Refrigerator() {
        super();
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Refrigerator ordering food");
        }
        this.hasWorkToDo = false;
    }
}
