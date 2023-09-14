package master.exercise;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {

        System.out.println(name + " hamburger on a " +
                breadRollType + " roll with " +
                meat + ", price is " + price);

        double totalPrice = price;

        if (addition1Name != null) {
            totalPrice += addition1Price;
        }

        if (addition2Name != null) {
            totalPrice += addition2Price;
        }

        if (addition3Name != null) {
            totalPrice += addition3Price;
        }

        if (addition4Name != null) {
            totalPrice += addition4Price;
        }

        return totalPrice;
    }
}
