import java.io.File; // package required for file io
import java.io.IOException;
import java.util.Scanner; // package required for Scanner class
import java.util.ArrayList; // package required for ArrayList class

/**
 * This class modifies Day0007's challenge. The code that reads the input file
 * is now its own method. The array used is changed to an ArrayList class. Each
 * record is now a class store in the new ArrayList.
 *
 * @author Gavin Dunnett
 * @version 1
 */
public class Day0009 {

	public static void main(String[] args) throws IOException {

		// call method to get the icaoArray
		ArrayList<Record> icaoArray =
						fetchICAO("/Users/gavin/Downloads/icaodata.csv");

		// call method to display that icaoArray
		showArray(icaoArray);
	}

	public static ArrayList<Record> fetchICAO(String filename) throws IOException {

		// create an instance of the File class.
		File inFile = new File(filename);

		// pass a reference of that file class to the constructor of our Scanner class.
		Scanner in = new Scanner(inFile);

		// create an ArrayList of record classes to hold the string's data
		ArrayList<Record> icaoArray = new ArrayList<>();

		// while loop that reads the input file and populates the array
		while (in.hasNextLine()) {

			// get next line and store as a string
			String line = in.nextLine();

			// declare array to hold the line's tokens
			String[] tokens = new String[9];

			// tokenize the line
			tokens = line.split(",");

			// create a new Record object
			Record r = new Record(
							tokens[0],
							tokens[1],
							tokens[2],
							tokens[3],
							tokens[4],
							tokens[5],
							tokens[6],
							tokens[7],
							tokens[8]);
			icaoArray.add(r); // add the record to the array
		}

		return icaoArray; // return the populated array
	}

	/**
	 * This method prints.
	 *
	 * @param sArray
	 */
	public static void showArray(ArrayList<Record> sArray) {

		System.out.println("");

		for (Record r : sArray) {
			System.out.printf("%-5s", r.icao);
			System.out.printf("%-10s", r.lat);
			System.out.printf("%-10s", r.lon);
			System.out.printf("%-7s", r.type);
			System.out.printf("%-5s", r.size);
			System.out.printf("%-30s", r.name);
			System.out.printf("%-5s", r.city);
			System.out.printf("%-30s", r.state);
			System.out.printf("%-2s", r.country);
			System.out.println("");
		}
	}

	/**
	 * Static nested class.
	 */
	public static class Record {

		// declare field variables
		String icao;
		String lat;
		String lon;
		String type;
		String size;
		String name;
		String city;
		String state;
		String country;

		/**
		 * Construtor.
		 *
		 * @param icao
		 * @param lat
		 * @param lon
		 * @param type
		 * @param size
		 * @param name
		 * @param city
		 * @param state
		 */
		public Record(String icao,
									String lat,
									String lon,
									String type,
									String size,
									String name,
									String city,
									String state,
									String country) {

			// initilize & store parameters as field variable
			this.icao = icao;
			this.lat = lat;
			this.lon = lon;
			this.type = type;
			this.size = size;
			this.name = name;
			this.city = city;
			this.state = state;
			this.country = country;

		}
	}
}
