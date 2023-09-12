package forLoop;

public class SumThreeFive {
    public static void main(String[] args) {
//        int sumDivisibleByThreeAndFive = 0;
//        int countDivisibleByThreeAndFive = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                countDivisibleByThreeAndFive++;
//                sumDivisibleByThreeAndFive += i;
//                System.out.println(i);
//            }
//            if (countDivisibleByThreeAndFive == 5) {
//                System.out.println("Exiting loop. Sum: " + sumDivisibleByThreeAndFive);
//                break;
//            }
//        }

        sumDivisibleByThreeAndFive(5, 1, 1000);


    }

    public static void sumDivisibleByThreeAndFive(int targetCount, int lowerLimit, int upperLimit) {
        int matchesSum = 0;
        int matchesCount = 0;
        int numbersPassed = 0;

        for (int i = lowerLimit; i < upperLimit; i++) {
            numbersPassed++;

            boolean isMatch = (i % 3 == 0) && (i % 5 == 0);

            if (isMatch) {
                matchesCount++;
                matchesSum += i;
            }

            if (matchesCount == targetCount) {
                System.out.println("Exiting loop. Got sum of " + matchesSum + " while passing through " + numbersPassed + " numbers");
                break;
            }

        }
        System.out.println("Target count not reached. Last sum: " + matchesSum + " after checking " + numbersPassed + " numbers.");
    }
}
