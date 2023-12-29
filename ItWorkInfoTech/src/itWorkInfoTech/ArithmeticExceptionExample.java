package itWorkInfoTech;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result); // This line won't be reached
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static int divide(int i, int j) {
        return i /j;
    }
}

