package com.bptn.course._00_java_practice._07_oop;

// 01. Create a Class
// write your own class -> public class Person (this declares a class named Person)
// The body of the class is defined inside { }

public class Person {

	// 02. Person Instance Variable (attributes, fields, or properties)
	// Instance variables are declared right after the class declaration.
	// They usually start with private then the type of the variable and then a name for the variable.
	// Private means only the code in this class has access to it.
	// instance variables (Attributes of the class Person -> name, email, phone number)
	private String name;
	private String email;
	private String phoneNumber;

	// 03. Person Constructors
	// constructor -> to initialize the attributes for a person object with the
	// given parameters
	public Person(String initName, String initEmail, String initPhone) {
		name = initName;
		email = initEmail;
		phoneNumber = initPhone;
	}

	// 04. Person Methods
	// method to print Person Attributes
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
	}

	public static void main(String[] args) {

		// 05. Initialization
		// Initialization -> refers to the creation of an instance or object of a class.
		// Once we have declared a class, we can create multiple objects or instances of
		// that class.
		// Each object will have its own set of properties and behaviors defined by the
		// class.
		// call the constructor to create a new person
		Person p1 = new Person("Sana", "sana@gmail.com", "123-456-7890");
		// call p1's print method
		p1.print();
		Person p2 = new Person("Peniel", "jean@gmail.com", "404 899-9955");
		p2.print();

	}

}
