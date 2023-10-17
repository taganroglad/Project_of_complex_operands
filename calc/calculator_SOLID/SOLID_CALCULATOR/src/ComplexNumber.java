public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realResult = this.realPart + other.realPart;
        double imaginaryResult = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double realResult = this.realPart - other.realPart;
        double imaginaryResult = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + Math.abs(imaginaryPart) + "i";
        }
    }
}
