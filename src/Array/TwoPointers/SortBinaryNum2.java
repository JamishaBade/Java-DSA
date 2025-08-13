
package Array.TwoPointers;

import Imp.PublicMethods;
import java.util.Arrays;

public class SortBinaryNum2 {
    public static void main(String[] args) {
        int n = PublicMethods.inputNumber();
        int[] arr = PublicMethods.inputArrayValue(n);

        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Two pointer approach to sort 0s and 1s
        int left = 0;
        int right = arr.length - 1;


        while( left<right ){
            if(arr[left]==1&&arr[right]==0){
                Imp.PublicMethods.reverse(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

        }


        // Print sorted array
        System.out.println("Sorted binary array: " + Arrays.toString(arr));
    }
}
