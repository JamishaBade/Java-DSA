package OOP.Inheritance;

class Shape { // parent class
  String color;

  public void area() {
    System.out.println("displays area");
  }
}

class Triangle extends Shape { // child class
  public void area(int l, int h) {
    System.out.println((1 / 2 * h * l));
  }
}

public class InheritanceBasics {
  public static void main(String args[]) {
    Triangle t1 = new Triangle();
    t1.color = "red";
  }
}
