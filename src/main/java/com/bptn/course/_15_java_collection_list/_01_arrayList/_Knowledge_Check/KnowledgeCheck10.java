package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.ArrayList;

public class KnowledgeCheck10 {


    public static void shiftLeftOne(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return; // Do nothing if the list is empty
        }
        
        Integer firstElement = list.get(0); // Store the first element
        for (int i = 1; i < list.size(); i++) {
            list.set(i - 1, list.get(i)); // Shift each element to the left
        }
        list.set(list.size() - 1, firstElement); // Wrap the first element to the end
    }

    public static void main(String[] args) {
        // Instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}