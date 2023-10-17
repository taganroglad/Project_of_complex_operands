public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator1 = this.numerator * other.denominator;
        int newNumerator2 = other.numerator * this.denominator;
        int resultNumerator = newNumerator1 + newNumerator2;
        return new RationalNumber(resultNumerator, commonDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator1 = this.numerator * other.denominator;
        int newNumerator2 = other.numerator * this.denominator;
        int resultNumerator = newNumerator1 - newNumerator2;
        return new RationalNumber(resultNumerator, commonDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
