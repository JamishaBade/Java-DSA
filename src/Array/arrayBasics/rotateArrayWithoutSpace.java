package Array.arrayBasics;
import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayWithoutSpace {

    // Method to reverse part of the array
    public static void reverseArray(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Rotate array by k steps to the right
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n; // handle k > n

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();

        System.out.print("Enter the number to rotate: ");
        int k = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Rotated array: " + Arrays.toString(rotate(arr, k)));
    }
}
