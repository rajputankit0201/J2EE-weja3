//write a java program to reverse given string.
package gigantetechnlogy;

public class ReverseString {
			
	public static void main(String[] args) {
		
		
		
		String original= "Hey how are you";
		String reversed= "";
		
		for(int i = original.length()-1; i>=0; i--) {
			reversed += original.charAt(i);
		}
		
		System.out.println("Original String : "+ original);
		System.out.println("Reversed String: " + reversed);
	}
}
