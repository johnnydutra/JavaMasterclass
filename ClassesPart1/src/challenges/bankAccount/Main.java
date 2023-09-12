package challenges.bankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.setBalance(5000);

        acc1.deposit(300);
        acc1.withdraw(6000);
        acc1.withdraw(600);

        System.out.println(acc1.getBalance());

        Customer johnny = new Customer();
        johnny.setFirstName("Johnny");
        johnny.setLastName("Dutra");
        johnny.setEmailAddress("johnny.dutra@gmail.com");
        johnny.setPhoneNumber("+5511941232970");

        acc1.setCustomer(johnny);
        System.out.println(acc1.getCustomer().getFirstName());

    }
}
