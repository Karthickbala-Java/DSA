import java.util.Arrays;

public class secondLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 78, 97 };
        int lengthOfArray = arr.length;
        // secondLargestNumber(arr, lengthOfArray);
        // optimisedApproach(arr, lengthOfArray);
        optimalSolution(arr, lengthOfArray);
    }

    // * brute force approach
    static void secondLargestNumber(int[] arr, int lengthOfArray) {
        Arrays.sort(arr);
        System.out.println(arr[lengthOfArray - 1]);
    }

    // * Better solution
    static void optimisedApproach(int[] arr, int lengthOfArray) {
        int max = Integer.MIN_VALUE;
        // max
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int second_Max = Integer.MIN_VALUE;
        // second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && second_Max < arr[i]) {
                second_Max = arr[i];
            }
        }
        System.out.println(second_Max);
    }

    // * Optimal solution
    static void optimalSolution(int[] arr, int lengthOfArray) {
        int max = Integer.MIN_VALUE;
        int second_Max = Integer.MIN_VALUE;
        for (int i = 0; i < lengthOfArray; i++) {
            if (arr[i] > max) {
                second_Max = max;
                max = arr[i];
            }
        }
        System.out.println(second_Max);
    }
}
