public class CalculatorModel {
    public RationalNumber performRationalAddition(RationalNumber num1, RationalNumber num2) {
        return new RationalCalculator().add(num1, num2);
    }

    public ComplexNumber performComplexAddition(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexCalculator().add(num1, num2);
    }

    public double performSubtraction(double operand1, double operand2) {
        return 0;
    }

    public double performAddition(double operand1, double operand2) {
        return 0;
    }
}
