package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public String printAll(int[] array) {
        String result ="";
        for (int num : array) {
            result +=  num + " ";
        }
        return result;
    }

    @Override
    public String printEverySecond(int[] array) {
        String result = "";
        int count = 0;
        for (int num : array) {
            if (count % 2 == 0) {
                result += num+" ";
            }
            count++;
        }
        return result;
    }

    @Override
    public String printReversed(int[] array) {
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + " ";
        }
        return result;
    }
}
