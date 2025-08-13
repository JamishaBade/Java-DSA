package ParameterPassing;

public class exampleTwo {
    public static void makeTwice(int p) {
        p = p * 2;
        System.out.println("the p is " + p);
    }

    public static void main(String[] args) {
        int p = 24;
        makeTwice(p);
        System.out.println("p after the makeTwice function is " + p);
    }
}
