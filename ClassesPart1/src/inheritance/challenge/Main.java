package inheritance.challenge;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee clt = new SalariedEmployee("Joe", "01/01/2000", "01/07/2023", 80000);
        System.out.println(clt);
        System.out.println("Joe's paycheck is " + clt.collectPay());

        clt.retire();
        System.out.println("Joe's pension check is " + clt.collectPay());


        HourlyEmployee pj = new HourlyEmployee("Mary", "01/01/2005", "01/01/2020", 15);
        System.out.println(pj);
        System.out.println("Mary's paycheck is " + pj.collectPay());
        System.out.println("Mary's holiday check is " + pj.getDoublePay());
    }
}
