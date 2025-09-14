public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        System.out.println(isPalindrome(121));
//        isPalindrome(121);
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(getEvenDigitSum(123456789));

//        System.out.println(hasSharedDigit(12, 27));

//        numberToWords(0);

//        System.out.println(canPack(1, 0, 4)); // false
//        System.out.println(canPack(1, 0, 5)); // true
//        System.out.println(canPack(0, 5, 4)); // true
//        System.out.println(canPack(2, 2, 11)); // true
//        System.out.println(canPack(5, 3, 24)); // false
//        System.out.println(canPack(6, 2, 17)); // true
//        System.out.println(canPack(0, 5, 6)); // false

//        System.out.println(getLargestPrime(21));
        printSquareStar(8);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int updatedNumber = number;
        while (updatedNumber != 0) {
            int lastNumber = updatedNumber % 10;
            reverse = reverse * 10 + lastNumber;
            updatedNumber = updatedNumber / 10;
        }
        return reverse == number;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        sum += number % 10;
        sum += Integer.parseInt(String.valueOf(number).substring(0, 1));
        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int updatedNumber = number;
        while (updatedNumber != 0) {
            int lastNumber = updatedNumber % 10;
            if (lastNumber % 2 == 0) {
                sum += lastNumber;
            }
            updatedNumber = updatedNumber / 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        String num1Str = String.valueOf(num1);
        String[] symbols = String.valueOf(num2).split("");
        for (String symbol : symbols) {
            boolean isContain = num1Str.contains(symbol);
            if (isContain) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        int lastNum3 = num3 % 10;
        return lastNum1 == lastNum2 || lastNum2 == lastNum3 || lastNum3 == lastNum1;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 0;
        int largerDivisor = first > second ? first : second;
        for (int i = 1; i < largerDivisor; i++) {
            if (first % i == 0 && second % i == 0 && i > divisor) {
                divisor = i;
            }
        }
        return divisor;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int numberDigitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        StringBuilder numbers = new StringBuilder();
        int updatedNumber = reversedNumber;
        while (updatedNumber != 0 || numberDigitCount > 0) {
            int lastNumber = updatedNumber % 10;
            if (lastNumber == 1) {
                numbers.append("One\n");
            } else if (lastNumber == 2) {
                numbers.append("Two\n");
            } else if (lastNumber == 3) {
                numbers.append("Three\n");
            } else if (lastNumber == 4) {
                numbers.append("Four\n");
            } else if (lastNumber == 5) {
                numbers.append("Five\n");
            } else if (lastNumber == 6) {
                numbers.append("Six\n");
            } else if (lastNumber == 7) {
                numbers.append("Seven\n");
            } else if (lastNumber == 8) {
                numbers.append("Eight\n");
            } else if (lastNumber == 9) {
                numbers.append("Nine\n");
            } else {
                numbers.append("Zero\n");
            }
            updatedNumber /= 10;
            numberDigitCount--;
        }
        System.out.println(numbers.toString());
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int updatedNumber = number;
        while (updatedNumber != 0) {
            reversedNumber = reversedNumber * 10 + updatedNumber % 10;
            updatedNumber = updatedNumber / 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }

    static final int BIG_FLOUR_BAG = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0) {
            return false;
        }
        int totalBigCount = bigCount * BIG_FLOUR_BAG;
        if (smallCount >= goal || (totalBigCount > 0 && totalBigCount % goal == 0)) {
            return true;
        }
        if (totalBigCount + smallCount < goal || totalBigCount == 0) {
            return false;
        }
        if (totalBigCount < goal) {
            return (totalBigCount + smallCount) >= goal;
        }
        if (totalBigCount > goal) {
            int bigVolumesCount = goal / BIG_FLOUR_BAG;
            return (bigVolumesCount * BIG_FLOUR_BAG + smallCount) >= goal;
        }
        return false;
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int maxPrimeFactor = -1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                int counter = 1;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        counter++;
                        break;
                    }
                }
                if (counter == 1) {
                    maxPrimeFactor = i;
                }
            }
        }
        return maxPrimeFactor;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                System.out.println("*".repeat(number));
                continue;
            }
            if (i == number - 1) {
                System.out.println("*".repeat(number));
                break;
            }
            StringBuilder star = new StringBuilder();
            for (int j = 0; j < number; j++) {
                if (j == 0 || j == number - 1 || j == i || j == number - 1 - i) {
                    star.append("*");
                } else {
                    star.append(" ");
                }
            }
            System.out.println(star.toString());
        }
    }
}
