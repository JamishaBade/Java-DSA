package Array.TwoPointers;

import Imp.PublicMethods;

import java.util.Arrays;

public class squaredNumberSort {
    public static void main(String[] args) {

        int n = PublicMethods.inputNumber();
        int[] arr = PublicMethods.inputArrayValue(n);

        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Two pointer approach to sort 0s and 1s
        int left = 0;
        int right = arr.length - 1;
        int[] NewArray=new int[arr.length];
        int k=0;
        while( left<=right ){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
            NewArray[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                NewArray[k++]=arr[right]*arr[right];
                right--;
            }

        }
        // Print sorted array
        System.out.println("Sorted squared array: " + Arrays.toString(NewArray));





    }
}
