package com.bptn.course._00_java_practice._03_scanner;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		Scanner myObj  = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = myObj.nextInt();
		
		if (number > 0) {
			System.out.println(number + " is positive");
		} else if (number < 0) {
			System.out.println(number + " is negative");
		} else {
			System.out.println(number + " is equal to zero");
		}
		
		myObj.close();
		

	}

}
