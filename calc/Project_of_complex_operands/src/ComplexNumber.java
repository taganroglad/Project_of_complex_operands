public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
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

    public ComplexNumber multiply(ComplexNumber other) {
        double realResult = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double imaginaryResult = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double realResult = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / denominator;
        double imaginaryResult = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / denominator;
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
