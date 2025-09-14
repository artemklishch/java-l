public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, Bob3!");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Toyota";
        boolean isMakeOfCar = makeOfCar.equals("Toyota") ? false : true;

        double n1 = 20.00d;
        double n2 = 80.00d;
        double res1 = (n1 + n2) * 100.00d;
        System.out.println("res1 = " + res1);
        double remainder = res1 % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isNotReminder = (remainder == 0) ? true : false;
        System.out.println("Is it not a reminder? " + isNotReminder);
        if (!isNotReminder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder");
        }
    }
}
