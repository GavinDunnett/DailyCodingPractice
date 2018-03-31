/**
 * This class is coding practice from codingbat.com
 * <p>
 * Preamble:
 * Maps are a great data structure for taking in large amounts of data and
 * giving super-fast access. A map stores key/value pairs, where each key has
 * an associate value. Given a particular key, the map can look up the
 * associated value very quickly.
 * <p>
 * * mapBully Challenge:
 * Modify and return the given map as follows: if the key "a" has a
 * value, set the key "b" to have that value, and set the key "a" to have the
 * * value "". Basically "b" is a bully, taking the value and replacing it
 * with  the empty string.
 * <p>
 * <p>
 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
import java.util.HashMap; // package needed for map data structure.
import java.util.Map; // package needed for map data structure.

public class Day0001 {

    //create the map
    private static Map<String, String> mapBully = new HashMap<>();

    /**
     * The main program.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        //populate the map
        mapBully.put("a", "candy");
        mapBully.put("b", "dirt");

        displayMap();

        //set key b's value equal to key a's
        mapBully.put("b", mapBully.get("a"));

        displayMap();

        //set key a's value to ""
        mapBully.put("a", "");

        displayMap();
    }

    /**
     * This method displays the entire map using an enhanced for loop
     */
    private static void displayMap() {

        // create an Map.Entry object to hold each map entry in turn.
        for (Map.Entry<String, String> entry : mapBully.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
