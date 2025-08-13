package Array.arrayBasics;
import java.util.Scanner;
 public class findNumAndLastOccurrence {

        public static int findValue( int[] arr,int num){
            int sum=0;
            for (int j : arr) {
                if (j == num) {
                    sum++;
                }
            }
            return sum;

        }
        static int lastOccurence(int[] arr,int num){
            int index=-1;
            for (int j =0;j<arr.length;j++) {
                if (arr[j] == num) {
                    index=j;
                }
            }
            return index+1;
        }


    public static int[] inputValue(int value){
        Scanner input=new Scanner(System.in);

        int[] arr=new int[value];
        for(int i=0;i<value;i++){
            System.out.print("Enter element "+(i+1));
            arr[i]=input.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr;
        System.out.print("Enter the value: ");
        int value=input.nextInt();
        System.out.print("Enter the size of the array: ");
        int sizeOfArray=input.nextInt();
        arr=inputValue(sizeOfArray);
        System.out.println(findValue( arr, value));

        //last occurrence
        System.out.println("The last occurence of the value is "+lastOccurence(arr,value));
        }



}
