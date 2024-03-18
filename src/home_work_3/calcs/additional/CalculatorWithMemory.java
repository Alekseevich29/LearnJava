package home_work_3.calcs.additional;
/**
 * задача 12*
 * пункты 1-7.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    ICalculator calculator;
    private int counter;
    private double resualt;
    private double resualtSave;
    public CalculatorWithMemory(ICalculator iCalculator) {
        calculator = iCalculator;
    }

    public double plus(double firstNumber, double secondNumber)
    {
        counter++;
        resualt=calculator.plus(firstNumber, secondNumber);
        return resualt;
    }

    public double minus(double firstNumber, double secondNumber) {
        counter++;
        return resualt = calculator.minus(firstNumber, secondNumber);
    }

    public double multiply(double firstNumber, double secondNumber) {
        counter++;
        return resualt = calculator.multiply(firstNumber, secondNumber);
    }

    public double divide(double firstNumber, double secondNumber) {
        counter++;
        return resualt = calculator.divide(firstNumber, secondNumber);
    }

    public double degree(double number, double degreeNumber) {
        counter++;
        return resualt = calculator.degree(number, degreeNumber);
    }

    public double module(double moduleNumber) {
        counter++;
        return resualt =calculator.module(moduleNumber);
    }

    public double sqRoot(double sqrtNumber) {
        counter++;
        return resualt = calculator.sqRoot(sqrtNumber);
    }
    public void save ()  {
        resualtSave =resualt;
    }

    public double load(){
       double returnValue = resualtSave;
        resualtSave=0.0;
        return returnValue;
    }
    private int countOperation;
}
