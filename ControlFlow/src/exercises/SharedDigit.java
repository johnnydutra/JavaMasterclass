package exercises;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (!isValidRange(num1) || !isValidRange(num2)) {
            return false;
        }

        int ten1 = num1 / 10;
        int unit1 = num1 % 10;
        int ten2 = num2 / 10;
        int unit2 = num2 % 10;


        return (ten1 == ten2 || ten1 == unit2 || unit1 == ten2 || unit1 == unit2);
    }

    public static boolean isValidRange(int number) {
        return number >= 10 && number <= 99;
    }
}
