package com.bptn.course._25_method_reference;

@FunctionalInterface
interface JavaInterface{
	
	//single abstract method(SAM)
	int findMax (int a, int b);
}

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		//Using lambda expression to implement the abstract method
		JavaInterface  obj = (a, b)-> Math.max(a, b);
		
		System.out.println("Result "+ obj.findMax(2, 3));
		
	 
		
		//Using static method reference | ClassName :: staticMethodName
		JavaInterface obj1 = Math :: max;
		
		System.out.println("Result "+ obj1.findMax(4, 5));
		
		 
		

	}

}