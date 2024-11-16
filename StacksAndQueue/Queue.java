import java.util.*;

class Queue {
	public ArrayList<Integer> values = new ArrayList<Integer>();


	//constructor to create a Stack object
	public Queue(ArrayList<Integer> queue) {
		this.values.addAll(queue);//adding all values from the parameter arraylist into the values array list field.
	}

	//function to push an element into your queue in the correct place
	public void push(int new_value) {
		values.add(new_value); //adding parameter value to the end of arrayLists
	}

	/*function to:
	1. pop the next element
	2. remove that element from the Queue
	3. return that element
	*/
	public int pop() {

        return values.remove(0); // returns removed valueb @ index 0 (since its a queue);
    }
}