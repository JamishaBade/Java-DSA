package Array.arrayBasics;
import java.util.Scanner;
public class checkValueInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=input.nextInt();

        int[] arr=Imp.PublicMethods.inputArrayValue(n);

        System.out.println("Enter the number of frequency");
        int freq=input.nextInt();
        int[] finalArray= makeFreq(arr);

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(makeFreq(arr)));

        for(int i=0;i<freq;i++){
            System.out.print("Enter element to check "+(i+1));
            int value=input.nextInt();
            if(finalArray[value]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
    static int[] makeFreq(int[] arr){
        int[] newFreqArray=new int[105];
        for(int i=0;i<arr.length;i++){
            newFreqArray[arr[i]]++;
        }
        return newFreqArray;
    }

}
