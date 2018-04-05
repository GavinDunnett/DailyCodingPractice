import java.util.Map; // package required for map objects.
import java.util.HashMap; // package required for hash type map objects.

/**
 * This class is coding practice from codingbat.com
 * <p>
 * Preamble:
 * Maps are a great data structure for taking in large amounts of data and
 * giving super-fast access. A map stores key/value pairs, where each key has
 * an associate value. Given a particular key, the map can look up the
 * associated value very quickly.
 * <p>
 * wordMultiple Challenge:
 * Given an array of strings, return a Map<String, Boolean> where each different
 * string is a key and its value is true if that string appears 2 or more times
 * in the array.
 * <p>
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0006 {

    /**
     * The main program.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        // create a string array
        String[] strings = {"a", "b", "a", "c", "b"};

        // create the HashMap
        HashMap<String, Boolean> map = new HashMap<>();

        // declare integer used to accumulate occurrences of each string
        int acc;

        // nested for loops over the string array to count the occurrences of
        // each string
        for (int start = 0; start < strings.length; start++) {
            acc = 1; // reset the accumulator
            for (int current = start + 1; current < strings.length; current++) {
                // check the string array for addition occurrences of the
                // same string as at the start position.
                if (strings[current].equals(strings[start])) acc++;
            }
            // add the string as a new key, first checking the key is not
            // already in the map. The string will be added to the map and its
            // value set according to the accumulator.
            if (!map.containsKey(strings[start])) {
                if (acc >= 2) map.put(strings[start], true);
                else map.put(strings[start], false);
            }
        }
        // display the map
        for(Map.Entry<String, Boolean> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
