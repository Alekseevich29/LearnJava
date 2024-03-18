package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calcOperator);
        calcMemory.divide(28, 5);
        calcMemory.save();
        calcMemory.degree(calcMemory.load(), 2);
        calcMemory.save();
        calcMemory.plus(4.1, calcMemory.load());
        calcMemory.save();
        calcMemory.plus(calcMemory.load(), calcMemory.multiply(15, 7));
        calcMemory.save();
        System.out.printf("%.2f%n", calcMemory.load()); // 140.46
    }
}
