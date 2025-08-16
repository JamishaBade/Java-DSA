package Recursion;

import java.util.Scanner;

//write a program to print all the natural numbers from 1 to n using recursion. 
public class Main {

  static void printIncreasing(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printIncreasing(n - 1);
    System.out.print(n + " ");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int value = input.nextInt();
    printIncreasing(value);

  }

}
