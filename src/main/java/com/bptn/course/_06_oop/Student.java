package com.bptn.course._06_oop;

public class Student {
	
	//Step 1: define instance variables
	private int id;
	private String fullName;
	private String courseName;
	
	//Step 2: default Constructors with no parameters
	public Student() {
		
		this.id= 100;
		this.fullName= "John Doe";
		this.courseName= "Java";
	}
	
	//Parameterized constructor with 2 parameters
	public Student(int id, String fullName) {
		
		this.id= id;
		this.fullName= fullName;
	}
	
	
	//Parameterized constructor with 3 parameters
	public Student(int id, String fullName, String courseName) {
		
		this.id= id;
		this.fullName= fullName;
		this.courseName= courseName;
	}
	
	//Step 3: declare instance method to print the information
	public void printInfo() {
		
		System.out.println("Id: " + this.id);
		System.out.println("Full Name: " + this.fullName);
		System.out.println("Course Name: " + this.courseName);
	}
	
	
	public void printInfoWithName() {
		
		System.out.println("Id: " + this.id);
		System.out.println("Full Name: " + this.fullName);
	}
	
	

	public static void main(String[] args) {
		
		//Create an object from the Student class
		Student s1= new Student();
		s1.printInfo();
		
		Student s2= new Student(200, "Sarah Johnson", "Python");
		s2.printInfo();
		

		Student s3= new Student(300, "Jane Smith");
		s3.printInfoWithName();
	}

}