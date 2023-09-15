package master.challenge;

public class Meal {

    private Burger burger;
    private Drink drink;
    private Side side;

    public Meal() {
        this.burger = new Burger("Cheeseburger", 5.99);
        this.drink = new Drink("Medium Regular Coke", 2);
        this.side = new Side("French Fries", 3.99);
        burger.addTopping1(new Topping("Cheese", 0.50));
    }

    public Meal(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public Meal(Burger burger, Drink drink, Side side, Topping topping1) {
        this(burger, drink, side);
        burger.addTopping1(topping1);
    }

    public Meal(Burger burger, Drink drink, Side side, Topping topping1, Topping topping2) {
        this(burger, drink, side, topping1);
        burger.addTopping2(topping2);
    }

    public Meal(Burger burger, Drink drink, Side side, Topping topping1, Topping topping2, Topping topping3) {
        this(burger, drink, side, topping1, topping2);
        burger.addTopping1(topping3);
    }
}
