package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.ArrayList;

public class KnowledgeCheck9 {

    public static void removeLongStrings(ArrayList<String> list) {
        // Use an iterator to safely remove elements from the list
        for (int i = list.size() - 1; i >= 0; i--) {  // Iterate backward
            if (list.get(i).length() > 4) {  // Check if the string length is greater than 4
                list.remove(i);  // Remove the string from the list
            }
        }
    }

    public static void main(String[] args) {
        // Instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }
}