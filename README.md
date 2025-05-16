# first Problem Brute force approach

```java
// Brute force approach to find the maximum element in an array
public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
```

# Inbuilt Method of Java

```java
static void inBuiltMethod(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }

```

# Second problem

```java
//brute force approach
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
    // * better solution
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

       // * optimal solution
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

```

# Third problem sorted array or not

```java
 // brute force approach
    static boolean sotedArrayOrNot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            if (!(arr[i] > arr[i - 1])) {
                return false;
            }

        }
        return true;
    }
```
