public class Main {
    public static void main(String[] args) {
//        int countOfMatches = 0;
//        int sumOfMatches = 0;
//
//        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
//            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
//                countOfMatches++;
//                sumOfMatches += loopNumber;
//                System.out.println("Found a match = " + loopNumber);
//            }
//
//            if (countOfMatches == 5) {
//                break;
//            }
//        }
//
//        System.out.println("Sum = " + sumOfMatches);
//        System.out.println(sumOdd(-1, 100));


//        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//        while (true) {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }
//        do {
//            System.out.println(j);
//            j++;
//        } while (j <= 5);

//        int n1 = 4;
//        int finishN1 = 20;
//        int evenCount = 0;
//        int oddCount = 0;
//        while (n1 <= finishN1) {
//            n1++;
//            if (!isEvenNumber(n1)) {
//                oddCount++;
//                continue;
//            }
//            System.out.println("Even number = " + n1);
//            evenCount++;
//            if (evenCount > 5) {
//                break;
//            }
//        }

        System.out.println(sumDigits(1234));
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || (start < 0 && end < 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        return sum;
    }


}
