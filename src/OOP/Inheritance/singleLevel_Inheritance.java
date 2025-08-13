package OOP.Inheritance;

class Shape { // parent class

  public void area() {
    System.out.println("displays area");
  }
}

class Triangle extends Shape { // child class
  public void area(int l, int h) {
    System.out.println((1 / 2 * h * l));
  }
}
