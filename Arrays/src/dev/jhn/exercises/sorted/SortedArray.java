package dev.jhn.exercises.sorted;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[arraySize];

        int counter = 0;
        do {
            System.out.println("Input integer #" + (counter + 1));
            integers[counter] = scanner.nextInt();
            counter++;
        } while (counter < arraySize);

        return integers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = array;
        boolean finished = false;
        int temp;

        while (!finished) {
            finished = true;
            for (int i = 0; i < (array.length - 1); i++) {
                if (sorted[i + 1] > sorted[i] ) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    finished = false;
                }
            }
        }
        return sorted;
    }
}
