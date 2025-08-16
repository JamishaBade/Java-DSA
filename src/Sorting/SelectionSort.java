package Sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {

    int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    System.out.println("Array before sorting:");
    System.out.println(Arrays.toString(arr));// remember to convert into string to print array
    System.out.println("Array after selection sorting");
    sort(arr);

  }

  static void sort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      int selected = arr[i];
      for (int j = i + 1; j < arr.length; j++) {// its not arr.length-1 cuz it wont compare the last digit in the array,
                                                // since j=i+1

        if (arr[j] < selected) {
          index = j;
          selected = arr[j];
        }

      }
      int value = arr[index];
      arr[index] = arr[i];
      arr[i] = value;

    }
    System.out.println(Arrays.toString(arr));
  }

}
