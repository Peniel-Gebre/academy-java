package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.*;

public class KnowledgeCheck7 {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        
        // Use a for-each loop to fill the ArrayList with elements from the array
        for (int num : nums) {  // For each integer in nums
            values.add(num);     // Add the integer to the ArrayList
        }
        
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}