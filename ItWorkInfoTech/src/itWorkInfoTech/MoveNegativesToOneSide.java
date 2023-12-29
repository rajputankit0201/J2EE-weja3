package itWorkInfoTech;

public class MoveNegativesToOneSide {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, -1, -2, 7, -5, 9, 0};

        System.out.println("Original Array:");
        printArray(arr);

        moveNegativesToOneSide(arr);

        System.out.println("Array After Moving Negatives to One Side:");
        printArray(arr);
    }

    public static void moveNegativesToOneSide(int[] arr) {
        int left = 0; // Index for the left side of the array
        int right = arr.length - 1; // Index for the right side of the array

        while (left <= right) {
            // Find the first positive element from the left side
            while (left <= right && arr[left] < 0) {
                left++;
            }

            // Find the first negative element from the right side
            while (left <= right && arr[right] >= 0) {
                right--;
            }

            // Swap the positive element at 'left' with the negative element at 'right'
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
