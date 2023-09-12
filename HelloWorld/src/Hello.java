public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, Johnny");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore > 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagem" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic in our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double firstNumber = 20.00;
        double secondNumber = 80.00;
        double sum = firstNumber + secondNumber;
        double mult = sum * 100.00;
        double remainder = mult % 40.00;

        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println("Is remainder zero? " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder: " + remainder);
        }

    }
}
