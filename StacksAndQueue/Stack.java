import java.util.*;
class Stack {
	public ArrayList<Integer> values = new ArrayList<Integer>();

	//constructor to create a Stack object
	public Stack(ArrayList<Integer> stack_values) {
		this.values.addAll(stack_values); //adding all values from the parameter arraylist into the values array list field.

	}

	//function to push an element onto your stack into the correct place
	public void push(int new_value) {
		values.add(new_value); //pushing parameter value to the end of arrayLists

	}

	/*function to:
	1. pop the next element
	2. remove that element from the Stack
	3. return that element
	*/
	public int pop() {
		
	return values.remove(values.size()-1); // returns removed values @ last index (since its a stack);
	}
}