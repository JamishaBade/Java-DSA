package BasicPractice;

import java.util.Scanner;

public class problem3 {
    public static int compareLarger(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.print("Enter the first number");
        int a = input.nextInt();
        System.out.print("Enter the first number");
        int b = input.nextInt();
        System.out.println("The larger number is " + compareLarger(a, b));
    }
}
