package itWorkInfoTech;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        int a[] = {33, 2, 45, 56, 78, 99};
        int max = a[0];
        int max2 = a[1];
        int min = a[0]; 

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max2 = max;
                max = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + max2);
        System.out.println("Minimum: " + min);
    }
}
