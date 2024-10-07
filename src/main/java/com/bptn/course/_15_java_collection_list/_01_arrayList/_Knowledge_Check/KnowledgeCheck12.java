package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.ArrayList;

public class KnowledgeCheck12 {

    public static String findLongest(ArrayList<String> list) {
        String longest = ""; // Initialize the longest string to an empty string

        // Iterate through the list of strings
        for (String str : list) {
            if (str.length() > longest.length()) { // Compare lengths
                longest = str; // Update longest if the current string is longer
            }
        }

        return longest; // Return the longest string found
    }

    public static void main(String[] args) {
        // Instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
}