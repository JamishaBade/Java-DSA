package Array.ProblemSolvingBruteForce;

import Array.arrayBasics.findNumAndLastOccurrence;

import java.util.Scanner;

        public class ThreeSum {
            static int threeSum(int[] arr,int num){
                int sum=0;
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        for(int k=j+1;k<arr.length;k++){
                            System.out.println(i+" "+j+ " "+k);
                            System.out.println(arr[i]+arr[j]+arr[k]==num);
                            if( arr[i]+arr[j]+arr[k]==num){
                                sum++;
                            }
                        }
                    }
                }
                return sum ;
            }
            public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the array length");
                int value=input.nextInt();
                System.out.println("Enter the value of the number (that should be sumed up)");
                int[] arr= findNumAndLastOccurrence.inputValue(value);
                System.out.println("there are "+threeSum(arr,value)+" numbers that add up to the number "+ value);
            }
        }

