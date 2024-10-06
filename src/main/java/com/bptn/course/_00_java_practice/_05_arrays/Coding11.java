package com.bptn.course._00_java_practice._05_arrays;

public class Coding11 {

	public static void main(String[] args) {
		// Declare and create an array
		
		int [] numbers = {10, 20, 30, 40, 50};
		
		//Odd indexes - create a forloop which begins with 1 and increments by 2
		for(int i=1; i<numbers.length; i=i+2) {
			System.out.println(numbers[i]);
		}
			
			//Even indexes - create a forloop which begins with 1 and increments by 2
			for(int a=0; a<numbers.length; a=a+2) {
				System.out.println(numbers[a]);
		}
			
			//Odd indexes in reverse - create a forloop which begins with 1 and increments by 2
			for(int i=numbers.length-2; i>0; i=i-2) {
				System.out.println(numbers[i]);
			}
			//Even indexes in reverse - create a forloop which begins with 1 and increments by 2
			for(int i=numbers.length-1; i>=0; i=i-2) {
				System.out.println(numbers[i]);
			}

			
	}
  }

