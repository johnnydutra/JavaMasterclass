package inheritance.challenge;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public void retire() {
       if (isRetired) {
           System.out.println("Already retired");
       } else {
           this.isRetired = true;
           System.out.println("Enjoy!");
       }
    }
}
