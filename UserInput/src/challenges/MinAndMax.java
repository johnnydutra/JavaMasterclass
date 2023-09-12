package challenges;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int loopCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer to validate, or any other character to quit");
            String input = scanner.nextLine();

            try {
                int parsed = Integer.parseInt(input);
                if (parsed > maxValue) {
                    maxValue = parsed;
                }
                if (parsed < minValue) {
                    minValue = parsed;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                System.out.print("Exiting loop");
                break;
            }

            if (loopCount > 0) {
                System.out.println("loopCount = " + loopCount);
                System.out.println("minValue = " + minValue);
                System.out.println("maxValue = " + maxValue);
            }
        }





    }
}
