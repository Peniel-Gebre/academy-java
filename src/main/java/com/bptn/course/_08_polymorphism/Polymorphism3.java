package com.bptn.course._08_polymorphism;
	
	//Method-overloading- compile time polymorphism
	public class Polymorphism3 {
		
		void print(int integer) {
			
			System.out.println("Printing an integer "+ integer);
		}

		void print(String s) {
			System.out.println("Printing a string "+ s);
		}
		
		void print(double d) {
			System.out.println("Printing a double "+ d);
		}
		
		int print(int a , int b) {
			return a+b;
		}
		
		public static void main(String[] args) {
			
			Polymorphism3 p1= new Polymorphism3();
			p1.print(2);
			
			p1.print("Hello Java");
			
			p1.print(20.5);
			
			System.out.println("The sum of both the numbers is: "+ p1.print(2, 3));

		}

	}


	//Method overloading- compile time polymorphism
	//1. It occurs within the same class, no inheritance is required
	//2. Method names should be the same
	//3. It can have different return type and it can have different number of parameters
	//4. It can have different types of parameter
	//5. Static method can be overloaded