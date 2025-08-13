package Array.TwoDimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows=input.nextInt();
        int cols=input.nextInt();
        int[][] arr=new int[rows][cols];

        System.out.println("Enter the values of the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter "+ (i+1)+ " "+(j+1));
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
