public class BinarySearch {
	private int searchItem(int[] input, int item) {
		int left = 0;
		int right = input.length - 1;
		int mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if (input[mid] == item) return mid;
			else if (item < input[mid]) right = mid;
			else left = mid + 1;
		}
		return -1;
	}

	void search(int[] input, int item) {
		int result = searchItem(input, item);
		if(result == -1) 
			System.out.println("Item not found");
		else
			System.out.println("Item found at position " + result);
	}


}