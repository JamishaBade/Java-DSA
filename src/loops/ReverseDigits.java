package loops;


public class ReverseDigits {
    public static void main(String[] args) {
        long value=Input.input();
        System.out.println(Reversing.Reverse(value));
    }
}
class Reversing{
    public static long Reverse(long value){
        long num=0;
        while(value!=0){
            num=num*10+value%10;
            value/=10;
        }
        return num;
    }
}
