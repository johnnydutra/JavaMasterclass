package master.challenge;

public class Burger extends Item {

    private Topping topping1;
    private Topping topping2;
    private Topping topping3;

    public Burger(String type, double price) {
        super(type, price);
    }

//    public Burger(String type, double price, Topping topping1) {
//        this(type, price);
//        this.topping1 = topping1;
//    }
//
//    public Burger(String type, double price, Topping topping1, Topping topping2) {
//        this(type, price, topping1);
//        this.topping2 = topping2;
//    }
//
//    public Burger(String type, double price, Topping topping1, Topping topping2, Topping topping3) {
//        this(type, price, topping1, topping2);
//        this.topping3 = topping3;
//    }

    public void addTopping1(Topping topping) {
        this.topping1 = topping;
    }

    public void addTopping2(Topping topping) {
        this.topping2 = topping;
    }

    public void addTopping3(Topping topping) {
        this.topping3 = topping;
    }

    public Topping getTopping1() {
        return topping1;
    }

    public Topping getTopping2() {
        return topping2;
    }

    public Topping getTopping3() {
        return topping3;
    }
}
