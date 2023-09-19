package dev.jhn.challenges.minimum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] data = readIntegers(5);
        Arrays.toString(data);

        System.out.println("Minimum is: " + findMin(data));
    }

    private static int[] readIntegers(int arraySize) {

        int[] integers = new int[arraySize];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter an integer:");
            integers[i] = scan.nextInt();
        }

        return integers;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
