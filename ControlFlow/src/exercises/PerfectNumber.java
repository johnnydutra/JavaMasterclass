package exercises;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (!isPositiveNumber(number)) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isPositiveNumber(int number) {
        return number > 0;
    }













//    public static boolean isPerfectNumber(int number) {
//
//        if (number < 1) {
//            return false;
//        }
//
//        int sum = 0;
//
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//                System.out.println(number + " is divisible by " + i);
//                sum += i;
//            }
//        }
//
//        System.out.println("Number is: " + number + " | Sum is: " + sum);
//
//        if (number == sum) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
}






















