package sortingAlgorithms;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] unsortedArray = new int[] {72, 36, 47, 94, 83, 87, 29, 81, 3, 60, 58, 15, 56, 0, 69, 79, 67, 45, 39, 33, 74, 76, 40, 12, 21, 89, 64, 18, 99, 86, 70, 91, 13, 22, 54, 92, 9, 65, 63, 49, 17, 20, 57, 52, 1, 24, 5, 37, 30, 32, 62, 66, 53, 68, 98, 2, 80, 75, 19, 6, 88, 93, 61, 48, 31, 96, 16, 77, 4, 84, 44, 7, 97, 78, 43, 25, 46, 27, 55, 59, 8, 38, 41, 26, 23, 82, 71, 73, 90, 28, 42, 11, 14, 35, 95, 10, 50, 85, 51, 34};
		int[] input;
		
		System.out.println("Input: " + Arrays.toString(unsortedArray));
		System.out.println();
		System.out.println("Outputs: ");
		
		//BubbleSort
		input = Arrays.copyOf(unsortedArray, 100);
		BubbleSort.sort(input);
		System.out.println("BubbleSort: " + Arrays.toString(input));
		
		//InsertionSort
		input = Arrays.copyOf(unsortedArray, 100);
		InsertionSort.sort(input);
		System.out.println("InsertionSort: " + Arrays.toString(input));
		
		//SelectionSort
		input = Arrays.copyOf(unsortedArray, 100);
		SelectionSort.sort(input);
		System.out.println("SelectionSort: " + Arrays.toString(input));
	}
	
}
