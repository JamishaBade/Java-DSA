package NumberSystem;
import Imp.*;

import static NumberSystem.Conversion.convert;

public class DeciToBin {
    public static void main(String[] args) {
        int Decimal=PublicMethods.inputNumber();

        System.out.println(Conversion.convert(Decimal));

    }
}
class Conversion{
    static int convert(int Decimal) {
        int value = 0;
        int Binary = 0;
        int count;
        for (count = 0; Decimal > 0; count++){
            Binary = Decimal % 2;
            Decimal = Decimal / 2;
            value = value + Binary * 10 ^ count;
        }



        return value;
    }

}


