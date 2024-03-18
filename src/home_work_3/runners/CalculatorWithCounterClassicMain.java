package home_work_3.runners;
/***
 * 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1,
 * при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика.
 * Вывести в консоль результат.
 */

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic counter = new CalculatorWithCounterClassic();

        double resualtAll;

        double firstResult =counter.divide(28,5);
        counter.incrementCountOperation();

        double resultDegree =  counter.degree(firstResult,2);
        counter.incrementCountOperation();

        double resultMultiply  = counter.multiply(15,7);
        counter.incrementCountOperation();

        double resultPlus =  counter.plus (4.1,resultMultiply);
        counter.incrementCountOperation();

        resualtAll = counter.plus(resultDegree,resultPlus);
        counter.incrementCountOperation();
        System.out.println("Результат вычисления = "+resualtAll+ "\nСчетчик = "+counter.couter);
    }
}
