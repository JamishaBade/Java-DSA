package Sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    System.out.println("Array before sorting:");

  }

  static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int selected = arr[i];
      for (int j = i; j < arr.length - 1; j++) {

        if (arr[j] > selected) {
          selected = arr[j];
        }

      }
      int value = arr[j];

    }
  }

}
