package com.bptn.course._08_polymorphism;

//parent class
	class Shape{
		
		void drawAngle() {
			System.out.println("Drawing a shape angle");
		}
	}

	//sub-class 
	class Rectangle extends Shape{
		
		@Override
		void drawAngle() {
			System.out.println("Drawing a rectangle");
		}
		
	}

	public class Polymorphism2 {

		public static void main(String[] args) {
			
			Shape s1= new Shape();
			s1.drawAngle();
			
			Rectangle r1= new Rectangle();
			r1.drawAngle();
			
		}

	}


	//Method overriding
	//1. Scenario- it occurs when a sub-class overrides an existing method in the parent class
	//2. Name of the method, return type of the method and number of parameters should exactly match
	//3. By convention overridden methods contains @Override annotation above the method signature
	//4. Methods with final keyword in the parent class cannot be overridden
	//5. Static method in the parent class cannot be overridden
	//6. Also known as run-time polymorphism
	//7. It needs inheritance to support method overriding