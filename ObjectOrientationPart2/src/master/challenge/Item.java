package master.challenge;

public class Item {

    private String type;
    protected double price;

    public Item(String type) {
        this.type = type;
    }

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return type + ": $" + price;
    }

    public void logDescription() {
        System.out.println(getDescription());
    }
}
