package strings_and_stringBuilders;

import java.util.Scanner;

public class string_int_char {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = "abc";
    String s2 = "def";
    String s3 = s1.concat(s2);

    s3 += "kjflajsfla";
    System.out.println(s3);
    System.out.println("abc" + 10 + 20); // abc1020 -> Left-to-right evaluation
    System.out.println("abc" + (10 + 20));// abc30 Parentheses evaluated first
  }

}
