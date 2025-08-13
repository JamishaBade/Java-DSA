package Array.MatrixTranspose;

import java.util.Scanner;

import static Array.arrayBasics.rotateArrayWithoutSpace.reverseArray;

public class ex2_rotate90 {

    static void reverseArray(int[] arr){

        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static int[][] transposeMatrix(int [][] matrix, int r, int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }

    public static void printMatrix(int [][]matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    };
    public static int[][] rotateMatrix(int [][]matrix, int n){
        int [][]arr=transposeMatrix(matrix,n,n);
        for(int i=0;i<n;i++){
            reverseArray(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("enter"+ totalElements+"values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);
        int[][] arr=rotateMatrix(matrix, r);
        System.out.println("90 DEGREES ROTATION of Matrix");
        printMatrix(arr);


    }
}
