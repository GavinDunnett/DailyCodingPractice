import java.io.*; // packages required for file io.
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner; // package required for scanner class.
import java.util.StringTokenizer; // package required to tokenize strings.

/**
 * This class is coding practice from an idea I had while using FSEconomy.
 * <p>
 * ICAO challenge:
 * Copy a CVS file's contents into an array and output it to the screen.
 * The file contains airport ICAO codes.
 */
public class Day0007 {

	// emun class to hold meaningfull field names.
	private enum Field {
		ICAO(0),
		LAT(1),
		LON(2),
		TYPE(3),
		SIZE(4),
		NAME(5),
		CITY(6),
		STATE(7),
		COUNTRY(8);

		private int value; // field to hold value.

		Field(int value) { // enums constructor.
			this.value = value;
		}
	}

	/**
	 * The main program.
	 *
	 * @param args Not used.
	 */
	public static void main(String[] args) throws IOException {

		// create an instance of the File class.
		File inFile = new File("/Users/gavin/Downloads/icaodata.csv");

		// pass a reference of that file class to the constructor of our Scanner class.
		Scanner in = new Scanner(inFile);

		// set the delimiter of our scanner object
		in.useDelimiter(",");

		// create an array to hold the string's data
		String[][] icaoArray = new String[500000][9];

		int row = 0;

		// while loop that reads the input file.
		while (in.hasNextLine()) {
			String line[] = in.nextLine().split(",");
			for (int col = 0; col < 9; col++) {
				icaoArray[row][col] = line[col].trim();
			}
			row++;
		}
		//System.out.println(icaoArray[0][8]);

		showArray(icaoArray);
	}

	public static void showArray(String[][] sArray) {

		System.out.println("");

		for (int row = 0; row < 20000; row++) {
			System.out.printf("%-5s", sArray[row][Field.ICAO.value]);
			System.out.printf("%-10s", sArray[row][Field.LAT.value]);
			System.out.printf("%-10s", sArray[row][Field.LON.value]);
			System.out.printf("%-30s", sArray[row][Field.NAME.value]);
			System.out.printf("%-30s", sArray[row][Field.STATE.value]);
			System.out.printf("%-2s", sArray[row][Field.COUNTRY.value]);
			System.out.println("");
		}
	}


}

