public class CalculatorModel {
    private double operand1;
    private double operand2;
    private String currentOperation;

    public void setOperand1(double operand) {
        this.operand1 = operand;
    }

    public void setOperand2(double operand) {
        this.operand2 = operand;
    }

    public void setCurrentOperation(String operation) {
        this.currentOperation = operation;
    }
{
    public double performAddition(double operand1, double operand2) {
        return operand1 + operand2;
    }
        

        switch (currentOperation) {
            case "Add":
                return operand1 + operand2;
            case "Subtract":
                return operand1 - operand2;
            default:
                return 0.0; // Неподдерживаемая операция
        }
    }
}
