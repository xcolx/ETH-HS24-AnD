package searchAlgorithms;

public class BinarySearch {
	
	//returns index if value is found, null otherwise
	public static Integer search(int[] input, int value) {
		int left = 0;
		int right = input.length;
		
		while (left < right) {
			int middle = (left+right)/2;
			
			if (value == input[middle]) {
				return middle;
			}
			
			if (value > input[middle]) {
				left = middle+1;
			} else {
				right = middle-1;
			}
		}
		
		return null;
	}
	
}
