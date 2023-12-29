package itWorkInfoTech;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4, 0, 5};
        int[] result = moveZeroesToEndMethod1(arr);
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with Zeroes Moved to End (Method 1): " + Arrays.toString(result));
    }

    public static int[] moveZeroesToEndMethod1(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        return result;
    }
}
