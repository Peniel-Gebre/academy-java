package com.bptn.course._00_java_practice._01_variables;

public class PrimitiveDataTypes {
	
	//Primitive data types (byte, short, integer, long, float, double, char, boolean)
	//Reference data types (classes, arrays, strings, interfaces, objects )

	public static void main(String[] args) {
		byte age = 33; //Range: -128 to 127 or 1byte - Whole
		int viewsCount = 123_456_789; //Range: -2B to 2B or 4 bytes - Whole
		long distanceToMoon  = 3_123_456_789L; //Range: 8 bytes - Whole - put L at the end to signify long
		float price = 12.50F; //Range: 4 bytes - Decimal - put F at the end to signify float
		double atomSize = 1.23456789; //Range: 8 bytes -  Decimal
		char letter = 'A'; //single letters - value in single quotation
		boolean isBlack = true; //true or false
		
		String name  = "Peniel"; //value in double quotation - put String in Pascal case
		
		System.out.println("My Age: " + age);
		System.out.println("Youtube Views: " + viewsCount);
		System.out.println("Distance to Moon: " + distanceToMoon);
		System.out.println("Price: " + price);
		System.out.println("Size of an atom: " + atomSize);
		System.out.println("Alphabate begins with the letter: " + letter);
		System.out.println("My car is black: " + isBlack);	
		
		System.out.println("My name is: " + name);

	}

}
