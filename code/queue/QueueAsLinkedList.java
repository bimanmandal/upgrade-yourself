class QueueAsLinkedList<T> {
	static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;

	void add(T data) {
		Node<T> temp = new Node<>(data);
		if (isEmpty()) head = temp;
		else tail.next = temp;
		tail = temp;
	}

	void remove() {
		if (isEmpty()) throw new IllegalStateException("Cannot Remove from an empty Queue");
		System.out.println("Data to be deleted is " + head.data);
		if (head == tail) tail = null;
		head = head.next;
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Empty Queue");
			return;
		}
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " : ");
			temp = temp.next;
		}
		System.out.println();
	}

	boolean isEmpty() {
		return head == null || tail == null;
	}
}