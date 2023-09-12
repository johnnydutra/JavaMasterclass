package forLoop;

public class Challenge {
    public static void main(String[] args) {

        int primeCounter = 0;
        for (int i = 50; primeCounter < 3 && i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println("Found a prime number: " + i);
                primeCounter++;
            }
//            if (primeCounter == 3) {
//                break;
//            }
        }

    }

    public static boolean isPrime(int number) {

        if (number <= 2) {
            return (number == 2);
        }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
