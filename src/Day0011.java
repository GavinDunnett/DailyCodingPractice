/**
 * This is coding practice from coderbyte.com
 * <p>
 * Challenge
 * Using the Java language, have the function LongestWord(sen) take the sen
 * parameter being passed and return the largest word in the string. If there
 * are two or more words that are the same length, return the first word from
 * the string with that length. Ignore punctuation and assume sen will not be
 * empty.
 * <p>
 * Sample Test Cases
 * Input:"fun&!! time"
 * Output:"time"
 * <p>
 * Input:"I love dogs"
 * Output:"love"
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0011 {

	public static void main(String[] args) {

		System.out.println(getLongestWord("I love dogs"));

	}

	public static String getLongestWord(String sen) {

		// holds longest word
		String longest = "";

		// enhanced for loop for iterating through the words in the given string
		for(String word : sen.split("\\s")) { // \\s =  whitespace
			if(word.length() > longest.length()) longest = word;
		}

		return longest;

	}
}
