package exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Input a number");
            int input = scanner.nextInt();
            try {

            } catch (NumberFormatException) {
                long average = (long) Math.round(sum / count);
                System.out.println("SUM = " + sum + " AVG = " + "");
            }


        }
    }
}
