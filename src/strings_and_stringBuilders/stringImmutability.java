
package strings_and_stringBuilders;

public class stringImmutability {
  public static void main(String[] args) {
    String s1 = "hello";
    System.out.println("Original String: " + s1);

    // Try to change it
    String s2 = s1.concat(" world");
    // you cant concat or change .charAt. but u can redeclare it completely so that
    // a new value is created in the heap and the strings points on the new value.

    System.out.println("After concat:");
    System.out.println("s1: " + s1); // still "hello"
    System.out.println("s2: " + s2); // new string "hello world"
  }
}
