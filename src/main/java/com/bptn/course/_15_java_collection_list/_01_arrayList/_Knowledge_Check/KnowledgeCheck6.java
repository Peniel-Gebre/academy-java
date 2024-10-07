package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.*;

public class KnowledgeCheck6 {


    public static void printEvenElements(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {  // Fix: Use list.size() instead of list.length
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + ", ");  // Print the even element
            }
        }
    }

    public static void main(String[] args) {
        // Instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3, 2};
        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 44, -16, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenElements(values);
    }
}