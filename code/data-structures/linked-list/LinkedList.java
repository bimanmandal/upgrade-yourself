public class LinkedList<T> {
	private static class Node<T> {
		T data;
		Node<T> next;

		Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node<T> head;

	// Insert an element to the end of the list
	void insert(T data) {
		if (isEmptyList()) {
			head = new Node<>(data, null);
			return;
		}
		Node<T> traverser = head;
		while(traverser.next != null) {
			traverser = traverser.next;
		}
		traverser.next = new Node<>(data, null);
	}

	// Insert an element to the begining of the list
	void insertInBegining(T data) {
		Node<T> temp = new Node<>(data, null);
		if (head != null) temp.next = head;
		head = temp;
	}

	// Delete an element from the end of the List
	void delete() {
		if (isEmptyList()) {
			System.out.println("No element found.");
			return;
		}
		Node<T> temp = head;
		Node<T> pre = temp;
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		System.out.println("Deleted item is " + temp.data);
		pre.next = null;
	}

	// Delete an element from the begining 
	void deleteFromBegining() {
		if (isEmptyList()) {
			System.out.println("No element found");
			return;
		}
		System.out.println("Deleted item is " + head.data);
	 	if(head.next == null) head = null;
	 	head = head.next;
	}

	void printList() {
		if (isEmptyList()) {
			System.out.println("Empty List");
			return;
		}
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	int size() {
		if (isEmptyList()) {
			return 0;
		}
		int count = 0;
		Node<T> temp = head; 
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	private boolean isEmptyList() {
		return head == null;
	}

}