package home_work_3.runners;
/***
 * 5. Создать класс CalculatorWithCounterClassic.
 * 	5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
 * 	5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик (поле) в калькуляторе.
 * 	5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора (поле).
 */

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy newCalculator = new CalculatorWithMathCopy();
        double resualtAll;

        double firstResult =newCalculator.divide(28,5);

        double resultDegree =  newCalculator.degree(firstResult,2);

        double resultMultiply  = newCalculator.multiply(15,7);

        double resultPlus =  newCalculator.plus (4.1,resultMultiply);

        resualtAll = newCalculator.plus(resultDegree,resultPlus);

        System.out.println("Результат вычисления = "+resualtAll);
    }
}
