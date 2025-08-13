package Array.ProblemSolvingBruteForce;
import java.util.*;
import Array.arrayBasics.findNumAndLastOccurrence;
public class PairSum {
    static int pairSum(int[] arr,int num){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if( arr[i]+arr[j]==num){
                    sum++;
                }
            }
        }
        return sum ;
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter the value of the number (that should be sumed up)");
        int value=input.nextInt();
        System.out.println("Enter the length of the array");
        int arrLenth=input.nextInt();
       int[] arr=findNumAndLastOccurrence.inputValue(arrLenth);
        System.out.println("there are "+pairSum(arr,value)+" numbers that add up to the number "+ value);
    }
}
