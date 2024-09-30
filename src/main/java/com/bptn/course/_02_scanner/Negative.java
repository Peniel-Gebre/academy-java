package com.bptn.course._02_scanner;

// Import the Scanner Libray

	import java.util.Scanner;

	public class Negative {
	    public static void main(String[] args) {
	        // Paste your code here.
	       
	        Scanner myObj = new Scanner(System.in);

	        System.out.println("Enter the number: ");
	        int number = myObj.nextInt();

	        if (number > 0) {
	            System.out.println(number + " is positive");
	        } else if (number < 0) {
	            System.out.println(number + " is negative");
	        } else {
	            System.out.println(number + " is zero");

	        }

	        myObj.close();
	        
	    }


	}
