import java.util.Map; // package required for map data structures.
import java.util.HashMap; // package required for hash type map structures.

/**
 * This class is coding practice from codingbat.com
 * <p>
 * Preamble:
 * Maps are a great data structure for taking in large amounts of data and
 * giving super-fast access. A map stores key/value pairs, where each key has
 * an associate value. Given a particular key, the map can look up the
 * associated value very quickly.
 * <p>
 * wordCount Challenge:
 * The classic word-count algorithm: given an array of strings, return a
 * Map<String, Integer> with a key for each different string, with the value
 * the number of times that string appears in the array.
 * <p>
 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class day0005 {

    public static void main(String[] args) {

        //create the hashMap
        HashMap<String, Integer> sMap = new HashMap<>();

        //create the string array
        String[] sArray = {"a", "b", "a", "c", "b"};

        //enhanced for loop over the string array
        for (String key : sArray) {
            if(!sMap.containsKey(key)) sMap.put(key, 0); // if key missing, create.
            Integer i = sMap.get(key); // get key's current quantity.
            i++; // increment that quantity.
            sMap.put(key, i); // store the new quantity.
        }

        // display the map
        for(Map.Entry<String, Integer> entry : sMap.entrySet()) {
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }

    }
}
