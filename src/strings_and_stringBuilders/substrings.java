package strings_and_stringBuilders;

public class substrings {
  public static void main(String[] args) {
    String str = "abcde";
    System.out.println(str.substring(1, 4));// the begin index is included but the endIndex is excluded
    // substring is a CONTINOUS part of a string
    // a, b, c, d, ab, abc, abcd, bc, bcd, cd
  }

}
