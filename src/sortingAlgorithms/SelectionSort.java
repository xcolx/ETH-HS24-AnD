package sortingAlgorithms;

public class SelectionSort {
	
	public static void sort(int[] input) {
		int n = input.length;
		for (int i = 0; i < n-1; i++) {
			int min = i+1;
			for (int j = i+2; j < n; j++) {
				if (input[j] < input[min]) {
					min = j;
				}
			}
			int temp = input[i];
			input[i] = input[min];
			input[min] = temp;
		}
	}
	
}
