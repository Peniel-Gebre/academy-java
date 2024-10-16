package com.bptn.course._19_junit._challenge;

import java.util.Arrays;

public class Main {

    public void Start() {
        // Define an unsorted array
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1; // The element to search for

        // Sort the array
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Perform binary search to find the index of the key
        int result = binarySearch(array, key);

        // Print the result
        if (result == -1) {
            System.out.println("Element " + key + " not found in the array.");
        } else {
            System.out.println("Element " + key + " found at index " + result + ".");
        }
    }

    // Binary search method
    int binarySearch(int arr[], int key) {
        int low = 0;          // Start pointer
        int high = arr.length - 1;  // End pointer

        // Loop to search for the key
        while (low <= high) {
            int mid = (low + high) / 2;  // Calculate the middle index

            // Check if the key is at mid
            if (arr[mid] == key) {
                return mid;  // Key found, return its index
            }

            // If key is greater than mid, search the right half
            if (arr[mid] < key) {
                low = mid + 1;
            } 
            // If key is smaller than mid, search the left half
            else {
                high = mid - 1;
            }
        }

        return -1;  // Key not found
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }
}
