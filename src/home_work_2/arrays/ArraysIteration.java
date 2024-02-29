package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    ArraysUtils arrays = new ArraysUtils();
    int [] array=arrays.arrayFromConsole();
//2.2.1
    public  void allElemIterators(){

        int n = 0;
//Do While
            do {
                System.out.print(array[n]+" ");
                n++;
                } while (n < array.length);
                System.out.println();
                // For
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]+" ");
                }
                System.out.println();
                //Foreach
                for (int i:array) {
                    System.out.print(i+" ");
                }

    }
//2.2.2
    public void allElemIterators2() {
            int n = 0;
            //Do While
            do {
                System.out.print(array[n] + " ");
                n += 2;
            } while (n < array.length);
            System.out.println();
            // For
            for (int i = 0; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            //Foreach
            int a = -1;
            for (int i : array) {
                a ++;
                if (a%2==0) {
                    System.out.print(i+ " ");
                }
            }
        }
//2.2.3
            public void allElemIterators3() {
             int n = array.length-1;
            //Do While
            do {
                System.out.print(array[n]+ " ");
                n --;
            } while (n >=0);
            System.out.println();
            // For
            for (int i = array.length-1; i >= 0; i --) {
                System.out.print(array[i]+ " ");
            }
            System.out.println();
            //Foreach -Обратный вывод не получается.(
            int a = array.length;
            for (int i : array) {
                a-- ;
                if (a>=0) {
                    System.out.print(i + " ");
                }
            }
        }
}
