package itWorkInfoTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsBetweenArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        
        List<Integer> commonElements = findCommonElements(array1, array2);

        
        System.out.println("Common Elements between the two arrays: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> commonElements = new ArrayList<>();
        int i = 0; 
        int j = 0; 

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return commonElements;
    }
}
