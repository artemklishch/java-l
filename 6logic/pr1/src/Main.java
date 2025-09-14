public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value is one");
//        } else if(value == 2) {
//            System.out.println("Value is two");
//        } else {
//            System.out.println("Value is something else");
//        }

        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value is one");
//                break;
//            case 2:
//                System.out.println("Value is two");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value is three, four, or five");
//                break;
//            default:
//                System.out.println("Value is something else");
//                break;
//        }

        switch (switchValue) {
            case 1 -> System.out.println("Value is one");
            case 2 -> System.out.println("Value is two");
            case 3, 4, 5 -> {
                System.out.println("Value is three, four, or five");
                System.out.println("Actually, it was a " + switchValue);
            }
            default -> System.out.println("Value is something else");
        }

        String month = "JULY1";
        String quarter = getQuarter(month);
        System.out.println("The month of " + month + " is in " + quarter);

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch statement");
                break;
        }
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "Q1";
            case "APRIL", "MAY", "JUNE" -> "Q2";
            case "JULY", "AUGUST", "SEPTEMBER" -> "Q3";
//            default -> throw new IllegalArgumentException("Invalid month: " + month);
            default -> {
                String response = "Invalid month: " + month;
                yield response; // as return statement
            }
        };
    }


}
