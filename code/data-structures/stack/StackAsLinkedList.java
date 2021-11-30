class StackAsLinkedList<T> {
	static class Node<T> {
		T data;
		Node<T> next;

		Node(T data){
			this.data = data;
		}
	}

	private Node<T> top;

	void push(T data) {
		Node<T> temp = new Node<T>(data);
		if (!isEmpty()) temp.next = top;
		top = temp;
	}

	T pop() {
		if (isEmpty()) throw new IllegalArgumentException("pop not supported on empty stack");
		T data = top.data;
		if (top.next == null) top = null;
		else top = top.next;
		return data;
	}

	void peek() {
		if (isEmpty()) 
			System.out.println("Stack is empty");
		Node<T> temp = top;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	boolean exists(T data) {
		if (isEmpty()) 
			return false;
		Node<T> temp = top;
		while(temp != null) {
			if (data.equals(temp.data)) return true;
			temp = temp.next;
		}
		return false;
	}

	private boolean isEmpty() {
		return top == null;
	}
}