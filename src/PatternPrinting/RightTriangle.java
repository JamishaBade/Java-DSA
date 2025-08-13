package PatternPrinting;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of the rows: ");
        int rows=input.nextInt();


        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-(i+1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
