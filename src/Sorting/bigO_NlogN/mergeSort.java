package Sorting.bigO_NlogN;

public class mergeSort {

  // Main merge sort function
  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      // this finds the middle point
      int mid = left + (right - left) / 2;

      // sorts the first and second halves of the array
      mergeSort(arr, left, mid); //12 0 0
      mergeSort(arr, mid + 1, right);

      // this is the self work
      merge(arr, left, mid, right);
    }
  }

  // function to merge two subarrays of arr[]
  private static void merge(int[] arr, int left, int mid, int right) {
    // Sizes of two subarrays
    int num1 = mid - left + 1;
    int n2 = right - mid;

    // Temp arrays
    int[] L = new int[num1];
    int[] R = new int[n2];

    // Copy data
    for (int i = 0; i < num1; i++) {
      L[i] = arr[left + i];
    }
    for (int j = 0; j < n2; j++) {
      R[j] = arr[mid + 1 + j];
    }

    // Merge the temp arrays
    int i = 0, j = 0, k = left;
    while (i < num1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of L[]
    while (i < num1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    // copy the remained number
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6, 7 };

    System.out.println("OG array:");
    printArray(arr);

    mergeSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    printArray(arr);
  }

  // function to print the array. we could also do .toString() to directly print
  // the array
  private static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }
}
