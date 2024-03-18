package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int counter;
    private long countOperation;
    public int getCounter() {
        return counter;
    }

    public double plus (double firstNumber, double secondNumber){
        counter++;
        return super.plus(firstNumber,secondNumber);

    }

    public double minus (double firstNumber, double secondNumber){
        counter++;
        return super.minus(firstNumber,secondNumber);
    }

    public double multiply (double firstNumber, double secondNumber){
        counter++;
        return super.multiply(firstNumber,secondNumber);
    }

    public double divide (double firstNumber, double secondNumber){
        counter++;
        return super.divide(firstNumber,secondNumber);
    }

    public double degree (double number, double degreeNumber){
        counter++;
        return  super.degree(number,degreeNumber);
    }

    public double module (double moduleNumber) {
        counter++;
        return super.module(moduleNumber);
    }

    public double sqRoot(double sqrtNumber){
        counter++;
        return super.sqRoot(sqrtNumber);
    }
    public long getCountOperation(){
        return countOperation;
    }

}
