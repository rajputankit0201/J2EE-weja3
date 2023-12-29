package itWorkInfoTech;

public class StringIndexOutOfBoundsExceptionExample {
   
	public static void main(String[] args) {
        try {
            String text = "Hello, World!";
            char character = text.charAt(15); 
            System.out.println("Character at index 15: " + character); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
