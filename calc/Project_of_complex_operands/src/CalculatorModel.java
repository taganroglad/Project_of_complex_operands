public class CalculatorModel {
    public RationalNumber performRationalAddition(RationalNumber num1, RationalNumber num2) {
        return new RationalCalculator().add(num1, num2);
    }

    public ComplexNumber performComplexAddition(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexCalculator().add(num1, num2);
    }

    public RationalNumber performRationalSubtraction(RationalNumber num1, RationalNumber num2) {
        return new RationalCalculator().subtract(num1, num2);
    }

    public ComplexNumber performComplexSubtraction(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexCalculator().subtract(num1, num2);
    }

    public RationalNumber performRationalMultiplication(RationalNumber num1, RationalNumber num2) {
        return new RationalCalculator().multiply(num1, num2);
    }

    public ComplexNumber performComplexMultiplication(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexCalculator().multiply(num1, num2);
    }

    public RationalNumber performRationalDivision(RationalNumber num1, RationalNumber num2) {
        return new RationalCalculator().divide(num1, num2);
    }

    public ComplexNumber performComplexDivision(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexCalculator().divide(num1, num2);
    }
}
