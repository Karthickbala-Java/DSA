import java.util.*;
import java.io.*;

public class GreatestNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };

        bigNoArray(arr);
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
}