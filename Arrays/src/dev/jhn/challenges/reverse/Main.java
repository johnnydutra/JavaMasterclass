package dev.jhn.challenges.reverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] test = { 1, 2, 3, 4, 5, 6, 7 };
        reverse(test);
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int element : array) {
            reversedArray[maxIndex--] = element;
        }

        return reversedArray;
    }
}
