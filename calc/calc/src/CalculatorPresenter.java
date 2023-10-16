import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

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
