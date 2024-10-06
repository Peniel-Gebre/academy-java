package com.bptn.course._08_polymorphism;


//parent class
	class Animal{
		
		void makeSound() {
			System.out.println("Animal makes a sound");
		}
	}

	//Sub class- Dog class that extends Animal class
	class Dog extends Animal{
		
		@Override
		void makeSound() {
			System.out.println("Dog barks");
		}
		
		//have it's own methods
	}

	public class Polymorphism1 {

		public static void main(String[] args) {
			
			Animal a1= new Animal();
			
			a1.makeSound();
			
			Dog d1= new Dog();
			d1.makeSound(); //it inherits methods of Animal class

		}

	}


	//Method overriding
	//1. Scenario- it occurs when a sub-class overrides an existing method in the parent class
	//2. Name of the method, return type of the method and number of parameters should exactly match
	//3. By convention overridden methods contains @Override annotation above the method signature
	//4. Methods with final keyword in the parent class cannot be overridden
	//5. Static method in the parent class cannot be overridden
	//6. Also known as run-time polymorphism