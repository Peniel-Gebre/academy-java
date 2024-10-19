package com.bptn.course._25_method_reference;

@FunctionalInterface
interface B {

	void showInterfaceInfo(String message);
}

public class MethodReferenceExample3 {

	// create a instance method
	public void show(String message) {

		System.out.println(message);
	}

	public static void main(String[] args) {
		
		MethodReferenceExample3 demo= new MethodReferenceExample3();
		//using the lambda expression to call the method using objectName.instanceMethodName()
		
		B obj= (message)-> demo.show(message);
		obj.showInterfaceInfo("Hello Java");
		
		//using method reference to call instance method objectName :: instanceMethodName
		B obj1= demo :: show;
		obj1.showInterfaceInfo("Hello World");

	}

}