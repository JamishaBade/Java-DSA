package Recursion.problem_solving;

public class fibonacciNum {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(fibo(i));
    }

  }

  static int fibo(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    return fibo(n - 1) + fibo(n - 2);

  }
}

/* Time complexity is approximately O(2^n) */