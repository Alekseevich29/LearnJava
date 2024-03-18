package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/***
 * 2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и
 * используя методы из данного экземпляра посчитать выражения из задания 1  4.1 + 15 * 7 + (28 / 5) ^ 2.
 * Вывести в консоль результат.
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator newCalculator = new CalculatorWithOperator();
        double resualtAll;
        double firstResult =newCalculator.divide(28,5);
        double resultDegree =  newCalculator.degree(firstResult,2);
        double resultMultiply  = newCalculator.multiply(15,7);
        double resultPlus =  newCalculator.plus(4.1,resultMultiply);
        resualtAll = newCalculator.plus(resultDegree,resultPlus);
        System.out.println("Результат вычисления = "+resualtAll);



    }
}
