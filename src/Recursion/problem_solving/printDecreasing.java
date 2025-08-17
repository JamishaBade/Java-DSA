package Recursion.problem_solving;

import java.util.*;

//write a program to print all the natural numbers from n to 1
public class printDecreasing {
  static void printDecrease(int n) {
    if (n == 1) {
      System.out.println(1);
      return;
    }
    System.out.print(n);
    printDecrease(n - 1);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number");
    int n = input.nextInt();
    printDecrease(n);
  }

}

/*
 * 
 * Time complexity:
 * O(n);
 */