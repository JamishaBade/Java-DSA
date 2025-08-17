package strings_and_stringBuilders;

public class interning {
  public static void main(String[] args) {
    String s = "Hey";
    String x = "Hey";
    x = "Hi"; // if s and x is pointing at the same addr in heap then why didnt s change but x
              // did?
    // so after we redeclared value of x to Hi, a new value was added to the heap
    // and x pointed to the new heap. thus the old Hey addr is left unchanged.

    System.out.println(s);
    System.out.println(x);
  }

}
