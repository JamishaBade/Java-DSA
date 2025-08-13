package Array.arrayBasics;

 class SumOfArray {
    public static void main(String[] args) {
    int[] arr={1,5,3,10};
    int sum=0;

        for (int j : arr) {
            sum += j;

        }
        System.out.println("the sum of the array is "+ sum);

    }
}
