import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static double KILOMETERS_PER_MILE = 1.609;
    public static int KILOBYTES_IN_MEGABYTE = 1024;

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(75.114);
        printMegaBytesAndKiloBytes(2500);

        System.out.println(isLeapYear(1924));

        System.out.println(BigDecimal.valueOf(3.1756).setScale(2, RoundingMode.DOWN));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        if (kilometersPerHour == 0) {
            return 0;
        }
        return Math.round(kilometersPerHour / KILOMETERS_PER_MILE);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + kiloBytes / KILOBYTES_IN_MEGABYTE + " MB and " + (kiloBytes % KILOBYTES_IN_MEGABYTE) + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && hourOfDay >= 0 && hourOfDay <= 23 && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static int MIN_YEAR = 1;
    public static int MAX_YEAR = 9999;

    public static boolean isLeapYear(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
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

    public static int DECIMAL_BASE = 3;
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return BigDecimal.valueOf(a).setScale(DECIMAL_BASE, RoundingMode.DOWN).equals(BigDecimal.valueOf(b).setScale(DECIMAL_BASE, RoundingMode.DOWN));
    }

    public static boolean hasEqualSum(int num1, int num2, int compatingValue){
        return (num1 + num2) == compatingValue;
    }

    public static int MIN_AGE = 13;
    public static int MAX_AGE = 19;
    public static boolean hasTeen(int val1, int val2, int val3){
        return isTeen(val1) || isTeen(val2) || isTeen(val3);
    }
    public static boolean isTeen(int value){
        return value >= MIN_AGE && value <= MAX_AGE;
    }
}
