package arrayList;

import java.util.ArrayList;

/*input- [0,10,3,5,22,10]
// output-[10,22,5,3,10,0]
 two pointers concept*/

public class reverseArrayList {
  static void reverseList(ArrayList<Integer> list) {
    System.out.println("Before: " + list);
    int i = 0;
    int j = list.size() - 1;
    while (i < j) {
      Integer temp = Integer.valueOf(list.get(i));
      list.set(i, list.get(j));
      list.set(j, temp);
      i++;
      j--;
    }
    System.out.println("After: " + list);
  }

  public static void main(String[] args) {
    ArrayList<Integer> listValue = new ArrayList<>();
    listValue.add(0);
    listValue.add(10);
    listValue.add(3);
    listValue.add(5);
    listValue.add(22);
    listValue.add(10);
    reverseList(listValue);
  }

}
