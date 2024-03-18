package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * 11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain
 * в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и
 * используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface newCalc = new CalculatorWithCounterAutoAgregationInterface
                (new CalculatorWithOperator());
        double resualtAll;
        double firstResult =newCalc.divide(28,5);
        double resultDegree =  newCalc.degree(firstResult,2);
        double resultMultiply  = newCalc.multiply(15,7);
        double resultPlus =  newCalc.plus (4.1,resultMultiply);
        resualtAll = newCalc.plus(resultDegree,resultPlus);
        System.out.println("Результат вычисления = "+resualtAll+
                "\nЧисло использований = "+newCalc.getCountOperation());

    }
}
