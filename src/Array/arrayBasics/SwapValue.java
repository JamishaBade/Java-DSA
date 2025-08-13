package Array.arrayBasics;

public class SwapValue {
    public static void main(String[] args) {
        int value1=108;
        int value2=905;

        System.out.println("Values before changing ");
        System.out.println("value 1: "+value1);
        System.out.println("Value 2: "+value2);
        System.out.println("Values after changing ");
        value1=value1+value2;
        value2=value1-value2;
        value1=value1-value2;
        System.out.println("value 1: "+value1);
        System.out.println("Value 2: "+value2);

    }
}
