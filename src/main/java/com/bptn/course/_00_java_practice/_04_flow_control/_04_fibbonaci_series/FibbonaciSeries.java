package com.bptn.course._00_java_practice._04_flow_control._04_fibbonaci_series;

public class FibbonaciSeries {

	public static void main(String[] args) {
		
		//declare and initialize the first 2 numbers in fibonacci series
		
		int a = 0;
		int b = 1;
		
		//print the first 2 numbers in fibonacci series
		System.out.println(a);
		System.out.println(b);
		
		//declare a variable which will be used as subsequent fibonacci series number
		int c;
		
		//create a for loop that iterates 8 times
		
		for (int i=1; i <= 8; i++) {
			
			//instantiate and print the value of c to be the addition of the 2 previous numbers
			
			c = a + b;
			System.out.println(c);
			
			//reassign the first 2 values to be their respective number following them
			a = b;
			b = c;
		}

	}

}
