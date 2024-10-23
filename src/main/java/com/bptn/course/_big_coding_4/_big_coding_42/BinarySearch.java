package com.bptn.course._big_coding_4._big_coding_42;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search
	// for
	public static int binarySearch(int[] arr, int key) {

		// Sort the array before applying binary search
		Arrays.sort(arr); // Sorting is required for binary search to work correctly

		// Initialize low and high pointers for the start and end of the array
		// respectively
		int low = 0;
		int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low
		// pointer
		while (low <= high) {
			// Calculate the middle index
			int mid = (low + high) / 2;

			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
				return mid; // Found the key at index mid
			}
			// If the element at the middle index is less than the key, move the low pointer
			// to the middle + 1
			else if (arr[mid] < key) {
				low = mid + 1; // Narrow down the search to the right half
			}
			// If the element at the middle index is greater than the key, move the high
			// pointer to the middle - 1
			else {
				high = mid - 1; // Narrow down the search to the left half
			}
		}

		// If the key is not found, return -1
		return -1; // Key was not found in the array
	}

	// Do not modify the code below
	public static void main(String[] args) {
		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}

//Code Breakdown and Explanation:
//
//1. Sorting the Array:
//   - The array is sorted first using "Arrays.sort(arr)" to ensure that binary search can be applied, as binary search requires a sorted array to work efficiently.
//
//2. Initializing Pointers:
//   - The low pointer is initialized to 0, representing the start of the array, and the high pointer is initialized to "arr.length - 1", representing the end of the array.
//
//3. Binary Search Loop:
//   - The while loop "while (low <= high)" ensures that the search continues as long as there are elements between the low and high pointers.
//   - The middle index is calculated as "(low + high) / 2". This index helps divide the array into two halves to narrow down the search.
//
//4. Checking the Middle Element:
//   - If the middle element is equal to the key (arr[mid] == key), the index mid is returned, which means the element is found.
//   - If the middle element is less than the key, the search continues in the right half of the array by updating "low = mid + 1".
//   - If the middle element is greater than the key, the search continues in the left half of the array by updating "high = mid - 1".
//
//5. Returning -1:
//   - If the key is not found after exhausting the search, the method returns "-1" to indicate that the key is not present in the array.
//
//- In this task, I implemented the binary search algorithm by first sorting the array and then searching for a specific key.
//
//- Binary Search is a very efficient algorithm for searching sorted arrays, with a time complexity of O(log n).
//
//- In future search-related tasks, I will remember to always sort the array before applying binary search and carefully track the low and high pointers during the search.
//
