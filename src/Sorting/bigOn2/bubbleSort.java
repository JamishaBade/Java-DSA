package Sorting.bigOn2;

public class bubbleSort {
  public static void main(String[] args) {
    int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    System.out.println("Array before sorting:");
    printArray(arr);
    sort(arr);
    System.out.println("Array after sorting");
    printArray(arr);

  }

  public static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {

      boolean swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // Swap arr[j] and arr[j+1]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {// if everything is sorted already then stop the iteration
        break;
      }
    }
    ;

  };

  public static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println(); // New line after printing
  }

}

/*
 * Space complexity: O(1)
 * Time complexity:
 * best case: Ω(n)
 * Average case: Θ(n^2)
 * worst case: O(n^2)
 * 
 */