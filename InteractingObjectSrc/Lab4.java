import java.util.*;

class Lab4 {
	public static void main(String[] args) {
		//Chef's attributes
		HashMap<String, Integer> dish_speed = new HashMap<>();
		dish_speed.put("Italian", 10);
		dish_speed.put("Indian", 12);
		dish_speed.put("Mexican", 7);
		double attitude = 1.2;
		boolean understaffed = true;

		//Waiter's attributes
		double average_order = 3.2;
		int tables_covered = 5;
		int orders_until_break = 3;
		int break_length = 15;

		//call your constructors to create instances of Chef and Waiter here
		Chef myChef = new Chef (dish_speed, attitude, understaffed);
		Waiter myWaiter = new Waiter(average_order, tables_covered, orders_until_break, break_length);

		//order information. they're matched up already (i.e. first cuisine is from the first table)
		String[] cuisines = {"Italian", "Indian", "Indian", "Mexican", "Indian", "Mexican"};
		String[] tables = {"Couple", "Individual", "Family", "Family", "Couple", "Individual"};

		//call and print the function to find the amount of time worked
		double totalTime=(work_time(myChef, myWaiter, cuisines, tables));
		String spaces = String.format("%.2f", totalTime); //string.format() helps to show decimal places needed for precisions.
		System.out.println("Worked for a total of "+ spaces + " Minutes.");
	}

	/*
	this method should take in your Chef, Waiter, the String[] of orders, and the String[] of tables
	it should compute the total amount of time your restaurant operated given the inputs and return that value
	we assume that the Waiter and Chef can't work at the same time, to make the calculation a bit easier
	*/
	public static double work_time(Chef head_chef, Waiter head_waiter, String[] cuisines, String[] tables) {
		//first the Waiter has to take the order and determine how much time that took
		double orderTime = 0; // to hold running time total.
		//loop through
		for (int i = 0; i <tables.length; i++){
			orderTime += head_waiter.take_Order(tables[i]);
			//if the Waiter is going on break they take their break and add their break time to the running total
			if(head_waiter.take_break()){
				orderTime+= head_waiter.break_length;
			}
			//if the Waiter isn't on break yet,  they go straight to the Chef and the Chef starts (0 minutes elapsed)
			//then the Chef has to cook the food and wash the dishes and determine how much time that took
			orderTime+= head_chef.make_meal(cuisines[i]);
			orderTime+= head_chef.clean_dishes();
		}
		//return the total amount of time the Chef and Waiter were working to operate the restaurant
		return orderTime;
	}
}