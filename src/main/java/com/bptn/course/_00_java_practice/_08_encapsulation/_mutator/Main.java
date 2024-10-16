package com.bptn.course._00_java_practice._08_encapsulation._mutator;

public class Main {

	public static void main(String[] args) {
		
    Car car = new Car ("Honda", "Civic", 2012);
    
    car.setMake("Toyota");
    car.setModel("Highlander");
    car.setYear(2025);
    
    	System.out.println("My car is: " + car.getMake() + " , " + car.getModel() + " , " + car.getYear());
	}
	
}


