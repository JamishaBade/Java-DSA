package Sorting.bigOn2;

import java.util.Arrays;

public class insertionSort {
  static void sort(int[] arr) {
    // start from index 1
    for (int i = 1; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        // Swap arr[j] and arr[j-1]
        int swap = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = swap;
        j--;// move backwards till j>0
      }

    }
    // print the sorted arr
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {

    int[] arr = { 21, 42, 1, 24, 9, 3 };
    System.out.println("Unsorted Arrays:");
    System.out.println(Arrays.toString(arr));
    System.out.println("Sorted Arrays:");
    sort(arr);

  }

}
/*
 * Best Case Time Complexity:Ω(n)
 * Worst Case Time Complexity: O(n^2)
 */
