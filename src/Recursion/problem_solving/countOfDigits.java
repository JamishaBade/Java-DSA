package Recursion.problem_solving;

//import java.util.Scanner;
//return the count of digits in a given number n.
public class countOfDigits {
  public static void main(String[] args) {
    int value = 11111111; // 8 bits
    System.out.println(counter(value));

  }

  static int counter(int value) {
    if (value < 10)
      return 1; // base case
    return counter(value / 10) + counter(value % 10); // this is the recursion and the self work =counter(value % 10)
  }

}