import java.util.*;

public class Chef {
    /**
     * Attributes:
     * average_order (double that represents the average number of minutes a Waiter spends taking a table's orders)
     * tables covered (int that represents the number of tables the Waiter has to wait)
     * orders_until_break (int that represents how many tables the Waiter needs to take orders from before going on break)
     * break_length (int that represents the number of minutes the Waiter is on break)
     */
    HashMap<String, Integer> dish_speed;
    double attitude;
    boolean understaffed;

    // Constructor for the Chef class.Initializes a new Chef with the given attributes.
    public Chef(HashMap<String, Integer> dish_speed, double attitude, boolean understaffed) {
        this.dish_speed = dish_speed;
        this.attitude = attitude;
        this.understaffed = understaffed;
    }

    /**
     * Calculates the time it takes for the Chef to make a meal of a specific cuisine.
     * Takes the type of cuisine as input.
     * Returns the time  it takes to prepare the meal, adjusted by the chef's attitude.
     */
    public double make_meal(String type_of_cuisine) {
        // Default dish speed if cuisine is not found in the map
        int dishSpeed = 0;

        // Check if the cuisine exists in the dish_speed map
        if (dish_speed.containsKey(type_of_cuisine)) {
            dishSpeed = dish_speed.get(type_of_cuisine);
        }

        // Calculate and return the adjusted cooking time
        return dishSpeed * attitude;
    }

    /**
     * Determines the time it takes for the Chef to clean dishes after a meal.
     * Returns the time it takes to clean dishes.
     */
    public int clean_dishes() {
        // Variable to hold time it takes to clean
        int timeToCleanDishes;

        // Check if kitchen is understaffed and assign appropriate cleaning time
        if (understaffed) {
            timeToCleanDishes = 10;  // 10 minutes if understaffed
        } else {
            timeToCleanDishes = 2;   // 2 minutes if regularly staffed
        }

        return timeToCleanDishes;
    }
}