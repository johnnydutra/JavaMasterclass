package dev.jhn.challenges.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] test = buildRandomIntArray(5, 10, 100);
        System.out.println(Arrays.toString(test));

        System.out.println(Arrays.toString(decreasingSort(test)));
    }

    public static int[] buildRandomIntArray(int size, int origin, int bound) {

        Random random = new Random();
        int randomIntArray[] = new int[size];

        if (origin < 10) origin = 10;
        if (bound > 100) bound = 100;
        if (origin >= bound) {
            origin = 10;
            bound = 100;
        }

        for (int i = 0; i < size; i++) {
            randomIntArray[i] = random.nextInt(origin, bound);
        }
        
        return randomIntArray;
    }
    
    public static int[] decreasingSort(int[] arrayToSort) {
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
