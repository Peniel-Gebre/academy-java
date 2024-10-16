package com.bptn.course._00_java_practice._10_polymorphism;

//class
class Animal {

	// method
	public void makeSound() {
		System.out.println("Some animal sound");
	}
}

//sub class extending the superclass
class Dog extends Animal {

	// override the makeSound method and specify sub classes unique method for
	// makeSound
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}

// sub class extending the superclass
class Cat extends Animal {

	// override the makeSound method and specify sub classes unique method for
	// makeSound
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

}

public class PolymorphismExample1 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound(); // Output: Woof

		Animal cat = new Cat();
		cat.makeSound(); // Output: Meow
	}
}

// Method overriding
// 1. Scenario- it occurs when a sub-class overrides an existing method in the
// parent class
// 2. Name of the method, return type of the method and number of parameters
// should exactly match
// 3. By convention overridden methods contains @Override annotation above the
// method signature
// 4. Methods with final keyword in the parent class cannot be overridden
// 5. Static method in the parent class cannot be overridden
// 6. Also known as run-time polymorphism