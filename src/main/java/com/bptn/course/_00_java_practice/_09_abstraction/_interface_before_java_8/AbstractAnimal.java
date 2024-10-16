package com.bptn.course._00_java_practice._09_abstraction._interface_before_java_8;

interface AnimalInterface {
	// Abstract method (no body)
	abstract void sound();

//	// Concrete method
//	void sleep() {
//		System.out.println("This animal is sleeping");
//	}
//}

class Dog implements AnimalInterface {
	// Providing implementation for the abstract method
	
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

public class AbstractAnimal {

	public static void main(String[] args) {
		// Animal animal = new Animal(); // This would be invalid
		AnimalInterface dog = new Dog(); // Valid because Dog extends Animal
		dog.sound(); // Output: Dog barks
//		dog.sleep(); // Output: This animal is sleeping
	}
}
}
