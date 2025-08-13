package loops;

public class SumDigits {
    public static void main(String[] args) {
        long value = Input.input();
        System.out.println(summingDigits.Sum(value));

    }

}

class summingDigits {
    public static long Sum(long value) {
        long sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
}
