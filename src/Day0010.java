/**
 * This class is coding practice from Coding.bat
 * <p>
 * scoresIncreasing Challenge:
 * Given an array of scores, return true if each score is equal or greater than
 * the one before. The array will be length 2 or more.
 * <p>
 * scoresIncreasing([1, 3, 4]) → true
 * scoresIncreasing([1, 3, 2]) → false
 * scoresIncreasing([1, 1, 4]) → true
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0010 {

    /**
     * The main program.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        // create the array of ints
        int[] sArray = {1, 3, 4};

        // test & display results
        System.out.println(ScoresIncreasing(sArray));
    }
    /**
     * This method implements the challenge.
     *
     * @param scores An array of ints.
     * @return True if each score is equal or greater than the one before.
     */
    public static boolean ScoresIncreasing(int[] scores) {

        boolean isEqualGreater = true; // flag that tracks the outcome

        // declare and initialize the variable that holds the value of the
        // previous element in the array. At the start, this variable holds
        // the value of the arrays first element.
        int oneBefore = scores[0];

        // enhanced for loop that iterates through the scores array
        for(int d : scores) {
            if(d < oneBefore) isEqualGreater = false; // if less, set flag false
            oneBefore = d; // store this value for comparison in next iteration
        }

        return isEqualGreater;
    }
}
