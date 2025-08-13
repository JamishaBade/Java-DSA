package PatternPrinting;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of the rows: ");
        int value2=input.nextInt();
        for (int i = 0; i < value2; i++) {
            for (int j = 0; j < value2 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int l = 0;l < 2 * (i + 1) - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
