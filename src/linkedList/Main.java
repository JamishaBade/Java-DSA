package linkedList;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> vehicles = new LinkedList<>();
    vehicles.add("cars");
    vehicles.add("truck");
    vehicles.add("motorcycle");
    vehicles.add("Scooter");
    vehicles.addFirst("BMW");
    System.out.println(vehicles);
  }

}
