package com.bptn.course._08_polymorphism._coding_25;

public class TestClass {

	// Use the code below for Sanity check. Do not Modify the code below for testing
	// purpose.
	
	
	public static void main(String args[]) {
		Car car = new Car("White", "Audi", "ChromeColored");
		car.print();

		Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
		bike.print();
	}
}