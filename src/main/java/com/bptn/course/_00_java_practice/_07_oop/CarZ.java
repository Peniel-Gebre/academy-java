package com.bptn.course._00_java_practice._07_oop;

public class CarZ {
	
	// Fill in the code for Step 2
	private String color;
	private String brand;
	private int price;
	
	// parameterized constructor - which has 3 parameters
	public CarZ(String color, String brand, int price) {
		// Fill in the code for Step 4
		this.color = color;
		this.brand = brand;
		this.price = price;

	}
	
//	void printCarDetails() {
//		// calling the private method which is present inside the same car class
//		// this keyword can also be used to invoke method within the same class
//
//		this.print();
//	}
	
	// Fill in the code
	private void print() {
		// fill in code
		System.out.println("Car{" + "color='" + this.color + '\'' + ", brand='" + this.brand + '\'' + ", price="
				+ this.price + '}');
	}


	public static void main(String args[]) {
		CarZ car1 = new CarZ("white", "BMW", 70000);
		CarZ car2 = new CarZ("Red", "Audi", 80000);
		car1.print();
		car2.print();
	}
}



//this keyword can be used to point to current class instance variables
//this keyword can be used to point to current instance methods
//this keyword can be used to point to current class constructor