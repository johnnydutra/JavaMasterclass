package inheritance.challenge;

public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public void getDoublePay() {
        hourlyPayRate *= 2;
    }

}
