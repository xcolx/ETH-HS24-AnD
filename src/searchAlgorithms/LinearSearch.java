package searchAlgorithms;

public class LinearSearch {
	
	//returns index if value is found, null otherwise
	public static Integer search(int[] input, int value) {
		int n = input.length;
		for (int i = 0; i < n; i++) {
			if (input[i] == value) {
				return i;
			}
		}
		return null;
	}
	
}
