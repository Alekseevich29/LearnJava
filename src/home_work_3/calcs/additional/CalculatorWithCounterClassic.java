package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    public int couter;
    private int counterCalc;
    public void incrementCountOperation(){
    couter++;
    }

    public long getCountOperation(){
    return counterCalc++;
    }


}
