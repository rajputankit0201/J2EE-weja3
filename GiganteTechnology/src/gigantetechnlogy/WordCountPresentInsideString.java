//WAJP to count the word present in a given string
package gigantetechnlogy;

public class WordCountPresentInsideString {
		
		public static void main(String[] args) {
			
			
			String text = "Java is a high level programming language."; // Change this string to count words in a different one

	        // Split the string into words using whitespace as the delimiter
	        String[] words = text.split("\\s+");

	        int wordCount = words.length;

	        System.out.println("Original Text: " + text);
	        System.out.println("Word Count: " + wordCount);
	    }
}
