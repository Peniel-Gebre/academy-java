package com.bptn.course._00_java_practice._04_flow_control._04_fibbonaci_series;

import java.util.Scanner;

public class Coding16 {

	public static void main(String[] args) {
		
		// declare the scanner object
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int x = myObj.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.print("Fibonacci Series up to " + x + " elements: ");
		
		for (int i=0; i<x; i++); {
			System.out.println(a);
			System.out.println(b);
			
            int c = a+b;
            System.out.println(c);
			
			a = b;
			b = c;
			
			
		}
		
		myObj.close();

	}

}
