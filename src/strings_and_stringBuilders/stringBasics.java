package strings_and_stringBuilders;

import java.util.*;

public class stringBasics {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // declaration
    char[] arr = new char[7]; // predefined size
    // initialization
    /*
     * arr[0] = 'J';
     * arr[1] = 'a';
     * arr[2] = 'm';
     * arr[3] = 'i';
     * arr[4] = 's';
     * arr[5] = 'h';
     * arr[6] = 'a';
     * 
     * char[] arr2 = { 'b', 'a', 'd', 'e' };
     * System.out.println(arr);
     * System.out.println(arr2);
     * 
     * String str = "Computer Science";
     * System.out.println(str);
     * System.out.println("enter your name");
     * String value = input.nextLine(); // nextLine : can have space. next cant have
     * space
     * 
     * // Functions: .length() .charAt() .indexOf() .compareTo()
     * System.out.println("you are :" + value);
     * System.out.println("length is: " + value.length());
     * 
     * 
     * for (int i = 0; i < value.length(); i++) {
     * System.out.println(value.charAt(i));
     * System.out.println(value.indexOf('a'));// prints index of first found a in
     * value.
     * }
     * 
     */

    String name = "Jamisha";
    String name2 = "Jamisha";
    String name3 = "Jack";
    // lexigraphical comparision
    System.out.println(".compareTo() section");

    System.out.println(name.compareTo(name2)); // same name
    System.out.println(name.compareTo(name3));
    System.out.println(name3.compareTo(name));

    // function: .contains() .startsWith()
    System.out.println("function: .contains() .startsWith()");
    System.out.println(name.contains("Jam"));
    System.out.println(name.contains("j")); // case sensitive
    System.out.println(name.startsWith("Jam"));
    System.out.println(name.toUpperCase());
  }

}

/*
 * Inbuilt java functions:
 * 
 * - Basic String functions:
 * - length() : returns the length of the String
 * - charAt(index) : returns the character at a specific index
 * - indexOf(char) : returns the index of first occurrence of a character
 * - compareTo(str) : lexicographical comparison of two strings
 * - contains(str) : checks if a substring exists
 * - startsWith(str): checks if string starts with a prefix
 * - toUpperCase() : converts string to uppercase
 */