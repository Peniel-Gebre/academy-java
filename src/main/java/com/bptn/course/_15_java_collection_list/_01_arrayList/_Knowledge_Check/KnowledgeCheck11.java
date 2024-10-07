package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.ArrayList;

public class KnowledgeCheck11 {

	    public static void moveSmallest(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            return; // Do nothing if the list is empty
	        }
	        
	        int smallestIndex = 0; // Initialize smallestIndex to the first element's index
	        // Find the index of the smallest element
	        for (int i = 1; i < list.size(); i++) { // Start from the second element
	            if (list.get(i) < list.get(smallestIndex)) { // Compare with current smallest
	                smallestIndex = i; // Update smallestIndex if a smaller element is found
	            }
	        }

	        // Move smallest to front by swapping
	        if (smallestIndex != 0) { // Only swap if it's not already the first element
	            int smallestValue = list.get(smallestIndex); // Store the smallest value
	            list.set(smallestIndex, list.get(0)); // Set the first element to the smallest
	            list.set(0, smallestValue); // Set the smallest element to the front
	        }
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {3, 11, 54, 7, 1, 22};
	        for (int i = 0; i < nums.length; i++) {
	            values.add(nums[i]);
	        }
	        moveSmallest(values);
	        
	        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
	        System.out.println("Your Result:\t\t " + values);
	    }
	}