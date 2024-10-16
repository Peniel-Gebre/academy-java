package com.bptn.course._00_java_practice._10_polymorphism;

//interface
interface Shape2 {
    
    public void draw();
}

class Circle2 implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismExample4 {

	public static void main(String[] args) {
		Shape2 circle = new Circle2();
		Shape2 square = new Square();
		
		circle.draw();
		square.draw();

	}

}
