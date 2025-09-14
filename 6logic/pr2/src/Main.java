public class Main {
    public static void main(String[] args) {
        printDayOfWeek(7);
        System.out.println(getDaysInMonth(1, 2000));
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printNumberInWord(int number) {
        String numberInWord = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberInWord);
    }

    public static int MIN_YEAR_VALUE = 1;
    public static int MAX_YEAR_VALUE = 9999;
    public static int MIN_MONTH_VALUE = 1;
    public static int MAX_MONTH_VALUE = 12;

    public static boolean isLeapYear(int year) {
        if (year < MIN_YEAR_VALUE || year > MAX_YEAR_VALUE) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < MIN_MONTH_VALUE || month > MAX_MONTH_VALUE || year < MIN_YEAR_VALUE || year > MAX_YEAR_VALUE) {
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // January, March, May, July, August, October, December
            case 4, 6, 9, 11 -> 30; // April, June, September, November
            case 2 -> isLeapYear(year) ? 29 : 28; // February
            default -> -1; // Invalid month
        };
    }
}
