package com.bptn.course._00_java_practice._05_arrays;

public class Coding12 {

	public static void main(String[] args) {
		
		//method 1
		// declare and initialize
		
		int i=1;
		
         for(i=2; i<=100; i=i+2) {
			System.out.print(i + " ");
		}
         
         //method 2
 		int e=1;
		
        for(e=1; e<=100; e++) {
        	if (e%2 == 0) {
			System.out.print(e + " ");
		}

	}

}

}