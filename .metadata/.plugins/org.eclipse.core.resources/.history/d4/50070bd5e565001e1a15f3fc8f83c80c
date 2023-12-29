package itWorkInfoTech;

public class SortArray012CountingSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 2, 0};
        sortArray012UsingCountingSort(arr);
        
        System.out.println("Sorted Array (Method 1 - Counting Sort): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray012UsingCountingSort(int[] arr) {
        int[] count = new int[3];
        int n = arr.length;

        // Count the occurrences of 0s, 1s, and 2s
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Update the original array with the sorted values
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
