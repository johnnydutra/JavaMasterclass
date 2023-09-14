package polymorphism.challenge;

public class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, int batterySize, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up, ready!%n", cylinders);
        System.out.printf("Hybrid -> Switch %d kWh battery on, ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLitre);
    }
}
