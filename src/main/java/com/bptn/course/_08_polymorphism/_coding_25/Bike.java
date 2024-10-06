package com.bptn.course._08_polymorphism._coding_25;

public class Bike extends Vehicle {

	// Step 3a: Declare String bikeHandle
	String bikeHandle;

	// Step 3b: Define parameterized constructor for color, brand, bikeHandle
	public Bike(String color, String brand, String bikeHandle) {

		super(color, brand); // This invokes the constructor from Vehicle class
		this.bikeHandle = bikeHandle;
	}

	// Step 3c: Create a print() method as per the specification in the above
//	public void print() {
//		super.print(); // calls the print() method from Vehicle class
//	}

	// part 2
	@Override
	public void print() {
		System.out.println("I am Bike");
	}

}