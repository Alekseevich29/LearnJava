package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

/***
 * 7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и
 * используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результаты посчитанных выражений и
 * результат метода getCountOperation().
 */
public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite();
        calculator1.getCountOperation();

        double resualtAll;
        double firstResult = calculator1.divide(28,5);
        double resultDegree =  calculator1.degree(firstResult,2);
        double resultMultiply  = calculator1.multiply(15,7);
        double resultPlus =  calculator1.plus (4.1,resultMultiply);
        resualtAll = calculator1.plus(resultDegree,resultPlus);
        calculator1.getCountOperation();
        System.out.println("Результат вычисления = "+resualtAll);
    }
}
