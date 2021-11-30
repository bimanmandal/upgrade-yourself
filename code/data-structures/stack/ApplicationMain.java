public class ApplicationMain {
	public static void main(String[] args) {
		StackAsLinkedList<Integer> stack = new StackAsLinkedList<>();

		stack.peek();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.peek();

		System.out.println("Deleted data is " + stack.pop());
		stack.peek();
		stack.push(6);
		stack.peek();

		System.out.println(stack.exists(2));
		System.out.println(stack.exists(10));

	}
}