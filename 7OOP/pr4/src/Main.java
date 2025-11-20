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

        Customer customer = new Customer("Tim", 1000, "tim@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
    }
}
