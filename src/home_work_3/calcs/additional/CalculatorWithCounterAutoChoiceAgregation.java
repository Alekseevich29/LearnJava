package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/***
 * 9. Создать класс CalculatorWithCounterAutoChoiceAgregation.
 * 	9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
 * 	9.2 В данном классе должны быть следующие варианты конструктора:
 * 		9.2.1 Принимающий объект типа CalculatorWithOperator
 * 		9.2.2 Принимающий объект типа CalculatorWithMathCopy
 * 		9.2.3 Принимающий объект типа CalculatorWithMathExtends
 * 	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт
 * 	математики калькулятору который передали в конструктор.
 * 	9.5 В классах должны присутствовать математические методы:
 * 		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		9.5.2 3 метода (Возведение в целую степень дробного положительного числа,
 *      Модуль числа, Корень из числа).
 * 	9.6 В классе должен быть метод long getCountOperation()
 * 	который должен возвращать количество использований данного калькулятора.
 * 	При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorOne;
    private CalculatorWithMathCopy calculatorTwo;
    private CalculatorWithMathExtends calculatorThree;
    private int counter;

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithOperator calculatorWO){
        calculatorOne=calculatorWO;
    }
    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathCopy calculatorWMC){
        calculatorTwo=calculatorWMC;
    }
    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends calculatorWNE){
        calculatorThree=calculatorWNE;
    }
    public double plus (double firstNumber, double secondNumber){
        counter++;
        return calculatorOne.plus(firstNumber,secondNumber);
    }

    public double minus (double firstNumber, double secondNumber){
        counter++;
        return calculatorOne.minus(firstNumber,secondNumber);
    }

    public double multiply (double firstNumber, double secondNumber){
        counter++;
        return calculatorOne.multiply(firstNumber,secondNumber);
    }
    public double divide (double firstNumber, double secondNumber){
        counter++;
        return calculatorOne.divide(firstNumber,secondNumber);
    }

    public double degree (double number, double degreeNumber){
        counter++;
        return calculatorOne.degree(number,degreeNumber);
    }

    public double module (double moduleNumber) {
        counter++;
        return calculatorOne.module(moduleNumber);
    }

    public double sqRoot(double sqrtNumber){
        counter++;
        return calculatorOne.sqRoot(sqrtNumber);
    }
    public double plusNext (double firstNumber, double secondNumber){
        counter++;
        return calculatorTwo.plus(firstNumber,secondNumber);
    }

    public double minusNext (double firstNumber, double secondNumber){
        counter++;
        return calculatorTwo.minus(firstNumber,secondNumber);
    }

    public double multiplyNext (double firstNumber, double secondNumber){
        counter++;
        return calculatorTwo.multiply(firstNumber,secondNumber);
    }
    public double divideNext (double firstNumber, double secondNumber){
        counter++;
        return calculatorTwo.divide(firstNumber,secondNumber);
    }

    public double degreeNext (double number, double degreeNumber){
        counter++;
        return calculatorTwo.degree(number,degreeNumber);
    }

    public double moduleNext (double moduleNumber) {
        counter++;
        return calculatorTwo.module(moduleNumber);
    }

    public double sqRootNext (double sqrtNumber){
        counter++;
        return calculatorTwo.sqRoot(sqrtNumber);
    }
    public double plusSecond (double firstNumber, double secondNumber){
        counter++;
        return calculatorThree.plus(firstNumber,secondNumber);
    }

    public double minusSecond (double firstNumber, double secondNumber){
        counter++;
        return calculatorThree.minus(firstNumber,secondNumber);
    }

    public double multiplySecond (double firstNumber, double secondNumber){
        counter++;
        return calculatorThree.multiply(firstNumber,secondNumber);
    }
    public double divideSecond (double firstNumber, double secondNumber){
        counter++;
        return calculatorThree.divide(firstNumber,secondNumber);
    }

    public double degreeSecond (double number, double degreeNumber){
        counter++;
        return calculatorThree.degree(number,degreeNumber);
    }

    public double moduleSecond (double moduleNumber) {
        counter++;
        return calculatorThree.module(moduleNumber);
    }

    public double sqRootSecond (double sqrtNumber){
        counter++;
        return calculatorThree.sqRoot(sqrtNumber);
    }
    private int countOperation;
    public long getCountOperation(){
        return countOperation;
    }
}
