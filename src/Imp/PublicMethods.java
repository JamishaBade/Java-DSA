package Imp;

import java.util.Scanner;

public class PublicMethods {
        public static int inputNumber(){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number :");
            return input.nextInt();

    }
    public static int[] inputArrayValue(int value){
        Scanner input=new Scanner(System.in);

        int[] arr=new int[value];
        for(int i=0;i<value;i++){
            System.out.print("Enter element "+(i+1));
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void reverse(int [] arr,int i,int size){
          //  while(i<size){
                int temp=arr[i];
                arr[i]=arr[size];
                arr[size]=temp;
//                i++;
//                size--;


    }


}
