package exercises;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (!isValidInput(bigCount) || !isValidInput(smallCount) || !isValidInput(goal)) {
            return false;
        }

        if (((bigCount * 5) + smallCount) < goal) {
            return false;
        }

        if ((bigCount * 5) >= goal) {
            return goal % 5 <= smallCount;
        }

        return true;
    }

    public static boolean isValidInput(int number) {
        return number >= 0;
    }
}
