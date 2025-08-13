package PatternPrinting;
import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        for(int i=0;i<value;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(value-i)*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
