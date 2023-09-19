package dev.jhn.exercises.minimum;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        return scan.nextInt();
    }

    private static int[] readElements(int quantity) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter integer #" + (i + 1));
            array[i] = scan.nextInt();
        }

        return array;
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
