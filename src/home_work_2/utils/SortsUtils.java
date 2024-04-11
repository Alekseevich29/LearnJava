package home_work_2.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortsUtils {

    public  String sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j-1]>arr[j]) {
                    int result = arr[j - 1];
                    arr[j-1]=arr[j];
                    arr[j]=result;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public String shake(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int flag = 1;
        while (left<right && flag>0){
            flag=0;
            for (int i = left; i < right; i++) {
                if (arr[i]>arr[i+1]){
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                    flag = 1;
                }
            }
            right--;
            for (int i = right; i >left ; i--) {
                if (arr[i-1]>arr[i]){
                    int t = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = t;
                    flag = 1;
                }
            }
            left++;
        }
        return Arrays.toString(arr);
    }
}
