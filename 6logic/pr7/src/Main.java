import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        inputThenPrintSumAndAverage();

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }

    //    private static final Scanner scanner = new Scanner(System.in);
//    public static void inputThenPrintSumAndAverage() {
//        int sum = 0;
//        int counter = 0;
//        while (true) {
//            String numberString = scanner.nextLine();
//            try {
//                int number = Integer.parseInt(numberString);
//                sum += number;
//                counter++;
//            } catch (NumberFormatException e) {
//                long average =  Math.round((double) sum / counter);
//                System.out.println("SUM = " + sum + " AVG = " + average);
//                break;
//            }
//        }
//    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }

        long average = (count == 0) ? 0 : Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0 || height <= 0 || areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallSquare = width * height;
        return (int) Math.ceil(wallSquare / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if  (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
