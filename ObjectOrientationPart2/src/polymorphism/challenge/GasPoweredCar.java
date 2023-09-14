package polymorphism.challenge;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
