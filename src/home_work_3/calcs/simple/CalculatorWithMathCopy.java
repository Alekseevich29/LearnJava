package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/***
 * 3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	3.2 В классе должны присутствовать математические методы:
 * 		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		Скопировать базовые математические операции из CalculatorWithOperator.
 * 		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */
public class CalculatorWithMathCopy implements ICalculator {
    public double result;
    public int average;
    public double plus (double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public double minus (double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public double multiply (double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
    public double divide (double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

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
