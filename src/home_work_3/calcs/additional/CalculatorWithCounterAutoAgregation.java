package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_4.DataContainer;

/***
 * 8. Создать класс CalculatorWithCounterAutoAgregation.
 * 	8.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
 * 	Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 * 	8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать CalculatorWithMathCopy.
 * 	8.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 * 	8.5 В классах должны присутствовать математические методы:
 * 		8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
 * 	При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculatorkonstr;
    private int counter;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy someCalc){
        this.calculatorkonstr = someCalc;
    }

    public double plus (double firstNumber, double secondNumber){
        counter++;
        return calculatorkonstr.plus(firstNumber,secondNumber);
    }
    public double minus (double firstNumber, double secondNumber){
        counter++;
        return calculatorkonstr.minus(firstNumber,secondNumber);
    }

    public double multiply (double firstNumber, double secondNumber){
        counter++;
        return calculatorkonstr.multiply(firstNumber,secondNumber);
    }
    public double divide (double firstNumber, double secondNumber){
        counter++;
        return calculatorkonstr.divide(firstNumber,secondNumber);
    }

    public double degree (double number, double degreeNumber){
        counter++;
        return calculatorkonstr.degree(number,degreeNumber);
    }

    public double module (double moduleNumber) {
        counter++;
        return calculatorkonstr.module(moduleNumber);
    }

    public double sqRoot(double sqrtNumber){
        counter++;
        return calculatorkonstr.sqRoot(sqrtNumber);
    }
    private int countOperation;
    public long getCountOperation(){
        return countOperation;
    }



}
