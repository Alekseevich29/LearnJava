package home_work_2.loops;

import java.util.Scanner;

public class Exercise1_1_2 {
   public static void main(String[] agr) {
       Scanner console = new Scanner(System.in);
       System.out.println("Введите число для умножения");
       int a = console.nextInt();
       System.out.println("= " + recurs(a));
   }
   public static int recurs (int n){
       int result = 1;
       if (n==1){
           System.out.print(n+" * ");
           return result;
       }
       result = n * recurs(n-1);
       System.out.print(n + " * " );
       return  result;
   }
}
