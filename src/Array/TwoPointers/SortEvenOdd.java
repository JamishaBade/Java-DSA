package Array.TwoPointers;

import Imp.PublicMethods;

import java.util.Arrays;
//Sort Even numbers and then odd; the order within the even and odd part doesn't matter
public class SortEvenOdd {
    public static void main(String[] args) {

        int n = PublicMethods.inputNumber();
        int[] arr = PublicMethods.inputArrayValue(n);

        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Two pointer approach to sort 0s and 1s
        int left = 0;
        int right = arr.length - 1;


        while( left<right ){
            if(arr[left]%2==1&&arr[right]%2==0){
                Imp.PublicMethods.reverse(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }

        }


        // Print sorted array
        System.out.println("Sorted binary array: " + Arrays.toString(arr));

    }
}
