package challenges.bankAccount;

public class BankAccount {

    private int number;
    private double balance;
//    private String customerName;
//    private String customerEmail;
//    private String customerPhone;
    Customer customer;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double deposit(double amount) {
        double newBalance = this.balance + amount;
        this.balance = newBalance;
        logDeposit(amount, newBalance);
        return newBalance;
    }

    public void logDeposit(double amount, double newBalance) {
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + newBalance);
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return balance;
        }

        double newBalance = this.balance - amount;
        this.balance = newBalance;
        logWithdrawal(amount, newBalance);
        return newBalance;
    }

    public void logWithdrawal(double amount, double newBalance) {
        System.out.println("Withdrew: " + amount);
        System.out.println("New balance: " + newBalance);
    }
}
