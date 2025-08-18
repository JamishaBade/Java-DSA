package Array.prefixSumProblems;

import Imp.PublicMethods;

import java.util.Arrays;

//A prefix sum is an array where each element is the sum of all elements from the start up to that position.
public class prefixSum {
    public static void main(String[] args) {
        int n = PublicMethods.inputNumber();
        int[] arr = PublicMethods.inputArrayValue(n);
        int[] newArr = prefixSumArray(arr);
        System.out.println(Arrays.toString(newArr));
    }

    static int[] prefixSumArray(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

}
