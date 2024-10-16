package com.bptn.course._00_java_practice._07_oop;

public class Main {

	public static void main(String[] args) {
        Car1 defaultCar = new Car1();
        defaultCar.printCarDetails();

	}

}

class Car1 {
	
	//instance variables/attributes
	private String color;
	private String brand;
	private int price;
	
	//constructors -  parameterized
	public Car1(String color, String brand, int price) {
		this.color  = color;
		this.brand = brand;
		this.price = price;
	}
	
	//constructors -  default
	public Car1 () {
		this("Unknown", "Unknown", 0);
}
	
	//method
	public void printCarDetails () {
		this.print();
	}
	
	public void print () {
		System.out.println("defaultCar - color: " + this.color + ", brand: " + this.brand + ", price: " + this.price);
	}
}
