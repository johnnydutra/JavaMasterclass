package challenges;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

    printUserInputSum(5);


    }

    public static void printUserInputSum(int numberQuantity) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int iterator = 1;

        while (iterator <= numberQuantity) {
            System.out.println("Enter number #" + iterator);
            try {
                int input = scanner.nextInt();
                sum += input;
                iterator++;
            } catch (NumberFormatException e) {
                System.out.println("Try again. Only integers are acceptable.");
            }
        }
        System.out.println("Sum: " + sum);
    }
}
