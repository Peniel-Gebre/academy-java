package com.bptn.course._big_coding_4._big_coding_45;

//import the required classes
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	// Method that returns the indices of two elements in the nums array that add up
		// to the target value
 public int[] twoSum(int[] nums, int target) {
	// Initialize a HashMap to store the value of each element in the nums array and its index
     Map<Integer, Integer> map = new HashMap<>(); // Key: element, Value: index

  // Loop through each element in the nums array
     for (int i = 0; i < nums.length; i++) {
    	// Calculate the complement, which is the difference between the target and the
    				// current element
         int complement = target - nums[i]; // Find the complement needed to reach the target

      // Check if the complement is found in the HashMap
         if (map.containsKey(complement)) {
        	 /* If the complement is found, return the index of the complement and the current index because these two indices correspond to two elements that add up to the target*/
             return new int[] { map.get(complement), i }; // Return the indices of the complement and current element
         }

      // If the complement is not found, put the current element and its index into the HashMap
         map.put(nums[i], i); // Store the current element and its index for future reference
     }

  // If no two sum solution is found, throw an IllegalArgumentException
     throw new IllegalArgumentException("No two sum solution");
 }

 // Do not modify the code below:
 // Main method to test the twoSum method
 public static void main(String[] args) {
     // Example array of integers
     int[] nums = { 2, 7, 11, 15 };

     // Example target value
     int target = 9;

     // Create a TwoSum object
     TwoSum solution = new TwoSum();

  // Call the twoSum method to get the indices of the two elements that add up to
  		// the target value
     int[] indices = solution.twoSum(nums, target);

     // Print the result
     System.out.println("[" + indices[0] + ", " + indices[1] + "]");
 }
}

//Code Breakdown and Explanation:
//
//twoSum Method:
//- Map Initialization: A HashMap is used to store elements from the array as keys and their indices as values.
//- Iterating Through Array: A "for loop" is used to go through each element in the "nums" array.
//- Complement Calculation: For each element "nums[i]", we calculate the "complement", which is the value needed to reach the target sum when added to "nums[i]".
//- Check for Complement in Map: We check if the "complement" exists in the map using the "containsKey()" method. If it exists, it means the current element and the complement add up to the target value.
//- Return Indices: If the complement is found, we return an array containing two indices: the index of the complement (from the map) and the current index "i".
//- Storing Elements: If the complement is not found, the current element "nums[i]" is stored in the map, along with its index, so it can be used later to find pairs with future elements.
//- Exception Handling: If no such pair is found after iterating through the entire array, we throw an "IllegalArgumentException" to indicate no solution.
//
//Main Method:
//- Creating TwoSum Object: An object of the "TwoSum" class is created to call the "twoSum" method.
//- Calling twoSum Method: The "twoSum" method is called with the "nums" array and the target, returning an array of indices.
//- Output: The result (indices of the two elements that add up to the target) is printed to the console, displaying the indices "[0, 1]".
//
//
//In future tasks, I will remember the importance of using a map for problems involving lookups, as it significantly improves efficiency in cases like this one.
//
