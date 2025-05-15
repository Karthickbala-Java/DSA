import java.util.Arrays;

public class secondLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 78, 97 };
        int lengthOfArray = arr.length;
        secondLargestNumber(arr, lengthOfArray);
    }

    // * brute force approach
    static void secondLargestNumber(int[] arr, int lengthOfArray) {
        Arrays.sort(arr);
        System.out.println(arr[lengthOfArray]);
    }
}
