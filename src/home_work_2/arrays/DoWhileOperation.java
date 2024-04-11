package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public String printAll(int[] array) {
        int i = 0;
        String result ="";
        do {
            result += + array[i]+" ";
            i++;
        } while (i < array.length);
        return result;
    }

    @Override
    public String printEverySecond(int[] array) {
        int i = 0;
        String result = "";
        do {
            result += array[i]+" ";
            i += 2;
        } while (i < array.length);
        return result;
    }

    @Override
    public String printReversed(int[] array) {
        String result = "";
        int i = array.length - 1;
        do {
            result += array[i]+" ";
            i--;
        } while (i >= 0);
        return result;
    }
}
