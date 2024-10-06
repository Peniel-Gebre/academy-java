package com.bptn.course._11_access_modifiers._02_package_b;


import com.bptn.course._11_access_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA{

	public static void main(String[] args) {

		ClassA myObj = new ClassA();

		// No we cannot access the private method outside the class in a different
		// package
		// myObj.privateMethod();

		// No we cannot access the private variable outside the class in a different
		// package
		// System.out.println("Accessing private variable: " + myObj.privateVar);

		// No we cannot access the default method outside the class and in a different
		// package
		// myObj.defaultMethod();

		// No we cannot access the default variable outside the class and in a different
		// package
		// System.out.println("Accessing default variable: " + myObj.defaultVar);

		// Yes we can access the public method outside the class and in a different
		// package
		myObj.publicMethod();

		// Yes we can access the public variable outside the class and but in a
		// different
		// package
		System.out.println("Accessing public variable: " + myObj.publicVar);

		// No we cannot access the protected method outside the class and in a different package
	//	myObj.protectedMethod();

		// No we cannot access the protected variable outside the class and in a different package
	//	System.out.println("Accessing protected variable: " + myObj.protectedVar);
		
		
		ClassB myObj1= new ClassB(); //create an object of ClassB
		
		//Yes we can access protected method through a sub-class from a different package
		myObj1.protectedMethod();
		
		//Yes we can access protected variable through a sub-class from a different package
		System.out.println("Accessing protected variable: " + myObj1.protectedVar);

	}

}

//Major key takeaways
//1. We cannot access the private variable and method  outside the class and from different package
//2. We cannot access the default variable and method  outside the class and from different package
//3. default --> package private
//3. We can access public variable and method outside the class and from different package
//4. We can access protected method and variable through a sub-class from a different package
//5. When we create an object of ClassA(package_a) in ClassB(package_b), we need to add the import