package com.bptn.course._06_oop;

public class Employee {

	// Instance Variable
	// name, employeeId and age

	private String name;
	private int employeeId;
	private int age;

	// Constructors

	// default constructor
	public Employee() {
		this.name = "Peniel";
		this.employeeId = 100;
		this.age = 30;
	}

	// Parameterized constructor - with 2 parameters
	public Employee(String name, int employeeId) {

		this.name = name;
		this.employeeId = employeeId;
	}

	// Parameterized constructor - with 3 parameters
	public Employee(String name, int employeeId, int age) {

		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
	}

	// Methods
	public void printInfo() {
		System.out.println(" Employee name: " + this.name + " Employee Id: " + this.employeeId + " age: " + this.age);
	}

	public static void main(String[] args) {

		// create objects from this class
		Employee e1 = new Employee();
		e1.printInfo();

		Employee e2 = new Employee("John Doe", 1234);
		e2.printInfo();

		Employee e3 = new Employee("Jane Smith", 5678, 30);
		e3.printInfo();

	}

}

//this keyword is used to point to the current instance variable - if you have instance variable, 
//local variable or parameter variable with exactly the same name