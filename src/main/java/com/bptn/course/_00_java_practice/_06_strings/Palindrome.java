package com.bptn.course._00_java_practice._06_strings;

//import scanner
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// create scanner instance
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the string to check for palindrome: ");
		String input = myObj.nextLine();
		
		String inputReverse = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			inputReverse += input.charAt(i);
		}
			
			if (input.equals(inputReverse)) {
				System.out.println("The string is a Palindrom");
			} else {
				System.out.println("The string is not a Palindrom");
			}
			
			myObj.close();		

	}

}
