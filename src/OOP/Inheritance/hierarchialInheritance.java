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

class Circle extends Shape {
  public void area(int r) {
    System.out.println((3.14) * r * r);
  }
}
