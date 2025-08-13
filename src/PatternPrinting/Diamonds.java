package PatternPrinting;
import java.util.Scanner;
public class Diamonds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int value = input.nextInt();
        int value2 = value / 2 + 1;
        System.out.println(value2);


            for (int i = 0; i < value2; i++) {
                for (int j = 0; j < value2 - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int l = 0;l < 2 * (i + 1) - 1; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }





        for(int i=0;i<value2-1;i++){
            for(int k=0;k<i+1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(value2-1-i)*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }










