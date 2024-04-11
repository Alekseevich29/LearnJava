package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{
    @Override
    public String printAll(int[] array) {
        int i = 0;
        String result ="";
        while (i < array.length) {
            result  += array[i]+" ";
            i++;
        }
        return result;
    }

    @Override
    public String printEverySecond(int[] array) {
        String result = "";
        int i = 0;
        while (i < array.length) {
            result += array[i]+" ";
            i += 2;
        }
        return  result;
    }

    @Override
    public String printReversed(int[] array) {
        int i = array.length - 1;
        String result = "";
        while (i >= 0) {
            result += array[i] + " ";
            i--;
        }
        return result;
    }
}
