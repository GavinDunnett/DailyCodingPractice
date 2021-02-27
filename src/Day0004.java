import java.util.Map; // package required for map data structure.
import java.util.HashMap; // package required for map data structure.

/**
 * This class is coding practice from codingbat.com
 * <p>
 * Preamble: Maps are a great data structure for taking in large amounts of data
 * and giving super-fast access. A map stores key/value pairs, where each key
 * has an associate value. Given a particular key, the map can look up the
 * associated value very quickly.
 * <p>
 * * word0 Challenge: Given an array of strings, return a Map<String, Integer>
 * containing a key for every different string in the array, always with the
 * value 0. For example the string "hello" makes the pair "hello":0. We'll do
 * more complicated counting later, but for this problem the value is simply 0.
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0004 {

	/**
	 * The main program.
	 *
	 * @param args Not used.
	 */
	public static void main(String[] args) {

		// create the map
		HashMap<String, Integer> strMap = new HashMap<>();

		// array holding strings.
		String[] strs = { "Alice", "Bob", "Clive", "David", "Fred", "Alice" };

		// enhanced for loop.
		for (String str : strs) {
			// check is string is already a key, if not add it.
			if (!strMap.containsKey(str)) { // check if map already has string.
				strMap.put(str, 0); // add string to map.
			}
		}

		// display all the map / value pairs by creating an Map.Entry object to
		// hold each map entry in turn.
		for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
