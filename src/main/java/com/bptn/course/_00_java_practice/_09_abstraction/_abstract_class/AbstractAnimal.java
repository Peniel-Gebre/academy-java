package com.bptn.course._00_java_practice._09_abstraction._abstract_class;

abstract class Animal {
	// Abstract method (no body)
	abstract void sound();

	// Concrete method
	void sleep() {
		System.out.println("This animal is sleeping");
	}
}

class Dog extends Animal {
	// Providing implementation for the abstract method
	void sound() {
		System.out.println("Dog barks");
	}
}

public class AbstractAnimal {

	public static void main(String[] args) {
		// Animal animal = new Animal(); // This would be invalid
		Animal dog = new Dog(); // Valid because Dog extends Animal
		dog.sound(); // Output: Dog barks
		dog.sleep(); // Output: This animal is sleeping
	}
}
