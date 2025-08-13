package Array.prefixSumProblems;

import Imp.PublicMethods;

public class PrefixSumInRange {
    public static void main(String[] args) {
        int n= PublicMethods.inputNumber();
        System.out.println("enter the range");
        int i=PublicMethods.inputNumber();
        int j=PublicMethods.inputNumber();
        int[] arr=PublicMethods.inputArrayValue(n);
        int[] newArr=prefixSumArray(arr);
        System.out.println(newArr[j]-newArr[i]);
    }
    static int[] prefixSumArray(int[] arr){

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-1];
        }
        return arr;
    }
}
