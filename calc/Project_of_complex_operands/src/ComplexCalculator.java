public class ComplexCalculator {
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getRealPart() + num2.getRealPart();
        double imaginaryResult = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getRealPart() - num2.getRealPart();
        double imaginaryResult = num1.getImaginaryPart() - num2.getImaginaryPart();
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart();
        double imaginaryResult = num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart();
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getRealPart() * num2.getRealPart() + num2.getImaginaryPart() * num2.getImaginaryPart();
        double realResult = (num1.getRealPart() * num2.getRealPart() + num1.getImaginaryPart() * num2.getImaginaryPart()) / denominator;
        double imaginaryResult = (num1.getImaginaryPart() * num2.getRealPart() - num1.getRealPart() * num2.getImaginaryPart()) / denominator;
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
