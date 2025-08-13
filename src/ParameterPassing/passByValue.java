package ParameterPassing;

public class passByValue {

    static int changeValue(int a){
        a+=5;
        return a;

    }
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before changing: "+a );
        System.out.println(changeValue(a));

        System.out.println("after changing value: "+a);
    }
}
