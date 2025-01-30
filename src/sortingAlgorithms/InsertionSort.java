package sortingAlgorithms;

public class InsertionSort {
	
	public static void sort(int[] input) {
		
		int n = input.length;
		for (int i = 1; i < n; i++) {
			int temp = input[i];
			int pos = position(input, 0, i, temp);
			move(input, pos, i);
			input[pos] = temp;
		}
		
	}
	
	//returns the position where value belongs inside already sorted subarray
	private static int position(int[] input, int from, int to, int value) {
		
		while (from <= to) {
			int middle = (to+from)/2;
			if (value == input[middle]) {
				return middle;
			}
			if (value > input[middle]) {
				from = middle+1;
			} else {
				to = middle-1;
			}
		}
		
		return from;
	}
	
	//moves all the values from "from" to "to-1" one to the right
	private static void move(int[] input, int from, int to) {
		
		for (int i = to; i > from; i--) {
			input[i] = input[i-1];
		}
		
	}
}
