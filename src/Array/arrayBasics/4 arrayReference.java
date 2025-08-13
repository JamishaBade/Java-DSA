package Array.arrayBasics;

 class arrayReference {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] arr_2=arr;
        System.out.println("The original array:");
        printArray(arr);
        System.out.println("The new array");
        printArray(arr_2);


        //changing the value of arr
        arr[0]=100;
        arr[1]=200;


        System.out.println("the original array after modification: ");
        printArray(arr);
        System.out.println("the new array after modification: ");
        printArray(arr_2);

    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }




}
