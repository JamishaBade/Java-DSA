package Recursion.problem_solving;

import java.util.Scanner;

//write a program to print all the natural numbers from 1 to n using recursion. 
public class printIncreasing {

  static void printIncrease(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printIncrease(n - 1);
    System.out.print(n + " ");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int value = input.nextInt();
    printIncrease(value);

  }

}
