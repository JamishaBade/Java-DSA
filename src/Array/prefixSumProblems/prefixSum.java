package Array.prefixSumProblems;

import Imp.PublicMethods;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
       int n= PublicMethods.inputNumber();
        int[] arr=PublicMethods.inputArrayValue(n);
        int[] newArr=prefixSumArray(arr);
        System.out.println(Arrays.toString(newArr));
    }
    static int[] prefixSumArray(int[] arr){

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

}
