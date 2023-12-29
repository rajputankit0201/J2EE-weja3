package itWorkInfoTech;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
    	String sentence = "Java is a high level programming language.";

        System.out.println("Original Sentence: ");
        System.out.println(sentence);

        Map<Character, Integer> charCountMap = new HashMap<>();
        findAndPrintDuplicateCharacters(sentence, charCountMap);
    }

    public static void findAndPrintDuplicateCharacters(String sentence, Map<Character, Integer> charCountMap) {
        for (char c : sentence.toCharArray()) {
            // Ignore spaces and non-alphabetical characters
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Convert to lowercase for case insensitivity
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("\nDuplicate Characters in the Sentence: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
