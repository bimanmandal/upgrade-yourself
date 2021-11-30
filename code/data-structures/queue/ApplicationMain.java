public class ApplicationMain {
	public static void main(String[] args) {
		QueueAsLinkedList<Integer> queue = new QueueAsLinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.display();
		queue.remove();
		queue.add(6);
		queue.display();

	}
}