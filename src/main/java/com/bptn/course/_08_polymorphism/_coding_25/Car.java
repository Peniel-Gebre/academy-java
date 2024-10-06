package com.bptn.course._08_polymorphism._coding_25;

public class Car extends Vehicle {

	// Step 2a: Declare String steeringWheel
	String steeringWheel;

	// Step 2b: Define a parameterized constructor as per the specifications above
	public Car(String color, String brand, String steeringWheel) {

		super(color, brand); // This invokes the constructor from Vehicle class
		this.steeringWheel = steeringWheel;
	}

	// Step 2c: Create a print() method as per the specifications above
//	public void print() {
//		super.print(); // calls the print() method from Vehicle class
//	}
	
	//part 2
	@Override
	public void print() {
		System.out.println("I am Car");
	}

}