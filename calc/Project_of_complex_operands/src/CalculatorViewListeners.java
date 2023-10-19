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
                double result = operand1 + operand2;
                view.setResult(String.valueOf(result));
            }
        });

        view.setSubtractButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double operand1 = view.getOperand1();
                double operand2 = view.getOperand2();
                double result = operand1 - operand2;
                view.setResult(String.valueOf(result));
            }
        });
    }
}
