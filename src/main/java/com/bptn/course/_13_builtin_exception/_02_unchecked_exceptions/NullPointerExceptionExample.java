package com.bptn.course._13_builtin_exception._02_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		
		//  ? String text=null;
		
		try {
			//  ? System.out.println("Length of the string is: "+ text.length());
		}
		catch(NullPointerException e) {
			
			System.out.println("An error occurred: "+ e.getMessage());
		}

		System.out.println("Statements after the try/catch");
	}

}

//NullPointerException

//"String.length()" because "text" is null