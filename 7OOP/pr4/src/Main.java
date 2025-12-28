public class Main {
    public static void main(String[] args) {
//        Account bobsAccount = new Account();
//        Account bobsAccount = new Account(
//                "12345",
//                1000.00,
//                "Bob Marly",
//                "test@gmail.com",
//                "(087) 123-4567"
//        );
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        Account timsAccount = new Account("Tim", "tim@gmail.com", "(087) 567-897");

//        Customer customer = new Customer("Tim", 1000, "tim@gmail.com");
//        System.out.println(customer.getName());
//        System.out.println(customer.getCreditLimit());
//        System.out.println(customer.getEmail());
//
//        Customer secondCustomer = new Customer();
//        System.out.println(secondCustomer.getName());
//        System.out.println(secondCustomer.getCreditLimit());
//        System.out.println(secondCustomer.getEmail());


        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("S092300" + 1, switch (i) {
//                case 1 -> "Mary";
//                case 2 -> "Carol";
//                case 3 -> "Tim";
//                case 4 -> "Harry";
//                case 5 -> "Lisa";
//                default -> "Anonymous";
//            }, "02/05/1985", "Java Masterclass");
//            System.out.println(s);

            LPAStudent s = new LPAStudent("S092300" + 1, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "02/05/1985", "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S093006", "Ann", "02/06/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S093007", "Bill", "02/08/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
