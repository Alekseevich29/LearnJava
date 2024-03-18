package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/***
 * 7. Создать класс CalculatorWithCounterAutoComposite.
 * 	7.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
 * 	Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 * 	7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
 * 	7.4 Данный класс напрямую не умеют считать математику,
 * 	он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 * 	7.5 В классах должны присутствовать математические методы:
 * 		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	7.6 В классе должен быть метод long getCountOperation()
 * 	который должен возвращать количество использований данного калькулятора.
 * 	При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator=new CalculatorWithMathCopy();
    private int countOperation;
    private int counter;
    public double plus (double firstNumber, double secondNumber){
        counter++;
       return calculator.plus(firstNumber,secondNumber);
    }
    public double minus (double firstNumber, double secondNumber){
        counter++;
        return calculator.minus(firstNumber,secondNumber);
    }
    public double multiply (double firstNumber, double secondNumber){
        counter++;
        return calculator.multiply(firstNumber,secondNumber);
    }
    public double divide (double firstNumber, double secondNumber){
        counter++;
        return calculator.divide(firstNumber,secondNumber);
    }

    public double degree (double number, double degreeNumber){
        counter++;
        return calculator.degree(number,degreeNumber);
    }

    public double module (double moduleNumber) {
        counter++;
        return calculator.module(moduleNumber);
    }

    public double sqRoot(double sqrtNumber){
        counter++;
        return calculator.sqRoot(sqrtNumber);
    }
    public long getCountOperation(){
        return countOperation;
    }

}
