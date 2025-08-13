package Array.prefixSumProblems;

import Imp.PublicMethods;

public class IfEqualInPartition {
    static int findArraySum(int[] arr){
        int sum=0;
        for (int j=0;j<arr.length;j++) {
            sum += arr[j];

        }
        return sum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefixSum=0;
        for (int j : arr) {
            prefixSum += j;
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n= PublicMethods.inputNumber();
        int[] arr=PublicMethods.inputArrayValue(n);
        System.out.println(equalSumPartition(arr));
    }
}
