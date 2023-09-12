public class InchesChallenge {

    public static final double CENTIMETERS_IN_INCH = 2.54;
    public static final int INCHES_IN_FOOT = 12;

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(30)); // 76.2
        System.out.println(convertToCentimeters(72)); // 182.88
        System.out.println(convertToCentimeters(5)); // 12.7
        System.out.println(convertToCentimeters(5, 11)); // 180.34
        System.out.println(convertToCentimeters(7, 0)); // 213.36
        System.out.println(convertToCentimeters(3, 5)); // 104.14
    }

    public static double convertToCentimeters(int inches) {
        return inches * CENTIMETERS_IN_INCH;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * INCHES_IN_FOOT) + inches;
        return totalInches * CENTIMETERS_IN_INCH;
    }


}
