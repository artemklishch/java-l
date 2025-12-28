public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    • First Point
                        • Sub Point
                """;
        System.out.println(textBlock);

        int age = 35;
//        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your age is %d%n", age); // \n, %n - move to the next line, Your age is 35

        int yearOfBirth = 2023 - age;
//        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth); // Age = 35, Birth year = 1988
        System.out.printf("Your age is %f%n", (float) age); // 35.000000
        System.out.printf("Your age is %.2f%n", (float) age); // 35.00

        for (int i = 1; i <= 100000; i *= 10) {
//            System.out.printf("Printing %d %n", i);
//            System.out.printf("Printing %6d %n", i);
            System.out.printf("Printing %2d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
        formattedString = "Your updated age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
