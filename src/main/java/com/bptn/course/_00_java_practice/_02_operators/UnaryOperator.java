package com.bptn.course._00_java_practice._02_operators;

public class UnaryOperator {

	public static void main(String[] args) {
		
		/* Post-Increment */
		int a = 5; 
		int b = a++; 

		System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=5

		/* Pre-Increment */
		a = 5; 
		b = ++a; 

		System.out.printf(" , a=%d, b=%d", a, b); // Prints out: a=6, b=6

		/* Post-Decrement */
		int c = 5; 
		int d = c--; 

		System.out.printf(" , c=%d, d=%d", c, d); // Prints out: a=4, b=5

		/* Pre-Decrement */
		c = 5; 
		d = --c; 

		System.out.printf(" , c=%d, d=%d", c, d); // Prints out: a=4, b=4

	}

}
