package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/***
 * 2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	2.2 В классе должны присутствовать математические методы:
 * 		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра (определитесь с их типами)
 * 		и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 	2.3 В методах можно использовать любые арифметические операторы.
 * 	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
 */
public class CalculatorWithOperator implements ICalculator {
    public double result;
    public double average;
    public double plus (double firstNumber, double secondNumber){
    //    Math.addExact(firstNumber,secondNumber)
        return firstNumber+secondNumber;
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
        result = 1;
        if(degreeNumber%2!=0)
            return 0;
        for (int i = 0; i < degreeNumber; i++) {
            result *= number;
        }
        return result;
    }

    public double module (double moduleNumber) {
        if (moduleNumber > 0) {
            return moduleNumber;
        } else {
            return -moduleNumber;
        }
    }

    public double sqRoot(double sqrtNumber){
        double leftBorder = 0;
        double rightBorder = sqrtNumber;
            average = (leftBorder+rightBorder)/2;
        double t = sqrtNumber;

        for (;;) {
            average = (leftBorder+rightBorder)/2;
            if (average==t || average * average==sqrtNumber){
                break;
            }
            if (average*average<sqrtNumber){
                leftBorder=average;
            }else {
                rightBorder=average;
            }
            t=average;
        }
        return average;
    }
}
