package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.*;

public class KnowledgeCheck4 {

public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
	        ArrayList<Integer> reversed = new ArrayList<Integer>();  // Fix: Use Integer instead of int
	        // Loop to add elements in reversed order
	        for (int i = list.size() - 1; i >= 0; i--) {
	            reversed.add(list.get(i));  // Add element at the current index to the reversed list
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        // Instantiate ArrayList and fill with Integers
	        ArrayList<Integer> values = new ArrayList<Integer>();
	        int[] nums = {1, 5, 7, 9, -2, 3, 2};
	        for (int i = 0; i < nums.length; i++) {
	            values.add(nums[i]);
	        }
	        ArrayList<Integer> result = reverse(values);
	        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
	        System.out.println("Your Result:\t\t " + result);
	    }
	}