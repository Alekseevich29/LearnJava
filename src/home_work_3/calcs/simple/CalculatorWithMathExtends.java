package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/***
 * 4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	4.2 Данный класс должен наследовать класс CalculatorWithOperator.
 * 	4.3 Условия:
 * 		4.3.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
 * 		НЕ ДОЛЖНЫ быть объявлены напрямую в классе, а должны быть унаследованы от родительского класса (4.2).
 * 		4.3.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 		Данные методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса (4.2)
 * 		и должны содержать в своём теле вызов библиотеки Math и возврат полученного результата .
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    public double degree (double number, double degreeNumber){
        return  Math.pow(number,degreeNumber);
    }

    public double module (double moduleNumber) {
        return Math.abs(moduleNumber);
    }

    public double sqRoot(double sqrtNumber){
        return Math.sqrt(sqrtNumber);
    }
}
