public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real == 0 ? 1 : real;
        this.imaginary += imaginary == 0 ? 1 : imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        double real = complexNumber.getReal();
        double imaginary = complexNumber.getImaginary();
        this.real += real == 0 ? 1 : real;
        this.imaginary += imaginary == 0 ? 1 : imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real == 0 ? 1 : real;
        this.imaginary -= imaginary == 0 ? 1 : imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        double real = complexNumber.getReal();
        double imaginary = complexNumber.getImaginary();
        this.real -= real == 0 ? 1 : real;
        this.imaginary -= imaginary == 0 ? 1 : imaginary;
    }
}
