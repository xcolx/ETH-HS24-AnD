package sortingAlgorithms;

public class MergeSort {

	public static void sort(int[] input) {
		helperSort(input, 0, input.length-1);
	}
	
	private static void helperSort(int[] input, int from, int to) {
		if (from < to) {
			int middle = (from + to)/2;
			helperSort(input, from, middle);
			helperSort(input, middle+1, to);
			merge(input, from, middle, to);
		}
	}
	
	private static void merge(int[] input, int from, int middle, int to) {
		int[] temp = new int[to-from+1];
		
		int i = 0;
		int i1 = from;
		int i2 = middle+1;
		
		//always add the smaller element to the temp array
		while (i1 != middle+1 && i2 != to+1) {
			if (input[i1] < input[i2]) {
				temp[i++] = input[i1++];
			} else {
				temp[i++] = input[i2++];
			}
		}
		
		//if one half has no more elements add the rest of the other half
		if (i1 == middle+1) {
			while (i2 != to+1) {
				temp[i++] = input[i2++];
			}
		} else {
			while (i1 != middle+1) {
				temp[i++] = input[i1++];
			}
		}
		
		//insert temp back to input
		i = 0;
		for (int j = from; j <= to; j++) {
			input[j] = temp[i++];
		}
	}
}
