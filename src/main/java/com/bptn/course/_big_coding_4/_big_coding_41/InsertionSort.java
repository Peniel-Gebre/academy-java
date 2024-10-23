package com.bptn.course._big_coding_4._big_coding_41;

public class InsertionSort {
	// This method sorts an array in ascending order using the insertion sort
	// algorithm
	public static void insertionSort(int[] arr) {

		// Check if the array is null or has less than 1 element
		if (arr == null || arr.length < 1) {
			// Return if the array is null or has less than 1 element
			return;
		}

		// Loop through the array starting from index 1 to length of the array
		for (int i = 1; i < arr.length; i++) {
			// Store the current element
			int current = arr[i];
			// Initialize j with i - 1
			int j = i - 1;

			// Inner loop to compare current element with elements before it in the array

			while (j >= 0 && arr[j] > current) {

				// Shift the element to the right
				arr[j + 1] = arr[j];

				// Decrement j to compare with next element
				j--;
			}

			// Insert the current element at its correct position
			arr[j + 1] = current;
		}
	}

	// Do not modify the code below
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 3, 4, 1, -2, 4, 8 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//Code Breakdown and Explanation:
//1. Null or Length Check: The first check `if (arr == null || arr.length < 1)` ensures that the array is not `null` and contains at least one element.
//
//2. Outer Loop (Iterating Over Array): The loop `for (int i = 1; i < arr.length; i++)` starts from the second element (index `1`) and moves through the entire array. The idea here is to gradually build a sorted portion of the array starting from the left.
//
//3. Inner Loop (Shifting Elements):
//   - The current element `arr[i]` is stored in the variable `current`, and we use the variable `j` to compare `current` with the elements before it.
//   - The while loop `while (j >= 0 && arr[j] > current)` keeps shifting the elements in the sorted portion of the array to the right, making space for the current element to be placed in its correct sorted position.
//
//4. Inserting the Current Element:
//   - After finding the right position by shifting larger elements to the right, `arr[j + 1] = current` inserts the current element in its correct place in the sorted portion of the array.
//
//In this task, I implemented the insertion sort algorithm, which gradually builds a sorted portion of the array by inserting each new element in its correct position. The key part of the algorithm is the inner `while` loop that shifts larger elements to the right to make space for the new element.
//
//In future sorting problems, I will remember the importance of maintaining indices and using loops to shift and insert elements efficiently.
//
//This task helped reinforce the importance of understanding how sorting algorithms manipulate array elements in-place.
