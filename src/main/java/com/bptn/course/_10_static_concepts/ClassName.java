package com.bptn.course._10_static_concepts;

public class ClassName {

	
	//declare a static variable
	static int staticVariable=100;
	
	//declare an instance variable
	int instanceVariable;
	
	
	//declare a static method
	static void staticMethod() {
		
		System.out.println("Static method is called..");
		
		//can I access an instance variable? No
		//instanceVariable=100;
		
		//can I access an instance method? No
		//instanceMethod();
	}
	
	void instanceMethod() {
		
		System.out.println("Instance method is called..");
		
		//can I access a static variable within an instance method - Yes
		System.out.println("Static variable : "+ staticVariable);
		
		//can I access a static method within an instance method - Yes
		staticMethod();
		
		
	}
	
	public static void main(String[] args) {
		
		
		ClassName c1= new ClassName();
		c1.instanceMethod();
		
		//Access the static variable
		System.out.println("Static variable : "+ staticVariable);
		
		staticMethod();
		

	}

}

//Major key takeaways
//1.We cannot access instance variables or methods within a static method
//2. We can access static variables and static methods within an instance method
//3.We can access static variable and static method within the main method