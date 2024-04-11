package home_work_2.loops;

import java.util.Scanner;

public class Exercise1_3 {
    public String power(double base, int exponent) {
        if (exponent < 0) {
            return "¬вели отрицательную степень";
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return base + " ^ "+exponent +" = "+ result;
    }
}
