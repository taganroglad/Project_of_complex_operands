public class CalculatorModel {
    public double performCalculation(String operation, double operand1, double operand2) {
        switch (operation) {
            case "add":
                return operand1 + operand2;
            case "subtract":
                return operand1 - operand2;
            // Другие операции
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция: " + operation);
        }
    }
}
