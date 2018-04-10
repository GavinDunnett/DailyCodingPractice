/**
 * This class is coding practice from codeingbat.com
 * <p>
 * doubleChar Challenge:
 * Given a string, return a string where for every char in the original,
 * there are two chars.
 * <p>
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0008 {

	/**
	 * The main program.
	 *
	 * @param args Not used.
	 */
	public static void main(String[] args) {

		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
	}
	/**
	 * This method takes a string, doubles each character, and returns it.
	 *
	 * @param str A String that will have its characters doubled.
	 * @return A String with its characters doubled.
	 */
	public static String doubleChar(String str) {

		// use a StringBuilder to construct the return string
		StringBuilder sb = new StringBuilder();

		// iterate through the string
		for (char c : str.toCharArray()) {
			sb.append(c);
			sb.append(c);
		}
		return sb.toString();
	}
}
