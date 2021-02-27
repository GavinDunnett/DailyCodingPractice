import java.util.Scanner; // required to read keyboard input.
import java.util.StringTokenizer; // required to tokenize strings

/**
 * This class is coding practice from the book, Java Early Objects.
 * <p>
 * Word Counter Challenge: Write a method that accepts a String object as an
 * argument and returns the number of words it contains. Demonstrate the method
 * in a program that asks the user to input a string then passes it to the
 * method. The number of words in the string should be displayed on the screen.
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0003 {

    /**
     * The main program.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        // create scanner object to read keyboard input
        Scanner in = new Scanner(System.in);

        // ask user to input a string
        System.out.println("Please enter a sequence of strings: ");

        // store the string
        String s = in.nextLine();

        // count and display the number of words in the string
        System.out.println("Number of words: " + countWords(s));
    }

    /**
     * This method uses the StringTokenizer class to calculate the number of words
     * in a given string.
     *
     * @param s A String with a sequence of words.
     * @return The number of words in that string.
     */
    private static int countWords(String s) {

        // trim string's leading blanks and create tokens from it.
        StringTokenizer tokens = new StringTokenizer(s.trim());

        // return the number of tokens that represents the number of words.
        return tokens.countTokens();
    }
}
