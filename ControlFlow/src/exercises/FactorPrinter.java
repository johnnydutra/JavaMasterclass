package exercises;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactorsFor(6);
        printFactorsFor(32);
        printFactorsFor(10);
        printFactorsFor(-1);

        printFactorsWhile(6);
        printFactorsWhile(32);
        printFactorsWhile(10);
        printFactorsWhile(-1);
    }

    public static void printFactorsFor(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printFactorsWhile(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int iterator = 1;
        while (iterator <= number) {
            if (number % iterator == 0) {
                System.out.println(iterator);
            }
            iterator++;
        }
    }
}
