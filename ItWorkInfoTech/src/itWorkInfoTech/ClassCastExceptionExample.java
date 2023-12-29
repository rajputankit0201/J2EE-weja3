package itWorkInfoTech;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
        	Object obj = "Hello";
            Integer num = (Integer) obj; 
            System.out.println("Value: " + num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}

