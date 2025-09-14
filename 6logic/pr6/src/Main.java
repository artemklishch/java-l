import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int currentYear = 2022;
//        String usersDateOfBirth = "1999";
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he is " + ageWithPartialYear);


//        int currentYear = 2022;
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e) {
//            System.out.println(getInputFromScanner(currentYear));
//        }

//
//        Scanner scanner = new Scanner(System.in);
//        int counter = 1;
//        double sum = 0;
//        while (counter <= 5) {
//            System.out.println("Enter number #" + counter + ": ");
//            try {
//                String nextNumber = scanner.nextLine();
//                counter++;
//                sum += Double.parseDouble(nextNumber);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input");
//            }
//        }
//        System.out.println("The sum is " + sum);

//
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;
        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextEntry);
                if (loopCount == 0 || number < min) {
                    min = number;
                }
                if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }

    public static String getInputFromConsole(int currentYear) {
        // console is prompt command in the terminal, running the app via the IDE causes the error
        String name = System.console().readLine("Hi, What's your Name? "); // it is read if run in the terminal (java src/Main.java)
        System.out.println("Hi " + name);
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}
