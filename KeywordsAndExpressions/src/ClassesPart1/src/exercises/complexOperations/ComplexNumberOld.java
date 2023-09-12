public class ComplexNumberOld {
    private double real;
    private double imaginary;

    public ComplexNumberOld(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumberOld number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumberOld number) {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }
}