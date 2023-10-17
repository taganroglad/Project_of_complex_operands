public class RationalCalculator {
    public RationalNumber add(RationalNumber num1, RationalNumber num2) {
        int commonDenominator = num1.getDenominator() * num2.getDenominator();
        int newNumerator1 = num1.getNumerator() * num2.getDenominator();
        int newNumerator2 = num2.getNumerator() * num1.getDenominator();
        int resultNumerator = newNumerator1 + newNumerator2;
        return new RationalNumber(resultNumerator, commonDenominator);
    }

    public RationalNumber subtract(RationalNumber num1, RationalNumber num2) {
        int commonDenominator = num1.getDenominator() * num2.getDenominator();
        int newNumerator1 = num1.getNumerator() * num2.getDenominator();
        int newNumerator2 = num2.getNumerator() * num1.getDenominator();
        int resultNumerator = newNumerator1 - newNumerator2;
        return new RationalNumber(resultNumerator, commonDenominator);
    }
    
}
