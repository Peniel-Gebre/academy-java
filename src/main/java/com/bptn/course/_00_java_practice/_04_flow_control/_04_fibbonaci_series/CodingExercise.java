package com.bptn.course._00_java_practice._04_flow_control._04_fibbonaci_series;

public class CodingExercise {

	public static void main(String[] args) {
		// declare the first 3 numbers in fibonacci series
		int a = 0;
		int b = 1;
		int c;
		
		//print the first 2 numbers
		
	    System.out.println(a);
	    System.out.println(b);
	
		//create a for loop that iterates 10 times
		for (int i=2; i<=19; i++) {
			
			//instantiate the variable c to be the sum of a and b and print c
			c = a+b;
			System.out.println(c);
			
			//reassign the variables a and b to hold the values of the numbers next to them
			a = b;
			b = c;
		}

	}

}
