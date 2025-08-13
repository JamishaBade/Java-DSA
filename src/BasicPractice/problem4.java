package BasicPractice;
import java.util.Scanner;
//Write a function that takes in the radius as input and returns the circumference of a circle.
public class problem4 {

    public static int circumference(int radius){
        final float pi=3.1415F;
        return (int) (2*radius*pi);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius=input.nextInt();
        System.out.println("The circumference of the circle with the radius "+radius+ " is "+circumference(radius));
    }
}
