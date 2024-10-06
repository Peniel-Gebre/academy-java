package com.bptn.course._13_builtin_exception._02_unchecked_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		// critical statement

		try {
			int result = 10 / 0;

			System.out.println("The result is: " + result);

		} catch (ArithmeticException e) {

			System.out.println("An error occurred: " + e.getMessage());

		}

	}

}
