package Sorting.Problems;

import java.util.Arrays;

// QUESTION: Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements
public class ex1 {
  public static void main(String[] args) {
    int[] arr = { 0, 10, 0, 5, 0, 3, 0 };
    System.out.println("The unsorted arrays is" + Arrays.toString(arr));
    System.out.println("The sorted arrays is" + Arrays.toString(sort(arr)));
  }

  // for example: input: 0 5 0 3 42
  // output: 5 2 42 0 0 (using bubble sort)
  static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] == 0 && arr[j + 1] != 0) {
          arr[j] = arr[j + 1];
          arr[j + 1] = 0;
        }
      }

    }
    return arr;

  }

}
