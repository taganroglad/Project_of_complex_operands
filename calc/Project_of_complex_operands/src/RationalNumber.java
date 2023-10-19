import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Rational Calculator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());

                // Остальной код для создания интерфейса и обработчиков событий здесь.

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
