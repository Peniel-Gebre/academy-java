package com.bptn.course._00_java_practice._10_polymorphism;

//parent class
class Shape {
	
	//parent class method
    void draw() {
        System.out.println("Drawing a shape");
    }
}

//child class
class Rectangle extends Shape {
	
	//the child class overrides the method from the superclass
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

//child class
class Circle extends Shape {
	
	//the child class overrides the method from the superclass
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

//main field class
public class PolymorphismExample2 {
	
	//main method
    public static void main(String[] args) {
    	
    	//instantiating objects of the shape class
        Shape s1 = new Shape();
        Rectangle s2 = new Rectangle();
        Circle s3 = new Circle();
        
        //calling methods
        s1.draw();
        s2.draw();
        s3.draw();
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