package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/***
 * 9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод). В main методе требуется:
 * 		9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator
 * 		и используя методы из данного экземпляра посчитать выражения из задания 1.
 * 		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy
 * 		и используя методы из данного экземпляра посчитать выражения из задания 1.
 * 		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends
 * 		и используя методы из данного экземпляра посчитать выражения из задания 1.
 * 		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculatorFirst = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculatorSecond = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculatorThree = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        double resualtAll;
        double firstResult = calculatorFirst.divide(28,5);
        double resultDegree =  calculatorFirst.degree(firstResult,2);
        double resultMultiply  = calculatorFirst.multiply(15,7);
        double resultPlus =  calculatorFirst.plus (4.1,resultMultiply);
        resualtAll = calculatorFirst.plus(resultDegree,resultPlus);
        calculatorFirst.getCountOperation();
        System.out.println("Результат вычисления = "+resualtAll + "\n Счетчик использования = "+calculatorFirst.getCountOperation());

        firstResult = calculatorSecond.divideNext(28,5);
        resultDegree =  calculatorSecond.degreeNext(firstResult,2);
        resultMultiply  = calculatorSecond.multiplyNext(15,7);
        resultPlus =  calculatorSecond.plusNext (4.1,resultMultiply);
        resualtAll = calculatorSecond.plusNext(resultDegree,resultPlus);
        calculatorSecond.getCountOperation();
        System.out.println("Результат вычисления = "+resualtAll + "\n Счетчик использования = "+calculatorSecond.getCountOperation());

        firstResult = calculatorThree.divideSecond(28,5);
        resultDegree =  calculatorThree.degreeSecond(firstResult,2);
        resultMultiply  = calculatorThree.multiplySecond(15,7);
        resultPlus =  calculatorThree.plusSecond (4.1,resultMultiply);
        resualtAll = calculatorThree.plusSecond(resultDegree,resultPlus);
        System.out.println("Результат вычисления = "+resualtAll + "\n Счетчик использования = "+calculatorThree.getCountOperation());

    }
}
