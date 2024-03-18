package home_work_3.runners;

/***
 * 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        double b = 15;
        double pow = (double)28/5;
        double powResult = pow*pow;
        double result = a + b * 7 + powResult;
        System.out.println("Результат = " + result);
    }
}
