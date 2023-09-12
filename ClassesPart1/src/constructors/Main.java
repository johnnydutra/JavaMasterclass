package constructors;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim", "tim@email", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber());
        System.out.println("Name: " + timsAccount.getCustomerName());
    }
}
