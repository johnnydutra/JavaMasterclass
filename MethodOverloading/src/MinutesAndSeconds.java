public class MinutesAndSeconds {
    public static void main(String[] args) {

        System.out.println(getDurationString(5, 30));
        System.out.println(getDurationString(7, 80));
        System.out.println(getDurationString(-1, -1));

        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(6549));

    }

    private static final String INVALID_MINUTES_INPUT = "Error: Invalid minutes input";
    private static final String INVALID_SECONDS_INPUT = "Error: Invalid seconds input";

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_SECONDS_INPUT;
        }

        int splitMinutes = seconds / 60;
        int remainderSeconds = seconds % 60;

        return getDurationString(splitMinutes, remainderSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        String durationString;

        if (minutes < 0) {
            return INVALID_MINUTES_INPUT;
        }

        if (seconds < 0 || seconds > 59) {
            return INVALID_SECONDS_INPUT;
        }

        int splitHours = minutes / 60;
        int remainderMinutes = minutes % 60;

        durationString = remainderMinutes + "m " + seconds + "s";

        if (splitHours != 0) {
            durationString = splitHours + "h " + durationString;
        }

        return durationString;
    }
}