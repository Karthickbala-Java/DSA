public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        System.out.println(sotedArrayOrNot(arr));
    }

    // brute force approach
    static boolean sotedArrayOrNot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            if (!(arr[i] > arr[i - 1])) {
                return false;
            }

        }
        return true;
    }
}
