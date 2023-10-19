class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
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

    public RationalNumber multiply(RationalNumber other) {
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int resultNumerator = this.numerator * other.denominator;
        int resultDenominator = this.denominator * other.numerator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
