package exercises;

public class GreaterCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

//    public static int getGreatestCommonDivisor(int num1, int num2) {
//        if (!isValid(num1) || !isValid(num2)) {
//            return -1;
//        }
//
//        return 1;
//    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first;
    }

    public static boolean isValid(int number) {
        return number >= 10;
    }
}
