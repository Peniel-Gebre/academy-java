package com.bptn.course._26_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {

	public static void main(String[] args) {
		
		// Create a list of strings
    	List<String> words=Arrays.asList("apple","cherry","banana","elderberry","date");
    	
    	
    	Set<String> newSet= words.stream()
    							 .collect(Collectors.toSet());
    	
    	
    	newSet.stream()
    		  .forEach(System.out :: println);
    	

	}

}