/*
*Programmer: Sadad Yusuf:
*Program : Recursion(Maps,ArrayList)
*Date: 15-Nov-2024
*/
import java.util.*;

import com.apple.laf.resources.aqua;

class Week10Lab {
	public static void main(String[] args) {
		ArrayList<String> words_test = new ArrayList<String>();
		words_test.add("new");
		words_test.add("recursive");
		words_test.add("size");
		words_test.add("checker");
		System.out.println(recursive_length(words_test));

		Map<String, ArrayList<String>> hobby_map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> sailing_names = new ArrayList<String>(Arrays.asList("joe", "bernie", "enrique", "carla", "bonnie"));
		ArrayList<String> bowling_names = new ArrayList<String>(Arrays.asList("joe", "bonnie", "debbie", "gus"));
		hobby_map.put("Sailing", sailing_names);
		hobby_map.put("Bowling", bowling_names);
		ArrayList<String> haveSameInterest = hobby_intersection("Sailing","Bowling",hobby_map);
		System.out.println(haveSameInterest);

	}

	/*
	You're trying to create a new programming language from the beginning based on Java.
	This is a real thing people do when creating new languages.
	For example, the language "Scala" is built heavily on "Java".
	Create a recursive algorithm to find the length of an ArrayList WITHOUT
	using .size(). You can't use built-in functions because you're trying to
	make them yourself for your new language.
	*/
	public static int recursive_length(ArrayList<String> words) {
		//cbase to check if arraylist is empty if yes return 0 if not return recursive length.
		if(words.isEmpty()){
			return 0;
		}
		//remove first element of word(0)
		words.remove(0);
		//make a recursive call with each elements removed counting and returning total at the end.
		return 1 + recursive_length(words);
	}

	/*
	A dating app is interested in matching people based on their mutual hobbies.
	The have a HashMap<String, ArrayList<String>> which represents <Hobby, [names of
	people interested in that hobby]>. For example <"Sailing", ["joe", "bernie", "enrique",
	 "carla", "bonnie"]>.
	Write a function that takes in two hobbies and return an ArrayList<String> of all people
	that have both hobbies (i.e. the intersection). For example if we had <"Bowling", ["joe",
	"bonnie", "debbie", "gus"]> then the intersection of Sailing and Bowling would be 
	["joe", "bonnie"]
	***Decided to pass the hashmap to the method to accesss the list of names and their associated hobbies.
	*/
	public static ArrayList<String> hobby_intersection(String hobby1, String hobby2,Map<String, ArrayList<String>> names) 
	{
		//extract each person participating.
		ArrayList<String> first_participators = names.get(hobby1);
		ArrayList<String> other_participators = names.get(hobby2);

		//Create new arrayList to store the matching participants
		ArrayList<String> a_match = new ArrayList<>();

		//Loop through first participators
		for(String people : first_participators){
			//check if there is a match from the first partcip and the other_particip.
			if(other_participators.contains(people)){
				//add them to match arraylist
				a_match.add(people);
			}
		}

		return a_match;
	}
}