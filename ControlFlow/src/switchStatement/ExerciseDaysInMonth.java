package switchStatement;

public class ExerciseDaysInMonth {
    public static void main(String[] args) {
        System.out.print(isLeapYear(-1600));
        System.out.print(isLeapYear(1600));
        System.out.print(isLeapYear(2017));
        System.out.print(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 30;
        }

//        return switch (month) {
//            case 2 -> isLeapYear(year) ? 29 : 28;
//            case 4, 6, 9, 11 -> 30;
//            default -> 31;
//        };
    }


}
