package whileLoops;

public class Challenge {
    public static void main(String[] args) {

        int currentNumber = 5;
        int finishNumber = 20;

        while (currentNumber <= finishNumber) {
            if (isEvenNumber(currentNumber)) {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void printEvenNumbers(int number, int finish) {
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finish) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number: " + number);
            evenCount++;

            if (evenCount == 5) {
                System.out.println("Even numbers found: " + evenCount);
                System.out.println("Odd numbers found: " + oddCount);
                break;
            }
        }
    }
}
