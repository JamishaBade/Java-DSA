package Recursion.problem_solving;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number n: ");
    int value = input.nextInt();
    System.out.println(factorials(value));

  }

  static int factorials(int n) {

    if (n == 1 || n == 0) { // this is the base case
      return 1;
    }
    return n * factorials(n - 1);// main recursion

  }
}
