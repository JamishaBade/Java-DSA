package Array.arrayBasics;

import java.util.Scanner;
public class CheckSort {
    public static void isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");


    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int value= input.nextInt();
        int[] arr= findNumAndLastOccurrence.inputValue( value);
        isSorted(arr);
    }

}
