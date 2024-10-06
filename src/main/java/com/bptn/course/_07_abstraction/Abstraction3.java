package com.bptn.course._07_abstraction;

//Abstraction using interface (After java 8)
//From java 8 -  Interfaces can support abstract methods, default methods, static methods

interface Operations{
	
	void draw(); //abstract method - it has no implementation
	
	//default method - has some implementation
	default int add(int a, int b) {
		return a + b;
	}
	
	//static method
	static double getRandomNumber() {
		return Math.random ();
	}
	
}
//sub class - create a sub class that implements the Operation interface
class Calculator implements Operations{

	@Override
	public void draw() {
		System.out.println("Draw method implemented by calculator class");
		
		
	}
	
	//compiler always enforces the sub class to implement or override the methods in the abstract methods from the interface
	
}
public class Abstraction3 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2,  3);
		System.out.println("The result is: " + result);
		
		System.out.println("The random number is: " + Operations.getRandomNumber());
		

	}

}

//Major takeaways
//1. Interface cannot be instantiated
//2. Abstract methods in the interface is implemented using a subclass
//3. Interfaces support multiple inheritance - a sub class can implement multiple interfaces

//Interface cannot have instance variable
//Interface cannot have constructors
//It can consist of constants