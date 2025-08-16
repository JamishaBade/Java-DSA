package Sorting.Problems;

//given an array of names of the fruits; sort it in lexicographical orer using selection sort

/*
 Input:["kiwi", "mango", "apple", "watermelon", "Dragonfruit"];
 Output:[ "apple", "Dragonfruit", "kiwi", "mango","watermelon"]
 */
public class ex2 {
  static void sort(String[] fruits) {
    int n = fruits.length;
    for (int i = 0; i < n - 1; i++) {
      int min_val = i;
      for (int j = i + 1; j < n; j++) {
        if (fruits[j].compareTo(fruits[min_val]) < 0) {// comparing strings
          min_val = j;
        }
      }
      String temp = fruits[min_val];
      fruits[min_val] = fruits[i];
      fruits[i] = temp;
    }
  }

  public static void main(String[] args) {
    String[] fruits = { "kiwi", "mango", "apple", "watermelon", "dragonfruit" };
    sort(fruits);

    for (String val : fruits) {
      System.out.println(val + " ");
    }
  }

}
