package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_4 {
    public void main(String[] args) {
       //Exercise2_4 a = new Exercise2_4();
       //sumChetArray();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите нижнюю цифру диапозона");
        int entNumberOne = console.nextInt();
        System.out.println("Введите вернхюю цифру диапозона");
        int entNumberTwo = console.nextInt();
    }
    ArraysUtils arrayRandom = new ArraysUtils();
    int [] arrayRnd = arrayRandom.arrayRandom(50,100);
//2.4.1
    public  int sumChetArray (int [] arrayRnd){
        int summ = 0;
        for (int i = 0; i < arrayRnd.length; i++) {
            if (arrayRnd[i]>=0 && arrayRnd[i]%2==0){
                summ+=arrayRnd[i];
            }
        }
       return summ;
    }
//2.4.2
    public int maxChetArray (int [] arrayRnd){
        int max = 0;
        for (int i = 0; i < arrayRnd.length; i++) {
            if (i%2==0) {
                if (arrayRnd[i]>max){
                    max=arrayRnd[i];
                }
            }
        }
        return max;
    }
//2.4.3
    public String minAverage (int [] arrayRnd){
        int sum = 0;
        int average = 1;
        String result = "";
        for (int i = 0; i < arrayRnd.length; i++) {
            sum += arrayRnd[i];
            if (i == arrayRnd.length-1){
                average = sum/arrayRnd.length;
            }
        }
        for (int i = 0; i < arrayRnd.length; i++) {
            if(average>arrayRnd[i]){
                result += arrayRnd[i] + " ";
            }
        }
        return result;
    }
//2.4.4
    public String  twoMinInArray (int [] arrayRnd){
        int firstNumberMin = arrayRnd[0];
        int secondNumber = arrayRnd[0];
        int indexFirstNumberMin = 0;
        String result = "";
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
        return result + "Минимальные числа = "+ firstNumberMin +" "+ secondNumber;
    }
//2.4.5
    public String compressArray (int entNumberOne,int entNumberTwo,int [] arrayRnd){

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
        return Arrays.toString(arrayRnd);
    }
//2.4.6
    public int summAllNumber (int [] arrayRnd){
        int summAll =0;
        for (int i = 0; i < arrayRnd.length; i++) {
            while (arrayRnd[i]>0){
                summAll+=arrayRnd[i]%10;
                arrayRnd[i]=arrayRnd[i]/10;
            }
        }
        return summAll;
    }
}
