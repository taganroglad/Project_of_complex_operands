import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorViewListeners {
    private CalculatorViewUI view;
    private CalculatorModel model;

    public CalculatorViewListeners(CalculatorViewUI view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.setAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double operand1 = view.getOperand1();
                double operand2 = view.getOperand2();
                RationalNumber result = model.performRationalAddition(new RationalNumber((int) operand1, 1), new RationalNumber((int) operand2, 1));
                view.setResult(result.toString());
            }
        });

        view.setSubtractButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double operand1 = view.getOperand1();
                double operand2 = view.getOperand2();
                ComplexNumber result = model.performComplexAddition(new ComplexNumber(operand1, 0), new ComplexNumber(operand2, 0));
                view.setResult(result.toString());
            }
        });
    }
}
