public class ApplicationMain {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.insert("hello");
		list.insert("how");
		list.insert("are");
		list.insert("you");
		list.printList();
		list.insertInBegining("Hi");
		list.printList();

		list.insert("Biman");
		list.printList();

		list.delete();
		list.printList();

		list.deleteFromBegining();
		list.printList();
	}
}