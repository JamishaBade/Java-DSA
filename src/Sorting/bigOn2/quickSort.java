package Sorting.bigOn2;
// worst case time complexity: O(n^2) 

// this is inplace so it doesnt take extra space.
// the first value/ element will be the pivot

public class quickSort {

  static void quicksort(int[] arr, int st, int end) {
    // this is the self work
    if (st >= end) // checks for safety
      return;
    int pi = partition(arr, st, end);
    // this is the recursion part
    quicksort(arr, st, pi - 1);
    quicksort(arr, pi + 1, end);
  }

  static int partition(int[] arr, int st, int end) {
    // this basically places the pivot in its postion and transfers everything
    // greater than in the right and less than to the left.
    int pivot = arr[st];
    int cnt = 0;

    for (int i = st + 1; i <= end; i++) {
      if (arr[i] <= pivot)
        cnt++;
    }

    int pivotIdx = st + cnt;
    swap(arr, st, pivotIdx);

    int i = st, j = end;
    while (i < pivotIdx && j > pivotIdx) {
      while (arr[i] <= pivot)
        i++;// Count elements <= pivot to find its final position
      while (arr[j] > pivot)
        j--;
      if (i < pivotIdx && j > pivotIdx)
        swap(arr, i, j);
    }

    return pivotIdx;
  }

  static void swap(int[] arr, int x, int y) { // a swapping function
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  static void displayArr(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = { 6, 3, 1, 4, 4, 5, 4 };
    System.out.println("Array before sorting");
    displayArr(arr);

    quicksort(arr, 0, arr.length - 1);

    System.out.println("Array after sorting");
    displayArr(arr);
  }
}
