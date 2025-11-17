// Java program to show difference between Deterministic 
// and Non-deterministic algorithm.
package Algorithms;

import java.util.*;

class Algorithm {

  // Deterministic search
  static int deterministicSearch(int[] arr, int x) {
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] == x) {
        System.out.println("Deterministic Search: Found at index " + j);
        return j;
      }
    }

    System.out.println("Deterministic Search: Not found");
    return -1;
  }

  // Non-deterministic search (simulated using randomness)
  static int nonDeterministicSearch(int[] arr, int x) {

    // Seed random number generator
    Random rand = new Random();

    // Simulate the non-deterministic choice
    // by randomly picking an index
    for (int i = 0; i < arr.length; i++) {

      // Randomly pick an index
      int j = rand.nextInt(arr.length);
      if (arr[j] == x) {
        System.out.println("Non-deterministic Search: Found at index " + j);
        return j;
      }
    }
    System.out.println("Non-deterministic Search: Not found");
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int x = 3;
    deterministicSearch(arr, x);
    nonDeterministicSearch(arr, x);
  }
}