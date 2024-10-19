package com.bptn.course._26_streams;

import java.util.Arrays;
import java.util.List;

public class StringSorter {

	public static void main(String[] args) {
		 // Create a list of strings
    	List<String> words=Arrays.asList("apple","cherry","banana","elderberry","date");
    	
    	//Convert the list to a stream, then sort it in ascending order
    	//convert it back to a list and print it out
    	
    	List<String> newList=words.stream()
    							  .sorted((a, b)-> a.compareTo(b))
                                  .toList();
    	
    	System.out.println("Print the list: "+ newList);
    	
    	//Convert the list to a stream, then sort it in decending order
    	//print it out
    	words.stream()
    		 .sorted((a,b)-> b.compareTo(a))
    		 .forEach(System.out :: println);

	}

}

//Comparator is functional interface
//int compare(T o1, T o2)
//sorted is an intermediate operation
//forEach is terminal operation