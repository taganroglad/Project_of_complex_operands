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

    
}
