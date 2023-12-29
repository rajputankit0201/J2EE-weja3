//WAJP to check whether the given number is palindrome or not.
package gigantetechnlogy;

public class GivenNumberIsPelindromeOrNot {

	public static void main(String[] args) {
	
			
		int number=12321;// Change this number to check different cases
		
		int originalNumber=number;// Store the original number
		int reverseNumber=0;//Initialize a variable to store the reversed number 
		
		while (number>0) {
			int digit=number % 10;//Get the last digit.
			reverseNumber=reverseNumber * 10 + digit;//Build the reversed number
			number = number / 10;//Remover the last digit
		}
		//Check if the original number and the reversed number are the same.
		if (originalNumber== reverseNumber) {
			System.out.println("The number is palindrome.");
		}
		else{
			System.out.println("The number is not palindrome.");
		}
	}
}
