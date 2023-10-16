public class CalculatorModel {
    private RationalNumber rationalResult;
    private ComplexNumber complexResult;

    public CalculatorModel() {
        // Конструктор модели, инициализация переменных по умолчанию.
    }

    public void performCalculation(String operation, Object operand1, Object operand2) {
        // Реализация логики для выполнения операций над числами и сохранения результатов.
    }

    public RationalNumber getRationalResult() {
        // Возвращает рациональный результат вычислений.
        return rationalResult;
    }

    public ComplexNumber getComplexResult() {
        // Возвращает комплексный результат вычислений.
        return complexResult;
    }
}
