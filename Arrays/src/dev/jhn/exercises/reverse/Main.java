package dev.jhn.exercises.reverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] test = { 1, 2, 3, 4, 5 };
        reverse(test);
    }

    private static void reverse(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;

        for (int element : array) {
            reversedArray[maxIndex--] = element;
        }

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
