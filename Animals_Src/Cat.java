import java.util.*;
//Create a class to represent Cat objects
public class Cat {
    //Attributes
    String name;
    ArrayList<String> owners;
    String color;
    //set up the constructor for the Cat class
    public Cat (String name, ArrayList<String> owners, String color){
        this.name = name;
        this.owners = owners;
        this.color = color;
    }

    /**Create a function that returns your Cat's reaction when playing with someone based on their name.
    It responds with "Meow" when it's playing with one of its owners. It responds "Hiss" in any other case
     */
    public String catsReaction(String name, ArrayList<String>theOwners){
        String catReactionToOwner = "Meow";
        String catReactionToOthers = "Hiss";
        //check if the name belongs to one of the owners
           for( int i =0; i< theOwners.size(); i++) {
               if (theOwners.get(i).equalsIgnoreCase(name)) {
                   return catReactionToOwner;
               }
           }
        return catReactionToOthers;
    }
    /**
     * Create a function that takes in a Map of day of the week to number of mice hunted on each day.
     * Your function should take in this map and a list of days.
     * It should return the total number of mice killed on those specified days using the Map and the list of days of interest
     */
    public int numberOfMiceKilled(Map<String, Integer> dayKills, String [] days){
        //counter to count amount of mice that are dead
        int numberOfDeadmice= 0;
        /* using map and array to check if day is contained in the map then returning its key value */
        for( String eachDay : days)
            if(dayKills.containsKey(eachDay)) {
                numberOfDeadmice += dayKills.get(eachDay);
            }
        return numberOfDeadmice;
    }
}
