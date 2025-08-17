package Recursion.problem_solving;

public class sumOfDigits {
  public static void main(String[] args) {
    int value = 1111; // ans should be 4

    System.out.println(sum(value));

  }

  // this is the base case
  static int sum(int value) {
    if (value < 10) {
      return value;
    }
    return (value % 10) + sum(value / 10); // value%10 extracts the last value
  }

}
/*
 * 
 * Time complexity:
 * O(n);
 */
