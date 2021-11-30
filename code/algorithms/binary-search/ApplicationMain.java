public class ApplicationMain {
	public static void main(String[] args) {
		System.out.println("Application Main Started");
		int[] numbers = {1, 2, 3, 4, 5, 6};
		System.out.println("arrays initialized");
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.search(numbers, 6);
		binarySearch.search(numbers, 2);
		binarySearch.search(numbers, 100);
	}
}