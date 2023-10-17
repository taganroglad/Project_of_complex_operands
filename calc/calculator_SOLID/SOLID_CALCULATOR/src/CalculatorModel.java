public class CalculatorModel {
    public RationalNumber performRationalAddition(RationalNumber num1, RationalNumber num2) {
        return new RationalCalculator().add(num1, num2);
    }

    public ComplexNumber performComplexAddition(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexCalculator().add(num1, num2);
    }
}
