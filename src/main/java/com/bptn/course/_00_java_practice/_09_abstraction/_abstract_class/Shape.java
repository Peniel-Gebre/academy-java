package com.bptn.course._00_java_practice._09_abstraction._abstract_class;

//create an abstract class - which is a class that cannot be instantiated
abstract class Shape1 {

	// it has 2 types of methods
	// 01.non-abstract method (concrete method) - a method which has body
	void moveTo(int x, int y) {

		// Implementation goes here, which would make this a non-abstract method.
		System.out.println("Move to: "+ x + y);
	}

	// 02. abstract method - a method without a body
	abstract void draw();

}

// it has a sub class which extends the super class
class Circle extends Shape1 {

	@Override
	void draw() {
		// implementation to draw a circle
		System.out.println("Draw a circle");
	}
	
}

public class Shape {

	// Main method
	public static void main(String[] args) {

		// Create objects from circle class
		Circle c1 = new Circle();
		c1.draw();

		c1.moveTo(2, 3); // this is an inherited method from the shape class

	}
}


// major key takeaways
// 1. Abstract class - its a class that cannot be instantiated - it cannot be
// used to create objects
// 2. It consists of abstract methods and normal methods
// 3. The sub class is going to implement the abstract methods from the abstract
// class
// 4. when a sub class implements to abstract methods from the abstract class it
// should follow the rules of overrriding}
