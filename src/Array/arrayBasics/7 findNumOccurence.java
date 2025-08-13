package Array.arrayBasics;
import java.util.Scanner;
 class findNumOccurence {
    static int findValue( int[] arr,int num){
        int sum=0;
        for (int j : arr) {
            if (j == num) {
                 sum++;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to be found: ");
        int value=input.nextInt();
        int []arr={51, 80, 39, 74, 74, 26, 53, 83, 60, 74, 48, 82, 43, 37, 67, 58, 69, 63, 65, 74};
        System.out.println("The value occurs "+findValue(arr,value)+" times.");
    }
}
