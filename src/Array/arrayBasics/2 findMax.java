package Array.arrayBasics;
import java.util.*;
 class findMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int value=input.nextInt();
        int[] arr=new int[value];

        for(int i=0;i<value;i++){
            System.out.print("Enter element "+(i+1));
             arr[i]=input.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<value;i++){
            if (max < arr[i]) {
                max=arr[i];
            }
        }

        System.out.println("The maximum value is "+ max);

    }
}
