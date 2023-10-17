public class CalculatorViewListeners {
    private CalculatorViewUI view;

    public CalculatorViewListeners(CalculatorViewUI view) {
        this.view = view;
    }

    public void setAddButtonListener(ActionListener listener) {
        view.setAddButtonListener(listener);
    }

    public void setSubtractButtonListener(ActionListener listener) {
        view.setSubtractButtonListener(listener);
    }
}
