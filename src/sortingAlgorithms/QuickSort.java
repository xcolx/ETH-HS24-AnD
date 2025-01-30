package sortingAlgorithms;

public class QuickSort {
	
	public static void sort(int[] input) {
		helperSort(input, 0, input.length-1);
	}
	
	private static void helperSort(int[] input, int from, int to) {
		
		if (from < to) {
			//primitive pivot selection
			int pivot = input[to];
			
			//find pivot-index
			int smaller = 0;
			for (int i = from; i <= to; i++) {
				if (input[i] < pivot) {
					smaller++;
				}
			}
			int pivotIndex = from + smaller;
			
			input[to] = input[pivotIndex];
			input[pivotIndex] = pivot;
					
			partition(input, from, to, pivotIndex, pivot);
			helperSort(input, from, pivotIndex-1);
			helperSort(input, pivotIndex+1, to);
		}
		
	}
	
	//move all smaller elements to the front of the pivot
	private static void partition(int[] input, int from, int to, int pivotIndex, int pivot) {
		
		int i1 = from;
		int i2 = pivotIndex+1;
		
		while (i1 != pivotIndex && i2 != to+1) {
			if (input[i1] >= pivot) {
				
				while (input[i2] >= pivot) {
					i2++;
				}
				
				int temp = input[i1];
				input[i1] = input[i2];
				input[i2] = temp;
				
			} else {
				i1++;
			}
		}
	}
	
}
