package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithMathExtends;

/***
 * 4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и
 * используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результат.
 */

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc1 = new CalculatorWithMathExtends();

        double resultAll;
        double firstResult = calc1.divide(28, 5);
        double resultDegree = calc1.degree(firstResult, 2);
        double resultMultiply = calc1.multiply(15, 7);
        double resultPlus = calc1.plus(4.1, resultMultiply);
        resultAll = calc1.plus(resultDegree, resultPlus);

        System.out.println("Результат вычисления = " + resultAll);

    }

}
