package strings;

public class StringBuilderOptions {
    public static void main(String[] args) {

        String helloWorld = "Hello" + "world";
        helloWorld.concat(" and goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "world");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " world");
        builderPlus.append(" and goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'G');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "g");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
}

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
