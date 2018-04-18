import java.util.StringTokenizer; // package required to tokenize strings

/**
 * This program is coding practice from codingbyte.com
 * <p>
 * LetterCapitalization Challenge
 * <p>
 * Using the Java language, have the function LetterCapitalize(str) take the
 * str parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0012 {

	/**
	 * The main method.
	 *
	 * @param args Not used.
	 */
	public static void main(String[] args) {

		// test the LetterCapitalize method
		System.out.println(LetterCapitalize("the quick brown fox jumped over the " +
						"lazy fox."));
		System.out.println(">>>" + LetterCapitalize("") + "<<<");
		System.out.println(">>>" + LetterCapitalize(" ") + "<<<");
	}

	/**
	 * This method capitalizes the first letter of the each word in a given
	 * string.
	 *
	 * Note: For this task, the StringTokenizer class is preferable to the String
	 * class as the String class and its requsite loops causes too many
	 * exceptions when parsing empty or malformed sentences.
	 *
	 * @param str A String that will have each of its words capitalized.
	 * @return The given String with each of its words capitalized.
	 */
	public static String LetterCapitalize(String str) {

		// declare and initialize a string builder object to hold the output string
		StringBuilder sb = new StringBuilder();

		// decompose the input string into individual words
		StringTokenizer words = new StringTokenizer(str," ", true);

		// while loop that iterates through the tokens
		while(words.hasMoreTokens()) {

			String word = words.nextToken();

			// build the return string with each word's first letter capitalized
			sb.append(Character.toUpperCase(word.charAt(0)))
							.append(word.substring(1));
		}

		// return the string with each of its words capitalized.
		return sb.toString();
	}
}
