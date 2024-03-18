package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/***
 * 11. Создать класс CalculatorWithCounterAutoAgregationInterface.
 * 	11.1 Внутри класса нельзя создавать объекты (использовать new),
 * 	можно пользоваться только тем что передал вам пользователь вашего класса.
 * 	11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 	11.4 Данный класс напрямую не умеет считать математику,
 * 	он умеет делегировать расчёт математики калькулятору который передали в конструктор
 * 	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
 * 	11.6 В классе должен быть метод long getCountOperation()
 * 	который должен возвращать количество использований данного калькулятора.
 * 	При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator calculator;
    private int counter;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        calculator = iCalculator;
    }

    public double plus(double firstNumber, double secondNumber) {
        counter++;
        return calculator.plus(firstNumber, secondNumber);
    }

    public double minus(double firstNumber, double secondNumber) {
        counter++;
        return calculator.minus(firstNumber, secondNumber);
    }

    public double multiply(double firstNumber, double secondNumber) {
        counter++;
        return calculator.multiply(firstNumber, secondNumber);
    }

    public double divide(double firstNumber, double secondNumber) {
        counter++;
        return calculator.divide(firstNumber, secondNumber);
    }

    public double degree(double number, double degreeNumber) {
        counter++;
        return calculator.degree(number, degreeNumber);
    }

    public double module(double moduleNumber) {
        counter++;
        return calculator.module(moduleNumber);
    }

    public double sqRoot(double sqrtNumber) {
        counter++;
        return calculator.sqRoot(sqrtNumber);
    }

    private int countOperation;
    public long getCountOperation() {
        return countOperation;
    }
}
