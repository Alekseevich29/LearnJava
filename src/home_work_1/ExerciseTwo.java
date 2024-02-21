package home_work_1;

public class ExerciseTwo {
    public static void main (String []agr){
      int a = 8;
      int b= 2;
        int resault = 5+b/a;
        int resault1 = (5+b)/a;   // 0 так как инт результат  = 0,875
        int resault2 = (5 + b++)/a;  // 0
        int resault3 = (5 + b++) / --a;  // 1,333
        int resault4 = (5 * 2 >> b++) / --a;
        int resault5 = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a;
       // int resault6 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; // После разбора понял что тут ошибка компиляции из-за 68 >= 68 это boolean тип
        boolean resault7 = 6 - 2 > 3 && 12 * 12<= 119; //Будет False так как 12*12 = 144 а 119 не больше 144. итог с false.
        boolean resault8 =true && false;  // Если есть false То при сравнении будет false.*/



    }
}
