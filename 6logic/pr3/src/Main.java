public class Main {
    public static void main(String[] args) {
        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println(calculateInterest(10000.0, rate));
        }

        System.out.println("\n");
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(17));

        int count = 0;
        for (int i = 0; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 3) {
                    System.out.println("Found 3 prime numbers, exiting loop.");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }
        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
