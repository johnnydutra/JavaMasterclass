package master.challenge;

public class Main {
    public static void main(String[] args) {

        Drink cherryCoke = new Drink("Small Cherry Coke", 1);
        Drink regularCoke = new Drink("Medium Regular Coke",2);
        Drink dietCoke = new Drink("Large Diet Coke", 3);

        cherryCoke.logDescription();
        regularCoke.logDescription();
        dietCoke.logDescription();

        cherryCoke.upsize();
        dietCoke.downsize();

        cherryCoke.logDescription();
        regularCoke.logDescription();
        dietCoke.logDescription();

    }
}
