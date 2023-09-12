package challenges;

public class Methods {
    public static void main(String[] args) {

        displayHighScorePosition("Joey", calculateHighScorePosition(1500));
        displayHighScorePosition("Phoebe", calculateHighScorePosition(1000));
        displayHighScorePosition("Chandler", calculateHighScorePosition(500));
        displayHighScorePosition("Ross", calculateHighScorePosition(100));
        displayHighScorePosition("Rachel", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int ranking) {
        System.out.println(playerName + " managed to get into position " + ranking + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}

