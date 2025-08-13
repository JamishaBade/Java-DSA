package Array.TwoPointers;

import Imp.PublicMethods;

import java.util.Arrays;

public class SortBinaryNum1 {
    public static void main(String[] args) {
        System.out.println("Length of number");
        int n=PublicMethods.inputNumber();
        int[] arr=PublicMethods.inputArrayValue(n);
        int[] newArr=new int[n];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                newArr[i]=0;
            }
            else{
                newArr[i]=1;
            }
        }

        System.out.print(Arrays.toString(newArr));
    }
}
