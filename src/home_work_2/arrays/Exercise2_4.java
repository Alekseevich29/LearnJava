package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
       Exercise2_4 a = new Exercise2_4();
       a.sumChetArray();
       a.maxChetArray();
       a.minAverage();
       a.twoMinInArray();
       a.compressArray();
       a.summAllNumber();
    }
    ArraysUtils arrayRandom = new ArraysUtils();
    int [] arrayRnd = arrayRandom.arrayRandom(50,100);
//2.4.1
    public void sumChetArray (){
        int summ = 0;
        for (int i = 0; i < arrayRnd.length; i++) {
            if (arrayRnd[i]>=0 && arrayRnd[i]%2==0){
                summ+=arrayRnd[i];
            }
        }
        System.out.println("Сумма четных и положительных чисел в массиве = "+summ);
    }
//2.4.2
    public void maxChetArray (){
        int max = 0;
        int [] chetArray= new int[50];
        for (int i = 0; i < arrayRnd.length; i++) {
            if (i%2==0) {
                if (arrayRnd[i]>max){
                    max=arrayRnd[i];
                }
            }
        }
        System.out.println("Макс = " + max);
    }
//2.4.3
    public void minAverage (){
        int sum = 0;
        int average = 1;
        for (int i = 0; i < arrayRnd.length; i++) {
            sum = sum+arrayRnd[i];
            if (i == arrayRnd.length-1){
                average = sum/arrayRnd.length;
            }
        }
        for (int i = 0; i < arrayRnd.length; i++) {
            if(average>arrayRnd[i]){
                System.out.print(arrayRnd[i] + " ");
            }
        }
    }
//2.4.4
    public void twoMinInArray (){
        int firstNumberMin = arrayRnd[0];
        int secondNumber = arrayRnd[0];
        int indexFirstNumberMin = 0;
        for (int i = 0; i < arrayRnd.length; i++) {
            if (firstNumberMin > arrayRnd[i]) {
                indexFirstNumberMin=i;
                firstNumberMin=arrayRnd[i];
            }
        }
        for (int i = 0; i < arrayRnd.length; i++) {
            if (secondNumber>arrayRnd[i]&&i!=indexFirstNumberMin){
                secondNumber=arrayRnd[i];
            }else{
                if (secondNumber<firstNumberMin){
                    firstNumberMin = secondNumber;
                }
            }
        }
        System.out.println("\nМинимальные числа = "+ firstNumberMin +" "+ secondNumber);
    }
//2.4.5
    public void compressArray (){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите нижнюю цифру диапозона");
        int entNumberOne = console.nextInt();
        System.out.println("Введите вернхюю цифру диапозона");
        int entNumberTwo = console.nextInt();
        int number = 0;

        for (int i = 0; i < arrayRnd.length; i++) {
            if (arrayRnd[i]>=entNumberOne && arrayRnd[i]<=entNumberTwo){
                number++;
            }else{
                arrayRnd[i-number]=arrayRnd[i];
            }
        }
        for (int i = arrayRnd.length-number; i < arrayRnd.length; i++) {
            arrayRnd[i]=0;
        }

        System.out.println(Arrays.toString(arrayRnd));
    }
//2.4.6
    public void summAllNumber (){
        int summAll =0;
        for (int i = 0; i < arrayRnd.length; i++) {
            while (arrayRnd[i]>0){
                summAll+=arrayRnd[i]%10;
                arrayRnd[i]=arrayRnd[i]/10;
            }
        }
        System.out.println("Сумма всех чисел = "+summAll);
    }
}
