public class Main {
    public static void main(String[] args) {
//        System.out.println(calculateScore("Bob", 100));
//        System.out.println(calculateScore(2));
//        System.out.println("6 inches are " + convertToCentimeters(6) + " cm");
//        System.out.println("2 feet 6 inches are " + convertToCentimeters(2, 6) + " cm");

//        System.out.println(getDurationString(-3945));
//        System.out.println(getDurationString(-65, 45));
//        System.out.println(getDurationString(65, 45));

//        System.out.println(area(5.0, 4.0));

        printYearsAndDays(525600);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " has a score of " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player has a score of " + score);
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("Player has no score");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return (feet * 12 + inches) * 2.54;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be non-negative";
        }
        return getDurationString(seconds / 60, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds >= 60) {
            return "Invalid data for seconds(" + seconds + "), must be in range [0, 59]";
        }
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be non-negative";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (summer && temperature >= 25 && temperature <= 45) || (!summer && temperature >= 25 && temperature <= 35);
    }

}
