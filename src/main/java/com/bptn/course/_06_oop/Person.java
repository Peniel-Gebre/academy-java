package com.bptn.course._06_oop;

public class Person {

	// Step 1: declare instance variables - attributes/properties
	// We always declare instance variables within a class as private
	String name;
	int age;
	String location;

	// Step 2: Declaring the constructors- default constructor(no parameters),
	// parameterized constructor
	// Default constructor - no parameters
	public Person() {
		this.name = "John Doe";
		this.age = 20;
		this.location = "Toronto";
	}

	// Parameterized constructor
	public Person(String name, int age, String location) {

		this.name = name;
		this.age = age;
		this.location = location;
	}

	// Step 3: Instance Methods
	// Define instance method to print name, age and location
	public void printInfo() {
		// String name below has no influence in the below output as instance variables
		// are referred using "this" keyword
		// ? String name = "unknown";
		System.out.println("Name: " + this.name + ", Age: " + this.age + ", Location: " + this.location);
	}

	public static void main(String args[]) {

		// create an object from Person class using default constructor(no parameters)
		Person p1 = new Person();
		p1.printInfo();

		Person p2 = new Person("Jane Smith", 30, "Vancouver");
		p2.printInfo();

	}

}