package home_work_2.loops;

import java.util.Scanner;

public class Exercise1_1_2 {

   public  int recurs (int n){
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
