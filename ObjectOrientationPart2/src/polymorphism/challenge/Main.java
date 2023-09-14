package polymorphism.challenge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Plain Car");
        ElectricCar electric = new ElectricCar("Electric Car", 200, 4);
        GasPoweredCar gas = new GasPoweredCar("Gas Powered Car", 15, 4, 3);
        HybridCar hybrid = new HybridCar("Hybrid Car", 3, 2);

        runRace(car);
        runRace(electric);
        runRace(gas);
        runRace(hybrid);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }



}
