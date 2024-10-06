package com.bptn.course._14_custom_exception;

//Step 1: Create a user defined custom exception class
class CustomException extends Exception{

	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}

	
// ? }


// ? public class CustomExceptionExample1 {
	
	//Create a method which throws the CustomException 
	public static void exampleMethod(int value) throws CustomException {
		
		if(value<0) {
			//Using the throw keyword we are creating new object of CustomException class
			throw new CustomException("Negative number is not allowed");
		}
		else {
			System.out.println("Value is: "+ value);
		}
	}

	public static void main(String[] args) {
		
		try {
			exampleMethod(-20);
		} catch (CustomException e) {
			
			System.out.println("Exception occurred: "+ e.getMessage());
		}
		
	}

}

//1. To create a checked Custom exception class it should "extends" Exception class
//2. To create unchecked Custom exception class it should "extends" RuntimeException class
//3. Throws is always present in the method signature to declare that the method can thrown an exception
//4. Throw is always used within a method to create a new instance of the exception- it can be used to throw an exception