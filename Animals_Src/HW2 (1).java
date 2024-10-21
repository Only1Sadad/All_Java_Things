import java.util.*;

class HW2 {
	public static void main(String[] args) {
		//creating some variables we'll use for testing
		ArrayList<String> owners = new ArrayList<>();
		owners.add("Charlie");
		owners.add("Jeff");
		owners.add("Monica");

		Map<String, Double> food_map = new HashMap<>();
		food_map.put("Purina",7.4);
		food_map.put("Farmer's Dog",6.8);
		food_map.put("Blue Buffalo",8.1);

		Map<String, Integer> mice_killed = new HashMap<>();
		mice_killed.put("Monday",2);
		mice_killed.put("Tuesday",1);
		mice_killed.put("Wednesday",0);
		mice_killed.put("Thursday",4);
		mice_killed.put("Friday",2);

		 //create new objects from the classes (Dog, Cat, Fish)
		Dog my_dog = new Dog("Noah", "Labradoodle", 9);
		Cat my_cat = new Cat("Brownie",owners, "Brown");
		Fish my_fish = new Fish("Curtis", 4.3);

		//check that some of the properties were set correctly
		System.out.println("Dog's Breed " + my_dog.breed);
		System.out.println("Cat's Color " + my_cat.color);
		System.out.println("Fish's Name " + my_fish.name);

		//check equality of my_dog and your_dog (based on breed)
		Dog your_dog = new Dog("Daisy", "Poodle", 12);
		System.out.println(my_dog.equals(your_dog));

		//check some functionality of the classes
		String playdate = "Jeff";
		String other_playdate = "Serena";
		System.out.println(my_cat.catsReaction(playdate, owners));
		System.out.println(my_cat.catsReaction(other_playdate, owners));
		System.out.println(my_fish.whoCanPlayWithFish(playdate));

		int my_age = 25;
		System.out.println(my_dog.testIfAHumanIsOlder(my_age));

		System.out.println("Favorite food " + my_dog.foodBrandRatedHigh(food_map));

		String[] hunting_days = {"Monday","Wednesday","Friday"};
		System.out.println("Number of mouses caught " + my_cat.numberOfMiceKilled(mice_killed, hunting_days));

		System.out.println("Number of Days Playing Fetch in a Row " + my_dog.dogWillPlay(10));
	}


}