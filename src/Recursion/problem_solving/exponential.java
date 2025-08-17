package Recursion.problem_solving;

//given two numbers p and q, find the value of p to the power q using recursion functions.
public class exponential {
  static int findExponent(int p, int q) {

    if (q == 1) {
      return p;
    }
    return findExponent(p, q - 1) * p;
  }

  public static void main(String[] args) {
    System.out.println("The exponent of p to the power q is " + findExponent(6, 2));
    System.out.println("The exponent of p to the power q is " + findExponent(4, 2));
    System.out.println("The exponent of p to the power q is " + findExponent(8, 2));
    System.out.println("The exponent of p to the power q is " + findExponent(10, 2));
    System.out.println("The exponent of p to the power q is " + findExponent(8, 3));

  }

}

/*
 * The time complexity is O(q) (or O(n) where n = q) because the function makes
 * q recursive calls, each reducing q by 1 until it reaches the base case.
 */
