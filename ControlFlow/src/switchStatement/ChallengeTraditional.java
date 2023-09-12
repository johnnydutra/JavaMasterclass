package switchStatement;

public class ChallengeTraditional {

    public static void main(String[] args) {
        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println(letter + " stands for ABLE");
                break;
            case 'B':
                System.out.println(letter + " stands for BAKER");
                break;
            case 'C':
                System.out.println(letter + " stands for CHARLIE");
                break;
            case 'D':
                System.out.println(letter + " stands for DOG");
                break;
            case 'E':
                System.out.println(letter + " stands for EASY");
                break;
            default:
                System.out.println("Letter input not in the expected range A-E: got" + letter);
        }
    }

}
