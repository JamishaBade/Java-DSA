package Array.arrayBasics;

 class changingArrayValue {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.print("The array before changed: ");
        printArray(arr);
        changeValue(arr);
        System.out.print("The array after changed: ");
        printArray(arr);

    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void changeValue(int[] arr){
        for(int i=0;i<arr.length;i++) {
            arr[i]=0;
        }

    }







}
