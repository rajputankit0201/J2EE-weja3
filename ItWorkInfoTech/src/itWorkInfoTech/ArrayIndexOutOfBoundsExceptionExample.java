package itWorkInfoTech;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 10; 
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
