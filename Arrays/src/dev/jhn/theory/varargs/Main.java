package dev.jhn.theory.varargs;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello world again");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.print("_".repeat(20));
        printText("Hello", "world", "again");

        System.out.print("_".repeat(20));
        printText();

        String[] sArray = { "first", "second", "third", "fourth", "fifth" };
        System.out.print((String.join(",", sArray)));

    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
