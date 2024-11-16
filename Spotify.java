/*
*Programmer: Sadad Yusuf:
*Program : Functional Programming
*Date: 15-Nov-2024
*/
import java.util.*;

class Spotify {
	public static void main(String[] args) {
		ArrayList<Integer> streams = new ArrayList<Integer>();
		streams.add(14246);
		streams.add(1129);
		streams.add(59324);
		streams.add(2231);
		streams.add(33444);

		String artist = "The Beatles";
		double growth_rate = 1.033;
		int num_months = 6;

		System.out.println("Total Streams: " + total_album_streams(streams));
		System.out.println("Max Streams: " + max_monthly_streams(streams));
		System.out.println("Name Length: " + artist_name(artist));
		System.out.println(String.format("Fan Growth: %.2f ", fan_growth(growth_rate, num_months))); 
		
	}

	/*
	Given an ArrayList of integers find and return the total sum
	The ArrayList represents the monthly streams of some album
	The sum is the total albums streams, to measure its success
	*/
	
	public static int total_album_streams(ArrayList<Integer> streams) {
		//base case checks if arraylist has values inside, if list empty stops operations
		if(streams.isEmpty()){
		return 0;
		}
		
		return streams.get(0) + total_album_streams(new ArrayList<Integer>(streams.subList(1, streams.size())));
	}

	/*
	Given an ArrayList of integers find and return the maximum element
	The ArrayList represents the monthly streams of a some album
	The maximum monthly stream helps Spotify determine which song to promote
	*/
	public static int max_monthly_streams(ArrayList<Integer> streams) {
			//base case: check is arraylist is empty: prevent a potential infinite loop
			if(streams.isEmpty()){
				return 1;
			}
			//get the frist value at index 0 for futher comparison
			int intialValue = streams.get(0);
			// assign the rest of the arraylist values starting from index one to a variable for testing.
			int restofValues = max_monthly_streams(new ArrayList<>(streams.subList(1,streams.size())));
			//check if inital value is smaller than the next values if not assigning the bigger values to initialBValue
			if(intialValue < restofValues){
				intialValue = restofValues;
			}
		return  intialValue;
	}

	/*
	Given a String count the length of the String
	The String represents an artist's name
	The amount of characters in an artist's name helps Spotify determine how to display things
	*/
	public static int artist_name(String name) {
		//check base if string is empty, length is 0
		if(name.isEmpty()){
			return 0;
		}

		//return the length of the string value by adding 1 for everyvalue at index 1 checking every other reamaining values.;
		return 1 + artist_name(name.substring(1));
	}

	/*
	Given two integers - a base and an exponent - return the value of base^{exponent}
	For example, base = 1.02 exponent = 3 then find 1.02^3
	The base represents the growth rate (EX 1.02 means they grow by 2% in this time) and
	the exponent represents the amount of time passed (EX: 3 means three months have passed)
	Together 1.02^3 means the artist gains fans at 2% a month and we want to see how much their
	fan size will grow in the next 3 months
	This helps Spotify project which artists are doing well and project monthly streams into the future
	*/
	
	public static double fan_growth(double base, int exponent) {
		//baseCase to check if exponent is 0 which return 1 always
		if(exponent==0){
			return 1;
		}

		//recursive method , claculate base * fangrowth of base^exponent-1.
		return base * fan_growth(base, exponent-1);
	}

}