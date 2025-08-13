package constructors;

import java.io.*;

class People {

    // constructor with one argument
    People(String name) {
        System.out.println("Constructor with one "
                + "argument - String: " + name);
    }

    // constructor with two arguments
    People(String name, int age) {

        System.out.println(
                "Constructor with two arguments: "
                        + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous
    People(long id) {
        System.out.println(
                "Constructor with one argument: "
                        + "Long: " + id);
    }
}

class ConstructorOverload {
    public static void main(String[] args) {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        People character_one = new People("Sam");

        // Invoke the constructor with two arguments
        People character_two = new People("Miya", 28);

        // Invoke the constructor with one argument of
        // type 'Long'.
        People character_three = new People(325614567L);
        People character_four = new People(43034);
    }
}
