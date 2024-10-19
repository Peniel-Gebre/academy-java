package com.bptn.course._26_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementCountExercise {

	public static void main(String[] args) {
		
		 // Declare and initialize a list of strings
    	List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
    	
    	//looping through the ArrayList using lambda expression
    	//list.forEach((element)-> System.out.println(element));
    	
    	//1. Converted the list to a stream using the stream() method
    	//2. Used forEach() method on the stream to perform a terminal operation
    	list.stream()
    		.forEach((element)-> System.out.println(element));
    	 
    	
    	
    	//1. Converted the list to a stream using the stream() method
    	//2. count the number of elements in the stream (terminal operation)
    	long count = list.stream()
    					 .count();
    	
    	System.out.println("The number of elements: "+ count);
  

	}

}

//void	accept(T t) in the Consumer functional interface

//1. Converted the collection (List, Set) to a stream
//2.We can perform intermediate or terminal operations in the stream
//3. We cannot reuse a stream once the operation is completed in the stream
//4. forEach method is a terminal operation which means we cannot perform any more operations after the terminal operation