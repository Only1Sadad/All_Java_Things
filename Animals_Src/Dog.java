import java.util.*;
public class Dog {
    //create Attributes for the dog class object
    String name;
    String breed;
    int age;

    //set up the constructor for the Dog class .
    public Dog(String name, String breed, int age) {
        //create object instance
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    /*Create a function to compare whether two Dog objects are equivalent.
     two dogs are equivalent if they're the same breed
     */
    public boolean compare_TwoDogs(String dog1, String dog2) {
        boolean sameBreed = false;
        //test of two dogs are the same breed
        if (dog1.equalsIgnoreCase(dog2)) {
            sameBreed = true;
            System.out.println("Same Breed");
        }
        return sameBreed;
    }

    /**
     * Create a function that tells us if we're older than our dog.
     * Pass in an integer age. There are 7 dog years in a human year.
     * compare 7*your Dog's age to the input age.
     * If the input age is older than 7*your Dog's the function should return true.
     * (you are older than your Dog).
     */
    public boolean testIfAHumanIsOlder(int humanAge) {
        int dogsAge = 7 * age;
        return humanAge > dogsAge; // returns true if the human is older
    }

    /**
     * Create a function that takes in a
     * map from dog food brands to their rating.
     * Should return the name of the food brand with the highest rating
     */
    public String foodBrandRatedHigh(Map<String, Double> foodBrands) {
        double highestRatedFood = 0;
        String bestFoodBrandIs = null;
        //iterate through the map to find brand with high rating
        for (Map.Entry<String, Double> entry : foodBrands.entrySet()) {
            //test if  value of the map is greater than higher rated food value;
            if (entry.getValue() > highestRatedFood) {
                //if true assign that key and value pair to of the map to higher rated food and bestFoodBrandIs.
                highestRatedFood = entry.getValue();
                bestFoodBrandIs = entry.getKey();
            }
        }
        //return best food brand.
        return bestFoodBrandIs;
    }

    /** Create a function that takes in an integer energy level and tells us how many days in a row your Dog will play.
     * */
    public int dogWillPlay(int energy) {
        //keep track of how many days in a row our dog can play fetch.
        int daysPlayedFetch = 0;
        //determine how to alternate energy lost
        boolean oneEnergyLost = true;
        //determine how many days in a row the dog will play
            while (energy > 0) {
                if (oneEnergyLost) {
                    energy -= 1;
                } else {
                    energy -= 3;
                }
                //alternate energy lost.
                oneEnergyLost = !oneEnergyLost;
                if (energy > 0) {
                    daysPlayedFetch++;
                }
            }
            return daysPlayedFetch;
    }
}
