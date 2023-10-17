public class App {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorViewUI view = new CalculatorViewUI();
        CalculatorViewListeners listeners = new CalculatorViewListeners(view, model);
        view.display();
    }
}
