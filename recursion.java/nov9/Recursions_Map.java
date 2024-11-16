import java.util.*;
/*
 * Programmer : Sadad Yusuf
 * Date       : Nov-09-2024
 * Program	  : Recursion and Hashmap Algorithm. 	
 */

class Recursions_Map {
	public static void main(String[] args) {
		String message1 = "esab ymene ot nekat";
		String message2 = "yllanif eerf";
		System.out.println("\n" + recursive_string_reversal(message1));
		System.out.println("\n" + recursive_string_reversal(message2));

		ArrayList<Integer> runs_per_inning = new ArrayList<Integer>();
		runs_per_inning.add(0);
		runs_per_inning.add(1);
		runs_per_inning.add(0);
		runs_per_inning.add(3);
		runs_per_inning.add(2);
		runs_per_inning.add(0);
		runs_per_inning.add(0);
		runs_per_inning.add(1);
		runs_per_inning.add(0);
		Map<Integer, Integer> runs_map = runs_at_inning(runs_per_inning);
		System.out.println(runs_map.get(8));
	}

	/*
	Given a String which represents a coded word. Breaking the code means reading the String
	from right to left (i.e. reversing the order)
	DO THIS USING RECURSION
	Return the reversed String which represents the real message
	*/
	public static String recursive_string_reversal(String coded_word) {
		
		//check if string has value inside
		if(coded_word.isEmpty()){
			return coded_word;
		}
		//return the reversed string with substring plus charAt(0) so on and so forth
		return recursive_string_reversal(coded_word.substring(1)) + coded_word.charAt(0);
	}

	/*
	Given an ArrayList of integers that represent the runs scored per inning of a baseball game
	compute and return a Map<Integer, Integer> which maps <inning, total runs scored by the end of
	that inning> for example (1,3,0) would map to <(1,1),(2,4),(3,4)>
	DO NOT USE RECURSION FOR THIS
	Return the Map which will be stored in the MLB database for future statistical reference
	*/
	public static Map<Integer, Integer> runs_at_inning(ArrayList<Integer> runs_per_inning) {
        //map to store transactions and total spending
        HashMap<Integer,Integer> inning_total_runs = new HashMap<>();
		int running_total = 0;
		for(int i = 0; i < runs_per_inning.size(); i++){
			running_total += runs_per_inning.get(i);
			inning_total_runs.put(i + 1, running_total);
		}

		return inning_total_runs;
	
	}
}