package BasicPractice;
import java.util.Scanner;
//Enter 3 numbers from the user & make a function to print their average.
public class problem1 {
    public static int average(int a, int b, int c){
return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first value:");
        int a=input.nextInt();
        System.out.print("Enter the second value:");
        int b=input.nextInt();
        System.out.print("Enter the third value:");
        int c=input.nextInt();

        System.out.println("The average of the three values is "+ average(a,b,c));
    }
}
