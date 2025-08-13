package arrayList;

import java.util.ArrayList;

public class basicsArrayList {
    public static void main(String[] args) {

        // these are the wrapper classes
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(3.21f);
        System.out.println(f);

        // arraylist allows to create an array without needing to declare the size of
        // the array.

        // making the ArrayList
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Boolean> listSecond = new ArrayList<>();

        // add new element
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);

        listSecond.add(true);
        listSecond.add(false);
        listSecond.add(false);
        listSecond.add(true);

        // get elemnent with an index
        System.out.println(listOne.get(0));

        // print with for loop
        for (int indexVal = 0; indexVal < listOne.size(); indexVal++) {
            System.out.println("index: " + indexVal + " " + listOne.get(indexVal)); // .get() function
        }

        // print directly
        System.out.println(listOne);
        System.out.println(listSecond);

        // adding a value at some index
        listOne.add(1, 100);
        listOne.add(5, 32);
        System.out.println(listOne);// we are able to manipulate the size of arrays

        // modifying element at index i
        listOne.set(1, 10);// .set() function
        System.out.println(listOne);

        // removing an element at index i
        listOne.remove(0);
        listOne.remove(1);
        listOne.remove(2);
        System.out.println(listOne);

        // removing an element (we dont know the index)
        listOne.remove(Integer.valueOf(32));
        System.out.println(listOne.remove(Integer.valueOf(5)));// this returns a boolean
        System.out.println(listOne);

        // checking if an element exists
        System.out.println("exists? " + listOne.contains(Integer.valueOf(6)));
        System.out.println("exists? " + listOne.contains(Integer.valueOf(10)));

        // if we dont specify the datatype of the class, then we can any type of data
        ArrayList newList = new ArrayList();
        newList.add(10);
        newList.add(true);
        newList.add(32.432);
        System.out.println(newList);

    }

}
