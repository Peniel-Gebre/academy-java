package com.bptn.course._23_recursion;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Factorial Recursive (5): " + factorial(5));
		System.out.println("Factorial Recursive (5): " + factorialIterative(5));

	}

	static int factorial(int n) {

		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);

	}

	static int factorialIterative(int n) {
		
		// 5x4x3x2x1
		// 1x2x3x4x5

		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			
			// factorial of 1 = 1

			factorial *= i;
		}

		return factorial;
	}
}