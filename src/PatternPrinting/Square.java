package PatternPrinting;
import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int value=input.nextInt();


        for(int i=0;i<value;i++){
            for(int j=0;j<value;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
