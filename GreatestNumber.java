import java.util.*;
import java.io.*;

public class GreatestNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };

        // bigNoArray(arr);
        inBuiltMethod(arr);
    }

    static void bigNoArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    static void inBuiltMethod(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }

}