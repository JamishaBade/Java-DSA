package strings_and_stringBuilders;

public class interning {
  public static void main(String[] args) {
    String s = "Hey";
    String x = "Hey";
    x = "Hi";
    System.out.println(s);
    System.out.println(x);
  }

}
