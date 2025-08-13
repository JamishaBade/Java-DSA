package ParameterPassing;
//this shows that java passes by value
public class exampleOne {
    public static void decrease(int n1, int n2) {
        n1--;
        n2 = n2 - 2;
        System.out.println(n1 + ";" + n2);
    }
// nl and n2 are formal parameters
        public static void main (String[] args){
            int p = 26;
            int q = 13;
            decrease(p, q);
            System.out.println(p + ":" + q);
        }
// since java is pass by value; they create a new memory location and modify so the original values are unchanged.
}
