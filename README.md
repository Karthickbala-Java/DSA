# Brute force approach

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

### Heading 3

#### Heading 4

##### Heading 5

###### Heading 6
