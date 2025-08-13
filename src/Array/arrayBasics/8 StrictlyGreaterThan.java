package Array.arrayBasics;

import java.util.Scanner;

class StrictlyGreaterThan {
    static int count=0;
         public static void Compare(int num,int[] arr){
             for (int j : arr) {
                 if (num > j) {
                     System.out.print(j + " ");
                     count++;
                 }
             }

 }



   public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value to compare: ");
        int value=input.nextInt();
        System.out.println("enter the array Length: ");
        int arrLength=input.nextInt();
        int[] arr= findNumAndLastOccurrence.inputValue(arrLength);
        System.out.println("the num is strictly greater than ");
        Compare(value,arr);
        System.out.println("Hence there is "+count+ " numbers that is less than the value");
   }
}
