package OOP.encapsulation;

class Car {
  // Private fields
  private String brand;
  private int speed;

  // Constructor
  public Car(String brand) {
    this.brand = brand;
    this.speed = 0; // car starts at 0 speed
  }

  // Getter for brand
  public String getBrand() {
    return brand;
  }

  // Getter for speed
  public int getSpeed() {
    return speed;
  }

  // Method to increase speed (with control)
  public void accelerate(int increment) {
    if (increment > 0) {
      speed += increment;
      System.out.println(brand + " accelerated to " + speed + " km/h");
    } else {
      System.out.println("Speed increment must be positive!");
    }
  }

  // Method to apply brakes (with control)
  public void brake(int decrement) {
    if (decrement > 0 && speed - decrement >= 0) {
      speed -= decrement;
      System.out.println(brand + " slowed to " + speed + " km/h");
    } else {
      System.out.println("Invalid brake amount!");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car("Tesla");

    myCar.accelerate(50); // Tesla accelerated to 50 km/h
    myCar.brake(20); // Tesla slowed to 30 km/h

    // Direct access not allowed:
    // myCar.speed = 200; ERROR: speed is private
  }
}
