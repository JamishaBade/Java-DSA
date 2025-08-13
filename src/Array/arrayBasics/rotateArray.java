package Array.arrayBasics;
import java.util.Arrays;
import java.util.Scanner;
//rotate the array by "k" steps
public class rotateArray {

    static int[] rotate(int[] arr, int k){
        k=k%arr.length;
        int[] newArr=new int[arr.length];
        for(int i=0;i<k;i++){
            newArr[i]=arr[arr.length-k+i];
        }
        for(int i=0;i<arr.length-k;i++){
            newArr[i+k]=arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int value=input.nextInt();

        System.out.print("Enter the number to rotate: ");
        int k=input.nextInt();

       int[] arr= Imp.PublicMethods.inputArrayValue( value);
       //this prints the address of the array
        //System.out.println(rotate(arr, k));
        //this prints the actual content of the array
        System.out.println(Arrays.toString(rotate(arr, k)));

    }
}
