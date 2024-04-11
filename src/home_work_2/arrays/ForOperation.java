package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    @Override
    public String printAll(int[] array) {
        String result ="";
        for (int i = 0; i < array.length; i++) {
            result += + array[i] + " ";
        }
        return result;
    }

    @Override
    public String printEverySecond(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i += 2) {
            result += array[i] + " ";
        }
        return  result;
    }

    @Override
    public String printReversed(int[] array) {
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + " ";
        }
        return  result;
    }
}
