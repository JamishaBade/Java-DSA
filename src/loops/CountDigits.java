package loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

        long value=Input.input();
        System.out.println(Calculation.DigitsCounter(value));
    }
}
  class Input{
    public static long input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number :");

        return input.nextInt();
    }
}
 class Calculation{
    public static long DigitsCounter(long value){
        int count=0;
       while(value!=0){
           value/=10;
           count++;
       }

        return count;

    }
}