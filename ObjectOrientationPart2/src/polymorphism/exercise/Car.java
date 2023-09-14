package polymorphism.exercise;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return this.getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return this.getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
