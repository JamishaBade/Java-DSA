package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortDescending {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Ball");
    list.add("Cat");
    list.add("Dog");
    list.add("Chestnut");
    System.out.println("before sorting " + list);
    Collections.sort(list);
    System.out.println("after sorting " + list);

  }

}
