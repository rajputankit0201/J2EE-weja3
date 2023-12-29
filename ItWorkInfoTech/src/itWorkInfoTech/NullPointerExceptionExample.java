package itWorkInfoTech;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
           	int length = str.length(); 
            System.out.println("Length: " + length); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
