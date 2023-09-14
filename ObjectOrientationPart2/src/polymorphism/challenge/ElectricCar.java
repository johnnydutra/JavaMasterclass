package polymorphism.challenge;

public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> Switch %d kWh battery on, ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> usage under average: %.2f %n", avgKmPerCharge);
    }
}
