package sortingAlgorithms;

public class BubbleSort{

	public static void sort(int[] input) {
		int n = input.length;
		for (int j = 0; j < n-1; j++) {
			for (int i = 0; i < n-1; i++) {
				if (input[i] > input[i+1]) {
					int temp = input[i+1];
					input[i+1] = input[i];
					input[i] = temp;
				}
			}
		}
	}
	
}
