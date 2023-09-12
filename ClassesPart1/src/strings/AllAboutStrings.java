package strings;

public class AllAboutStrings {
    public static void main(String[] args) {

        printInformation("Hello world");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello world";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of r = %d %n", helloWorld.indexOf('r', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("world")) {
            System.out.println("String starts with world");
        }
        if (helloWorld.endsWith("world")) {
            System.out.println("String ends with world");
        }
        if (helloWorld.contains("world")) {
            System.out.println("String contains world");
        }
        if (helloWorld.contentEquals("Hello world")) {
            System.out.println("Values match exactly");
        }

    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
