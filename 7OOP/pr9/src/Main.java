public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        // inspection methods
        printInformation(helloWorld);
        printInformation("");
        printInformation("\t    \n");

        System.out.printf("index of r = %d %n", helloWorld.indexOf('r')); // index of r = 8
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World")); // index of World = 6
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l')); // index of l = 2
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l')); // index of l = 9
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3)); // index of l = 3
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8)); // index of l = 3

        System.out.println("\n");
        System.out.println("\n");

        // comparison methods
        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

        System.out.println("\n");
        System.out.println("\n");

        // string manipulation methods
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex); // startingIndex = 6
        System.out.println("Birth year = " + birthDate.substring(startingIndex)); //
        System.out.println("Month = " + birthDate.substring(3, 5)); // Month = 11

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("new Date = " + newDate); // new Date = 25/11/1982

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        System.out.println("new Date = " + newDate); // new Date = 25/11

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("new Date = " + newDate); // new Date = 25/11/1982

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("new Date = " + newDate); // new Date = 25/11/1982

        System.out.println(newDate.replace("/", "-")); // 25-11-1982
        System.out.println(newDate.replace("2", "00")); // 005/11/19800
        System.out.println(newDate.replaceFirst("/", "-")); // 25-11/1982
        System.out.println(newDate.replaceAll("/", "---")); // 25---11---1982
        System.out.println("ABC\n".repeat(3));
//        ABC
//ABC
//ABC
        System.out.println("-".repeat(20)); // --------------------
        System.out.println("ABC\n".repeat(3).indent(8));
//        ABC
//        ABC
//        ABC

        System.out.println("   ABC\n".repeat(3).indent(-2));
//  ABC
//  ABC
//  ABC

        System.out.println("\n");
        System.out.println("\n");

        // String builder
        String helloWorldAgain = "Hello" + " World";
        helloWorldAgain.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation1(helloWorldAgain);
        printInformation1(helloWorldBuilder);

        StringBuilder emptyStar = new StringBuilder();
        emptyStar.append("a".repeat(17));
        StringBuilder emptyStar32 = new StringBuilder(32);
        emptyStar32.append("a".repeat(17));
        printInformation1(emptyStar);
        printInformation1(emptyStar32);

        StringBuilder helloWorldBuilder1 = new StringBuilder("Hello" + " World");
        helloWorldBuilder1.append(" and Goodbye");
        helloWorldBuilder1.deleteCharAt(16).insert(16, "g");
        System.out.println(helloWorldBuilder1); // Hello World and goodbye
        helloWorldBuilder1.replace(16,17, "G");
        System.out.println(helloWorldBuilder1); // Hello World and Goodbye
        helloWorldBuilder1.reverse().setLength(7);
        System.out.println(helloWorldBuilder1); // eybdooG
    }

    public static void printInformation1(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation1(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank"); // it means the string contains only spaces
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
