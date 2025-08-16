package Recursion;
//STACK FLOW

/* LAST IN FIRST OUT . Recursion uses the call statck, thus recursion work with the same logic as this code. */

public class learnLogic {
  static void function1() {
    int x = 1;
    function2();
    System.out.println(x);
  };

  static void function2() {
    int x = 2;
    function3();
    System.out.println(x);
  };

  static void function3() {
    int x = 3;
    function4();
    System.out.println(x);
  };

  static void function4() {
    int x = 4;
    System.out.println(x);
  };

  public static void main(String[] args) {
    function1();
  }

}
