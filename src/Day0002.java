
import java.util.Scanner; // package needed to read keyboard input.
import java.util.HashMap; // package needed for map data structure.

/**
 * This program is coding practice from the book, Java Early Objects.
 * <p>
 * Preamble:
 * Many companies use telephone numbers such as 555-GET-FOOD so that the
 * number is easier for their customers to remember. On a standard telephone,
 * the alphabet letters are mapped to the number buttons.
 * <p>
 * Alphabet Telephone Number Translator Challenge.
 * Write an application that asks the user to enter a 10 character telephone
 * number in the format xxx-xxx-xxxx. The application should display the
 * telephone number with any alphabet characters translated to their numeric
 * equivalent.
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0002 {

    /**
     * The main program.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        // create and populate the map that hold the character to numeric info
        HashMap<Character, Character> mapTele = new HashMap<>();
        mapTele.put('A', '2');
        mapTele.put('B', '2');
        mapTele.put('C', '2');
        mapTele.put('D', '3');
        mapTele.put('E', '3');
        mapTele.put('F', '3');
        mapTele.put('G', '4');
        mapTele.put('H', '4');
        mapTele.put('I', '4');
        mapTele.put('J', '5');
        mapTele.put('K', '5');
        mapTele.put('L', '5');
        mapTele.put('M', '6');
        mapTele.put('N', '6');
        mapTele.put('O', '6');
        mapTele.put('P', '7');
        mapTele.put('Q', '7');
        mapTele.put('R', '7');
        mapTele.put('S', '7');
        mapTele.put('T', '8');
        mapTele.put('U', '8');
        mapTele.put('V', '8');
        mapTele.put('W', '9');
        mapTele.put('X', '9');
        mapTele.put('Y', '9');
        mapTele.put('Z', '9');

        //create object to read keyboard input
        Scanner in = new Scanner(System.in);

        //ask th user to input the telephone number
        System.out.println("Enter telephone number XXX-XXX-XXXX : ");

        //declare a string to get the number while converting all characters to
        //uppercase
        String number = in.nextLine().toUpperCase();

        //enhanced for loop to display the number in numeric form
        for (Character c : number.toCharArray()) {
            if (c >= 'A' && c <= 'Z') { // test if letter
                System.out.print(mapTele.get(c)); // covert letter
            } else
                System.out.print(c); // not letter so don't convert
        }
    }
}
