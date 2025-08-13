package NumberSystem;
import Imp.PublicMethods;

public class BinToDeci {
    public static long getDecimal(long Binary) {
        long decimal = 0;
        long n = 0;
        while (true) {
            if (Binary == 0) {
                break;
            } else {
                long temp=Binary%10;
                Binary/=10;
                decimal+=temp*Math.pow(2,n);
                n++;
            }

        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Binary Number for conversion:");
      long value=PublicMethods.inputNumber();
      System.out.println(getDecimal(value));
    }
}
