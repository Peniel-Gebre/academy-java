package com.bptn.course._00_java_practice._08_encapsulation._accessor;

public class Main {

	public static void main(String[] args) {
		
    Car car = new Car ("Honda", "Civic", 2012);
    
    	System.out.println("My car is: " + car.getMake() + " , " + car.getModel() + " , " + car.getYear());
	}
	
}


