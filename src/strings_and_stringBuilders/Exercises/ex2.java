package strings_and_stringBuilders.Exercises;
//given a string s, print all the substrings of s

// input- "abcd", output- "a ab abc abcd b bc bcd c cd d"
public class ex2 {
  public static void main(String[] args) {
    String s = "abcd";
    for (int i = 0; i < s.length(); i++) {

      for (int j = i; j <= s.length(); j++) {
        System.out.println(s.substring(i, j));
      }
    }
  }

}
