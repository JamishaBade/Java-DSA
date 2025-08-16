package Recursion;

import java.util.*;

//write a program to print all the natural numbers from n to 1
public class ex1 {
  static void printDecreasing(int n) {
    if (n == 1) {
      System.out.println(1);
      return;
    }
    System.out.print(n);
    printDecreasing(n - 1);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number");
    int n = input.nextInt();
    printDecreasing(n);
  }

}
