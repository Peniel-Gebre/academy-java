package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.*;

public class KnowledgeCheck5 {

	    public static void printEvenIndex(ArrayList<Integer> list) {
	        // Loop through the list with a correct loop structure
	        for (int i = 0; i < list.size(); i++) {  // Fix: Initialize and set condition for the loop
	            if (i % 2 == 0) {  // Fix: Check for even index
	                System.out.print(list.get(i) + ", ");  // Print the integer at even index
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {1, 5, 7, 9, -2, 3, 2};
	        for (int i = 0; i < nums.length; i++) {
	            values.add(nums[i]);
	        }
	        System.out.println("Expected Result:\t 1, 7, -2, 2,");
	        System.out.print("Your Result:\t\t ");
	        printEvenIndex(values);
	    }
	}