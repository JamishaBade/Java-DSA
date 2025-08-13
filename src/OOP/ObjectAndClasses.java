package OOP;

class Pen { // blueprint
  String Color;
  String type;
  boolean isRefilled;

  public void write() {
    System.out.println("Writes Hello World");
    isRefilled = false;
  }

  public void refill() {
    System.out.println("refilling");
    isRefilled = true;
  }
}

class Student {
  String name;
  int age;

  public void printInfo() {
    System.out.println("Name of the Student " + this.name);
    System.out.println("Age of the Student " + this.age);
  }

}

public class ObjectAndClasses {
  public static void main(String[] args) {
    Pen myPen = new Pen();// object
    Pen newPen = new Pen();

    myPen.Color = "Red";
    myPen.type = "Ink Pen";
    System.out.println(myPen.Color);
    myPen.write();
    System.out.println(myPen.isRefilled);
    myPen.refill();
    System.out.println(myPen.isRefilled);

    newPen.type = "Highlighter";
    newPen.Color = "Yellow";
    System.out.println(newPen.type);
    System.out.println(newPen.Color);

    // students
    Student s1 = new Student();
    Student s2 = new Student();
    s1.name = "Sam ";
    s1.age = 16;
    s2.name = "James Gosling";
    s2.age = 70;
    s1.printInfo();
    s2.printInfo();
  }

}