package home_work_2.loops;

public class Exercise1_6 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <=10; j++) {
                result = i * j;
                System.out.println(i + " x " + j + " = "+result);
            }
        }
    }

}
