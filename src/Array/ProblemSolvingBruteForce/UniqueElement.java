package Array.ProblemSolvingBruteForce;

public class UniqueElement {
    static int findUniqueValue(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean isUnique = true;

            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                return arr[i]; // Return the first unique element
            }
        }

        return -1; // If no unique element is found
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 2, 3, 2, 1, 5};
        System.out.println(findUniqueValue(array)); // Output: 6
    }
}
