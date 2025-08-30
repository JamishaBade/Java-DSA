package Blind_75_LeetCode;

import java.util.*;

/* 
BRUTE FORCE APPROACH
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

This isnt the best way because the time complexity is O(n^2);
But need to learn search.
 */
public class TwoSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the target value");
    int target = input.nextInt();
    System.out.println("Enter the length of the array");
    int length = input.nextInt();
    int[] arr = new int[length];
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter value " + (i + 1));
      arr[i] = input.nextInt();
    }
    Solution mySol = new Solution();
    int[] result = mySol.twoSum(arr, target);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] arr = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          arr = new int[] { i, j };
          return arr;
        }
      }
    }
    return arr;
  }
};
