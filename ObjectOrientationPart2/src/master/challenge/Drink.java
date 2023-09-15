package master.challenge;

public class Drink extends Item {

    private int size;

    public Drink(String type, int size) {
        super(type);
        setPrice(size);
    }

    public void upsize() {
        if (size == 1 || size == 2) {
            this.setPrice(size++);
        }
    }

    public void downsize() {
        if (size == 2 || size == 3) {
            this.setPrice(size--);
        }
    }

    private void setPrice(int size) {
        switch (size) {
            case 1 -> this.price = 2.00;
            case 2 -> this.price = 2.50;
            case 3 -> this.price = 3.00;
            default -> System.out.println("Invalid size");
        }
    }
}
