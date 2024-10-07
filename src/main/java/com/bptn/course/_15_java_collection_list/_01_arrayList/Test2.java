package com.bptn.course._15_java_collection_list._01_arrayList;

import java.util.ArrayList;

public class Test2 {
    
    public static String findLongest(ArrayList<String> list) {
        //code here
    	
    	String longest = "";
    	
    	for(String word : list) {
    		
    		if(word.length() > longest.length()) {
    			
    			longest = word;
    		}
    		
    	}
    	
    	return longest;
    }
    
    //Do not modify below code
    public static void main(String[] args) {
        //instantiate ArrayList 
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result: metropolitan");
        System.out.print("Your Result: ");
        System.out.println(findLongest(values));
    }
}

// .length() -> length of a string