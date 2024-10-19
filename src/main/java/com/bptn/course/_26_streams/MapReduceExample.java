package com.bptn.course._26_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		
		
	     // Create a list of integers
	    	List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	    	
	    	
	    	//Convert it to a stream, use the map method to square all the numbers
	    	//print out the result to the console
	    	
	    	list.stream()
					.map((num)-> num * num)
					.forEach((element)-> System.out.println(element));
	
	    	
	    	Integer result= list.stream()
	    						.map((num)-> num * num)
	    						.reduce(0, (a, e)-> a + e);
	    		
	    	
	    	
	    	//Sum all the squared numbers in the previous step using reduce() method
	    	
	    	System.out.println("The final output is: "+ result);
	    	
	    	
	    	

	}

}

//R apply(T t)-> SAM of Function functional interface

//BinaryOperator is functional interface that has SAM R apply(T t, U, u)

//0 + 1= 1
//1+ 4= 5
//5+ 9= 14
//14+ 16= 30
//30+ 25= 55
//55+ 36= 91
//91 + 49 = 140
//140 + 64 = 204
//204 + 81 = 285
//285 +100 =385