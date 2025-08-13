package BasicPractice;
import java.util.Scanner;
// Write a function to print the sum of all odd numbers from 1 to n.
public class problem2 {
    public static int odd(int n){
        int sum=0;

        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an odd Number");
        int n=input.nextInt();
        if(n%2==1){
            System.out.println("The sum of the odd numbers is "+odd(n));  ;
        }
        else{
            System.out.println("Sorry couldn't load. The user Input is not correct");
        }
    }
}
