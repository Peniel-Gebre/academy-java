package com.bptn.course._12_wrapper_classes;


public class Main {

	public static void main(String[] args) {
		
		//Autoboxing - converting a primitive type into Wrapper class . int-> Integer
		// ? Integer intObject = Integer.valueOf(100);
		
		//Alternatively, we can also convert primitive type to Wrapper class using below syntax
		// ?Integer intObject1= 20;//more preferred because its short and concise

		
		//Unboxing - converting a wrapper class into a primitive type
		// ? int intPrimitive = intObject; //more preferred because its short and concise
		
		//Alternatively, we can convert wrapper class back to primitive type using below syntax
		// ? int intPrimitive1= intObject1.intValue();
		
		
	}

}


//1. Autoboxing- converting a primitive type into a wrapper class example: int -> Integer
//2. Unboxing - converting a wrapper class back to primitive type example: Integer-> int
//3. The practical application of wrapper class is its used in Java Collections and Java Generics


//Wrapper class
//Integer
//Double
//Boolean
//Character
//Long
//Short
//Byte