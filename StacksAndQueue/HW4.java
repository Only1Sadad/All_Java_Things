import java.util.*;
class HW4 {
	public static void main(String[] args) {
		ArrayList<Integer> queue_values = new ArrayList<Integer>();
		queue_values.add(3);
		queue_values.add(8);
		queue_values.add(-1);
		queue_values.add(35);

		ArrayList<Integer> stack_values = new ArrayList<Integer>();
		stack_values.add(3);
		stack_values.add(8);
		stack_values.add(-1);
		stack_values.add(35);

		//create Queue and Stack objects from the ArrayList values for each above
		Queue my_queue = new Queue(queue_values);
		Stack my_stack = new Stack(stack_values);


		//pop from your Queue and Stack
		int popped_queue = my_queue.pop();
		int popped_stack = my_stack.pop();

		//check the values that were popped off
		System.out.println(popped_queue);
		System.out.println(popped_stack);

		//check the Queue and Stack now that you popped
		System.out.println(my_queue.values);
		System.out.println(my_stack.values);

		//push new elements onto your Queue and Stack
		my_queue.push(44);
		my_stack.push(44);

		//check the Queue and Stack now that you pushed those values
		System.out.println(my_queue.values);
		System.out.println(my_stack.values);

	}
}