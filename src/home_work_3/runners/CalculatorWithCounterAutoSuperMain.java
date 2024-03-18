package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calcNew = new CalculatorWithCounterAutoSuper();
        double resualtAll;
        double firstResult =calcNew.divide(28,5);
        double resultDegree =  calcNew.degree(firstResult,2);
        double resultMultiply  = calcNew.multiply(15,7);
        double resultPlus =  calcNew.plus (4.1,resultMultiply);
        resualtAll = calcNew.plus(resultDegree,resultPlus);

        System.out.println("Результат вычисления = "+resualtAll+ "\nСчетчик = "+calcNew.getCounter()+"\nКоличество использование калькулятора = "+calcNew.getCountOperation());
    }
}
