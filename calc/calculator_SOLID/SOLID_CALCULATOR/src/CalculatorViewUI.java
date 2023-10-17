import javax.swing.*;
import java.awt.*;

public class CalculatorViewUI {
    private JFrame frame;
    private JTextField operand1Field, operand2Field, resultField;
    private JButton addButton, subtractButton;

    public CalculatorViewUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        operand1Field = new JTextField(10);
        operand2Field = new JTextField(10);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");

        resultField = new JTextField(10);
        resultField.setEditable(false);

        frame.add(new JLabel("Operand 1:"));
        frame.add(operand1Field);
        frame.add(new JLabel("Operand 2:"));
        frame.add(operand2Field);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public double getOperand1() {
        try {
            return Double.parseDouble(operand1Field.getText());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public double getOperand2() {
        try {
            return Double.parseDouble(operand2Field.getText());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public void setResult(String result) {
        resultField.setText(result);
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setSubtractButtonListener(ActionListener listener) {
        subtractButton.addActionListener(listener);
    }

    public void display() {
        frame.setVisible(true);
    }
}
